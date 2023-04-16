package com.google.android.gms.internal.ads;

final class oe4 extends ne4 {

    /* renamed from: b */
    private final dr2 f12003b = new dr2(th2.f14860a);

    /* renamed from: c */
    private final dr2 f12004c = new dr2(4);

    /* renamed from: d */
    private int f12005d;

    /* renamed from: e */
    private boolean f12006e;

    /* renamed from: f */
    private boolean f12007f;

    /* renamed from: g */
    private int f12008g;

    public oe4(td4 td4) {
        super(td4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo8133a(dr2 dr2) {
        int s = dr2.mo6593s();
        int i = s >> 4;
        int i2 = s & 15;
        if (i2 == 7) {
            this.f12008g = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new me4(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo8134b(dr2 dr2, long j) {
        int s = dr2.mo6593s();
        long n = j + (((long) dr2.mo6588n()) * 1000);
        if (s == 0) {
            if (!this.f12006e) {
                dr2 dr22 = new dr2(new byte[dr2.mo6583i()]);
                dr2.mo6576b(dr22.mo6582h(), 0, dr2.mo6583i());
                xb4 a = xb4.m19444a(dr22);
                this.f12005d = a.f17107b;
                bf4 bf4 = new bf4();
                bf4.mo5842s("video/avc");
                bf4.mo5827f0(a.f17111f);
                bf4.mo5847x(a.f17108c);
                bf4.mo5826f(a.f17109d);
                bf4.mo5839p(a.f17110e);
                bf4.mo5832i(a.f17106a);
                this.f11434a.mo7873b(bf4.mo5848y());
                this.f12006e = true;
                return false;
            }
        } else if (s == 1 && this.f12006e) {
            int i = this.f12008g == 1 ? 1 : 0;
            if (!this.f12007f && i == 0) {
                return false;
            }
            byte[] h = this.f12004c.mo6582h();
            h[0] = 0;
            h[1] = 0;
            h[2] = 0;
            int i2 = 4 - this.f12005d;
            int i3 = 0;
            while (dr2.mo6583i() > 0) {
                dr2.mo6576b(this.f12004c.mo6582h(), i2, this.f12005d);
                this.f12004c.mo6580f(0);
                int v = this.f12004c.mo6596v();
                this.f12003b.mo6580f(0);
                this.f11434a.mo7876e(this.f12003b, 4);
                this.f11434a.mo7876e(dr2, v);
                i3 = i3 + 4 + v;
            }
            this.f11434a.mo7872a(n, i, i3, 0, (sd4) null);
            this.f12007f = true;
            return true;
        }
        return false;
    }
}
