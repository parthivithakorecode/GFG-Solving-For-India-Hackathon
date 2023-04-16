package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cd */
public final class C1587cd extends C2106qd {

    /* renamed from: i */
    private static volatile String f5379i;

    /* renamed from: j */
    private static final Object f5380j = new Object();

    public C1587cd(C1735gc gcVar, String str, String str2, C1842j8 j8Var, int i, int i2) {
        super(gcVar, "uVfRV2qL6y+/frn7UQ8HZUcJpLFj+yNt3k4Ns9czyDlwcIbIheGCFGCtGsGaaHh4", "RmtCo/dRwPWzjhuo/V+opsA0IDlV0P6pRfQFRNu3WDY=", j8Var, i, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5238a() {
        this.f13133e.mo8408p0("E");
        if (f5379i == null) {
            synchronized (f5380j) {
                if (f5379i == null) {
                    f5379i = (String) this.f13134f.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f13133e) {
            this.f13133e.mo8408p0(f5379i);
        }
    }
}
