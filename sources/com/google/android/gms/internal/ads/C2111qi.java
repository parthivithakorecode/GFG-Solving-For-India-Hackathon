package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Stack;

/* renamed from: com.google.android.gms.internal.ads.qi */
public final class C2111qi implements C1591ch, C1851jh {

    /* renamed from: p */
    public static final C1666eh f13168p = new C2037oi();

    /* renamed from: q */
    private static final int f13169q = C2449zm.m20728g("qt  ");

    /* renamed from: a */
    private final C2152rm f13170a = new C2152rm(C2078pm.f12700a);

    /* renamed from: b */
    private final C2152rm f13171b = new C2152rm(4);

    /* renamed from: c */
    private final C2152rm f13172c = new C2152rm(16);

    /* renamed from: d */
    private final Stack<C2407yh> f13173d = new Stack<>();

    /* renamed from: e */
    private int f13174e;

    /* renamed from: f */
    private int f13175f;

    /* renamed from: g */
    private long f13176g;

    /* renamed from: h */
    private int f13177h;

    /* renamed from: i */
    private C2152rm f13178i;

    /* renamed from: j */
    private int f13179j;

    /* renamed from: k */
    private int f13180k;

    /* renamed from: l */
    private C1628dh f13181l;

    /* renamed from: m */
    private C2074pi[] f13182m;

    /* renamed from: n */
    private long f13183n;

    /* renamed from: o */
    private boolean f13184o;

    /* renamed from: g */
    private final void m15632g() {
        this.f13174e = 0;
        this.f13177h = 0;
    }

    /* renamed from: h */
    private final void m15633h(long j) {
        C1964mj mjVar;
        C1964mj mjVar2;
        C1740gh ghVar;
        C2185si a;
        while (!this.f13173d.isEmpty() && this.f13173d.peek().f17734P0 == j) {
            C2407yh pop = this.f13173d.pop();
            if (pop.f4206a == C1518ai.f4118C) {
                ArrayList arrayList = new ArrayList();
                C1740gh ghVar2 = new C1740gh();
                C2444zh e = pop.mo12019e(C1518ai.f4115A0);
                if (e != null) {
                    mjVar = C1778hi.m10581c(e, this.f13184o);
                    if (mjVar != null) {
                        ghVar2.mo7639b(mjVar);
                    }
                } else {
                    mjVar = null;
                }
                long j2 = -9223372036854775807L;
                long j3 = Long.MAX_VALUE;
                int i = 0;
                while (i < pop.f17736R0.size()) {
                    C2407yh yhVar = pop.f17736R0.get(i);
                    if (yhVar.f4206a == C1518ai.f4122E && (a = C1778hi.m10579a(yhVar, pop.mo12019e(C1518ai.f4120D), -9223372036854775807L, (C2406yg) null, this.f13184o)) != null) {
                        C2334wi b = C1778hi.m10580b(a, yhVar.mo12018d(C1518ai.f4124F).mo12018d(C1518ai.f4126G).mo12018d(C1518ai.f4128H), ghVar2);
                        if (b.f16820a != 0) {
                            C2074pi piVar = new C2074pi(a, b, this.f13181l.mo6476c(i, a.f14448b));
                            C2367xe f = a.f14452f.mo11812f(b.f16823d + 30);
                            if (a.f14448b == 1) {
                                if (ghVar2.mo7638a()) {
                                    f = f.mo11810e(ghVar2.f7486a, ghVar2.f7487b);
                                }
                                if (mjVar != null) {
                                    f = f.mo11813g(mjVar);
                                }
                            }
                            piVar.f12668c.mo8952b(f);
                            ghVar = ghVar2;
                            mjVar2 = mjVar;
                            long max = Math.max(j2, a.f14451e);
                            arrayList.add(piVar);
                            long j4 = b.f16821b[0];
                            if (j4 < j3) {
                                j2 = max;
                                j3 = j4;
                            } else {
                                j2 = max;
                            }
                            i++;
                            ghVar2 = ghVar;
                            mjVar = mjVar2;
                        }
                    }
                    ghVar = ghVar2;
                    mjVar2 = mjVar;
                    i++;
                    ghVar2 = ghVar;
                    mjVar = mjVar2;
                }
                this.f13183n = j2;
                this.f13182m = (C2074pi[]) arrayList.toArray(new C2074pi[arrayList.size()]);
                this.f13181l.mo6474a();
                this.f13181l.mo6475b(this);
                this.f13173d.clear();
                this.f13174e = 2;
            } else if (!this.f13173d.isEmpty()) {
                this.f13173d.peek().mo12020f(pop);
            }
        }
        if (this.f13174e != 2) {
            m15632g();
        }
    }

