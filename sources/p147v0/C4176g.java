package p147v0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: v0.g */
public class C4176g implements Executor {

    /* renamed from: f */
    private final ArrayDeque<C4177a> f22391f = new ArrayDeque<>();

    /* renamed from: g */
    private final Executor f22392g;

    /* renamed from: h */
    private final Object f22393h = new Object();

    /* renamed from: i */
    private volatile Runnable f22394i;

    /* renamed from: v0.g$a */
    static class C4177a implements Runnable {

        /* renamed from: f */
        final C4176g f22395f;

        /* renamed from: g */
        final Runnable f22396g;

        C4177a(C4176g gVar, Runnable runnable) {
            this.f22395f = gVar;
            this.f22396g = runnable;
        }

        public void run() {
            try {
                this.f22396g.run();
            } finally {
                this.f22395f.mo15692b();
            }
        }
    }

    public C4176g(Executor executor) {
        this.f22392g = executor;
    }

    /* renamed from: a */
    public boolean mo15691a() {
        boolean z;
        synchronized (this.f22393h) {
            z = !this.f22391f.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo15692b() {
        synchronized (this.f22393h) {
            Runnable poll = this.f22391f.poll();
            this.f22394i = poll;
            if (poll != null) {
                this.f22392g.execute(this.f22394i);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f22393h) {
            this.f22391f.add(new C4177a(this, runnable));
            if (this.f22394i == null) {
                mo15692b();
            }
        }
    }
}
