package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class xb4 {

    /* renamed from: a */
    public final List<byte[]> f17106a;

    /* renamed from: b */
    public final int f17107b;

    /* renamed from: c */
    public final int f17108c;

    /* renamed from: d */
    public final int f17109d;

    /* renamed from: e */
    public final float f17110e;

    /* renamed from: f */
    public final String f17111f;

    private xb4(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f17106a = list;
        this.f17107b = i;
        this.f17108c = i2;
        this.f17109d = i3;
        this.f17110e = f;
        this.f17111f = str;
    }

    /* renamed from: a */
    public static xb4 m19444a(dr2 dr2) {
        String str;
        float f;
        int i;
        int i2;
        try {
            dr2.mo6581g(4);
            int s = (dr2.mo6593s() & 3) + 1;
            if (s != 3) {
                ArrayList arrayList = new ArrayList();
                int s2 = dr2.mo6593s() & 31;
                for (int i3 = 0; i3 < s2; i3++) {
                    arrayList.add(m19445b(dr2));
                }
                int s3 = dr2.mo6593s();
                for (int i4 = 0; i4 < s3; i4++) {
                    arrayList.add(m19445b(dr2));
                }
                if (s2 > 0) {
                    sg2 d = th2.m17271d((byte[]) arrayList.get(0), s + 1, ((byte[]) arrayList.get(0)).length);
                    int i5 = d.f14439e;
                    int i6 = d.f14440f;
                    float f2 = d.f14441g;
                    str = zw1.m20865a(d.f14435a, d.f14436b, d.f14437c);
                    i2 = i5;
                    i = i6;
                    f = f2;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                    str = null;
                }
                return new xb4(arrayList, s, i2, i, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C1646dz.m8223a("Error parsing AVC config", e);
        }
    }

    /* renamed from: b */
    private static byte[] m19445b(dr2 dr2) {
        int w = dr2.mo6597w();
        int k = dr2.mo6585k();
        dr2.mo6581g(w);
        return zw1.m20867c(dr2.mo6582h(), k, w);
    }
}
