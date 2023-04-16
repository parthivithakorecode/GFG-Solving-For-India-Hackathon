package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.km */
public final class C1893km {

    /* renamed from: a */
    private static final byte[] f9557a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f9558b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f9559c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static Pair<Integer, Integer> m12245a(byte[] bArr) {
        C2115qm qmVar = new C2115qm(bArr, bArr.length);
        int c = m12247c(qmVar);
        int d = m12248d(qmVar);
        int a = qmVar.mo10323a(4);
        if (c == 5 || c == 29) {
            d = m12248d(qmVar);
            if (m12247c(qmVar) == 22) {
                a = qmVar.mo10323a(4);
            }
        }
        int i = f9559c[a];
        C1856jm.m11728c(i != -1);
        return Pair.create(Integer.valueOf(d), Integer.valueOf(i));
    }

    /* renamed from: b */
    public static byte[] m12246b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i2 + 4)];
        System.arraycopy(f9557a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    /* renamed from: c */
    private static int m12247c(C2115qm qmVar) {
        int a = qmVar.mo10323a(5);
        return a == 31 ? qmVar.mo10323a(6) + 32 : a;
    }

    /* renamed from: d */
    private static int m12248d(C2115qm qmVar) {
        int a = qmVar.mo10323a(4);
        if (a == 15) {
            return qmVar.mo10323a(24);
        }
        C1856jm.m11728c(a < 13);
        return f9558b[a];
    }
}
