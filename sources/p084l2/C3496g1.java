package p084l2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: l2.g1 */
public final class C3496g1 {

    /* renamed from: a */
    public static final Handler f21065a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static final Executor f21066b = new C3508j1("Google consent worker");

    /* renamed from: a */
    public static void m24889a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Method must be call on main thread.");
        }
    }
}
