package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class t74 extends w74 {

    /* renamed from: f */
    private final a94 f14776f;

    /* renamed from: g */
    private final e73<r74> f14777g;

    /* renamed from: h */
    private final xv1 f14778h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected t74(gk0 gk0, int[] iArr, int i, a94 a94, long j, long j2, long j3, int i2, int i3, float f, float f2, List<r74> list, xv1 xv1) {
        super(gk0, iArr, 0);
        gk0 gk02 = gk0;
        int[] iArr2 = iArr;
        this.f14776f = a94;
        this.f14777g = e73.m8345t(list);
        this.f14778h = xv1;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ e73 m17181e(l84[] l84Arr) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i4 >= 2) {
                break;
            }
            l84 l84 = l84Arr[i4];
            if (l84 == null || l84.f9946b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                b73 p = e73.m8341p();
                p.mo5730f(new r74(0, 0));
                arrayList.add(p);
            }
            i4++;
        }
        long[][] jArr = new long[2][];
        for (int i5 = 0; i5 < 2; i5++) {
            l84 l842 = l84Arr[i5];
            if (l842 == null) {
                jArr[i5] = new long[0];
            } else {
                jArr[i5] = new long[l842.f9946b.length];
                int i6 = 0;
                while (true) {
                    int[] iArr = l842.f9946b;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    jArr[i5][i6] = (long) l842.f9945a.mo7652b(iArr[i6]).f5230h;
                    i6++;
                }
                Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr2 = new long[2];
        for (int i7 = 0; i7 < 2; i7++) {
            long[] jArr3 = jArr[i7];
            jArr2[i7] = jArr3.length == 0 ? 0 : jArr3[0];
        }
        m17182f(arrayList, jArr2);
        u73 c = n83.m13792b(s83.m16651c()).mo8638b(2).mo8116c();
        int i8 = 0;
        while (i8 < i) {
            int length = jArr[i8].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i9 = i3;
                while (true) {
                    long[] jArr4 = jArr[i8];
                    double d = 0.0d;
                    if (i9 >= jArr4.length) {
                        break;
                    }
                    long j = jArr4[i9];
                    if (j != -1) {
                        d = Math.log((double) j);
                    }
                    dArr[i9] = d;
                    i9++;
                }
                int i10 = length - 1;
                double d2 = dArr[i10] - dArr[i3];
                int i11 = i3;
                while (i11 < i10) {
                    int i12 = i11 + 1;
                    c.mo6869a(Double.valueOf(d2 == 0.0d ? 1.0d : (((dArr[i11] + dArr[i12]) * 0.5d) - dArr[i3]) / d2), Integer.valueOf(i8));
                    i11 = i12;
                    i3 = 0;
                }
            }
            i8++;
            i3 = 0;
            i = 2;
            i2 = 1;
        }
        e73 t = e73.m8345t(c.mo5146t());
        for (int i13 = 0; i13 < t.size(); i13++) {
            int intValue = ((Integer) t.get(i13)).intValue();
            int i14 = iArr2[intValue] + 1;
            iArr2[intValue] = i14;
            jArr2[intValue] = jArr[intValue][i14];
            m17182f(arrayList, jArr2);
        }
        for (int i15 = 0; i15 < 2; i15++) {
            if (arrayList.get(i15) != null) {
                long j2 = jArr2[i15];
                jArr2[i15] = j2 + j2;
            }
        }
        m17182f(arrayList, jArr2);
        b73 p2 = e73.m8341p();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            b73 b73 = (b73) arrayList.get(i16);
            p2.mo5730f(b73 == null ? e73.m8347v() : b73.mo5731g());
        }
        return p2.mo5731g();
    }

    /* renamed from: f */
    private static void m17182f(List<b73<r74>> list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            b73 b73 = list.get(i2);
            if (b73 != null) {
                b73.mo5730f(new r74(j, jArr[i2]));
            }
        }
    }
}
