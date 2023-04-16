package p001a0;

import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;
import p001a0.C0005a;

/* renamed from: a0.d */
public final class C0010d extends C0005a {
    public C0010d() {
        this((C0005a) null, 1, (C3353e) null);
    }

    public C0010d(C0005a aVar) {
        C3357i.m24508e(aVar, "initialExtras");
        mo11a().putAll(aVar.mo11a());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0010d(C0005a aVar, int i, C3353e eVar) {
        this((i & 1) != 0 ? C0005a.C0006a.f2b : aVar);
    }

    /* renamed from: b */
    public final <T> void mo16b(C0005a.C0007b<T> bVar, T t) {
        C3357i.m24508e(bVar, "key");
        mo11a().put(bVar, t);
    }
}
