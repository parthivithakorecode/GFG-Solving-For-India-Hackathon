package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p089m0.C3642g;
import p089m0.C3644i;
import p089m0.C3660q;
import p089m0.C3666v;
import p096n0.C3747a;

/* renamed from: androidx.work.a */
public final class C1235a {

    /* renamed from: a */
    final Executor f3334a;

    /* renamed from: b */
    final Executor f3335b;

    /* renamed from: c */
    final C3666v f3336c;

    /* renamed from: d */
    final C3644i f3337d;

    /* renamed from: e */
    final C3660q f3338e;

    /* renamed from: f */
    final C3642g f3339f;

    /* renamed from: g */
    final String f3340g;

    /* renamed from: h */
    final int f3341h;

    /* renamed from: i */
    final int f3342i;

    /* renamed from: j */
    final int f3343j;

    /* renamed from: k */
    final int f3344k;

    /* renamed from: l */
    private final boolean f3345l;

    /* renamed from: androidx.work.a$a */
    class C1236a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f3346a = new AtomicInteger(0);

        /* renamed from: b */
        final /* synthetic */ boolean f3347b;

        C1236a(boolean z) {
            this.f3347b = z;
        }

        public Thread newThread(Runnable runnable) {
            String str = this.f3347b ? "WM.task-" : "androidx.work-";
            return new Thread(runnable, str + this.f3346a.incrementAndGet());
        }
    }

    /* renamed from: androidx.work.a$b */
    public static final class C1237b {

        /* renamed from: a */
        Executor f3349a;

        /* renamed from: b */
        C3666v f3350b;

        /* renamed from: c */
        C3644i f3351c;

        /* renamed from: d */
        Executor f3352d;

        /* renamed from: e */
        C3660q f3353e;

        /* renamed from: f */
        C3642g f3354f;

        /* renamed from: g */
        String f3355g;

        /* renamed from: h */
        int f3356h = 4;

        /* renamed from: i */
        int f3357i = 0;

        /* renamed from: j */
        int f3358j = Integer.MAX_VALUE;

        /* renamed from: k */
        int f3359k = 20;

        /* renamed from: a */
        public C1235a mo4500a() {
            return new C1235a(this);
        }
    }

    /* renamed from: androidx.work.a$c */
    public interface C1238c {
        /* renamed from: a */
        C1235a mo4501a();
    }

    C1235a(C1237b bVar) {
        Executor executor = bVar.f3349a;
        this.f3334a = executor == null ? m4963a(false) : executor;
        Executor executor2 = bVar.f3352d;
        if (executor2 == null) {
            this.f3345l = true;
            executor2 = m4963a(true);
        } else {
            this.f3345l = false;
        }
        this.f3335b = executor2;
        C3666v vVar = bVar.f3350b;
        this.f3336c = vVar == null ? C3666v.m25266c() : vVar;
        C3644i iVar = bVar.f3351c;
        this.f3337d = iVar == null ? C3644i.m25225c() : iVar;
        C3660q qVar = bVar.f3353e;
        this.f3338e = qVar == null ? new C3747a() : qVar;
        this.f3341h = bVar.f3356h;
        this.f3342i = bVar.f3357i;
        this.f3343j = bVar.f3358j;
        this.f3344k = bVar.f3359k;
        this.f3339f = bVar.f3354f;
        this.f3340g = bVar.f3355g;
    }

    /* renamed from: a */
    private Executor m4963a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), m4964b(z));
    }

    /* renamed from: b */
    private ThreadFactory m4964b(boolean z) {
        return new C1236a(z);
    }

    /* renamed from: c */
    public String mo4488c() {
        return this.f3340g;
    }

    /* renamed from: d */
    public C3642g mo4489d() {
        return this.f3339f;
    }

    /* renamed from: e */
    public Executor mo4490e() {
        return this.f3334a;
    }

    /* renamed from: f */
    public C3644i mo4491f() {
        return this.f3337d;
    }

    /* renamed from: g */
    public int mo4492g() {
        return this.f3343j;
    }

    /* renamed from: h */
    public int mo4493h() {
        return Build.VERSION.SDK_INT == 23 ? this.f3344k / 2 : this.f3344k;
    }

    /* renamed from: i */
    public int mo4494i() {
        return this.f3342i;
    }

    /* renamed from: j */
    public int mo4495j() {
        return this.f3341h;
    }

    /* renamed from: k */
    public C3660q mo4496k() {
        return this.f3338e;
    }

    /* renamed from: l */
    public Executor mo4497l() {
        return this.f3335b;
    }

    /* renamed from: m */
    public C3666v mo4498m() {
        return this.f3336c;
    }
}
