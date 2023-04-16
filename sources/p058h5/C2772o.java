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

/* renamed from: h5.o */
public final class C2772o extends C3333c implements C3613d, C3615f, Comparable<C2772o>, Serializable {

    /* renamed from: g */
    public static final C3629k<C2772o> f19401g = new C2773a();

    /* renamed from: h */
    private static final C3250b f19402h = new C3253c().mo14193l(C3603a.YEAR, 4, 10, C3280j.EXCEEDS_PAD).mo14200s();

    /* renamed from: f */
    private final int f19403f;

    /* renamed from: h5.o$a */
    class C2773a implements C3629k<C2772o> {
        C2773a() {
        }

        /* renamed from: b */
        public C2772o mo12783a(C3614e eVar) {
            return C2772o.m22073p(eVar);
        }
    }

    /* renamed from: h5.o$b */
    static /* synthetic */ class C2774b {

        /* renamed from: a */
        static final /* synthetic */ int[] f19404a;

        /* renamed from: b */
        static final /* synthetic */ int[] f19405b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0059 */
        static {
            /*
                l5.b[] r0 = p087l5.C3604b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19405b = r0
                r1 = 1
                l5.b r2 = p087l5.C3604b.YEARS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f19405b     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.b r3 = p087l5.C3604b.DECADES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f19405b     // Catch:{ NoSuchFieldError -> 0x0028 }
                l5.b r4 = p087l5.C3604b.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f19405b     // Catch:{ NoSuchFieldError -> 0x0033 }
                l5.b r4 = p087l5.C3604b.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f19405b     // Catch:{ NoSuchFieldError -> 0x003e }
                l5.b r4 = p087l5.C3604b.ERAS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                l5.a[] r3 = p087l5.C3603a.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f19404a = r3
                l5.a r4 = p087l5.C3603a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x004f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f19404a     // Catch:{ NoSuchFieldError -> 0x0059 }
                l5.a r3 = p087l5.C3603a.YEAR     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f19404a     // Catch:{ NoSuchFieldError -> 0x0063 }
                l5.a r1 = p087l5.C3603a.ERA     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p058h5.C2772o.C2774b.<clinit>():void");
        }
    }

    private C2772o(int i) {
        this.f19403f = i;
    }

    /* renamed from: p */
    public static C2772o m22073p(C3614e eVar) {
        if (eVar instanceof C2772o) {
            return (C2772o) eVar;
        }
        try {
            if (!C2877m.f19602j.equals(C2870h.m22476i(eVar))) {
                eVar = C2749f.m21824D(eVar);
            }
            return m22075s(eVar.mo12778g(C3603a.YEAR));
        } catch (C2742b unused) {
            throw new C2742b("Unable to obtain Year from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    /* renamed from: q */
    public static boolean m22074q(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: s */
    public static C2772o m22075s(int i) {
        C3603a.YEAR.mo14738l((long) i);
        return new C2772o(i);
    }

    /* renamed from: v */
    static C2772o m22076v(DataInput dataInput) {
        return m22075s(dataInput.readInt());
    }

    private Object writeReplace() {
        return new C2771n((byte) 67, this);
    }

    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        if (kVar == C3621j.m25159a()) {
            return C2877m.f19602j;
        }
        if (kVar == C3621j.m25163e()) {
            return C3604b.YEARS;
        }
        if (kVar == C3621j.m25160b() || kVar == C3621j.m25161c() || kVar == C3621j.m25164f() || kVar == C3621j.m25165g() || kVar == C3621j.m25162d()) {
            return null;
        }
        return super.mo12776b(kVar);
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14736j(this);
        }
        int i = C2774b.f19404a[((C3603a) iVar).ordinal()];
        int i2 = 1;
        if (i == 1) {
            int i3 = this.f19403f;
            if (i3 < 1) {
                i3 = 1 - i3;
            }
            return (long) i3;
        } else if (i == 2) {
            return (long) this.f19403f;
        } else {
            if (i == 3) {
                if (this.f19403f < 1) {
                    i2 = 0;
                }
                return (long) i2;
            }
            throw new C3631m("Unsupported field: " + iVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2772o) {
            return this.f19403f == ((C2772o) obj).f19403f;
        }
        return false;
    }

    /* renamed from: g */
    public int mo12778g(C3620i iVar) {
        return mo12782n(iVar).mo14755a(mo12777d(iVar), iVar);
    }

    /* renamed from: h */
    public C3613d mo12780h(C3613d dVar) {
        if (C2870h.m22476i(dVar).equals(C2877m.f19602j)) {
            return dVar.mo12804l(C3603a.YEAR, (long) this.f19403f);
        }
        throw new C2742b("Adjustment only supported on ISO date-time");
    }

    public int hashCode() {
        return this.f19403f;
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        return iVar instanceof C3603a ? iVar == C3603a.YEAR || iVar == C3603a.YEAR_OF_ERA || iVar == C3603a.ERA : iVar != null && iVar.mo14733g(this);
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        if (iVar != C3603a.YEAR_OF_ERA) {
            return super.mo12782n(iVar);
        }
        return C3632n.m25183i(1, this.f19403f <= 0 ? 1000000000 : 999999999);
    }

    /* renamed from: o */
    public int compareTo(C2772o oVar) {
        return this.f19403f - oVar.f19403f;
    }

    /* renamed from: r */
    public C2772o mo12802f(long j, C3630l lVar) {
        return j == Long.MIN_VALUE ? mo12800e(Long.MAX_VALUE, lVar).mo12800e(1, lVar) : mo12800e(-j, lVar);
    }

    /* renamed from: t */
    public C2772o mo12800e(long j, C3630l lVar) {
        if (!(lVar instanceof C3604b)) {
            return (C2772o) lVar.mo14741d(this, j);
        }
        int i = C2774b.f19405b[((C3604b) lVar).ordinal()];
        if (i == 1) {
            return mo12981u(j);
        }
        if (i == 2) {
            return mo12981u(C3334d.m24476l(j, 10));
        }
        if (i == 3) {
            return mo12981u(C3334d.m24476l(j, 100));
        }
        if (i == 4) {
            return mo12981u(C3334d.m24476l(j, 1000));
        }
        if (i == 5) {
            C3603a aVar = C3603a.ERA;
            return mo12804l(aVar, C3334d.m24475k(mo12777d(aVar), j));
        }
        throw new C3631m("Unsupported unit: " + lVar);
    }

    public String toString() {
        return Integer.toString(this.f19403f);
    }

    /* renamed from: u */
    public C2772o mo12981u(long j) {
        return j == 0 ? this : m22075s(C3603a.YEAR.mo14737k(((long) this.f19403f) + j));
    }

    /* renamed from: w */
    public C2772o mo12805m(C3615f fVar) {
        return (C2772o) fVar.mo12780h(this);
    }

    /* renamed from: x */
    public C2772o mo12804l(C3620i iVar, long j) {
        if (!(iVar instanceof C3603a)) {
            return (C2772o) iVar.mo14735i(this, j);
        }
        C3603a aVar = (C3603a) iVar;
        aVar.mo14738l(j);
        int i = C2774b.f19404a[aVar.ordinal()];
        if (i == 1) {
            if (this.f19403f < 1) {
                j = 1 - j;
            }
            return m22075s((int) j);
        } else if (i == 2) {
            return m22075s((int) j);
        } else {
            if (i == 3) {
                return mo12777d(C3603a.ERA) == j ? this : m22075s(1 - this.f19403f);
            }
            throw new C3631m("Unsupported field: " + iVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo12984y(DataOutput dataOutput) {
        dataOutput.writeInt(this.f19403f);
    }
}
