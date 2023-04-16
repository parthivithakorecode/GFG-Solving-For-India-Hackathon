package kotlinx.coroutines.scheduling;

import androidx.work.impl.utils.futures.C1282b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p016b5.C1384o0;

/* renamed from: kotlinx.coroutines.scheduling.n */
public final class C3440n {

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f20977b;

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f20978c;

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f20979d;

    /* renamed from: e */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f20980e;

    /* renamed from: a */
    private final AtomicReferenceArray<C3434h> f20981a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<C3440n> cls = C3440n.class;
        f20977b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f20978c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f20979d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f20980e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: b */
    public static /* synthetic */ C3434h m24764b(C3440n nVar, C3434h hVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return nVar.mo14500a(hVar, z);
    }

    /* renamed from: c */
    private final C3434h m24765c(C3434h hVar) {
        boolean z = true;
        if (hVar.f20966g.mo14497b() != 1) {
            z = false;
        }
        if (z) {
            f20980e.incrementAndGet(this);
        }
        if (mo14501e() == 127) {
            return hVar;
        }
        int i = this.producerIndex & 127;
        while (this.f20981a.get(i) != null) {
            Thread.yield();
        }
        this.f20981a.lazySet(i, hVar);
        f20978c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    private final void m24766d(C3434h hVar) {
        if (hVar != null) {
            boolean z = false;
            if (hVar.f20966g.mo14497b() == 1) {
                int decrementAndGet = f20980e.decrementAndGet(this);
                if (C1384o0.m5425a()) {
                    if (decrementAndGet >= 0) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private final C3434h m24767i() {
        C3434h andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f20979d.compareAndSet(this, i, i + 1) && (andSet = this.f20981a.getAndSet(i2, (Object) null)) != null) {
                m24766d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    private final boolean m24768j(C3430d dVar) {
        C3434h i = m24767i();
        if (i == null) {
            return false;
        }
        dVar.mo14454a(i);
        return true;
    }

    /* renamed from: m */
    private final long m24769m(C3440n nVar, boolean z) {
        C3434h hVar;
        do {
            hVar = (C3434h) nVar.lastScheduledTask;
            if (hVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (hVar.f20966g.mo14497b() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a = C3438l.f20973e.mo14494a() - hVar.f20965f;
            long j = C3438l.f20969a;
            if (a < j) {
                return j - a;
            }
        } while (!C1282b.m5160a(f20977b, nVar, hVar, (Object) null));
        m24764b(this, hVar, false, 2, (Object) null);
        return -1;
    }

    /* renamed from: a */
    public final C3434h mo14500a(C3434h hVar, boolean z) {
        if (z) {
            return m24765c(hVar);
        }
        C3434h hVar2 = (C3434h) f20977b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return m24765c(hVar2);
    }

    /* renamed from: e */
    public final int mo14501e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int mo14502f() {
        return this.lastScheduledTask != null ? mo14501e() + 1 : mo14501e();
    }

    /* renamed from: g */
    public final void mo14503g(C3430d dVar) {
        C3434h hVar = (C3434h) f20977b.getAndSet(this, (Object) null);
        if (hVar != null) {
            dVar.mo14454a(hVar);
        }
        do {
        } while (m24768j(dVar));
    }

    /* renamed from: h */
    public final C3434h mo14504h() {
        C3434h hVar = (C3434h) f20977b.getAndSet(this, (Object) null);
        return hVar == null ? m24767i() : hVar;
    }

    /* renamed from: k */
    public final long mo14505k(C3440n nVar) {
        if (C1384o0.m5425a()) {
            if (!(mo14501e() == 0)) {
                throw new AssertionError();
            }
        }
        int i = nVar.producerIndex;
        AtomicReferenceArray<C3434h> atomicReferenceArray = nVar.f20981a;
        for (int i2 = nVar.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (nVar.blockingTasksInBuffer == 0) {
                break;
            }
            C3434h hVar = atomicReferenceArray.get(i3);
            if (hVar != null) {
                if ((hVar.f20966g.mo14497b() == 1) && atomicReferenceArray.compareAndSet(i3, hVar, (Object) null)) {
                    f20980e.decrementAndGet(nVar);
                    m24764b(this, hVar, false, 2, (Object) null);
                    return -1;
                }
            }
        }
        return m24769m(nVar, true);
    }

    /* renamed from: l */
    public final long mo14506l(C3440n nVar) {
        boolean z = true;
        if (C1384o0.m5425a()) {
            if (!(mo14501e() == 0)) {
                throw new AssertionError();
            }
        }
        C3434h i = nVar.m24767i();
        if (i == null) {
            return m24769m(nVar, false);
        }
        C3434h b = m24764b(this, i, false, 2, (Object) null);
        if (!C1384o0.m5425a()) {
            return -1;
        }
        if (b != null) {
            z = false;
        }
        if (z) {
            return -1;
        }
        throw new AssertionError();
    }
}
