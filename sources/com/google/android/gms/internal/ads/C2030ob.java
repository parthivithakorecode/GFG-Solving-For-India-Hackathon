package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ob */
final class C2030ob implements C2289vb {

    /* renamed from: a */
    final /* synthetic */ Activity f11967a;

    /* renamed from: b */
    final /* synthetic */ Bundle f11968b;

    C2030ob(C2327wb wbVar, Activity activity, Bundle bundle) {
        this.f11967a = activity;
        this.f11968b = bundle;
    }

    /* renamed from: a */
    public final void mo9715a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f11967a, this.f11968b);
    }
}
