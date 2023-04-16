package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.C1114p;
import androidx.work.impl.background.systemalarm.C1259e;
import p089m0.C3646j;
import p147v0.C4180j;

public class SystemAlarmService extends C1114p implements C1259e.C1262c {

    /* renamed from: i */
    private static final String f3390i = C3646j.m25231f("SystemAlarmService");

    /* renamed from: g */
    private C1259e f3391g;

    /* renamed from: h */
    private boolean f3392h;

    /* renamed from: f */
    private void m5045f() {
        C1259e eVar = new C1259e(this);
        this.f3391g = eVar;
        eVar.mo4542m(this);
    }

    /* renamed from: b */
    public void mo4525b() {
        this.f3392h = true;
        C3646j.m25229c().mo14806a(f3390i, "All commands completed in dispatcher", new Throwable[0]);
        C4180j.m26634a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        m5045f();
        this.f3392h = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f3392h = true;
        this.f3391g.mo4540j();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f3392h) {
            C3646j.m25229c().mo14808d(f3390i, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f3391g.mo4540j();
            m5045f();
            this.f3392h = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3391g.mo4534b(intent, i2);
        return 3;
    }
}
