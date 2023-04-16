package p174z3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005a4.C0144j;
import p005a4.C0145k;
import p005a4.C0159s;
import p099n3.C3764a;
import p099n3.C3768b;
import p106o3.C3832a;
import p113p3.C3925a;

/* renamed from: z3.b */
public class C4543b {

    /* renamed from: a */
    private final C0145k f23075a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3925a f23076b = C3764a.m25580e().mo15005a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<String, List<C0145k.C0150d>> f23077c = new HashMap();

    /* renamed from: d */
    final C0145k.C0149c f23078d;

    /* renamed from: z3.b$a */
    class C4544a implements C0145k.C0149c {
        C4544a() {
        }

        public void onMethodCall(C0144j jVar, C0145k.C0150d dVar) {
            String str;
            if (C4543b.this.f23076b != null) {
                String str2 = jVar.f269a;
                Map map = (Map) jVar.mo333b();
                C3768b.m25592f("DeferredComponentChannel", "Received '" + str2 + "' message.");
                int intValue = ((Integer) map.get("loadingUnitId")).intValue();
                String str3 = (String) map.get("componentName");
                str2.hashCode();
                char c = 65535;
                switch (str2.hashCode()) {
                    case -1004447972:
                        if (str2.equals("uninstallDeferredComponent")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 399701758:
                        if (str2.equals("getDeferredComponentInstallState")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 520962947:
                        if (str2.equals("installDeferredComponent")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        C4543b.this.f23076b.mo15377c(intValue, str3);
                        str = null;
                        break;
                    case 1:
                        str = C4543b.this.f23076b.mo15375a(intValue, str3);
                        break;
                    case 2:
                        C4543b.this.f23076b.mo15380e(intValue, str3);
                        if (!C4543b.this.f23077c.containsKey(str3)) {
                            C4543b.this.f23077c.put(str3, new ArrayList());
                        }
                        ((List) C4543b.this.f23077c.get(str3)).add(dVar);
                        return;
                    default:
                        dVar.mo340c();
                        return;
                }
                dVar.mo338a(str);
            }
        }
    }

    public C4543b(C3832a aVar) {
        C4544a aVar2 = new C4544a();
        this.f23078d = aVar2;
        C0145k kVar = new C0145k(aVar, "flutter/deferredcomponent", C0159s.f284b);
        this.f23075a = kVar;
        kVar.mo337e(aVar2);
    }

    /* renamed from: c */
    public void mo16223c(C3925a aVar) {
        this.f23076b = aVar;
    }
}
