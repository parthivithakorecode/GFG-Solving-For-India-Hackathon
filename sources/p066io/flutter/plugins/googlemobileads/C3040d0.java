package p066io.flutter.plugins.googlemobileads;

import android.util.Log;
import java.lang.ref.WeakReference;
import p002a1.C0030n;
import p002a1.C0035s;
import p066io.flutter.plugins.googlemobileads.C3035c0;
import p066io.flutter.plugins.googlemobileads.C3042e;
import p124r1.C3970a;
import p124r1.C3971b;
import p130s1.C4016a;
import p130s1.C4017b;

/* renamed from: io.flutter.plugins.googlemobileads.d0 */
class C3040d0 extends C3042e.C3046d {

    /* renamed from: b */
    private final C3028a f20073b;

    /* renamed from: c */
    private final String f20074c;

    /* renamed from: d */
    private final C3056h f20075d;

    /* renamed from: e */
    private final C3067l f20076e;

    /* renamed from: f */
    private final C3059i f20077f;

    /* renamed from: g */
    private final C3048e0 f20078g;

    /* renamed from: h */
    C4016a f20079h;

    /* renamed from: io.flutter.plugins.googlemobileads.d0$a */
    private static final class C3041a extends C4017b implements C3970a, C0035s {

        /* renamed from: f */
        private final WeakReference<C3040d0> f20080f;

        C3041a(C3040d0 d0Var) {
            this.f20080f = new WeakReference<>(d0Var);
        }

        /* renamed from: a */
        public void mo13779a() {
            if (this.f20080f.get() != null) {
                ((C3040d0) this.f20080f.get()).mo13790i();
            }
        }

        /* renamed from: c */
        public void mo106c(C3971b bVar) {
            if (this.f20080f.get() != null) {
                ((C3040d0) this.f20080f.get()).mo13791j(bVar);
            }
        }

        /* renamed from: d */
        public void mo31d(C0030n nVar) {
            if (this.f20080f.get() != null) {
                ((C3040d0) this.f20080f.get()).mo13788g(nVar);
            }
        }

        /* renamed from: f */
        public void mo32e(C4016a aVar) {
            if (this.f20080f.get() != null) {
                ((C3040d0) this.f20080f.get()).mo13789h(aVar);
            }
        }
    }

    public C3040d0(int i, C3028a aVar, String str, C3059i iVar, C3048e0 e0Var, C3056h hVar) {
        super(i);
        this.f20073b = aVar;
        this.f20074c = str;
        this.f20077f = iVar;
        this.f20076e = null;
        this.f20078g = e0Var;
        this.f20075d = hVar;
    }

    public C3040d0(int i, C3028a aVar, String str, C3067l lVar, C3048e0 e0Var, C3056h hVar) {
        super(i);
        this.f20073b = aVar;
        this.f20074c = str;
        this.f20076e = lVar;
        this.f20077f = null;
        this.f20078g = e0Var;
        this.f20075d = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13771b() {
        this.f20079h = null;
    }

    /* renamed from: d */
    public void mo13772d(boolean z) {
        C4016a aVar = this.f20079h;
        if (aVar == null) {
            Log.e("FlutterRIAd", "Error setting immersive mode in rewarded interstitial ad - the rewarded interstitial ad wasn't loaded yet.");
        } else {
            aVar.mo12240e(z);
        }
    }

    /* renamed from: e */
    public void mo13773e() {
        if (this.f20079h == null) {
            Log.e("FlutterRIAd", "Error showing rewarded interstitial - the rewarded interstitial ad wasn't loaded yet.");
        } else if (this.f20073b.mo13747f() == null) {
            Log.e("FlutterRIAd", "Tried to show rewarded interstitial ad before activity was bound to the plugin.");
        } else {
            this.f20079h.mo12239d(new C3083s(this.f20073b, this.f20081a));
            this.f20079h.mo12241f(new C3041a(this));
            this.f20079h.mo12244i(this.f20073b.mo13747f(), new C3041a(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo13787f() {
        C3041a aVar = new C3041a(this);
        C3067l lVar = this.f20076e;
        if (lVar != null) {
            C3056h hVar = this.f20075d;
            String str = this.f20074c;
            hVar.mo13827j(str, lVar.mo13847b(str), aVar);
            return;
        }
        C3059i iVar = this.f20077f;
        if (iVar != null) {
            C3056h hVar2 = this.f20075d;
            String str2 = this.f20074c;
            hVar2.mo13822e(str2, iVar.mo13830k(str2), aVar);
            return;
        }
        Log.e("FlutterRIAd", "A null or invalid ad request was provided.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo13788g(C0030n nVar) {
        this.f20073b.mo13751k(this.f20081a, new C3042e.C3045c(nVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo13789h(C4016a aVar) {
        this.f20079h = aVar;
        C3048e0 e0Var = this.f20078g;
        if (e0Var != null) {
            aVar.mo12243h(e0Var.mo13810a());
        }
        aVar.mo12242g(new C3030a0(this.f20073b, this));
        this.f20073b.mo13753m(this.f20081a, aVar.mo12238a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo13790i() {
        this.f20073b.mo13754n(this.f20081a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo13791j(C3971b bVar) {
        this.f20073b.mo13761u(this.f20081a, new C3035c0.C3037b(Integer.valueOf(bVar.mo10316b()), bVar.mo10315a()));
    }
}
