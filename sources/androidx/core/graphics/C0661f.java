package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.C0615e;
import androidx.core.provider.C0708g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.f */
class C0661f extends C0666k {

    /* renamed from: b */
    private static Class<?> f1987b = null;

    /* renamed from: c */
    private static Constructor<?> f1988c = null;

    /* renamed from: d */
    private static Method f1989d = null;

    /* renamed from: e */
    private static Method f1990e = null;

    /* renamed from: f */
    private static boolean f1991f = false;

    C0661f() {
    }

    /* renamed from: k */
    private static boolean m2737k(Object obj, String str, int i, boolean z) {
        m2740n();
        try {
            return ((Boolean) f1989d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    private static Typeface mo2661l(Object obj) {
        m2740n();
        try {
            Object newInstance = Array.newInstance(f1987b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1990e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    private File m2739m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: n */
    private static void m2740n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f1991f) {
            f1991f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f1988c = constructor;
            f1987b = cls;
            f1989d = method;
            f1990e = method2;
        }
    }

    /* renamed from: o */
    private static Object m2741o() {
        m2740n();
        try {
            return f1988c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public Typeface mo2657b(Context context, C0615e.C0618c cVar, Resources resources, int i) {
        Object o = m2741o();
        C0615e.C0619d[] a = cVar.mo2563a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            C0615e.C0619d dVar = a[i2];
            File e = C0670l.m2800e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!C0670l.m2798c(e, resources, dVar.mo2565b())) {
                    e.delete();
                    return null;
                } else if (!m2737k(o, e.getPath(), dVar.mo2568e(), dVar.mo2569f())) {
                    return null;
                } else {
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e.delete();
            }
        }
        return mo2661l(o);
    }

    /* renamed from: c */
    public Typeface mo2658c(Context context, CancellationSignal cancellationSignal, C0708g.C0710b[] bVarArr, int i) {
        FileInputStream fileInputStream;
        if (bVarArr.length < 1) {
            return null;
        }
        C0708g.C0710b h = mo2669h(bVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h.mo2717d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File m = m2739m(openFileDescriptor);
                if (m != null) {
                    if (m.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(m);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface d = super.mo2668d(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return d;
            } catch (Throwable th) {
                openFileDescriptor.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
