package p072j4;

import android.content.Context;
import kotlin.jvm.internal.C3357i;
import p005a4.C0128c;
import p005a4.C0145k;
import p132s3.C4047a;

/* renamed from: j4.a */
public final class C3242a implements C4047a {

    /* renamed from: a */
    private C0145k f20621a;

    /* renamed from: a */
    private final void m24173a(C0128c cVar, Context context) {
        this.f20621a = new C0145k(cVar, "PonnamKarthik/fluttertoast");
        C3244c cVar2 = new C3244c(context);
        C0145k kVar = this.f20621a;
        if (kVar != null) {
            kVar.mo337e(cVar2);
        }
    }

    /* renamed from: b */
    private final void m24174b() {
        C0145k kVar = this.f20621a;
        if (kVar != null) {
            kVar.mo337e((C0145k.C0149c) null);
        }
        this.f20621a = null;
    }

    public void onAttachedToEngine(C4047a.C4049b bVar) {
        C3357i.m24508e(bVar, "binding");
        C0128c b = bVar.mo15540b();
        C3357i.m24507d(b, "binding.binaryMessenger");
        Context a = bVar.mo15539a();
        C3357i.m24507d(a, "binding.applicationContext");
        m24173a(b, a);
    }

    public void onDetachedFromEngine(C4047a.C4049b bVar) {
        C3357i.m24508e(bVar, "p0");
        m24174b();
    }
}
