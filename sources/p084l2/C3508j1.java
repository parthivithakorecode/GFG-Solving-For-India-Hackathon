package p084l2;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: l2.j1 */
final class C3508j1 implements Executor {

    /* renamed from: f */
    private final AtomicInteger f21094f = new AtomicInteger(1);

    /* renamed from: g */
    private final ThreadPoolExecutor f21095g;

    /* renamed from: h */
    private WeakReference<Thread> f21096h = new WeakReference<>((Object) null);

    C3508j1(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C3504i1(this, str));
        this.f21095g = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Thread mo14596a(String str, Runnable runnable) {
        int andIncrement = this.f21094f.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append(" #");
        sb.append(andIncrement);
        Thread thread = new Thread(runnable, sb.toString());
        this.f21096h = new WeakReference<>(thread);
        return thread;
    }

    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f21096h.get()) {
            runnable.run();
        } else {
            this.f21095g.execute(runnable);
        }
    }
}
