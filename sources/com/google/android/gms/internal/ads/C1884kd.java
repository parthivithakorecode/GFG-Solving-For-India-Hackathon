package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kd */
public final class C1884kd extends C2106qd {

    /* renamed from: i */
    private static volatile Long f9480i;

    /* renamed from: j */
    private static final Object f9481j = new Object();

    public C1884kd(C1735gc gcVar, String str, String str2, C1842j8 j8Var, int i, int i2) {
        super(gcVar, "M8X9pjLXmkUmNpxAUiXCS0VzRrfgsx47JCdWPtF77o1zbxjaTxGH9o3y3XsfapA3", "IGAB4+J/PDJStxsBeRODYeAaV8Ap48L0bK2MK3UJNBs=", j8Var, i, 33);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5238a() {
        if (f9480i == null) {
            synchronized (f9481j) {
                if (f9480i == null) {
                    f9480i = (Long) this.f13134f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f13133e) {
            this.f13133e.mo8374H(f9480i.longValue());
        }
    }
}
