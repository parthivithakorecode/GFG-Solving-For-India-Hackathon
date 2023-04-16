package p058h5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import p073j5.C3250b;
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

/* renamed from: h5.e */
public final class C2746e extends C3333c implements C3613d, C3615f, Comparable<C2746e>, Serializable {

    /* renamed from: h */
    public static final C2746e f19327h = new C2746e(0, 0);

    /* renamed from: i */
    public static final C2746e f19328i = m21797w(-31557014167219200L, 0);

    /* renamed from: j */
    public static final C2746e f19329j = m21797w(31556889864403199L, 999999999);

    /* renamed from: k */
    public static final C3629k<C2746e> f19330k = new C2747a();

    /* renamed from: f */
    private final long f19331f;

    /* renamed from: g */
    private final int f19332g;

    /* renamed from: h5.e$a */
    class C2747a implements C3629k<C2746e> {
        C2747a() {
        }

        /* renamed from: b */
        public C2746e mo12783a(C3614e eVar) {
            return C2746e.m21794q(eVar);
        }
    }

    /* renamed from: h5.e$b */
    static /* synthetic */ class C2748b {

        /* renamed from: a */
        static final /* synthetic */ int[] f19333a;

        /* renamed from: b */
        static final /* synthetic */ int[] f19334b;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0085 */
        static {
            /*
                l5.b[] r0 = p087l5.C3604b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19334b = r0
                r1 = 1
                l5.b r2 = p087l5.C3604b.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f19334b     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.b r3 = p087l5.C3604b.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f19334b     // Catch:{ NoSuchFieldError -> 0x0028 }
                l5.b r4 = p087l5.C3604b.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f19334b     // Catch:{ NoSuchFieldError -> 0x0033 }
                l5.b r5 = p087l5.C3604b.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r4 = f19334b     // Catch:{ NoSuchFieldError -> 0x003e }
                l5.b r5 = p087l5.C3604b.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r4 = f19334b     // Catch:{ NoSuchFieldError -> 0x0049 }
                l5.b r5 = p087l5.C3604b.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r4 = f19334b     // Catch:{ NoSuchFieldError -> 0x0054 }
                l5.b r5 = p087l5.C3604b.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r6 = 7
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r4 = f19334b     // Catch:{ NoSuchFieldError -> 0x0060 }
                l5.b r5 = p087l5.C3604b.DAYS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r6 = 8
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                l5.a[] r4 = p087l5.C3603a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f19333a = r4
                l5.a r5 = p087l5.C3603a.NANO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r1 = f19333a     // Catch:{ NoSuchFieldError -> 0x007b }
                l5.a r4 = p087l5.C3603a.MICRO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x007b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = f19333a     // Catch:{ NoSuchFieldError -> 0x0085 }
                l5.a r1 = p087l5.C3603a.MILLI_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r0 = f19333a     // Catch:{ NoSuchFieldError -> 0x008f }
                l5.a r1 = p087l5.C3603a.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p058h5.C2746e.C2748b.<clinit>():void");
        }
    }

    private C2746e(long j, int i) {
        this.f19331f = j;
        this.f19332g = i;
    }

    /* renamed from: C */
    static C2746e m21792C(DataInput dataInput) {
        return m21797w(dataInput.readLong(), (long) dataInput.readInt());
    }

    /* renamed from: p */
    private static C2746e m21793p(long j, int i) {
        if ((((long) i) | j) == 0) {
            return f19327h;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new C2746e(j, i);
        }
        throw new C2742b("Instant exceeds minimum or maximum instant");
    }

    /* renamed from: q */
    public static C2746e m21794q(C3614e eVar) {
        try {
            return m21797w(eVar.mo12777d(C3603a.INSTANT_SECONDS), (long) eVar.mo12778g(C3603a.NANO_OF_SECOND));
        } catch (C2742b e) {
            throw new C2742b("Unable to obtain Instant from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e);
        }
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: u */
    public static C2746e m21795u(long j) {
        return m21793p(C3334d.m24469e(j, 1000), C3334d.m24471g(j, 1000) * 1000000);
    }

    /* renamed from: v */
    public static C2746e m21796v(long j) {
        return m21793p(j, 0);
    }

    /* renamed from: w */
    public static C2746e m21797w(long j, long j2) {
        return m21793p(C3334d.m24475k(j, C3334d.m24469e(j2, 1000000000)), C3334d.m24471g(j2, 1000000000));
    }

    private Object writeReplace() {
        return new C2771n((byte) 2, this);
    }

    /* renamed from: x */
    private C2746e m21798x(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return m21797w(C3334d.m24475k(C3334d.m24475k(this.f19331f, j), j2 / 1000000000), ((long) this.f19332g) + (j2 % 1000000000));
    }

    /* renamed from: A */
    public C2746e mo12793A(long j) {
        return m21798x(0, j);
    }

    /* renamed from: B */
    public C2746e mo12794B(long j) {
        return m21798x(j, 0);
    }

    /* renamed from: D */
    public long mo12795D() {
        long j = this.f19331f;
        return j >= 0 ? C3334d.m24475k(C3334d.m24477m(j, 1000), (long) (this.f19332g / 1000000)) : C3334d.m24479o(C3334d.m24477m(j + 1, 1000), 1000 - ((long) (this.f19332g / 1000000)));
    }

    /* renamed from: E */
    public C2746e mo12805m(C3615f fVar) {
        return (C2746e) fVar.mo12780h(this);
    }

    /* renamed from: F */
    public C2746e mo12804l(C3620i iVar, long j) {
        if (!(iVar instanceof C3603a)) {
            return (C2746e) iVar.mo14735i(this, j);
        }
        C3603a aVar = (C3603a) iVar;
        aVar.mo14738l(j);
        int i = C2748b.f19333a[aVar.ordinal()];
        if (i == 1) {
            return j != ((long) this.f19332g) ? m21793p(this.f19331f, (int) j) : this;
        }
        if (i == 2) {
            int i2 = ((int) j) * 1000;
            return i2 != this.f19332g ? m21793p(this.f19331f, i2) : this;
        } else if (i == 3) {
            int i3 = ((int) j) * 1000000;
            return i3 != this.f19332g ? m21793p(this.f19331f, i3) : this;
        } else if (i == 4) {
            return j != this.f19331f ? m21793p(j, this.f19332g) : this;
        } else {
            throw new C3631m("Unsupported field: " + iVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo12798G(DataOutput dataOutput) {
        dataOutput.writeLong(this.f19331f);
        dataOutput.writeInt(this.f19332g);
    }

    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        if (kVar == C3621j.m25163e()) {
            return C3604b.NANOS;
        }
        if (kVar == C3621j.m25160b() || kVar == C3621j.m25161c() || kVar == C3621j.m25159a() || kVar == C3621j.m25165g() || kVar == C3621j.m25164f() || kVar == C3621j.m25162d()) {
            return null;
        }
        return kVar.mo12783a(this);
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        int i;
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14736j(this);
        }
        int i2 = C2748b.f19333a[((C3603a) iVar).ordinal()];
        if (i2 == 1) {
            i = this.f19332g;
        } else if (i2 == 2) {
            i = this.f19332g / 1000;
        } else if (i2 == 3) {
            i = this.f19332g / 1000000;
        } else if (i2 == 4) {
            return this.f19331f;
        } else {
            throw new C3631m("Unsupported field: " + iVar);
        }
        return (long) i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2746e)) {
            return false;
        }
        C2746e eVar = (C2746e) obj;
        return this.f19331f == eVar.f19331f && this.f19332g == eVar.f19332g;
    }

    /* renamed from: g */
    public int mo12778g(C3620i iVar) {
        if (!(iVar instanceof C3603a)) {
            return mo12782n(iVar).mo14755a(iVar.mo14736j(this), iVar);
        }
        int i = C2748b.f19333a[((C3603a) iVar).ordinal()];
        if (i == 1) {
            return this.f19332g;
        }
        if (i == 2) {
            return this.f19332g / 1000;
        }
        if (i == 3) {
            return this.f19332g / 1000000;
        }
        throw new C3631m("Unsupported field: " + iVar);
    }

    /* renamed from: h */
    public C3613d mo12780h(C3613d dVar) {
        return dVar.mo12804l(C3603a.INSTANT_SECONDS, this.f19331f).mo12804l(C3603a.NANO_OF_SECOND, (long) this.f19332g);
    }

    public int hashCode() {
        long j = this.f19331f;
        return ((int) (j ^ (j >>> 32))) + (this.f19332g * 51);
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        return iVar instanceof C3603a ? iVar == C3603a.INSTANT_SECONDS || iVar == C3603a.NANO_OF_SECOND || iVar == C3603a.MICRO_OF_SECOND || iVar == C3603a.MILLI_OF_SECOND : iVar != null && iVar.mo14733g(this);
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        return super.mo12782n(iVar);
    }

    /* renamed from: o */
    public int compareTo(C2746e eVar) {
        int b = C3334d.m24466b(this.f19331f, eVar.f19331f);
        return b != 0 ? b : this.f19332g - eVar.f19332g;
    }

    /* renamed from: r */
    public long mo12807r() {
        return this.f19331f;
    }

    /* renamed from: s */
    public int mo12808s() {
        return this.f19332g;
    }

    /* renamed from: t */
    public C2746e mo12802f(long j, C3630l lVar) {
        return j == Long.MIN_VALUE ? mo12800e(Long.MAX_VALUE, lVar).mo12800e(1, lVar) : mo12800e(-j, lVar);
    }

    public String toString() {
        return C3250b.f20646t.mo14171b(this);
    }

    /* renamed from: y */
    public C2746e mo12800e(long j, C3630l lVar) {
        if (!(lVar instanceof C3604b)) {
            return (C2746e) lVar.mo14741d(this, j);
        }
        switch (C2748b.f19334b[((C3604b) lVar).ordinal()]) {
            case 1:
                return mo12793A(j);
            case 2:
                return m21798x(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return mo12812z(j);
            case 4:
                return mo12794B(j);
            case 5:
                return mo12794B(C3334d.m24476l(j, 60));
            case 6:
                return mo12794B(C3334d.m24476l(j, 3600));
            case 7:
                return mo12794B(C3334d.m24476l(j, 43200));
            case 8:
                return mo12794B(C3334d.m24476l(j, 86400));
            default:
                throw new C3631m("Unsupported unit: " + lVar);
        }
    }

    /* renamed from: z */
    public C2746e mo12812z(long j) {
        return m21798x(j / 1000, (j % 1000) * 1000000);
    }
}
