package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hd */
public final class C1773hd extends C2106qd {

    /* renamed from: i */
    private final StackTraceElement[] f8165i;

    public C1773hd(C1735gc gcVar, String str, String str2, C1842j8 j8Var, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(gcVar, "xd283h5qAcacM5zVZnbCaCYEYmyBvCzSWmcoDFc838gJ/DBCdoedE0EgOC5ZJs5s", "KFN28huBDzw/UNPPRO5YgG4GEIzzfegN1j75wmksmGk=", j8Var, i, 45);
        this.f8165i = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5238a() {
        Object obj = this.f8165i;
        if (obj != null) {
            int i = 1;
            C2401yb ybVar = new C2401yb((String) this.f13134f.invoke((Object) null, new Object[]{obj}));
            synchronized (this.f13133e) {
                this.f13133e.mo8412s(ybVar.f17654b.longValue());
                if (ybVar.f17655c.booleanValue()) {
                    C1842j8 j8Var = this.f13133e;
                    if (true != ybVar.f17656d.booleanValue()) {
                        i = 2;
                    }
                    j8Var.mo8381O(i);
                } else {
                    this.f13133e.mo8381O(3);
                }
            }
        }
    }
}
