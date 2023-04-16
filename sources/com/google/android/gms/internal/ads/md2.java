package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;
import p054h1.C2694t;

public final class md2 implements hj2<Bundle> {

    /* renamed from: a */
    public final Context f10813a;

    /* renamed from: b */
    public final C2087pv f10814b;

    /* renamed from: c */
    public final List<Parcelable> f10815c;

    public md2(Context context, C2087pv pvVar, List<Parcelable> list) {
        this.f10813a = context;
        this.f10814b = pvVar;
        this.f10815c = list;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        Bundle bundle = (Bundle) obj;
        if (f30.f6671a.mo9928e().booleanValue()) {
            Bundle bundle2 = new Bundle();
            C2694t.m21608q();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f10813a.getSystemService("activity");
                if (activityManager != null) {
                    List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                    if (!(runningTasks == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || (componentName = runningTaskInfo.topActivity) == null)) {
                        str = componentName.getClassName();
                    }
                }
            } catch (Exception unused) {
            }
            bundle2.putString("activity", str);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.f10814b.f12808j);
            bundle3.putInt("height", this.f10814b.f12805g);
            bundle2.putBundle("size", bundle3);
            if (this.f10815c.size() > 0) {
                List<Parcelable> list = this.f10815c;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
