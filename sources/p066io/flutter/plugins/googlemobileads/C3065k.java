package p066io.flutter.plugins.googlemobileads;

import android.util.Log;
import java.lang.ref.WeakReference;
import p002a1.C0030n;
import p012b1.C1294c;
import p012b1.C1295d;
import p012b1.C1296e;
import p066io.flutter.plugins.googlemobileads.C3042e;

/* renamed from: io.flutter.plugins.googlemobileads.k */
class C3065k extends C3042e.C3046d {

    /* renamed from: b */
    private final C3028a f20133b;

    /* renamed from: c */
    private final String f20134c;

    /* renamed from: d */
    private final C3059i f20135d;

    /* renamed from: e */
    private C1294c f20136e;

    /* renamed from: f */
    private final C3056h f20137f;

    /* renamed from: io.flutter.plugins.googlemobileads.k$a */
    private static final class C3066a extends C1295d implements C1296e {

        /* renamed from: f */
        private final WeakReference<C3065k> f20138f;

        C3066a(C3065k kVar) {
            this.f20138f = new WeakReference<>(kVar);
        }

        /* renamed from: b */
        public void mo4622b(String str, String str2) {
            if (this.f20138f.get() != null) {
                ((C3065k) this.f20138f.get()).mo13845i(str, str2);
            }
        }

        /* renamed from: d */
        public void mo31d(C0030n nVar) {
            if (this.f20138f.get() != null) {
                ((C3065k) this.f20138f.get()).mo13843g(nVar);
            }
        }

        /* renamed from: f */
        public void mo32e(C1294c cVar) {
            if (this.f20138f.get() != null) {
                ((C3065k) this.f20138f.get()).mo13844h(cVar);
            }
        }
    }

    public C3065k(int i, C3028a aVar, String str, C3059i iVar, C3056h hVar) {
        super(i);
        this.f20133b = aVar;
        this.f20134c = str;
        this.f20135d = iVar;
        this.f20137f = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13771b() {
        this.f20136e = null;
    }

    /* renamed from: d */
    public void mo13772d(boolean z) {
        C1294c cVar = this.f20136e;
        if (cVar == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
        } else {
            cVar.mo6102d(z);
        }
    }

    /* renamed from: e */
    public void mo13773e() {
        if (this.f20136e == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
        } else if (this.f20133b.mo13747f() == null) {
            Log.e("FltGAMInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.f20136e.mo6101c(new C3083s(this.f20133b, this.f20081a));
            this.f20136e.mo6104f(this.f20133b.mo13747f());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo13842f() {
        C3056h hVar = this.f20137f;
        String str = this.f20134c;
        hVar.mo13819b(str, this.f20135d.mo13830k(str), new C3066a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo13843g(C0030n nVar) {
        this.f20133b.mo13751k(this.f20081a, new C3042e.C3045c(nVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo13844h(C1294c cVar) {
        this.f20136e = cVar;
        cVar.mo4621h(new C3066a(this));
        cVar.mo6103e(new C3030a0(this.f20133b, this));
        this.f20133b.mo13753m(this.f20081a, cVar.mo6100a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo13845i(String str, String str2) {
        this.f20133b.mo13757q(this.f20081a, str, str2);
    }
}
