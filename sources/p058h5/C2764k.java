package p058h5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Comparator;
import p065i5.C2877m;
import p080k5.C3332b;
import p080k5.C3334d;
import p087l5.C3603a;
import p087l5.C3604b;
import p087l5.C3613d;
import p087l5.C3614e;
import p087l5.C3615f;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;
import p087l5.C3630l;
import p087l5.C3632n;

/* renamed from: h5.k */
public final class C2764k extends C3332b implements C3615f, Comparable<C2764k>, Serializable {

    /* renamed from: h */
    public static final C2764k f19382h = C2752g.f19343i.mo12860C(C2780r.f19419o);

    /* renamed from: i */
    public static final C2764k f19383i = C2752g.f19344j.mo12860C(C2780r.f19418n);

    /* renamed from: j */
    public static final C3629k<C2764k> f19384j = new C2765a();

    /* renamed from: k */
    private static final Comparator<C2764k> f19385k = new C2766b();

    /* renamed from: f */
    private final C2752g f19386f;

    /* renamed from: g */
    private final C2780r f19387g;

    /* renamed from: h5.k$a */
    class C2765a implements C3629k<C2764k> {
        C2765a() {
        }

        /* renamed from: b */
        public C2764k mo12783a(C3614e eVar) {
            return C2764k.m22012q(eVar);
        }
    }

    /* renamed from: h5.k$b */
    class C2766b implements Comparator<C2764k> {
        C2766b() {
        }

        /* renamed from: a */
        public int compare(C2764k kVar, C2764k kVar2) {
            int b = C3334d.m24466b(kVar.mo12950y(), kVar2.mo12950y());
            return b == 0 ? C3334d.m24466b((long) kVar.mo12945r(), (long) kVar2.mo12945r()) : b;
        }
    }

