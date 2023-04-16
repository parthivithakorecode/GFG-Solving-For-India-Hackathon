package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.sb */
final class C2178sb implements C2289vb {

    /* renamed from: a */
    final /* synthetic */ Activity f14384a;

    C2178sb(C2327wb wbVar, Activity activity) {
        this.f14384a = activity;
    }

    /* renamed from: a */
    public final void mo9715a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f14384a);
    }
}
