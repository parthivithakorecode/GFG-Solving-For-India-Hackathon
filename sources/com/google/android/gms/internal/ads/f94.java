package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

public final class f94 extends eb1 {

    /* renamed from: e */
    private li1 f6766e;

    /* renamed from: f */
    private byte[] f6767f;

    /* renamed from: g */
    private int f6768g;

    /* renamed from: h */
    private int f6769h;

    public f94() {
        super(false);
    }

    /* renamed from: a */
    public final int mo5752a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f6769h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(n13.m13626c(this.f6767f), this.f6768g, bArr, i, min);
        this.f6768g += min;
        this.f6769h -= min;
        mo6893o(min);
        return min;
    }

    /* renamed from: h */
    public final Uri mo5753h() {
        li1 li1 = this.f6766e;
        if (li1 != null) {
            return li1.f10058a;
        }
        return null;
    }

    /* renamed from: i */
    public final void mo5754i() {
        if (this.f6767f != null) {
            this.f6767f = null;
            mo6894p();
        }
        this.f6766e = null;
    }

    /* renamed from: k */
    public final long mo5755k(li1 li1) {
        mo6895q(li1);
        this.f6766e = li1;
        Uri uri = li1.f10058a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        wu1.m19206e(equals, valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        String[] D = n13.m13599D(uri.getSchemeSpecificPart(), ",");
        if (D.length == 2) {
            String str = D[1];
            if (D[0].contains(";base64")) {
                try {
                    this.f6767f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    String valueOf2 = String.valueOf(str);
                    throw C1646dz.m8224b(valueOf2.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf2) : new String("Error while parsing Base64 encoded string: "), e);
                }
            } else {
                this.f6767f = n13.m13650w(URLDecoder.decode(str, c43.f5302a.name()));
            }
            long j = li1.f10063f;
            int length = this.f6767f.length;
            if (j <= ((long) length)) {
                int i = (int) j;
                this.f6768g = i;
                int i2 = length - i;
                this.f6769h = i2;
                long j2 = li1.f10064g;
                if (j2 != -1) {
                    this.f6769h = (int) Math.min((long) i2, j2);
                }
                mo6896r(li1);
                long j3 = li1.f10064g;
                return j3 != -1 ? j3 : (long) this.f6769h;
            }
            this.f6767f = null;
            throw new if1(2008);
        }
        throw C1646dz.m8224b("Unexpected URI format: ".concat(String.valueOf(uri)), (Throwable) null);
    }
}