    /* renamed from: a */
    public final long mo5288a(long j) {
        long j2 = Long.MAX_VALUE;
        for (C2074pi piVar : this.f13182m) {
            C2334wi wiVar = piVar.f12667b;
            int a = wiVar.mo11656a(j);
            if (a == -1) {
                a = wiVar.mo11657b(j);
            }
            long j3 = wiVar.f16821b[a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    /* renamed from: b */
    public final void mo6196b(long j, long j2) {
        this.f13173d.clear();
        this.f13177h = 0;
        this.f13179j = 0;
        this.f13180k = 0;
        if (j == 0) {
            m15632g();
            return;
        }
        C2074pi[] piVarArr = this.f13182m;
        if (piVarArr != null) {
            for (C2074pi piVar : piVarArr) {
                C2334wi wiVar = piVar.f12667b;
                int a = wiVar.mo11656a(j2);
                if (a == -1) {
                    a = wiVar.mo11657b(j2);
                }
                piVar.f12669d = a;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo5289c() {
        return true;
    }

    /* renamed from: d */
    public final boolean mo6197d(C1554bh bhVar) {
        return C2148ri.m16192b(bhVar);
    }

    /* renamed from: e */
    public final int mo6198e(C1554bh bhVar, C1777hh hhVar) {
        C2074pi[] piVarArr;
        boolean z;
        boolean z2;
        C1554bh bhVar2 = bhVar;
        C1777hh hhVar2 = hhVar;
        while (true) {
            int i = this.f13174e;
            if (i == 0) {
                if (this.f13177h == 0) {
                    if (!bhVar2.mo5861h(this.f13172c.f13709a, 0, 8, true)) {
                        return -1;
                    }
                    this.f13177h = 8;
                    this.f13172c.mo10552v(0);
                    this.f13176g = this.f13172c.mo10543m();
                    this.f13175f = this.f13172c.mo10535e();
                }
                if (this.f13176g == 1) {
                    bhVar2.mo5861h(this.f13172c.f13709a, 8, 8, false);
                    this.f13177h += 8;
                    this.f13176g = this.f13172c.mo10544n();
                }
                int i2 = this.f13175f;
                if (i2 == C1518ai.f4118C || i2 == C1518ai.f4122E || i2 == C1518ai.f4124F || i2 == C1518ai.f4126G || i2 == C1518ai.f4128H || i2 == C1518ai.f4145Q) {
                    long d = (bhVar.mo5857d() + this.f13176g) - ((long) this.f13177h);
                    this.f13173d.add(new C2407yh(this.f13175f, d));
                    if (this.f13176g == ((long) this.f13177h)) {
                        m15633h(d);
                    } else {
                        m15632g();
                    }
                } else {
                    if (i2 == C1518ai.f4147S || i2 == C1518ai.f4120D || i2 == C1518ai.f4148T || i2 == C1518ai.f4149U || i2 == C1518ai.f4179m0 || i2 == C1518ai.f4181n0 || i2 == C1518ai.f4183o0 || i2 == C1518ai.f4146R || i2 == C1518ai.f4185p0 || i2 == C1518ai.f4187q0 || i2 == C1518ai.f4189r0 || i2 == C1518ai.f4191s0 || i2 == C1518ai.f4193t0 || i2 == C1518ai.f4144P || i2 == C1518ai.f4156b || i2 == C1518ai.f4115A0) {
                        C1856jm.m11730e(this.f13177h == 8);
                        C1856jm.m11730e(this.f13176g <= 2147483647L);
                        C2152rm rmVar = new C2152rm((int) this.f13176g);
                        this.f13178i = rmVar;
                        System.arraycopy(this.f13172c.f13709a, 0, rmVar.f13709a, 0, 8);
                    } else {
                        this.f13178i = null;
                    }
                    this.f13174e = 1;
                }
            } else if (i != 1) {
                long j = Long.MAX_VALUE;
                int i3 = -1;
                int i4 = 0;
                while (true) {
                    piVarArr = this.f13182m;
                    if (i4 >= piVarArr.length) {
                        break;
                    }
                    C2074pi piVar = piVarArr[i4];
                    int i5 = piVar.f12669d;
                    C2334wi wiVar = piVar.f12667b;
                    if (i5 != wiVar.f16820a) {
                        long j2 = wiVar.f16821b[i5];
                        if (j2 < j) {
                            i3 = i4;
                            j = j2;
                        }
                    }
                    i4++;
                }
                if (i3 == -1) {
                    return -1;
                }
                C2074pi piVar2 = piVarArr[i3];
                C1925lh lhVar = piVar2.f12668c;
                int i6 = piVar2.f12669d;
                C2334wi wiVar2 = piVar2.f12667b;
                long j3 = wiVar2.f16821b[i6];
                int i7 = wiVar2.f16822c[i6];
                if (piVar2.f12666a.f14453g == 1) {
                    j3 += 8;
                    i7 -= 8;
                }
                long d2 = (j3 - bhVar.mo5857d()) + ((long) this.f13179j);
                if (d2 < 0 || d2 >= 262144) {
                    hhVar2.f8220a = j3;
                    return 1;
                }
                int i8 = (int) d2;
                boolean z3 = false;
                bhVar2.mo5862i(i8, false);
                int i9 = piVar2.f12666a.f14457k;
                if (i9 == 0) {
                    while (true) {
                        int i10 = this.f13179j;
                        if (i10 >= i7) {
                            break;
                        }
                        int d3 = lhVar.mo8954d(bhVar2, i7 - i10, false);
                        this.f13179j += d3;
                        this.f13180k -= d3;
                    }
                } else {
                    byte[] bArr = this.f13171b.f13709a;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i11 = 4 - i9;
                    while (this.f13179j < i7) {
                        int i12 = this.f13180k;
                        if (i12 == 0) {
                            bhVar2.mo5861h(this.f13171b.f13709a, i11, i9, z3);
                            this.f13171b.mo10552v(z3 ? 1 : 0);
                            this.f13180k = this.f13171b.mo10539i();
                            this.f13170a.mo10552v(z3);
                            lhVar.mo8953c(this.f13170a, 4);
                            this.f13179j += 4;
                            i7 += i11;
                        } else {
                            int d4 = lhVar.mo8954d(bhVar2, i12, z3);
                            this.f13179j += d4;
                            this.f13180k -= d4;
                            z3 = false;
                        }
                    }
                }
                int i13 = i7;
                C2334wi wiVar3 = piVar2.f12667b;
                lhVar.mo8951a(wiVar3.f16824e[i6], wiVar3.f16825f[i6], i13, 0, (C1888kh) null);
                piVar2.f12669d++;
                this.f13179j = 0;
                this.f13180k = 0;
                return 0;
            } else {
                long j4 = this.f13176g - ((long) this.f13177h);
                long d5 = bhVar.mo5857d() + j4;
                C2152rm rmVar2 = this.f13178i;
                if (rmVar2 != null) {
                    bhVar2.mo5861h(rmVar2.f13709a, this.f13177h, (int) j4, false);
                    if (this.f13175f == C1518ai.f4156b) {
                        C2152rm rmVar3 = this.f13178i;
                        rmVar3.mo10552v(8);
                        if (rmVar3.mo10535e() == f13169q) {
                            z2 = true;
                        } else {
                            rmVar3.mo10553w(4);
                            while (true) {
                                if (rmVar3.mo10531a() > 0) {
                                    if (rmVar3.mo10535e() == f13169q) {
                                        break;
                                    }
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                            z2 = true;
                        }
                        this.f13184o = z2;
                    } else if (!this.f13173d.isEmpty()) {
                        this.f13173d.peek().mo12021g(new C2444zh(this.f13175f, this.f13178i));
                    }
                } else if (j4 < 262144) {
                    bhVar2.mo5862i((int) j4, false);
                } else {
                    hhVar2.f8220a = bhVar.mo5857d() + j4;
                    z = true;
                    m15633h(d5);
                    if (z && this.f13174e != 2) {
                        return 1;
                    }
                }
                z = false;
                m15633h(d5);
                return 1;
            }
        }
    }

    /* renamed from: f */
    public final void mo6199f(C1628dh dhVar) {
        this.f13181l = dhVar;
    }

    public final long zza() {
        return this.f13183n;
    }
}
