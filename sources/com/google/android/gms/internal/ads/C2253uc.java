package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uc */
public final class C2253uc extends C2106qd {

    /* renamed from: i */
    private static volatile Long f15496i;

    /* renamed from: j */
    private static final Object f15497j = new Object();

    public C2253uc(C1735gc gcVar, String str, String str2, C1842j8 j8Var, int i, int i2) {
        super(gcVar, "9GRJeHWq4dh2BvJK4ycB7gT7rSPz0ZkF1/0dgXOpChUtvNoPNNrpav7wZxlsKwP4", "wAGvvwsR6C1vDVsIyeUg+KWcunmHMDzvTAjP5mYaviw=", j8Var, i, 44);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5238a() {
        if (f15496i == null) {
            synchronized (f15497j) {
                if (f15496i == null) {
                    f15496i = (Long) this.f13134f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f13133e) {
            this.f13133e.mo8397e0(f15496i.longValue());
        }
    }
}
