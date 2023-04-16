package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.C0615e;
import androidx.core.provider.C0708g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: androidx.core.graphics.h */
public class C0663h extends C0661f {

    /* renamed from: g */
    protected final Class<?> f1996g;

    /* renamed from: h */
    protected final Constructor<?> f1997h;

    /* renamed from: i */
    protected final Method f1998i;

    /* renamed from: j */
    protected final Method f1999j;

    /* renamed from: k */
    protected final Method f2000k;

    /* renamed from: l */
    protected final Method f2001l;

    /* renamed from: m */
    protected final Method f2002m;

    public C0663h() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y = mo2666y();
            constructor = mo2667z(y);
            method4 = mo2663v(y);
            method3 = mo2664w(y);
            method2 = mo2659A(y);
            method = mo2662u(y);
            Class<?> cls2 = y;
            method5 = mo2665x(y);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f1996g = cls;
        this.f1997h = constructor;
        this.f1998i = method4;
        this.f1999j = method3;
        this.f2000k = method2;
        this.f2001l = method;
        this.f2002m = method5;
    }

    /* renamed from: o */
    private Object m2750o() {
        try {
            return this.f1997h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: p */
    private void m2751p(Object obj) {
        try {
            this.f2001l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: q */
    private boolean m2752q(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1998i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: r */
    private boolean m2753r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f1999j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    private boolean m2754s(Object obj) {
        try {
            return ((Boolean) this.f2000k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private boolean m2755t() {
        if (this.f1998i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f1998i != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Method mo2659A(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    /* renamed from: b */
    public Typeface mo2657b(Context context, C0615e.C0618c cVar, Resources resources, int i) {
        if (!m2755t()) {
            return super.mo2657b(context, cVar, resources, i);
        }
        Object o = m2750o();
        if (o == null) {
            return null;
        }
        for (C0615e.C0619d dVar : cVar.mo2563a()) {
            if (!m2752q(context, o, dVar.mo2564a(), dVar.mo2566c(), dVar.mo2568e(), dVar.mo2569f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.mo2567d()))) {
                m2751p(o);
                return null;
            }
        }
        if (!m2754s(o)) {
            return null;
        }
        return mo2661l(o);
    }

    /* renamed from: c */
    public Typeface mo2658c(Context context, CancellationSignal cancellationSignal, C0708g.C0710b[] bVarArr, int i) {
        Typeface l;
        ParcelFileDescriptor openFileDescriptor;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m2755t()) {
            C0708g.C0710b h = mo2669h(bVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(h.mo2717d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h.mo2718e()).setItalic(h.mo2719f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map<Uri, ByteBuffer> h2 = C0670l.m2803h(context, bVarArr, cancellationSignal);
            Object o = m2750o();
            if (o == null) {
                return null;
            }
            boolean z = false;
            for (C0708g.C0710b bVar : bVarArr) {
                ByteBuffer byteBuffer = h2.get(bVar.mo2717d());
                if (byteBuffer != null) {
                    if (!m2753r(o, byteBuffer, bVar.mo2716c(), bVar.mo2718e(), bVar.mo2719f() ? 1 : 0)) {
                        m2751p(o);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m2751p(o);
                return null;
            } else if (m2754s(o) && (l = mo2661l(o)) != null) {
                return Typeface.create(l, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    /* renamed from: e */
    public Typeface mo2660e(Context context, Resources resources, int i, String str, int i2) {
        if (!m2755t()) {
            return super.mo2660e(context, resources, i, str, i2);
        }
        Object o = m2750o();
        if (o == null) {
            return null;
        }
        if (!m2752q(context, o, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            m2751p(o);
            return null;
        } else if (!m2754s(o)) {
            return null;
        } else {
            return mo2661l(o);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Typeface mo2661l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1996g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2002m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Method mo2662u(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Method mo2663v(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Method mo2664w(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Method mo2665x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Class<?> mo2666y() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Constructor<?> mo2667z(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }
}
