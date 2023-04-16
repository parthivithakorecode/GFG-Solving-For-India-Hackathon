package com.google.android.gms.internal.ads;

public final class cq2 {

    /* renamed from: a */
    public byte[] f5494a;

    /* renamed from: b */
    private int f5495b;

    /* renamed from: c */
    private int f5496c;

    /* renamed from: d */
    private int f5497d;

    public cq2() {
        this.f5494a = n13.f11241f;
    }

    public cq2(byte[] bArr, int i) {
        this.f5494a = bArr;
        this.f5497d = i;
    }

    /* renamed from: m */
    private final void m7521m() {
        int i;
        int i2 = this.f5495b;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.f5497d) && !(i2 == i && this.f5496c == 0))) {
            z = false;
        }
        wu1.m19207f(z);
    }

    /* renamed from: a */
    public final int mo6260a() {
        return ((this.f5497d - this.f5495b) * 8) - this.f5496c;
    }

    /* renamed from: b */
    public final int mo6261b() {
        return (this.f5495b * 8) + this.f5496c;
    }

    /* renamed from: c */
    public final int mo6262c(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f5496c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f5496c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f5496c = i4;
            byte[] bArr = this.f5494a;
            int i5 = this.f5495b;
            this.f5495b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f5494a;
        int i6 = this.f5495b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f5496c = 0;
            this.f5495b = i6 + 1;
        }
        m7521m();
        return i7;
    }

    /* renamed from: d */
    public final void mo6263d() {
        if (this.f5496c != 0) {
            this.f5496c = 0;
            this.f5495b++;
            m7521m();
        }
    }

    /* renamed from: e */
    public final void mo6264e(int i, int i2) {
        int i3 = i & 16383;
        int min = Math.min(8 - this.f5496c, 14);
        int i4 = this.f5496c;
        int i5 = (8 - i4) - min;
        byte[] bArr = this.f5494a;
        int i6 = this.f5495b;
        byte b = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr[i6]);
        bArr[i6] = b;
        int i7 = 14 - min;
        bArr[i6] = (byte) (b | ((i3 >>> i7) << i5));
        int i8 = i6 + 1;
        while (i7 > 8) {
            i7 -= 8;
            this.f5494a[i8] = (byte) (i3 >>> i7);
            i8++;
        }
        int i9 = 8 - i7;
        byte[] bArr2 = this.f5494a;
        byte b2 = (byte) (bArr2[i8] & ((1 << i9) - 1));
        bArr2[i8] = b2;
        bArr2[i8] = (byte) (((i3 & ((1 << i7) - 1)) << i9) | b2);
        mo6269j(14);
        m7521m();
    }

    /* renamed from: f */
    public final void mo6265f(byte[] bArr, int i, int i2) {
        int i3 = i2 >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.f5494a;
            int i5 = this.f5495b;
            int i6 = i5 + 1;
            this.f5495b = i6;
            byte b = bArr2[i5];
            int i7 = this.f5496c;
            byte b2 = (byte) (b << i7);
            bArr[i4] = b2;
            bArr[i4] = (byte) (((255 & bArr2[i6]) >> (8 - i7)) | b2);
        }
        int i8 = i2 & 7;
        if (i8 != 0) {
            byte b3 = (byte) (bArr[i3] & (255 >> i8));
            bArr[i3] = b3;
            int i9 = this.f5496c;
            if (i9 + i8 > 8) {
                byte[] bArr3 = this.f5494a;
                int i10 = this.f5495b;
                this.f5495b = i10 + 1;
                b3 = (byte) (b3 | ((bArr3[i10] & 255) << i9));
                bArr[i3] = b3;
                i9 -= 8;
            }
            int i11 = i9 + i8;
            this.f5496c = i11;
            byte[] bArr4 = this.f5494a;
            int i12 = this.f5495b;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | b3);
            if (i11 == 8) {
                this.f5496c = 0;
                this.f5495b = i12 + 1;
            }
            m7521m();
        }
    }

    /* renamed from: g */
    public final void mo6266g(byte[] bArr, int i) {
        this.f5494a = bArr;
        this.f5495b = 0;
        this.f5496c = 0;
        this.f5497d = i;
    }

    /* renamed from: h */
    public final void mo6267h(int i) {
        int i2 = i / 8;
        this.f5495b = i2;
        this.f5496c = i - (i2 * 8);
        m7521m();
    }

    /* renamed from: i */
    public final void mo6268i() {
        int i = this.f5496c + 1;
        this.f5496c = i;
        if (i == 8) {
            this.f5496c = 0;
            this.f5495b++;
        }
        m7521m();
    }

    /* renamed from: j */
    public final void mo6269j(int i) {
        int i2 = i / 8;
        int i3 = this.f5495b + i2;
        this.f5495b = i3;
        int i4 = this.f5496c + (i - (i2 * 8));
        this.f5496c = i4;
        if (i4 > 7) {
            this.f5495b = i3 + 1;
            this.f5496c = i4 - 8;
        }
        m7521m();
    }

    /* renamed from: k */
    public final void mo6270k(int i) {
        wu1.m19207f(this.f5496c == 0);
        this.f5495b += i;
        m7521m();
    }

    /* renamed from: l */
    public final boolean mo6271l() {
        boolean z = (this.f5494a[this.f5495b] & (128 >> this.f5496c)) != 0;
        mo6268i();
        return z;
    }
}
