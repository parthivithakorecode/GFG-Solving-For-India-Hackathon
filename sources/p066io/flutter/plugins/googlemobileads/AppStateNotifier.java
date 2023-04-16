package p066io.flutter.plugins.googlemobileads;

import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1107k;
import androidx.lifecycle.C1110m;
import androidx.lifecycle.C1120v;
import p005a4.C0128c;
import p005a4.C0133d;
import p005a4.C0144j;
import p005a4.C0145k;

/* renamed from: io.flutter.plugins.googlemobileads.AppStateNotifier */
final class AppStateNotifier implements C1107k, C0145k.C0149c, C0133d.C0138d {

    /* renamed from: a */
    private final C0145k f20044a;

    /* renamed from: b */
    private final C0133d f20045b;

    /* renamed from: c */
    private C0133d.C0135b f20046c;

    AppStateNotifier(C0128c cVar) {
        C0145k kVar = new C0145k(cVar, "plugins.flutter.io/google_mobile_ads/app_state_method");
        this.f20044a = kVar;
        kVar.mo337e(this);
        C0133d dVar = new C0133d(cVar, "plugins.flutter.io/google_mobile_ads/app_state_event");
        this.f20045b = dVar;
        dVar.mo319d(this);
    }

    /* renamed from: d */
    public void mo321d(Object obj, C0133d.C0135b bVar) {
        this.f20046c = bVar;
    }

    /* renamed from: e */
    public void mo527e(C1110m mVar, C1099i.C1101b bVar) {
        C0133d.C0135b bVar2;
        String str;
        if (bVar == C1099i.C1101b.ON_START && (bVar2 = this.f20046c) != null) {
            str = "foreground";
        } else if (bVar == C1099i.C1101b.ON_STOP && (bVar2 = this.f20046c) != null) {
            str = "background";
        } else {
            return;
        }
        bVar2.mo320a(str);
    }

    /* renamed from: h */
    public void mo322h(Object obj) {
        this.f20046c = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo13741j() {
        C1120v.m4607k().mo491a().mo3830a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo13742k() {
        C1120v.m4607k().mo491a().mo3832c(this);
    }

    public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
        String str = jVar.f269a;
        str.hashCode();
        if (str.equals("stop")) {
            mo13742k();
        } else if (!str.equals("start")) {
            dVar.mo340c();
        } else {
            mo13741j();
        }
    }
}
