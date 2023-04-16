package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;

public final class dr2 {

    /* renamed from: a */
    private byte[] f5880a;

    /* renamed from: b */
    private int f5881b;

    /* renamed from: c */
    private int f5882c;

    public dr2() {
        this.f5880a = n13.f11241f;
    }

    public dr2(int i) {
        this.f5880a = new byte[i];
        this.f5882c = i;
    }

    public dr2(byte[] bArr) {
        this.f5880a = bArr;
        this.f5882c = bArr.length;
    }

    public dr2(byte[] bArr, int i) {
        this.f5880a = bArr;
        this.f5882c = i;
    }

    /* renamed from: A */
    public final long mo6567A() {
        byte[] bArr = this.f5880a;
        int i = this.f5881b;
        int i2 = i + 1;
        this.f5881b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f5881b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f5881b = i4;
        byte b3 = bArr[i3];
        this.f5881b = i4 + 1;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: B */
    public final long mo6568B() {
        long z = mo6600z();
        if (z >= 0) {
            return z;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(z);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: C */
    public final long mo6569C() {
        int i;
        int i2;
        long j = (long) this.f5880a[this.f5881b];
        int i3 = 7;
        while (true) {
            i = 0;
            i2 = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        if (i != 0) {
            while (i2 < i) {
                byte b = this.f5880a[this.f5881b + i2];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder(62);
                    sb.append("Invalid UTF-8 sequence continuation byte: ");
                    sb.append(j);
                    throw new NumberFormatException(sb.toString());
                }
            }
            this.f5881b += i;
            return j;
        }
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Invalid UTF-8 sequence first byte: ");
        sb2.append(j);
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: D */
    public final String mo6570D(char c) {
        int i = this.f5882c;
        int i2 = this.f5881b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f5882c && this.f5880a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f5880a;
        int i3 = this.f5881b;
        String e = n13.m13630e(bArr, i3, i2 - i3);
        this.f5881b = i2;
        if (i2 < this.f5882c) {
            this.f5881b = i2 + 1;
        }
        return e;
    }

    /* renamed from: E */
    public final String mo6571E(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f5881b;
        int i3 = (i2 + i) - 1;
        String e = n13.m13630e(this.f5880a, i2, (i3 >= this.f5882c || this.f5880a[i3] != 0) ? i : i - 1);
        this.f5881b += i;
        return e;
    }

    /* renamed from: F */
    public final String mo6572F(int i, Charset charset) {
        String str = new String(this.f5880a, this.f5881b, i, charset);
        this.f5881b += i;
        return str;
    }

    /* renamed from: G */
    public final short mo6573G() {
        byte[] bArr = this.f5880a;
        int i = this.f5881b;
        int i2 = i + 1;
        this.f5881b = i2;
        byte b = bArr[i];
        this.f5881b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    /* renamed from: H */
    public final void mo6574H(int i) {
        byte[] bArr = this.f5880a;
        if (i > bArr.length) {
            this.f5880a = Arrays.copyOf(bArr, i);
        }
    }

    /* renamed from: a */
    public final void mo6575a(cq2 cq2, int i) {
        mo6576b(cq2.f5494a, 0, i);
        cq2.mo6267h(0);
    }

    /* renamed from: b */
    public final void mo6576b(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f5880a, this.f5881b, bArr, i, i2);
        this.f5881b += i2;
    }

    /* renamed from: c */
    public final void mo6577c(int i) {
        byte[] bArr = this.f5880a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        mo6578d(bArr, i);
    }

    /* renamed from: d */
    public final void mo6578d(byte[] bArr, int i) {
        this.f5880a = bArr;
        this.f5882c = i;
        this.f5881b = 0;
    }

    /* renamed from: e */
    public final void mo6579e(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f5880a.length) {
            z = true;
        }
        wu1.m19205d(z);
        this.f5882c = i;
    }

    /* renamed from: f */
    public final void mo6580f(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f5882c) {
            z = true;
        }
        wu1.m19205d(z);
        this.f5881b = i;
    }

    /* renamed from: g */
    public final void mo6581g(int i) {
        mo6580f(this.f5881b + i);
    }

    /* renamed from: h */
    public final byte[] mo6582h() {
        return this.f5880a;
    }

    /* renamed from: i */
    public final int mo6583i() {
        return this.f5882c - this.f5881b;
    }

    /* renamed from: j */
    public final int mo6584j() {
        return this.f5880a.length;
    }

    /* renamed from: k */
    public final int mo6585k() {
        return this.f5881b;
    }

    /* renamed from: l */
    public final int mo6586l() {
        return this.f5882c;
    }

    /* renamed from: m */
    public final int mo6587m() {
        byte[] bArr = this.f5880a;
        int i = this.f5881b;
        int i2 = i + 1;
        this.f5881b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f5881b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f5881b = i4;
        byte b3 = bArr[i3];
        this.f5881b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* renamed from: n */
    public final int mo6588n() {
        byte[] bArr = this.f5880a;
        int i = this.f5881b;
        int i2 = i + 1;
        this.f5881b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f5881b = i3;
        byte b2 = bArr[i2];
        this.f5881b = i3 + 1;
        return (bArr[i3] & 255) | (((b & 255) << 24) >> 8) | ((b2 & 255) << 8);
    }

    /* renamed from: o */
    public final int mo6589o() {
        byte[] bArr = this.f5880a;
        int i = this.f5881b;
        int i2 = i + 1;
        this.f5881b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f5881b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f5881b = i4;
        byte b3 = bArr[i3];
        this.f5881b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
    }

    /* renamed from: p */
    public final int mo6590p() {
        int o = mo6589o();
        if (o >= 0) {
            return o;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(o);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: q */
    public final int mo6591q() {
        byte[] bArr = this.f5880a;
        int i = this.f5881b;
        int i2 = i + 1;
        this.f5881b = i2;
        byte b = bArr[i];
        this.f5881b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    /* renamed from: r */
    public final int mo6592r() {
        return (mo6593s() << 21) | (mo6593s() << 14) | (mo6593s() << 7) | mo6593s();
    }

    /* renamed from: s */
    public final int mo6593s() {
        byte[] bArr = this.f5880a;
        int i = this.f5881b;
        this.f5881b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: t */
    public final int mo6594t() {
        byte[] bArr = this.f5880a;
        int i = this.f5881b;
        int i2 = i + 1;
        this.f5881b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f5881b = i3;
        byte b2 = bArr[i2];
        this.f5881b = i3 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    /* renamed from: u */
    public final int mo6595u() {
        byte[] bArr = this.f5880a;
        int i = this.f5881b;
        int i2 = i + 1;
        this.f5881b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f5881b = i3;
        byte b2 = bArr[i2];
        this.f5881b = i3 + 1;
        return (bArr[i3] & 255) | ((b & 255) << 16) | ((b2 & 255) << 8);
    }

    /* renamed from: v */
    public final int mo6596v() {
        int m = mo6587m();
        if (m >= 0) {
            return m;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(m);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: w */
    public final int mo6597w() {
        byte[] bArr = this.f5880a;
        int i = this.f5881b;
        int i2 = i + 1;
        this.f5881b = i2;
        byte b = bArr[i];
        this.f5881b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* renamed from: x */
    public final long mo6598x() {
        byte[] bArr = this.f5880a;
        int i = this.f5881b;
        int i2 = i + 1;
        this.f5881b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f5881b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f5881b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f5881b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f5881b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f5881b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f5881b = i8;
        byte b7 = bArr[i7];
        this.f5881b = i8 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) b4) & 255) << 24) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 40) | ((((long) b7) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    /* renamed from: y */
    public final long mo6599y() {
        byte[] bArr = this.f5880a;
        int i = this.f5881b;
        int i2 = i + 1;
        this.f5881b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f5881b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f5881b = i4;
        byte b3 = bArr[i3];
        this.f5881b = i4 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: z */
    public final long mo6600z() {
        byte[] bArr = this.f5880a;
        int i = this.f5881b;
        int i2 = i + 1;
        this.f5881b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f5881b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f5881b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f5881b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f5881b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f5881b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f5881b = i8;
        byte b7 = bArr[i7];
        this.f5881b = i8 + 1;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i8]) & 255);
    }
}
