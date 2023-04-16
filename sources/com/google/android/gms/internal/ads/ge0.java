package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p002a1.C0042x;
import p026d1.C2473e;
import p083l1.C3462s;
import p104o1.C3825d;

public final class ge0 implements C3462s {

    /* renamed from: a */
    private final Date f7391a;

    /* renamed from: b */
    private final int f7392b;

    /* renamed from: c */
    private final Set<String> f7393c;

    /* renamed from: d */
    private final boolean f7394d;

    /* renamed from: e */
    private final Location f7395e;

    /* renamed from: f */
    private final int f7396f;

    /* renamed from: g */
    private final b40 f7397g;

    /* renamed from: h */
    private final List<String> f7398h = new ArrayList();

    /* renamed from: i */
    private final boolean f7399i;

    /* renamed from: j */
    private final Map<String, Boolean> f7400j = new HashMap();

    /* renamed from: k */
    private final String f7401k;

    public ge0(Date date, int i, Set<String> set, Location location, boolean z, int i2, b40 b40, List<String> list, boolean z2, int i3, String str) {
        Map<String, Boolean> map;
        String str2;
        Boolean bool;
        this.f7391a = date;
        this.f7392b = i;
        this.f7393c = set;
        this.f7395e = location;
        this.f7394d = z;
        this.f7396f = i2;
        this.f7397g = b40;
        this.f7399i = z2;
        this.f7401k = str;
        if (list != null) {
            for (String next : list) {
                if (next.startsWith("custom:")) {
                    String[] split = next.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            map = this.f7400j;
                            str2 = split[1];
                            bool = Boolean.TRUE;
                        } else if ("false".equals(split[2])) {
                            map = this.f7400j;
                            str2 = split[1];
                            bool = Boolean.FALSE;
                        }
                        map.put(str2, bool);
                    }
                } else {
                    this.f7398h.add(next);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo7604a() {
        return this.f7398h.contains("3");
    }

    @Deprecated
    /* renamed from: b */
    public final boolean mo7605b() {
        return this.f7399i;
    }

    @Deprecated
    /* renamed from: c */
    public final Date mo7606c() {
        return this.f7391a;
    }

    /* renamed from: d */
    public final boolean mo7607d() {
        return this.f7394d;
    }

    /* renamed from: e */
    public final Set<String> mo7608e() {
        return this.f7393c;
    }

    /* renamed from: f */
    public final C3825d mo7609f() {
        return b40.m6604c(this.f7397g);
    }

    /* renamed from: g */
    public final C2473e mo7610g() {
        b40 b40 = this.f7397g;
        C2473e.C2474a aVar = new C2473e.C2474a();
        if (b40 != null) {
            int i = b40.f4681f;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        aVar.mo12323e(b40.f4687l);
                        aVar.mo12322d(b40.f4688m);
                    }
                    aVar.mo12325g(b40.f4682g);
                    aVar.mo12321c(b40.f4683h);
                    aVar.mo12324f(b40.f4684i);
                }
                s00 s00 = b40.f4686k;
                if (s00 != null) {
                    aVar.mo12326h(new C0042x(s00));
                }
            }
            aVar.mo12320b(b40.f4685j);
            aVar.mo12325g(b40.f4682g);
            aVar.mo12321c(b40.f4683h);
            aVar.mo12324f(b40.f4684i);
        }
        return aVar.mo12319a();
    }

    /* renamed from: h */
    public final int mo7611h() {
        return this.f7396f;
    }

    /* renamed from: i */
    public final boolean mo7612i() {
        return this.f7398h.contains("6");
    }

    /* renamed from: j */
    public final Location mo7613j() {
        return this.f7395e;
    }

    @Deprecated
    /* renamed from: k */
    public final int mo7614k() {
        return this.f7392b;
    }

    public final Map<String, Boolean> zza() {
        return this.f7400j;
    }
}
