package p030d5;

import kotlin.jvm.internal.C3357i;
import kotlinx.coroutines.internal.C3377e0;
import p079k4.C3330q;
import p145u4.C4150l;

/* renamed from: d5.n */
public class C2525n<E> extends C2502a<E> {
    public C2525n(C4150l<? super E, C3330q> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Object mo12426i(E e) {
        C2528q<?> k;
        do {
            Object i = super.mo12426i(e);
            C3377e0 e0Var = C2507b.f18612b;
            if (i == e0Var) {
                return e0Var;
            }
            if (i == C2507b.f18613c) {
                k = mo12428k(e);
                if (k == null) {
                    return e0Var;
                }
            } else if (i instanceof C2521j) {
                return i;
            } else {
                throw new IllegalStateException(C3357i.m24513j("Invalid offerInternal result ", i).toString());
            }
        } while (!(k instanceof C2521j));
        return k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo12407r() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo12408s() {
        return true;
    }
}
