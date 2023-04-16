package kotlinx.coroutines.internal;

import androidx.work.impl.utils.futures.C1282b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C3357i;
import kotlin.jvm.internal.C3361m;
import p016b5.C1387p0;

/* renamed from: kotlinx.coroutines.internal.r */
public class C3408r {

    /* renamed from: f */
    static final /* synthetic */ AtomicReferenceFieldUpdater f20905f;

    /* renamed from: g */
    static final /* synthetic */ AtomicReferenceFieldUpdater f20906g;

    /* renamed from: h */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f20907h;
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.internal.r$a */
    public static abstract class C3409a extends C3371c<C3408r> {

        /* renamed from: b */
        public final C3408r f20908b;

        /* renamed from: c */
        public C3408r f20909c;

        public C3409a(C3408r rVar) {
            this.f20908b = rVar;
        }

        /* renamed from: h */
        public void mo14405d(C3408r rVar, Object obj) {
            boolean z = obj == null;
            C3408r rVar2 = z ? this.f20908b : this.f20909c;
            if (rVar2 != null && C1282b.m5160a(C3408r.f20905f, rVar, this, rVar2) && z) {
                C3408r rVar3 = this.f20908b;
                C3408r rVar4 = this.f20909c;
                C3357i.m24505b(rVar4);
                rVar3.m24660n(rVar4);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.r$b */
    public static final class C3410b extends C3422z {
    }

    /* renamed from: kotlinx.coroutines.internal.r$c */
    /* synthetic */ class C3411c extends C3361m {
        C3411c(Object obj) {
            super(obj, C1387p0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return C1387p0.m5431a(this.receiver);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C3408r> cls2 = C3408r.class;
        f20905f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f20906g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f20907h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlinx.coroutines.internal.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlinx.coroutines.internal.r} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (androidx.work.impl.utils.futures.C1282b.m5160a(f20905f, r3, r2, ((kotlinx.coroutines.internal.C3368a0) r4).f20854a) != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.internal.C3408r m24658l(kotlinx.coroutines.internal.C3422z r8) {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.r r0 = (kotlinx.coroutines.internal.C3408r) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f20906g
            boolean r0 = androidx.work.impl.utils.futures.C1282b.m5160a(r1, r7, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r7.mo14441t()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r8) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C3422z
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0032
            r0 = r4
            kotlinx.coroutines.internal.z r0 = (kotlinx.coroutines.internal.C3422z) r0
            boolean r0 = r8.mo14470b(r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            kotlinx.coroutines.internal.z r4 = (kotlinx.coroutines.internal.C3422z) r4
            r4.mo14404c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C3368a0
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f20905f
            kotlinx.coroutines.internal.a0 r4 = (kotlinx.coroutines.internal.C3368a0) r4
            kotlinx.coroutines.internal.r r4 = r4.f20854a
            boolean r2 = androidx.work.impl.utils.futures.C1282b.m5160a(r5, r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.r r2 = (kotlinx.coroutines.internal.C3408r) r2
            goto L_0x0007
        L_0x0052:
            r3 = r4
            kotlinx.coroutines.internal.r r3 = (kotlinx.coroutines.internal.C3408r) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C3408r.m24658l(kotlinx.coroutines.internal.z):kotlinx.coroutines.internal.r");
    }

    /* renamed from: m */
    private final C3408r m24659m(C3408r rVar) {
        while (rVar.mo14441t()) {
            rVar = (C3408r) rVar._prev;
        }
        return rVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m24660n(C3408r rVar) {
        C3408r rVar2;
        do {
            rVar2 = (C3408r) rVar._prev;
            if (mo14444o() != rVar) {
                return;
            }
        } while (!C1282b.m5160a(f20906g, rVar, rVar2, this));
        if (mo14441t()) {
            rVar.m24658l((C3422z) null);
        }
    }

    /* renamed from: w */
    private final C3368a0 m24661w() {
        C3368a0 a0Var = (C3368a0) this._removedRef;
        if (a0Var != null) {
            return a0Var;
        }
        C3368a0 a0Var2 = new C3368a0(this);
        f20907h.lazySet(this, a0Var2);
        return a0Var2;
    }

    /* renamed from: j */
    public final boolean mo14442j(C3408r rVar, C3408r rVar2) {
        f20906g.lazySet(rVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20905f;
        atomicReferenceFieldUpdater.lazySet(rVar, rVar2);
        if (!C1282b.m5160a(atomicReferenceFieldUpdater, this, rVar2, rVar)) {
            return false;
        }
        rVar.m24660n(rVar2);
        return true;
    }

    /* renamed from: k */
    public final boolean mo14443k(C3408r rVar) {
        f20906g.lazySet(rVar, this);
        f20905f.lazySet(rVar, this);
        while (mo14444o() == this) {
            if (C1282b.m5160a(f20905f, this, this, rVar)) {
                rVar.m24660n(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final Object mo14444o() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C3422z)) {
                return obj;
            }
            ((C3422z) obj).mo14404c(this);
        }
    }

    /* renamed from: p */
    public final C3408r mo14445p() {
        return C3407q.m24656b(mo14444o());
    }

    /* renamed from: q */
    public final C3408r mo14446q() {
        C3408r l = m24658l((C3422z) null);
        return l == null ? m24659m((C3408r) this._prev) : l;
    }

    /* renamed from: r */
    public final void mo14447r() {
        ((C3368a0) mo14444o()).f20854a.mo14448s();
    }

    /* renamed from: s */
    public final void mo14448s() {
        C3408r rVar = this;
        while (true) {
            Object o = rVar.mo14444o();
            if (!(o instanceof C3368a0)) {
                rVar.m24658l((C3422z) null);
                return;
            }
            rVar = ((C3368a0) o).f20854a;
        }
    }

    /* renamed from: t */
    public boolean mo14441t() {
        return mo14444o() instanceof C3368a0;
    }

    public String toString() {
        return new C3411c(this) + '@' + C1387p0.m5432b(this);
    }

    /* renamed from: u */
    public boolean mo14449u() {
        return mo14450v() == null;
    }

    /* renamed from: v */
    public final C3408r mo14450v() {
        Object o;
        C3408r rVar;
        do {
            o = mo14444o();
            if (o instanceof C3368a0) {
                return ((C3368a0) o).f20854a;
            }
            if (o == this) {
                return (C3408r) o;
            }
            rVar = (C3408r) o;
        } while (!C1282b.m5160a(f20905f, this, o, rVar.m24661w()));
        rVar.m24658l((C3422z) null);
        return null;
    }

    /* renamed from: x */
    public final int mo14451x(C3408r rVar, C3408r rVar2, C3409a aVar) {
        f20906g.lazySet(rVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20905f;
        atomicReferenceFieldUpdater.lazySet(rVar, rVar2);
        aVar.f20909c = rVar2;
        if (!C1282b.m5160a(atomicReferenceFieldUpdater, this, rVar2, aVar)) {
            return 0;
        }
        return aVar.mo14404c(this) == null ? 1 : 2;
    }
}
