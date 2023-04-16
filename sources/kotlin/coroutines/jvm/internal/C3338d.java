package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.C3357i;
import p100n4.C3773d;
import p100n4.C3774e;
import p100n4.C3778g;

/* renamed from: kotlin.coroutines.jvm.internal.d */
public abstract class C3338d extends C3335a {
    private final C3778g _context;
    private transient C3773d<Object> intercepted;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3338d(C3773d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }

    public C3338d(C3773d<Object> dVar, C3778g gVar) {
        super(dVar);
        this._context = gVar;
    }

    public C3778g getContext() {
        C3778g gVar = this._context;
        C3357i.m24505b(gVar);
        return gVar;
    }

    public final C3773d<Object> intercepted() {
        C3773d<Object> dVar = this.intercepted;
        if (dVar == null) {
            C3774e eVar = (C3774e) getContext().get(C3774e.f21689e);
            if (eVar == null || (dVar = eVar.mo4693F(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        C3773d<Object> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            C3778g.C3781b bVar = getContext().get(C3774e.f21689e);
            C3357i.m24505b(bVar);
            ((C3774e) bVar).mo4698z(dVar);
        }
        this.intercepted = C3337c.f20830f;
    }
}
