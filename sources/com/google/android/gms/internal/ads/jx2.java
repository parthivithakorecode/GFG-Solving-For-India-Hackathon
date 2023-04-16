package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class jx2<V> {

    /* renamed from: a */
    private long[] f9283a = new long[10];

    /* renamed from: b */
    private V[] f9284b = new Object[10];

    /* renamed from: c */
    private int f9285c;

    /* renamed from: d */
    private int f9286d;

    public jx2(int i) {
    }

    /* renamed from: f */
    private final V m11884f() {
        wu1.m19207f(this.f9286d > 0);
        V[] vArr = this.f9284b;
        int i = this.f9285c;
        V v = vArr[i];
        vArr[i] = null;
        this.f9285c = (i + 1) % vArr.length;
        this.f9286d--;
        return v;
    }

    /* renamed from: a */
    public final synchronized int mo8545a() {
        return this.f9286d;
    }

    /* renamed from: b */
    public final synchronized V mo8546b() {
        if (this.f9286d == 0) {
            return null;
        }
        return m11884f();
    }

    /* renamed from: c */
    public final synchronized V mo8547c(long j) {
        V v;
        v = null;
        while (true) {
            if (this.f9286d <= 0) {
                break;
            } else if (j - this.f9283a[this.f9285c] < 0) {
                break;
            } else {
                v = m11884f();
            }
        }
        return v;
    }

    /* renamed from: d */
    public final synchronized void mo8548d(long j, V v) {
        int i = this.f9286d;
        if (i > 0) {
            if (j <= this.f9283a[((this.f9285c + i) - 1) % this.f9284b.length]) {
                mo8549e();
            }
        }
        int length = this.f9284b.length;
        if (this.f9286d >= length) {
            int i2 = length + length;
            long[] jArr = new long[i2];
            V[] vArr = new Object[i2];
            int i3 = this.f9285c;
            int i4 = length - i3;
            System.arraycopy(this.f9283a, i3, jArr, 0, i4);
            System.arraycopy(this.f9284b, this.f9285c, vArr, 0, i4);
            int i5 = this.f9285c;
            if (i5 > 0) {
                System.arraycopy(this.f9283a, 0, jArr, i4, i5);
                System.arraycopy(this.f9284b, 0, vArr, i4, this.f9285c);
            }
            this.f9283a = jArr;
            this.f9284b = vArr;
            this.f9285c = 0;
        }
        int i6 = this.f9285c;
        int i7 = this.f9286d;
        V[] vArr2 = this.f9284b;
        int length2 = (i6 + i7) % vArr2.length;
        this.f9283a[length2] = j;
        vArr2[length2] = v;
        this.f9286d = i7 + 1;
    }

    /* renamed from: e */
    public final synchronized void mo8549e() {
        this.f9285c = 0;
        this.f9286d = 0;
        Arrays.fill(this.f9284b, (Object) null);
    }
}
