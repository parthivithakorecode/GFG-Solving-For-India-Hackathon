package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qm */
public final class C2115qm {

    /* renamed from: a */
    public byte[] f13229a;

    /* renamed from: b */
    private int f13230b;

    /* renamed from: c */
    private int f13231c;

    /* renamed from: d */
    private int f13232d;

    public C2115qm(byte[] bArr, int i) {
        this.f13229a = bArr;
        this.f13232d = i;
    }

    /* renamed from: a */
    public final int mo10323a(int i) {
        int i2;
        int i3;
        byte b;
        byte b2;
        int i4 = i >> 3;
        boolean z = false;
        byte b3 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.f13231c;
            if (i6 != 0) {
                byte[] bArr = this.f13229a;
                int i7 = this.f13230b;
                b2 = ((bArr[i7 + 1] & 255) >>> (8 - i6)) | ((bArr[i7] & 255) << i6);
            } else {
                b2 = this.f13229a[this.f13230b];
            }
            i -= 8;
            b3 |= (255 & b2) << i;
            this.f13230b++;
        }
        if (i > 0) {
            int i8 = this.f13231c + i;
            byte b4 = (byte) (255 >> (8 - i));
            byte[] bArr2 = this.f13229a;
            int i9 = this.f13230b;
            if (i8 > 8) {
                int i10 = i9 + 1;
                b = (b4 & (((255 & bArr2[i10]) >> (16 - i8)) | ((bArr2[i9] & 255) << (i8 - 8)))) | b3;
                this.f13230b = i10;
            } else {
                b = (b4 & ((255 & bArr2[i9]) >> (8 - i8))) | b3;
                if (i8 == 8) {
                    this.f13230b = i9 + 1;
                }
            }
            b3 = b;
            this.f13231c = i8 % 8;
        }
        int i11 = this.f13230b;
        if (i11 >= 0 && (i2 = this.f13231c) >= 0 && (i11 < (i3 = this.f13232d) || (i11 == i3 && i2 == 0))) {
            z = true;
        }
        C1856jm.m11730e(z);
        return b3;
    }
}
