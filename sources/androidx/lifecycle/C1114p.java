package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: androidx.lifecycle.p */
public class C1114p extends Service implements C1110m {

    /* renamed from: f */
    private final C1078c0 f3000f = new C1078c0(this);

    /* renamed from: a */
    public C1099i mo491a() {
        return this.f3000f.mo3807a();
    }

    public IBinder onBind(Intent intent) {
        this.f3000f.mo3808b();
        return null;
    }

    public void onCreate() {
        this.f3000f.mo3809c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f3000f.mo3810d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        this.f3000f.mo3811e();
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
