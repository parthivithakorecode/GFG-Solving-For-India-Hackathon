package p043f4;

import android.app.Activity;
import android.content.Context;
import p005a4.C0128c;
import p005a4.C0145k;
import p132s3.C4047a;
import p138t3.C4076a;
import p138t3.C4078c;

/* renamed from: f4.c */
public class C2611c implements C4047a, C4076a {

    /* renamed from: a */
    private C2609a f18978a;

    /* renamed from: b */
    private C2610b f18979b;

    /* renamed from: c */
    private C0145k f18980c;

    /* renamed from: a */
    private void m21318a(Context context, Activity activity, C0128c cVar) {
        this.f18980c = new C0145k(cVar, "plugins.flutter.io/share");
        C2610b bVar = new C2610b(context, activity);
        this.f18979b = bVar;
        C2609a aVar = new C2609a(bVar);
        this.f18978a = aVar;
        this.f18980c.mo337e(aVar);
    }

    public void onAttachedToActivity(C4078c cVar) {
        this.f18979b.mo12500j(cVar.mo13517d());
    }

    public void onAttachedToEngine(C4047a.C4049b bVar) {
        m21318a(bVar.mo15539a(), (Activity) null, bVar.mo15540b());
    }

    public void onDetachedFromActivity() {
        this.f18979b.mo12500j((Activity) null);
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(C4047a.C4049b bVar) {
        this.f18980c.mo337e((C0145k.C0149c) null);
        this.f18980c = null;
        this.f18979b = null;
    }

    public void onReattachedToActivityForConfigChanges(C4078c cVar) {
        onAttachedToActivity(cVar);
    }
}
