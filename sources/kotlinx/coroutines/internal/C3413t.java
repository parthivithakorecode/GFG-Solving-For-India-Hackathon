package kotlinx.coroutines.internal;

import androidx.work.impl.utils.futures.C1282b;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C3353e;
import p016b5.C1384o0;

/* renamed from: kotlinx.coroutines.internal.t */
public final class C3413t<E> {

    /* renamed from: e */
    public static final C3414a f20911e = new C3414a((C3353e) null);

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f20912f;

    /* renamed from: g */
    private static final /* synthetic */ AtomicLongFieldUpdater f20913g;

    /* renamed from: h */
    public static final C3377e0 f20914h = new C3377e0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    private final int f20915a;

    /* renamed from: b */
    private final boolean f20916b;

    /* renamed from: c */
    private final int f20917c;

    /* renamed from: d */
    private /* synthetic */ AtomicReferenceArray f20918d;

    /* renamed from: kotlinx.coroutines.internal.t$a */
    public static final class C3414a {
        private C3414a() {
        }

        public /* synthetic */ C3414a(C3353e eVar) {
            this();
        }

        /* renamed from: a */
        public final int mo14464a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long mo14465b(long j, int i) {
            return mo14467d(j, 1073741823) | (((long) i) << 0);
        }

        /* renamed from: c */
        public final long mo14466c(long j, int i) {
            return mo14467d(j, 1152921503533105152L) | (((long) i) << 30);
        }

        /* renamed from: d */
        public final long mo14467d(long j, long j2) {
            return j & (~j2);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.t$b */
    public static final class C3415b {

        /* renamed from: a */
        public final int f20919a;

        public C3415b(int i) {
            this.f20919a = i;
        }
    }

    static {
        Class<C3413t> cls = C3413t.class;
        f20912f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f20913g = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C3413t(int i, boolean z) {
        this.f20915a = i;
        this.f20916b = z;
        int i2 = i - 1;
        this.f20917c = i2;
        this.f20918d = new AtomicReferenceArray(i);
        boolean z2 = false;
        if (i2 <= 1073741823) {
            if (!((i & i2) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    private final C3413t<E> m24679b(long j) {
        C3413t<E> tVar = new C3413t<>(this.f20915a * 2, this.f20916b);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f20917c;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f20918d.get(i3 & i);
                if (obj == null) {
                    obj = new C3415b(i);
                }
                tVar.f20918d.set(tVar.f20917c & i, obj);
                i++;
            } else {
                tVar._state = f20911e.mo14467d(j, 1152921504606846976L);
                return tVar;
            }
        }
    }

    /* renamed from: c */
    private final C3413t<E> m24680c(long j) {
        while (true) {
            C3413t<E> tVar = (C3413t) this._next;
            if (tVar != null) {
                return tVar;
            }
            C1282b.m5160a(f20912f, this, (Object) null, m24679b(j));
        }
    }

    /* renamed from: e */
    private final C3413t<E> m24681e(int i, E e) {
        Object obj = this.f20918d.get(this.f20917c & i);
        if (!(obj instanceof C3415b) || ((C3415b) obj).f20919a != i) {
            return null;
        }
        this.f20918d.set(i & this.f20917c, e);
        return this;
    }

    /* renamed from: h */
    private final long m24682h() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f20913g.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: k */
    private final C3413t<E> m24683k(int i, int i2) {
        long j;
        C3414a aVar;
        int i3;
        do {
            j = this._state;
            aVar = f20911e;
            boolean z = false;
            i3 = (int) ((1073741823 & j) >> 0);
            if (C1384o0.m5425a()) {
                if (i3 == i) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j) != 0) {
                return mo14462i();
            }
        } while (!f20913g.compareAndSet(this, j, aVar.mo14465b(j, i2)));
        this.f20918d.set(this.f20917c & i3, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069 A[LOOP:1: B:19:0x0069->B:22:0x007b, LOOP_START, PHI: r0 
      PHI: (r0v8 kotlinx.coroutines.internal.t) = (r0v7 kotlinx.coroutines.internal.t), (r0v10 kotlinx.coroutines.internal.t) binds: [B:18:0x0061, B:22:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo14458a(E r14) {
        /*
            r13 = this;
        L_0x0000:
            long r2 = r13._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            kotlinx.coroutines.internal.t$a r14 = f20911e
            int r14 = r14.mo14464a(r2)
            return r14
        L_0x0012:
            kotlinx.coroutines.internal.t$a r0 = f20911e
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r1 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r9 = (int) r4
            int r10 = r13.f20917c
            int r4 = r9 + 2
            r4 = r4 & r10
            r5 = r1 & r10
            r11 = 1
            if (r4 != r5) goto L_0x0030
            return r11
        L_0x0030:
            boolean r4 = r13.f20916b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r13.f20918d
            r12 = r9 & r10
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L_0x004f
            int r0 = r13.f20915a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L_0x004e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L_0x0000
        L_0x004e:
            return r11
        L_0x004f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f20913g
            long r11 = r0.mo14466c(r2, r1)
            r0 = r4
            r1 = r13
            r4 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f20918d
            r1 = r9 & r10
            r0.set(r1, r14)
            r0 = r13
        L_0x0069:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0073
            goto L_0x007d
        L_0x0073:
            kotlinx.coroutines.internal.t r0 = r0.mo14462i()
            kotlinx.coroutines.internal.t r0 = r0.m24681e(r9, r14)
            if (r0 != 0) goto L_0x0069
        L_0x007d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C3413t.mo14458a(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean mo14459d() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f20913g.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int mo14460f() {
        long j = this._state;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    /* renamed from: g */
    public final boolean mo14461g() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: i */
    public final C3413t<E> mo14462i() {
        return m24680c(m24682h());
    }

    /* renamed from: j */
    public final Object mo14463j() {
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return f20914h;
            }
            C3414a aVar = f20911e;
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f20917c;
            if ((i2 & i3) == (i & i3)) {
                return null;
            }
            Object obj = this.f20918d.get(i3 & i);
            if (obj == null) {
                if (this.f20916b) {
                    return null;
                }
            } else if (obj instanceof C3415b) {
                return null;
            } else {
                int i4 = (i + 1) & 1073741823;
                if (f20913g.compareAndSet(this, j, aVar.mo14465b(j, i4))) {
                    this.f20918d.set(this.f20917c & i, (Object) null);
                    return obj;
                } else if (this.f20916b) {
                    C3413t tVar = this;
                    do {
                        tVar = tVar.m24683k(i, i4);
                    } while (tVar != null);
                    return obj;
                }
            }
        }
    }
}
