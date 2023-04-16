package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.jo */
final class C1858jo implements C1932lo {

    /* renamed from: a */
    final /* synthetic */ Activity f9205a;

    /* renamed from: b */
    final /* synthetic */ Bundle f9206b;

    C1858jo(C1969mo moVar, Activity activity, Bundle bundle) {
        this.f9205a = activity;
        this.f9206b = bundle;
    }

    /* renamed from: a */
    public final void mo7007a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f9205a, this.f9206b);
    }
}
