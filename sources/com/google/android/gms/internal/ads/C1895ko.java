package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.ko */
final class C1895ko implements C1932lo {

    /* renamed from: a */
    final /* synthetic */ Activity f9581a;

    C1895ko(C1969mo moVar, Activity activity) {
        this.f9581a = activity;
    }

    /* renamed from: a */
    public final void mo7007a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f9581a);
    }
}
