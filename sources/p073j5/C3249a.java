package p073j5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p058h5.C2742b;
import p058h5.C2746e;
import p058h5.C2749f;
import p058h5.C2755h;
import p058h5.C2770m;
import p058h5.C2778q;
import p058h5.C2780r;
import p065i5.C2858b;
import p065i5.C2860c;
import p065i5.C2865f;
import p065i5.C2870h;
import p065i5.C2877m;
import p080k5.C3333c;
import p080k5.C3334d;
import p087l5.C3603a;
import p087l5.C3614e;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;

/* renamed from: j5.a */
final class C3249a extends C3333c implements Cloneable {

    /* renamed from: f */
    final Map<C3620i, Long> f20627f = new HashMap();

    /* renamed from: g */
    C2870h f20628g;

    /* renamed from: h */
    C2778q f20629h;

    /* renamed from: i */
    C2858b f20630i;

    /* renamed from: j */
    C2755h f20631j;

    /* renamed from: k */
    boolean f20632k;

    /* renamed from: l */
    C2770m f20633l;

    /* renamed from: A */
    private C3249a m24178A(C3620i iVar, long j) {
        this.f20627f.put(iVar, Long.valueOf(j));
        return this;
    }

    /* renamed from: C */
    private boolean m24179C(C3279i iVar) {
        int i = 0;
        loop0:
        while (i < 100) {
            for (Map.Entry<C3620i, Long> key : this.f20627f.entrySet()) {
                C3620i iVar2 = (C3620i) key.getKey();
                Object e = iVar2.mo14731e(this.f20627f, this, iVar);
                if (e != null) {
                    if (e instanceof C2865f) {
                        C2865f fVar = (C2865f) e;
                        C2778q qVar = this.f20629h;
                        if (qVar == null) {
                            this.f20629h = fVar.mo13039r();
                        } else if (!qVar.equals(fVar.mo13039r())) {
                            throw new C2742b("ChronoZonedDateTime must use the effective parsed zone: " + this.f20629h);
                        }
                        e = fVar.mo13044y();
                    }
                    if (e instanceof C2858b) {
                        m24183G(iVar2, (C2858b) e);
                    } else if (e instanceof C2755h) {
                        m24182F(iVar2, (C2755h) e);
                    } else if (e instanceof C2860c) {
                        C2860c cVar = (C2860c) e;
                        m24183G(iVar2, cVar.mo12892y());
                        m24182F(iVar2, cVar.mo12893z());
                    } else {
                        throw new C2742b("Unknown type: " + e.getClass().getName());
                    }
                } else if (!this.f20627f.containsKey(iVar2)) {
                }
                i++;
            }
        }
        if (i != 100) {
            return i > 0;
        }
        throw new C2742b("Badly written field");
    }

    /* renamed from: D */
    private void m24180D() {
        if (this.f20631j != null) {
            return;
        }
        if (this.f20627f.containsKey(C3603a.INSTANT_SECONDS) || this.f20627f.containsKey(C3603a.SECOND_OF_DAY) || this.f20627f.containsKey(C3603a.SECOND_OF_MINUTE)) {
            Map<C3620i, Long> map = this.f20627f;
            C3603a aVar = C3603a.NANO_OF_SECOND;
            if (map.containsKey(aVar)) {
                long longValue = this.f20627f.get(aVar).longValue();
                this.f20627f.put(C3603a.MICRO_OF_SECOND, Long.valueOf(longValue / 1000));
                this.f20627f.put(C3603a.MILLI_OF_SECOND, Long.valueOf(longValue / 1000000));
                return;
            }
            this.f20627f.put(aVar, 0L);
            this.f20627f.put(C3603a.MICRO_OF_SECOND, 0L);
            this.f20627f.put(C3603a.MILLI_OF_SECOND, 0L);
        }
    }

