package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.v4 */
final class C2282v4 {
    /* renamed from: a */
    public static C2208t4 m18329a(pc4 pc4) {
        C2245u4 a;
        byte[] bArr;
        dr2 dr2 = new dr2(16);
        if (C2245u4.m17709a(pc4, dr2).f15391a != 1380533830) {
            return null;
        }
        jc4 jc4 = (jc4) pc4;
        jc4.mo6917n(dr2.mo6582h(), 0, 4, false);
        dr2.mo6580f(0);
        int m = dr2.mo6587m();
        if (m != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(m);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        while (true) {
            a = C2245u4.m17709a(pc4, dr2);
            if (a.f15391a == 1718449184) {
                break;
            }
            jc4.mo8446o((int) a.f15392b, false);
        }
        wu1.m19207f(a.f15392b >= 16);
        jc4.mo6917n(dr2.mo6582h(), 0, 16, false);
        dr2.mo6580f(0);
        int q = dr2.mo6591q();
        int q2 = dr2.mo6591q();
        int p = dr2.mo6590p();
        int p2 = dr2.mo6590p();
        int q3 = dr2.mo6591q();
        int q4 = dr2.mo6591q();
        int i = ((int) a.f15392b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            jc4.mo6917n(bArr2, 0, i, false);
            bArr = bArr2;
        } else {
            bArr = n13.f11241f;
        }
        return new C2208t4(q, q2, p, p2, q3, q4, bArr);
    }
}
