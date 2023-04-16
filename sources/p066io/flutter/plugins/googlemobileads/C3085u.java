package p066io.flutter.plugins.googlemobileads;

import android.util.Log;
import java.lang.ref.WeakReference;
import p002a1.C0030n;
import p066io.flutter.plugins.googlemobileads.C3042e;
import p076k1.C3296a;
import p076k1.C3297b;

/* renamed from: io.flutter.plugins.googlemobileads.u */
class C3085u extends C3042e.C3046d {

    /* renamed from: b */
    private final C3028a f20189b;

    /* renamed from: c */
    private final String f20190c;

    /* renamed from: d */
    private final C3067l f20191d;

    /* renamed from: e */
    private C3296a f20192e;

    /* renamed from: f */
    private final C3056h f20193f;

    /* renamed from: io.flutter.plugins.googlemobileads.u$a */
    private static final class C3086a extends C3297b {

        /* renamed from: a */
        private final WeakReference<C3085u> f20194a;

        C3086a(C3085u uVar) {
            this.f20194a = new WeakReference<>(uVar);
        }

        /* renamed from: d */
        public void mo31d(C0030n nVar) {
            if (this.f20194a.get() != null) {
                ((C3085u) this.f20194a.get()).mo13889g(nVar);
            }
        }

        /* renamed from: f */
        public void mo32e(C3296a aVar) {
            if (this.f20194a.get() != null) {
                ((C3085u) this.f20194a.get()).mo13890h(aVar);
            }
        }
    }

    public C3085u(int i, C3028a aVar, String str, C3067l lVar, C3056h hVar) {
        super(i);
        this.f20189b = aVar;
        this.f20190c = str;
        this.f20191d = lVar;
        this.f20193f = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13771b() {
        this.f20192e = null;
    }

    /* renamed from: d */
    public void mo13772d(boolean z) {
        C3296a aVar = this.f20192e;
        if (aVar == null) {
            Log.e("FlutterInterstitialAd", "Error setting immersive mode in interstitial ad - the interstitial ad wasn't loaded yet.");
        } else {
            aVar.mo6102d(z);
        }
    }

    /* renamed from: e */
    public void mo13773e() {
        if (this.f20192e == null) {
            Log.e("FlutterInterstitialAd", "Error showing interstitial - the interstitial ad wasn't loaded yet.");
        } else if (this.f20189b.mo13747f() == null) {
            Log.e("FlutterInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.f20192e.mo6101c(new C3083s(this.f20189b, this.f20081a));
            this.f20192e.mo6104f(this.f20189b.mo13747f());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo13888f() {
        String str;
        C3067l lVar;
        if (this.f20189b != null && (str = this.f20190c) != null && (lVar = this.f20191d) != null) {
            this.f20193f.mo13824g(str, lVar.mo13847b(str), new C3086a(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo13889g(C0030n nVar) {
        this.f20189b.mo13751k(this.f20081a, new C3042e.C3045c(nVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo13890h(C3296a aVar) {
        this.f20192e = aVar;
        aVar.mo6103e(new C3030a0(this.f20189b, this));
        this.f20189b.mo13753m(this.f20081a, aVar.mo6100a());
    }
}
