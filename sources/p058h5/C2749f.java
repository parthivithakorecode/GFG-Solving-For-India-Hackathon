package p058h5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import p065i5.C2858b;
import p065i5.C2872i;
import p065i5.C2877m;
import p080k5.C3334d;
import p087l5.C3603a;
import p087l5.C3604b;
import p087l5.C3613d;
import p087l5.C3614e;
import p087l5.C3615f;
import p087l5.C3619h;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;
import p087l5.C3630l;
import p087l5.C3631m;
import p087l5.C3632n;

/* renamed from: h5.f */
public final class C2749f extends C2858b implements Serializable {

    /* renamed from: j */
    public static final C2749f f19335j = m21827T(-999999999, 1, 1);

    /* renamed from: k */
    public static final C2749f f19336k = m21827T(999999999, 12, 31);

    /* renamed from: l */
    public static final C3629k<C2749f> f19337l = new C2750a();

    /* renamed from: g */
    private final int f19338g;

    /* renamed from: h */
    private final short f19339h;

    /* renamed from: i */
    private final short f19340i;

    /* renamed from: h5.f$a */
    class C2750a implements C3629k<C2749f> {
        C2750a() {
        }

        /* renamed from: b */
        public C2749f mo12783a(C3614e eVar) {
            return C2749f.m21824D(eVar);
        }
    }

