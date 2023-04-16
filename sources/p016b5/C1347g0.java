package p016b5;

import p100n4.C3778g;

/* renamed from: b5.g0 */
public final class C1347g0 {
    /* renamed from: a */
    public static final void m5338a(C3778g gVar, Throwable th) {
        try {
            C1338e0 e0Var = (C1338e0) gVar.get(C1338e0.f3547b);
            if (e0Var == null) {
                C1343f0.m5332a(gVar, th);
            } else {
                e0Var.handleException(gVar, th);
            }
        } catch (Throwable th2) {
            C1343f0.m5332a(gVar, m5339b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m5339b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C3313b.m24439a(runtimeException, th);
        return runtimeException;
    }
}
