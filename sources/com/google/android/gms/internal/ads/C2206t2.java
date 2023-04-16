package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.t2 */
public final class C2206t2 implements C1838j4 {

    /* renamed from: a */
    private final List<C1574c0> f14680a = e73.m8347v();

    public C2206t2(int i) {
    }

    /* renamed from: b */
    private final C2393y3 m17074b(C1801i4 i4Var) {
        return new C2393y3(m17076d(i4Var));
    }

    /* renamed from: c */
    private final C1986n4 m17075c(C1801i4 i4Var) {
        return new C1986n4(m17076d(i4Var));
    }

    /* renamed from: d */
    private final List<C1574c0> m17076d(C1801i4 i4Var) {
        String str;
        int i;
        List list;
        dr2 dr2 = new dr2(i4Var.f8533d);
        List<C1574c0> list2 = this.f14680a;
        while (dr2.mo6583i() > 0) {
            int s = dr2.mo6593s();
            int k = dr2.mo6585k() + dr2.mo6593s();
            if (s == 134) {
                list2 = new ArrayList<>();
                int s2 = dr2.mo6593s() & 31;
                for (int i2 = 0; i2 < s2; i2++) {
                    String F = dr2.mo6572F(3, c43.f5304c);
                    int s3 = dr2.mo6593s();
                    int i3 = s3 & 128;
                    if (i3 != 0) {
                        i = s3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte s4 = (byte) dr2.mo6593s();
                    dr2.mo6581g(1);
                    if (i3 != 0) {
                        int i4 = zw1.f18379c;
                        list = Collections.singletonList((s4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    bf4 bf4 = new bf4();
                    bf4.mo5842s(str);
                    bf4.mo5834k(F);
                    bf4.mo5821c0(i);
                    bf4.mo5832i(list);
                    list2.add(bf4.mo5848y());
                }
            }
            dr2.mo6580f(k);
        }
        return list2;
    }

    /* renamed from: a */
    public final C1912l4 mo8341a(int i, C1801i4 i4Var) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new C2022o3(new C1911l3(i4Var.f8531b));
            }
            if (i == 21) {
                return new C2022o3(new C1837j3());
            }
            if (i == 27) {
                return new C2022o3(new C1726g3(m17074b(i4Var), false, false));
            }
            if (i == 36) {
                return new C2022o3(new C1800i3(m17074b(i4Var)));
            }
            if (i == 89) {
                return new C2022o3(new C2280v2(i4Var.f8532c));
            }
            if (i == 138) {
                return new C2022o3(new C2243u2(i4Var.f8531b));
            }
            if (i == 172) {
                return new C2022o3(new C2058p2(i4Var.f8531b));
            }
            if (i == 257) {
                return new C2356x3(new C1985n3("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new C2356x3(new C1985n3("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new C2022o3(new C2169s2(false, i4Var.f8531b));
                            case 16:
                                return new C2022o3(new C1540b3(m17075c(i4Var)));
                            case 17:
                                return new C2022o3(new C1874k3(i4Var.f8531b));
                            default:
                                return null;
                        }
                    }
                }
                return new C2022o3(new C1947m2(i4Var.f8531b));
            }
        }
        return new C2022o3(new C2392y2(m17075c(i4Var)));
    }
}
