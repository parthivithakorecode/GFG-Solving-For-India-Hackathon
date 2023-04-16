package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.rb */
final class C2141rb implements C2289vb {

    /* renamed from: a */
    final /* synthetic */ Activity f13582a;

    C2141rb(C2327wb wbVar, Activity activity) {
        this.f13582a = activity;
    }

    /* renamed from: a */
    public final void mo9715a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f13582a);
    }
}
