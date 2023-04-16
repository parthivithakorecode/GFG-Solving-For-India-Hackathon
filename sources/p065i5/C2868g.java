package p065i5;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import p058h5.C2746e;
import p058h5.C2752g;
import p058h5.C2778q;
import p058h5.C2780r;
import p065i5.C2858b;
import p080k5.C3334d;
import p087l5.C3603a;
import p087l5.C3604b;
import p087l5.C3620i;
import p087l5.C3630l;

/* renamed from: i5.g */
final class C2868g<D extends C2858b> extends C2865f<D> implements Serializable {

    /* renamed from: g */
    private final C2862d<D> f19555g;

    /* renamed from: h */
    private final C2780r f19556h;

    /* renamed from: i */
    private final C2778q f19557i;

    /* renamed from: i5.g$a */
    static /* synthetic */ class C2869a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19558a;

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
                f19558a = r0
                l5.a r1 = p087l5.C3603a.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19558a     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.a r1 = p087l5.C3603a.OFFSET_SECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p065i5.C2868g.C2869a.<clinit>():void");
        }
    }

    private C2868g(C2862d<D> dVar, C2780r rVar, C2778q qVar) {
        this.f19555g = (C2862d) C3334d.m24473i(dVar, "dateTime");
        this.f19556h = (C2780r) C3334d.m24473i(rVar, "offset");
        this.f19557i = (C2778q) C3334d.m24473i(qVar, "zone");
    }

    /* renamed from: D */
    private C2868g<D> m22463D(C2746e eVar, C2778q qVar) {
        return m22465F(mo13043x().mo12847r(), eVar, qVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        if (r2.contains(r8) != false) goto L_0x0055;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <R extends p065i5.C2858b> p065i5.C2865f<R> m22464E(p065i5.C2862d<R> r6, p058h5.C2778q r7, p058h5.C2780r r8) {
        /*
            java.lang.String r0 = "localDateTime"
            p080k5.C3334d.m24473i(r6, r0)
            java.lang.String r0 = "zone"
            p080k5.C3334d.m24473i(r7, r0)
            boolean r0 = r7 instanceof p058h5.C2780r
            if (r0 == 0) goto L_0x0017
            i5.g r8 = new i5.g
            r0 = r7
            h5.r r0 = (p058h5.C2780r) r0
            r8.<init>(r6, r0, r7)
            return r8
        L_0x0017:
            m5.f r0 = r7.mo13005o()
            h5.g r1 = p058h5.C2752g.m21885F(r6)
            java.util.List r2 = r0.mo14911c(r1)
            int r3 = r2.size()
            r4 = 1
            r5 = 0
            if (r3 != r4) goto L_0x0032
        L_0x002b:
            java.lang.Object r8 = r2.get(r5)
            h5.r r8 = (p058h5.C2780r) r8
            goto L_0x0055
        L_0x0032:
            int r3 = r2.size()
            if (r3 != 0) goto L_0x004d
            m5.d r8 = r0.mo14910b(r1)
            h5.d r0 = r8.mo14929f()
            long r0 = r0.mo12789f()
            i5.d r6 = r6.mo13114I(r0)
            h5.r r8 = r8.mo14932i()
            goto L_0x0055
        L_0x004d:
            if (r8 == 0) goto L_0x002b
            boolean r0 = r2.contains(r8)
            if (r0 == 0) goto L_0x002b
        L_0x0055:
            java.lang.String r0 = "offset"
            p080k5.C3334d.m24473i(r8, r0)
            i5.g r0 = new i5.g
            r0.<init>(r6, r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p065i5.C2868g.m22464E(i5.d, h5.q, h5.r):i5.f");
    }

    /* renamed from: F */
    static <R extends C2858b> C2868g<R> m22465F(C2870h hVar, C2746e eVar, C2778q qVar) {
        C2780r a = qVar.mo13005o().mo14909a(eVar);
        C3334d.m24473i(a, "offset");
        return new C2868g<>((C2862d) hVar.mo13137m(C2752g.m21888R(eVar.mo12807r(), eVar.mo12808s(), a)), a, qVar);
    }

    /* renamed from: G */
    static C2865f<?> m22466G(ObjectInput objectInput) {
        return ((C2860c) objectInput.readObject()).mo12885p((C2780r) objectInput.readObject()).mo13018C((C2778q) objectInput.readObject());
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C2889u((byte) 13, this);
    }

    /* renamed from: B */
    public C2865f<D> mo12804l(C3620i iVar, long j) {
        if (!(iVar instanceof C3603a)) {
            return mo13043x().mo12847r().mo13132g(iVar.mo14735i(this, j));
        }
        C3603a aVar = (C3603a) iVar;
        int i = C2869a.f19558a[aVar.ordinal()];
        if (i == 1) {
            return mo12800e(j - mo13121v(), C3604b.SECONDS);
        }
        if (i != 2) {
            return m22464E(this.f19555g.mo12804l(iVar, j), this.f19557i, this.f19556h);
        }
        return m22463D(this.f19555g.mo13110x(C2780r.m22141z(aVar.mo14737k(j))), this.f19557i);
    }

    /* renamed from: C */
    public C2865f<D> mo13018C(C2778q qVar) {
        return m22464E(this.f19555g, qVar, this.f19556h);
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

    public int hashCode() {
        return (mo13044y().hashCode() ^ mo13038q().hashCode()) ^ Integer.rotateLeft(mo13039r().hashCode(), 3);
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        return (iVar instanceof C3603a) || (iVar != null && iVar.mo14733g(this));
    }

    /* renamed from: q */
    public C2780r mo13038q() {
        return this.f19556h;
    }

    /* renamed from: r */
    public C2778q mo13039r() {
        return this.f19557i;
    }

    public String toString() {
        String str = mo13044y().toString() + mo13038q().toString();
        if (mo13038q() == mo13039r()) {
            return str;
        }
        return str + '[' + mo13039r().toString() + ']';
    }

    /* renamed from: u */
    public C2865f<D> mo12800e(long j, C3630l lVar) {
        return lVar instanceof C3604b ? mo12805m(this.f19555g.mo12891v(j, lVar)) : mo13043x().mo12847r().mo13132g(lVar.mo14741d(this, j));
    }

    /* access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f19555g);
        objectOutput.writeObject(this.f19556h);
        objectOutput.writeObject(this.f19557i);
    }

    /* renamed from: y */
    public C2860c<D> mo13044y() {
        return this.f19555g;
    }
}
