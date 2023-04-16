package p133s4;

import java.io.Closeable;

/* renamed from: s4.a */
public final class C4051a {
    /* renamed from: a */
    public static final void m26380a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C3313b.m24439a(th, th2);
        }
    }
}
