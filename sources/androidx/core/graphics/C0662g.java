package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.C0615e;
import androidx.core.provider.C0708g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p102o.C3814g;

/* renamed from: androidx.core.graphics.g */
class C0662g extends C0666k {

    /* renamed from: b */
    private static final Class<?> f1992b;

    /* renamed from: c */
    private static final Constructor<?> f1993c;

    /* renamed from: d */
    private static final Method f1994d;

    /* renamed from: e */
    private static final Method f1995e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f1993c = constructor;
        f1992b = cls;
        f1994d = method;
        f1995e = method2;
    }

    C0662g() {
    }

    /* renamed from: k */
    private static boolean m2744k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f1994d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    private static Typeface m2745l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f1992b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1995e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m2746m() {
        Method method = f1994d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: n */
    private static Object m2747n() {
        try {
            return f1993c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public Typeface mo2657b(Context context, C0615e.C0618c cVar, Resources resources, int i) {
        Object n = m2747n();
        if (n == null) {
            return null;
        }
        for (C0615e.C0619d dVar : cVar.mo2563a()) {
            ByteBuffer b = C0670l.m2797b(context, resources, dVar.mo2565b());
            if (b == null || !m2744k(n, b, dVar.mo2566c(), dVar.mo2568e(), dVar.mo2569f())) {
                return null;
            }
        }
        return m2745l(n);
    }

    /* renamed from: c */
    public Typeface mo2658c(Context context, CancellationSignal cancellationSignal, C0708g.C0710b[] bVarArr, int i) {
        Object n = m2747n();
        if (n == null) {
            return null;
        }
        C3814g gVar = new C3814g();
        for (C0708g.C0710b bVar : bVarArr) {
            Uri d = bVar.mo2717d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d);
            if (byteBuffer == null) {
                byteBuffer = C0670l.m2801f(context, cancellationSignal, d);
                gVar.put(d, byteBuffer);
            }
            if (byteBuffer == null || !m2744k(n, byteBuffer, bVar.mo2716c(), bVar.mo2718e(), bVar.mo2719f())) {
                return null;
            }
        }
        Typeface l = m2745l(n);
        if (l == null) {
            return null;
        }
        return Typeface.create(l, i);
    }
}
