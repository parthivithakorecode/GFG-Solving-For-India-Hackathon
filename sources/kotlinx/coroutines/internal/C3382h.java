package kotlinx.coroutines.internal;

import androidx.work.impl.utils.futures.C1282b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.C3339e;
import kotlin.jvm.internal.C3357i;
import p016b5.C1320b1;
import p016b5.C1332d0;
import p016b5.C1355h2;
import p016b5.C1366k;
import p016b5.C1371l;
import p016b5.C1384o0;
import p016b5.C1387p0;
import p016b5.C1407v0;
import p016b5.C1409w;
import p016b5.C1421z;
import p079k4.C3330q;
import p100n4.C3773d;
import p100n4.C3778g;
import p145u4.C4150l;

/* renamed from: kotlinx.coroutines.internal.h */
public final class C3382h<T> extends C1407v0<T> implements C3339e, C3773d<T> {

    /* renamed from: m */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f20867m = AtomicReferenceFieldUpdater.newUpdater(C3382h.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: i */
    public final C1332d0 f20868i;

    /* renamed from: j */
    public final C3773d<T> f20869j;

    /* renamed from: k */
    public Object f20870k = C3384i.f20872a;

    /* renamed from: l */
    public final Object f20871l = C3385i0.m24603b(getContext());

    public C3382h(C1332d0 d0Var, C3773d<? super T> dVar) {
        super(-1);
        this.f20868i = d0Var;
        this.f20869j = dVar;
    }

    /* renamed from: o */
    private final C1371l<?> m24584o() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C1371l) {
            return (C1371l) obj;
        }
        return null;
    }

    /* renamed from: d */
    public void mo4742d(Object obj, Throwable th) {
        if (obj instanceof C1409w) {
            ((C1409w) obj).f3611b.invoke(th);
        }
    }

    /* renamed from: e */
    public C3773d<T> mo4743e() {
        return this;
    }

    public C3339e getCallerFrame() {
        C3773d<T> dVar = this.f20869j;
        if (dVar instanceof C3339e) {
            return (C3339e) dVar;
        }
        return null;
    }

    public C3778g getContext() {
        return this.f20869j.getContext();
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: l */
    public Object mo4748l() {
        Object obj = this.f20870k;
        if (C1384o0.m5425a()) {
            if (!(obj != C3384i.f20872a)) {
                throw new AssertionError();
            }
        }
        this.f20870k = C3384i.f20872a;
        return obj;
    }

    /* renamed from: m */
    public final void mo14412m() {
        do {
        } while (this._reusableCancellableContinuation == C3384i.f20873b);
    }

    /* renamed from: n */
    public final C1371l<T> mo14413n() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = C3384i.f20873b;
                return null;
            } else if (obj instanceof C1371l) {
                if (C1282b.m5160a(f20867m, this, obj, C3384i.f20873b)) {
                    return (C1371l) obj;
                }
            } else if (obj != C3384i.f20873b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(C3357i.m24513j("Inconsistent state ", obj).toString());
            }
        }
    }

    /* renamed from: p */
    public final boolean mo14414p() {
        return this._reusableCancellableContinuation != null;
    }

    /* renamed from: q */
    public final boolean mo14415q(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C3377e0 e0Var = C3384i.f20873b;
            if (C3357i.m24504a(obj, e0Var)) {
                if (C1282b.m5160a(f20867m, this, e0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (C1282b.m5160a(f20867m, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: r */
    public final void mo14416r() {
        mo14412m();
        C1371l<?> o = m24584o();
        if (o != null) {
            o.mo4752s();
        }
    }

    public void resumeWith(Object obj) {
        C3778g context;
        Object c;
        C3778g context2 = this.f20869j.getContext();
        Object d = C1421z.m5590d(obj, (C4150l) null, 1, (Object) null);
        if (this.f20868i.mo4694P(context2)) {
            this.f20870k = d;
            this.f3609h = 0;
            this.f20868i.mo4673O(context2, this);
            return;
        }
        boolean a = C1384o0.m5425a();
        C1320b1 a2 = C1355h2.f3555a.mo4709a();
        if (a2.mo4664X()) {
            this.f20870k = d;
            this.f3609h = 0;
            a2.mo4661T(this);
            return;
        }
        a2.mo4663V(true);
        try {
            context = getContext();
            c = C3385i0.m24604c(context, this.f20871l);
            this.f20869j.resumeWith(obj);
            C3330q qVar = C3330q.f20829a;
            C3385i0.m24602a(context, c);
            do {
            } while (a2.mo4666Z());
        } catch (Throwable th) {
            try {
                mo4788k(th, (Throwable) null);
            } catch (Throwable th2) {
                a2.mo4660R(true);
                throw th2;
            }
        }
        a2.mo4660R(true);
    }

    /* renamed from: s */
    public final Throwable mo14417s(C1366k<?> kVar) {
        C3377e0 e0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            e0Var = C3384i.f20873b;
            if (obj != e0Var) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(C3357i.m24513j("Inconsistent state ", obj).toString());
                } else if (C1282b.m5160a(f20867m, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!C1282b.m5160a(f20867m, this, e0Var, kVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f20868i + ", " + C1387p0.m5433c(this.f20869j) + ']';
    }
}
