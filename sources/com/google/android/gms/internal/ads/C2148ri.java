package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ri */
final class C2148ri {

    /* renamed from: a */
    private static final int[] f13649a = {C2449zm.m20728g("isom"), C2449zm.m20728g("iso2"), C2449zm.m20728g("iso3"), C2449zm.m20728g("iso4"), C2449zm.m20728g("iso5"), C2449zm.m20728g("iso6"), C2449zm.m20728g("avc1"), C2449zm.m20728g("hvc1"), C2449zm.m20728g("hev1"), C2449zm.m20728g("mp41"), C2449zm.m20728g("mp42"), C2449zm.m20728g("3g2a"), C2449zm.m20728g("3g2b"), C2449zm.m20728g("3gr6"), C2449zm.m20728g("3gs6"), C2449zm.m20728g("3ge6"), C2449zm.m20728g("3gg6"), C2449zm.m20728g("M4V "), C2449zm.m20728g("M4A "), C2449zm.m20728g("f4v "), C2449zm.m20728g("kddi"), C2449zm.m20728g("M4VP"), C2449zm.m20728g("qt  "), C2449zm.m20728g("MSNV")};

    /* renamed from: a */
    public static boolean m16191a(C1554bh bhVar) {
        return m16193c(bhVar, true);
    }

    /* renamed from: b */
    public static boolean m16192b(C1554bh bhVar) {
        return m16193c(bhVar, false);
    }

    /* renamed from: c */
    private static boolean m16193c(C1554bh bhVar, boolean z) {
        boolean z2;
        C1554bh bhVar2 = bhVar;
        long c = bhVar.mo5856c();
        if (c == -1 || c > 4096) {
            c = 4096;
        }
        int i = (int) c;
        C2152rm rmVar = new C2152rm(64);
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            rmVar.mo10549s(8);
            bhVar.mo5860g(rmVar.f13709a, 0, 8, false);
            long m = rmVar.mo10543m();
            int e = rmVar.mo10535e();
            int i3 = 16;
            if (m == 1) {
                bhVar.mo5860g(rmVar.f13709a, 8, 8, false);
                rmVar.mo10551u(16);
                m = rmVar.mo10544n();
            } else {
                i3 = 8;
            }
            long j = (long) i3;
            if (m < j) {
                return false;
            }
            i2 += i3;
            if (e != C1518ai.f4118C) {
                if (e == C1518ai.f4136L || e == C1518ai.f4140N) {
                    z2 = true;
                } else if ((((long) i2) + m) - j >= ((long) i)) {
                    break;
                } else {
                    int i4 = (int) (m - j);
                    i2 += i4;
                    if (e == C1518ai.f4156b) {
                        if (i4 < 8) {
                            return false;
                        }
                        rmVar.mo10549s(i4);
                        bhVar.mo5860g(rmVar.f13709a, 0, i4, false);
                        int i5 = i4 >> 2;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                break;
                            }
                            if (i6 == 1) {
                                rmVar.mo10553w(4);
                            } else {
                                int e2 = rmVar.mo10535e();
                                if ((e2 >>> 8) == C2449zm.m20728g("3gp")) {
                                    break;
                                }
                                int[] iArr = f13649a;
                                int length = iArr.length;
                                for (int i7 = 0; i7 < 24; i7++) {
                                    if (iArr[i7] == e2) {
                                        break;
                                    }
                                }
                                continue;
                            }
                            i6++;
                        }
                        z3 = true;
                        if (!z3) {
                            return false;
                        }
                    } else if (i4 != 0) {
                        bhVar.mo5859f(i4, false);
                    }
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }
}
