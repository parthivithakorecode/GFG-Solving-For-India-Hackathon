package p057h4;

import android.os.Bundle;
import android.util.Log;
import java.util.Map;
import p005a4.C0128c;
import p005a4.C0144j;
import p005a4.C0145k;
import p057h4.C2737b;

/* renamed from: h4.a */
final class C2736a implements C0145k.C0149c {

    /* renamed from: a */
    private final C2737b f19301a;

    /* renamed from: b */
    private C0145k f19302b;

    C2736a(C2737b bVar) {
        this.f19301a = bVar;
    }

    /* renamed from: a */
    private static Bundle m21757a(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            bundle.putString(next, map.get(next));
        }
        return bundle;
    }

    /* renamed from: b */
    private void m21758b(C0145k.C0150d dVar, String str) {
        dVar.mo338a(Boolean.valueOf(this.f19301a.mo12766a(str)));
    }

    /* renamed from: c */
    private void m21759c(C0145k.C0150d dVar) {
        this.f19301a.mo12767b();
        dVar.mo338a((Object) null);
    }

    /* renamed from: d */
    private void m21760d(C0144j jVar, C0145k.C0150d dVar, String str) {
        boolean booleanValue = ((Boolean) jVar.mo332a("useWebView")).booleanValue();
        boolean booleanValue2 = ((Boolean) jVar.mo332a("enableJavaScript")).booleanValue();
        boolean booleanValue3 = ((Boolean) jVar.mo332a("enableDomStorage")).booleanValue();
        C2737b.C2738a c = this.f19301a.mo12768c(str, m21757a((Map) jVar.mo332a("headers")), booleanValue, booleanValue2, booleanValue3);
        if (c == C2737b.C2738a.NO_ACTIVITY) {
            dVar.mo339b("NO_ACTIVITY", "Launching a URL requires a foreground activity.", (Object) null);
        } else if (c == C2737b.C2738a.ACTIVITY_NOT_FOUND) {
            dVar.mo339b("ACTIVITY_NOT_FOUND", String.format("No Activity found to handle intent { %s }", new Object[]{str}), (Object) null);
        } else {
            dVar.mo338a(Boolean.TRUE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo12764e(C0128c cVar) {
        if (this.f19302b != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            mo12765f();
        }
        C0145k kVar = new C0145k(cVar, "plugins.flutter.io/url_launcher_android");
        this.f19302b = kVar;
        kVar.mo337e(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo12765f() {
        C0145k kVar = this.f19302b;
        if (kVar == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        kVar.mo337e((C0145k.C0149c) null);
        this.f19302b = null;
    }

    public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
        String str = (String) jVar.mo332a("url");
        String str2 = jVar.f269a;
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case -1109843021:
                if (str2.equals("launch")) {
                    c = 0;
                    break;
                }
                break;
            case -185306205:
                if (str2.equals("canLaunch")) {
                    c = 1;
                    break;
                }
                break;
            case -121617663:
                if (str2.equals("closeWebView")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m21760d(jVar, dVar, str);
                return;
            case 1:
                m21758b(dVar, str);
                return;
            case 2:
                m21759c(dVar);
                return;
            default:
                dVar.mo340c();
                return;
        }
    }
}
