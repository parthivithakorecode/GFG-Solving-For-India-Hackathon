package p044f5;

import p100n4.C3778g;
import p145u4.C4154p;

/* renamed from: f5.a */
public final class C2612a implements C3778g {

    /* renamed from: f */
    public final Throwable f18981f;

    /* renamed from: g */
    private final /* synthetic */ C3778g f18982g;

    public C2612a(Throwable th, C3778g gVar) {
        this.f18981f = th;
        this.f18982g = gVar;
    }

    public <R> R fold(R r, C4154p<? super R, ? super C3778g.C3781b, ? extends R> pVar) {
        return this.f18982g.fold(r, pVar);
    }

    public <E extends C3778g.C3781b> E get(C3778g.C3783c<E> cVar) {
        return this.f18982g.get(cVar);
    }

    public C3778g minusKey(C3778g.C3783c<?> cVar) {
        return this.f18982g.minusKey(cVar);
    }

    public C3778g plus(C3778g gVar) {
        return this.f18982g.plus(gVar);
    }
}
