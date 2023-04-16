package p001a0;

import androidx.lifecycle.C1081d0;
import androidx.lifecycle.C1083e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.C3357i;
import p139t4.C4080a;
import p145u4.C4150l;
import p169y4.C4476c;

/* renamed from: a0.c */
public final class C0009c {

    /* renamed from: a */
    private final List<C0012f<?>> f4a = new ArrayList();

    /* renamed from: a */
    public final <T extends C1081d0> void mo14a(C4476c<T> cVar, C4150l<? super C0005a, ? extends T> lVar) {
        C3357i.m24508e(cVar, "clazz");
        C3357i.m24508e(lVar, "initializer");
        this.f4a.add(new C0012f(C4080a.m26441a(cVar), lVar));
    }

    /* renamed from: b */
    public final C1083e0.C1087b mo15b() {
        Object[] array = this.f4a.toArray(new C0012f[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        C0012f[] fVarArr = (C0012f[]) array;
        return new C0008b((C0012f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
