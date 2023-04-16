package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.eo */
final class C1673eo implements C1932lo {

    /* renamed from: a */
    final /* synthetic */ Activity f6289a;

    /* renamed from: b */
    final /* synthetic */ Bundle f6290b;

    C1673eo(C1969mo moVar, Activity activity, Bundle bundle) {
        this.f6289a = activity;
        this.f6290b = bundle;
    }

    /* renamed from: a */
    public final void mo7007a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f6289a, this.f6290b);
    }
}
