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
import p087l5.C3613d;
import p087l5.C3615f;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;
import p087l5.C3630l;

/* renamed from: i5.c */
public abstract class C2860c<D extends C2858b> extends C3332b implements C3615f, Comparable<C2860c<?>> {

    /* renamed from: f */
    private static final Comparator<C2860c<?>> f19549f = new C2861a();

    /* renamed from: i5.c$a */
    class C2861a implements Comparator<C2860c<?>> {
        C2861a() {
        }

        /* JADX WARNING: type inference failed for: r5v0, types: [i5.c, i5.c<?>] */
        /* JADX WARNING: type inference failed for: r6v0, types: [i5.c, i5.c<?>] */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(p065i5.C2860c<?> r5, p065i5.C2860c<?> r6) {
            /*
                r4 = this;
                i5.b r0 = r5.mo12892y()
                long r0 = r0.mo12854x()
                i5.b r2 = r6.mo12892y()
                long r2 = r2.mo12854x()
                int r0 = p080k5.C3334d.m24466b(r0, r2)
                if (r0 != 0) goto L_0x002a
                h5.h r5 = r5.mo12893z()
                long r0 = r5.mo12900K()
                h5.h r5 = r6.mo12893z()
                long r5 = r5.mo12900K()
                int r0 = p080k5.C3334d.m24466b(r0, r5)
            L_0x002a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p065i5.C2860c.C2861a.compare(i5.c, i5.c):int");
        }
    }

    /* renamed from: A */
    public C2860c<D> mo12805m(C3615f fVar) {
        return mo12892y().mo12847r().mo13131f(super.mo12805m(fVar));
    }

    /* renamed from: B */
    public abstract C2860c<D> mo12804l(C3620i iVar, long j);

    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        if (kVar == C3621j.m25159a()) {
            return mo13108r();
        }
        if (kVar == C3621j.m25163e()) {
            return C3604b.NANOS;
        }
        if (kVar == C3621j.m25160b()) {
            return C2749f.m21829V(mo12892y().mo12854x());
        }
        if (kVar == C3621j.m25161c()) {
            return mo12893z();
        }
        if (kVar == C3621j.m25164f() || kVar == C3621j.m25165g() || kVar == C3621j.m25162d()) {
            return null;
        }
        return super.mo12776b(kVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2860c) {
            return compareTo((C2860c) obj) == 0;
        }
        return false;
    }

    /* renamed from: h */
    public C3613d mo12780h(C3613d dVar) {
        return dVar.mo12804l(C3603a.EPOCH_DAY, mo12892y().mo12854x()).mo12804l(C3603a.NANO_OF_DAY, mo12893z().mo12900K());
    }

    public int hashCode() {
        return mo12892y().hashCode() ^ mo12893z().hashCode();
    }

    /* renamed from: p */
    public abstract C2865f<D> mo12885p(C2778q qVar);

    /* JADX WARNING: type inference failed for: r3v0, types: [i5.c, i5.c<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(p065i5.C2860c<?> r3) {
        /*
            r2 = this;
            i5.b r0 = r2.mo12892y()
            i5.b r1 = r3.mo12892y()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0028
            h5.h r0 = r2.mo12893z()
            h5.h r1 = r3.mo12893z()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0028
            i5.h r0 = r2.mo13108r()
            i5.h r3 = r3.mo13108r()
            int r0 = r0.compareTo(r3)
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p065i5.C2860c.compareTo(i5.c):int");
    }

    /* renamed from: r */
    public C2870h mo13108r() {
        return mo12892y().mo12847r();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [i5.c, i5.c<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12887s(p065i5.C2860c<?> r5) {
        /*
            r4 = this;
            i5.b r0 = r4.mo12892y()
            long r0 = r0.mo12854x()
            i5.b r2 = r5.mo12892y()
            long r2 = r2.mo12854x()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x002d
            if (r0 != 0) goto L_0x002b
            h5.h r0 = r4.mo12893z()
            long r0 = r0.mo12900K()
            h5.h r5 = r5.mo12893z()
            long r2 = r5.mo12900K()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r5 = 0
            goto L_0x002e
        L_0x002d:
            r5 = 1
        L_0x002e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p065i5.C2860c.mo12887s(i5.c):boolean");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [i5.c, i5.c<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12888t(p065i5.C2860c<?> r5) {
        /*
            r4 = this;
            i5.b r0 = r4.mo12892y()
            long r0 = r0.mo12854x()
            i5.b r2 = r5.mo12892y()
            long r2 = r2.mo12854x()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x002d
            if (r0 != 0) goto L_0x002b
            h5.h r0 = r4.mo12893z()
            long r0 = r0.mo12900K()
            h5.h r5 = r5.mo12893z()
            long r2 = r5.mo12900K()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r5 = 0
            goto L_0x002e
        L_0x002d:
            r5 = 1
        L_0x002e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p065i5.C2860c.mo12888t(i5.c):boolean");
    }

    public String toString() {
        return mo12892y().toString() + 'T' + mo12893z().toString();
    }

    /* renamed from: u */
    public C2860c<D> mo12802f(long j, C3630l lVar) {
        return mo12892y().mo12847r().mo13131f(super.mo12802f(j, lVar));
    }

    /* renamed from: v */
    public abstract C2860c<D> mo12800e(long j, C3630l lVar);

    /* renamed from: w */
    public long mo13109w(C2780r rVar) {
        C3334d.m24473i(rVar, "offset");
        return ((mo12892y().mo12854x() * 86400) + ((long) mo12893z().mo12901L())) - ((long) rVar.mo13013w());
    }

    /* renamed from: x */
    public C2746e mo13110x(C2780r rVar) {
        return C2746e.m21797w(mo13109w(rVar), (long) mo12893z().mo12917v());
    }

    /* renamed from: y */
    public abstract D mo12892y();

    /* renamed from: z */
    public abstract C2755h mo12893z();
}
