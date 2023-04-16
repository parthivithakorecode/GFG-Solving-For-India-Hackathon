package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C1114p;
import androidx.work.impl.foreground.C1268a;
import p089m0.C3646j;

public class SystemForegroundService extends C1114p implements C1268a.C1270b {

    /* renamed from: k */
    private static final String f3435k = C3646j.m25231f("SystemFgService");

    /* renamed from: l */
    private static SystemForegroundService f3436l = null;

    /* renamed from: g */
    private Handler f3437g;

    /* renamed from: h */
    private boolean f3438h;

    /* renamed from: i */
    C1268a f3439i;

    /* renamed from: j */
    NotificationManager f3440j;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    class C1265a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f3441f;

        /* renamed from: g */
        final /* synthetic */ Notification f3442g;

        /* renamed from: h */
        final /* synthetic */ int f3443h;

        C1265a(int i, Notification notification, int i2) {
            this.f3441f = i;
            this.f3442g = notification;
            this.f3443h = i2;
        }

        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f3441f, this.f3442g, this.f3443h);
            } else {
                SystemForegroundService.this.startForeground(this.f3441f, this.f3442g);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    class C1266b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f3445f;

        /* renamed from: g */
        final /* synthetic */ Notification f3446g;

        C1266b(int i, Notification notification) {
            this.f3445f = i;
            this.f3446g = notification;
        }

        public void run() {
            SystemForegroundService.this.f3440j.notify(this.f3445f, this.f3446g);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    class C1267c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f3448f;

        C1267c(int i) {
            this.f3448f = i;
        }

        public void run() {
            SystemForegroundService.this.f3440j.cancel(this.f3448f);
        }
    }

    /* renamed from: f */
    private void m5095f() {
        this.f3437g = new Handler(Looper.getMainLooper());
        this.f3440j = (NotificationManager) getApplicationContext().getSystemService("notification");
        C1268a aVar = new C1268a(getApplicationContext());
        this.f3439i = aVar;
        aVar.mo4564m(this);
    }

    /* renamed from: c */
    public void mo4554c(int i) {
        this.f3437g.post(new C1267c(i));
    }

    /* renamed from: d */
    public void mo4555d(int i, int i2, Notification notification) {
        this.f3437g.post(new C1265a(i, notification, i2));
    }

    /* renamed from: e */
    public void mo4556e(int i, Notification notification) {
        this.f3437g.post(new C1266b(i, notification));
    }

    public void onCreate() {
        super.onCreate();
        f3436l = this;
        m5095f();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f3439i.mo4562k();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f3438h) {
            C3646j.m25229c().mo14808d(f3435k, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f3439i.mo4562k();
            m5095f();
            this.f3438h = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3439i.mo4563l(intent);
        return 3;
    }

    public void stop() {
        this.f3438h = true;
        C3646j.m25229c().mo14806a(f3435k, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f3436l = null;
        stopSelf();
    }
}
