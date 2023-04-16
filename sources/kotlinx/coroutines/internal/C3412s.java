package kotlinx.coroutines.internal;

import androidx.work.impl.utils.futures.C1282b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.internal.s */
public class C3412s<E> {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f20910a = AtomicReferenceFieldUpdater.newUpdater(C3412s.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public C3412s(boolean z) {
        this._cur = new C3413t(8, z);
    }

    /* renamed from: a */
    public final boolean mo14454a(E e) {
        while (true) {
            C3413t tVar = (C3413t) this._cur;
            int a = tVar.mo14458a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                C1282b.m5160a(f20910a, this, tVar, tVar.mo14462i());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void mo14455b() {
        while (true) {
            C3413t tVar = (C3413t) this._cur;
            if (!tVar.mo14459d()) {
                C1282b.m5160a(f20910a, this, tVar, tVar.mo14462i());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final int mo14456c() {
        return ((C3413t) this._cur).mo14460f();
    }

    /* renamed from: d */
    public final E mo14457d() {
        while (true) {
            C3413t tVar = (C3413t) this._cur;
            E j = tVar.mo14463j();
            if (j != C3413t.f20914h) {
                return j;
            }
            C1282b.m5160a(f20910a, this, tVar, tVar.mo14462i());
        }
    }
}
