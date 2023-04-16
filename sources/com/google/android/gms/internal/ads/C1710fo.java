package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.fo */
final class C1710fo implements C1932lo {

    /* renamed from: a */
    final /* synthetic */ Activity f6877a;

    C1710fo(C1969mo moVar, Activity activity) {
        this.f6877a = activity;
    }

    /* renamed from: a */
    public final void mo7007a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f6877a);
    }
}
