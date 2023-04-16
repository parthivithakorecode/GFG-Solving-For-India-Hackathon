package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yc */
public final class C2402yc extends C2106qd {

    /* renamed from: i */
    private static volatile Long f17660i;

    /* renamed from: j */
    private static final Object f17661j = new Object();

    public C2402yc(C1735gc gcVar, String str, String str2, C1842j8 j8Var, int i, int i2) {
        super(gcVar, "hUIXYyX7voAFfmX9K6Tyj7UNRMoApsO3NHhichzgf1HY6Km4YpCnpT8GA4sfwulx", "RhEw32BK9OU3wzUC3Jj98VTZvnt6yWz3Jzx/x8tD2qo=", j8Var, i, 22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5238a() {
        if (f17660i == null) {
            synchronized (f17661j) {
                if (f17660i == null) {
                    f17660i = (Long) this.f13134f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f13133e) {
            this.f13133e.mo8405m0(f17660i.longValue());
        }
    }
}
