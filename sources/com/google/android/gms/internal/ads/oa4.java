package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class oa4 {

    /* renamed from: a */
    private long f11959a;

    /* renamed from: b */
    private long f11960b;

    /* renamed from: c */
    private long f11961c;

    /* renamed from: d */
    private long f11962d;

    /* renamed from: e */
    private long f11963e;

    /* renamed from: f */
    private long f11964f;

    /* renamed from: g */
    private final boolean[] f11965g = new boolean[15];

    /* renamed from: h */
    private int f11966h;

    /* renamed from: a */
    public final long mo9709a() {
        long j = this.f11963e;
        if (j == 0) {
            return 0;
        }
        return this.f11964f / j;
    }

    /* renamed from: b */
    public final long mo9710b() {
        return this.f11964f;
    }

    /* renamed from: c */
    public final void mo9711c(long j) {
        int i;
        long j2 = this.f11962d;
        if (j2 == 0) {
            this.f11959a = j;
        } else if (j2 == 1) {
            long j3 = j - this.f11959a;
            this.f11960b = j3;
            this.f11964f = j3;
            this.f11963e = 1;
        } else {
            long j4 = j - this.f11961c;
            int i2 = (int) (j2 % 15);
            if (Math.abs(j4 - this.f11960b) <= 1000000) {
                this.f11963e++;
                this.f11964f += j4;
                boolean[] zArr = this.f11965g;
                if (zArr[i2]) {
                    zArr[i2] = false;
                    i = this.f11966h - 1;
                }
            } else {
                boolean[] zArr2 = this.f11965g;
                if (!zArr2[i2]) {
                    zArr2[i2] = true;
                    i = this.f11966h + 1;
                }
            }
            this.f11966h = i;
        }
        this.f11962d++;
        this.f11961c = j;
    }

    /* renamed from: d */
    public final void mo9712d() {
        this.f11962d = 0;
        this.f11963e = 0;
        this.f11964f = 0;
        this.f11966h = 0;
        Arrays.fill(this.f11965g, false);
    }

    /* renamed from: e */
    public final boolean mo9713e() {
        long j = this.f11962d;
        if (j == 0) {
            return false;
        }
        return this.f11965g[(int) ((j - 1) % 15)];
    }

    /* renamed from: f */
    public final boolean mo9714f() {
        return this.f11962d > 15 && this.f11966h == 0;
    }
}
