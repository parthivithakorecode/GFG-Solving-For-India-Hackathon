package p172z1;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import p034e2.C2555l;

/* renamed from: z1.c */
public final class C4491c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: j */
    private static final C4491c f22949j = new C4491c();

    /* renamed from: f */
    private final AtomicBoolean f22950f = new AtomicBoolean();

    /* renamed from: g */
    private final AtomicBoolean f22951g = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: h */
    private final ArrayList<C4492a> f22952h = new ArrayList<>();
    @GuardedBy("sInstance")

    /* renamed from: i */
    private boolean f22953i = false;

    /* renamed from: z1.c$a */
    public interface C4492a {
        /* renamed from: a */
        void mo16142a(boolean z);
    }

    private C4491c() {
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static C4491c m27297b() {
        return f22949j;
    }

    /* renamed from: c */
    public static void m27298c(@RecentlyNonNull Application application) {
        C4491c cVar = f22949j;
        synchronized (cVar) {
            if (!cVar.f22953i) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.f22953i = true;
            }
        }
    }

    /* renamed from: f */
    private final void m27299f(boolean z) {
        synchronized (f22949j) {
            Iterator<C4492a> it = this.f22952h.iterator();
            while (it.hasNext()) {
                it.next().mo16142a(z);
            }
        }
    }

    /* renamed from: a */
    public void mo16129a(@RecentlyNonNull C4492a aVar) {
        synchronized (f22949j) {
            this.f22952h.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean mo16130d() {
        return this.f22950f.get();
    }

    @TargetApi(16)
    /* renamed from: e */
    public boolean mo16131e(boolean z) {
        if (!this.f22951g.get()) {
            if (!C2555l.m21208b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f22951g.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f22950f.set(true);
            }
        }
        return mo16130d();
    }

    public final void onActivityCreated(@RecentlyNonNull Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f22950f.compareAndSet(true, false);
        this.f22951g.set(true);
        if (compareAndSet) {
            m27299f(false);
        }
    }

    public final void onActivityDestroyed(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityPaused(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityResumed(@RecentlyNonNull Activity activity) {
        boolean compareAndSet = this.f22950f.compareAndSet(true, false);
        this.f22951g.set(true);
        if (compareAndSet) {
            m27299f(false);
        }
    }

    public final void onActivitySaveInstanceState(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle) {
    }

    public final void onActivityStarted(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityStopped(@RecentlyNonNull Activity activity) {
    }

    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f22950f.compareAndSet(false, true)) {
            this.f22951g.set(true);
            m27299f(true);
        }
    }
}
