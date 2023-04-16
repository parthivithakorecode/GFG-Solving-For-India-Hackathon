package p001a0;

import androidx.lifecycle.C1081d0;
import kotlin.jvm.internal.C3357i;
import p145u4.C4150l;

/* renamed from: a0.f */
public final class C0012f<T extends C1081d0> {

    /* renamed from: a */
    private final Class<T> f5a;

    /* renamed from: b */
    private final C4150l<C0005a, T> f6b;

    public C0012f(Class<T> cls, C4150l<? super C0005a, ? extends T> lVar) {
        C3357i.m24508e(cls, "clazz");
        C3357i.m24508e(lVar, "initializer");
        this.f5a = cls;
        this.f6b = lVar;
    }

    /* renamed from: a */
    public final Class<T> mo17a() {
        return this.f5a;
    }

    /* renamed from: b */
    public final C4150l<C0005a, T> mo18b() {
        return this.f6b;
    }
}