    /* renamed from: E */
    private void m24181E() {
        C2865f<?> p;
        if (this.f20630i != null && this.f20631j != null) {
            Long l = this.f20627f.get(C3603a.OFFSET_SECONDS);
            if (l != null) {
                p = this.f20630i.mo12845p(this.f20631j).mo12885p(C2780r.m22141z(l.intValue()));
            } else if (this.f20629h != null) {
                p = this.f20630i.mo12845p(this.f20631j).mo12885p(this.f20629h);
            } else {
                return;
            }
            C3603a aVar = C3603a.INSTANT_SECONDS;
            this.f20627f.put(aVar, Long.valueOf(p.mo12777d(aVar)));
        }
    }

    /* renamed from: F */
    private void m24182F(C3620i iVar, C2755h hVar) {
        long K = hVar.mo12900K();
        Long put = this.f20627f.put(C3603a.NANO_OF_DAY, Long.valueOf(K));
        if (put != null && put.longValue() != K) {
            throw new C2742b("Conflict found: " + C2755h.m21939B(put.longValue()) + " differs from " + hVar + " while resolving  " + iVar);
        }
    }

    /* renamed from: G */
    private void m24183G(C3620i iVar, C2858b bVar) {
        if (this.f20628g.equals(bVar.mo12847r())) {
            long x = bVar.mo12854x();
            Long put = this.f20627f.put(C3603a.EPOCH_DAY, Long.valueOf(x));
            if (put != null && put.longValue() != x) {
                throw new C2742b("Conflict found: " + C2749f.m21829V(put.longValue()) + " differs from " + C2749f.m21829V(x) + " while resolving  " + iVar);
            }
            return;
        }
        throw new C2742b("ChronoLocalDate must use the effective parsed chronology: " + this.f20628g);
    }

    /* renamed from: H */
    private void m24184H(C3279i iVar) {
        int i;
        C2755h hVar;
        C2755h y;
        C3279i iVar2 = iVar;
        Map<C3620i, Long> map = this.f20627f;
        C3603a aVar = C3603a.HOUR_OF_DAY;
        Long l = map.get(aVar);
        Map<C3620i, Long> map2 = this.f20627f;
        C3603a aVar2 = C3603a.MINUTE_OF_HOUR;
        Long l2 = map2.get(aVar2);
        Map<C3620i, Long> map3 = this.f20627f;
        C3603a aVar3 = C3603a.SECOND_OF_MINUTE;
        Long l3 = map3.get(aVar3);
        Map<C3620i, Long> map4 = this.f20627f;
        C3603a aVar4 = C3603a.NANO_OF_SECOND;
        Long l4 = map4.get(aVar4);
        if (l != null) {
            if (l2 == null && (l3 != null || l4 != null)) {
                return;
            }
            if (l2 == null || l3 != null || l4 == null) {
                if (iVar2 != C3279i.LENIENT) {
                    if (iVar2 == C3279i.SMART && l.longValue() == 24 && ((l2 == null || l2.longValue() == 0) && ((l3 == null || l3.longValue() == 0) && (l4 == null || l4.longValue() == 0)))) {
                        l = 0L;
                        this.f20633l = C2770m.m22066d(1);
                    }
                    int k = aVar.mo14737k(l.longValue());
                    if (l2 != null) {
                        int k2 = aVar2.mo14737k(l2.longValue());
                        if (l3 != null) {
                            int k3 = aVar3.mo14737k(l3.longValue());
                            y = l4 != null ? C2755h.m21938A(k, k2, k3, aVar4.mo14737k(l4.longValue())) : C2755h.m21947z(k, k2, k3);
                        } else if (l4 == null) {
                            y = C2755h.m21946y(k, k2);
                        }
                    } else if (l3 == null && l4 == null) {
                        y = C2755h.m21946y(k, 0);
                    }
                    mo14167p(y);
                } else {
                    long longValue = l.longValue();
                    if (l2 == null) {
                        i = C3334d.m24480p(C3334d.m24469e(longValue, 24));
                        hVar = C2755h.m21946y((int) ((long) C3334d.m24471g(longValue, 24)), 0);
                    } else if (l3 != null) {
                        if (l4 == null) {
                            l4 = 0L;
                        }
                        long k4 = C3334d.m24475k(C3334d.m24475k(C3334d.m24475k(C3334d.m24477m(longValue, 3600000000000L), C3334d.m24477m(l2.longValue(), 60000000000L)), C3334d.m24477m(l3.longValue(), 1000000000)), l4.longValue());
                        i = (int) C3334d.m24469e(k4, 86400000000000L);
                        hVar = C2755h.m21939B(C3334d.m24472h(k4, 86400000000000L));
                    } else {
                        long k5 = C3334d.m24475k(C3334d.m24477m(longValue, 3600), C3334d.m24477m(l2.longValue(), 60));
                        i = (int) C3334d.m24469e(k5, 86400);
                        hVar = C2755h.m21940C(C3334d.m24472h(k5, 86400));
                    }
                    mo14167p(hVar);
                    this.f20633l = C2770m.m22066d(i);
                }
                this.f20627f.remove(aVar);
                this.f20627f.remove(aVar2);
                this.f20627f.remove(aVar3);
                this.f20627f.remove(aVar4);
            }
        }
    }

