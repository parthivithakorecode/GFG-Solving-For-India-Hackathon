package p066io.flutter.plugins.googlemobileads;

import android.util.Log;
import java.lang.ref.WeakReference;
import p002a1.C0030n;
import p019c1.C1432a;
import p064i4.C2849c;
import p066io.flutter.plugins.googlemobileads.C3042e;

/* renamed from: io.flutter.plugins.googlemobileads.p */
class C3079p extends C3042e.C3046d {

    /* renamed from: b */
    private final C3028a f20171b;

    /* renamed from: c */
    private final String f20172c;

    /* renamed from: d */
    private final int f20173d;

    /* renamed from: e */
    private final C3067l f20174e;

    /* renamed from: f */
    private final C3059i f20175f;

    /* renamed from: g */
    private C1432a f20176g;

    /* renamed from: h */
    private final C3056h f20177h;

    /* renamed from: io.flutter.plugins.googlemobileads.p$a */
    private static final class C3080a extends C1432a.C1433a {

        /* renamed from: a */
        private final WeakReference<C3079p> f20178a;

        C3080a(C3079p pVar) {
            this.f20178a = new WeakReference<>(pVar);
        }

        /* renamed from: d */
        public void mo31d(C0030n nVar) {
            if (this.f20178a.get() != null) {
                ((C3079p) this.f20178a.get()).m23563j(nVar);
            }
        }

        /* renamed from: f */
        public void mo32e(C1432a aVar) {
            if (this.f20178a.get() != null) {
                ((C3079p) this.f20178a.get()).m23564k(aVar);
            }
        }
    }

    C3079p(int i, int i2, C3028a aVar, String str, C3067l lVar, C3059i iVar, C3056h hVar) {
        super(i);
        C2849c.m22351b((lVar == null && iVar == null) ? false : true, "One of request and adManagerAdRequest must be non-null.");
        this.f20171b = aVar;
        this.f20173d = i2;
        this.f20172c = str;
        this.f20174e = lVar;
        this.f20175f = iVar;
        this.f20177h = hVar;
    }

    /* renamed from: h */
    private int m23562h() {
        int i = this.f20173d;
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        Log.e("FlutterAppOpenAd", "Passed unknown app open orientation: " + this.f20173d);
        return 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m23563j(C0030n nVar) {
        this.f20171b.mo13751k(this.f20081a, new C3042e.C3045c(nVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m23564k(C1432a aVar) {
        this.f20176g = aVar;
        aVar.mo4843f(new C3030a0(this.f20171b, this));
        this.f20171b.mo13753m(this.f20081a, aVar.mo4840a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13771b() {
        this.f20176g = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo13772d(boolean z) {
        C1432a aVar = this.f20176g;
        if (aVar == null) {
            Log.w("FlutterAppOpenAd", "Tried to set immersive mode on app open ad before it was loaded");
        } else {
            aVar.mo4842e(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo13773e() {
        if (this.f20176g == null) {
            Log.w("FlutterAppOpenAd", "Tried to show app open ad before it was loaded");
        } else if (this.f20171b.mo13747f() == null) {
            Log.e("FlutterAppOpenAd", "Tried to show app open ad before activity was bound to the plugin.");
        } else {
            this.f20176g.mo4841d(new C3083s(this.f20171b, this.f20081a));
            this.f20176g.mo4844g(this.f20171b.mo13747f());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo13884i() {
        C3067l lVar = this.f20174e;
        if (lVar != null) {
            C3056h hVar = this.f20177h;
            String str = this.f20172c;
            hVar.mo13823f(str, lVar.mo13847b(str), m23562h(), new C3080a(this));
            return;
        }
        C3059i iVar = this.f20175f;
        if (iVar != null) {
            C3056h hVar2 = this.f20177h;
            String str2 = this.f20172c;
            hVar2.mo13818a(str2, iVar.mo13830k(str2), m23562h(), new C3080a(this));
        }
    }
}
