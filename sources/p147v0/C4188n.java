package p147v0;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p089m0.C3646j;

/* renamed from: v0.n */
public class C4188n {

    /* renamed from: f */
    private static final String f22433f = C3646j.m25231f("WorkTimer");

    /* renamed from: a */
    private final ThreadFactory f22434a;

    /* renamed from: b */
    private final ScheduledExecutorService f22435b;

    /* renamed from: c */
    final Map<String, C4191c> f22436c = new HashMap();

    /* renamed from: d */
    final Map<String, C4190b> f22437d = new HashMap();

    /* renamed from: e */
    final Object f22438e = new Object();

    /* renamed from: v0.n$a */
    class C4189a implements ThreadFactory {

        /* renamed from: a */
        private int f22439a = 0;

        C4189a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f22439a);
            this.f22439a = this.f22439a + 1;
            return newThread;
        }
    }

    /* renamed from: v0.n$b */
    public interface C4190b {
        /* renamed from: b */
        void mo4530b(String str);
    }

    /* renamed from: v0.n$c */
    public static class C4191c implements Runnable {

        /* renamed from: f */
        private final C4188n f22441f;

        /* renamed from: g */
        private final String f22442g;

        C4191c(C4188n nVar, String str) {
            this.f22441f = nVar;
            this.f22442g = str;
        }

        public void run() {
            synchronized (this.f22441f.f22438e) {
                if (this.f22441f.f22436c.remove(this.f22442g) != null) {
                    C4190b remove = this.f22441f.f22437d.remove(this.f22442g);
                    if (remove != null) {
                        remove.mo4530b(this.f22442g);
                    }
                } else {
                    C3646j.m25229c().mo14806a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f22442g}), new Throwable[0]);
                }
            }
        }
    }

    public C4188n() {
        C4189a aVar = new C4189a();
        this.f22434a = aVar;
        this.f22435b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    /* renamed from: a */
    public void mo15703a() {
        if (!this.f22435b.isShutdown()) {
            this.f22435b.shutdownNow();
        }
    }

    /* renamed from: b */
    public void mo15704b(String str, long j, C4190b bVar) {
        synchronized (this.f22438e) {
            C3646j.m25229c().mo14806a(f22433f, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            mo15705c(str);
            C4191c cVar = new C4191c(this, str);
            this.f22436c.put(str, cVar);
            this.f22437d.put(str, bVar);
            this.f22435b.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: c */
    public void mo15705c(String str) {
        synchronized (this.f22438e) {
            if (this.f22436c.remove(str) != null) {
                C3646j.m25229c().mo14806a(f22433f, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.f22437d.remove(str);
            }
        }
    }
}
