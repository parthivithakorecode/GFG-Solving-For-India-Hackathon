package com.google.android.gms.internal.ads;

import android.util.Log;

public final class gc4 {
    /* renamed from: a */
    public static void m9653a(long j, dr2 dr2, td4[] td4Arr) {
        int i;
        while (true) {
            boolean z = true;
            if (dr2.mo6583i() > 1) {
                int c = m9655c(dr2);
                int c2 = m9655c(dr2);
                int k = dr2.mo6585k() + c2;
                if (c2 == -1 || c2 > dr2.mo6583i()) {
                    Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    k = dr2.mo6586l();
                } else if (c == 4 && c2 >= 8) {
                    int s = dr2.mo6593s();
                    int w = dr2.mo6597w();
                    if (w == 49) {
                        i = dr2.mo6587m();
                        w = 49;
                    } else {
                        i = 0;
                    }
                    int s2 = dr2.mo6593s();
                    if (w == 47) {
                        dr2.mo6581g(1);
                        w = 47;
                    }
                    boolean z2 = s == 181 && (w == 49 || w == 47) && s2 == 3;
                    if (w == 49) {
                        if (i != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        m9654b(j, dr2, td4Arr);
                    }
                }
                dr2.mo6580f(k);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m9654b(long j, dr2 dr2, td4[] td4Arr) {
        int s = dr2.mo6593s();
        if ((s & 64) != 0) {
            dr2.mo6581g(1);
            int i = (s & 31) * 3;
            int k = dr2.mo6585k();
            for (td4 td4 : td4Arr) {
                dr2.mo6580f(k);
                td4.mo7876e(dr2, i);
                if (j != -9223372036854775807L) {
                    td4.mo7872a(j, 1, i, 0, (sd4) null);
                }
            }
        }
    }

    /* renamed from: c */
    private static int m9655c(dr2 dr2) {
        int i = 0;
        while (dr2.mo6583i() != 0) {
            int s = dr2.mo6593s();
            i += s;
            if (s != 255) {
                return i;
            }
        }
        return -1;
    }
}
