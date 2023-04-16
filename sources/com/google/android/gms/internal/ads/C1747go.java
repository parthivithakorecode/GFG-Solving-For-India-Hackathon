package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.go */
final class C1747go implements C1932lo {

    /* renamed from: a */
    final /* synthetic */ Activity f7536a;

    C1747go(C1969mo moVar, Activity activity) {
        this.f7536a = activity;
    }

    /* renamed from: a */
    public final void mo7007a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f7536a);
    }
}
