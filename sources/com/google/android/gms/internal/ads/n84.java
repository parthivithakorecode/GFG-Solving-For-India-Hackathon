package com.google.android.gms.internal.ads;

public final class n84 {

    /* renamed from: a */
    private final String[] f11352a;

    /* renamed from: b */
    private final int[] f11353b;

    /* renamed from: c */
    private final hm0[] f11354c;

    /* renamed from: d */
    private final int[] f11355d;

    /* renamed from: e */
    private final int[][][] f11356e;

    /* renamed from: f */
    private final hm0 f11357f;

    n84(String[] strArr, int[] iArr, hm0[] hm0Arr, int[] iArr2, int[][][] iArr3, hm0 hm0) {
        this.f11352a = strArr;
        this.f11353b = iArr;
        this.f11354c = hm0Arr;
        this.f11356e = iArr3;
        this.f11355d = iArr2;
        this.f11357f = hm0;
    }

    /* renamed from: a */
    public final int mo9466a(int i) {
        return this.f11353b[i];
    }

    /* renamed from: b */
    public final int mo9467b(int i, int i2, int i3) {
        return this.f11356e[i][i2][0] & 7;
    }

    /* renamed from: c */
    public final hm0 mo9468c(int i) {
        return this.f11354c[i];
    }

    /* renamed from: d */
    public final hm0 mo9469d() {
        return this.f11357f;
    }
}
