package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.tb */
final class C2215tb implements C2289vb {

    /* renamed from: a */
    final /* synthetic */ Activity f14807a;

    /* renamed from: b */
    final /* synthetic */ Bundle f14808b;

    C2215tb(C2327wb wbVar, Activity activity, Bundle bundle) {
        this.f14807a = activity;
        this.f14808b = bundle;
    }

    /* renamed from: a */
    public final void mo9715a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f14807a, this.f14808b);
    }
}
