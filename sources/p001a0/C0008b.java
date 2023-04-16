package p001a0;

import androidx.lifecycle.C1081d0;
import androidx.lifecycle.C1083e0;
import androidx.lifecycle.C1094f0;
import kotlin.jvm.internal.C3357i;

/* renamed from: a0.b */
public final class C0008b implements C1083e0.C1087b {

    /* renamed from: b */
    private final C0012f<?>[] f3b;

    public C0008b(C0012f<?>... fVarArr) {
        C3357i.m24508e(fVarArr, "initializers");
        this.f3b = fVarArr;
    }

    /* renamed from: a */
    public /* synthetic */ C1081d0 mo12a(Class cls) {
        return C1094f0.m4556a(this, cls);
    }

    /* renamed from: b */
    public <T extends C1081d0> T mo13b(Class<T> cls, C0005a aVar) {
        C3357i.m24508e(cls, "modelClass");
        C3357i.m24508e(aVar, "extras");
        T t = null;
        for (C0012f<?> fVar : this.f3b) {
            if (C3357i.m24504a(fVar.mo17a(), cls)) {
                T invoke = fVar.mo18b().invoke(aVar);
                t = invoke instanceof C1081d0 ? (C1081d0) invoke : null;
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
