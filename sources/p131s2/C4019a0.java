package p131s2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p098n2.C3763a;

/* renamed from: s2.a0 */
final class C4019a0 implements Executor {

    /* renamed from: f */
    private final Handler f22196f = new C3763a(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f22196f.post(runnable);
    }
}
