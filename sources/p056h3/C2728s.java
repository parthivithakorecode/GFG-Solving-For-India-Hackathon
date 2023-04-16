package p056h3;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: h3.s */
class C2728s implements C2724o {

    /* renamed from: a */
    final String f19276a;

    /* renamed from: b */
    final int f19277b;

    /* renamed from: c */
    private HandlerThread f19278c;

    /* renamed from: d */
    private Handler f19279d;

    C2728s(String str, int i) {
        this.f19276a = str;
        this.f19277b = i;
    }

    /* renamed from: a */
    public void mo12752a(C2719k kVar) {
        this.f19279d.post(kVar.f19256b);
    }

    /* renamed from: b */
    public void mo12753b() {
        HandlerThread handlerThread = this.f19278c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f19278c = null;
            this.f19279d = null;
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo12754c(C2716i iVar, Runnable runnable) {
        C2722n.m21735a(this, iVar, runnable);
    }

    public void start() {
        HandlerThread handlerThread = new HandlerThread(this.f19276a, this.f19277b);
        this.f19278c = handlerThread;
        handlerThread.start();
        this.f19279d = new Handler(this.f19278c.getLooper());
    }
}
