package com.google.android.gms.internal.ads;

import java.util.Map;

final class wk1 implements y61<d71> {

    /* renamed from: a */
    private final Map<String, a52<d71>> f16835a;

    /* renamed from: b */
    private final Map<String, a52<mm1>> f16836b;

    /* renamed from: c */
    private final Map<String, r72<mm1>> f16837c;

    /* renamed from: d */
    private final yv3<y61<t41>> f16838d;

    /* renamed from: e */
    private final cn1 f16839e;

    wk1(Map<String, a52<d71>> map, Map<String, a52<mm1>> map2, Map<String, r72<mm1>> map3, yv3<y61<t41>> yv3, cn1 cn1) {
        this.f16835a = map;
        this.f16836b = map2;
        this.f16837c = map3;
        this.f16838d = yv3;
        this.f16839e = cn1;
    }

    /* renamed from: a */
    public final a52<d71> mo11666a(int i, String str) {
        a52 a;
        a52<d71> a52 = this.f16835a.get(str);
        if (a52 != null) {
            return a52;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            r72 r72 = this.f16837c.get(str);
            if (r72 != null) {
                return new b52(r72, c71.f5326a);
            }
            a52 a522 = this.f16836b.get(str);
            if (a522 == null) {
                return null;
            }
            return d71.m7753a(a522);
        } else if (this.f16839e.mo6231e() == null || (a = this.f16838d.mo5051a().mo11666a(i, str)) == null) {
            return null;
        } else {
            return d71.m7753a(a);
        }
    }
}
