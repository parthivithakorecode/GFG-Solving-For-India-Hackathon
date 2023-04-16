package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import p054h1.C2694t;
import p069j1.C3163g2;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.ro */
final class C2154ro implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private Activity f13768f;

    /* renamed from: g */
    private Context f13769g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Object f13770h = new Object();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f13771i = true;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f13772j = false;
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: k */
    public final List<C2191so> f13773k = new ArrayList();
    @GuardedBy("lock")

    /* renamed from: l */
    private final List<C1785hp> f13774l = new ArrayList();

    /* renamed from: m */
    private Runnable f13775m;

    /* renamed from: n */
    private boolean f13776n = false;

    /* renamed from: o */
    private long f13777o;

    C2154ro() {
    }

    /* renamed from: k */
    private final void m16369k(Activity activity) {
        synchronized (this.f13770h) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f13768f = activity;
            }
        }
    }

    /* renamed from: a */
    public final Activity mo10617a() {
        return this.f13768f;
    }

    /* renamed from: b */
    public final Context mo10618b() {
        return this.f13769g;
    }

    /* renamed from: f */
    public final void mo10619f(C2191so soVar) {
        synchronized (this.f13770h) {
            this.f13773k.add(soVar);
        }
    }

    /* renamed from: g */
    public final void mo10620g(Application application, Context context) {
        if (!this.f13776n) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                m16369k((Activity) context);
            }
            this.f13769g = application;
            this.f13777o = ((Long) C2199sw.m17001c().mo8579b(m10.f10282G0)).longValue();
            this.f13776n = true;
        }
    }

    /* renamed from: h */
    public final void mo10621h(C2191so soVar) {
        synchronized (this.f13770h) {
            this.f13773k.remove(soVar);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f13770h) {
            Activity activity2 = this.f13768f;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.f13768f = null;
                }
                Iterator<C1785hp> it = this.f13774l.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().zza()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        C2694t.m21607p().mo11034s(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        io0.m11129e("", e);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        m16369k(activity);
        synchronized (this.f13770h) {
            for (C1785hp a : this.f13774l) {
                try {
                    a.mo7982a();
                } catch (Exception e) {
                    C2694t.m21607p().mo11034s(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    io0.m11129e("", e);
                }
            }
        }
        this.f13772j = true;
        Runnable runnable = this.f13775m;
        if (runnable != null) {
            C3163g2.f20465i.removeCallbacks(runnable);
        }
        s33 s33 = C3163g2.f20465i;
        C2117qo qoVar = new C2117qo(this);
        this.f13775m = qoVar;
        s33.postDelayed(qoVar, this.f13777o);
    }

    public final void onActivityResumed(Activity activity) {
        m16369k(activity);
        this.f13772j = false;
        boolean z = !this.f13771i;
        this.f13771i = true;
        Runnable runnable = this.f13775m;
        if (runnable != null) {
            C3163g2.f20465i.removeCallbacks(runnable);
        }
        synchronized (this.f13770h) {
            for (C1785hp c : this.f13774l) {
                try {
                    c.mo7983c();
                } catch (Exception e) {
                    C2694t.m21607p().mo11034s(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    io0.m11129e("", e);
                }
            }
            if (z) {
                for (C2191so c2 : this.f13773k) {
                    try {
                        c2.mo7380c(true);
                    } catch (Exception e2) {
                        io0.m11129e("", e2);
                    }
                }
            } else {
                io0.m11126b("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        m16369k(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
