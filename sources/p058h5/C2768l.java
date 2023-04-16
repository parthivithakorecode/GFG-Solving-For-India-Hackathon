package p058h5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import p080k5.C3333c;
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

/* renamed from: h5.l */
public final class C2768l extends C3333c implements C3613d, C3615f, Comparable<C2768l>, Serializable {

    /* renamed from: h */
    public static final C2768l f19389h = C2755h.f19349j.mo12912o(C2780r.f19419o);

    /* renamed from: i */
    public static final C2768l f19390i = C2755h.f19350k.mo12912o(C2780r.f19418n);

    /* renamed from: j */
    public static final C3629k<C2768l> f19391j = new C2769a();

    /* renamed from: f */
    private final C2755h f19392f;

    /* renamed from: g */
    private final C2780r f19393g;

    /* renamed from: h5.l$a */
    class C2769a implements C3629k<C2768l> {
        C2769a() {
        }

        /* renamed from: b */
        public C2768l mo12783a(C3614e eVar) {
            return C2768l.m22041p(eVar);
        }
    }

    private C2768l(C2755h hVar, C2780r rVar) {
        this.f19392f = (C2755h) C3334d.m24473i(hVar, "time");
        this.f19393g = (C2780r) C3334d.m24473i(rVar, "offset");
    }

    /* renamed from: p */
    public static C2768l m22041p(C3614e eVar) {
        if (eVar instanceof C2768l) {
            return (C2768l) eVar;
        }
        try {
            return new C2768l(C2755h.m21944r(eVar), C2780r.m22138v(eVar));
        } catch (C2742b unused) {
            throw new C2742b("Unable to obtain OffsetTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: s */
    public static C2768l m22042s(C2755h hVar, C2780r rVar) {
        return new C2768l(hVar, rVar);
    }

    /* renamed from: u */
    static C2768l m22043u(DataInput dataInput) {
        return m22042s(C2755h.m21942J(dataInput), C2780r.m22134B(dataInput));
    }

    /* renamed from: v */
    private long m22044v() {
        return this.f19392f.mo12900K() - (((long) this.f19393g.mo13013w()) * 1000000000);
    }

    /* renamed from: w */
    private C2768l m22045w(C2755h hVar, C2780r rVar) {
        return (this.f19392f != hVar || !this.f19393g.equals(rVar)) ? new C2768l(hVar, rVar) : this;
    }

    private Object writeReplace() {
        return new C2771n((byte) 66, this);
    }

    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        if (kVar == C3621j.m25163e()) {
            return C3604b.NANOS;
        }
        if (kVar == C3621j.m25162d() || kVar == C3621j.m25164f()) {
            return mo12959q();
        }
        if (kVar == C3621j.m25161c()) {
            return this.f19392f;
        }
        if (kVar == C3621j.m25159a() || kVar == C3621j.m25160b() || kVar == C3621j.m25165g()) {
            return null;
        }
        return super.mo12776b(kVar);
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        return iVar instanceof C3603a ? iVar == C3603a.OFFSET_SECONDS ? (long) mo12959q().mo13013w() : this.f19392f.mo12777d(iVar) : iVar.mo14736j(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2768l)) {
            return false;
        }
        C2768l lVar = (C2768l) obj;
        return this.f19392f.equals(lVar.f19392f) && this.f19393g.equals(lVar.f19393g);
    }

    /* renamed from: g */
    public int mo12778g(C3620i iVar) {
        return super.mo12778g(iVar);
    }

    /* renamed from: h */
    public C3613d mo12780h(C3613d dVar) {
        return dVar.mo12804l(C3603a.NANO_OF_DAY, this.f19392f.mo12900K()).mo12804l(C3603a.OFFSET_SECONDS, (long) mo12959q().mo13013w());
    }

    public int hashCode() {
        return this.f19392f.hashCode() ^ this.f19393g.hashCode();
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        return iVar instanceof C3603a ? iVar.mo14732f() || iVar == C3603a.OFFSET_SECONDS : iVar != null && iVar.mo14733g(this);
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        return iVar instanceof C3603a ? iVar == C3603a.OFFSET_SECONDS ? iVar.mo14734h() : this.f19392f.mo12782n(iVar) : iVar.mo14730d(this);
    }

    /* renamed from: o */
    public int compareTo(C2768l lVar) {
        if (this.f19393g.equals(lVar.f19393g)) {
            return this.f19392f.compareTo(lVar.f19392f);
        }
        int b = C3334d.m24466b(m22044v(), lVar.m22044v());
        return b == 0 ? this.f19392f.compareTo(lVar.f19392f) : b;
    }

    /* renamed from: q */
    public C2780r mo12959q() {
        return this.f19393g;
    }

    /* renamed from: r */
    public C2768l mo12802f(long j, C3630l lVar) {
        return j == Long.MIN_VALUE ? mo12800e(Long.MAX_VALUE, lVar).mo12800e(1, lVar) : mo12800e(-j, lVar);
    }

    /* renamed from: t */
    public C2768l mo12800e(long j, C3630l lVar) {
        return lVar instanceof C3604b ? m22045w(this.f19392f.mo12800e(j, lVar), this.f19393g) : (C2768l) lVar.mo14741d(this, j);
    }

    public String toString() {
        return this.f19392f.toString() + this.f19393g.toString();
    }

    /* renamed from: x */
    public C2768l mo12805m(C3615f fVar) {
        return fVar instanceof C2755h ? m22045w((C2755h) fVar, this.f19393g) : fVar instanceof C2780r ? m22045w(this.f19392f, (C2780r) fVar) : fVar instanceof C2768l ? (C2768l) fVar : (C2768l) fVar.mo12780h(this);
    }

    /* renamed from: y */
    public C2768l mo12804l(C3620i iVar, long j) {
        return iVar instanceof C3603a ? iVar == C3603a.OFFSET_SECONDS ? m22045w(this.f19392f, C2780r.m22141z(((C3603a) iVar).mo14737k(j))) : m22045w(this.f19392f.mo12804l(iVar, j), this.f19393g) : (C2768l) iVar.mo14735i(this, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo12965z(DataOutput dataOutput) {
        this.f19392f.mo12908S(dataOutput);
        this.f19393g.mo13010E(dataOutput);
    }
}
