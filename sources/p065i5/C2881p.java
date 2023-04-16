package p065i5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.ObjectInputStream;
import java.util.Calendar;
import p058h5.C2742b;
import p058h5.C2749f;
import p058h5.C2755h;
import p087l5.C3603a;
import p087l5.C3615f;
import p087l5.C3619h;
import p087l5.C3620i;
import p087l5.C3630l;
import p087l5.C3631m;
import p087l5.C3632n;

/* renamed from: i5.p */
public final class C2881p extends C2856a<C2881p> {

    /* renamed from: j */
    static final C2749f f19612j = C2749f.m21827T(1873, 1, 1);

    /* renamed from: g */
    private final C2749f f19613g;

    /* renamed from: h */
    private transient C2883q f19614h;

    /* renamed from: i */
    private transient int f19615i;

    /* renamed from: i5.p$a */
    static /* synthetic */ class C2882a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19616a;

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
                f19616a = r0
                l5.a r1 = p087l5.C3603a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19616a     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.a r1 = p087l5.C3603a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19616a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l5.a r1 = p087l5.C3603a.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f19616a     // Catch:{ NoSuchFieldError -> 0x0033 }
                l5.a r1 = p087l5.C3603a.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f19616a     // Catch:{ NoSuchFieldError -> 0x003e }
                l5.a r1 = p087l5.C3603a.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f19616a     // Catch:{ NoSuchFieldError -> 0x0049 }
                l5.a r1 = p087l5.C3603a.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f19616a     // Catch:{ NoSuchFieldError -> 0x0054 }
                l5.a r1 = p087l5.C3603a.ERA     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p065i5.C2881p.C2882a.<clinit>():void");
        }
    }

    C2881p(C2749f fVar) {
        if (!fVar.mo12849t(f19612j)) {
            C2883q p = C2883q.m22645p(fVar);
            this.f19614h = p;
            this.f19615i = fVar.mo12822M() - (p.mo13186t().mo12822M() - 1);
            this.f19613g = fVar;
            return;
        }
        throw new C2742b("Minimum supported date is January 1st Meiji 6");
    }

    /* renamed from: E */
    private C3632n m22608E(int i) {
        Calendar instance = Calendar.getInstance(C2879o.f19606j);
        instance.set(0, this.f19614h.getValue() + 2);
        instance.set(this.f19615i, this.f19613g.mo12821K() - 1, this.f19613g.mo12817G());
        return C3632n.m25183i((long) instance.getActualMinimum(i), (long) instance.getActualMaximum(i));
    }

    /* renamed from: G */
    private long m22609G() {
        return (long) (this.f19615i == 1 ? (this.f19613g.mo12819I() - this.f19614h.mo13186t().mo12819I()) + 1 : this.f19613g.mo12819I());
    }

    /* renamed from: O */
    static C2858b m22610O(DataInput dataInput) {
        return C2879o.f19607k.mo13169t(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    /* renamed from: P */
    private C2881p m22611P(C2749f fVar) {
        return fVar.equals(this.f19613g) ? this : new C2881p(fVar);
    }

    /* renamed from: S */
    private C2881p m22612S(int i) {
        return m22613T(mo12848s(), i);
    }

    /* renamed from: T */
    private C2881p m22613T(C2883q qVar, int i) {
        return m22611P(this.f19613g.mo12843k0(C2879o.f19607k.mo13172w(qVar, i)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        C2883q p = C2883q.m22645p(this.f19613g);
        this.f19614h = p;
        this.f19615i = this.f19613g.mo12822M() - (p.mo13186t().mo12822M() - 1);
    }

    private Object writeReplace() {
        return new C2889u((byte) 1, this);
    }

    /* renamed from: F */
    public C2879o mo12847r() {
        return C2879o.f19607k;
    }

    /* renamed from: H */
    public C2883q mo12848s() {
        return this.f19614h;
    }

    /* renamed from: I */
    public C2881p mo12851u(long j, C3630l lVar) {
        return (C2881p) super.mo12802f(j, lVar);
    }

    /* renamed from: J */
    public C2881p mo12852v(long j, C3630l lVar) {
        return (C2881p) super.mo12852v(j, lVar);
    }

    /* renamed from: K */
    public C2881p mo12853w(C3619h hVar) {
        return (C2881p) super.mo12853w(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public C2881p mo13103B(long j) {
        return m22611P(this.f19613g.mo12831Z(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public C2881p mo13104C(long j) {
        return m22611P(this.f19613g.mo12832a0(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public C2881p mo13105D(long j) {
        return m22611P(this.f19613g.mo12834c0(j));
    }

    /* renamed from: Q */
    public C2881p mo12855y(C3615f fVar) {
        return (C2881p) super.mo12805m(fVar);
    }

    /* renamed from: R */
    public C2881p mo12856z(C3620i iVar, long j) {
        if (!(iVar instanceof C3603a)) {
            return (C2881p) iVar.mo14735i(this, j);
        }
        C3603a aVar = (C3603a) iVar;
        if (mo12777d(aVar) == j) {
            return this;
        }
        int[] iArr = C2882a.f19616a;
        int i = iArr[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 7) {
            int a = mo12847r().mo13173x(aVar).mo14755a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 1) {
                return m22611P(this.f19613g.mo12831Z(((long) a) - m22609G()));
            }
            if (i2 == 2) {
                return m22612S(a);
            }
            if (i2 == 7) {
                return m22613T(C2883q.m22646q(a), this.f19615i);
            }
        }
        return m22611P(this.f19613g.mo12856z(iVar, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo13184U(DataOutput dataOutput) {
        dataOutput.writeInt(mo12778g(C3603a.YEAR));
        dataOutput.writeByte(mo12778g(C3603a.MONTH_OF_YEAR));
        dataOutput.writeByte(mo12778g(C3603a.DAY_OF_MONTH));
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14736j(this);
        }
        switch (C2882a.f19616a[((C3603a) iVar).ordinal()]) {
            case 1:
                return m22609G();
            case 2:
                return (long) this.f19615i;
            case 3:
            case 4:
            case 5:
            case 6:
                throw new C3631m("Unsupported field: " + iVar);
            case 7:
                return (long) this.f19614h.getValue();
            default:
                return this.f19613g.mo12777d(iVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2881p) {
            return this.f19613g.equals(((C2881p) obj).f19613g);
        }
        return false;
    }

    public int hashCode() {
        return mo12847r().mo13136k().hashCode() ^ this.f19613g.hashCode();
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        if (iVar == C3603a.ALIGNED_DAY_OF_WEEK_IN_MONTH || iVar == C3603a.ALIGNED_DAY_OF_WEEK_IN_YEAR || iVar == C3603a.ALIGNED_WEEK_OF_MONTH || iVar == C3603a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.mo12781j(iVar);
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14730d(this);
        }
        if (mo12781j(iVar)) {
            C3603a aVar = (C3603a) iVar;
            int i = C2882a.f19616a[aVar.ordinal()];
            return i != 1 ? i != 2 ? mo12847r().mo13173x(aVar) : m22608E(1) : m22608E(6);
        }
        throw new C3631m("Unsupported field: " + iVar);
    }

    /* renamed from: p */
    public final C2860c<C2881p> mo12845p(C2755h hVar) {
        return super.mo12845p(hVar);
    }

    /* renamed from: x */
    public long mo12854x() {
        return this.f19613g.mo12854x();
    }
}
