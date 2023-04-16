package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1125w;

/* renamed from: androidx.lifecycle.v */
public class C1120v implements C1110m {

    /* renamed from: n */
    private static final C1120v f3004n = new C1120v();

    /* renamed from: f */
    private int f3005f = 0;

    /* renamed from: g */
    private int f3006g = 0;

    /* renamed from: h */
    private boolean f3007h = true;

    /* renamed from: i */
    private boolean f3008i = true;

    /* renamed from: j */
    private Handler f3009j;

    /* renamed from: k */
    private final C1111n f3010k = new C1111n(this);

    /* renamed from: l */
    private Runnable f3011l = new C1121a();

    /* renamed from: m */
    C1125w.C1126a f3012m = new C1122b();

    /* renamed from: androidx.lifecycle.v$a */
    class C1121a implements Runnable {
        C1121a() {
        }

        public void run() {
            C1120v.this.mo3850g();
            C1120v.this.mo3851j();
        }
    }

    /* renamed from: androidx.lifecycle.v$b */
    class C1122b implements C1125w.C1126a {
        C1122b() {
        }

        /* renamed from: a */
        public void mo3853a() {
        }

        /* renamed from: b */
        public void mo3854b() {
            C1120v.this.mo3847d();
        }

        public void onResume() {
            C1120v.this.mo3846c();
        }
    }

    /* renamed from: androidx.lifecycle.v$c */
    class C1123c extends C1080d {

        /* renamed from: androidx.lifecycle.v$c$a */
        class C1124a extends C1080d {
            C1124a() {
            }

            public void onActivityPostResumed(Activity activity) {
                C1120v.this.mo3846c();
            }

            public void onActivityPostStarted(Activity activity) {
                C1120v.this.mo3847d();
            }
        }

        C1123c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                C1125w.m4624f(activity).mo3859h(C1120v.this.f3012m);
            }
        }

        public void onActivityPaused(Activity activity) {
            C1120v.this.mo3845b();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new C1124a());
        }

        public void onActivityStopped(Activity activity) {
            C1120v.this.mo3848e();
        }
    }

    private C1120v() {
    }

    /* renamed from: k */
    public static C1110m m4607k() {
        return f3004n;
    }

    /* renamed from: l */
    static void m4608l(Context context) {
        f3004n.mo3849f(context);
    }

    /* renamed from: a */
    public C1099i mo491a() {
        return this.f3010k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3845b() {
        int i = this.f3006g - 1;
        this.f3006g = i;
        if (i == 0) {
            this.f3009j.postDelayed(this.f3011l, 700);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3846c() {
        int i = this.f3006g + 1;
        this.f3006g = i;
        if (i != 1) {
            return;
        }
        if (this.f3007h) {
            this.f3010k.mo3835h(C1099i.C1101b.ON_RESUME);
            this.f3007h = false;
            return;
        }
        this.f3009j.removeCallbacks(this.f3011l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3847d() {
        int i = this.f3005f + 1;
        this.f3005f = i;
        if (i == 1 && this.f3008i) {
            this.f3010k.mo3835h(C1099i.C1101b.ON_START);
            this.f3008i = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3848e() {
        this.f3005f--;
        mo3851j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3849f(Context context) {
        this.f3009j = new Handler();
        this.f3010k.mo3835h(C1099i.C1101b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1123c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3850g() {
        if (this.f3006g == 0) {
            this.f3007h = true;
            this.f3010k.mo3835h(C1099i.C1101b.ON_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3851j() {
        if (this.f3005f == 0 && this.f3007h) {
            this.f3010k.mo3835h(C1099i.C1101b.ON_STOP);
            this.f3008i = true;
        }
    }
}
