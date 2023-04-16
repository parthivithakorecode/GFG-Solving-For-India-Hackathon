package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r1 */
final class C2131r1 {

    /* renamed from: a */
    public final C2020o1 f13441a;

    /* renamed from: b */
    public final int f13442b;

    /* renamed from: c */
    public final long[] f13443c;

    /* renamed from: d */
    public final int[] f13444d;

    /* renamed from: e */
    public final int f13445e;

    /* renamed from: f */
    public final long[] f13446f;

    /* renamed from: g */
    public final int[] f13447g;

    /* renamed from: h */
    public final long f13448h;

    public C2131r1(C2020o1 o1Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = true;
        wu1.m19205d(length == length2);
        int length3 = jArr.length;
        wu1.m19205d(length3 == length2);
        int length4 = iArr2.length;
        wu1.m19205d(length4 != length2 ? false : z);
        this.f13441a = o1Var;
        this.f13443c = jArr;
        this.f13444d = iArr;
        this.f13445e = i;
        this.f13446f = jArr2;
        this.f13447g = iArr2;
        this.f13448h = j;
        this.f13442b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    /* renamed from: a */
    public final int mo10447a(long j) {
        for (int J = n13.m13605J(this.f13446f, j, true, false); J >= 0; J--) {
            if ((this.f13447g[J] & 1) != 0) {
                return J;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo10448b(long j) {
        for (int H = n13.m13603H(this.f13446f, j, true, false); H < this.f13446f.length; H++) {
            if ((this.f13447g[H] & 1) != 0) {
                return H;
            }
        }
        return -1;
    }
}
