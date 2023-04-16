package p153w0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p147v0.C4176g;

/* renamed from: w0.b */
public class C4261b implements C4260a {

    /* renamed from: a */
    private final C4176g f22547a;

    /* renamed from: b */
    private final Handler f22548b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Executor f22549c = new C4262a();

    /* renamed from: w0.b$a */
    class C4262a implements Executor {
        C4262a() {
        }

        public void execute(Runnable runnable) {
            C4261b.this.mo15825d(runnable);
        }
    }

    public C4261b(Executor executor) {
        this.f22547a = new C4176g(executor);
    }

    /* renamed from: a */
    public Executor mo15822a() {
        return this.f22549c;
    }

    /* renamed from: b */
    public void mo15823b(Runnable runnable) {
        this.f22547a.execute(runnable);
    }

    /* renamed from: c */
    public C4176g mo15824c() {
        return this.f22547a;
    }

    /* renamed from: d */
    public void mo15825d(Runnable runnable) {
        this.f22548b.post(runnable);
    }
}
