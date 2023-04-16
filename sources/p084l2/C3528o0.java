package p084l2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: l2.o0 */
final /* synthetic */ class C3528o0 implements Executor {

    /* renamed from: f */
    private final Handler f21150f;

    private C3528o0(Handler handler) {
        this.f21150f = handler;
    }

    /* renamed from: a */
    static Executor m24934a(Handler handler) {
        return new C3528o0(handler);
    }

    public final void execute(Runnable runnable) {
        this.f21150f.post(runnable);
    }
}