    /* renamed from: h5.k$c */
    static /* synthetic */ class C2767c {

        /* renamed from: a */
        static final /* synthetic */ int[] f19388a;

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
                f19388a = r0
                l5.a r1 = p087l5.C3603a.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19388a     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.a r1 = p087l5.C3603a.OFFSET_SECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p058h5.C2764k.C2767c.<clinit>():void");
        }
    }

    private C2764k(C2752g gVar, C2780r rVar) {
        this.f19386f = (C2752g) C3334d.m24473i(gVar, "dateTime");
        this.f19387g = (C2780r) C3334d.m24473i(rVar, "offset");
    }

    /* renamed from: C */
    private C2764k m22011C(C2752g gVar, C2780r rVar) {
        return (this.f19386f != gVar || !this.f19387g.equals(rVar)) ? new C2764k(gVar, rVar) : this;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return m22014v(p058h5.C2746e.m21794q(r3), r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0014 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p058h5.C2764k m22012q(p087l5.C3614e r3) {
        /*
            boolean r0 = r3 instanceof p058h5.C2764k
            if (r0 == 0) goto L_0x0007
            h5.k r3 = (p058h5.C2764k) r3
            return r3
        L_0x0007:
            h5.r r0 = p058h5.C2780r.m22138v(r3)     // Catch:{ b -> 0x001d }
            h5.g r1 = p058h5.C2752g.m21885F(r3)     // Catch:{ b -> 0x0014 }
            h5.k r3 = m22013u(r1, r0)     // Catch:{ b -> 0x0014 }
            return r3
        L_0x0014:
            h5.e r1 = p058h5.C2746e.m21794q(r3)     // Catch:{ b -> 0x001d }
            h5.k r3 = m22014v(r1, r0)     // Catch:{ b -> 0x001d }
            return r3
        L_0x001d:
            h5.b r0 = new h5.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to obtain OffsetDateTime from TemporalAccessor: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ", type "
            r1.append(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p058h5.C2764k.m22012q(l5.e):h5.k");
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: u */
    public static C2764k m22013u(C2752g gVar, C2780r rVar) {
        return new C2764k(gVar, rVar);
    }

    /* renamed from: v */
    public static C2764k m22014v(C2746e eVar, C2778q qVar) {
        C3334d.m24473i(eVar, "instant");
        C3334d.m24473i(qVar, "zone");
        C2780r a = qVar.mo13005o().mo14909a(eVar);
        return new C2764k(C2752g.m21888R(eVar.mo12807r(), eVar.mo12808s(), a), a);
    }

    private Object writeReplace() {
        return new C2771n((byte) 69, this);
    }

    /* renamed from: x */
    static C2764k m22015x(DataInput dataInput) {
        return m22013u(C2752g.m21892c0(dataInput), C2780r.m22134B(dataInput));
    }

    /* renamed from: A */
    public C2752g mo12936A() {
        return this.f19386f;
    }

    /* renamed from: B */
    public C2755h mo12937B() {
        return this.f19386f.mo12893z();
    }

    /* renamed from: D */
    public C2764k mo12805m(C3615f fVar) {
        return ((fVar instanceof C2749f) || (fVar instanceof C2755h) || (fVar instanceof C2752g)) ? m22011C(this.f19386f.mo12805m(fVar), this.f19387g) : fVar instanceof C2746e ? m22014v((C2746e) fVar, this.f19387g) : fVar instanceof C2780r ? m22011C(this.f19386f, (C2780r) fVar) : fVar instanceof C2764k ? (C2764k) fVar : (C2764k) fVar.mo12780h(this);
    }

    /* renamed from: E */
    public C2764k mo12804l(C3620i iVar, long j) {
        if (!(iVar instanceof C3603a)) {
            return (C2764k) iVar.mo14735i(this, j);
        }
        C3603a aVar = (C3603a) iVar;
        int i = C2767c.f19388a[aVar.ordinal()];
        return i != 1 ? i != 2 ? m22011C(this.f19386f.mo12804l(iVar, j), this.f19387g) : m22011C(this.f19386f, C2780r.m22141z(aVar.mo14737k(j))) : m22014v(C2746e.m21797w(j, (long) mo12945r()), this.f19387g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo12940F(DataOutput dataOutput) {
        this.f19386f.mo12883h0(dataOutput);
        this.f19387g.mo13010E(dataOutput);
    }

    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        if (kVar == C3621j.m25159a()) {
            return C2877m.f19602j;
        }
        if (kVar == C3621j.m25163e()) {
            return C3604b.NANOS;
        }
        if (kVar == C3621j.m25162d() || kVar == C3621j.m25164f()) {
            return mo12946s();
        }
        if (kVar == C3621j.m25160b()) {
            return mo12951z();
        }
        if (kVar == C3621j.m25161c()) {
            return mo12937B();
        }
        if (kVar == C3621j.m25165g()) {
            return null;
        }
        return super.mo12776b(kVar);
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14736j(this);
        }
        int i = C2767c.f19388a[((C3603a) iVar).ordinal()];
        return i != 1 ? i != 2 ? this.f19386f.mo12777d(iVar) : (long) mo12946s().mo13013w() : mo12950y();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2764k)) {
            return false;
        }
        C2764k kVar = (C2764k) obj;
        return this.f19386f.equals(kVar.f19386f) && this.f19387g.equals(kVar.f19387g);
    }

    /* renamed from: g */
    public int mo12778g(C3620i iVar) {
        if (!(iVar instanceof C3603a)) {
            return super.mo12778g(iVar);
        }
        int i = C2767c.f19388a[((C3603a) iVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f19386f.mo12778g(iVar) : mo12946s().mo13013w();
        }
        throw new C2742b("Field too large for an int: " + iVar);
    }

    /* renamed from: h */
    public C3613d mo12780h(C3613d dVar) {
        return dVar.mo12804l(C3603a.EPOCH_DAY, mo12951z().mo12854x()).mo12804l(C3603a.NANO_OF_DAY, mo12937B().mo12900K()).mo12804l(C3603a.OFFSET_SECONDS, (long) mo12946s().mo13013w());
    }

    public int hashCode() {
        return this.f19386f.hashCode() ^ this.f19387g.hashCode();
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        return (iVar instanceof C3603a) || (iVar != null && iVar.mo14733g(this));
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        return iVar instanceof C3603a ? (iVar == C3603a.INSTANT_SECONDS || iVar == C3603a.OFFSET_SECONDS) ? iVar.mo14734h() : this.f19386f.mo12782n(iVar) : iVar.mo14730d(this);
    }

    /* renamed from: p */
    public int compareTo(C2764k kVar) {
        if (mo12946s().equals(kVar.mo12946s())) {
            return mo12936A().compareTo(kVar.mo12936A());
        }
        int b = C3334d.m24466b(mo12950y(), kVar.mo12950y());
        if (b != 0) {
            return b;
        }
        int v = mo12937B().mo12917v() - kVar.mo12937B().mo12917v();
        return v == 0 ? mo12936A().compareTo(kVar.mo12936A()) : v;
    }

    /* renamed from: r */
    public int mo12945r() {
        return this.f19386f.mo12867L();
    }

    /* renamed from: s */
    public C2780r mo12946s() {
        return this.f19387g;
    }

    /* renamed from: t */
    public C2764k mo12802f(long j, C3630l lVar) {
        return j == Long.MIN_VALUE ? mo12800e(Long.MAX_VALUE, lVar).mo12800e(1, lVar) : mo12800e(-j, lVar);
    }

    public String toString() {
        return this.f19386f.toString() + this.f19387g.toString();
    }

    /* renamed from: w */
    public C2764k mo12800e(long j, C3630l lVar) {
        return lVar instanceof C3604b ? m22011C(this.f19386f.mo12891v(j, lVar), this.f19387g) : (C2764k) lVar.mo14741d(this, j);
    }

    /* renamed from: y */
    public long mo12950y() {
        return this.f19386f.mo13109w(this.f19387g);
    }

    /* renamed from: z */
    public C2749f mo12951z() {
        return this.f19386f.mo12892y();
    }
}
