package com.google.android.gms.internal.ads;

import java.util.Objects;

final class ep3 extends hp3 {

    /* renamed from: d */
    private final byte[] f6320d;

    /* renamed from: e */
    private final int f6321e;

    /* renamed from: f */
    private int f6322f;

    ep3(byte[] bArr, int i, int i2) {
        super((gp3) null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f6320d = bArr;
            this.f6322f = 0;
            this.f6321e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: E */
    public final void mo7015E(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.f6320d, this.f6322f, i2);
            this.f6322f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new fp3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6322f), Integer.valueOf(this.f6321e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: F */
    public final void mo7016F(String str) {
        int i = this.f6322f;
        try {
            int a = hp3.m10709a(str.length() * 3);
            int a2 = hp3.m10709a(str.length());
            if (a2 == a) {
                int i2 = i + a2;
                this.f6322f = i2;
                int d = lt3.m12866d(str, this.f6320d, i2, this.f6321e - i2);
                this.f6322f = i;
                mo7031u((d - i) - a2);
                this.f6322f = d;
                return;
            }
            mo7031u(lt3.m12867e(str));
            byte[] bArr = this.f6320d;
            int i3 = this.f6322f;
            this.f6322f = lt3.m12866d(str, bArr, i3, this.f6321e - i3);
        } catch (kt3 e) {
            this.f6322f = i;
            mo7987e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new fp3(e2);
        }
    }

    /* renamed from: g */
    public final int mo7017g() {
        return this.f6321e - this.f6322f;
    }

    /* renamed from: h */
    public final void mo7018h(byte b) {
        try {
            byte[] bArr = this.f6320d;
            int i = this.f6322f;
            this.f6322f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new fp3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6322f), Integer.valueOf(this.f6321e), 1}), e);
        }
    }

    /* renamed from: i */
    public final void mo7019i(int i, boolean z) {
        mo7031u(i << 3);
        mo7018h(z ? (byte) 1 : 0);
    }

    /* renamed from: j */
    public final void mo7020j(int i, uo3 uo3) {
        mo7031u((i << 3) | 2);
        mo7031u(uo3.mo6627p());
        uo3.mo6636z(this);
    }

    /* renamed from: k */
    public final void mo7021k(int i, int i2) {
        mo7031u((i << 3) | 5);
        mo7022l(i2);
    }

    /* renamed from: l */
    public final void mo7022l(int i) {
        try {
            byte[] bArr = this.f6320d;
            int i2 = this.f6322f;
            int i3 = i2 + 1;
            this.f6322f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f6322f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f6322f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f6322f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new fp3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6322f), Integer.valueOf(this.f6321e), 1}), e);
        }
    }

    /* renamed from: m */
    public final void mo7023m(int i, long j) {
        mo7031u((i << 3) | 1);
        mo7024n(j);
    }

    /* renamed from: n */
    public final void mo7024n(long j) {
        try {
            byte[] bArr = this.f6320d;
            int i = this.f6322f;
            int i2 = i + 1;
            this.f6322f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f6322f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f6322f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f6322f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f6322f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f6322f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f6322f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f6322f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new fp3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6322f), Integer.valueOf(this.f6321e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo7025o(int i, int i2) {
        mo7031u(i << 3);
        mo7026p(i2);
    }

    /* renamed from: p */
    public final void mo7026p(int i) {
        if (i >= 0) {
            mo7031u(i);
        } else {
            mo7033w((long) i);
        }
    }

    /* renamed from: q */
    public final void mo7027q(byte[] bArr, int i, int i2) {
        mo7015E(bArr, 0, i2);
    }

    /* renamed from: r */
    public final void mo7028r(int i, String str) {
        mo7031u((i << 3) | 2);
        mo7016F(str);
    }

    /* renamed from: s */
    public final void mo7029s(int i, int i2) {
        mo7031u((i << 3) | i2);
    }

    /* renamed from: t */
    public final void mo7030t(int i, int i2) {
        mo7031u(i << 3);
        mo7031u(i2);
    }

    /* renamed from: u */
    public final void mo7031u(int i) {
        if (hp3.f8380c) {
            int i2 = do3.f5856a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f6320d;
            int i3 = this.f6322f;
            this.f6322f = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f6320d;
            int i4 = this.f6322f;
            this.f6322f = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new fp3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6322f), Integer.valueOf(this.f6321e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo7032v(int i, long j) {
        mo7031u(i << 3);
        mo7033w(j);
    }

    /* renamed from: w */
    public final void mo7033w(long j) {
        if (!hp3.f8380c || this.f6321e - this.f6322f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f6320d;
                int i = this.f6322f;
                this.f6322f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f6320d;
                int i2 = this.f6322f;
                this.f6322f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new fp3(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6322f), Integer.valueOf(this.f6321e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f6320d;
                int i3 = this.f6322f;
                this.f6322f = i3 + 1;
                gt3.m10000y(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f6320d;
            int i4 = this.f6322f;
            this.f6322f = i4 + 1;
            gt3.m10000y(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
