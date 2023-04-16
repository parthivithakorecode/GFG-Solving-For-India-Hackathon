package p016b5;

import androidx.work.impl.utils.futures.C1282b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.C3339e;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import kotlinx.coroutines.internal.C3375d0;
import kotlinx.coroutines.internal.C3377e0;
import kotlinx.coroutines.internal.C3382h;
import p016b5.C1391q1;
import p079k4.C3315d;
import p079k4.C3330q;
import p100n4.C3773d;
import p100n4.C3778g;
import p145u4.C4150l;

/* renamed from: b5.l */
public class C1371l<T> extends C1407v0<T> implements C1366k<T>, C3339e {

    /* renamed from: l */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3566l = AtomicIntegerFieldUpdater.newUpdater(C1371l.class, "_decision");

    /* renamed from: m */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3567m = AtomicReferenceFieldUpdater.newUpdater(C1371l.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: i */
    private final C3773d<T> f3568i;

    /* renamed from: j */
    private final C3778g f3569j;

    /* renamed from: k */
    private C1422z0 f3570k;

    public C1371l(C3773d<? super T> dVar, int i) {
        super(i);
        this.f3568i = dVar;
        if (C1384o0.m5425a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        this.f3569j = dVar.getContext();
        this._decision = 0;
        this._state = C1331d.f3544f;
    }

    /* renamed from: A */
    private final boolean m5376A() {
        return C1410w0.m5493c(this.f3609h) && ((C3382h) this.f3568i).mo14414p();
    }

    /* renamed from: B */
    private final C1356i m5377B(C4150l<? super Throwable, C3330q> lVar) {
        return lVar instanceof C1356i ? (C1356i) lVar : new C1382n1(lVar);
    }

    /* renamed from: C */
    private final void m5378C(C4150l<? super Throwable, C3330q> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    /* renamed from: F */
    private final void m5379F() {
        C3773d<T> dVar = this.f3568i;
        Throwable th = null;
        C3382h hVar = dVar instanceof C3382h ? (C3382h) dVar : null;
        if (hVar != null) {
            th = hVar.mo14417s(this);
        }
        if (th != null) {
            mo4752s();
            mo4751q(th);
        }
    }

    /* renamed from: H */
    private final void m5380H(Object obj, int i, C4150l<? super Throwable, C3330q> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof C1336d2) {
            } else {
                if (obj2 instanceof C1383o) {
                    C1383o oVar = (C1383o) obj2;
                    if (oVar.mo4760c()) {
                        if (lVar != null) {
                            mo4750p(lVar, oVar.f3608a);
                            return;
                        }
                        return;
                    }
                }
                m5386m(obj);
                throw new C3315d();
            }
        } while (!C1282b.m5160a(f3567m, this, obj2, m5382J((C1336d2) obj2, obj, i, lVar, (Object) null)));
        m5389t();
        m5390u(i);
    }

    /* renamed from: I */
    static /* synthetic */ void m5381I(C1371l lVar, Object obj, int i, C4150l lVar2, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 4) != 0) {
                lVar2 = null;
            }
            lVar.m5380H(obj, i, lVar2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    /* renamed from: J */
    private final Object m5382J(C1336d2 d2Var, Object obj, int i, C4150l<? super Throwable, C3330q> lVar, Object obj2) {
        if (obj instanceof C1406v) {
            boolean z = true;
            if (C1384o0.m5425a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (!C1384o0.m5425a()) {
                return obj;
            }
            if (lVar != null) {
                z = false;
            }
            if (z) {
                return obj;
            }
            throw new AssertionError();
        } else if (!C1410w0.m5492b(i) && obj2 == null) {
            return obj;
        } else {
            if (lVar == null && ((!(d2Var instanceof C1356i) || (d2Var instanceof C1337e)) && obj2 == null)) {
                return obj;
            }
            return new C1403u(obj, d2Var instanceof C1356i ? (C1356i) d2Var : null, lVar, obj2, (Throwable) null, 16, (C3353e) null);
        }
    }

    /* renamed from: K */
    private final boolean m5383K() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f3566l.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: L */
    private final C3377e0 m5384L(Object obj, Object obj2, C4150l<? super Throwable, C3330q> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof C1336d2) {
            } else if (!(obj3 instanceof C1403u) || obj2 == null) {
                return null;
            } else {
                C1403u uVar = (C1403u) obj3;
                if (uVar.f3604d != obj2) {
                    return null;
                }
                if (!C1384o0.m5425a() || C3357i.m24504a(uVar.f3601a, obj)) {
                    return C1376m.f3573a;
                }
                throw new AssertionError();
            }
        } while (!C1282b.m5160a(f3567m, this, obj3, m5382J((C1336d2) obj3, obj, this.f3609h, lVar, obj2)));
        m5389t();
        return C1376m.f3573a;
    }

