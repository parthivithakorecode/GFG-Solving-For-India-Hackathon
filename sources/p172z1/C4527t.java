package p172z1;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: z1.t */
final /* synthetic */ class C4527t implements Executor {

    /* renamed from: f */
    private final Handler f23040f;

    private C4527t(Handler handler) {
        this.f23040f = handler;
    }

    /* renamed from: a */
    static Executor m27411a(Handler handler) {
        return new C4527t(handler);
    }

    public final void execute(Runnable runnable) {
        this.f23040f.post(runnable);
    }
}
