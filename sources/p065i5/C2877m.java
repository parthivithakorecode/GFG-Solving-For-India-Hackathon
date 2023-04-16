package p065i5;

import java.io.Serializable;
import p058h5.C2746e;
import p058h5.C2749f;
import p058h5.C2752g;
import p058h5.C2778q;
import p058h5.C2783t;
import p087l5.C3614e;

/* renamed from: i5.m */
public final class C2877m extends C2870h implements Serializable {

    /* renamed from: j */
    public static final C2877m f19602j = new C2877m();

    private C2877m() {
    }

    private Object readResolve() {
        return f19602j;
    }

    /* renamed from: j */
    public String mo13135j() {
        return "iso8601";
    }

    /* renamed from: k */
    public String mo13136k() {
        return "ISO";
    }

    /* renamed from: t */
    public C2749f mo13128d(C3614e eVar) {
        return C2749f.m21824D(eVar);
    }

    /* renamed from: u */
    public C2878n mo13133h(int i) {
        return C2878n.m22590i(i);
    }

    /* renamed from: v */
    public boolean mo13165v(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    /* renamed from: w */
    public C2752g mo13137m(C3614e eVar) {
        return C2752g.m21885F(eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        if (r8.longValue() > 0) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r8.longValue() <= 0) goto L_0x0096;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p058h5.C2749f mo13167x(java.util.Map<p087l5.C3620i, java.lang.Long> r11, p073j5.C3279i r12) {
        /*
            r10 = this;
            l5.a r0 = p087l5.C3603a.EPOCH_DAY
            boolean r1 = r11.containsKey(r0)
            if (r1 == 0) goto L_0x0017
            java.lang.Object r11 = r11.remove(r0)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            h5.f r11 = p058h5.C2749f.m21829V(r11)
            return r11
        L_0x0017:
            l5.a r0 = p087l5.C3603a.PROLEPTIC_MONTH
            java.lang.Object r1 = r11.remove(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            r2 = 1
            if (r1 == 0) goto L_0x004d
            j5.i r3 = p073j5.C3279i.LENIENT
            if (r12 == r3) goto L_0x002d
            long r3 = r1.longValue()
            r0.mo14738l(r3)
        L_0x002d:
            l5.a r0 = p087l5.C3603a.MONTH_OF_YEAR
            long r3 = r1.longValue()
            r5 = 12
            int r3 = p080k5.C3334d.m24471g(r3, r5)
            int r3 = r3 + r2
            long r3 = (long) r3
            r10.mo13138q(r11, r0, r3)
            l5.a r0 = p087l5.C3603a.YEAR
            long r3 = r1.longValue()
            r5 = 12
            long r3 = p080k5.C3334d.m24469e(r3, r5)
            r10.mo13138q(r11, r0, r3)
        L_0x004d:
            l5.a r0 = p087l5.C3603a.YEAR_OF_ERA
            java.lang.Object r1 = r11.remove(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            r3 = 1
            if (r1 == 0) goto L_0x00e3
            j5.i r5 = p073j5.C3279i.LENIENT
            if (r12 == r5) goto L_0x0064
            long r5 = r1.longValue()
            r0.mo14738l(r5)
        L_0x0064:
            l5.a r5 = p087l5.C3603a.ERA
            java.lang.Object r5 = r11.remove(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            r6 = 0
            if (r5 != 0) goto L_0x00a7
            l5.a r5 = p087l5.C3603a.YEAR
            java.lang.Object r8 = r11.get(r5)
            java.lang.Long r8 = (java.lang.Long) r8
            j5.i r9 = p073j5.C3279i.STRICT
            if (r12 != r9) goto L_0x008b
            if (r8 == 0) goto L_0x0087
            long r8 = r8.longValue()
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0096
            goto L_0x009f
        L_0x0087:
            r11.put(r0, r1)
            goto L_0x00f8
        L_0x008b:
            if (r8 == 0) goto L_0x009f
            long r8 = r8.longValue()
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0096
            goto L_0x009f
        L_0x0096:
            long r0 = r1.longValue()
            long r0 = p080k5.C3334d.m24479o(r3, r0)
            goto L_0x00a3
        L_0x009f:
            long r0 = r1.longValue()
        L_0x00a3:
            r10.mo13138q(r11, r5, r0)
            goto L_0x00f8
        L_0x00a7:
            long r8 = r5.longValue()
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00b9
            l5.a r0 = p087l5.C3603a.YEAR
            long r5 = r1.longValue()
        L_0x00b5:
            r10.mo13138q(r11, r0, r5)
            goto L_0x00f8
        L_0x00b9:
            long r8 = r5.longValue()
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00cc
            l5.a r0 = p087l5.C3603a.YEAR
            long r5 = r1.longValue()
            long r5 = p080k5.C3334d.m24479o(r3, r5)
            goto L_0x00b5
        L_0x00cc:
            h5.b r11 = new h5.b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid value for era: "
            r12.append(r0)
            r12.append(r5)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00e3:
            l5.a r0 = p087l5.C3603a.ERA
            boolean r1 = r11.containsKey(r0)
            if (r1 == 0) goto L_0x00f8
            java.lang.Object r1 = r11.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            r0.mo14738l(r5)
        L_0x00f8:
            l5.a r0 = p087l5.C3603a.YEAR
            boolean r1 = r11.containsKey(r0)
            if (r1 == 0) goto L_0x0429
            l5.a r1 = p087l5.C3603a.MONTH_OF_YEAR
            boolean r5 = r11.containsKey(r1)
            java.lang.String r6 = "Strict mode rejected date parsed to a different month"
            if (r5 == 0) goto L_0x02db
            l5.a r5 = p087l5.C3603a.DAY_OF_MONTH
            boolean r7 = r11.containsKey(r5)
            if (r7 == 0) goto L_0x018d
            java.lang.Object r3 = r11.remove(r0)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r0 = r0.mo14737k(r3)
            java.lang.Object r1 = r11.remove(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            int r1 = p080k5.C3334d.m24480p(r3)
            java.lang.Object r11 = r11.remove(r5)
            java.lang.Long r11 = (java.lang.Long) r11
            long r3 = r11.longValue()
            int r11 = p080k5.C3334d.m24480p(r3)
            j5.i r3 = p073j5.C3279i.LENIENT
            if (r12 != r3) goto L_0x0157
            int r12 = p080k5.C3334d.m24478n(r1, r2)
            long r3 = (long) r12
            int r11 = p080k5.C3334d.m24478n(r11, r2)
            long r11 = (long) r11
            h5.f r0 = p058h5.C2749f.m21827T(r0, r2, r2)
            h5.f r0 = r0.mo12832a0(r3)
            h5.f r11 = r0.mo12831Z(r11)
            return r11
        L_0x0157:
            j5.i r2 = p073j5.C3279i.SMART
            if (r12 != r2) goto L_0x0188
            long r2 = (long) r11
            r5.mo14738l(r2)
            r12 = 4
            if (r1 == r12) goto L_0x017d
            r12 = 6
            if (r1 == r12) goto L_0x017d
            r12 = 9
            if (r1 == r12) goto L_0x017d
            r12 = 11
            if (r1 != r12) goto L_0x016e
            goto L_0x017d
        L_0x016e:
            r12 = 2
            if (r1 != r12) goto L_0x0183
            h5.i r12 = p058h5.C2758i.FEBRUARY
            long r2 = (long) r0
            boolean r2 = p058h5.C2772o.m22074q(r2)
            int r12 = r12.mo12923o(r2)
            goto L_0x017f
        L_0x017d:
            r12 = 30
        L_0x017f:
            int r11 = java.lang.Math.min(r11, r12)
        L_0x0183:
            h5.f r11 = p058h5.C2749f.m21827T(r0, r1, r11)
            return r11
        L_0x0188:
            h5.f r11 = p058h5.C2749f.m21827T(r0, r1, r11)
            return r11
        L_0x018d:
            l5.a r5 = p087l5.C3603a.ALIGNED_WEEK_OF_MONTH
            boolean r7 = r11.containsKey(r5)
            if (r7 == 0) goto L_0x02db
            l5.a r7 = p087l5.C3603a.ALIGNED_DAY_OF_WEEK_IN_MONTH
            boolean r8 = r11.containsKey(r7)
            if (r8 == 0) goto L_0x0234
            java.lang.Object r8 = r11.remove(r0)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            int r0 = r0.mo14737k(r8)
            j5.i r8 = p073j5.C3279i.LENIENT
            if (r12 != r8) goto L_0x01ea
            java.lang.Object r12 = r11.remove(r1)
            java.lang.Long r12 = (java.lang.Long) r12
            long r8 = r12.longValue()
            long r8 = p080k5.C3334d.m24479o(r8, r3)
            java.lang.Object r12 = r11.remove(r5)
            java.lang.Long r12 = (java.lang.Long) r12
            long r5 = r12.longValue()
            long r5 = p080k5.C3334d.m24479o(r5, r3)
            java.lang.Object r11 = r11.remove(r7)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = p080k5.C3334d.m24479o(r11, r3)
            h5.f r0 = p058h5.C2749f.m21827T(r0, r2, r2)
            h5.f r0 = r0.mo12832a0(r8)
            h5.f r0 = r0.mo12833b0(r5)
            h5.f r11 = r0.mo12831Z(r11)
            return r11
        L_0x01ea:
            java.lang.Object r3 = r11.remove(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = r1.mo14737k(r3)
            java.lang.Object r4 = r11.remove(r5)
            java.lang.Long r4 = (java.lang.Long) r4
            long r8 = r4.longValue()
            int r4 = r5.mo14737k(r8)
            java.lang.Object r11 = r11.remove(r7)
            java.lang.Long r11 = (java.lang.Long) r11
            long r8 = r11.longValue()
            int r11 = r7.mo14737k(r8)
            h5.f r0 = p058h5.C2749f.m21827T(r0, r3, r2)
            int r4 = r4 - r2
            int r4 = r4 * 7
            int r11 = r11 - r2
            int r4 = r4 + r11
            long r4 = (long) r4
            h5.f r11 = r0.mo12831Z(r4)
            j5.i r0 = p073j5.C3279i.STRICT
            if (r12 != r0) goto L_0x0233
            int r12 = r11.mo12778g(r1)
            if (r12 != r3) goto L_0x022d
            goto L_0x0233
        L_0x022d:
            h5.b r11 = new h5.b
            r11.<init>(r6)
            throw r11
        L_0x0233:
            return r11
        L_0x0234:
            l5.a r7 = p087l5.C3603a.DAY_OF_WEEK
            boolean r8 = r11.containsKey(r7)
            if (r8 == 0) goto L_0x02db
            java.lang.Object r8 = r11.remove(r0)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            int r0 = r0.mo14737k(r8)
            j5.i r8 = p073j5.C3279i.LENIENT
            if (r12 != r8) goto L_0x0289
            java.lang.Object r12 = r11.remove(r1)
            java.lang.Long r12 = (java.lang.Long) r12
            long r8 = r12.longValue()
            long r8 = p080k5.C3334d.m24479o(r8, r3)
            java.lang.Object r12 = r11.remove(r5)
            java.lang.Long r12 = (java.lang.Long) r12
            long r5 = r12.longValue()
            long r5 = p080k5.C3334d.m24479o(r5, r3)
            java.lang.Object r11 = r11.remove(r7)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = p080k5.C3334d.m24479o(r11, r3)
            h5.f r0 = p058h5.C2749f.m21827T(r0, r2, r2)
            h5.f r0 = r0.mo12832a0(r8)
            h5.f r0 = r0.mo12833b0(r5)
            h5.f r11 = r0.mo12831Z(r11)
            return r11
        L_0x0289:
            java.lang.Object r3 = r11.remove(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = r1.mo14737k(r3)
            java.lang.Object r4 = r11.remove(r5)
            java.lang.Long r4 = (java.lang.Long) r4
            long r8 = r4.longValue()
            int r4 = r5.mo14737k(r8)
            java.lang.Object r11 = r11.remove(r7)
            java.lang.Long r11 = (java.lang.Long) r11
            long r8 = r11.longValue()
            int r11 = r7.mo14737k(r8)
            h5.f r0 = p058h5.C2749f.m21827T(r0, r3, r2)
            int r4 = r4 - r2
            long r4 = (long) r4
            h5.f r0 = r0.mo12833b0(r4)
            h5.c r11 = p058h5.C2743c.m21774k(r11)
            l5.f r11 = p087l5.C3616g.m25147a(r11)
            h5.f r11 = r0.mo12855y(r11)
            j5.i r0 = p073j5.C3279i.STRICT
            if (r12 != r0) goto L_0x02da
            int r12 = r11.mo12778g(r1)
            if (r12 != r3) goto L_0x02d4
            goto L_0x02da
        L_0x02d4:
            h5.b r11 = new h5.b
            r11.<init>(r6)
            throw r11
        L_0x02da:
            return r11
        L_0x02db:
            l5.a r1 = p087l5.C3603a.DAY_OF_YEAR
            boolean r5 = r11.containsKey(r1)
            if (r5 == 0) goto L_0x0319
            java.lang.Object r5 = r11.remove(r0)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r0 = r0.mo14737k(r5)
            j5.i r5 = p073j5.C3279i.LENIENT
            java.lang.Object r11 = r11.remove(r1)
            java.lang.Long r11 = (java.lang.Long) r11
            if (r12 != r5) goto L_0x030c
            long r11 = r11.longValue()
            long r11 = p080k5.C3334d.m24479o(r11, r3)
            h5.f r0 = p058h5.C2749f.m21830W(r0, r2)
            h5.f r11 = r0.mo12831Z(r11)
            return r11
        L_0x030c:
            long r11 = r11.longValue()
            int r11 = r1.mo14737k(r11)
            h5.f r11 = p058h5.C2749f.m21830W(r0, r11)
            return r11
        L_0x0319:
            l5.a r1 = p087l5.C3603a.ALIGNED_WEEK_OF_YEAR
            boolean r5 = r11.containsKey(r1)
            if (r5 == 0) goto L_0x0429
            l5.a r5 = p087l5.C3603a.ALIGNED_DAY_OF_WEEK_IN_YEAR
            boolean r7 = r11.containsKey(r5)
            if (r7 == 0) goto L_0x03a2
            java.lang.Object r6 = r11.remove(r0)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            int r6 = r0.mo14737k(r6)
            j5.i r7 = p073j5.C3279i.LENIENT
            if (r12 != r7) goto L_0x0364
            java.lang.Object r12 = r11.remove(r1)
            java.lang.Long r12 = (java.lang.Long) r12
            long r0 = r12.longValue()
            long r0 = p080k5.C3334d.m24479o(r0, r3)
            java.lang.Object r11 = r11.remove(r5)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = p080k5.C3334d.m24479o(r11, r3)
            h5.f r2 = p058h5.C2749f.m21827T(r6, r2, r2)
            h5.f r0 = r2.mo12833b0(r0)
            h5.f r11 = r0.mo12831Z(r11)
            return r11
        L_0x0364:
            java.lang.Object r3 = r11.remove(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r1 = r1.mo14737k(r3)
            java.lang.Object r11 = r11.remove(r5)
            java.lang.Long r11 = (java.lang.Long) r11
            long r3 = r11.longValue()
            int r11 = r5.mo14737k(r3)
            h5.f r3 = p058h5.C2749f.m21827T(r6, r2, r2)
            int r1 = r1 - r2
            int r1 = r1 * 7
            int r11 = r11 - r2
            int r1 = r1 + r11
            long r1 = (long) r1
            h5.f r11 = r3.mo12831Z(r1)
            j5.i r1 = p073j5.C3279i.STRICT
            if (r12 != r1) goto L_0x03a1
            int r12 = r11.mo12778g(r0)
            if (r12 != r6) goto L_0x0399
            goto L_0x03a1
        L_0x0399:
            h5.b r11 = new h5.b
            java.lang.String r12 = "Strict mode rejected date parsed to a different year"
            r11.<init>(r12)
            throw r11
        L_0x03a1:
            return r11
        L_0x03a2:
            l5.a r5 = p087l5.C3603a.DAY_OF_WEEK
            boolean r7 = r11.containsKey(r5)
            if (r7 == 0) goto L_0x0429
            java.lang.Object r7 = r11.remove(r0)
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            int r7 = r0.mo14737k(r7)
            j5.i r8 = p073j5.C3279i.LENIENT
            if (r12 != r8) goto L_0x03e5
            java.lang.Object r12 = r11.remove(r1)
            java.lang.Long r12 = (java.lang.Long) r12
            long r0 = r12.longValue()
            long r0 = p080k5.C3334d.m24479o(r0, r3)
            java.lang.Object r11 = r11.remove(r5)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = p080k5.C3334d.m24479o(r11, r3)
            h5.f r2 = p058h5.C2749f.m21827T(r7, r2, r2)
            h5.f r0 = r2.mo12833b0(r0)
            h5.f r11 = r0.mo12831Z(r11)
            return r11
        L_0x03e5:
            java.lang.Object r3 = r11.remove(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r1 = r1.mo14737k(r3)
            java.lang.Object r11 = r11.remove(r5)
            java.lang.Long r11 = (java.lang.Long) r11
            long r3 = r11.longValue()
            int r11 = r5.mo14737k(r3)
            h5.f r3 = p058h5.C2749f.m21827T(r7, r2, r2)
            int r1 = r1 - r2
            long r1 = (long) r1
            h5.f r1 = r3.mo12833b0(r1)
            h5.c r11 = p058h5.C2743c.m21774k(r11)
            l5.f r11 = p087l5.C3616g.m25147a(r11)
            h5.f r11 = r1.mo12855y(r11)
            j5.i r1 = p073j5.C3279i.STRICT
            if (r12 != r1) goto L_0x0428
            int r12 = r11.mo12778g(r0)
            if (r12 != r7) goto L_0x0422
            goto L_0x0428
        L_0x0422:
            h5.b r11 = new h5.b
            r11.<init>(r6)
            throw r11
        L_0x0428:
            return r11
        L_0x0429:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p065i5.C2877m.mo13167x(java.util.Map, j5.i):h5.f");
    }

    /* renamed from: y */
    public C2783t mo13140s(C2746e eVar, C2778q qVar) {
        return C2783t.m22169S(eVar, qVar);
    }
}
