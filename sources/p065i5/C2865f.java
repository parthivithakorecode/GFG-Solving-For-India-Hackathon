package p065i5;

import java.util.Comparator;
import p058h5.C2746e;
import p058h5.C2749f;
import p058h5.C2755h;
import p058h5.C2778q;
import p058h5.C2780r;
import p065i5.C2858b;
import p080k5.C3332b;
import p080k5.C3334d;
import p087l5.C3603a;
import p087l5.C3604b;
import p087l5.C3615f;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;
import p087l5.C3630l;
import p087l5.C3631m;
import p087l5.C3632n;

/* renamed from: i5.f */
public abstract class C2865f<D extends C2858b> extends C3332b implements Comparable<C2865f<?>> {

    /* renamed from: f */
    private static Comparator<C2865f<?>> f19553f = new C2866a();

    /* renamed from: i5.f$a */
    class C2866a implements Comparator<C2865f<?>> {
        C2866a() {
        }

        /* renamed from: a */
        public int compare(C2865f<?> fVar, C2865f<?> fVar2) {
            int b = C3334d.m24466b(fVar.mo13121v(), fVar2.mo13121v());
            return b == 0 ? C3334d.m24466b(fVar.mo13045z().mo12900K(), fVar2.mo13045z().mo12900K()) : b;
        }
    }

    /* renamed from: i5.f$b */
    static /* synthetic */ class C2867b {

        /* renamed from: a */
        static final /* synthetic */ int[] f19554a;

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
                f19554a = r0
                l5.a r1 = p087l5.C3603a.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19554a     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.a r1 = p087l5.C3603a.OFFSET_SECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p065i5.C2865f.C2867b.<clinit>():void");
        }
    }

    /* renamed from: A */
    public C2865f<D> mo12805m(C3615f fVar) {
        return mo13043x().mo12847r().mo13132g(super.mo12805m(fVar));
    }

    /* renamed from: B */
    public abstract C2865f<D> mo12804l(C3620i iVar, long j);

    /* renamed from: C */
    public abstract C2865f<D> mo13018C(C2778q qVar);

    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        return (kVar == C3621j.m25165g() || kVar == C3621j.m25164f()) ? mo13039r() : kVar == C3621j.m25159a() ? mo13043x().mo12847r() : kVar == C3621j.m25163e() ? C3604b.NANOS : kVar == C3621j.m25162d() ? mo13038q() : kVar == C3621j.m25160b() ? C2749f.m21829V(mo13043x().mo12854x()) : kVar == C3621j.m25161c() ? mo13045z() : super.mo12776b(kVar);
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14736j(this);
        }
        int i = C2867b.f19554a[((C3603a) iVar).ordinal()];
        return i != 1 ? i != 2 ? mo13044y().mo12777d(iVar) : (long) mo13038q().mo13013w() : mo13121v();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2865f) {
            return compareTo((C2865f) obj) == 0;
        }
        return false;
    }

    /* renamed from: g */
    public int mo12778g(C3620i iVar) {
        if (!(iVar instanceof C3603a)) {
            return super.mo12778g(iVar);
        }
        int i = C2867b.f19554a[((C3603a) iVar).ordinal()];
        if (i != 1) {
            return i != 2 ? mo13044y().mo12778g(iVar) : mo13038q().mo13013w();
        }
        throw new C3631m("Field too large for an int: " + iVar);
    }

    public int hashCode() {
        return (mo13044y().hashCode() ^ mo13038q().hashCode()) ^ Integer.rotateLeft(mo13039r().hashCode(), 3);
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        return iVar instanceof C3603a ? (iVar == C3603a.INSTANT_SECONDS || iVar == C3603a.OFFSET_SECONDS) ? iVar.mo14734h() : mo13044y().mo12782n(iVar) : iVar.mo14730d(this);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [i5.f<?>, i5.f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(p065i5.C2865f<?> r5) {
        /*
            r4 = this;
            long r0 = r4.mo13121v()
            long r2 = r5.mo13121v()
            int r0 = p080k5.C3334d.m24466b(r0, r2)
            if (r0 != 0) goto L_0x0059
            h5.h r0 = r4.mo13045z()
            int r0 = r0.mo12917v()
            h5.h r1 = r5.mo13045z()
            int r1 = r1.mo12917v()
            int r0 = r0 - r1
            if (r0 != 0) goto L_0x0059
            i5.c r0 = r4.mo13044y()
            i5.c r1 = r5.mo13044y()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0059
            h5.q r0 = r4.mo13039r()
            java.lang.String r0 = r0.mo13004k()
            h5.q r1 = r5.mo13039r()
            java.lang.String r1 = r1.mo13004k()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0059
            i5.b r0 = r4.mo13043x()
            i5.h r0 = r0.mo12847r()
            i5.b r5 = r5.mo13043x()
            i5.h r5 = r5.mo12847r()
            int r0 = r0.compareTo(r5)
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p065i5.C2865f.compareTo(i5.f):int");
    }

    /* renamed from: q */
    public abstract C2780r mo13038q();

    /* renamed from: r */
    public abstract C2778q mo13039r();

    /* renamed from: s */
    public boolean mo13120s(C2865f<?> fVar) {
        int i = (mo13121v() > fVar.mo13121v() ? 1 : (mo13121v() == fVar.mo13121v() ? 0 : -1));
        return i < 0 || (i == 0 && mo13045z().mo12917v() < fVar.mo13045z().mo12917v());
    }

    /* renamed from: t */
    public C2865f<D> mo12802f(long j, C3630l lVar) {
        return mo13043x().mo12847r().mo13132g(super.mo12802f(j, lVar));
    }

    public String toString() {
        String str = mo13044y().toString() + mo13038q().toString();
        if (mo13038q() == mo13039r()) {
            return str;
        }
        return str + '[' + mo13039r().toString() + ']';
    }

    /* renamed from: u */
    public abstract C2865f<D> mo12800e(long j, C3630l lVar);

    /* renamed from: v */
    public long mo13121v() {
        return ((mo13043x().mo12854x() * 86400) + ((long) mo13045z().mo12901L())) - ((long) mo13038q().mo13013w());
    }

    /* renamed from: w */
    public C2746e mo13122w() {
        return C2746e.m21797w(mo13121v(), (long) mo13045z().mo12917v());
    }

    /* renamed from: x */
    public D mo13043x() {
        return mo13044y().mo12892y();
    }

    /* renamed from: y */
    public abstract C2860c<D> mo13044y();

    /* renamed from: z */
    public C2755h mo13045z() {
        return mo13044y().mo12893z();
    }
}
