package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.pb */
final class C2067pb implements C2289vb {

    /* renamed from: a */
    final /* synthetic */ Activity f12588a;

    C2067pb(C2327wb wbVar, Activity activity) {
        this.f12588a = activity;
    }

    /* renamed from: a */
    public final void mo9715a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f12588a);
    }
}
