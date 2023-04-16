package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class xs3 {

    /* renamed from: f */
    private static final xs3 f17339f = new xs3(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f17340a;

    /* renamed from: b */
    private int[] f17341b;

    /* renamed from: c */
    private Object[] f17342c;

    /* renamed from: d */
    private int f17343d;

    /* renamed from: e */
    private boolean f17344e;

    private xs3() {
        this(0, new int[8], new Object[8], true);
    }

    private xs3(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f17343d = -1;
        this.f17340a = i;
        this.f17341b = iArr;
        this.f17342c = objArr;
        this.f17344e = z;
    }

    /* renamed from: c */
    public static xs3 m19644c() {
        return f17339f;
    }

    /* renamed from: d */
    static xs3 m19645d(xs3 xs3, xs3 xs32) {
        int i = xs3.f17340a + xs32.f17340a;
        int[] copyOf = Arrays.copyOf(xs3.f17341b, i);
        System.arraycopy(xs32.f17341b, 0, copyOf, xs3.f17340a, xs32.f17340a);
        Object[] copyOf2 = Arrays.copyOf(xs3.f17342c, i);
        System.arraycopy(xs32.f17342c, 0, copyOf2, xs3.f17340a, xs32.f17340a);
        return new xs3(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    static xs3 m19646e() {
        return new xs3(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo11911a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f17343d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f17340a; i6++) {
            int i7 = this.f17341b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f17342c[i6]).longValue();
                    i = hp3.m10709a(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int a = hp3.m10709a(i8 << 3);
                    int p = ((uo3) this.f17342c[i6]).mo6627p();
                    i5 += a + hp3.m10709a(p) + p;
                } else if (i9 == 3) {
                    int D = hp3.m10708D(i8);
                    i3 = D + D;
                    i2 = ((xs3) this.f17342c[i6]).mo11911a();
                } else if (i9 == 5) {
                    ((Integer) this.f17342c[i6]).intValue();
                    i = hp3.m10709a(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(mq3.m13451a());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f17342c[i6]).longValue();
                i3 = hp3.m10709a(i8 << 3);
                i2 = hp3.m10710b(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f17343d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo11912b() {
        int i = this.f17343d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f17340a; i3++) {
            int i4 = this.f17341b[i3];
            int a = hp3.m10709a(8);
            int p = ((uo3) this.f17342c[i3]).mo6627p();
            i2 += a + a + hp3.m10709a(16) + hp3.m10709a(i4 >>> 3) + hp3.m10709a(24) + hp3.m10709a(p) + p;
        }
        this.f17343d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xs3)) {
            return false;
        }
        xs3 xs3 = (xs3) obj;
        int i = this.f17340a;
        if (i == xs3.f17340a) {
            int[] iArr = this.f17341b;
            int[] iArr2 = xs3.f17341b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f17342c;
                    Object[] objArr2 = xs3.f17342c;
                    int i3 = this.f17340a;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo11914f() {
        this.f17344e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo11915g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f17340a; i2++) {
            mr3.m13470b(sb, i, String.valueOf(this.f17341b[i2] >>> 3), this.f17342c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo11916h(int i, Object obj) {
        if (this.f17344e) {
            int i2 = this.f17340a;
            int[] iArr = this.f17341b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f17341b = Arrays.copyOf(iArr, i3);
                this.f17342c = Arrays.copyOf(this.f17342c, i3);
            }
            int[] iArr2 = this.f17341b;
            int i4 = this.f17340a;
            iArr2[i4] = i;
            this.f17342c[i4] = obj;
            this.f17340a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f17340a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f17341b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f17342c;
        int i7 = this.f17340a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo11918i(ip3 ip3) {
        if (this.f17340a != 0) {
            for (int i = 0; i < this.f17340a; i++) {
                int i2 = this.f17341b[i];
                Object obj = this.f17342c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    ip3.mo8202E(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    ip3.mo8231x(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    ip3.mo8222o(i3, (uo3) obj);
                } else if (i4 == 3) {
                    ip3.mo8213e(i3);
                    ((xs3) obj).mo11918i(ip3);
                    ip3.mo8226s(i3);
                } else if (i4 == 5) {
                    ip3.mo8229v(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(mq3.m13451a());
                }
            }
        }
    }
}
