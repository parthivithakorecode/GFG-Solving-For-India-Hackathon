package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.C0615e;
import androidx.core.content.res.C0624h;
import androidx.core.provider.C0708g;
import p102o.C3807e;

/* renamed from: androidx.core.graphics.e */
public class C0659e {

    /* renamed from: a */
    private static final C0666k f1984a;

    /* renamed from: b */
    private static final C3807e<String, Typeface> f1985b = new C3807e<>(16);

    /* renamed from: androidx.core.graphics.e$a */
    public static class C0660a extends C0708g.C0711c {

        /* renamed from: a */
        private C0624h.C0630f f1986a;

        public C0660a(C0624h.C0630f fVar) {
            this.f1986a = fVar;
        }

        /* renamed from: a */
        public void mo2655a(int i) {
            C0624h.C0630f fVar = this.f1986a;
            if (fVar != null) {
                fVar.m2581f(i);
            }
        }

        /* renamed from: b */
        public void mo2656b(Typeface typeface) {
            C0624h.C0630f fVar = this.f1986a;
            if (fVar != null) {
                fVar.m2582g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f1984a = i >= 29 ? new C0665j() : i >= 28 ? new C0664i() : i >= 26 ? new C0663h() : (i < 24 || !C0662g.m2746m()) ? i >= 21 ? new C0661f() : new C0666k() : new C0662g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = m2733g(r2, r3, r4);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m2727a(android.content.Context r2, android.graphics.Typeface r3, int r4) {
        /*
            if (r2 == 0) goto L_0x0014
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 >= r1) goto L_0x000f
            android.graphics.Typeface r2 = m2733g(r2, r3, r4)
            if (r2 == 0) goto L_0x000f
            return r2
        L_0x000f:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r3, r4)
            return r2
        L_0x0014:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Context cannot be null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C0659e.m2727a(android.content.Context, android.graphics.Typeface, int):android.graphics.Typeface");
    }

    /* renamed from: b */
    public static Typeface m2728b(Context context, CancellationSignal cancellationSignal, C0708g.C0710b[] bVarArr, int i) {
        return f1984a.mo2658c(context, cancellationSignal, bVarArr, i);
    }

    /* renamed from: c */
    public static Typeface m2729c(Context context, C0615e.C0617b bVar, Resources resources, int i, String str, int i2, int i3, C0624h.C0630f fVar, Handler handler, boolean z) {
        Typeface typeface;
        C0615e.C0617b bVar2 = bVar;
        C0624h.C0630f fVar2 = fVar;
        Handler handler2 = handler;
        if (bVar2 instanceof C0615e.C0620e) {
            C0615e.C0620e eVar = (C0615e.C0620e) bVar2;
            Typeface h = m2734h(eVar.mo2572c());
            if (h != null) {
                if (fVar2 != null) {
                    fVar2.mo2577d(h, handler2);
                }
                return h;
            }
            typeface = C0708g.m2873c(context, eVar.mo2571b(), i3, !z ? fVar2 == null : eVar.mo2570a() == 0, z ? eVar.mo2573d() : -1, C0624h.C0630f.m2580e(handler), new C0660a(fVar2));
            Resources resources2 = resources;
            int i4 = i3;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f1984a.mo2657b(context, (C0615e.C0618c) bVar2, resources, i3);
            if (fVar2 != null) {
                if (typeface != null) {
                    fVar2.mo2577d(typeface, handler2);
                } else {
                    fVar2.mo2576c(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f1985b.mo15096d(m2731e(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    /* renamed from: d */
    public static Typeface m2730d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface e = f1984a.mo2660e(context, resources, i, str, i3);
        if (e != null) {
            f1985b.mo15096d(m2731e(resources, i, str, i2, i3), e);
        }
        return e;
    }

    /* renamed from: e */
    private static String m2731e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* renamed from: f */
    public static Typeface m2732f(Resources resources, int i, String str, int i2, int i3) {
        return f1985b.mo15095c(m2731e(resources, i, str, i2, i3));
    }

    /* renamed from: g */
    private static Typeface m2733g(Context context, Typeface typeface, int i) {
        C0666k kVar = f1984a;
        C0615e.C0618c i2 = kVar.mo2670i(typeface);
        if (i2 == null) {
            return null;
        }
        return kVar.mo2657b(context, i2, context.getResources(), i);
    }

    /* renamed from: h */
    private static Typeface m2734h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
