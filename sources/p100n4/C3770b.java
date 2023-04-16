package p100n4;

import kotlin.jvm.internal.C3357i;
import p100n4.C3778g;
import p100n4.C3778g.C3781b;
import p145u4.C4150l;

/* renamed from: n4.b */
public abstract class C3770b<B extends C3778g.C3781b, E extends B> implements C3778g.C3783c<E> {

    /* renamed from: f */
    private final C4150l<C3778g.C3781b, E> f21684f;

    /* renamed from: g */
    private final C3778g.C3783c<?> f21685g;

    public C3770b(C3778g.C3783c<B> cVar, C4150l<? super C3778g.C3781b, ? extends E> lVar) {
        C3357i.m24508e(cVar, "baseKey");
        C3357i.m24508e(lVar, "safeCast");
        this.f21684f = lVar;
        this.f21685g = cVar instanceof C3770b ? ((C3770b) cVar).f21685g : cVar;
    }

    /* renamed from: a */
    public final boolean mo15011a(C3778g.C3783c<?> cVar) {
        C3357i.m24508e(cVar, "key");
        return cVar == this || this.f21685g == cVar;
    }

    /* renamed from: b */
    public final E mo15012b(C3778g.C3781b bVar) {
        C3357i.m24508e(bVar, "element");
        return (C3778g.C3781b) this.f21684f.invoke(bVar);
    }
}
