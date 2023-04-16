package androidx.core.p009os;

import android.os.Handler;
import androidx.core.util.C0743e;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: androidx.core.os.g */
public final class C0683g {

    /* renamed from: androidx.core.os.g$a */
    private static class C0684a implements Executor {

        /* renamed from: f */
        private final Handler f2012f;

        C0684a(Handler handler) {
            this.f2012f = (Handler) C0743e.m2958f(handler);
        }

        public void execute(Runnable runnable) {
            if (!this.f2012f.post((Runnable) C0743e.m2958f(runnable))) {
                throw new RejectedExecutionException(this.f2012f + " is shutting down");
            }
        }
    }

    /* renamed from: a */
    public static Executor m2823a(Handler handler) {
        return new C0684a(handler);
    }
}
