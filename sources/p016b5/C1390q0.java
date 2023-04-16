package p016b5;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p016b5.C1327c1;

/* renamed from: b5.q0 */
public final class C1390q0 extends C1327c1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: l */
    public static final C1390q0 f3591l;

    /* renamed from: m */
    private static final long f3592m;

    static {
        Long l;
        C1390q0 q0Var = new C1390q0();
        f3591l = q0Var;
        C1320b1.m5273W(q0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f3592m = timeUnit.toNanos(l.longValue());
    }

    private C1390q0() {
    }

    /* renamed from: r0 */
    private final synchronized void m5436r0() {
        if (m5439u0()) {
            debugStatus = 3;
            mo4677m0();
            notifyAll();
        }
    }

    /* renamed from: s0 */
    private final synchronized Thread m5437s0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: t0 */
    private final boolean m5438t0() {
        return debugStatus == 4;
    }

    /* renamed from: u0 */
    private final boolean m5439u0() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: v0 */
    private final synchronized boolean m5440v0() {
        if (m5439u0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: w0 */
    private final void m5441w0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public Thread mo4700a0() {
        Thread thread = _thread;
        return thread == null ? m5437s0() : thread;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public void mo4701b0(long j, C1327c1.C1328a aVar) {
        m5441w0();
    }

    /* renamed from: g0 */
    public void mo4674g0(Runnable runnable) {
        if (m5438t0()) {
            m5441w0();
        }
        super.mo4674g0(runnable);
    }

    public void run() {
        C1355h2.f3555a.mo4711c(this);
        C1322c.m5284a();
        try {
            if (m5440v0()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long k0 = mo4676k0();
                    if (k0 == Long.MAX_VALUE) {
                        C1322c.m5284a();
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f3592m + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m5436r0();
                            C1322c.m5284a();
                            if (!mo4675j0()) {
                                mo4700a0();
                                return;
                            }
                            return;
                        }
                        k0 = C4357f.m26996d(k0, j2);
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (k0 > 0) {
                        if (m5439u0()) {
                            _thread = null;
                            m5436r0();
                            C1322c.m5284a();
                            if (!mo4675j0()) {
                                mo4700a0();
                                return;
                            }
                            return;
                        }
                        C1322c.m5284a();
                        LockSupport.parkNanos(this, k0);
                    }
                }
            }
        } finally {
            _thread = null;
            m5436r0();
            C1322c.m5284a();
            if (!mo4675j0()) {
                mo4700a0();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
