package p100n4;

import kotlin.jvm.internal.C3357i;
import p100n4.C3778g;
import p145u4.C4154p;

/* renamed from: n4.a */
public abstract class C3769a implements C3778g.C3781b {
    private final C3778g.C3783c<?> key;

    public C3769a(C3778g.C3783c<?> cVar) {
        C3357i.m24508e(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r, C4154p<? super R, ? super C3778g.C3781b, ? extends R> pVar) {
        return C3778g.C3781b.C3782a.m25608a(this, r, pVar);
    }

    public <E extends C3778g.C3781b> E get(C3778g.C3783c<E> cVar) {
        return C3778g.C3781b.C3782a.m25609b(this, cVar);
    }

    public C3778g.C3783c<?> getKey() {
        return this.key;
    }

    public C3778g minusKey(C3778g.C3783c<?> cVar) {
        return C3778g.C3781b.C3782a.m25610c(this, cVar);
    }

    public C3778g plus(C3778g gVar) {
        return C3778g.C3781b.C3782a.m25611d(this, gVar);
    }
}
