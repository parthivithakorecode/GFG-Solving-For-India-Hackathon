package kotlin.coroutines.jvm.internal;

import p100n4.C3773d;
import p100n4.C3778g;
import p100n4.C3784h;

/* renamed from: kotlin.coroutines.jvm.internal.j */
public abstract class C3345j extends C3335a {
    public C3345j(C3773d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == C3784h.f21692f)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public C3778g getContext() {
        return C3784h.f21692f;
    }
}
