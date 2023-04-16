package p016b5;

import kotlin.jvm.internal.C3357i;
import p079k4.C3330q;
import p145u4.C4150l;

/* renamed from: b5.w */
public final class C1409w {

    /* renamed from: a */
    public final Object f3610a;

    /* renamed from: b */
    public final C4150l<Throwable, C3330q> f3611b;

    public C1409w(Object obj, C4150l<? super Throwable, C3330q> lVar) {
        this.f3610a = obj;
        this.f3611b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1409w)) {
            return false;
        }
        C1409w wVar = (C1409w) obj;
        return C3357i.m24504a(this.f3610a, wVar.f3610a) && C3357i.m24504a(this.f3611b, wVar.f3611b);
    }

    public int hashCode() {
        Object obj = this.f3610a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f3611b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f3610a + ", onCancellation=" + this.f3611b + ')';
    }
}
