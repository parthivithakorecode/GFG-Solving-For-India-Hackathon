package p065i5;

import java.io.DataInput;
import java.io.DataOutput;
import p058h5.C2749f;
import p058h5.C2755h;
import p080k5.C3334d;
import p087l5.C3603a;
import p087l5.C3615f;
import p087l5.C3619h;
import p087l5.C3620i;
import p087l5.C3630l;
import p087l5.C3631m;
import p087l5.C3632n;

/* renamed from: i5.s */
public final class C2886s extends C2856a<C2886s> {

    /* renamed from: g */
    private final C2749f f19627g;

    /* renamed from: i5.s$a */
    static /* synthetic */ class C2887a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19628a;

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
                l5.a[] r0 = p087l5.C3603a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19628a = r0
                l5.a r1 = p087l5.C3603a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19628a     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.a r1 = p087l5.C3603a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19628a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l5.a r1 = p087l5.C3603a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f19628a     // Catch:{ NoSuchFieldError -> 0x0033 }
                l5.a r1 = p087l5.C3603a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f19628a     // Catch:{ NoSuchFieldError -> 0x003e }
                l5.a r1 = p087l5.C3603a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f19628a     // Catch:{ NoSuchFieldError -> 0x0049 }
                l5.a r1 = p087l5.C3603a.YEAR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f19628a     // Catch:{ NoSuchFieldError -> 0x0054 }
                l5.a r1 = p087l5.C3603a.ERA     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p065i5.C2886s.C2887a.<clinit>():void");
        }
    }

    C2886s(C2749f fVar) {
        C3334d.m24473i(fVar, "date");
        this.f19627g = fVar;
    }

    /* renamed from: G */
    private long m22664G() {
        return ((((long) m22665H()) * 12) + ((long) this.f19627g.mo12821K())) - 1;
    }

    /* renamed from: H */
    private int m22665H() {
        return this.f19627g.mo12822M() - 1911;
    }

    /* renamed from: O */
    static C2858b m22666O(DataInput dataInput) {
        return C2884r.f19625j.mo13189t(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    /* renamed from: P */
    private C2886s m22667P(C2749f fVar) {
        return fVar.equals(this.f19627g) ? this : new C2886s(fVar);
    }

    private Object writeReplace() {
        return new C2889u((byte) 5, this);
    }

    /* renamed from: E */
    public C2884r mo12847r() {
        return C2884r.f19625j;
    }

    /* renamed from: F */
    public C2888t mo12848s() {
        return (C2888t) super.mo12848s();
    }

    /* renamed from: I */
    public C2886s mo12851u(long j, C3630l lVar) {
        return (C2886s) super.mo12802f(j, lVar);
    }

    /* renamed from: J */
    public C2886s mo12852v(long j, C3630l lVar) {
        return (C2886s) super.mo12852v(j, lVar);
    }

    /* renamed from: K */
    public C2886s mo12853w(C3619h hVar) {
        return (C2886s) super.mo12853w(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public C2886s mo13103B(long j) {
        return m22667P(this.f19627g.mo12831Z(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public C2886s mo13104C(long j) {
        return m22667P(this.f19627g.mo12832a0(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public C2886s mo13105D(long j) {
        return m22667P(this.f19627g.mo12834c0(j));
    }

    /* renamed from: Q */
    public C2886s mo12855y(C3615f fVar) {
        return (C2886s) super.mo12805m(fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r2 != 7) goto L_0x0053;
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p065i5.C2886s mo12856z(p087l5.C3620i r8, long r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p087l5.C3603a
            if (r0 == 0) goto L_0x0094
            r0 = r8
            l5.a r0 = (p087l5.C3603a) r0
            long r1 = r7.mo12777d(r0)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0010
            return r7
        L_0x0010:
            int[] r1 = p065i5.C2886s.C2887a.f19628a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L_0x003a
            r6 = 5
            if (r2 == r6) goto L_0x0025
            if (r2 == r4) goto L_0x003a
            if (r2 == r3) goto L_0x003a
            goto L_0x0053
        L_0x0025:
            i5.r r8 = r7.mo12847r()
            l5.n r8 = r8.mo13192w(r0)
            r8.mo14756b(r9, r0)
            long r0 = r7.m22664G()
            long r9 = r9 - r0
            i5.s r8 = r7.mo13104C(r9)
            return r8
        L_0x003a:
            i5.r r2 = r7.mo12847r()
            l5.n r2 = r2.mo13192w(r0)
            int r2 = r2.mo14755a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r5) goto L_0x007d
            if (r0 == r4) goto L_0x0070
            if (r0 == r3) goto L_0x005e
        L_0x0053:
            h5.f r0 = r7.f19627g
            h5.f r8 = r0.mo12856z(r8, r9)
            i5.s r8 = r7.m22667P(r8)
            return r8
        L_0x005e:
            h5.f r8 = r7.f19627g
            int r9 = r7.m22665H()
            int r1 = r1 - r9
            int r1 = r1 + 1911
            h5.f r8 = r8.mo12843k0(r1)
            i5.s r8 = r7.m22667P(r8)
            return r8
        L_0x0070:
            h5.f r8 = r7.f19627g
            int r2 = r2 + 1911
            h5.f r8 = r8.mo12843k0(r2)
            i5.s r8 = r7.m22667P(r8)
            return r8
        L_0x007d:
            h5.f r8 = r7.f19627g
            int r9 = r7.m22665H()
            if (r9 < r1) goto L_0x0088
            int r2 = r2 + 1911
            goto L_0x008b
        L_0x0088:
            int r1 = r1 - r2
            int r2 = r1 + 1911
        L_0x008b:
            h5.f r8 = r8.mo12843k0(r2)
            i5.s r8 = r7.m22667P(r8)
            return r8
        L_0x0094:
            l5.d r8 = r8.mo14735i(r7, r9)
            i5.s r8 = (p065i5.C2886s) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p065i5.C2886s.mo12856z(l5.i, long):i5.s");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo13203S(DataOutput dataOutput) {
        dataOutput.writeInt(mo12778g(C3603a.YEAR));
        dataOutput.writeByte(mo12778g(C3603a.MONTH_OF_YEAR));
        dataOutput.writeByte(mo12778g(C3603a.DAY_OF_MONTH));
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14736j(this);
        }
        int i = C2887a.f19628a[((C3603a) iVar).ordinal()];
        int i2 = 1;
        if (i == 4) {
            int H = m22665H();
            if (H < 1) {
                H = 1 - H;
            }
            return (long) H;
        } else if (i == 5) {
            return m22664G();
        } else {
            if (i == 6) {
                return (long) m22665H();
            }
            if (i != 7) {
                return this.f19627g.mo12777d(iVar);
            }
            if (m22665H() < 1) {
                i2 = 0;
            }
            return (long) i2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2886s) {
            return this.f19627g.equals(((C2886s) obj).f19627g);
        }
        return false;
    }

    public int hashCode() {
        return mo12847r().mo13136k().hashCode() ^ this.f19627g.hashCode();
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14730d(this);
        }
        if (mo12781j(iVar)) {
            C3603a aVar = (C3603a) iVar;
            int i = C2887a.f19628a[aVar.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return this.f19627g.mo12782n(iVar);
            }
            if (i != 4) {
                return mo12847r().mo13192w(aVar);
            }
            C3632n h = C3603a.YEAR.mo14734h();
            return C3632n.m25183i(1, m22665H() <= 0 ? (-h.mo14758d()) + 1 + 1911 : h.mo14757c() - 1911);
        }
        throw new C3631m("Unsupported field: " + iVar);
    }

    /* renamed from: p */
    public final C2860c<C2886s> mo12845p(C2755h hVar) {
        return super.mo12845p(hVar);
    }

    /* renamed from: x */
    public long mo12854x() {
        return this.f19627g.mo12854x();
    }
}
