package p058h5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import p065i5.C2870h;
import p065i5.C2877m;
import p073j5.C3250b;
import p073j5.C3253c;
import p080k5.C3333c;
import p080k5.C3334d;
import p087l5.C3603a;
import p087l5.C3613d;
import p087l5.C3614e;
import p087l5.C3615f;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;
import p087l5.C3631m;
import p087l5.C3632n;

/* renamed from: h5.j */
public final class C2761j extends C3333c implements C3615f, Comparable<C2761j>, Serializable {

    /* renamed from: h */
    public static final C3629k<C2761j> f19377h = new C2762a();

    /* renamed from: i */
    private static final C3250b f19378i = new C3253c().mo14188f("--").mo14192k(C3603a.MONTH_OF_YEAR, 2).mo14187e('-').mo14192k(C3603a.DAY_OF_MONTH, 2).mo14200s();

    /* renamed from: f */
    private final int f19379f;

    /* renamed from: g */
    private final int f19380g;

    /* renamed from: h5.j$a */
    class C2762a implements C3629k<C2761j> {
        C2762a() {
        }

        /* renamed from: b */
        public C2761j mo12783a(C3614e eVar) {
            return C2761j.m21996p(eVar);
        }
    }

    /* renamed from: h5.j$b */
    static /* synthetic */ class C2763b {

        /* renamed from: a */
        static final /* synthetic */ int[] f19381a;

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
                f19381a = r0
                l5.a r1 = p087l5.C3603a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19381a     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.a r1 = p087l5.C3603a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p058h5.C2761j.C2763b.<clinit>():void");
        }
    }

    private C2761j(int i, int i2) {
        this.f19379f = i;
        this.f19380g = i2;
    }

    /* renamed from: p */
    public static C2761j m21996p(C3614e eVar) {
        if (eVar instanceof C2761j) {
            return (C2761j) eVar;
        }
        try {
            if (!C2877m.f19602j.equals(C2870h.m22476i(eVar))) {
                eVar = C2749f.m21824D(eVar);
            }
            return m21997r(eVar.mo12778g(C3603a.MONTH_OF_YEAR), eVar.mo12778g(C3603a.DAY_OF_MONTH));
        } catch (C2742b unused) {
            throw new C2742b("Unable to obtain MonthDay from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    /* renamed from: r */
    public static C2761j m21997r(int i, int i2) {
        return m21998s(C2758i.m21982r(i), i2);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: s */
    public static C2761j m21998s(C2758i iVar, int i) {
        C3334d.m24473i(iVar, "month");
        C3603a.DAY_OF_MONTH.mo14738l((long) i);
        if (i <= iVar.mo12924p()) {
            return new C2761j(iVar.getValue(), i);
        }
        throw new C2742b("Illegal value for DayOfMonth field, value " + i + " is not valid for month " + iVar.name());
    }

    /* renamed from: t */
    static C2761j m21999t(DataInput dataInput) {
        return m21997r(dataInput.readByte(), dataInput.readByte());
    }

    private Object writeReplace() {
        return new C2771n((byte) 64, this);
    }

    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        return kVar == C3621j.m25159a() ? C2877m.f19602j : super.mo12776b(kVar);
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        int i;
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14736j(this);
        }
        int i2 = C2763b.f19381a[((C3603a) iVar).ordinal()];
        if (i2 == 1) {
            i = this.f19380g;
        } else if (i2 == 2) {
            i = this.f19379f;
        } else {
            throw new C3631m("Unsupported field: " + iVar);
        }
        return (long) i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2761j)) {
            return false;
        }
        C2761j jVar = (C2761j) obj;
        return this.f19379f == jVar.f19379f && this.f19380g == jVar.f19380g;
    }

    /* renamed from: g */
    public int mo12778g(C3620i iVar) {
        return mo12782n(iVar).mo14755a(mo12777d(iVar), iVar);
    }

    /* renamed from: h */
    public C3613d mo12780h(C3613d dVar) {
        if (C2870h.m22476i(dVar).equals(C2877m.f19602j)) {
            C3613d l = dVar.mo12804l(C3603a.MONTH_OF_YEAR, (long) this.f19379f);
            C3603a aVar = C3603a.DAY_OF_MONTH;
            return l.mo12804l(aVar, Math.min(l.mo12782n(aVar).mo14757c(), (long) this.f19380g));
        }
        throw new C2742b("Adjustment only supported on ISO date-time");
    }

    public int hashCode() {
        return (this.f19379f << 6) + this.f19380g;
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        return iVar instanceof C3603a ? iVar == C3603a.MONTH_OF_YEAR || iVar == C3603a.DAY_OF_MONTH : iVar != null && iVar.mo14733g(this);
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        return iVar == C3603a.MONTH_OF_YEAR ? iVar.mo14734h() : iVar == C3603a.DAY_OF_MONTH ? C3632n.m25184j(1, (long) mo12932q().mo12925q(), (long) mo12932q().mo12924p()) : super.mo12782n(iVar);
    }

    /* renamed from: o */
    public int compareTo(C2761j jVar) {
        int i = this.f19379f - jVar.f19379f;
        return i == 0 ? this.f19380g - jVar.f19380g : i;
    }

    /* renamed from: q */
    public C2758i mo12932q() {
        return C2758i.m21982r(this.f19379f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.f19379f < 10 ? "0" : "");
        sb.append(this.f19379f);
        sb.append(this.f19380g < 10 ? "-0" : "-");
        sb.append(this.f19380g);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo12934u(DataOutput dataOutput) {
        dataOutput.writeByte(this.f19379f);
        dataOutput.writeByte(this.f19380g);
    }
}
