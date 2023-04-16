package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.C0615e;
import androidx.core.provider.C0708g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.core.graphics.k */
class C0666k {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    private ConcurrentHashMap<Long, C0615e.C0618c> f2003a = new ConcurrentHashMap<>();

    /* renamed from: androidx.core.graphics.k$a */
    class C0667a implements C0669c<C0708g.C0710b> {
        C0667a() {
        }

        /* renamed from: c */
        public int mo2671a(C0708g.C0710b bVar) {
            return bVar.mo2718e();
        }

        /* renamed from: d */
        public boolean mo2672b(C0708g.C0710b bVar) {
            return bVar.mo2719f();
        }
    }

    /* renamed from: androidx.core.graphics.k$b */
    class C0668b implements C0669c<C0615e.C0619d> {
        C0668b() {
        }

        /* renamed from: c */
        public int mo2671a(C0615e.C0619d dVar) {
            return dVar.mo2568e();
        }

        /* renamed from: d */
        public boolean mo2672b(C0615e.C0619d dVar) {
            return dVar.mo2569f();
        }
    }

    /* renamed from: androidx.core.graphics.k$c */
    private interface C0669c<T> {
        /* renamed from: a */
        int mo2671a(T t);

        /* renamed from: b */
        boolean mo2672b(T t);
    }

    C0666k() {
    }

    /* renamed from: a */
    private void m2776a(Typeface typeface, C0615e.C0618c cVar) {
        long j = m2779j(typeface);
        if (j != 0) {
            this.f2003a.put(Long.valueOf(j), cVar);
        }
    }

    /* renamed from: f */
    private C0615e.C0619d m2777f(C0615e.C0618c cVar, int i) {
        return (C0615e.C0619d) m2778g(cVar.mo2563a(), i, new C0668b());
    }

    /* renamed from: g */
    private static <T> T m2778g(T[] tArr, int i, C0669c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo2671a(t2) - i2) * 2) + (cVar.mo2672b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: j */
    private static long m2779j(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        }
    }

    /* renamed from: b */
    public Typeface mo2657b(Context context, C0615e.C0618c cVar, Resources resources, int i) {
        C0615e.C0619d f = m2777f(cVar, i);
        if (f == null) {
            return null;
        }
        Typeface d = C0659e.m2730d(context, resources, f.mo2565b(), f.mo2564a(), 0, i);
        m2776a(d, cVar);
        return d;
    }

    /* renamed from: c */
    public Typeface mo2658c(Context context, CancellationSignal cancellationSignal, C0708g.C0710b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo2669h(bVarArr, i).mo2717d());
            try {
                Typeface d = mo2668d(context, inputStream);
                C0670l.m2796a(inputStream);
                return d;
            } catch (IOException unused) {
                C0670l.m2796a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C0670l.m2796a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C0670l.m2796a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C0670l.m2796a(inputStream2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Typeface mo2668d(Context context, InputStream inputStream) {
        File e = C0670l.m2800e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C0670l.m2799d(e, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo2660e(Context context, Resources resources, int i, String str, int i2) {
        File e = C0670l.m2800e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C0670l.m2798c(e, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0708g.C0710b mo2669h(C0708g.C0710b[] bVarArr, int i) {
        return (C0708g.C0710b) m2778g(bVarArr, i, new C0667a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0615e.C0618c mo2670i(Typeface typeface) {
        long j = m2779j(typeface);
        if (j == 0) {
            return null;
        }
        return this.f2003a.get(Long.valueOf(j));
    }
}
