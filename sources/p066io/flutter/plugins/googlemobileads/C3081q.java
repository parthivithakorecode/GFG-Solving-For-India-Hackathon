package p066io.flutter.plugins.googlemobileads;

import p002a1.C0026j;
import p064i4.C2849c;
import p066io.flutter.plugin.platform.C3007f;

/* renamed from: io.flutter.plugins.googlemobileads.q */
class C3081q extends C3042e implements C3051g {

    /* renamed from: b */
    private final C3028a f20179b;

    /* renamed from: c */
    private final String f20180c;

    /* renamed from: d */
    private final C3069m f20181d;

    /* renamed from: e */
    private final C3067l f20182e;

    /* renamed from: f */
    private final C3034c f20183f;

    /* renamed from: g */
    private C0026j f20184g;

    public C3081q(int i, C3028a aVar, String str, C3067l lVar, C3069m mVar, C3034c cVar) {
        super(i);
        C2849c.m22350a(aVar);
        C2849c.m22350a(str);
        C2849c.m22350a(lVar);
        C2849c.m22350a(mVar);
        this.f20179b = aVar;
        this.f20180c = str;
        this.f20182e = lVar;
        this.f20181d = mVar;
        this.f20183f = cVar;
    }

    /* renamed from: a */
    public void mo13783a() {
        C0026j jVar = this.f20184g;
        if (jVar != null) {
            this.f20179b.mo13753m(this.f20081a, jVar.getResponseInfo());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13771b() {
        C0026j jVar = this.f20184g;
        if (jVar != null) {
            jVar.mo83a();
            this.f20184g = null;
        }
    }

    /* renamed from: c */
    public C3007f mo13784c() {
        C0026j jVar = this.f20184g;
        if (jVar == null) {
            return null;
        }
        return new C3033b0(jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C3069m mo13886d() {
        C0026j jVar = this.f20184g;
        if (jVar == null || jVar.getAdSize() == null) {
            return null;
        }
        return new C3069m(this.f20184g.getAdSize());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo13887e() {
        C0026j b = this.f20183f.mo13770b();
        this.f20184g = b;
        b.setAdUnitId(this.f20180c);
        this.f20184g.setAdSize(this.f20181d.mo13872a());
        this.f20184g.setOnPaidEventListener(new C3030a0(this.f20179b, this));
        this.f20184g.setAdListener(new C3082r(this.f20081a, this.f20179b, this));
        this.f20184g.mo84b(this.f20182e.mo13847b(this.f20180c));
    }
}
