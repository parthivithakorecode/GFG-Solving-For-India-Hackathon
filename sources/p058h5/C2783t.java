package p058h5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.List;
import p065i5.C2865f;
import p080k5.C3334d;
import p087l5.C3603a;
import p087l5.C3604b;
import p087l5.C3614e;
import p087l5.C3615f;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;
import p087l5.C3630l;
import p087l5.C3632n;
import p094m5.C3728d;
import p094m5.C3732f;

/* renamed from: h5.t */
public final class C2783t extends C2865f<C2749f> implements Serializable {

    /* renamed from: j */
    public static final C3629k<C2783t> f19425j = new C2784a();

    /* renamed from: g */
    private final C2752g f19426g;

    /* renamed from: h */
    private final C2780r f19427h;

    /* renamed from: i */
    private final C2778q f19428i;

    /* renamed from: h5.t$a */
    class C2784a implements C3629k<C2783t> {
        C2784a() {
        }

        /* renamed from: b */
        public C2783t mo12783a(C3614e eVar) {
            return C2783t.m22164E(eVar);
        }
    }

    /* renamed from: h5.t$b */
    static /* synthetic */ class C2785b {

        /* renamed from: a */
        static final /* synthetic */ int[] f19429a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                l5.a[] r0 = p087l5.C3603a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19429a = r0
                l5.a r1 = p087l5.C3603a.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19429a     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.a r1 = p087l5.C3603a.OFFSET_SECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p058h5.C2783t.C2785b.<clinit>():void");
        }
    }

    private C2783t(C2752g gVar, C2780r rVar, C2778q qVar) {
        this.f19426g = gVar;
        this.f19427h = rVar;
        this.f19428i = qVar;
    }

    /* renamed from: D */
    private static C2783t m22163D(long j, int i, C2778q qVar) {
        C2780r a = qVar.mo13005o().mo14909a(C2746e.m21797w(j, (long) i));
        return new C2783t(C2752g.m21888R(j, i, a), a, qVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|(3:7|8|9)|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0022 */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p058h5.C2783t m22164E(p087l5.C3614e r4) {
        /*
            boolean r0 = r4 instanceof p058h5.C2783t
            if (r0 == 0) goto L_0x0007
            h5.t r4 = (p058h5.C2783t) r4
            return r4
        L_0x0007:
            h5.q r0 = p058h5.C2778q.m22124i(r4)     // Catch:{ b -> 0x002b }
            l5.a r1 = p087l5.C3603a.INSTANT_SECONDS     // Catch:{ b -> 0x002b }
            boolean r2 = r4.mo12781j(r1)     // Catch:{ b -> 0x002b }
            if (r2 == 0) goto L_0x0022
            long r1 = r4.mo12777d(r1)     // Catch:{ b -> 0x0022 }
            l5.a r3 = p087l5.C3603a.NANO_OF_SECOND     // Catch:{ b -> 0x0022 }
            int r3 = r4.mo12778g(r3)     // Catch:{ b -> 0x0022 }
            h5.t r4 = m22163D(r1, r3, r0)     // Catch:{ b -> 0x0022 }
            return r4
        L_0x0022:
            h5.g r1 = p058h5.C2752g.m21885F(r4)     // Catch:{ b -> 0x002b }
            h5.t r4 = m22168R(r1, r0)     // Catch:{ b -> 0x002b }
            return r4
        L_0x002b:
            h5.b r0 = new h5.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to obtain ZonedDateTime from TemporalAccessor: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", type "
            r1.append(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p058h5.C2783t.m22164E(l5.e):h5.t");
    }

    /* renamed from: O */
    public static C2783t m22165O(C2740a aVar) {
        C3334d.m24473i(aVar, "clock");
        return m22169S(aVar.mo12771b(), aVar.mo12770a());
    }

    /* renamed from: P */
    public static C2783t m22166P(C2778q qVar) {
        return m22165O(C2740a.m21767c(qVar));
    }

    /* renamed from: Q */
    public static C2783t m22167Q(int i, int i2, int i3, int i4, int i5, int i6, int i7, C2778q qVar) {
        return m22172V(C2752g.m21886P(i, i2, i3, i4, i5, i6, i7), qVar, (C2780r) null);
    }

    /* renamed from: R */
    public static C2783t m22168R(C2752g gVar, C2778q qVar) {
        return m22172V(gVar, qVar, (C2780r) null);
    }

    /* renamed from: S */
    public static C2783t m22169S(C2746e eVar, C2778q qVar) {
        C3334d.m24473i(eVar, "instant");
        C3334d.m24473i(qVar, "zone");
        return m22163D(eVar.mo12807r(), eVar.mo12808s(), qVar);
    }

    /* renamed from: T */
    public static C2783t m22170T(C2752g gVar, C2780r rVar, C2778q qVar) {
        C3334d.m24473i(gVar, "localDateTime");
        C3334d.m24473i(rVar, "offset");
        C3334d.m24473i(qVar, "zone");
        return m22163D(gVar.mo13109w(rVar), gVar.mo12867L(), qVar);
    }

    /* renamed from: U */
    private static C2783t m22171U(C2752g gVar, C2780r rVar, C2778q qVar) {
        C3334d.m24473i(gVar, "localDateTime");
        C3334d.m24473i(rVar, "offset");
        C3334d.m24473i(qVar, "zone");
        if (!(qVar instanceof C2780r) || rVar.equals(qVar)) {
            return new C2783t(gVar, rVar, qVar);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    /* renamed from: V */
    public static C2783t m22172V(C2752g gVar, C2778q qVar, C2780r rVar) {
        Object i;
        C3334d.m24473i(gVar, "localDateTime");
        C3334d.m24473i(qVar, "zone");
        if (qVar instanceof C2780r) {
            return new C2783t(gVar, (C2780r) qVar, qVar);
        }
        C3732f o = qVar.mo13005o();
        List c = o.mo14911c(gVar);
        if (c.size() == 1) {
            i = c.get(0);
        } else {
            if (c.size() == 0) {
                C3728d b = o.mo14910b(gVar);
                gVar = gVar.mo12876Z(b.mo14929f().mo12789f());
                rVar = b.mo14932i();
            } else if (rVar == null || !c.contains(rVar)) {
                i = C3334d.m24473i(c.get(0), "offset");
            }
            return new C2783t(gVar, rVar, qVar);
        }
        rVar = (C2780r) i;
        return new C2783t(gVar, rVar, qVar);
    }

    /* renamed from: Y */
    static C2783t m22173Y(DataInput dataInput) {
        return m22171U(C2752g.m21892c0(dataInput), C2780r.m22134B(dataInput), (C2778q) C2771n.m22070a(dataInput));
    }

    /* renamed from: Z */
    private C2783t m22174Z(C2752g gVar) {
        return m22170T(gVar, this.f19427h, this.f19428i);
    }

    /* renamed from: a0 */
    private C2783t m22175a0(C2752g gVar) {
        return m22172V(gVar, this.f19428i, this.f19427h);
    }

    /* renamed from: b0 */
    private C2783t m22176b0(C2780r rVar) {
        return (rVar.equals(this.f19427h) || !this.f19428i.mo13005o().mo14913e(this.f19426g, rVar)) ? this : new C2783t(this.f19426g, rVar, this.f19428i);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C2771n((byte) 6, this);
    }

    /* renamed from: F */
    public int mo13019F() {
        return this.f19426g.mo12862G();
    }

    /* renamed from: G */
    public C2743c mo13020G() {
        return this.f19426g.mo12863H();
    }

    /* renamed from: H */
    public int mo13021H() {
        return this.f19426g.mo12864I();
    }

    /* renamed from: I */
    public int mo13022I() {
        return this.f19426g.mo12865J();
    }

    /* renamed from: J */
    public int mo13023J() {
        return this.f19426g.mo12866K();
    }

    /* renamed from: K */
    public int mo13024K() {
        return this.f19426g.mo12867L();
    }

    /* renamed from: L */
    public int mo13025L() {
        return this.f19426g.mo12868M();
    }

    /* renamed from: M */
    public int mo13026M() {
        return this.f19426g.mo12869N();
    }

    /* renamed from: N */
    public C2783t mo13040t(long j, C3630l lVar) {
        return j == Long.MIN_VALUE ? mo13042u(Long.MAX_VALUE, lVar).mo13042u(1, lVar) : mo13042u(-j, lVar);
    }

    /* renamed from: W */
    public C2783t mo13042u(long j, C3630l lVar) {
        return lVar instanceof C3604b ? lVar.mo14740b() ? m22175a0(this.f19426g.mo12891v(j, lVar)) : m22174Z(this.f19426g.mo12891v(j, lVar)) : (C2783t) lVar.mo14741d(this, j);
    }

    /* renamed from: X */
    public C2783t mo13029X(long j) {
        return m22175a0(this.f19426g.mo12872V(j));
    }

    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        return kVar == C3621j.m25160b() ? mo13043x() : super.mo12776b(kVar);
    }

    /* renamed from: c0 */
    public C2749f mo13043x() {
        return this.f19426g.mo12892y();
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14736j(this);
        }
        int i = C2785b.f19429a[((C3603a) iVar).ordinal()];
        return i != 1 ? i != 2 ? this.f19426g.mo12777d(iVar) : (long) mo13038q().mo13013w() : mo13121v();
    }

    /* renamed from: d0 */
    public C2752g mo13044y() {
        return this.f19426g;
    }

    /* renamed from: e0 */
    public C2783t mo12805m(C3615f fVar) {
        if (fVar instanceof C2749f) {
            return m22175a0(C2752g.m21887Q((C2749f) fVar, this.f19426g.mo12893z()));
        }
        if (fVar instanceof C2755h) {
            return m22175a0(C2752g.m21887Q(this.f19426g.mo12892y(), (C2755h) fVar));
        }
        if (fVar instanceof C2752g) {
            return m22175a0((C2752g) fVar);
        }
        if (!(fVar instanceof C2746e)) {
            return fVar instanceof C2780r ? m22176b0((C2780r) fVar) : (C2783t) fVar.mo12780h(this);
        }
        C2746e eVar = (C2746e) fVar;
        return m22163D(eVar.mo12807r(), eVar.mo12808s(), this.f19428i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2783t)) {
            return false;
        }
        C2783t tVar = (C2783t) obj;
        return this.f19426g.equals(tVar.f19426g) && this.f19427h.equals(tVar.f19427h) && this.f19428i.equals(tVar.f19428i);
    }

    /* renamed from: f0 */
    public C2783t mo12804l(C3620i iVar, long j) {
        if (!(iVar instanceof C3603a)) {
            return (C2783t) iVar.mo14735i(this, j);
        }
        C3603a aVar = (C3603a) iVar;
        int i = C2785b.f19429a[aVar.ordinal()];
        return i != 1 ? i != 2 ? m22175a0(this.f19426g.mo12804l(iVar, j)) : m22176b0(C2780r.m22141z(aVar.mo14737k(j))) : m22163D(j, mo13024K(), this.f19428i);
    }

    /* renamed from: g */
    public int mo12778g(C3620i iVar) {
        if (!(iVar instanceof C3603a)) {
            return super.mo12778g(iVar);
        }
        int i = C2785b.f19429a[((C3603a) iVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f19426g.mo12778g(iVar) : mo13038q().mo13013w();
        }
        throw new C2742b("Field too large for an int: " + iVar);
    }

    /* renamed from: g0 */
    public C2783t mo13018C(C2778q qVar) {
        C3334d.m24473i(qVar, "zone");
        return this.f19428i.equals(qVar) ? this : m22172V(this.f19426g, qVar, this.f19427h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo13036h0(DataOutput dataOutput) {
        this.f19426g.mo12883h0(dataOutput);
        this.f19427h.mo13010E(dataOutput);
        this.f19428i.mo13007s(dataOutput);
    }

    public int hashCode() {
        return (this.f19426g.hashCode() ^ this.f19427h.hashCode()) ^ Integer.rotateLeft(this.f19428i.hashCode(), 3);
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        return (iVar instanceof C3603a) || (iVar != null && iVar.mo14733g(this));
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        return iVar instanceof C3603a ? (iVar == C3603a.INSTANT_SECONDS || iVar == C3603a.OFFSET_SECONDS) ? iVar.mo14734h() : this.f19426g.mo12782n(iVar) : iVar.mo14730d(this);
    }

    /* renamed from: q */
    public C2780r mo13038q() {
        return this.f19427h;
    }

    /* renamed from: r */
    public C2778q mo13039r() {
        return this.f19428i;
    }

    public String toString() {
        String str = this.f19426g.toString() + this.f19427h.toString();
        if (this.f19427h == this.f19428i) {
            return str;
        }
        return str + '[' + this.f19428i.toString() + ']';
    }

    /* renamed from: z */
    public C2755h mo13045z() {
        return this.f19426g.mo12893z();
    }
}
