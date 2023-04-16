package androidx.window.java.layout;

import android.app.Activity;
import androidx.core.util.C0738a;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C3357i;
import p016b5.C1364j1;
import p016b5.C1372l0;
import p016b5.C1377m0;
import p016b5.C1391q1;
import p037e5.C2576b;
import p079k4.C3330q;
import p100n4.C3773d;
import p100n4.C3778g;

public final class WindowInfoTrackerCallbackAdapter implements WindowInfoTracker {
    private final Map<C0738a<?>, C1391q1> consumerToJobMap = new LinkedHashMap();
    private final ReentrantLock lock = new ReentrantLock();
    private final WindowInfoTracker tracker;

    public WindowInfoTrackerCallbackAdapter(WindowInfoTracker windowInfoTracker) {
        C3357i.m24508e(windowInfoTracker, "tracker");
        this.tracker = windowInfoTracker;
    }

    private final <T> void addListener(Executor executor, C0738a<T> aVar, C2576b<? extends T> bVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(aVar) == null) {
                this.consumerToJobMap.put(aVar, C1350h.m5344b(C1372l0.m5414a(C1364j1.m5362a(executor)), (C3778g) null, (C1377m0) null, new WindowInfoTrackerCallbackAdapter$addListener$1$1(bVar, aVar, (C3773d<? super WindowInfoTrackerCallbackAdapter$addListener$1$1>) null), 3, (Object) null));
            }
            C3330q qVar = C3330q.f20829a;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void removeListener(C0738a<?> aVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            C1391q1 q1Var = this.consumerToJobMap.get(aVar);
            if (q1Var != null) {
                C1391q1.C1392a.m5450a(q1Var, (CancellationException) null, 1, (Object) null);
            }
            C1391q1 remove = this.consumerToJobMap.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addWindowLayoutInfoListener(Activity activity, Executor executor, C0738a<WindowLayoutInfo> aVar) {
        C3357i.m24508e(activity, "activity");
        C3357i.m24508e(executor, "executor");
        C3357i.m24508e(aVar, "consumer");
        addListener(executor, aVar, this.tracker.windowLayoutInfo(activity));
    }

    public final void removeWindowLayoutInfoListener(C0738a<WindowLayoutInfo> aVar) {
        C3357i.m24508e(aVar, "consumer");
        removeListener(aVar);
    }

    public C2576b<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        C3357i.m24508e(activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }
}
