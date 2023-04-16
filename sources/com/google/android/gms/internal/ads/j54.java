package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.Objects;

final class j54 implements he1 {

    /* renamed from: a */
    private final he1 f8995a;

    /* renamed from: b */
    private final int f8996b;

    /* renamed from: c */
    private final i54 f8997c;

    /* renamed from: d */
    private final byte[] f8998d;

    /* renamed from: e */
    private int f8999e;

    public j54(he1 he1, int i, i54 i54) {
        wu1.m19205d(i > 0);
        this.f8995a = he1;
        this.f8996b = i;
        this.f8997c = i54;
        this.f8998d = new byte[1];
        this.f8999e = i;
    }

    /* renamed from: a */
    public final int mo5752a(byte[] bArr, int i, int i2) {
        int i3 = this.f8999e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.f8995a.mo5752a(this.f8998d, 0, 1) != -1) {
                int i5 = (this.f8998d[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int a = this.f8995a.mo5752a(bArr2, i4, i6);
                        if (a != -1) {
                            i4 += a;
                            i6 -= a;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.f8997c.mo8077a(new dr2(bArr2, i5));
                    }
                }
                i3 = this.f8996b;
                this.f8999e = i3;
            }
            return -1;
        }
        int a2 = this.f8995a.mo5752a(bArr, i, Math.min(i3, i2));
        if (a2 != -1) {
            this.f8999e -= a2;
        }
        return a2;
    }

    /* renamed from: h */
    public final Uri mo5753h() {
        return this.f8995a.mo5753h();
    }

    /* renamed from: i */
    public final void mo5754i() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    public final void mo6892j(vt1 vt1) {
        Objects.requireNonNull(vt1);
        this.f8995a.mo6892j(vt1);
    }

    /* renamed from: k */
    public final long mo5755k(li1 li1) {
        throw new UnsupportedOperationException();
    }

    public final Map<String, List<String>> zza() {
        return this.f8995a.zza();
    }
}