    /* renamed from: s */
    private void m24185s(C2749f fVar) {
        if (fVar != null) {
            mo14168q(fVar);
            for (C3620i next : this.f20627f.keySet()) {
                if ((next instanceof C3603a) && next.mo14729b()) {
                    try {
                        long d = fVar.mo12777d(next);
                        Long l = this.f20627f.get(next);
                        if (d != l.longValue()) {
                            throw new C2742b("Conflict found: Field " + next + " " + d + " differs from " + next + " " + l + " derived from " + fVar);
                        }
                    } catch (C2742b unused) {
                        continue;
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [h5.h] */
    /* JADX WARNING: type inference failed for: r0v5, types: [i5.c] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24186t() {
        /*
            r2 = this;
            java.util.Map<l5.i, java.lang.Long> r0 = r2.f20627f
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0020
            i5.b r0 = r2.f20630i
            if (r0 == 0) goto L_0x0015
            h5.h r1 = r2.f20631j
            if (r1 == 0) goto L_0x0015
            i5.c r0 = r0.mo12845p(r1)
            goto L_0x0017
        L_0x0015:
            if (r0 == 0) goto L_0x001b
        L_0x0017:
            r2.m24187u(r0)
            goto L_0x0020
        L_0x001b:
            h5.h r0 = r2.f20631j
            if (r0 == 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j5.C3249a.m24186t():void");
    }

    /* renamed from: u */
    private void m24187u(C3614e eVar) {
        Iterator<Map.Entry<C3620i, Long>> it = this.f20627f.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            C3620i iVar = (C3620i) next.getKey();
            long longValue = ((Long) next.getValue()).longValue();
            if (eVar.mo12781j(iVar)) {
                try {
                    long d = eVar.mo12777d(iVar);
                    if (d == longValue) {
                        it.remove();
                    } else {
                        throw new C2742b("Cross check failed: " + iVar + " " + d + " vs " + iVar + " " + longValue);
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    /* renamed from: v */
    private Long m24188v(C3620i iVar) {
        return this.f20627f.get(iVar);
    }

    /* renamed from: w */
    private void m24189w(C3279i iVar) {
        if (this.f20628g instanceof C2877m) {
            m24185s(C2877m.f19602j.mo13167x(this.f20627f, iVar));
            return;
        }
        Map<C3620i, Long> map = this.f20627f;
        C3603a aVar = C3603a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            m24185s(C2749f.m21829V(this.f20627f.remove(aVar).longValue()));
        }
    }

    /* renamed from: x */
    private void m24190x() {
        if (this.f20627f.containsKey(C3603a.INSTANT_SECONDS)) {
            C2778q qVar = this.f20629h;
            if (qVar == null) {
                Long l = this.f20627f.get(C3603a.OFFSET_SECONDS);
                if (l != null) {
                    qVar = C2780r.m22141z(l.intValue());
                } else {
                    return;
                }
            }
            m24191y(qVar);
        }
    }

    /* renamed from: y */
    private void m24191y(C2778q qVar) {
        Map<C3620i, Long> map = this.f20627f;
        C3603a aVar = C3603a.INSTANT_SECONDS;
        C2865f s = this.f20628g.mo13140s(C2746e.m21796v(map.remove(aVar).longValue()), qVar);
        if (this.f20630i == null) {
            mo14168q(s.mo13043x());
        } else {
            m24183G(aVar, s.mo13043x());
        }
        mo14166o(C3603a.SECOND_OF_DAY, (long) s.mo13045z().mo12901L());
    }

    /* renamed from: z */
    private void m24192z(C3279i iVar) {
        C3603a aVar;
        long j;
        Map<C3620i, Long> map = this.f20627f;
        C3603a aVar2 = C3603a.CLOCK_HOUR_OF_DAY;
        long j2 = 0;
        if (map.containsKey(aVar2)) {
            long longValue = this.f20627f.remove(aVar2).longValue();
            if (!(iVar == C3279i.LENIENT || (iVar == C3279i.SMART && longValue == 0))) {
                aVar2.mo14738l(longValue);
            }
            C3603a aVar3 = C3603a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            mo14166o(aVar3, longValue);
        }
        Map<C3620i, Long> map2 = this.f20627f;
        C3603a aVar4 = C3603a.CLOCK_HOUR_OF_AMPM;
        if (map2.containsKey(aVar4)) {
            long longValue2 = this.f20627f.remove(aVar4).longValue();
            if (!(iVar == C3279i.LENIENT || (iVar == C3279i.SMART && longValue2 == 0))) {
                aVar4.mo14738l(longValue2);
            }
            C3603a aVar5 = C3603a.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j2 = longValue2;
            }
            mo14166o(aVar5, j2);
        }
        C3279i iVar2 = C3279i.LENIENT;
        if (iVar != iVar2) {
            Map<C3620i, Long> map3 = this.f20627f;
            C3603a aVar6 = C3603a.AMPM_OF_DAY;
            if (map3.containsKey(aVar6)) {
                aVar6.mo14738l(this.f20627f.get(aVar6).longValue());
            }
            Map<C3620i, Long> map4 = this.f20627f;
            C3603a aVar7 = C3603a.HOUR_OF_AMPM;
            if (map4.containsKey(aVar7)) {
                aVar7.mo14738l(this.f20627f.get(aVar7).longValue());
            }
        }
        Map<C3620i, Long> map5 = this.f20627f;
        C3603a aVar8 = C3603a.AMPM_OF_DAY;
        if (map5.containsKey(aVar8)) {
            Map<C3620i, Long> map6 = this.f20627f;
            C3603a aVar9 = C3603a.HOUR_OF_AMPM;
            if (map6.containsKey(aVar9)) {
                mo14166o(C3603a.HOUR_OF_DAY, (this.f20627f.remove(aVar8).longValue() * 12) + this.f20627f.remove(aVar9).longValue());
            }
        }
        Map<C3620i, Long> map7 = this.f20627f;
        C3603a aVar10 = C3603a.NANO_OF_DAY;
        if (map7.containsKey(aVar10)) {
            long longValue3 = this.f20627f.remove(aVar10).longValue();
            if (iVar != iVar2) {
                aVar10.mo14738l(longValue3);
            }
            mo14166o(C3603a.SECOND_OF_DAY, longValue3 / 1000000000);
            mo14166o(C3603a.NANO_OF_SECOND, longValue3 % 1000000000);
        }
        Map<C3620i, Long> map8 = this.f20627f;
        C3603a aVar11 = C3603a.MICRO_OF_DAY;
        if (map8.containsKey(aVar11)) {
            long longValue4 = this.f20627f.remove(aVar11).longValue();
            if (iVar != iVar2) {
                aVar11.mo14738l(longValue4);
            }
            mo14166o(C3603a.SECOND_OF_DAY, longValue4 / 1000000);
            mo14166o(C3603a.MICRO_OF_SECOND, longValue4 % 1000000);
        }
        Map<C3620i, Long> map9 = this.f20627f;
        C3603a aVar12 = C3603a.MILLI_OF_DAY;
        if (map9.containsKey(aVar12)) {
            long longValue5 = this.f20627f.remove(aVar12).longValue();
            if (iVar != iVar2) {
                aVar12.mo14738l(longValue5);
            }
            mo14166o(C3603a.SECOND_OF_DAY, longValue5 / 1000);
            mo14166o(C3603a.MILLI_OF_SECOND, longValue5 % 1000);
        }
        Map<C3620i, Long> map10 = this.f20627f;
        C3603a aVar13 = C3603a.SECOND_OF_DAY;
        if (map10.containsKey(aVar13)) {
            long longValue6 = this.f20627f.remove(aVar13).longValue();
            if (iVar != iVar2) {
                aVar13.mo14738l(longValue6);
            }
            mo14166o(C3603a.HOUR_OF_DAY, longValue6 / 3600);
            mo14166o(C3603a.MINUTE_OF_HOUR, (longValue6 / 60) % 60);
            mo14166o(C3603a.SECOND_OF_MINUTE, longValue6 % 60);
        }
        Map<C3620i, Long> map11 = this.f20627f;
        C3603a aVar14 = C3603a.MINUTE_OF_DAY;
        if (map11.containsKey(aVar14)) {
            long longValue7 = this.f20627f.remove(aVar14).longValue();
            if (iVar != iVar2) {
                aVar14.mo14738l(longValue7);
            }
            mo14166o(C3603a.HOUR_OF_DAY, longValue7 / 60);
            mo14166o(C3603a.MINUTE_OF_HOUR, longValue7 % 60);
        }
        if (iVar != iVar2) {
            Map<C3620i, Long> map12 = this.f20627f;
            C3603a aVar15 = C3603a.MILLI_OF_SECOND;
            if (map12.containsKey(aVar15)) {
                aVar15.mo14738l(this.f20627f.get(aVar15).longValue());
            }
            Map<C3620i, Long> map13 = this.f20627f;
            C3603a aVar16 = C3603a.MICRO_OF_SECOND;
            if (map13.containsKey(aVar16)) {
                aVar16.mo14738l(this.f20627f.get(aVar16).longValue());
            }
        }
        Map<C3620i, Long> map14 = this.f20627f;
        C3603a aVar17 = C3603a.MILLI_OF_SECOND;
        if (map14.containsKey(aVar17)) {
            Map<C3620i, Long> map15 = this.f20627f;
            C3603a aVar18 = C3603a.MICRO_OF_SECOND;
            if (map15.containsKey(aVar18)) {
                mo14166o(aVar18, (this.f20627f.remove(aVar17).longValue() * 1000) + (this.f20627f.get(aVar18).longValue() % 1000));
            }
        }
        Map<C3620i, Long> map16 = this.f20627f;
        C3603a aVar19 = C3603a.MICRO_OF_SECOND;
        if (map16.containsKey(aVar19)) {
            Map<C3620i, Long> map17 = this.f20627f;
            C3603a aVar20 = C3603a.NANO_OF_SECOND;
            if (map17.containsKey(aVar20)) {
                mo14166o(aVar19, this.f20627f.get(aVar20).longValue() / 1000);
                this.f20627f.remove(aVar19);
            }
        }
        if (this.f20627f.containsKey(aVar17)) {
            Map<C3620i, Long> map18 = this.f20627f;
            C3603a aVar21 = C3603a.NANO_OF_SECOND;
            if (map18.containsKey(aVar21)) {
                mo14166o(aVar17, this.f20627f.get(aVar21).longValue() / 1000000);
                this.f20627f.remove(aVar17);
            }
        }
        if (this.f20627f.containsKey(aVar19)) {
            long longValue8 = this.f20627f.remove(aVar19).longValue();
            aVar = C3603a.NANO_OF_SECOND;
            j = longValue8 * 1000;
        } else if (this.f20627f.containsKey(aVar17)) {
            long longValue9 = this.f20627f.remove(aVar17).longValue();
            aVar = C3603a.NANO_OF_SECOND;
            j = longValue9 * 1000000;
        } else {
            return;
        }
        mo14166o(aVar, j);
    }

    /* renamed from: B */
    public C3249a mo14165B(C3279i iVar, Set<C3620i> set) {
        C2858b bVar;
        if (set != null) {
            this.f20627f.keySet().retainAll(set);
        }
        m24190x();
        m24189w(iVar);
        m24192z(iVar);
        if (m24179C(iVar)) {
            m24190x();
            m24189w(iVar);
            m24192z(iVar);
        }
        m24184H(iVar);
        m24186t();
        C2770m mVar = this.f20633l;
        if (!(mVar == null || mVar.mo12967c() || (bVar = this.f20630i) == null || this.f20631j == null)) {
            this.f20630i = bVar.mo12853w(this.f20633l);
            this.f20633l = C2770m.f19394i;
        }
        m24180D();
        m24181E();
        return this;
    }

    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        if (kVar == C3621j.m25165g()) {
            return this.f20629h;
        }
        if (kVar == C3621j.m25159a()) {
            return this.f20628g;
        }
        if (kVar == C3621j.m25160b()) {
            C2858b bVar = this.f20630i;
            if (bVar != null) {
                return C2749f.m21824D(bVar);
            }
            return null;
        } else if (kVar == C3621j.m25161c()) {
            return this.f20631j;
        } else {
            if (kVar == C3621j.m25164f() || kVar == C3621j.m25162d()) {
                return kVar.mo12783a(this);
            }
            if (kVar == C3621j.m25163e()) {
                return null;
            }
            return kVar.mo12783a(this);
        }
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        C3334d.m24473i(iVar, "field");
        Long v = m24188v(iVar);
        if (v != null) {
            return v.longValue();
        }
        C2858b bVar = this.f20630i;
        if (bVar != null && bVar.mo12781j(iVar)) {
            return this.f20630i.mo12777d(iVar);
        }
        C2755h hVar = this.f20631j;
        if (hVar != null && hVar.mo12781j(iVar)) {
            return this.f20631j.mo12777d(iVar);
        }
        throw new C2742b("Field not found: " + iVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r1 = r2.f20630i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r1 = r2.f20631j;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12781j(p087l5.C3620i r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.Map<l5.i, java.lang.Long> r1 = r2.f20627f
            boolean r1 = r1.containsKey(r3)
            if (r1 != 0) goto L_0x0020
            i5.b r1 = r2.f20630i
            if (r1 == 0) goto L_0x0016
            boolean r1 = r1.mo12781j(r3)
            if (r1 != 0) goto L_0x0020
        L_0x0016:
            h5.h r1 = r2.f20631j
            if (r1 == 0) goto L_0x0021
            boolean r3 = r1.mo12781j(r3)
            if (r3 == 0) goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j5.C3249a.mo12781j(l5.i):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C3249a mo14166o(C3620i iVar, long j) {
        C3334d.m24473i(iVar, "field");
        Long v = m24188v(iVar);
        if (v == null || v.longValue() == j) {
            return m24178A(iVar, j);
        }
        throw new C2742b("Conflict found: " + iVar + " " + v + " differs from " + iVar + " " + j + ": " + this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo14167p(C2755h hVar) {
        this.f20631j = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo14168q(C2858b bVar) {
        this.f20630i = bVar;
    }

    /* renamed from: r */
    public <R> R mo14169r(C3629k<R> kVar) {
        return kVar.mo12783a(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("DateTimeBuilder[");
        if (this.f20627f.size() > 0) {
            sb.append("fields=");
            sb.append(this.f20627f);
        }
        sb.append(", ");
        sb.append(this.f20628g);
        sb.append(", ");
        sb.append(this.f20629h);
        sb.append(", ");
        sb.append(this.f20630i);
        sb.append(", ");
        sb.append(this.f20631j);
        sb.append(']');
        return sb.toString();
    }
}
