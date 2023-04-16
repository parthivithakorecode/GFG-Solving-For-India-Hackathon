package p056h3;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: h3.m */
class C2721m {

    /* renamed from: a */
    private final String f19259a;

    /* renamed from: b */
    private final int f19260b;

    /* renamed from: c */
    private HandlerThread f19261c;

    /* renamed from: d */
    private Handler f19262d;

    /* renamed from: e */
    protected Runnable f19263e;

    /* renamed from: f */
    private C2719k f19264f;

    C2721m(String str, int i) {
        this.f19259a = str;
        this.f19260b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo12746b() {
        C2719k kVar = this.f19264f;
        return kVar != null && kVar.mo12744b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Integer mo12747d() {
        C2719k kVar = this.f19264f;
        if (kVar != null) {
            return kVar.mo12743a();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo12748e(C2719k kVar) {
        this.f19262d.post(new C2720l(this, kVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void mo12749f() {
        HandlerThread handlerThread = this.f19261c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f19261c = null;
            this.f19262d = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void mo12750g(Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(this.f19259a, this.f19260b);
        this.f19261c = handlerThread;
        handlerThread.start();
        this.f19262d = new Handler(this.f19261c.getLooper());
        this.f19263e = runnable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void m21728c(C2719k kVar) {
        kVar.f19256b.run();
        this.f19264f = kVar;
        this.f19263e.run();
    }
}
