package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.C3354f;
import kotlin.jvm.internal.C3357i;
import kotlin.jvm.internal.C3364p;
import p100n4.C3773d;

/* renamed from: kotlin.coroutines.jvm.internal.k */
public abstract class C3346k extends C3338d implements C3354f<Object> {
    private final int arity;

    public C3346k(int i) {
        this(i, (C3773d<Object>) null);
    }

    public C3346k(int i, C3773d<Object> dVar) {
        super(dVar);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String e = C3364p.m24525e(this);
        C3357i.m24507d(e, "renderLambdaToString(this)");
        return e;
    }
}
