package p065i5;

import java.util.Comparator;
import p058h5.C2749f;
import p058h5.C2755h;
import p080k5.C3332b;
import p080k5.C3334d;
import p087l5.C3603a;
import p087l5.C3604b;
import p087l5.C3613d;
import p087l5.C3615f;
import p087l5.C3619h;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;
import p087l5.C3630l;

/* renamed from: i5.b */
public abstract class C2858b extends C3332b implements C3615f, Comparable<C2858b> {

    /* renamed from: f */
    private static final Comparator<C2858b> f19548f = new C2859a();

    /* renamed from: i5.b$a */
    class C2859a implements Comparator<C2858b> {
        C2859a() {
        }

        /* renamed from: a */
        public int compare(C2858b bVar, C2858b bVar2) {
            return C3334d.m24466b(bVar.mo12854x(), bVar2.mo12854x());
        }
    }

    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        if (kVar == C3621j.m25159a()) {
            return mo12847r();
        }
        if (kVar == C3621j.m25163e()) {
            return C3604b.DAYS;
        }
        if (kVar == C3621j.m25160b()) {
            return C2749f.m21829V(mo12854x());
        }
        if (kVar == C3621j.m25161c() || kVar == C3621j.m25164f() || kVar == C3621j.m25165g() || kVar == C3621j.m25162d()) {
            return null;
        }
        return super.mo12776b(kVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2858b) {
            return compareTo((C2858b) obj) == 0;
        }
        return false;
    }

    /* renamed from: h */
    public C3613d mo12780h(C3613d dVar) {
        return dVar.mo12804l(C3603a.EPOCH_DAY, mo12854x());
    }

    public int hashCode() {
        long x = mo12854x();
        return ((int) (x ^ (x >>> 32))) ^ mo12847r().hashCode();
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        return iVar instanceof C3603a ? iVar.mo14729b() : iVar != null && iVar.mo14733g(this);
    }

    /* renamed from: p */
    public C2860c<?> mo12845p(C2755h hVar) {
        return C2862d.m22415C(this, hVar);
    }

    /* renamed from: q */
    public int compareTo(C2858b bVar) {
        int b = C3334d.m24466b(mo12854x(), bVar.mo12854x());
        return b == 0 ? mo12847r().compareTo(bVar.mo12847r()) : b;
    }

    /* renamed from: r */
    public abstract C2870h mo12847r();

    /* renamed from: s */
    public C2872i mo12848s() {
        return mo12847r().mo13133h(mo12778g(C3603a.ERA));
    }

    /* renamed from: t */
    public boolean mo12849t(C2858b bVar) {
        return mo12854x() < bVar.mo12854x();
    }

    public String toString() {
        long d = mo12777d(C3603a.YEAR_OF_ERA);
        long d2 = mo12777d(C3603a.MONTH_OF_YEAR);
        long d3 = mo12777d(C3603a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(mo12847r().toString());
        sb.append(" ");
        sb.append(mo12848s());
        sb.append(" ");
        sb.append(d);
        String str = "-0";
        sb.append(d2 < 10 ? str : "-");
        sb.append(d2);
        if (d3 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append(d3);
        return sb.toString();
    }

    /* renamed from: u */
    public C2858b mo12802f(long j, C3630l lVar) {
        return mo12847r().mo13129e(super.mo12802f(j, lVar));
    }

    /* renamed from: v */
    public abstract C2858b mo12800e(long j, C3630l lVar);

    /* renamed from: w */
    public C2858b mo12853w(C3619h hVar) {
        return mo12847r().mo13129e(super.mo14334o(hVar));
    }

    /* renamed from: x */
    public long mo12854x() {
        return mo12777d(C3603a.EPOCH_DAY);
    }

    /* renamed from: y */
    public C2858b mo12805m(C3615f fVar) {
        return mo12847r().mo13129e(super.mo12805m(fVar));
    }

    /* renamed from: z */
    public abstract C2858b mo12804l(C3620i iVar, long j);
}
