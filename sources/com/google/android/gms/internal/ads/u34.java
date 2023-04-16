package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class u34 {

    /* renamed from: a */
    private int f15386a = 0;

    /* renamed from: b */
    private int f15387b = -1;

    /* renamed from: c */
    private int f15388c = 0;

    /* renamed from: d */
    private int[] f15389d;

    /* renamed from: e */
    private int f15390e;

    public u34() {
        int[] iArr = new int[16];
        this.f15389d = iArr;
        this.f15390e = iArr.length - 1;
    }

    /* renamed from: a */
    public final int mo11155a() {
        int i = this.f15388c;
        if (i != 0) {
            int[] iArr = this.f15389d;
            int i2 = this.f15386a;
            int i3 = iArr[i2];
            this.f15386a = (i2 + 1) & this.f15390e;
            this.f15388c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final void mo11156b(int i) {
        int i2 = this.f15388c;
        int[] iArr = this.f15389d;
        int length = iArr.length;
        if (i2 == length) {
            int i3 = length + length;
            if (i3 >= 0) {
                int[] iArr2 = new int[i3];
                int i4 = this.f15386a;
                int i5 = length - i4;
                System.arraycopy(iArr, i4, iArr2, 0, i5);
                System.arraycopy(this.f15389d, 0, iArr2, i5, i4);
                this.f15386a = 0;
                this.f15387b = this.f15388c - 1;
                this.f15389d = iArr2;
                this.f15390e = iArr2.length - 1;
                iArr = iArr2;
            } else {
                throw new IllegalStateException();
            }
        }
        int i6 = (this.f15387b + 1) & this.f15390e;
        this.f15387b = i6;
        iArr[i6] = i;
        this.f15388c++;
    }

    /* renamed from: c */
    public final void mo11157c() {
        this.f15386a = 0;
        this.f15387b = -1;
        this.f15388c = 0;
    }

    /* renamed from: d */
    public final boolean mo11158d() {
        return this.f15388c == 0;
    }
}
