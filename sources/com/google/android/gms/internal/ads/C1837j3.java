package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.j3 */
public final class C1837j3 implements C2317w2 {

    /* renamed from: a */
    private final dr2 f8961a = new dr2(10);

    /* renamed from: b */
    private td4 f8962b;

    /* renamed from: c */
    private boolean f8963c;

    /* renamed from: d */
    private long f8964d = -9223372036854775807L;

    /* renamed from: e */
    private int f8965e;

    /* renamed from: f */
    private int f8966f;

    /* renamed from: a */
    public final void mo5638a(dr2 dr2) {
        wu1.m19203b(this.f8962b);
        if (this.f8963c) {
            int i = dr2.mo6583i();
            int i2 = this.f8966f;
            if (i2 < 10) {
                int min = Math.min(i, 10 - i2);
                System.arraycopy(dr2.mo6582h(), dr2.mo6585k(), this.f8961a.mo6582h(), this.f8966f, min);
                if (this.f8966f + min == 10) {
                    this.f8961a.mo6580f(0);
                    if (this.f8961a.mo6593s() == 73 && this.f8961a.mo6593s() == 68 && this.f8961a.mo6593s() == 51) {
                        this.f8961a.mo6581g(3);
                        this.f8965e = this.f8961a.mo6592r() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f8963c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(i, this.f8965e - this.f8966f);
            rd4.m16162b(this.f8962b, dr2, min2);
            this.f8966f += min2;
        }
    }

    /* renamed from: b */
    public final void mo5639b() {
        this.f8963c = false;
        this.f8964d = -9223372036854775807L;
    }

    /* renamed from: c */
    public final void mo5640c() {
        int i;
        wu1.m19203b(this.f8962b);
        if (this.f8963c && (i = this.f8965e) != 0 && this.f8966f == i) {
            long j = this.f8964d;
            if (j != -9223372036854775807L) {
                this.f8962b.mo7872a(j, 1, i, 0, (sd4) null);
            }
            this.f8963c = false;
        }
    }

    /* renamed from: d */
    public final void mo5641d(rc4 rc4, C1875k4 k4Var) {
        k4Var.mo8612c();
        td4 r = rc4.mo10270r(k4Var.mo8610a(), 5);
        this.f8962b = r;
        bf4 bf4 = new bf4();
        bf4.mo5830h(k4Var.mo8611b());
        bf4.mo5842s("application/id3");
        r.mo7873b(bf4.mo5848y());
    }

    /* renamed from: e */
    public final void mo5642e(long j, int i) {
        if ((i & 4) != 0) {
            this.f8963c = true;
            if (j != -9223372036854775807L) {
                this.f8964d = j;
            }
            this.f8965e = 0;
            this.f8966f = 0;
        }
    }
}
