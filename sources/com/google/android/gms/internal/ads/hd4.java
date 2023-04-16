package com.google.android.gms.internal.ads;

import java.io.EOFException;

public final class hd4 {

    /* renamed from: a */
    private final dr2 f8170a = new dr2(10);

    /* renamed from: a */
    public final c91 mo7917a(pc4 pc4, tf4 tf4) {
        c91 c91 = null;
        int i = 0;
        while (true) {
            try {
                ((jc4) pc4).mo6917n(this.f8170a.mo6582h(), 0, 10, false);
                this.f8170a.mo6580f(0);
                if (this.f8170a.mo6595u() != 4801587) {
                    break;
                }
                this.f8170a.mo6581g(3);
                int r = this.f8170a.mo6592r();
                int i2 = r + 10;
                if (c91 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f8170a.mo6582h(), 0, bArr, 0, 10);
                    ((jc4) pc4).mo6917n(bArr, 10, r, false);
                    c91 = vf4.m18521a(bArr, i2, tf4, new da1());
                } else {
                    ((jc4) pc4).mo8446o(r, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        pc4.mo6914i();
        ((jc4) pc4).mo8446o(i, false);
        return c91;
    }
}
