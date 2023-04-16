package p058h5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import p065i5.C2870h;
import p065i5.C2877m;
import p073j5.C3250b;
import p073j5.C3253c;
import p073j5.C3280j;
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
import p087l5.C3631m;
import p087l5.C3632n;

/* renamed from: h5.p */
public final class C2775p extends C3333c implements C3613d, C3615f, Comparable<C2775p>, Serializable {

    /* renamed from: h */
    public static final C3629k<C2775p> f19406h = new C2776a();

    /* renamed from: i */
    private static final C3250b f19407i = new C3253c().mo14193l(C3603a.YEAR, 4, 10, C3280j.EXCEEDS_PAD).mo14187e('-').mo14192k(C3603a.MONTH_OF_YEAR, 2).mo14200s();

    /* renamed from: f */
    private final int f19408f;

    /* renamed from: g */
    private final int f19409g;

    /* renamed from: h5.p$a */
    class C2776a implements C3629k<C2775p> {
        C2776a() {
        }

        /* renamed from: b */
        public C2775p mo12783a(C3614e eVar) {
            return C2775p.m22096p(eVar);
        }
    }

    /* renamed from: h5.p$b */
    static /* synthetic */ class C2777b {

        /* renamed from: a */
        static final /* synthetic */ int[] f19410a;

        /* renamed from: b */
        static final /* synthetic */ int[] f19411b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0078 */
        static {
            /*
                l5.b[] r0 = p087l5.C3604b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19411b = r0
                r1 = 1
                l5.b r2 = p087l5.C3604b.MONTHS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f19411b     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.b r3 = p087l5.C3604b.YEARS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f19411b     // Catch:{ NoSuchFieldError -> 0x0028 }
                l5.b r4 = p087l5.C3604b.DECADES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f19411b     // Catch:{ NoSuchFieldError -> 0x0033 }
                l5.b r5 = p087l5.C3604b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f19411b     // Catch:{ NoSuchFieldError -> 0x003e }
                l5.b r6 = p087l5.C3604b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = f19411b     // Catch:{ NoSuchFieldError -> 0x0049 }
                l5.b r6 = p087l5.C3604b.ERAS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                l5.a[] r5 = p087l5.C3603a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f19410a = r5
                l5.a r6 = p087l5.C3603a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x005a }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = f19410a     // Catch:{ NoSuchFieldError -> 0x0064 }
                l5.a r5 = p087l5.C3603a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = f19410a     // Catch:{ NoSuchFieldError -> 0x006e }
                l5.a r1 = p087l5.C3603a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f19410a     // Catch:{ NoSuchFieldError -> 0x0078 }
                l5.a r1 = p087l5.C3603a.YEAR     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f19410a     // Catch:{ NoSuchFieldError -> 0x0082 }
                l5.a r1 = p087l5.C3603a.ERA     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p058h5.C2775p.C2777b.<clinit>():void");
        }
    }

    private C2775p(int i, int i2) {
        this.f19408f = i;
        this.f19409g = i2;
    }

    /* renamed from: p */
    public static C2775p m22096p(C3614e eVar) {
        if (eVar instanceof C2775p) {
            return (C2775p) eVar;
        }
        try {
            if (!C2877m.f19602j.equals(C2870h.m22476i(eVar))) {
                eVar = C2749f.m21824D(eVar);
            }
            return m22098t(eVar.mo12778g(C3603a.YEAR), eVar.mo12778g(C3603a.MONTH_OF_YEAR));
        } catch (C2742b unused) {
            throw new C2742b("Unable to obtain YearMonth from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    /* renamed from: q */
    private long m22097q() {
        return (((long) this.f19408f) * 12) + ((long) (this.f19409g - 1));
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: t */
    public static C2775p m22098t(int i, int i2) {
        C3603a.YEAR.mo14738l((long) i);
        C3603a.MONTH_OF_YEAR.mo14738l((long) i2);
        return new C2775p(i, i2);
    }

    private Object writeReplace() {
        return new C2771n((byte) 68, this);
    }

    /* renamed from: x */
    static C2775p m22099x(DataInput dataInput) {
        return m22098t(dataInput.readInt(), dataInput.readByte());
    }

    /* renamed from: y */
    private C2775p m22100y(int i, int i2) {
        return (this.f19408f == i && this.f19409g == i2) ? this : new C2775p(i, i2);
    }

    /* renamed from: A */
    public C2775p mo12804l(C3620i iVar, long j) {
        if (!(iVar instanceof C3603a)) {
            return (C2775p) iVar.mo14735i(this, j);
        }
        C3603a aVar = (C3603a) iVar;
        aVar.mo14738l(j);
        int i = C2777b.f19410a[aVar.ordinal()];
        if (i == 1) {
            return mo12987B((int) j);
        }
        if (i == 2) {
            return mo12998v(j - mo12777d(C3603a.PROLEPTIC_MONTH));
        }
        if (i == 3) {
            if (this.f19408f < 1) {
                j = 1 - j;
            }
            return mo12988C((int) j);
        } else if (i == 4) {
            return mo12988C((int) j);
        } else {
            if (i == 5) {
                return mo12777d(C3603a.ERA) == j ? this : mo12988C(1 - this.f19408f);
            }
            throw new C3631m("Unsupported field: " + iVar);
        }
    }

    /* renamed from: B */
    public C2775p mo12987B(int i) {
        C3603a.MONTH_OF_YEAR.mo14738l((long) i);
        return m22100y(this.f19408f, i);
    }

    /* renamed from: C */
    public C2775p mo12988C(int i) {
        C3603a.YEAR.mo14738l((long) i);
        return m22100y(i, this.f19409g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo12989D(DataOutput dataOutput) {
        dataOutput.writeInt(this.f19408f);
        dataOutput.writeByte(this.f19409g);
    }

    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        if (kVar == C3621j.m25159a()) {
            return C2877m.f19602j;
        }
        if (kVar == C3621j.m25163e()) {
            return C3604b.MONTHS;
        }
        if (kVar == C3621j.m25160b() || kVar == C3621j.m25161c() || kVar == C3621j.m25164f() || kVar == C3621j.m25165g() || kVar == C3621j.m25162d()) {
            return null;
        }
        return super.mo12776b(kVar);
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        int i;
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14736j(this);
        }
        int i2 = C2777b.f19410a[((C3603a) iVar).ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i = this.f19409g;
        } else if (i2 == 2) {
            return m22097q();
        } else {
            if (i2 == 3) {
                int i4 = this.f19408f;
                if (i4 < 1) {
                    i4 = 1 - i4;
                }
                return (long) i4;
            } else if (i2 == 4) {
                i = this.f19408f;
            } else if (i2 == 5) {
                if (this.f19408f < 1) {
                    i3 = 0;
                }
                return (long) i3;
            } else {
                throw new C3631m("Unsupported field: " + iVar);
            }
        }
        return (long) i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2775p)) {
            return false;
        }
        C2775p pVar = (C2775p) obj;
        return this.f19408f == pVar.f19408f && this.f19409g == pVar.f19409g;
    }

    /* renamed from: g */
    public int mo12778g(C3620i iVar) {
        return mo12782n(iVar).mo14755a(mo12777d(iVar), iVar);
    }

    /* renamed from: h */
    public C3613d mo12780h(C3613d dVar) {
        if (C2870h.m22476i(dVar).equals(C2877m.f19602j)) {
            return dVar.mo12804l(C3603a.PROLEPTIC_MONTH, m22097q());
        }
        throw new C2742b("Adjustment only supported on ISO date-time");
    }

    public int hashCode() {
        return this.f19408f ^ (this.f19409g << 27);
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        return iVar instanceof C3603a ? iVar == C3603a.YEAR || iVar == C3603a.MONTH_OF_YEAR || iVar == C3603a.PROLEPTIC_MONTH || iVar == C3603a.YEAR_OF_ERA || iVar == C3603a.ERA : iVar != null && iVar.mo14733g(this);
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        if (iVar != C3603a.YEAR_OF_ERA) {
            return super.mo12782n(iVar);
        }
        return C3632n.m25183i(1, mo12994r() <= 0 ? 1000000000 : 999999999);
    }

    /* renamed from: o */
    public int compareTo(C2775p pVar) {
        int i = this.f19408f - pVar.f19408f;
        return i == 0 ? this.f19409g - pVar.f19409g : i;
    }

    /* renamed from: r */
    public int mo12994r() {
        return this.f19408f;
    }

    /* renamed from: s */
    public C2775p mo12802f(long j, C3630l lVar) {
        return j == Long.MIN_VALUE ? mo12800e(Long.MAX_VALUE, lVar).mo12800e(1, lVar) : mo12800e(-j, lVar);
    }

    public String toString() {
        int i;
        int abs = Math.abs(this.f19408f);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            int i2 = this.f19408f;
            if (i2 < 0) {
                sb.append(i2 - 10000);
                i = 1;
            } else {
                sb.append(i2 + 10000);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            sb.append(this.f19408f);
        }
        sb.append(this.f19409g < 10 ? "-0" : "-");
        sb.append(this.f19409g);
        return sb.toString();
    }

    /* renamed from: u */
    public C2775p mo12800e(long j, C3630l lVar) {
        if (!(lVar instanceof C3604b)) {
            return (C2775p) lVar.mo14741d(this, j);
        }
        switch (C2777b.f19411b[((C3604b) lVar).ordinal()]) {
            case 1:
                return mo12998v(j);
            case 2:
                return mo12999w(j);
            case 3:
                return mo12999w(C3334d.m24476l(j, 10));
            case 4:
                return mo12999w(C3334d.m24476l(j, 100));
            case 5:
                return mo12999w(C3334d.m24476l(j, 1000));
            case 6:
                C3603a aVar = C3603a.ERA;
                return mo12804l(aVar, C3334d.m24475k(mo12777d(aVar), j));
            default:
                throw new C3631m("Unsupported unit: " + lVar);
        }
    }

    /* renamed from: v */
    public C2775p mo12998v(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f19408f) * 12) + ((long) (this.f19409g - 1)) + j;
        return m22100y(C3603a.YEAR.mo14737k(C3334d.m24469e(j2, 12)), C3334d.m24471g(j2, 12) + 1);
    }

    /* renamed from: w */
    public C2775p mo12999w(long j) {
        return j == 0 ? this : m22100y(C3603a.YEAR.mo14737k(((long) this.f19408f) + j), this.f19409g);
    }

    /* renamed from: z */
    public C2775p mo12805m(C3615f fVar) {
        return (C2775p) fVar.mo12780h(this);
    }
}
