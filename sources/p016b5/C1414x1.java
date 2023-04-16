package p016b5;

import androidx.work.impl.utils.futures.C1282b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import kotlinx.coroutines.internal.C3375d0;
import kotlinx.coroutines.internal.C3407q;
import kotlinx.coroutines.internal.C3408r;
import kotlinx.coroutines.internal.C3422z;
import p016b5.C1391q1;
import p079k4.C3330q;
import p100n4.C3778g;
import p145u4.C4150l;
import p145u4.C4154p;

/* renamed from: b5.x1 */
public class C1414x1 implements C1391q1, C1397s, C1341e2 {

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3614f = AtomicReferenceFieldUpdater.newUpdater(C1414x1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* renamed from: b5.x1$a */
    private static final class C1415a extends C1411w1 {

        /* renamed from: j */
        private final C1414x1 f3615j;

        /* renamed from: k */
        private final C1416b f3616k;

        /* renamed from: l */
        private final C1394r f3617l;

        /* renamed from: m */
        private final Object f3618m;

        public C1415a(C1414x1 x1Var, C1416b bVar, C1394r rVar, Object obj) {
            this.f3615j = x1Var;
            this.f3616k = bVar;
            this.f3617l = rVar;
            this.f3618m = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo4761y((Throwable) obj);
            return C3330q.f20829a;
        }

        /* renamed from: y */
        public void mo4761y(Throwable th) {
            this.f3615j.m5503C(this.f3616k, this.f3617l, this.f3618m);
        }
    }

    /* renamed from: b5.x1$b */
    private static final class C1416b implements C1373l1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: f */
        private final C1321b2 f3619f;

        public C1416b(C1321b2 b2Var, boolean z, Throwable th) {
            this.f3619f = b2Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: b */
        private final ArrayList<Throwable> m5562b() {
            return new ArrayList<>(4);
        }

        /* renamed from: c */
        private final Object m5563c() {
            return this._exceptionsHolder;
        }

        /* renamed from: l */
        private final void m5564l(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* renamed from: a */
        public final void mo4813a(Throwable th) {
            Throwable e = mo4814e();
            if (e == null) {
                mo4820m(th);
            } else if (th != e) {
                Object c = m5563c();
                if (c == null) {
                    m5564l(th);
                } else if (c instanceof Throwable) {
                    if (th != c) {
                        ArrayList<Throwable> b = m5562b();
                        b.add(c);
                        b.add(th);
                        m5564l(b);
                    }
                } else if (c instanceof ArrayList) {
                    ((ArrayList) c).add(th);
                } else {
                    throw new IllegalStateException(C3357i.m24513j("State is ", c).toString());
                }
            }
        }

        /* renamed from: d */
        public boolean mo4653d() {
            return mo4814e() == null;
        }

        /* renamed from: e */
        public final Throwable mo4814e() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: f */
        public final boolean mo4815f() {
            return mo4814e() != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        /* renamed from: g */
        public final boolean mo4816g() {
            return this._isCompleting;
        }

        /* renamed from: h */
        public C1321b2 mo4654h() {
            return this.f3619f;
        }

        /* renamed from: i */
        public final boolean mo4817i() {
            return m5563c() == C1420y1.f3631e;
        }

        /* renamed from: j */
        public final List<Throwable> mo4818j(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object c = m5563c();
            if (c == null) {
                arrayList = m5562b();
            } else if (c instanceof Throwable) {
                ArrayList<Throwable> b = m5562b();
                b.add(c);
                arrayList = b;
            } else if (c instanceof ArrayList) {
                arrayList = (ArrayList) c;
            } else {
                throw new IllegalStateException(C3357i.m24513j("State is ", c).toString());
            }
            Throwable e = mo4814e();
            if (e != null) {
                arrayList.add(0, e);
            }
            if (th != null && !C3357i.m24504a(th, e)) {
                arrayList.add(th);
            }
            m5564l(C1420y1.f3631e);
            return arrayList;
        }

        /* renamed from: k */
        public final void mo4819k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* renamed from: m */
        public final void mo4820m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + mo4815f() + ", completing=" + mo4816g() + ", rootCause=" + mo4814e() + ", exceptions=" + m5563c() + ", list=" + mo4654h() + ']';
        }
    }

    /* renamed from: b5.x1$c */
    public static final class C1417c extends C3408r.C3409a {

        /* renamed from: d */
        final /* synthetic */ C3408r f3620d;

        /* renamed from: e */
        final /* synthetic */ C1414x1 f3621e;

        /* renamed from: f */
        final /* synthetic */ Object f3622f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1417c(C3408r rVar, C1414x1 x1Var, Object obj) {
            super(rVar);
            this.f3620d = rVar;
            this.f3621e = x1Var;
            this.f3622f = obj;
        }

        /* renamed from: i */
        public Object mo4822g(C3408r rVar) {
            if (this.f3621e.mo4798Q() == this.f3622f) {
                return null;
            }
            return C3407q.m24655a();
        }
    }

    public C1414x1(boolean z) {
        this._state = z ? C1420y1.f3633g : C1420y1.f3632f;
        this._parentHandle = null;
    }

    /* renamed from: A */
    private final void m5502A(C1373l1 l1Var, Object obj) {
        C1389q P = mo4797P();
        if (P != null) {
            P.mo4679b();
            mo4806j0(C1330c2.f3543f);
        }
        Throwable th = null;
        C1406v vVar = obj instanceof C1406v ? (C1406v) obj : null;
        if (vVar != null) {
            th = vVar.f3608a;
        }
        if (l1Var instanceof C1411w1) {
            try {
                ((C1411w1) l1Var).mo4761y(th);
            } catch (Throwable th2) {
                mo4639S(new C1418y("Exception in completion handler " + l1Var + " for " + this, th2));
            }
        } else {
            C1321b2 h = l1Var.mo4654h();
            if (h != null) {
                m5514c0(h, th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m5503C(C1416b bVar, C1394r rVar, Object obj) {
        if (C1384o0.m5425a()) {
            if (!(mo4798Q() == bVar)) {
                throw new AssertionError();
            }
        }
        C1394r a0 = m5512a0(rVar);
        if (a0 == null || !m5530t0(bVar, a0, obj)) {
            mo4784p(m5505E(bVar, obj));
        }
    }

    /* renamed from: D */
    private final Throwable m5504D(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C1396r1(mo4649x(), (Throwable) null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((C1341e2) obj).mo4704v();
    }

    /* renamed from: E */
    private final Object m5505E(C1416b bVar, Object obj) {
        boolean f;
        Throwable K;
        boolean z = true;
        if (C1384o0.m5425a()) {
            if (!(mo4798Q() == bVar)) {
                throw new AssertionError();
            }
        }
        if (C1384o0.m5425a() && !(!bVar.mo4817i())) {
            throw new AssertionError();
        } else if (!C1384o0.m5425a() || bVar.mo4816g()) {
            C1406v vVar = obj instanceof C1406v ? (C1406v) obj : null;
            Throwable th = vVar == null ? null : vVar.f3608a;
            synchronized (bVar) {
                f = bVar.mo4815f();
                List<Throwable> j = bVar.mo4818j(th);
                K = m5508K(bVar, j);
                if (K != null) {
                    m5523o(K, j);
                }
            }
            if (!(K == null || K == th)) {
                obj = new C1406v(K, false, 2, (C3353e) null);
            }
            if (K != null) {
                if (!m5529t(K) && !mo4705R(K)) {
                    z = false;
                }
                if (z) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    ((C1406v) obj).mo4786b();
                }
            }
            if (!f) {
                mo4803d0(K);
            }
            mo4643e0(obj);
            boolean a = C1282b.m5160a(f3614f, this, bVar, C1420y1.m5586g(obj));
            if (!C1384o0.m5425a() || a) {
                m5502A(bVar, obj);
                return obj;
            }
            throw new AssertionError();
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: I */
    private final C1394r m5506I(C1373l1 l1Var) {
        C1394r rVar = l1Var instanceof C1394r ? (C1394r) l1Var : null;
        if (rVar != null) {
            return rVar;
        }
        C1321b2 h = l1Var.mo4654h();
        if (h == null) {
            return null;
        }
        return m5512a0(h);
    }

    /* renamed from: J */
    private final Throwable m5507J(Object obj) {
        C1406v vVar = obj instanceof C1406v ? (C1406v) obj : null;
        if (vVar == null) {
            return null;
        }
        return vVar.f3608a;
    }

    /* renamed from: K */
    private final Throwable m5508K(C1416b bVar, List<? extends Throwable> list) {
        T t = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (!(((Throwable) next) instanceof CancellationException)) {
                    t = next;
                    break;
                }
            }
            Throwable th = (Throwable) t;
            return th != null ? th : (Throwable) list.get(0);
        } else if (bVar.mo4815f()) {
            return new C1396r1(mo4649x(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    /* renamed from: O */
    private final C1321b2 m5509O(C1373l1 l1Var) {
        C1321b2 h = l1Var.mo4654h();
        if (h != null) {
            return h;
        }
        if (l1Var instanceof C1316a1) {
            return new C1321b2();
        }
        if (l1Var instanceof C1411w1) {
            m5516h0((C1411w1) l1Var);
            return null;
        }
        throw new IllegalStateException(C3357i.m24513j("State should have list: ", l1Var).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        m5513b0(((p016b5.C1414x1.C1416b) r2).mo4654h(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        return p016b5.C1420y1.m5580a();
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m5510W(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.mo4798Q()
            boolean r3 = r2 instanceof p016b5.C1414x1.C1416b
            if (r3 == 0) goto L_0x0052
            monitor-enter(r2)
            r3 = r2
            b5.x1$b r3 = (p016b5.C1414x1.C1416b) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.mo4817i()     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x001a
            kotlinx.coroutines.internal.e0 r7 = p016b5.C1420y1.f3630d     // Catch:{ all -> 0x004f }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            b5.x1$b r3 = (p016b5.C1414x1.C1416b) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.mo4815f()     // Catch:{ all -> 0x004f }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0031
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            java.lang.Throwable r1 = r6.m5504D(r7)     // Catch:{ all -> 0x004f }
        L_0x002b:
            r7 = r2
            b5.x1$b r7 = (p016b5.C1414x1.C1416b) r7     // Catch:{ all -> 0x004f }
            r7.mo4813a(r1)     // Catch:{ all -> 0x004f }
        L_0x0031:
            r7 = r2
            b5.x1$b r7 = (p016b5.C1414x1.C1416b) r7     // Catch:{ all -> 0x004f }
            java.lang.Throwable r7 = r7.mo4814e()     // Catch:{ all -> 0x004f }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0041
            goto L_0x004a
        L_0x0041:
            b5.x1$b r2 = (p016b5.C1414x1.C1416b) r2
            b5.b2 r7 = r2.mo4654h()
            r6.m5513b0(r7, r0)
        L_0x004a:
            kotlinx.coroutines.internal.e0 r7 = p016b5.C1420y1.f3627a
            return r7
        L_0x004f:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0052:
            boolean r3 = r2 instanceof p016b5.C1373l1
            if (r3 == 0) goto L_0x009a
            if (r1 != 0) goto L_0x005c
            java.lang.Throwable r1 = r6.m5504D(r7)
        L_0x005c:
            r3 = r2
            b5.l1 r3 = (p016b5.C1373l1) r3
            boolean r4 = r3.mo4653d()
            if (r4 == 0) goto L_0x0070
            boolean r2 = r6.m5525q0(r3, r1)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.internal.e0 r7 = p016b5.C1420y1.f3627a
            return r7
        L_0x0070:
            b5.v r3 = new b5.v
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.m5526r0(r2, r3)
            kotlinx.coroutines.internal.e0 r4 = p016b5.C1420y1.f3627a
            if (r3 == r4) goto L_0x008a
            kotlinx.coroutines.internal.e0 r2 = p016b5.C1420y1.f3629c
            if (r3 != r2) goto L_0x0089
            goto L_0x0002
        L_0x0089:
            return r3
        L_0x008a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot happen in "
            java.lang.String r0 = kotlin.jvm.internal.C3357i.m24513j(r0, r2)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x009a:
            kotlinx.coroutines.internal.e0 r7 = p016b5.C1420y1.f3630d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p016b5.C1414x1.m5510W(java.lang.Object):java.lang.Object");
    }

    /* renamed from: Y */
    private final C1411w1 m5511Y(C4150l<? super Throwable, C3330q> lVar, boolean z) {
        C1411w1 w1Var = null;
        if (z) {
            if (lVar instanceof C1399s1) {
                w1Var = (C1399s1) lVar;
            }
            if (w1Var == null) {
                w1Var = new C1385o1(lVar);
            }
        } else {
            C1411w1 w1Var2 = lVar instanceof C1411w1 ? (C1411w1) lVar : null;
            if (w1Var2 != null) {
                if (!C1384o0.m5425a() || (!(w1Var2 instanceof C1399s1))) {
                    w1Var = w1Var2;
                } else {
                    throw new AssertionError();
                }
            }
            if (w1Var == null) {
                w1Var = new C1388p1(lVar);
            }
        }
        w1Var.mo4793A(this);
        return w1Var;
    }

    /* renamed from: a0 */
    private final C1394r m5512a0(C3408r rVar) {
        while (rVar.mo14441t()) {
            rVar = rVar.mo14446q();
        }
        while (true) {
            rVar = rVar.mo14445p();
            if (!rVar.mo14441t()) {
                if (rVar instanceof C1394r) {
                    return (C1394r) rVar;
                }
                if (rVar instanceof C1321b2) {
                    return null;
                }
            }
        }
    }

    /* renamed from: b0 */
    private final void m5513b0(C1321b2 b2Var, Throwable th) {
        C1418y yVar;
        mo4803d0(th);
        C1418y yVar2 = null;
        for (C3408r rVar = (C3408r) b2Var.mo14444o(); !C3357i.m24504a(rVar, b2Var); rVar = rVar.mo14445p()) {
            if (rVar instanceof C1399s1) {
                C1411w1 w1Var = (C1411w1) rVar;
                try {
                    w1Var.mo4761y(th);
                } catch (Throwable th2) {
                    if (yVar2 == null) {
                        yVar = null;
                    } else {
                        C3313b.m24439a(yVar2, th2);
                        yVar = yVar2;
                    }
                    if (yVar == null) {
                        yVar2 = new C1418y("Exception in completion handler " + w1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (yVar2 != null) {
            mo4639S(yVar2);
        }
        m5529t(th);
    }

    /* renamed from: c0 */
    private final void m5514c0(C1321b2 b2Var, Throwable th) {
        C1418y yVar;
        C1418y yVar2 = null;
        for (C3408r rVar = (C3408r) b2Var.mo14444o(); !C3357i.m24504a(rVar, b2Var); rVar = rVar.mo14445p()) {
            if (rVar instanceof C1411w1) {
                C1411w1 w1Var = (C1411w1) rVar;
                try {
                    w1Var.mo4761y(th);
                } catch (Throwable th2) {
                    if (yVar2 == null) {
                        yVar = null;
                    } else {
                        C3313b.m24439a(yVar2, th2);
                        yVar = yVar2;
                    }
                    if (yVar == null) {
                        yVar2 = new C1418y("Exception in completion handler " + w1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (yVar2 != null) {
            mo4639S(yVar2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [b5.k1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m5515g0(p016b5.C1316a1 r3) {
        /*
            r2 = this;
            b5.b2 r0 = new b5.b2
            r0.<init>()
            boolean r1 = r3.mo4653d()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            b5.k1 r1 = new b5.k1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f3614f
            androidx.work.impl.utils.futures.C1282b.m5160a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p016b5.C1414x1.m5515g0(b5.a1):void");
    }

    /* renamed from: h0 */
    private final void m5516h0(C1411w1 w1Var) {
        w1Var.mo14443k(new C1321b2());
        C1282b.m5160a(f3614f, this, w1Var, w1Var.mo14445p());
    }

    /* renamed from: k0 */
    private final int m5519k0(Object obj) {
        if (obj instanceof C1316a1) {
            if (((C1316a1) obj).mo4653d()) {
                return 0;
            }
            if (!C1282b.m5160a(f3614f, this, obj, C1420y1.f3633g)) {
                return -1;
            }
            mo4804f0();
            return 1;
        } else if (!(obj instanceof C1369k1)) {
            return 0;
        } else {
            if (!C1282b.m5160a(f3614f, this, obj, ((C1369k1) obj).mo4654h())) {
                return -1;
            }
            mo4804f0();
            return 1;
        }
    }

    /* renamed from: l */
    private final boolean m5520l(Object obj, C1321b2 b2Var, C1411w1 w1Var) {
        int x;
        C1417c cVar = new C1417c(w1Var, this, obj);
        do {
            x = b2Var.mo14446q().mo14451x(w1Var, b2Var, cVar);
            if (x == 1) {
                return true;
            }
        } while (x != 2);
        return false;
    }

    /* renamed from: l0 */
    private final String m5521l0(Object obj) {
        if (!(obj instanceof C1416b)) {
            return obj instanceof C1373l1 ? ((C1373l1) obj).mo4653d() ? "Active" : "New" : obj instanceof C1406v ? "Cancelled" : "Completed";
        }
        C1416b bVar = (C1416b) obj;
        return bVar.mo4815f() ? "Cancelling" : bVar.mo4816g() ? "Completing" : "Active";
    }

    /* renamed from: n0 */
    public static /* synthetic */ CancellationException m5522n0(C1414x1 x1Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return x1Var.mo4807m0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: o */
    private final void m5523o(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Throwable n = !C1384o0.m5428d() ? th : C3375d0.m24571n(th);
            for (Throwable th2 : list) {
                if (C1384o0.m5428d()) {
                    th2 = C3375d0.m24571n(th2);
                }
                if (th2 != th && th2 != n && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C3313b.m24439a(th, th2);
                }
            }
        }
    }

    /* renamed from: p0 */
    private final boolean m5524p0(C1373l1 l1Var, Object obj) {
        if (C1384o0.m5425a()) {
            if (!((l1Var instanceof C1316a1) || (l1Var instanceof C1411w1))) {
                throw new AssertionError();
            }
        }
        if (C1384o0.m5425a() && !(!(obj instanceof C1406v))) {
            throw new AssertionError();
        } else if (!C1282b.m5160a(f3614f, this, l1Var, C1420y1.m5586g(obj))) {
            return false;
        } else {
            mo4803d0((Throwable) null);
            mo4643e0(obj);
            m5502A(l1Var, obj);
            return true;
        }
    }

    /* renamed from: q0 */
    private final boolean m5525q0(C1373l1 l1Var, Throwable th) {
        if (C1384o0.m5425a() && !(!(l1Var instanceof C1416b))) {
            throw new AssertionError();
        } else if (!C1384o0.m5425a() || l1Var.mo4653d()) {
            C1321b2 O = m5509O(l1Var);
            if (O == null) {
                return false;
            }
            if (!C1282b.m5160a(f3614f, this, l1Var, new C1416b(O, false, th))) {
                return false;
            }
            m5513b0(O, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: r0 */
    private final Object m5526r0(Object obj, Object obj2) {
        return !(obj instanceof C1373l1) ? C1420y1.f3627a : (((obj instanceof C1316a1) || (obj instanceof C1411w1)) && !(obj instanceof C1394r) && !(obj2 instanceof C1406v)) ? m5524p0((C1373l1) obj, obj2) ? obj2 : C1420y1.f3629c : m5528s0((C1373l1) obj, obj2);
    }

    /* renamed from: s */
    private final Object m5527s(Object obj) {
        Object r0;
        do {
            Object Q = mo4798Q();
            if (!(Q instanceof C1373l1) || ((Q instanceof C1416b) && ((C1416b) Q).mo4816g())) {
                return C1420y1.f3627a;
            }
            r0 = m5526r0(Q, new C1406v(m5504D(obj), false, 2, (C3353e) null));
        } while (r0 == C1420y1.f3629c);
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0072, code lost:
        if (r2 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0075, code lost:
        m5513b0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0078, code lost:
        r7 = m5506I(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007c, code lost:
        if (r7 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0082, code lost:
        if (m5530t0(r1, r7, r8) == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0086, code lost:
        return p016b5.C1420y1.f3628b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008b, code lost:
        return m5505E(r1, r8);
     */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m5528s0(p016b5.C1373l1 r7, java.lang.Object r8) {
        /*
            r6 = this;
            b5.b2 r0 = r6.m5509O(r7)
            if (r0 != 0) goto L_0x000b
            kotlinx.coroutines.internal.e0 r7 = p016b5.C1420y1.f3629c
            return r7
        L_0x000b:
            boolean r1 = r7 instanceof p016b5.C1414x1.C1416b
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r7
            b5.x1$b r1 = (p016b5.C1414x1.C1416b) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            if (r1 != 0) goto L_0x001d
            b5.x1$b r1 = new b5.x1$b
            r3 = 0
            r1.<init>(r0, r3, r2)
        L_0x001d:
            monitor-enter(r1)
            boolean r3 = r1.mo4816g()     // Catch:{ all -> 0x008c }
            if (r3 == 0) goto L_0x002a
            kotlinx.coroutines.internal.e0 r7 = p016b5.C1420y1.f3627a     // Catch:{ all -> 0x008c }
            monitor-exit(r1)
            return r7
        L_0x002a:
            r3 = 1
            r1.mo4819k(r3)     // Catch:{ all -> 0x008c }
            if (r1 == r7) goto L_0x003e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f3614f     // Catch:{ all -> 0x008c }
            boolean r4 = androidx.work.impl.utils.futures.C1282b.m5160a(r4, r6, r7, r1)     // Catch:{ all -> 0x008c }
            if (r4 != 0) goto L_0x003e
            kotlinx.coroutines.internal.e0 r7 = p016b5.C1420y1.f3629c     // Catch:{ all -> 0x008c }
            monitor-exit(r1)
            return r7
        L_0x003e:
            boolean r4 = p016b5.C1384o0.m5425a()     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x0052
            boolean r4 = r1.mo4817i()     // Catch:{ all -> 0x008c }
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x004c
            goto L_0x0052
        L_0x004c:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ all -> 0x008c }
            r7.<init>()     // Catch:{ all -> 0x008c }
            throw r7     // Catch:{ all -> 0x008c }
        L_0x0052:
            boolean r4 = r1.mo4815f()     // Catch:{ all -> 0x008c }
            boolean r5 = r8 instanceof p016b5.C1406v     // Catch:{ all -> 0x008c }
            if (r5 == 0) goto L_0x005e
            r5 = r8
            b5.v r5 = (p016b5.C1406v) r5     // Catch:{ all -> 0x008c }
            goto L_0x005f
        L_0x005e:
            r5 = r2
        L_0x005f:
            if (r5 != 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            java.lang.Throwable r5 = r5.f3608a     // Catch:{ all -> 0x008c }
            r1.mo4813a(r5)     // Catch:{ all -> 0x008c }
        L_0x0067:
            java.lang.Throwable r5 = r1.mo4814e()     // Catch:{ all -> 0x008c }
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x006f
            r2 = r5
        L_0x006f:
            k4.q r3 = p079k4.C3330q.f20829a     // Catch:{ all -> 0x008c }
            monitor-exit(r1)
            if (r2 != 0) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            r6.m5513b0(r0, r2)
        L_0x0078:
            b5.r r7 = r6.m5506I(r7)
            if (r7 == 0) goto L_0x0087
            boolean r7 = r6.m5530t0(r1, r7, r8)
            if (r7 == 0) goto L_0x0087
            kotlinx.coroutines.internal.e0 r7 = p016b5.C1420y1.f3628b
            return r7
        L_0x0087:
            java.lang.Object r7 = r6.m5505E(r1, r8)
            return r7
        L_0x008c:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p016b5.C1414x1.m5528s0(b5.l1, java.lang.Object):java.lang.Object");
    }

    /* renamed from: t */
    private final boolean m5529t(Throwable th) {
        if (mo4801V()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C1389q P = mo4797P();
        return (P == null || P == C1330c2.f3543f) ? z : P.mo4689g(th) || z;
    }

    /* renamed from: t0 */
    private final boolean m5530t0(C1416b bVar, C1394r rVar, Object obj) {
        while (C1391q1.C1392a.m5453d(rVar.f3595j, false, false, new C1415a(this, bVar, rVar, obj), 1, (Object) null) == C1330c2.f3543f) {
            rVar = m5512a0(rVar);
            if (rVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: B */
    public void mo4763B(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C1396r1(mo4649x(), (Throwable) null, this);
        }
        mo4810r(cancellationException);
    }

    /* renamed from: G */
    public final C1389q mo4764G(C1397s sVar) {
        return (C1389q) C1391q1.C1392a.m5453d(this, true, false, new C1394r(sVar), 2, (Object) null);
    }

    /* renamed from: L */
    public boolean mo4776L() {
        return true;
    }

    /* renamed from: M */
    public boolean mo4777M() {
        return false;
    }

    /* renamed from: P */
    public final C1389q mo4797P() {
        return (C1389q) this._parentHandle;
    }

    /* renamed from: Q */
    public final Object mo4798Q() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C3422z)) {
                return obj;
            }
            ((C3422z) obj).mo14404c(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public boolean mo4705R(Throwable th) {
        return false;
    }

    /* renamed from: S */
    public void mo4639S(Throwable th) {
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final void mo4799T(C1391q1 q1Var) {
        if (C1384o0.m5425a()) {
            if (!(mo4797P() == null)) {
                throw new AssertionError();
            }
        }
        if (q1Var == null) {
            mo4806j0(C1330c2.f3543f);
            return;
        }
        q1Var.start();
        C1389q G = q1Var.mo4764G(this);
        mo4806j0(G);
        if (mo4800U()) {
            G.mo4679b();
            mo4806j0(C1330c2.f3543f);
        }
    }

    /* renamed from: U */
    public final boolean mo4800U() {
        return !(mo4798Q() instanceof C1373l1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public boolean mo4801V() {
        return false;
    }

    /* renamed from: X */
    public final Object mo4802X(Object obj) {
        Object r0;
        do {
            r0 = m5526r0(mo4798Q(), obj);
            if (r0 == C1420y1.f3627a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m5507J(obj));
            }
        } while (r0 == C1420y1.f3629c);
        return r0;
    }

    /* renamed from: Z */
    public String mo4640Z() {
        return C1387p0.m5431a(this);
    }

    /* renamed from: d */
    public boolean mo4641d() {
        Object Q = mo4798Q();
        return (Q instanceof C1373l1) && ((C1373l1) Q).mo4653d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo4803d0(Throwable th) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public void mo4643e0(Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo4804f0() {
    }

    public <R> R fold(R r, C4154p<? super R, ? super C3778g.C3781b, ? extends R> pVar) {
        return C1391q1.C1392a.m5451b(this, r, pVar);
    }

    public <E extends C3778g.C3781b> E get(C3778g.C3783c<E> cVar) {
        return C1391q1.C1392a.m5452c(this, cVar);
    }

    public final C3778g.C3783c<?> getKey() {
        return C1391q1.f3593c;
    }

    /* renamed from: h */
    public final void mo4773h(C1341e2 e2Var) {
        mo4809q(e2Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4805i0(p016b5.C1411w1 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.mo4798Q()
            boolean r1 = r0 instanceof p016b5.C1411w1
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f3614f
            b5.a1 r2 = p016b5.C1420y1.f3633g
            boolean r0 = androidx.work.impl.utils.futures.C1282b.m5160a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof p016b5.C1373l1
            if (r1 == 0) goto L_0x0027
            b5.l1 r0 = (p016b5.C1373l1) r0
            b5.b2 r0 = r0.mo4654h()
            if (r0 == 0) goto L_0x0027
            r4.mo14449u()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p016b5.C1414x1.mo4805i0(b5.w1):void");
    }

    /* renamed from: j0 */
    public final void mo4806j0(C1389q qVar) {
        this._parentHandle = qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public final CancellationException mo4807m0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = mo4649x();
            }
            cancellationException = new C1396r1(str, th, this);
        }
        return cancellationException;
    }

    public C3778g minusKey(C3778g.C3783c<?> cVar) {
        return C1391q1.C1392a.m5454e(this, cVar);
    }

    /* renamed from: o0 */
    public final String mo4808o0() {
        return mo4640Z() + '{' + m5521l0(mo4798Q()) + '}';
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo4784p(Object obj) {
    }

    public C3778g plus(C3778g gVar) {
        return C1391q1.C1392a.m5455f(this, gVar);
    }

    /* renamed from: q */
    public final boolean mo4809q(Object obj) {
        Object a = C1420y1.f3627a;
        if (mo4777M() && (a = m5527s(obj)) == C1420y1.f3628b) {
            return true;
        }
        if (a == C1420y1.f3627a) {
            a = m5510W(obj);
        }
        if (a == C1420y1.f3627a || a == C1420y1.f3628b) {
            return true;
        }
        if (a == C1420y1.f3630d) {
            return false;
        }
        mo4784p(a);
        return true;
    }

    /* renamed from: r */
    public void mo4810r(Throwable th) {
        mo4809q(th);
    }

    public final boolean start() {
        int k0;
        do {
            k0 = m5519k0(mo4798Q());
            if (k0 == 0) {
                return false;
            }
        } while (k0 != 1);
        return true;
    }

    public String toString() {
        return mo4808o0() + '@' + C1387p0.m5432b(this);
    }

    /* renamed from: u */
    public final C1422z0 mo4766u(boolean z, boolean z2, C4150l<? super Throwable, C3330q> lVar) {
        C1411w1 Y = m5511Y(lVar, z);
        while (true) {
            Object Q = mo4798Q();
            if (Q instanceof C1316a1) {
                C1316a1 a1Var = (C1316a1) Q;
                if (!a1Var.mo4653d()) {
                    m5515g0(a1Var);
                } else if (C1282b.m5160a(f3614f, this, Q, Y)) {
                    return Y;
                }
            } else {
                Throwable th = null;
                if (Q instanceof C1373l1) {
                    C1321b2 h = ((C1373l1) Q).mo4654h();
                    if (h == null) {
                        Objects.requireNonNull(Q, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        m5516h0((C1411w1) Q);
                    } else {
                        C1422z0 z0Var = C1330c2.f3543f;
                        if (z && (Q instanceof C1416b)) {
                            synchronized (Q) {
                                th = ((C1416b) Q).mo4814e();
                                if (th == null || ((lVar instanceof C1394r) && !((C1416b) Q).mo4816g())) {
                                    if (m5520l(Q, h, Y)) {
                                        if (th == null) {
                                            return Y;
                                        }
                                        z0Var = Y;
                                    }
                                }
                                C3330q qVar = C3330q.f20829a;
                            }
                        }
                        if (th != null) {
                            if (z2) {
                                lVar.invoke(th);
                            }
                            return z0Var;
                        } else if (m5520l(Q, h, Y)) {
                            return Y;
                        }
                    }
                } else {
                    if (z2) {
                        C1406v vVar = Q instanceof C1406v ? (C1406v) Q : null;
                        if (vVar != null) {
                            th = vVar.f3608a;
                        }
                        lVar.invoke(th);
                    }
                    return C1330c2.f3543f;
                }
            }
        }
    }

    /* renamed from: v */
    public CancellationException mo4704v() {
        Throwable th;
        Object Q = mo4798Q();
        CancellationException cancellationException = null;
        if (Q instanceof C1416b) {
            th = ((C1416b) Q).mo4814e();
        } else if (Q instanceof C1406v) {
            th = ((C1406v) Q).f3608a;
        } else if (!(Q instanceof C1373l1)) {
            th = null;
        } else {
            throw new IllegalStateException(C3357i.m24513j("Cannot be cancelling child in this state: ", Q).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new C1396r1(C3357i.m24513j("Parent job is ", m5521l0(Q)), th, this) : cancellationException;
    }

    /* renamed from: w */
    public final CancellationException mo4767w() {
        Object Q = mo4798Q();
        CancellationException cancellationException = null;
        if (Q instanceof C1416b) {
            Throwable e = ((C1416b) Q).mo4814e();
            if (e != null) {
                cancellationException = mo4807m0(e, C3357i.m24513j(C1387p0.m5431a(this), " is cancelling"));
            }
            if (cancellationException != null) {
                return cancellationException;
            }
            throw new IllegalStateException(C3357i.m24513j("Job is still new or active: ", this).toString());
        } else if (!(Q instanceof C1373l1)) {
            return Q instanceof C1406v ? m5522n0(this, ((C1406v) Q).f3608a, (String) null, 1, (Object) null) : new C1396r1(C3357i.m24513j(C1387p0.m5431a(this), " has completed normally"), (Throwable) null, this);
        } else {
            throw new IllegalStateException(C3357i.m24513j("Job is still new or active: ", this).toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public String mo4649x() {
        return "Job was cancelled";
    }

    /* renamed from: y */
    public boolean mo4812y(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return mo4809q(th) && mo4776L();
    }
}
