package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

public final class of0 {

    /* renamed from: h */
    public static final my3<of0> f12011h = C1526aq.f4296a;

    /* renamed from: a */
    public final long f12012a;

    /* renamed from: b */
    public final int f12013b;

    /* renamed from: c */
    public final Uri[] f12014c;

    /* renamed from: d */
    public final int[] f12015d;

    /* renamed from: e */
    public final long[] f12016e;

    /* renamed from: f */
    public final long f12017f;

    /* renamed from: g */
    public final boolean f12018g;

    public of0(long j) {
        this(0, -1, new int[0], new Uri[0], new long[0], 0, false);
    }

    private of0(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        wu1.m19205d(iArr.length == uriArr.length);
        this.f12012a = 0;
        this.f12013b = i;
        this.f12015d = iArr;
        this.f12014c = uriArr;
        this.f12016e = jArr;
        this.f12017f = 0;
        this.f12018g = false;
    }

    /* renamed from: a */
    public final int mo9750a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f12015d;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                return i3;
            }
            i3++;
        }
        return i3;
    }

    /* renamed from: b */
    public final of0 mo9751b(int i) {
        int[] iArr = this.f12015d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.f12016e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        return new of0(0, 0, copyOf, (Uri[]) Arrays.copyOf(this.f12014c, 0), copyOf2, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && of0.class == obj.getClass()) {
            of0 of0 = (of0) obj;
            return this.f12013b == of0.f12013b && Arrays.equals(this.f12014c, of0.f12014c) && Arrays.equals(this.f12015d, of0.f12015d) && Arrays.equals(this.f12016e, of0.f12016e);
        }
    }

    public final int hashCode() {
        return ((((((this.f12013b * 961) + Arrays.hashCode(this.f12014c)) * 31) + Arrays.hashCode(this.f12015d)) * 31) + Arrays.hashCode(this.f12016e)) * 961;
    }
}
