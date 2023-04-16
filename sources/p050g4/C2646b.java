package p050g4;

import android.content.Context;
import p005a4.C0128c;
import p005a4.C0145k;
import p132s3.C4047a;

/* renamed from: g4.b */
public class C2646b implements C4047a {

    /* renamed from: a */
    private C0145k f19023a;

    /* renamed from: b */
    private C2643a f19024b;

    /* renamed from: a */
    private void m21370a(C0128c cVar, Context context) {
        this.f19023a = new C0145k(cVar, "plugins.flutter.io/shared_preferences_android");
        C2643a aVar = new C2643a(context);
        this.f19024b = aVar;
        this.f19023a.mo337e(aVar);
    }

    /* renamed from: b */
    private void m21371b() {
        this.f19024b.mo12522f();
        this.f19024b = null;
        this.f19023a.mo337e((C0145k.C0149c) null);
        this.f19023a = null;
    }

    public void onAttachedToEngine(C4047a.C4049b bVar) {
        m21370a(bVar.mo15540b(), bVar.mo15539a());
    }

    public void onDetachedFromEngine(C4047a.C4049b bVar) {
        m21371b();
    }
}
