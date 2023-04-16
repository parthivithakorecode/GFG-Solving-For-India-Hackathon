package p066io.flutter.plugins.googlemobileads;

import android.view.ViewGroup;
import java.util.List;
import p002a1.C0024h;
import p012b1.C1293b;
import p012b1.C1296e;
import p064i4.C2849c;
import p066io.flutter.plugin.platform.C3007f;

/* renamed from: io.flutter.plugins.googlemobileads.j */
class C3063j extends C3042e implements C3051g {

    /* renamed from: b */
    protected final C3028a f20126b;

    /* renamed from: c */
    private final String f20127c;

    /* renamed from: d */
    private final List<C3069m> f20128d;

    /* renamed from: e */
    private final C3059i f20129e;

    /* renamed from: f */
    private final C3034c f20130f;

    /* renamed from: g */
    protected C1293b f20131g;

    /* renamed from: io.flutter.plugins.googlemobileads.j$a */
    class C3064a implements C1296e {
        C3064a() {
        }

        /* renamed from: b */
        public void mo4622b(String str, String str2) {
            C3063j jVar = C3063j.this;
            jVar.f20126b.mo13757q(jVar.f20081a, str, str2);
        }
    }

    public C3063j(int i, C3028a aVar, String str, List<C3069m> list, C3059i iVar, C3034c cVar) {
        super(i);
        C2849c.m22350a(aVar);
        C2849c.m22350a(str);
        C2849c.m22350a(list);
        C2849c.m22350a(iVar);
        this.f20126b = aVar;
        this.f20127c = str;
        this.f20128d = list;
        this.f20129e = iVar;
        this.f20130f = cVar;
    }

    /* renamed from: a */
    public void mo13783a() {
        C1293b bVar = this.f20131g;
        if (bVar != null) {
            this.f20126b.mo13753m(this.f20081a, bVar.getResponseInfo());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13771b() {
        C1293b bVar = this.f20131g;
        if (bVar != null) {
            bVar.mo83a();
            this.f20131g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C3007f mo13784c() {
        C1293b bVar = this.f20131g;
        if (bVar == null) {
            return null;
        }
        return new C3033b0(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C3069m mo13840d() {
        C1293b bVar = this.f20131g;
        if (bVar == null || bVar.getAdSize() == null) {
            return null;
        }
        return new C3069m(this.f20131g.getAdSize());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo13841e() {
        C1293b a = this.f20130f.mo13769a();
        this.f20131g = a;
        if (this instanceof C3038d) {
            a.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        this.f20131g.setAdUnitId(this.f20127c);
        this.f20131g.setAppEventListener(new C3064a());
        C0024h[] hVarArr = new C0024h[this.f20128d.size()];
        for (int i = 0; i < this.f20128d.size(); i++) {
            hVarArr[i] = this.f20128d.get(i).mo13872a();
        }
        this.f20131g.setAdSizes(hVarArr);
        this.f20131g.setAdListener(new C3082r(this.f20081a, this.f20126b, this));
        this.f20131g.mo4612e(this.f20129e.mo13830k(this.f20127c));
    }
}
