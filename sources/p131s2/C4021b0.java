package p131s2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import p003a2.C0092o;

/* renamed from: s2.b0 */
final class C4021b0<TResult> extends C4028h<TResult> {

    /* renamed from: a */
    private final Object f22197a = new Object();

    /* renamed from: b */
    private final C4045y<TResult> f22198b = new C4045y<>();
    @GuardedBy("mLock")

    /* renamed from: c */
    private boolean f22199c;

    /* renamed from: d */
    private volatile boolean f22200d;
    @GuardedBy("mLock")

    /* renamed from: e */
    private TResult f22201e;
    @GuardedBy("mLock")

    /* renamed from: f */
    private Exception f22202f;

    C4021b0() {
    }

    @GuardedBy("mLock")
    /* renamed from: s */
    private final void m26305s() {
        C0092o.m316l(this.f22199c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    /* renamed from: t */
    private final void m26306t() {
        if (this.f22199c) {
            throw C4020b.m26304a(this);
        }
    }

    @GuardedBy("mLock")
    /* renamed from: u */
    private final void m26307u() {
        if (this.f22200d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: v */
    private final void m26308v() {
        synchronized (this.f22197a) {
            if (this.f22199c) {
                this.f22198b.mo15537b(this);
            }
        }
    }

    /* renamed from: a */
    public final C4028h<TResult> mo15503a(Executor executor, C4022c cVar) {
        this.f22198b.mo15536a(new C4037q(executor, cVar));
        m26308v();
        return this;
    }

    /* renamed from: b */
    public final C4028h<TResult> mo15504b(Executor executor, C4024d<TResult> dVar) {
        this.f22198b.mo15536a(new C4039s(executor, dVar));
        m26308v();
        return this;
    }

    /* renamed from: c */
    public final C4028h<TResult> mo15505c(C4024d<TResult> dVar) {
        this.f22198b.mo15536a(new C4039s(C4030j.f22206a, dVar));
        m26308v();
        return this;
    }

    /* renamed from: d */
    public final C4028h<TResult> mo15506d(Executor executor, C4025e eVar) {
        this.f22198b.mo15536a(new C4041u(executor, eVar));
        m26308v();
        return this;
    }

    /* renamed from: e */
    public final C4028h<TResult> mo15507e(Executor executor, C4026f<? super TResult> fVar) {
        this.f22198b.mo15536a(new C4043w(executor, fVar));
        m26308v();
        return this;
    }

    /* renamed from: f */
    public final <TContinuationResult> C4028h<TContinuationResult> mo15508f(Executor executor, C4018a<TResult, TContinuationResult> aVar) {
        C4021b0 b0Var = new C4021b0();
        this.f22198b.mo15536a(new C4033m(executor, aVar, b0Var));
        m26308v();
        return b0Var;
    }

    /* renamed from: g */
    public final <TContinuationResult> C4028h<TContinuationResult> mo15509g(Executor executor, C4018a<TResult, C4028h<TContinuationResult>> aVar) {
        C4021b0 b0Var = new C4021b0();
        this.f22198b.mo15536a(new C4035o(executor, aVar, b0Var));
        m26308v();
        return b0Var;
    }

    /* renamed from: h */
    public final <TContinuationResult> C4028h<TContinuationResult> mo15510h(C4018a<TResult, C4028h<TContinuationResult>> aVar) {
        return mo15509g(C4030j.f22206a, aVar);
    }

    /* renamed from: i */
    public final Exception mo15511i() {
        Exception exc;
        synchronized (this.f22197a) {
            exc = this.f22202f;
        }
        return exc;
    }

    /* renamed from: j */
    public final TResult mo15512j() {
        TResult tresult;
        synchronized (this.f22197a) {
            m26305s();
            m26307u();
            Exception exc = this.f22202f;
            if (exc == null) {
                tresult = this.f22201e;
            } else {
                throw new C4027g(exc);
            }
        }
        return tresult;
    }

    /* renamed from: k */
    public final boolean mo15513k() {
        return this.f22200d;
    }

    /* renamed from: l */
    public final boolean mo15514l() {
        boolean z;
        synchronized (this.f22197a) {
            z = this.f22199c;
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo15515m() {
        boolean z;
        synchronized (this.f22197a) {
            z = false;
            if (this.f22199c && !this.f22200d && this.f22202f == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: n */
    public final void mo15516n(TResult tresult) {
        synchronized (this.f22197a) {
            m26306t();
            this.f22199c = true;
            this.f22201e = tresult;
        }
        this.f22198b.mo15537b(this);
    }

    /* renamed from: o */
    public final boolean mo15517o(TResult tresult) {
        synchronized (this.f22197a) {
            if (this.f22199c) {
                return false;
            }
            this.f22199c = true;
            this.f22201e = tresult;
            this.f22198b.mo15537b(this);
            return true;
        }
    }

    /* renamed from: p */
    public final void mo15518p(Exception exc) {
        C0092o.m314j(exc, "Exception must not be null");
        synchronized (this.f22197a) {
            m26306t();
            this.f22199c = true;
            this.f22202f = exc;
        }
        this.f22198b.mo15537b(this);
    }

    /* renamed from: q */
    public final boolean mo15519q(Exception exc) {
        C0092o.m314j(exc, "Exception must not be null");
        synchronized (this.f22197a) {
            if (this.f22199c) {
                return false;
            }
            this.f22199c = true;
            this.f22202f = exc;
            this.f22198b.mo15537b(this);
            return true;
        }
    }

    /* renamed from: r */
    public final boolean mo15520r() {
        synchronized (this.f22197a) {
            if (this.f22199c) {
                return false;
            }
            this.f22199c = true;
            this.f22200d = true;
            this.f22198b.mo15537b(this);
            return true;
        }
    }
}
