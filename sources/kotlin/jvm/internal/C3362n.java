package kotlin.jvm.internal;

import p169y4.C4475b;
import p169y4.C4480g;

/* renamed from: kotlin.jvm.internal.n */
public abstract class C3362n extends C3347a implements C4480g {
    public C3362n() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3362n(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) != 1 ? false : true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C4480g getReflected() {
        return (C4480g) super.getReflected();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3362n) {
            C3362n nVar = (C3362n) obj;
            return getOwner().equals(nVar.getOwner()) && getName().equals(nVar.getName()) && getSignature().equals(nVar.getSignature()) && C3357i.m24504a(getBoundReceiver(), nVar.getBoundReceiver());
        } else if (obj instanceof C4480g) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        C4475b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
