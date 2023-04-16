package p057h4;

import android.app.Activity;
import android.util.Log;
import p132s3.C4047a;
import p138t3.C4076a;
import p138t3.C4078c;

/* renamed from: h4.c */
public final class C2739c implements C4047a, C4076a {

    /* renamed from: a */
    private C2736a f19309a;

    /* renamed from: b */
    private C2737b f19310b;

    public void onAttachedToActivity(C4078c cVar) {
        if (this.f19309a == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f19310b.mo12769d(cVar.mo13517d());
        }
    }

    public void onAttachedToEngine(C4047a.C4049b bVar) {
        C2737b bVar2 = new C2737b(bVar.mo15539a(), (Activity) null);
        this.f19310b = bVar2;
        C2736a aVar = new C2736a(bVar2);
        this.f19309a = aVar;
        aVar.mo12764e(bVar.mo15540b());
    }

    public void onDetachedFromActivity() {
        if (this.f19309a == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f19310b.mo12769d((Activity) null);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(C4047a.C4049b bVar) {
        C2736a aVar = this.f19309a;
        if (aVar == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        aVar.mo12765f();
        this.f19309a = null;
        this.f19310b = null;
    }

    public void onReattachedToActivityForConfigChanges(C4078c cVar) {
        onAttachedToActivity(cVar);
    }
}
