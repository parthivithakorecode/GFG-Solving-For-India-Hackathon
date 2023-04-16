package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: androidx.room.l */
class C1183l implements Executor {

    /* renamed from: f */
    private final Executor f3174f;

    /* renamed from: g */
    private final ArrayDeque<Runnable> f3175g = new ArrayDeque<>();

    /* renamed from: h */
    private Runnable f3176h;

    /* renamed from: androidx.room.l$a */
    class C1184a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Runnable f3177f;

        C1184a(Runnable runnable) {
            this.f3177f = runnable;
        }

        public void run() {
            try {
                this.f3177f.run();
            } finally {
                C1183l.this.mo3997a();
            }
        }
    }

    C1183l(Executor executor) {
        this.f3174f = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo3997a() {
        Runnable poll = this.f3175g.poll();
        this.f3176h = poll;
        if (poll != null) {
            this.f3174f.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f3175g.offer(new C1184a(runnable));
        if (this.f3176h == null) {
            mo3997a();
        }
    }
}
