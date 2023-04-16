package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.io */
final class C1821io implements C1932lo {

    /* renamed from: a */
    final /* synthetic */ Activity f8731a;

    C1821io(C1969mo moVar, Activity activity) {
        this.f8731a = activity;
    }

    /* renamed from: a */
    public final void mo7007a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f8731a);
    }
}
