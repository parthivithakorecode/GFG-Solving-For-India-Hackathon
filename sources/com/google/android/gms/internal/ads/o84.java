package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;

public abstract class o84 extends q84 {

    /* renamed from: c */
    private n84 f11944c;

    /* renamed from: a */
    public final r84 mo9700a(yx3[] yx3Arr, hm0 hm0, s54 s54, ei0 ei0) {
        boolean z;
        char c;
        int[] iArr;
        hm0 hm02 = hm0;
        int[] iArr2 = new int[3];
        gk0[][] gk0Arr = new gk0[3][];
        int[][][] iArr3 = new int[3][][];
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = hm02.f8338a;
            gk0Arr[i2] = new gk0[i3];
            iArr3[i2] = new int[i3][];
        }
        int i4 = 2;
        int[] iArr4 = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr4[i5] = yx3Arr[i5].mo5687b();
        }
        int i6 = 0;
        while (i6 < hm02.f8338a) {
            gk0 b = hm02.mo7964b(i6);
            int a = C1645dy.m8164a(b.mo7652b(i).f5234l);
            int i7 = i4;
            int i8 = i;
            int i9 = i8;
            boolean z2 = true;
            while (i8 < i4) {
                yx3 yx3 = yx3Arr[i8];
                int i10 = i;
                while (i <= 0) {
                    i10 = Math.max(i10, yx3.mo5691j(b.mo7652b(i)) & 7);
                    i++;
                }
                boolean z3 = iArr2[i8] == 0;
                if (i10 > i9) {
                    z2 = z3;
                    i7 = i8;
                    i9 = i10;
                } else if (i10 == i9 && a == 5 && !z2 && z3) {
                    i7 = i8;
                    i9 = i10;
                    z2 = true;
                }
                i8++;
                i4 = 2;
                i = 0;
            }
            if (i7 == i4) {
                iArr = new int[1];
            } else {
                yx3 yx32 = yx3Arr[i7];
                int[] iArr5 = new int[1];
                for (int i11 = 0; i11 <= 0; i11++) {
                    iArr5[i11] = yx32.mo5691j(b.mo7652b(i11));
                }
                iArr = iArr5;
            }
            int i12 = iArr2[i7];
            gk0Arr[i7][i12] = b;
            iArr3[i7][i12] = iArr;
            iArr2[i7] = i12 + 1;
            i6++;
            i4 = 2;
            i = 0;
        }
        hm0[] hm0Arr = new hm0[i4];
        String[] strArr = new String[i4];
        int[] iArr6 = new int[i4];
        int i13 = 0;
        while (i13 < i4) {
            int i14 = iArr2[i13];
            hm0Arr[i13] = new hm0((gk0[]) n13.m13597B(gk0Arr[i13], i14));
            iArr3[i13] = (int[][]) n13.m13597B(iArr3[i13], i14);
            strArr[i13] = yx3Arr[i13].mo8857v();
            iArr6[i13] = yx3Arr[i13].mo5787a();
            i13++;
            i4 = 2;
        }
        int i15 = i4;
        n84 n84 = new n84(strArr, iArr6, hm0Arr, iArr4, iArr3, new hm0((gk0[]) n13.m13597B(gk0Arr[i15], iArr2[i15])));
        Pair<zx3[], w74[]> f = mo8639f(n84, iArr3, iArr4, s54, ei0);
        w74[] w74Arr = (w74[]) f.second;
        b73 b73 = new b73();
        for (int i16 = 0; i16 < 2; i16++) {
            hm0 c2 = n84.mo9468c(i16);
            w74 w74 = w74Arr[i16];
            for (int i17 = 0; i17 < c2.f8338a; i17++) {
                gk0 b2 = c2.mo7964b(i17);
                int i18 = b2.f7515a;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (char c3 = 0; c3 <= 0; c3 = 1) {
                    iArr7[0] = n84.mo9467b(i16, i17, 0);
                    if (w74 != null && w74.f16740a == b2) {
                        int i19 = 0;
                        while (true) {
                            if (i19 >= w74.f16741b) {
                                break;
                            } else if (w74.f16742c[i19] != 0) {
                                i19++;
                            } else if (i19 != -1) {
                                c = 0;
                                z = true;
                            }
                        }
                    }
                    c = 0;
                    z = false;
                    zArr[c] = z;
                }
                b73.mo5730f(new qv0(b2, iArr7, n84.mo9466a(i16), zArr));
            }
        }
        hm0 d = n84.mo9469d();
        for (int i20 = 0; i20 < d.f8338a; i20++) {
            gk0 b3 = d.mo7964b(i20);
            int i21 = b3.f7515a;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            b73.mo5730f(new qv0(b3, iArr8, C1645dy.m8164a(b3.mo7652b(0).f5234l), new boolean[1]));
        }
        return new r84((zx3[]) f.first, (w74[]) f.second, new pw0(b73.mo5731g()), n84, (byte[]) null);
    }

    /* renamed from: b */
    public final void mo9701b(Object obj) {
        this.f11944c = (n84) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Pair<zx3[], w74[]> mo8639f(n84 n84, int[][][] iArr, int[] iArr2, s54 s54, ei0 ei0);
}
