package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fd */
public final class C1699fd extends C2106qd {

    /* renamed from: i */
    private List<Long> f6799i = null;

    public C1699fd(C1735gc gcVar, String str, String str2, C1842j8 j8Var, int i, int i2) {
        super(gcVar, "Zsy6wzxKzkvuI5Zg91hlK7lftgUdlMXbkLzI72tnQVNXNUFbyYhuDjwGRJi5QzOf", "/h10yfi8gz82TQ6rp82eUm/z42AeNO79/O3Nlfr8yws=", j8Var, i, 31);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5238a() {
        this.f13133e.mo8375I(-1);
        this.f13133e.mo8371E(-1);
        if (this.f6799i == null) {
            this.f6799i = (List) this.f13134f.invoke((Object) null, new Object[]{this.f13130b.mo7567b()});
        }
        List<Long> list = this.f6799i;
        if (list != null && list.size() == 2) {
            synchronized (this.f13133e) {
                this.f13133e.mo8375I(this.f6799i.get(0).longValue());
                this.f13133e.mo8371E(this.f6799i.get(1).longValue());
            }
        }
    }
}
