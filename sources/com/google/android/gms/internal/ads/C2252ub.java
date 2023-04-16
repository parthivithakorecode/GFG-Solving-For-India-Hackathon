package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.ub */
final class C2252ub implements C2289vb {

    /* renamed from: a */
    final /* synthetic */ Activity f15493a;

    C2252ub(C2327wb wbVar, Activity activity) {
        this.f15493a = activity;
    }

    /* renamed from: a */
    public final void mo9715a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f15493a);
    }
}
