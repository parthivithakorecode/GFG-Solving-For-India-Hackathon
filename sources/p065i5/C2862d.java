package p065i5;

import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import p058h5.C2755h;
import p058h5.C2778q;
import p058h5.C2780r;
import p065i5.C2858b;
import p080k5.C3334d;
import p087l5.C3603a;
import p087l5.C3604b;
import p087l5.C3613d;
import p087l5.C3615f;
import p087l5.C3620i;
import p087l5.C3630l;
import p087l5.C3632n;

/* renamed from: i5.d */
final class C2862d<D extends C2858b> extends C2860c<D> implements Serializable {

    /* renamed from: g */
    private final D f19550g;

    /* renamed from: h */
    private final C2755h f19551h;

    /* renamed from: i5.d$a */
    static /* synthetic */ class C2863a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19552a;

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
                l5.b[] r0 = p087l5.C3604b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19552a = r0
                l5.b r1 = p087l5.C3604b.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19552a     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.b r1 = p087l5.C3604b.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19552a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l5.b r1 = p087l5.C3604b.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f19552a     // Catch:{ NoSuchFieldError -> 0x0033 }
                l5.b r1 = p087l5.C3604b.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f19552a     // Catch:{ NoSuchFieldError -> 0x003e }
                l5.b r1 = p087l5.C3604b.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f19552a     // Catch:{ NoSuchFieldError -> 0x0049 }
                l5.b r1 = p087l5.C3604b.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f19552a     // Catch:{ NoSuchFieldError -> 0x0054 }
                l5.b r1 = p087l5.C3604b.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p065i5.C2862d.C2863a.<clinit>():void");
        }
    }

    private C2862d(D d, C2755h hVar) {
        C3334d.m24473i(d, "date");
        C3334d.m24473i(hVar, "time");
        this.f19550g = d;
        this.f19551h = hVar;
    }

    /* renamed from: C */
    static <R extends C2858b> C2862d<R> m22415C(R r, C2755h hVar) {
        return new C2862d<>(r, hVar);
    }

    /* renamed from: E */
    private C2862d<D> m22416E(long j) {
        return m22422L(this.f19550g.mo12800e(j, C3604b.DAYS), this.f19551h);
    }

    /* renamed from: F */
    private C2862d<D> m22417F(long j) {
        return m22420J(this.f19550g, j, 0, 0, 0);
    }

    /* renamed from: G */
    private C2862d<D> m22418G(long j) {
        return m22420J(this.f19550g, 0, j, 0, 0);
    }

    /* renamed from: H */
    private C2862d<D> m22419H(long j) {
        return m22420J(this.f19550g, 0, 0, 0, j);
    }

    /* renamed from: J */
    private C2862d<D> m22420J(D d, long j, long j2, long j3, long j4) {
        C2755h B;
        D d2 = d;
        if ((j | j2 | j3 | j4) == 0) {
            B = this.f19551h;
        } else {
            long K = this.f19551h.mo12900K();
            long j5 = (j4 % 86400000000000L) + ((j3 % 86400) * 1000000000) + ((j2 % 1440) * 60000000000L) + ((j % 24) * 3600000000000L) + K;
            long e = (j4 / 86400000000000L) + (j3 / 86400) + (j2 / 1440) + (j / 24) + C3334d.m24469e(j5, 86400000000000L);
            long h = C3334d.m24472h(j5, 86400000000000L);
            B = h == K ? this.f19551h : C2755h.m21939B(h);
            d2 = d2.mo12800e(e, C3604b.DAYS);
        }
        return m22422L(d2, B);
    }

    /* renamed from: K */
    static C2860c<?> m22421K(ObjectInput objectInput) {
        return ((C2858b) objectInput.readObject()).mo12845p((C2755h) objectInput.readObject());
    }

    /* renamed from: L */
    private C2862d<D> m22422L(C3613d dVar, C2755h hVar) {
        D d = this.f19550g;
        return (d == dVar && this.f19551h == hVar) ? this : new C2862d<>(d.mo12847r().mo13129e(dVar), hVar);
    }

    private Object writeReplace() {
        return new C2889u((byte) 12, this);
    }

    /* renamed from: D */
    public C2862d<D> mo12891v(long j, C3630l lVar) {
        if (!(lVar instanceof C3604b)) {
            return this.f19550g.mo12847r().mo13131f(lVar.mo14741d(this, j));
        }
        switch (C2863a.f19552a[((C3604b) lVar).ordinal()]) {
            case 1:
                return m22419H(j);
            case 2:
                return m22416E(j / 86400000000L).m22419H((j % 86400000000L) * 1000);
            case 3:
                return m22416E(j / 86400000).m22419H((j % 86400000) * 1000000);
            case 4:
                return mo13114I(j);
            case 5:
                return m22418G(j);
            case 6:
                return m22417F(j);
            case 7:
                return m22416E(j / 256).m22417F((j % 256) * 12);
            default:
                return m22422L(this.f19550g.mo12800e(j, lVar), this.f19551h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public C2862d<D> mo13114I(long j) {
        return m22420J(this.f19550g, 0, 0, j, 0);
    }

    /* renamed from: M */
    public C2862d<D> mo12805m(C3615f fVar) {
        return fVar instanceof C2858b ? m22422L((C2858b) fVar, this.f19551h) : fVar instanceof C2755h ? m22422L(this.f19550g, (C2755h) fVar) : fVar instanceof C2862d ? this.f19550g.mo12847r().mo13131f((C2862d) fVar) : this.f19550g.mo12847r().mo13131f((C2862d) fVar.mo12780h(this));
    }

    /* renamed from: N */
    public C2862d<D> mo12804l(C3620i iVar, long j) {
        return iVar instanceof C3603a ? iVar.mo14732f() ? m22422L(this.f19550g, this.f19551h.mo12804l(iVar, j)) : m22422L(this.f19550g.mo12804l(iVar, j), this.f19551h) : this.f19550g.mo12847r().mo13131f(iVar.mo14735i(this, j));
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        return iVar instanceof C3603a ? iVar.mo14732f() ? this.f19551h.mo12777d(iVar) : this.f19550g.mo12777d(iVar) : iVar.mo14736j(this);
    }

    /* renamed from: g */
    public int mo12778g(C3620i iVar) {
        return iVar instanceof C3603a ? iVar.mo14732f() ? this.f19551h.mo12778g(iVar) : this.f19550g.mo12778g(iVar) : mo12782n(iVar).mo14755a(mo12777d(iVar), iVar);
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        return iVar instanceof C3603a ? iVar.mo14729b() || iVar.mo14732f() : iVar != null && iVar.mo14733g(this);
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        return iVar instanceof C3603a ? iVar.mo14732f() ? this.f19551h.mo12782n(iVar) : this.f19550g.mo12782n(iVar) : iVar.mo14730d(this);
    }

    /* renamed from: p */
    public C2865f<D> mo12885p(C2778q qVar) {
        return C2868g.m22464E(this, qVar, (C2780r) null);
    }

    /* access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f19550g);
        objectOutput.writeObject(this.f19551h);
    }

    /* renamed from: y */
    public D mo12892y() {
        return this.f19550g;
    }

    /* renamed from: z */
    public C2755h mo12893z() {
        return this.f19551h;
    }
}
