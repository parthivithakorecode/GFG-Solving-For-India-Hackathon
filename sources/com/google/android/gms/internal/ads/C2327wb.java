package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.wb */
final class C2327wb implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private final Application f16775f;

    /* renamed from: g */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f16776g;

    /* renamed from: h */
    private boolean f16777h = false;

    public C2327wb(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f16776g = new WeakReference<>(activityLifecycleCallbacks);
        this.f16775f = application;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11631a(C2289vb vbVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f16776g.get();
            if (activityLifecycleCallbacks != null) {
                vbVar.mo9715a(activityLifecycleCallbacks);
            } else if (!this.f16777h) {
                this.f16775f.unregisterActivityLifecycleCallbacks(this);
                this.f16777h = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        mo11631a(new C2030ob(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        mo11631a(new C2252ub(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        mo11631a(new C2141rb(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        mo11631a(new C2104qb(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        mo11631a(new C2215tb(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        mo11631a(new C2067pb(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        mo11631a(new C2178sb(this, activity));
    }
}
