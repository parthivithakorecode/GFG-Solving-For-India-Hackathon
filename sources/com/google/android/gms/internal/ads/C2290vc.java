package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vc */
public final class C2290vc extends C2106qd {

    /* renamed from: i */
    private final long f16161i;

    public C2290vc(C1735gc gcVar, String str, String str2, C1842j8 j8Var, long j, int i, int i2) {
        super(gcVar, "llxemQySqp4ImE2+K1SCPJZsWjXNCqydynC9yBT/03FiPJ85o8JSvF0iMBwiw5vV", "Do3k5DuMuAsRGeDxKZVVE8+FSftLk9ZlBUPdFxDzrUE=", j8Var, i, 25);
        this.f16161i = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5238a() {
        long longValue = ((Long) this.f13134f.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.f13133e) {
            this.f13133e.mo8402j0(longValue);
            long j = this.f16161i;
            if (j != 0) {
                this.f13133e.mo8372F(longValue - j);
                this.f13133e.mo8373G(this.f16161i);
            }
        }
    }
}
