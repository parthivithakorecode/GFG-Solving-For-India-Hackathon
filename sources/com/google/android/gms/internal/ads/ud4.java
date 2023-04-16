package com.google.android.gms.internal.ads;

public final class ud4 {

    /* renamed from: a */
    private final byte[] f15523a;

    /* renamed from: b */
    private final int f15524b;

    /* renamed from: c */
    private int f15525c;

    /* renamed from: d */
    private int f15526d;

    public ud4(byte[] bArr) {
        this.f15523a = bArr;
        this.f15524b = bArr.length;
    }

    /* renamed from: a */
    public final int mo11208a() {
        return (this.f15525c * 8) + this.f15526d;
    }

    /* renamed from: b */
    public final int mo11209b(int i) {
        int i2 = this.f15525c;
        int min = Math.min(i, 8 - this.f15526d);
        int i3 = i2 + 1;
        int i4 = ((this.f15523a[i2] & 255) >> this.f15526d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f15523a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        mo11210c(i);
        return (-1 >>> (32 - i)) & i4;
    }

    /* renamed from: c */
    public final void mo11210c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f15525c + i3;
        this.f15525c = i4;
        int i5 = this.f15526d + (i - (i3 * 8));
        this.f15526d = i5;
        if (i5 > 7) {
            i4++;
            this.f15525c = i4;
            i5 -= 8;
            this.f15526d = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.f15524b) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        wu1.m19207f(z);
    }

    /* renamed from: d */
    public final boolean mo11211d() {
        byte b = this.f15523a[this.f15525c];
        int i = this.f15526d;
        mo11210c(1);
        return 1 == (((b & 255) >> i) & 1);
    }
}
