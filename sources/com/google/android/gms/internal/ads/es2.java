package com.google.android.gms.internal.ads;

public final class es2 {

    /* renamed from: a */
    private byte[] f6354a;

    /* renamed from: b */
    private int f6355b;

    /* renamed from: c */
    private int f6356c;

    /* renamed from: d */
    private int f6357d = 0;

    public es2(byte[] bArr, int i, int i2) {
        this.f6354a = bArr;
        this.f6356c = i;
        this.f6355b = i2;
        m8706h();
    }

    /* renamed from: g */
    private final int m8705g() {
        int i = 0;
        int i2 = 0;
        while (!mo7060f()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo7055a(i2);
        }
        return i3 + i;
    }

    /* renamed from: h */
    private final void m8706h() {
        int i;
        int i2 = this.f6356c;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.f6355b) && !(i2 == i && this.f6357d == 0))) {
            z = false;
        }
        wu1.m19207f(z);
    }

    /* renamed from: i */
    private final boolean m8707i(int i) {
        if (i < 2 || i >= this.f6355b) {
            return false;
        }
        byte[] bArr = this.f6354a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i + -1] == 0;
    }

    /* renamed from: a */
    public final int mo7055a(int i) {
        int i2;
        int i3;
        this.f6357d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f6357d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f6357d = i5;
            byte[] bArr = this.f6354a;
            int i6 = this.f6356c;
            i4 |= (bArr[i6] & 255) << i5;
            if (true != m8707i(i6 + 1)) {
                i3 = 1;
            }
            this.f6356c = i6 + i3;
        }
        byte[] bArr2 = this.f6354a;
        int i7 = this.f6356c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f6357d = 0;
            if (true != m8707i(i7 + 1)) {
                i3 = 1;
            }
            this.f6356c = i7 + i3;
        }
        m8706h();
        return i8;
    }

    /* renamed from: b */
    public final int mo7056b() {
        int g = m8705g();
        return (g % 2 == 0 ? -1 : 1) * ((g + 1) / 2);
    }

    /* renamed from: c */
    public final int mo7057c() {
        return m8705g();
    }

    /* renamed from: d */
    public final void mo7058d() {
        int i = 1;
        int i2 = this.f6357d + 1;
        this.f6357d = i2;
        if (i2 == 8) {
            this.f6357d = 0;
            int i3 = this.f6356c;
            if (true == m8707i(i3 + 1)) {
                i = 2;
            }
            this.f6356c = i3 + i;
        }
        m8706h();
    }

    /* renamed from: e */
    public final void mo7059e(int i) {
        int i2 = this.f6356c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f6356c = i4;
        int i5 = this.f6357d + (i - (i3 * 8));
        this.f6357d = i5;
        if (i5 > 7) {
            this.f6356c = i4 + 1;
            this.f6357d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f6356c) {
                m8706h();
                return;
            } else if (m8707i(i2)) {
                this.f6356c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo7060f() {
        boolean z = (this.f6354a[this.f6356c] & (128 >> this.f6357d)) != 0;
        mo7058d();
        return z;
    }
}
