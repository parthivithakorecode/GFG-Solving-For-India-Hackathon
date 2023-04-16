package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.qb */
final class C2104qb implements C2289vb {

    /* renamed from: a */
    final /* synthetic */ Activity f13117a;

    C2104qb(C2327wb wbVar, Activity activity) {
        this.f13117a = activity;
    }

    /* renamed from: a */
    public final void mo9715a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f13117a);
    }
}
