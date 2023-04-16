package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.ho */
final class C1784ho implements C1932lo {

    /* renamed from: a */
    final /* synthetic */ Activity f8361a;

    C1784ho(C1969mo moVar, Activity activity) {
        this.f8361a = activity;
    }

    /* renamed from: a */
    public final void mo7007a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f8361a);
    }
}
