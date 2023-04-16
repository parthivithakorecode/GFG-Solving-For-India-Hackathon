package p067j;

import java.util.concurrent.Executor;

/* renamed from: j.a */
public class C3127a extends C3132c {

    /* renamed from: c */
    private static volatile C3127a f20417c;

    /* renamed from: d */
    private static final Executor f20418d = new C3128a();

    /* renamed from: e */
    private static final Executor f20419e = new C3129b();

    /* renamed from: a */
    private C3132c f20420a;

    /* renamed from: b */
    private C3132c f20421b;

    /* renamed from: j.a$a */
    static class C3128a implements Executor {
        C3128a() {
        }

        public void execute(Runnable runnable) {
            C3127a.m23806e().mo13966c(runnable);
        }
    }

    /* renamed from: j.a$b */
    static class C3129b implements Executor {
        C3129b() {
        }

        public void execute(Runnable runnable) {
            C3127a.m23806e().mo13964a(runnable);
        }
    }

    private C3127a() {
        C3130b bVar = new C3130b();
        this.f20421b = bVar;
        this.f20420a = bVar;
    }

    /* renamed from: d */
    public static Executor m23805d() {
        return f20419e;
    }

    /* renamed from: e */
    public static C3127a m23806e() {
        if (f20417c != null) {
            return f20417c;
        }
        synchronized (C3127a.class) {
            if (f20417c == null) {
                f20417c = new C3127a();
            }
        }
        return f20417c;
    }

    /* renamed from: a */
    public void mo13964a(Runnable runnable) {
        this.f20420a.mo13964a(runnable);
    }

    /* renamed from: b */
    public boolean mo13965b() {
        return this.f20420a.mo13965b();
    }

    /* renamed from: c */
    public void mo13966c(Runnable runnable) {
        this.f20420a.mo13966c(runnable);
    }
}
