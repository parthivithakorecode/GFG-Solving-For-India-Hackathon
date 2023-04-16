package kotlin.jvm.internal;

import p169y4.C4475b;
import p169y4.C4478e;

/* renamed from: kotlin.jvm.internal.g */
public class C3355g extends C3347a implements C3354f, C4478e {
    private final int arity;
    private final int flags;

    public C3355g(int i) {
        this(i, C3347a.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    public C3355g(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3355g(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    /* access modifiers changed from: protected */
    public C4475b computeReflected() {
        return C3364p.m24521a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3355g) {
            C3355g gVar = (C3355g) obj;
            return getName().equals(gVar.getName()) && getSignature().equals(gVar.getSignature()) && this.flags == gVar.flags && this.arity == gVar.arity && C3357i.m24504a(getBoundReceiver(), gVar.getBoundReceiver()) && C3357i.m24504a(getOwner(), gVar.getOwner());
        } else if (obj instanceof C4478e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    /* access modifiers changed from: protected */
    public C4478e getReflected() {
        return (C4478e) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        C4475b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
