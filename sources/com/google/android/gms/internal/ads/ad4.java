package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class ad4 {
    /* renamed from: a */
    public static c91 m6032a(pc4 pc4, boolean z) {
        c91 a = new hd4().mo7917a(pc4, z ? null : vf4.f16221a);
        if (a == null || a.mo6086b() == 0) {
            return null;
        }
        return a;
    }

    /* renamed from: b */
    public static cd4 m6033b(dr2 dr2) {
        dr2.mo6581g(1);
        int u = dr2.mo6595u();
        long k = ((long) dr2.mo6585k()) + ((long) u);
        int i = u / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long z = dr2.mo6600z();
            if (z == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = z;
            jArr2[i2] = dr2.mo6600z();
            dr2.mo6581g(2);
            i2++;
        }
        dr2.mo6581g((int) (k - ((long) dr2.mo6585k())));
        return new cd4(jArr, jArr2);
    }
}
