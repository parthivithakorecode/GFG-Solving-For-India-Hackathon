package p087l5;

import java.util.Map;
import p058h5.C2743c;
import p058h5.C2745d;
import p058h5.C2749f;
import p065i5.C2870h;
import p065i5.C2877m;
import p073j5.C3279i;
import p080k5.C3334d;

/* renamed from: l5.c */
public final class C3605c {

    /* renamed from: a */
    public static final C3620i f21327a = C3607b.DAY_OF_QUARTER;

    /* renamed from: b */
    public static final C3620i f21328b = C3607b.QUARTER_OF_YEAR;

    /* renamed from: c */
    public static final C3620i f21329c = C3607b.WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: d */
    public static final C3620i f21330d = C3607b.WEEK_BASED_YEAR;

    /* renamed from: e */
    public static final C3630l f21331e = C3612c.WEEK_BASED_YEARS;

    /* renamed from: f */
    public static final C3630l f21332f = C3612c.QUARTER_YEARS;

    /* renamed from: l5.c$a */
    static /* synthetic */ class C3606a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21333a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                l5.c$c[] r0 = p087l5.C3605c.C3612c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21333a = r0
                l5.c$c r1 = p087l5.C3605c.C3612c.WEEK_BASED_YEARS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21333a     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.c$c r1 = p087l5.C3605c.C3612c.QUARTER_YEARS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p087l5.C3605c.C3606a.<clinit>():void");
        }
    }

    /* renamed from: l5.c$b */
    private enum C3607b implements C3620i {
        DAY_OF_QUARTER {
            /* renamed from: d */
            public C3632n mo14730d(C3614e eVar) {
                if (eVar.mo12781j(this)) {
                    long d = eVar.mo12777d(C3607b.QUARTER_OF_YEAR);
                    if (d != 1) {
                        return d == 2 ? C3632n.m25183i(1, 91) : (d == 3 || d == 4) ? C3632n.m25183i(1, 92) : mo14734h();
                    }
                    return C2877m.f19602j.mo13165v(eVar.mo12777d(C3603a.YEAR)) ? C3632n.m25183i(1, 91) : C3632n.m25183i(1, 90);
                }
                throw new C3631m("Unsupported field: DayOfQuarter");
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0073, code lost:
                if (r2 == 2) goto L_0x0075;
             */
            /* renamed from: e */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public p087l5.C3614e mo14731e(java.util.Map<p087l5.C3620i, java.lang.Long> r13, p087l5.C3614e r14, p073j5.C3279i r15) {
                /*
                    r12 = this;
                    l5.a r14 = p087l5.C3603a.YEAR
                    java.lang.Object r0 = r13.get(r14)
                    java.lang.Long r0 = (java.lang.Long) r0
                    l5.c$b r1 = p087l5.C3605c.C3607b.QUARTER_OF_YEAR
                    java.lang.Object r2 = r13.get(r1)
                    java.lang.Long r2 = (java.lang.Long) r2
                    if (r0 == 0) goto L_0x0099
                    if (r2 != 0) goto L_0x0016
                    goto L_0x0099
                L_0x0016:
                    long r3 = r0.longValue()
                    int r0 = r14.mo14737k(r3)
                    l5.c$b r3 = p087l5.C3605c.C3607b.DAY_OF_QUARTER
                    java.lang.Object r3 = r13.get(r3)
                    java.lang.Long r3 = (java.lang.Long) r3
                    long r3 = r3.longValue()
                    j5.i r5 = p073j5.C3279i.LENIENT
                    r6 = 3
                    r7 = 1
                    r9 = 1
                    if (r15 != r5) goto L_0x004f
                    long r10 = r2.longValue()
                    h5.f r15 = p058h5.C2749f.m21827T(r0, r9, r9)
                    long r9 = p080k5.C3334d.m24479o(r10, r7)
                    long r5 = p080k5.C3334d.m24476l(r9, r6)
                    h5.f r15 = r15.mo12832a0(r5)
                    long r2 = p080k5.C3334d.m24479o(r3, r7)
                    h5.f r15 = r15.mo12831Z(r2)
                    goto L_0x008f
                L_0x004f:
                    l5.n r5 = r1.mo14734h()
                    long r10 = r2.longValue()
                    int r2 = r5.mo14755a(r10, r1)
                    j5.i r5 = p073j5.C3279i.STRICT
                    if (r15 != r5) goto L_0x007c
                    r15 = 92
                    r5 = 91
                    if (r2 != r9) goto L_0x0072
                    i5.m r15 = p065i5.C2877m.f19602j
                    long r10 = (long) r0
                    boolean r15 = r15.mo13165v(r10)
                    if (r15 == 0) goto L_0x006f
                    goto L_0x0075
                L_0x006f:
                    r15 = 90
                    goto L_0x0076
                L_0x0072:
                    r10 = 2
                    if (r2 != r10) goto L_0x0076
                L_0x0075:
                    r15 = r5
                L_0x0076:
                    long r10 = (long) r15
                    l5.n r15 = p087l5.C3632n.m25183i(r7, r10)
                    goto L_0x0080
                L_0x007c:
                    l5.n r15 = r12.mo14734h()
                L_0x0080:
                    r15.mo14756b(r3, r12)
                    int r2 = r2 - r9
                    int r2 = r2 * r6
                    int r2 = r2 + r9
                    h5.f r15 = p058h5.C2749f.m21827T(r0, r2, r9)
                    long r3 = r3 - r7
                    h5.f r15 = r15.mo12831Z(r3)
                L_0x008f:
                    r13.remove(r12)
                    r13.remove(r14)
                    r13.remove(r1)
                    return r15
                L_0x0099:
                    r13 = 0
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: p087l5.C3605c.C3607b.C3608a.mo14731e(java.util.Map, l5.e, j5.i):l5.e");
            }

            /* renamed from: g */
            public boolean mo14733g(C3614e eVar) {
                return eVar.mo12781j(C3603a.DAY_OF_YEAR) && eVar.mo12781j(C3603a.MONTH_OF_YEAR) && eVar.mo12781j(C3603a.YEAR) && C3607b.m25109u(eVar);
            }

            /* renamed from: h */
            public C3632n mo14734h() {
                return C3632n.m25184j(1, 90, 92);
            }

            /* renamed from: i */
            public <R extends C3613d> R mo14735i(R r, long j) {
                long j2 = mo14736j(r);
                mo14734h().mo14756b(j, this);
                C3603a aVar = C3603a.DAY_OF_YEAR;
                return r.mo12804l(aVar, r.mo12777d(aVar) + (j - j2));
            }

            /* renamed from: j */
            public long mo14736j(C3614e eVar) {
                if (eVar.mo12781j(this)) {
                    return (long) (eVar.mo12778g(C3603a.DAY_OF_YEAR) - C3607b.f21338j[((eVar.mo12778g(C3603a.MONTH_OF_YEAR) - 1) / 3) + (C2877m.f19602j.mo13165v(eVar.mo12777d(C3603a.YEAR)) ? 4 : 0)]);
                }
                throw new C3631m("Unsupported field: DayOfQuarter");
            }

            public String toString() {
                return "DayOfQuarter";
            }
        },
        QUARTER_OF_YEAR {
            /* renamed from: d */
            public C3632n mo14730d(C3614e eVar) {
                return mo14734h();
            }

            /* renamed from: g */
            public boolean mo14733g(C3614e eVar) {
                return eVar.mo12781j(C3603a.MONTH_OF_YEAR) && C3607b.m25109u(eVar);
            }

            /* renamed from: h */
            public C3632n mo14734h() {
                return C3632n.m25183i(1, 4);
            }

            /* renamed from: i */
            public <R extends C3613d> R mo14735i(R r, long j) {
                long j2 = mo14736j(r);
                mo14734h().mo14756b(j, this);
                C3603a aVar = C3603a.MONTH_OF_YEAR;
                return r.mo12804l(aVar, r.mo12777d(aVar) + ((j - j2) * 3));
            }

            /* renamed from: j */
            public long mo14736j(C3614e eVar) {
                if (eVar.mo12781j(this)) {
                    return (eVar.mo12777d(C3603a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new C3631m("Unsupported field: QuarterOfYear");
            }

            public String toString() {
                return "QuarterOfYear";
            }
        },
        WEEK_OF_WEEK_BASED_YEAR {
            /* renamed from: d */
            public C3632n mo14730d(C3614e eVar) {
                if (eVar.mo12781j(this)) {
                    return C3607b.m25108t(C2749f.m21824D(eVar));
                }
                throw new C3631m("Unsupported field: WeekOfWeekBasedYear");
            }

            /* renamed from: e */
            public C3614e mo14731e(Map<C3620i, Long> map, C3614e eVar, C3279i iVar) {
                C3607b bVar;
                C2749f fVar;
                Map<C3620i, Long> map2 = map;
                C3279i iVar2 = iVar;
                C3607b bVar2 = C3607b.WEEK_BASED_YEAR;
                Long l = map2.get(bVar2);
                C3603a aVar = C3603a.DAY_OF_WEEK;
                Long l2 = map2.get(aVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int a = bVar2.mo14734h().mo14755a(l.longValue(), bVar2);
                long longValue = map2.get(C3607b.WEEK_OF_WEEK_BASED_YEAR).longValue();
                if (iVar2 == C3279i.LENIENT) {
                    long longValue2 = l2.longValue();
                    long j = 0;
                    if (longValue2 > 7) {
                        long j2 = longValue2 - 1;
                        j = j2 / 7;
                        longValue2 = (j2 % 7) + 1;
                    } else if (longValue2 < 1) {
                        j = (longValue2 / 7) - 1;
                        longValue2 = (longValue2 % 7) + 7;
                    }
                    bVar = bVar2;
                    fVar = C2749f.m21827T(a, 1, 4).mo12833b0(longValue - 1).mo12833b0(j).mo12856z(aVar, longValue2);
                } else {
                    bVar = bVar2;
                    int k = aVar.mo14737k(l2.longValue());
                    (iVar2 == C3279i.STRICT ? C3607b.m25108t(C2749f.m21827T(a, 1, 4)) : mo14734h()).mo14756b(longValue, this);
                    fVar = C2749f.m21827T(a, 1, 4).mo12833b0(longValue - 1).mo12856z(aVar, (long) k);
                }
                map2.remove(this);
                map2.remove(bVar);
                map2.remove(aVar);
                return fVar;
            }

            /* renamed from: g */
            public boolean mo14733g(C3614e eVar) {
                return eVar.mo12781j(C3603a.EPOCH_DAY) && C3607b.m25109u(eVar);
            }

            /* renamed from: h */
            public C3632n mo14734h() {
                return C3632n.m25184j(1, 52, 53);
            }

            /* renamed from: i */
            public <R extends C3613d> R mo14735i(R r, long j) {
                mo14734h().mo14756b(j, this);
                return r.mo12800e(C3334d.m24479o(j, mo14736j(r)), C3604b.WEEKS);
            }

            /* renamed from: j */
            public long mo14736j(C3614e eVar) {
                if (eVar.mo12781j(this)) {
                    return (long) C3607b.m25105q(C2749f.m21824D(eVar));
                }
                throw new C3631m("Unsupported field: WeekOfWeekBasedYear");
            }

            public String toString() {
                return "WeekOfWeekBasedYear";
            }
        },
        WEEK_BASED_YEAR {
            /* renamed from: d */
            public C3632n mo14730d(C3614e eVar) {
                return C3603a.YEAR.mo14734h();
            }

            /* renamed from: g */
            public boolean mo14733g(C3614e eVar) {
                return eVar.mo12781j(C3603a.EPOCH_DAY) && C3607b.m25109u(eVar);
            }

            /* renamed from: h */
            public C3632n mo14734h() {
                return C3603a.YEAR.mo14734h();
            }

            /* renamed from: i */
            public <R extends C3613d> R mo14735i(R r, long j) {
                if (mo14733g(r)) {
                    int a = mo14734h().mo14755a(j, C3607b.WEEK_BASED_YEAR);
                    C2749f D = C2749f.m21824D(r);
                    C3603a aVar = C3603a.DAY_OF_WEEK;
                    int g = D.mo12778g(aVar);
                    int n = C3607b.m25105q(D);
                    if (n == 53 && C3607b.m25107s(a) == 52) {
                        n = 52;
                    }
                    C2749f T = C2749f.m21827T(a, 1, 4);
                    return r.mo12805m(T.mo12831Z((long) ((g - T.mo12778g(aVar)) + ((n - 1) * 7))));
                }
                throw new C3631m("Unsupported field: WeekBasedYear");
            }

            /* renamed from: j */
            public long mo14736j(C3614e eVar) {
                if (eVar.mo12781j(this)) {
                    return (long) C3607b.m25106r(C2749f.m21824D(eVar));
                }
                throw new C3631m("Unsupported field: WeekBasedYear");
            }

            public String toString() {
                return "WeekBasedYear";
            }
        };
        
        /* access modifiers changed from: private */

        /* renamed from: j */
        public static final int[] f21338j = null;

        static {
            f21338j = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public static int m25105q(C2749f fVar) {
            int ordinal = fVar.mo12818H().ordinal();
            int I = fVar.mo12819I() - 1;
            int i = (3 - ordinal) + I;
            int i2 = (i - ((i / 7) * 7)) - 3;
            if (i2 < -3) {
                i2 += 7;
            }
            if (I < i2) {
                return (int) m25108t(fVar.mo12841i0(180).mo12828S(1)).mo14757c();
            }
            int i3 = ((I - i2) / 7) + 1;
            if (i3 == 53) {
                if (!(i2 == -3 || (i2 == -2 && fVar.mo12823N()))) {
                    return 1;
                }
            }
            return i3;
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public static int m25106r(C2749f fVar) {
            int M = fVar.mo12822M();
            int I = fVar.mo12819I();
            if (I <= 3) {
                return I - fVar.mo12818H().ordinal() < -2 ? M - 1 : M;
            }
            if (I < 363) {
                return M;
            }
            return ((I - 363) - (fVar.mo12823N() ? 1 : 0)) - fVar.mo12818H().ordinal() >= 0 ? M + 1 : M;
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public static int m25107s(int i) {
            C2749f T = C2749f.m21827T(i, 1, 1);
            if (T.mo12818H() != C2743c.THURSDAY) {
                return (T.mo12818H() != C2743c.WEDNESDAY || !T.mo12823N()) ? 52 : 53;
            }
            return 53;
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public static C3632n m25108t(C2749f fVar) {
            return C3632n.m25183i(1, (long) m25107s(m25106r(fVar)));
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public static boolean m25109u(C3614e eVar) {
            return C2870h.m22476i(eVar).equals(C2877m.f19602j);
        }

        /* renamed from: b */
        public boolean mo14729b() {
            return true;
        }

        /* renamed from: e */
        public C3614e mo14731e(Map<C3620i, Long> map, C3614e eVar, C3279i iVar) {
            return null;
        }

        /* renamed from: f */
        public boolean mo14732f() {
            return false;
        }
    }

    /* renamed from: l5.c$c */
    private enum C3612c implements C3630l {
        WEEK_BASED_YEARS("WeekBasedYears", C2745d.m21785h(31556952)),
        QUARTER_YEARS("QuarterYears", C2745d.m21785h(7889238));
        

        /* renamed from: f */
        private final String f21343f;

        /* renamed from: g */
        private final C2745d f21344g;

        private C3612c(String str, C2745d dVar) {
            this.f21343f = str;
            this.f21344g = dVar;
        }

        /* renamed from: b */
        public boolean mo14740b() {
            return true;
        }

        /* renamed from: d */
        public <R extends C3613d> R mo14741d(R r, long j) {
            int i = C3606a.f21333a[ordinal()];
            if (i == 1) {
                C3620i iVar = C3605c.f21330d;
                return r.mo12804l(iVar, C3334d.m24475k((long) r.mo12778g(iVar), j));
            } else if (i == 2) {
                return r.mo12800e(j / 256, C3604b.YEARS).mo12800e((j % 256) * 3, C3604b.MONTHS);
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        public String toString() {
            return this.f21343f;
        }
    }
}
