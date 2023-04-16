package com.google.android.gms.internal.ads;

public final class lc4 {

    /* renamed from: a */
    public final String f10007a;

    private lc4(int i, int i2, String str) {
        this.f10007a = str;
    }

    /* renamed from: a */
    public static lc4 m12688a(dr2 dr2) {
        String str;
        dr2.mo6581g(2);
        int s = dr2.mo6593s();
        int i = s >> 1;
        int s2 = (dr2.mo6593s() >> 3) | ((s & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = s2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str.length() + 24 + str2.length());
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(str2);
        sb.append(s2);
        return new lc4(i, s2, sb.toString());
    }
}