    /* renamed from: h5.f$b */
    static /* synthetic */ class C2751b {

        /* renamed from: a */
        static final /* synthetic */ int[] f19341a;

        /* renamed from: b */
        static final /* synthetic */ int[] f19342b;

        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00b7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00c3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00cf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00db */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e7 */
        static {
            /*
                l5.b[] r0 = p087l5.C3604b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19342b = r0
                r1 = 1
                l5.b r2 = p087l5.C3604b.DAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f19342b     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.b r3 = p087l5.C3604b.WEEKS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f19342b     // Catch:{ NoSuchFieldError -> 0x0028 }
                l5.b r4 = p087l5.C3604b.MONTHS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f19342b     // Catch:{ NoSuchFieldError -> 0x0033 }
                l5.b r5 = p087l5.C3604b.YEARS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f19342b     // Catch:{ NoSuchFieldError -> 0x003e }
                l5.b r6 = p087l5.C3604b.DECADES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f19342b     // Catch:{ NoSuchFieldError -> 0x0049 }
                l5.b r7 = p087l5.C3604b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f19342b     // Catch:{ NoSuchFieldError -> 0x0054 }
                l5.b r8 = p087l5.C3604b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f19342b     // Catch:{ NoSuchFieldError -> 0x0060 }
                l5.b r9 = p087l5.C3604b.ERAS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                l5.a[] r8 = p087l5.C3603a.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                f19341a = r8
                l5.a r9 = p087l5.C3603a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r1 = f19341a     // Catch:{ NoSuchFieldError -> 0x007b }
                l5.a r8 = p087l5.C3603a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x007b }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r1[r8] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = f19341a     // Catch:{ NoSuchFieldError -> 0x0085 }
                l5.a r1 = p087l5.C3603a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r0 = f19341a     // Catch:{ NoSuchFieldError -> 0x008f }
                l5.a r1 = p087l5.C3603a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f19341a     // Catch:{ NoSuchFieldError -> 0x0099 }
                l5.a r1 = p087l5.C3603a.DAY_OF_WEEK     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = f19341a     // Catch:{ NoSuchFieldError -> 0x00a3 }
                l5.a r1 = p087l5.C3603a.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                int[] r0 = f19341a     // Catch:{ NoSuchFieldError -> 0x00ad }
                l5.a r1 = p087l5.C3603a.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r0 = f19341a     // Catch:{ NoSuchFieldError -> 0x00b7 }
                l5.a r1 = p087l5.C3603a.EPOCH_DAY     // Catch:{ NoSuchFieldError -> 0x00b7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00b7 }
            L_0x00b7:
                int[] r0 = f19341a     // Catch:{ NoSuchFieldError -> 0x00c3 }
                l5.a r1 = p087l5.C3603a.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                int[] r0 = f19341a     // Catch:{ NoSuchFieldError -> 0x00cf }
                l5.a r1 = p087l5.C3603a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x00cf }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cf }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cf }
            L_0x00cf:
                int[] r0 = f19341a     // Catch:{ NoSuchFieldError -> 0x00db }
                l5.a r1 = p087l5.C3603a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x00db }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00db }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00db }
            L_0x00db:
                int[] r0 = f19341a     // Catch:{ NoSuchFieldError -> 0x00e7 }
                l5.a r1 = p087l5.C3603a.YEAR     // Catch:{ NoSuchFieldError -> 0x00e7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e7 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e7 }
            L_0x00e7:
                int[] r0 = f19341a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                l5.a r1 = p087l5.C3603a.ERA     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p058h5.C2749f.C2751b.<clinit>():void");
        }
    }

    private C2749f(int i, int i2, int i3) {
        this.f19338g = i;
        this.f19339h = (short) i2;
        this.f19340i = (short) i3;
    }

    /* renamed from: C */
    private static C2749f m21823C(int i, C2758i iVar, int i2) {
        if (i2 <= 28 || i2 <= iVar.mo12923o(C2877m.f19602j.mo13165v((long) i))) {
            return new C2749f(i, iVar.getValue(), i2);
        }
        if (i2 == 29) {
            throw new C2742b("Invalid date 'February 29' as '" + i + "' is not a leap year");
        }
        throw new C2742b("Invalid date '" + iVar.name() + " " + i2 + "'");
    }

    /* renamed from: D */
    public static C2749f m21824D(C3614e eVar) {
        C2749f fVar = (C2749f) eVar.mo12776b(C3621j.m25160b());
        if (fVar != null) {
            return fVar;
        }
        throw new C2742b("Unable to obtain LocalDate from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    /* renamed from: E */
    private int m21825E(C3620i iVar) {
        switch (C2751b.f19341a[((C3603a) iVar).ordinal()]) {
            case 1:
                return this.f19340i;
            case 2:
                return mo12819I();
            case 3:
                return ((this.f19340i - 1) / 7) + 1;
            case 4:
                int i = this.f19338g;
                return i >= 1 ? i : 1 - i;
            case 5:
                return mo12818H().getValue();
            case 6:
                return ((this.f19340i - 1) % 7) + 1;
            case 7:
                return ((mo12819I() - 1) % 7) + 1;
            case 8:
                throw new C2742b("Field too large for an int: " + iVar);
            case 9:
                return ((mo12819I() - 1) / 7) + 1;
            case 10:
                return this.f19339h;
            case 11:
                throw new C2742b("Field too large for an int: " + iVar);
            case 12:
                return this.f19338g;
            case 13:
                return this.f19338g >= 1 ? 1 : 0;
            default:
                throw new C3631m("Unsupported field: " + iVar);
        }
    }

    /* renamed from: L */
    private long m21826L() {
        return (((long) this.f19338g) * 12) + ((long) (this.f19339h - 1));
    }

    /* renamed from: T */
    public static C2749f m21827T(int i, int i2, int i3) {
        C3603a.YEAR.mo14738l((long) i);
        C3603a.MONTH_OF_YEAR.mo14738l((long) i2);
        C3603a.DAY_OF_MONTH.mo14738l((long) i3);
        return m21823C(i, C2758i.m21982r(i2), i3);
    }

    /* renamed from: U */
    public static C2749f m21828U(int i, C2758i iVar, int i2) {
        C3603a.YEAR.mo14738l((long) i);
        C3334d.m24473i(iVar, "month");
        C3603a.DAY_OF_MONTH.mo14738l((long) i2);
        return m21823C(i, iVar, i2);
    }

    /* renamed from: V */
    public static C2749f m21829V(long j) {
        long j2;
        long j3 = j;
        C3603a.EPOCH_DAY.mo14738l(j3);
        long j4 = (j3 + 719528) - 60;
        if (j4 < 0) {
            long j5 = ((j4 + 1) / 146097) - 1;
            j2 = j5 * 400;
            j4 += (-j5) * 146097;
        } else {
            j2 = 0;
        }
        long j6 = ((j4 * 400) + 591) / 146097;
        long j7 = j4 - ((((j6 * 365) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
        if (j7 < 0) {
            j6--;
            j7 = j4 - ((((365 * j6) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
        }
        int i = (int) j7;
        int i2 = ((i * 5) + 2) / 153;
        return new C2749f(C3603a.YEAR.mo14737k(j6 + j2 + ((long) (i2 / 10))), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    /* renamed from: W */
    public static C2749f m21830W(int i, int i2) {
        long j = (long) i;
        C3603a.YEAR.mo14738l(j);
        C3603a.DAY_OF_YEAR.mo14738l((long) i2);
        boolean v = C2877m.f19602j.mo13165v(j);
        if (i2 != 366 || v) {
            C2758i r = C2758i.m21982r(((i2 - 1) / 31) + 1);
            if (i2 > (r.mo12922i(v) + r.mo12923o(v)) - 1) {
                r = r.mo12926s(1);
            }
            return m21823C(i, r, (i2 - r.mo12922i(v)) + 1);
        }
        throw new C2742b("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
    }

    /* renamed from: d0 */
    static C2749f m21831d0(DataInput dataInput) {
        return m21827T(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    /* renamed from: e0 */
    private static C2749f m21832e0(int i, int i2, int i3) {
        int i4;
        if (i2 != 2) {
            if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i4 = 30;
            }
            return m21827T(i, i2, i3);
        }
        i4 = C2877m.f19602j.mo13165v((long) i) ? 29 : 28;
        i3 = Math.min(i3, i4);
        return m21827T(i, i2, i3);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C2771n((byte) 3, this);
    }

    /* renamed from: A */
    public C2752g mo12845p(C2755h hVar) {
        return C2752g.m21887Q(this, hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int mo12815B(C2749f fVar) {
        int i = this.f19338g - fVar.f19338g;
        if (i != 0) {
            return i;
        }
        int i2 = this.f19339h - fVar.f19339h;
        return i2 == 0 ? this.f19340i - fVar.f19340i : i2;
    }

    /* renamed from: F */
    public C2877m mo12847r() {
        return C2877m.f19602j;
    }

    /* renamed from: G */
    public int mo12817G() {
        return this.f19340i;
    }

    /* renamed from: H */
    public C2743c mo12818H() {
        return C2743c.m21774k(C3334d.m24471g(mo12854x() + 3, 7) + 1);
    }

    /* renamed from: I */
    public int mo12819I() {
        return (mo12820J().mo12922i(mo12823N()) + this.f19340i) - 1;
    }

    /* renamed from: J */
    public C2758i mo12820J() {
        return C2758i.m21982r(this.f19339h);
    }

    /* renamed from: K */
    public int mo12821K() {
        return this.f19339h;
    }

    /* renamed from: M */
    public int mo12822M() {
        return this.f19338g;
    }

    /* renamed from: N */
    public boolean mo12823N() {
        return C2877m.f19602j.mo13165v((long) this.f19338g);
    }

    /* renamed from: O */
    public int mo12824O() {
        short s = this.f19339h;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : mo12823N() ? 29 : 28;
    }

    /* renamed from: P */
    public int mo12825P() {
        return mo12823N() ? 366 : 365;
    }

    /* renamed from: Q */
    public C2749f mo12851u(long j, C3630l lVar) {
        return j == Long.MIN_VALUE ? mo12852v(Long.MAX_VALUE, lVar).mo12852v(1, lVar) : mo12852v(-j, lVar);
    }

    /* renamed from: R */
    public C2749f mo12827R(long j) {
        return j == Long.MIN_VALUE ? mo12831Z(Long.MAX_VALUE).mo12831Z(1) : mo12831Z(-j);
    }

    /* renamed from: S */
    public C2749f mo12828S(long j) {
        return j == Long.MIN_VALUE ? mo12834c0(Long.MAX_VALUE).mo12834c0(1) : mo12834c0(-j);
    }

    /* renamed from: X */
    public C2749f mo12852v(long j, C3630l lVar) {
        if (!(lVar instanceof C3604b)) {
            return (C2749f) lVar.mo14741d(this, j);
        }
        switch (C2751b.f19342b[((C3604b) lVar).ordinal()]) {
            case 1:
                return mo12831Z(j);
            case 2:
                return mo12833b0(j);
            case 3:
                return mo12832a0(j);
            case 4:
                return mo12834c0(j);
            case 5:
                return mo12834c0(C3334d.m24476l(j, 10));
            case 6:
                return mo12834c0(C3334d.m24476l(j, 100));
            case 7:
                return mo12834c0(C3334d.m24476l(j, 1000));
            case 8:
                C3603a aVar = C3603a.ERA;
                return mo12856z(aVar, C3334d.m24475k(mo12777d(aVar), j));
            default:
                throw new C3631m("Unsupported unit: " + lVar);
        }
    }

    /* renamed from: Y */
    public C2749f mo12853w(C3619h hVar) {
        return (C2749f) hVar.mo12785b(this);
    }

    /* renamed from: Z */
    public C2749f mo12831Z(long j) {
        return j == 0 ? this : m21829V(C3334d.m24475k(mo12854x(), j));
    }

    /* renamed from: a0 */
    public C2749f mo12832a0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.f19338g) * 12) + ((long) (this.f19339h - 1)) + j;
        return m21832e0(C3603a.YEAR.mo14737k(C3334d.m24469e(j2, 12)), C3334d.m24471g(j2, 12) + 1, this.f19340i);
    }

    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        return kVar == C3621j.m25160b() ? this : super.mo12776b(kVar);
    }

    /* renamed from: b0 */
    public C2749f mo12833b0(long j) {
        return mo12831Z(C3334d.m24476l(j, 7));
    }

    /* renamed from: c0 */
    public C2749f mo12834c0(long j) {
        return j == 0 ? this : m21832e0(C3603a.YEAR.mo14737k(((long) this.f19338g) + j), this.f19339h, this.f19340i);
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        return iVar instanceof C3603a ? iVar == C3603a.EPOCH_DAY ? mo12854x() : iVar == C3603a.PROLEPTIC_MONTH ? m21826L() : (long) m21825E(iVar) : iVar.mo14736j(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2749f) {
            return mo12815B((C2749f) obj) == 0;
        }
        return false;
    }

    /* renamed from: f0 */
    public C2749f mo12855y(C3615f fVar) {
        return fVar instanceof C2749f ? (C2749f) fVar : (C2749f) fVar.mo12780h(this);
    }

    /* renamed from: g */
    public int mo12778g(C3620i iVar) {
        return iVar instanceof C3603a ? m21825E(iVar) : super.mo12778g(iVar);
    }

    /* renamed from: g0 */
    public C2749f mo12856z(C3620i iVar, long j) {
        if (!(iVar instanceof C3603a)) {
            return (C2749f) iVar.mo14735i(this, j);
        }
        C3603a aVar = (C3603a) iVar;
        aVar.mo14738l(j);
        switch (C2751b.f19341a[aVar.ordinal()]) {
            case 1:
                return mo12839h0((int) j);
            case 2:
                return mo12841i0((int) j);
            case 3:
                return mo12833b0(j - mo12777d(C3603a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f19338g < 1) {
                    j = 1 - j;
                }
                return mo12843k0((int) j);
            case 5:
                return mo12831Z(j - ((long) mo12818H().getValue()));
            case 6:
                return mo12831Z(j - mo12777d(C3603a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return mo12831Z(j - mo12777d(C3603a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return m21829V(j);
            case 9:
                return mo12833b0(j - mo12777d(C3603a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                return mo12842j0((int) j);
            case 11:
                return mo12832a0(j - mo12777d(C3603a.PROLEPTIC_MONTH));
            case 12:
                return mo12843k0((int) j);
            case 13:
                return mo12777d(C3603a.ERA) == j ? this : mo12843k0(1 - this.f19338g);
            default:
                throw new C3631m("Unsupported field: " + iVar);
        }
    }

    /* renamed from: h */
    public C3613d mo12780h(C3613d dVar) {
        return super.mo12780h(dVar);
    }

    /* renamed from: h0 */
    public C2749f mo12839h0(int i) {
        return this.f19340i == i ? this : m21827T(this.f19338g, this.f19339h, i);
    }

    public int hashCode() {
        int i = this.f19338g;
        return (((i << 11) + (this.f19339h << 6)) + this.f19340i) ^ (i & -2048);
    }

    /* renamed from: i0 */
    public C2749f mo12841i0(int i) {
        return mo12819I() == i ? this : m21830W(this.f19338g, i);
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        return super.mo12781j(iVar);
    }

    /* renamed from: j0 */
    public C2749f mo12842j0(int i) {
        if (this.f19339h == i) {
            return this;
        }
        C3603a.MONTH_OF_YEAR.mo14738l((long) i);
        return m21832e0(this.f19338g, i, this.f19340i);
    }

    /* renamed from: k0 */
    public C2749f mo12843k0(int i) {
        if (this.f19338g == i) {
            return this;
        }
        C3603a.YEAR.mo14738l((long) i);
        return m21832e0(i, this.f19339h, this.f19340i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void mo12844l0(DataOutput dataOutput) {
        dataOutput.writeInt(this.f19338g);
        dataOutput.writeByte(this.f19339h);
        dataOutput.writeByte(this.f19340i);
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        int O;
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14730d(this);
        }
        C3603a aVar = (C3603a) iVar;
        if (aVar.mo14729b()) {
            int i = C2751b.f19341a[aVar.ordinal()];
            if (i == 1) {
                O = mo12824O();
            } else if (i == 2) {
                O = mo12825P();
            } else if (i == 3) {
                return C3632n.m25183i(1, (mo12820J() != C2758i.FEBRUARY || mo12823N()) ? 5 : 4);
            } else if (i != 4) {
                return iVar.mo14734h();
            } else {
                return C3632n.m25183i(1, mo12822M() <= 0 ? 1000000000 : 999999999);
            }
            return C3632n.m25183i(1, (long) O);
        }
        throw new C3631m("Unsupported field: " + iVar);
    }

    /* renamed from: q */
    public int compareTo(C2858b bVar) {
        return bVar instanceof C2749f ? mo12815B((C2749f) bVar) : super.compareTo(bVar);
    }

    /* renamed from: s */
    public C2872i mo12848s() {
        return super.mo12848s();
    }

    /* renamed from: t */
    public boolean mo12849t(C2858b bVar) {
        return bVar instanceof C2749f ? mo12815B((C2749f) bVar) < 0 : super.mo12849t(bVar);
    }

    public String toString() {
        int i;
        int i2 = this.f19338g;
        short s = this.f19339h;
        short s2 = this.f19340i;
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i2 < 0) {
                sb.append(i2 - 10000);
                i = 1;
            } else {
                sb.append(i2 + 10000);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        }
        String str = "-0";
        sb.append(s < 10 ? str : "-");
        sb.append(s);
        if (s2 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append(s2);
        return sb.toString();
    }

    /* renamed from: x */
    public long mo12854x() {
        long j = (long) this.f19338g;
        long j2 = (long) this.f19339h;
        long j3 = (365 * j) + 0;
        long j4 = (j >= 0 ? j3 + (((3 + j) / 4) - ((99 + j) / 100)) + ((j + 399) / 400) : j3 - (((j / -4) - (j / -100)) + (j / -400))) + (((367 * j2) - 362) / 12) + ((long) (this.f19340i - 1));
        if (j2 > 2) {
            j4--;
            if (!mo12823N()) {
                j4--;
            }
        }
        return j4 - 719528;
    }
}
