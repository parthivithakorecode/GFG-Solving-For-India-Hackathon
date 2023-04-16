package p091m2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: m2.f0 */
final class C3684f0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    final /* synthetic */ C3686g0 f21450f;

    C3684f0(C3686g0 g0Var) {
        this.f21450f = g0Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f21450f.m25292o(new C3716y(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f21450f.m25292o(new C3682e0(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.f21450f.m25292o(new C3676b0(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.f21450f.m25292o(new C3674a0(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C3698m0 m0Var = new C3698m0();
        this.f21450f.m25292o(new C3680d0(this, activity, m0Var));
        Bundle C0 = m0Var.mo14872C0(50);
        if (C0 != null) {
            bundle.putAll(C0);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f21450f.m25292o(new C3717z(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.f21450f.m25292o(new C3678c0(this, activity));
    }
}
