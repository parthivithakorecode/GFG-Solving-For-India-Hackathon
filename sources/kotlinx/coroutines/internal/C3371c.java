package kotlinx.coroutines.internal;

import androidx.work.impl.utils.futures.C1282b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p016b5.C1384o0;

/* renamed from: kotlinx.coroutines.internal.c */
public abstract class C3371c<T> extends C3422z {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f20857a = AtomicReferenceFieldUpdater.newUpdater(C3371c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C3369b.f20855a;

    /* renamed from: a */
    public C3371c<?> mo14403a() {
        return this;
    }

    /* renamed from: c */
    public final Object mo14404c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C3369b.f20855a) {
            obj2 = mo14406e(mo4822g(obj));
        }
        mo14405d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo14405d(T t, Object obj);

    /* renamed from: e */
    public final Object mo14406e(Object obj) {
        if (C1384o0.m5425a()) {
            if (!(obj != C3369b.f20855a)) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        Object obj3 = C3369b.f20855a;
        return obj2 != obj3 ? obj2 : C1282b.m5160a(f20857a, this, obj3, obj) ? obj : this._consensus;
    }

    /* renamed from: f */
    public long mo14407f() {
        return 0;
    }

    /* renamed from: g */
    public abstract Object mo4822g(T t);
}
