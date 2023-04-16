package p016b5;

import java.util.List;
import java.util.ServiceLoader;
import p079k4.C3322k;
import p079k4.C3325l;
import p079k4.C3330q;
import p100n4.C3778g;

/* renamed from: b5.f0 */
public final class C1343f0 {

    /* renamed from: a */
    private static final List<C1338e0> f3550a;

    static {
        Class<C1338e0> cls = C1338e0.class;
        f3550a = C4608h.m27638f(C4605f.m27633a(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    /* renamed from: a */
    public static final void m5332a(C3778g gVar, Throwable th) {
        for (C1338e0 handleException : f3550a) {
            try {
                handleException.handleException(gVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C1347g0.m5339b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            C3322k.C3323a aVar = C3322k.f20823f;
            C3313b.m24439a(th, new C1401t0(gVar));
            C3322k.m24446a(C3330q.f20829a);
        } catch (Throwable th3) {
            C3322k.C3323a aVar2 = C3322k.f20823f;
            C3322k.m24446a(C3325l.m24450a(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
