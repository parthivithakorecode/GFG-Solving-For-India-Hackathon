package p016b5;

import p100n4.C3778g;

/* renamed from: b5.t0 */
final class C1401t0 extends RuntimeException {

    /* renamed from: f */
    private final C3778g f3599f;

    public C1401t0(C3778g gVar) {
        this.f3599f = gVar;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public String getLocalizedMessage() {
        return this.f3599f.toString();
    }
}
