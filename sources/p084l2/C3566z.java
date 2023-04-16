package p084l2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: l2.z */
final class C3566z implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private final Activity f21260f;

    /* renamed from: g */
    private final /* synthetic */ C3551u f21261g;

    public C3566z(C3551u uVar, Activity activity) {
        this.f21261g = uVar;
        this.f21260f = activity;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m24972a() {
        this.f21261g.f21210a.unregisterActivityLifecycleCallbacks(this);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.f21260f) {
            this.f21261g.mo14630h(new C3489e2(3, "Activity is destroyed."));
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
