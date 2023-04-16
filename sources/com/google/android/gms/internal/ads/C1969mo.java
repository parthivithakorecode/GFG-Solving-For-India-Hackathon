package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.mo */
final class C1969mo implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private final Application f10977f;

    /* renamed from: g */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f10978g;

    /* renamed from: h */
    private boolean f10979h = false;

    public C1969mo(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f10978g = new WeakReference<>(activityLifecycleCallbacks);
        this.f10977f = application;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9336a(C1932lo loVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f10978g.get();
            if (activityLifecycleCallbacks != null) {
                loVar.mo7007a(activityLifecycleCallbacks);
            } else if (!this.f10979h) {
                this.f10977f.unregisterActivityLifecycleCallbacks(this);
                this.f10979h = true;
            }
        } catch (Exception e) {
            io0.m11129e("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        mo9336a(new C1673eo(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        mo9336a(new C1895ko(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        mo9336a(new C1784ho(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        mo9336a(new C1747go(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        mo9336a(new C1858jo(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        mo9336a(new C1710fo(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        mo9336a(new C1821io(this, activity));
    }
}
