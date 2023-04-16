package p066io.flutter.plugins.googlemobileads;

import android.util.Log;
import java.lang.ref.WeakReference;
import p002a1.C0030n;
import p002a1.C0035s;
import p066io.flutter.plugins.googlemobileads.C3042e;
import p124r1.C3970a;
import p124r1.C3971b;
import p124r1.C3972c;
import p124r1.C3973d;

/* renamed from: io.flutter.plugins.googlemobileads.c0 */
class C3035c0 extends C3042e.C3046d {

    /* renamed from: b */
    private final C3028a f20060b;

    /* renamed from: c */
    private final String f20061c;

    /* renamed from: d */
    private final C3056h f20062d;

    /* renamed from: e */
    private final C3067l f20063e;

    /* renamed from: f */
    private final C3059i f20064f;

    /* renamed from: g */
    private final C3048e0 f20065g;

    /* renamed from: h */
    C3972c f20066h;

    /* renamed from: io.flutter.plugins.googlemobileads.c0$a */
    private static final class C3036a extends C3973d implements C3970a, C0035s {

        /* renamed from: f */
        private final WeakReference<C3035c0> f20067f;

        C3036a(C3035c0 c0Var) {
            this.f20067f = new WeakReference<>(c0Var);
        }

        /* renamed from: a */
        public void mo13779a() {
            if (this.f20067f.get() != null) {
                ((C3035c0) this.f20067f.get()).mo13777i();
            }
        }

        /* renamed from: c */
        public void mo106c(C3971b bVar) {
            if (this.f20067f.get() != null) {
                ((C3035c0) this.f20067f.get()).mo13778j(bVar);
            }
        }

        /* renamed from: d */
        public void mo31d(C0030n nVar) {
            if (this.f20067f.get() != null) {
                ((C3035c0) this.f20067f.get()).mo13775g(nVar);
            }
        }

        /* renamed from: f */
        public void mo32e(C3972c cVar) {
            if (this.f20067f.get() != null) {
                ((C3035c0) this.f20067f.get()).mo13776h(cVar);
            }
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.c0$b */
    static class C3037b {

        /* renamed from: a */
        final Integer f20068a;

        /* renamed from: b */
        final String f20069b;

        C3037b(Integer num, String str) {
            this.f20068a = num;
            this.f20069b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3037b)) {
                return false;
            }
            C3037b bVar = (C3037b) obj;
            if (!this.f20068a.equals(bVar.f20068a)) {
                return false;
            }
            return this.f20069b.equals(bVar.f20069b);
        }

        public int hashCode() {
            return (this.f20068a.hashCode() * 31) + this.f20069b.hashCode();
        }
    }

    public C3035c0(int i, C3028a aVar, String str, C3059i iVar, C3048e0 e0Var, C3056h hVar) {
        super(i);
        this.f20060b = aVar;
        this.f20061c = str;
        this.f20064f = iVar;
        this.f20063e = null;
        this.f20065g = e0Var;
        this.f20062d = hVar;
    }

    public C3035c0(int i, C3028a aVar, String str, C3067l lVar, C3048e0 e0Var, C3056h hVar) {
        super(i);
        this.f20060b = aVar;
        this.f20061c = str;
        this.f20063e = lVar;
        this.f20064f = null;
        this.f20065g = e0Var;
        this.f20062d = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13771b() {
        this.f20066h = null;
    }

    /* renamed from: d */
    public void mo13772d(boolean z) {
        C3972c cVar = this.f20066h;
        if (cVar == null) {
            Log.e("FlutterRewardedAd", "Error setting immersive mode in rewarded ad - the rewarded ad wasn't loaded yet.");
        } else {
            cVar.mo10075e(z);
        }
    }

    /* renamed from: e */
    public void mo13773e() {
        if (this.f20066h == null) {
            Log.e("FlutterRewardedAd", "Error showing rewarded - the rewarded ad wasn't loaded yet.");
        } else if (this.f20060b.mo13747f() == null) {
            Log.e("FlutterRewardedAd", "Tried to show rewarded ad before activity was bound to the plugin.");
        } else {
            this.f20066h.mo10074d(new C3083s(this.f20060b, this.f20081a));
            this.f20066h.mo10076f(new C3036a(this));
            this.f20066h.mo10079i(this.f20060b.mo13747f(), new C3036a(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo13774f() {
        C3036a aVar = new C3036a(this);
        C3067l lVar = this.f20063e;
        if (lVar != null) {
            C3056h hVar = this.f20062d;
            String str = this.f20061c;
            hVar.mo13826i(str, lVar.mo13847b(str), aVar);
            return;
        }
        C3059i iVar = this.f20064f;
        if (iVar != null) {
            C3056h hVar2 = this.f20062d;
            String str2 = this.f20061c;
            hVar2.mo13821d(str2, iVar.mo13830k(str2), aVar);
            return;
        }
        Log.e("FlutterRewardedAd", "A null or invalid ad request was provided.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo13775g(C0030n nVar) {
        this.f20060b.mo13751k(this.f20081a, new C3042e.C3045c(nVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo13776h(C3972c cVar) {
        this.f20066h = cVar;
        C3048e0 e0Var = this.f20065g;
        if (e0Var != null) {
            cVar.mo10078h(e0Var.mo13810a());
        }
        cVar.mo10077g(new C3030a0(this.f20060b, this));
        this.f20060b.mo13753m(this.f20081a, cVar.mo10073a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo13777i() {
        this.f20060b.mo13754n(this.f20081a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo13778j(C3971b bVar) {
        this.f20060b.mo13761u(this.f20081a, new C3037b(Integer.valueOf(bVar.mo10316b()), bVar.mo10315a()));
    }
}
