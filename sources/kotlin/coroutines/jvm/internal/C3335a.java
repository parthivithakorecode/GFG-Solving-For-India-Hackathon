package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.internal.C3357i;
import p079k4.C3322k;
import p079k4.C3325l;
import p079k4.C3330q;
import p100n4.C3773d;

/* renamed from: kotlin.coroutines.jvm.internal.a */
public abstract class C3335a implements C3773d<Object>, C3339e, Serializable {
    private final C3773d<Object> completion;

    public C3335a(C3773d<Object> dVar) {
        this.completion = dVar;
    }

    public C3773d<C3330q> create(Object obj, C3773d<?> dVar) {
        C3357i.m24508e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public C3773d<C3330q> create(C3773d<?> dVar) {
        C3357i.m24508e(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public C3339e getCallerFrame() {
        C3773d<Object> dVar = this.completion;
        if (dVar instanceof C3339e) {
            return (C3339e) dVar;
        }
        return null;
    }

    public final C3773d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return C3341g.m24490d(this);
    }

    /* access modifiers changed from: protected */
    public abstract Object invokeSuspend(Object obj);

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
    }

    public final void resumeWith(Object obj) {
        C3773d dVar = this;
        while (true) {
            C3342h.m24492b(dVar);
            C3335a aVar = (C3335a) dVar;
            C3773d dVar2 = aVar.completion;
            C3357i.m24505b(dVar2);
            try {
                Object invokeSuspend = aVar.invokeSuspend(obj);
                if (invokeSuspend != C3858d.m25871c()) {
                    C3322k.C3323a aVar2 = C3322k.f20823f;
                    obj = C3322k.m24446a(invokeSuspend);
                    aVar.releaseIntercepted();
                    if (dVar2 instanceof C3335a) {
                        dVar = dVar2;
                    } else {
                        dVar2.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                C3322k.C3323a aVar3 = C3322k.f20823f;
                obj = C3322k.m24446a(C3325l.m24450a(th));
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
