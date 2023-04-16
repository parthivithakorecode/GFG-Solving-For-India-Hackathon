package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.j */
public abstract class C3358j<R> implements C3354f<R>, Serializable {
    private final int arity;

    public C3358j(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String f = C3364p.m24526f(this);
        C3357i.m24507d(f, "renderLambdaToString(this)");
        return f;
    }
}
