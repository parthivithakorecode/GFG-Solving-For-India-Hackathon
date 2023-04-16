package p084l2;

import android.app.Application;

/* renamed from: l2.h */
public final class C3498h extends C3479c1 {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3556v1<Application> f21070b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3556v1<C3518m> f21071c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3556v1<C3477c> f21072d;

    /* renamed from: e */
    private C3556v1<C3554v> f21073e;

    /* renamed from: f */
    private C3556v1<C3470a0> f21074f;

    /* renamed from: g */
    private C3556v1<C3474b0> f21075g;

    /* renamed from: h */
    private C3556v1<C3501h2> f21076h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C3556v1<C3565y1> f21077i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C3556v1<C3510k> f21078j;

    /* renamed from: k */
    private C3556v1<C3550t2> f21079k;

    /* renamed from: l */
    private C3556v1<C3509j2> f21080l;

    /* renamed from: m */
    private C3556v1<C3485d2> f21081m;

    private C3498h(Application application) {
        C3545s1 a = C3553u1.m24957a(application);
        this.f21070b = a;
        this.f21071c = C3549t1.m24942a(new C3531p(a));
        this.f21072d = C3549t1.m24942a(C3486e.f21050a);
        C3494g gVar = new C3494g(this);
        this.f21073e = gVar;
        this.f21074f = C3549t1.m24942a(new C3487e0(gVar));
        C3562x1 x1Var = new C3562x1(this.f21070b);
        this.f21075g = x1Var;
        this.f21076h = new C3513k2(this.f21070b, x1Var, this.f21071c);
        this.f21077i = C3549t1.m24942a(new C3476b2(C3547t.f21200a));
        C3523n nVar = new C3523n(this.f21070b, this.f21071c, C3547t.f21200a);
        this.f21078j = nVar;
        this.f21079k = new C3482d(this.f21077i, nVar, this.f21071c);
        C3534p2 p2Var = new C3534p2(this.f21070b, this.f21072d, C3539r.f21189a, C3547t.f21200a, this.f21071c, this.f21074f, this.f21076h, this.f21079k, this.f21077i);
        this.f21080l = p2Var;
        this.f21081m = C3549t1.m24942a(new C3497g2(this.f21071c, p2Var, this.f21074f));
    }

    /* synthetic */ C3498h(Application application, C3494g gVar) {
        this(application);
    }

    /* renamed from: b */
    public final C3485d2 mo14566b() {
        return this.f21081m.zza();
    }

    /* renamed from: c */
    public final C3470a0 mo14567c() {
        return this.f21074f.zza();
    }
}
