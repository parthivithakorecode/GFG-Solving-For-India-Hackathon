package p058h5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import p065i5.C2860c;
import p073j5.C3250b;
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

/* renamed from: h5.g */
public final class C2752g extends C2860c<C2749f> implements Serializable {

    /* renamed from: i */
    public static final C2752g f19343i = m21887Q(C2749f.f19335j, C2755h.f19349j);

    /* renamed from: j */
    public static final C2752g f19344j = m21887Q(C2749f.f19336k, C2755h.f19350k);

    /* renamed from: k */
    public static final C3629k<C2752g> f19345k = new C2753a();

    /* renamed from: g */
    private final C2749f f19346g;

    /* renamed from: h */
    private final C2755h f19347h;

    /* renamed from: h5.g$a */
    class C2753a implements C3629k<C2752g> {
        C2753a() {
        }

        /* renamed from: b */
        public C2752g mo12783a(C3614e eVar) {
            return C2752g.m21885F(eVar);
        }
    }

    /* renamed from: h5.g$b */
    static /* synthetic */ class C2754b {

        /* renamed from: a */
        static final /* synthetic */ int[] f19348a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                l5.b[] r0 = p087l5.C3604b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19348a = r0
                l5.b r1 = p087l5.C3604b.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19348a     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.b r1 = p087l5.C3604b.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19348a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l5.b r1 = p087l5.C3604b.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f19348a     // Catch:{ NoSuchFieldError -> 0x0033 }
                l5.b r1 = p087l5.C3604b.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f19348a     // Catch:{ NoSuchFieldError -> 0x003e }
                l5.b r1 = p087l5.C3604b.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f19348a     // Catch:{ NoSuchFieldError -> 0x0049 }
                l5.b r1 = p087l5.C3604b.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f19348a     // Catch:{ NoSuchFieldError -> 0x0054 }
                l5.b r1 = p087l5.C3604b.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p058h5.C2752g.C2754b.<clinit>():void");
        }
    }

    private C2752g(C2749f fVar, C2755h hVar) {
        this.f19346g = fVar;
        this.f19347h = hVar;
    }

    /* renamed from: E */
    private int m21884E(C2752g gVar) {
        int B = this.f19346g.mo12815B(gVar.mo12892y());
        return B == 0 ? this.f19347h.compareTo(gVar.mo12893z()) : B;
    }

    /* renamed from: F */
    public static C2752g m21885F(C3614e eVar) {
        if (eVar instanceof C2752g) {
            return (C2752g) eVar;
        }
        if (eVar instanceof C2783t) {
            return ((C2783t) eVar).mo13044y();
        }
        try {
            return new C2752g(C2749f.m21824D(eVar), C2755h.m21944r(eVar));
        } catch (C2742b unused) {
            throw new C2742b("Unable to obtain LocalDateTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    /* renamed from: P */
    public static C2752g m21886P(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new C2752g(C2749f.m21827T(i, i2, i3), C2755h.m21938A(i4, i5, i6, i7));
    }

    /* renamed from: Q */
    public static C2752g m21887Q(C2749f fVar, C2755h hVar) {
        C3334d.m24473i(fVar, "date");
        C3334d.m24473i(hVar, "time");
        return new C2752g(fVar, hVar);
    }

    /* renamed from: R */
    public static C2752g m21888R(long j, int i, C2780r rVar) {
        C3334d.m24473i(rVar, "offset");
        long w = j + ((long) rVar.mo13013w());
        return new C2752g(C2749f.m21829V(C3334d.m24469e(w, 86400)), C2755h.m21941D((long) C3334d.m24471g(w, 86400), i));
    }

    /* renamed from: S */
    public static C2752g m21889S(CharSequence charSequence) {
        return m21890T(charSequence, C3250b.f20640n);
    }

    /* renamed from: T */
    public static C2752g m21890T(CharSequence charSequence, C3250b bVar) {
        C3334d.m24473i(bVar, "formatter");
        return (C2752g) bVar.mo14177h(charSequence, f19345k);
    }

    /* renamed from: b0 */
    private C2752g m21891b0(C2749f fVar, long j, long j2, long j3, long j4, int i) {
        C2755h B;
        C2749f fVar2 = fVar;
        if ((j | j2 | j3 | j4) == 0) {
            B = this.f19347h;
        } else {
            long j5 = (long) i;
            long K = this.f19347h.mo12900K();
            long j6 = (((j4 % 86400000000000L) + ((j3 % 86400) * 1000000000) + ((j2 % 1440) * 60000000000L) + ((j % 24) * 3600000000000L)) * j5) + K;
            long e = (((j4 / 86400000000000L) + (j3 / 86400) + (j2 / 1440) + (j / 24)) * j5) + C3334d.m24469e(j6, 86400000000000L);
            long h = C3334d.m24472h(j6, 86400000000000L);
            B = h == K ? this.f19347h : C2755h.m21939B(h);
            fVar2 = fVar2.mo12831Z(e);
        }
        return m21893e0(fVar2, B);
    }

    /* renamed from: c0 */
    static C2752g m21892c0(DataInput dataInput) {
        return m21887Q(C2749f.m21831d0(dataInput), C2755h.m21942J(dataInput));
    }

    /* renamed from: e0 */
    private C2752g m21893e0(C2749f fVar, C2755h hVar) {
        return (this.f19346g == fVar && this.f19347h == hVar) ? this : new C2752g(fVar, hVar);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C2771n((byte) 4, this);
    }

    /* renamed from: C */
    public C2764k mo12860C(C2780r rVar) {
        return C2764k.m22013u(this, rVar);
    }

    /* renamed from: D */
    public C2783t mo12885p(C2778q qVar) {
        return C2783t.m22168R(this, qVar);
    }

    /* renamed from: G */
    public int mo12862G() {
        return this.f19346g.mo12817G();
    }

    /* renamed from: H */
    public C2743c mo12863H() {
        return this.f19346g.mo12818H();
    }

    /* renamed from: I */
    public int mo12864I() {
        return this.f19347h.mo12914t();
    }

    /* renamed from: J */
    public int mo12865J() {
        return this.f19347h.mo12916u();
    }

    /* renamed from: K */
    public int mo12866K() {
        return this.f19346g.mo12821K();
    }

    /* renamed from: L */
    public int mo12867L() {
        return this.f19347h.mo12917v();
    }

    /* renamed from: M */
    public int mo12868M() {
        return this.f19347h.mo12918w();
    }

    /* renamed from: N */
    public int mo12869N() {
        return this.f19346g.mo12822M();
    }

    /* renamed from: O */
    public C2752g mo12890u(long j, C3630l lVar) {
        return j == Long.MIN_VALUE ? mo12891v(Long.MAX_VALUE, lVar).mo12891v(1, lVar) : mo12891v(-j, lVar);
    }

    /* renamed from: U */
    public C2752g mo12891v(long j, C3630l lVar) {
        if (!(lVar instanceof C3604b)) {
            return (C2752g) lVar.mo14741d(this, j);
        }
        switch (C2754b.f19348a[((C3604b) lVar).ordinal()]) {
            case 1:
                return mo12875Y(j);
            case 2:
                return mo12872V(j / 86400000000L).mo12875Y((j % 86400000000L) * 1000);
            case 3:
                return mo12872V(j / 86400000).mo12875Y((j % 86400000) * 1000000);
            case 4:
                return mo12876Z(j);
            case 5:
                return mo12874X(j);
            case 6:
                return mo12873W(j);
            case 7:
                return mo12872V(j / 256).mo12873W((j % 256) * 12);
            default:
                return m21893e0(this.f19346g.mo12852v(j, lVar), this.f19347h);
        }
    }

    /* renamed from: V */
    public C2752g mo12872V(long j) {
        return m21893e0(this.f19346g.mo12831Z(j), this.f19347h);
    }

    /* renamed from: W */
    public C2752g mo12873W(long j) {
        return m21891b0(this.f19346g, j, 0, 0, 0, 1);
    }

    /* renamed from: X */
    public C2752g mo12874X(long j) {
        return m21891b0(this.f19346g, 0, j, 0, 0, 1);
    }

    /* renamed from: Y */
    public C2752g mo12875Y(long j) {
        return m21891b0(this.f19346g, 0, 0, 0, j, 1);
    }

    /* renamed from: Z */
    public C2752g mo12876Z(long j) {
        return m21891b0(this.f19346g, 0, 0, j, 0, 1);
    }

    /* renamed from: a0 */
    public C2752g mo12877a0(long j) {
        return m21893e0(this.f19346g.mo12833b0(j), this.f19347h);
    }

    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        return kVar == C3621j.m25160b() ? mo12892y() : super.mo12776b(kVar);
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        return iVar instanceof C3603a ? iVar.mo14732f() ? this.f19347h.mo12777d(iVar) : this.f19346g.mo12777d(iVar) : iVar.mo14736j(this);
    }

    /* renamed from: d0 */
    public C2749f mo12892y() {
        return this.f19346g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2752g)) {
            return false;
        }
        C2752g gVar = (C2752g) obj;
        return this.f19346g.equals(gVar.f19346g) && this.f19347h.equals(gVar.f19347h);
    }

    /* renamed from: f0 */
    public C2752g mo12805m(C3615f fVar) {
        return fVar instanceof C2749f ? m21893e0((C2749f) fVar, this.f19347h) : fVar instanceof C2755h ? m21893e0(this.f19346g, (C2755h) fVar) : fVar instanceof C2752g ? (C2752g) fVar : (C2752g) fVar.mo12780h(this);
    }

    /* renamed from: g */
    public int mo12778g(C3620i iVar) {
        return iVar instanceof C3603a ? iVar.mo14732f() ? this.f19347h.mo12778g(iVar) : this.f19346g.mo12778g(iVar) : super.mo12778g(iVar);
    }

    /* renamed from: g0 */
    public C2752g mo12804l(C3620i iVar, long j) {
        return iVar instanceof C3603a ? iVar.mo14732f() ? m21893e0(this.f19346g, this.f19347h.mo12804l(iVar, j)) : m21893e0(this.f19346g.mo12856z(iVar, j), this.f19347h) : (C2752g) iVar.mo14735i(this, j);
    }

    /* renamed from: h */
    public C3613d mo12780h(C3613d dVar) {
        return super.mo12780h(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo12883h0(DataOutput dataOutput) {
        this.f19346g.mo12844l0(dataOutput);
        this.f19347h.mo12908S(dataOutput);
    }

    public int hashCode() {
        return this.f19346g.hashCode() ^ this.f19347h.hashCode();
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        return iVar instanceof C3603a ? iVar.mo14729b() || iVar.mo14732f() : iVar != null && iVar.mo14733g(this);
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        return iVar instanceof C3603a ? iVar.mo14732f() ? this.f19347h.mo12782n(iVar) : this.f19346g.mo12782n(iVar) : iVar.mo14730d(this);
    }

    /* renamed from: q */
    public int compareTo(C2860c<?> cVar) {
        return cVar instanceof C2752g ? m21884E((C2752g) cVar) : super.compareTo(cVar);
    }

    /* renamed from: s */
    public boolean mo12887s(C2860c<?> cVar) {
        return cVar instanceof C2752g ? m21884E((C2752g) cVar) > 0 : super.mo12887s(cVar);
    }

    /* renamed from: t */
    public boolean mo12888t(C2860c<?> cVar) {
        return cVar instanceof C2752g ? m21884E((C2752g) cVar) < 0 : super.mo12888t(cVar);
    }

    public String toString() {
        return this.f19346g.toString() + 'T' + this.f19347h.toString();
    }

    /* renamed from: z */
    public C2755h mo12893z() {
        return this.f19347h;
    }
}
