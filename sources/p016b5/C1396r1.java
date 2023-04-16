package p016b5;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C3357i;

/* renamed from: b5.r1 */
public final class C1396r1 extends CancellationException implements C1319b0<C1396r1> {

    /* renamed from: f */
    public final C1391q1 f3598f;

    public C1396r1(String str, Throwable th, C1391q1 q1Var) {
        super(str);
        this.f3598f = q1Var;
        if (th != null) {
            initCause(th);
        }
    }

    /* renamed from: b */
    public C1396r1 mo4659a() {
        if (!C1384o0.m5427c()) {
            return null;
        }
        String message = getMessage();
        C3357i.m24505b(message);
        return new C1396r1(message, this, this.f3598f);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C1396r1) {
                C1396r1 r1Var = (C1396r1) obj;
                if (!C3357i.m24504a(r1Var.getMessage(), getMessage()) || !C3357i.m24504a(r1Var.f3598f, this.f3598f) || !C3357i.m24504a(r1Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        if (C1384o0.m5427c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C3357i.m24505b(message);
        int hashCode = ((message.hashCode() * 31) + this.f3598f.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    public String toString() {
        return super.toString() + "; job=" + this.f3598f;
    }
}
