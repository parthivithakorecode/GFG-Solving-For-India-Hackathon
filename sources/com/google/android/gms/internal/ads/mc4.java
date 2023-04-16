package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class mc4 {

    /* renamed from: a */
    private static final int[] f10807a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f10808b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f10809c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d */
    public static final /* synthetic */ int f10810d = 0;

    /* renamed from: a */
    public static C1574c0 m13180a(byte[] bArr, String str, String str2, u74 u74) {
        cq2 cq2;
        int i = 0;
        int i2 = -1;
        if (bArr[0] == Byte.MAX_VALUE) {
            cq2 = new cq2(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b = copyOf[0];
            if (b == -2 || b == -1) {
                for (int i3 = 0; i3 < copyOf.length - 1; i3 += 2) {
                    byte b2 = copyOf[i3];
                    int i4 = i3 + 1;
                    copyOf[i3] = copyOf[i4];
                    copyOf[i4] = b2;
                }
            }
            int length = copyOf.length;
            cq2 = new cq2(copyOf, length);
            if (copyOf[0] == 31) {
                cq2 cq22 = new cq2(copyOf, length);
                while (cq22.mo6260a() >= 16) {
                    cq22.mo6269j(2);
                    cq2.mo6264e(cq22.mo6262c(14), 14);
                }
            }
            cq2.mo6266g(copyOf, copyOf.length);
        }
        cq2.mo6269j(60);
        int i5 = f10807a[cq2.mo6262c(6)];
        int i6 = f10808b[cq2.mo6262c(4)];
        int c = cq2.mo6262c(5);
        if (c < 29) {
            i2 = (f10809c[c] * 1000) / 2;
        }
        cq2.mo6269j(10);
        if (cq2.mo6262c(2) > 0) {
            i = 1;
        }
        bf4 bf4 = new bf4();
        bf4.mo5830h(str);
        bf4.mo5842s("audio/vnd.dts");
        bf4.mo5823d0(i2);
        bf4.mo5825e0(i5 + i);
        bf4.mo5843t(i6);
        bf4.mo5819b((u74) null);
        bf4.mo5834k(str2);
        return bf4.mo5848y();
    }
}
