package androidx.lifecycle;

import androidx.lifecycle.C1083e0;
import kotlin.jvm.internal.C3357i;
import p001a0.C0005a;

/* renamed from: androidx.lifecycle.f0 */
public final /* synthetic */ class C1094f0 {
    static {
        C1083e0.C1087b.C1088a aVar = C1083e0.C1087b.f2974a;
    }

    /* renamed from: a */
    public static C1081d0 m4556a(C1083e0.C1087b bVar, Class cls) {
        C3357i.m24508e(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    /* renamed from: b */
    public static C1081d0 m4557b(C1083e0.C1087b bVar, Class cls, C0005a aVar) {
        C3357i.m24508e(cls, "modelClass");
        C3357i.m24508e(aVar, "extras");
        return bVar.mo12a(cls);
    }
}
