package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

public final class l74 {

    /* renamed from: a */
    private final Random f9932a;

    /* renamed from: b */
    private final int[] f9933b;

    /* renamed from: c */
    private final int[] f9934c;

    public l74(int i) {
        this(0, new Random());
    }

    private l74(int i, Random random) {
        this(new int[0], random);
    }

    private l74(int[] iArr, Random random) {
        this.f9933b = iArr;
        this.f9932a = random;
        this.f9934c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f9934c[iArr[i]] = i;
        }
    }

    /* renamed from: a */
    public final int mo8896a() {
        int[] iArr = this.f9933b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo8897b() {
        int[] iArr = this.f9933b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo8898c() {
        return this.f9933b.length;
    }

    /* renamed from: d */
    public final int mo8899d(int i) {
        int i2 = this.f9934c[i] + 1;
        int[] iArr = this.f9933b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    /* renamed from: e */
    public final int mo8900e(int i) {
        int i2 = this.f9934c[i] - 1;
        if (i2 >= 0) {
            return this.f9933b[i2];
        }
        return -1;
    }

    /* renamed from: f */
    public final l74 mo8901f() {
        return new l74(0, new Random(this.f9932a.nextLong()));
    }

    /* renamed from: g */
    public final l74 mo8902g(int i, int i2) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            iArr[i4] = this.f9932a.nextInt(this.f9933b.length + 1);
            int i5 = i4 + 1;
            int nextInt = this.f9932a.nextInt(i5);
            iArr2[i4] = iArr2[nextInt];
            iArr2[nextInt] = i4;
            i4 = i5;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[(this.f9933b.length + i2)];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr4 = this.f9933b;
            if (i3 >= iArr4.length + i2) {
                return new l74(iArr3, new Random(this.f9932a.nextLong()));
            }
            if (i6 >= i2 || i7 != iArr[i6]) {
                int i8 = i7 + 1;
                int i9 = iArr4[i7];
                iArr3[i3] = i9;
                if (i9 >= 0) {
                    iArr3[i3] = i9 + i2;
                }
                i7 = i8;
            } else {
                iArr3[i3] = iArr2[i6];
                i6++;
            }
            i3++;
        }
    }

    /* renamed from: h */
    public final l74 mo8903h(int i, int i2) {
        int[] iArr = new int[(this.f9933b.length - i2)];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.f9933b;
            if (i3 >= iArr2.length) {
                return new l74(iArr, new Random(this.f9932a.nextLong()));
            }
            int i5 = iArr2[i3];
            if (i5 < 0 || i5 >= i2) {
                int i6 = i3 - i4;
                if (i5 >= 0) {
                    i5 -= i2;
                }
                iArr[i6] = i5;
            } else {
                i4++;
            }
            i3++;
        }
    }
}
