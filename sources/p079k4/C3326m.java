package p079k4;

import java.io.Serializable;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import p145u4.C4139a;

/* renamed from: k4.m */
final class C3326m<T> implements C3316e<T>, Serializable {

    /* renamed from: f */
    private C4139a<? extends T> f20825f;

    /* renamed from: g */
    private volatile Object f20826g;

    /* renamed from: h */
    private final Object f20827h;

    public C3326m(C4139a<? extends T> aVar, Object obj) {
        C3357i.m24508e(aVar, "initializer");
        this.f20825f = aVar;
        this.f20826g = C3328o.f20828a;
        this.f20827h = obj == null ? this : obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3326m(C4139a aVar, Object obj, int i, C3353e eVar) {
        this(aVar, (i & 2) != 0 ? null : obj);
    }

    /* renamed from: a */
    public boolean mo14331a() {
        return this.f20826g != C3328o.f20828a;
    }

    public T getValue() {
        T t;
        T t2 = this.f20826g;
        T t3 = C3328o.f20828a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.f20827h) {
            t = this.f20826g;
            if (t == t3) {
                C4139a aVar = this.f20825f;
                C3357i.m24505b(aVar);
                t = aVar.invoke();
                this.f20826g = t;
                this.f20825f = null;
            }
        }
        return t;
    }

    public String toString() {
        return mo14331a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
