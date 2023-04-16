package p159x0;

import android.app.Activity;
import p005a4.C0128c;
import p005a4.C0145k;
import p132s3.C4047a;
import p138t3.C4076a;
import p138t3.C4078c;

/* renamed from: x0.a */
public class C4276a implements C4047a, C4076a {

    /* renamed from: a */
    private C0145k f22563a;

    /* renamed from: b */
    private C4277b f22564b;

    /* renamed from: c */
    private C4078c f22565c;

    /* renamed from: a */
    private void m26811a(C0128c cVar, C4277b bVar) {
        C0145k kVar = new C0145k(cVar, "flutter_mailer");
        this.f22563a = kVar;
        this.f22564b = bVar;
        kVar.mo337e(bVar);
    }

    /* renamed from: b */
    private void m26812b() {
        this.f22563a.mo337e((C0145k.C0149c) null);
        C4078c cVar = this.f22565c;
        if (cVar != null) {
            cVar.mo13515b(this.f22564b);
        }
        this.f22563a = null;
        this.f22564b = null;
        this.f22565c = null;
    }

    public void onAttachedToActivity(C4078c cVar) {
        this.f22565c = cVar;
        cVar.mo13518e(this.f22564b);
        this.f22564b.mo15837f(this.f22565c.mo13517d());
    }

    public void onAttachedToEngine(C4047a.C4049b bVar) {
        m26811a(bVar.mo15540b(), new C4277b(bVar.mo15539a(), (Activity) null));
    }

    public void onDetachedFromActivity() {
        this.f22564b.mo15837f((Activity) null);
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(C4047a.C4049b bVar) {
        m26812b();
    }

    public void onReattachedToActivityForConfigChanges(C4078c cVar) {
        onAttachedToActivity(cVar);
    }
}
