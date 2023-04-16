package p016b5;

import java.util.concurrent.CancellationException;

/* renamed from: b5.g1 */
public final class C1348g1 {
    /* renamed from: a */
    public static final CancellationException m5340a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
