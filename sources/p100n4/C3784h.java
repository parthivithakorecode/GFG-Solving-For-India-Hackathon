package p100n4;

import java.io.Serializable;
import kotlin.jvm.internal.C3357i;
import p100n4.C3778g;
import p145u4.C4154p;

/* renamed from: n4.h */
public final class C3784h implements C3778g, Serializable {

    /* renamed from: f */
    public static final C3784h f21692f = new C3784h();

    private C3784h() {
    }

    public <R> R fold(R r, C4154p<? super R, ? super C3778g.C3781b, ? extends R> pVar) {
        C3357i.m24508e(pVar, "operation");
        return r;
    }

    public <E extends C3778g.C3781b> E get(C3778g.C3783c<E> cVar) {
        C3357i.m24508e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C3778g minusKey(C3778g.C3783c<?> cVar) {
        C3357i.m24508e(cVar, "key");
        return this;
    }

    public C3778g plus(C3778g gVar) {
        C3357i.m24508e(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