    /* renamed from: M */
    private final boolean m5385M() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f3566l.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: m */
    private final Void m5386m(Object obj) {
        throw new IllegalStateException(C3357i.m24513j("Already resumed, but proposed with update ", obj).toString());
    }

    /* renamed from: o */
    private final void m5387o(C4150l<? super Throwable, C3330q> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            C1347g0.m5338a(getContext(), new C1418y(C3357i.m24513j("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: r */
    private final boolean m5388r(Throwable th) {
        if (!m5376A()) {
            return false;
        }
        return ((C3382h) this.f3568i).mo14415q(th);
    }

    /* renamed from: t */
    private final void m5389t() {
        if (!m5376A()) {
            mo4752s();
        }
    }

    /* renamed from: u */
    private final void m5390u(int i) {
        if (!m5383K()) {
            C1410w0.m5491a(this, i);
        }
    }

    /* renamed from: y */
    private final String m5391y() {
        Object x = mo4756x();
        return x instanceof C1336d2 ? "Active" : x instanceof C1383o ? "Cancelled" : "Completed";
    }

    /* renamed from: z */
    private final C1422z0 m5392z() {
        C1391q1 q1Var = (C1391q1) getContext().get(C1391q1.f3593c);
        if (q1Var == null) {
            return null;
        }
        C1422z0 d = C1391q1.C1392a.m5453d(q1Var, true, false, new C1386p(this), 2, (Object) null);
        this.f3570k = d;
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public String mo4739D() {
        return "CancellableContinuation";
    }

    /* renamed from: E */
    public final void mo4740E(Throwable th) {
        if (!m5388r(th)) {
            mo4751q(th);
            m5389t();
        }
    }

    /* renamed from: G */
    public final boolean mo4741G() {
        if (C1384o0.m5425a()) {
            if (!(this.f3609h == 2)) {
                throw new AssertionError();
            }
        }
        if (C1384o0.m5425a()) {
            if (!(this.f3570k != C1330c2.f3543f)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (C1384o0.m5425a() && !(!(obj instanceof C1336d2))) {
            throw new AssertionError();
        } else if (!(obj instanceof C1403u) || ((C1403u) obj).f3604d == null) {
            this._decision = 0;
            this._state = C1331d.f3544f;
            return true;
        } else {
            mo4752s();
            return false;
        }
    }

    /* renamed from: a */
    public void mo4729a(T t, C4150l<? super Throwable, C3330q> lVar) {
        m5380H(t, this.f3609h, lVar);
    }

    /* renamed from: b */
    public Object mo4730b(T t, Object obj) {
        return m5384L(t, obj, (C4150l<? super Throwable, C3330q>) null);
    }

    /* renamed from: c */
    public void mo4731c(C4150l<? super Throwable, C3330q> lVar) {
        C1356i B = m5377B(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C1331d) {
                if (C1282b.m5160a(f3567m, this, obj, B)) {
                    return;
                }
            } else if (obj instanceof C1356i) {
                m5378C(lVar, obj);
            } else {
                boolean z = obj instanceof C1406v;
                if (z) {
                    C1406v vVar = (C1406v) obj;
                    if (!vVar.mo4786b()) {
                        m5378C(lVar, obj);
                    }
                    if (obj instanceof C1383o) {
                        Throwable th = null;
                        if (!z) {
                            vVar = null;
                        }
                        if (vVar != null) {
                            th = vVar.f3608a;
                        }
                        m5387o(lVar, th);
                        return;
                    }
                    return;
                } else if (obj instanceof C1403u) {
                    C1403u uVar = (C1403u) obj;
                    if (uVar.f3602b != null) {
                        m5378C(lVar, obj);
                    }
                    if (!(B instanceof C1337e)) {
                        if (uVar.mo4779c()) {
                            m5387o(lVar, uVar.f3605e);
                            return;
                        }
                        if (C1282b.m5160a(f3567m, this, obj, C1403u.m5466b(uVar, (Object) null, B, (C4150l) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (!(B instanceof C1337e)) {
                    if (C1282b.m5160a(f3567m, this, obj, new C1403u(obj, B, (C4150l) null, (Object) null, (Throwable) null, 28, (C3353e) null))) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public void mo4742d(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C1336d2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof C1406v)) {
                if (obj2 instanceof C1403u) {
                    C1403u uVar = (C1403u) obj2;
                    if (!uVar.mo4779c()) {
                        if (C1282b.m5160a(f3567m, this, obj2, C1403u.m5466b(uVar, (Object) null, (C1356i) null, (C4150l) null, (Object) null, th, 15, (Object) null))) {
                            uVar.mo4780d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (C1282b.m5160a(f3567m, this, obj2, new C1403u(obj2, (C1356i) null, (C4150l) null, (Object) null, th, 14, (C3353e) null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public final C3773d<T> mo4743e() {
        return this.f3568i;
    }

    /* renamed from: f */
    public Object mo4732f(T t, Object obj, C4150l<? super Throwable, C3330q> lVar) {
        return m5384L(t, obj, lVar);
    }

    /* renamed from: g */
    public Object mo4733g(Throwable th) {
        return m5384L(new C1406v(th, false, 2, (C3353e) null), (Object) null, (C4150l<? super Throwable, C3330q>) null);
    }

    public C3339e getCallerFrame() {
        C3773d<T> dVar = this.f3568i;
        if (dVar instanceof C3339e) {
            return (C3339e) dVar;
        }
        return null;
    }

    public C3778g getContext() {
        return this.f3569j;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: h */
    public Throwable mo4746h(Object obj) {
        Throwable h = super.mo4746h(obj);
        if (h == null) {
            return null;
        }
        C3773d e = mo4743e();
        return (!C1384o0.m5428d() || !(e instanceof C3339e)) ? h : C3375d0.m24567j(h, (C3339e) e);
    }

    /* renamed from: i */
    public void mo4734i(Object obj) {
        if (C1384o0.m5425a()) {
            if (!(obj == C1376m.f3573a)) {
                throw new AssertionError();
            }
        }
        m5390u(this.f3609h);
    }

    /* renamed from: j */
    public <T> T mo4747j(Object obj) {
        return obj instanceof C1403u ? ((C1403u) obj).f3601a : obj;
    }

    /* renamed from: l */
    public Object mo4748l() {
        return mo4756x();
    }

    /* renamed from: n */
    public final void mo4749n(C1356i iVar, Throwable th) {
        try {
            iVar.mo4722a(th);
        } catch (Throwable th2) {
            C1347g0.m5338a(getContext(), new C1418y(C3357i.m24513j("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: p */
    public final void mo4750p(C4150l<? super Throwable, C3330q> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            C1347g0.m5338a(getContext(), new C1418y(C3357i.m24513j("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    /* renamed from: q */
    public boolean mo4751q(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof C1336d2)) {
                return false;
            }
            z = obj instanceof C1356i;
        } while (!C1282b.m5160a(f3567m, this, obj, new C1383o(this, th, z)));
        C1356i iVar = z ? (C1356i) obj : null;
        if (iVar != null) {
            mo4749n(iVar, th);
        }
        m5389t();
        m5390u(this.f3609h);
        return true;
    }

    public void resumeWith(Object obj) {
        m5381I(this, C1421z.m5588b(obj, this), this.f3609h, (C4150l) null, 4, (Object) null);
    }

    /* renamed from: s */
    public final void mo4752s() {
        C1422z0 z0Var = this.f3570k;
        if (z0Var != null) {
            z0Var.mo4679b();
            this.f3570k = C1330c2.f3543f;
        }
    }

    public String toString() {
        return mo4739D() + '(' + C1387p0.m5433c(this.f3568i) + "){" + m5391y() + "}@" + C1387p0.m5432b(this);
    }

    /* renamed from: v */
    public Throwable mo4754v(C1391q1 q1Var) {
        return q1Var.mo4767w();
    }

    /* renamed from: w */
    public final Object mo4755w() {
        C1391q1 q1Var;
        boolean A = m5376A();
        if (m5385M()) {
            if (this.f3570k == null) {
                m5392z();
            }
            if (A) {
                m5379F();
            }
            return C3858d.m25871c();
        }
        if (A) {
            m5379F();
        }
        Object x = mo4756x();
        if (x instanceof C1406v) {
            Throwable th = ((C1406v) x).f3608a;
            if (C1384o0.m5428d()) {
                th = C3375d0.m24567j(th, this);
            }
            throw th;
        } else if (!C1410w0.m5492b(this.f3609h) || (q1Var = (C1391q1) getContext().get(C1391q1.f3593c)) == null || q1Var.mo4641d()) {
            return mo4747j(x);
        } else {
            Throwable w = q1Var.mo4767w();
            mo4742d(x, w);
            if (C1384o0.m5428d()) {
                w = C3375d0.m24567j(w, this);
            }
            throw w;
        }
    }

    /* renamed from: x */
    public final Object mo4756x() {
        return this._state;
    }
}
