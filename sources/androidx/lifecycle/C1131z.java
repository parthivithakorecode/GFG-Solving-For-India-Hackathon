package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.C1099i;
import kotlin.jvm.internal.C3357i;
import kotlin.jvm.internal.C3358j;
import kotlin.jvm.internal.C3364p;
import p001a0.C0005a;
import p001a0.C0009c;
import p046g0.C2629e;
import p145u4.C4150l;

/* renamed from: androidx.lifecycle.z */
public final class C1131z {

    /* renamed from: a */
    public static final C0005a.C0007b<C2629e> f3024a = new C1133b();

    /* renamed from: b */
    public static final C0005a.C0007b<C1103i0> f3025b = new C1134c();

    /* renamed from: c */
    public static final C0005a.C0007b<Bundle> f3026c = new C1132a();

    /* renamed from: androidx.lifecycle.z$a */
    public static final class C1132a implements C0005a.C0007b<Bundle> {
        C1132a() {
        }
    }

    /* renamed from: androidx.lifecycle.z$b */
    public static final class C1133b implements C0005a.C0007b<C2629e> {
        C1133b() {
        }
    }

    /* renamed from: androidx.lifecycle.z$c */
    public static final class C1134c implements C0005a.C0007b<C1103i0> {
        C1134c() {
        }
    }

    /* renamed from: androidx.lifecycle.z$d */
    static final class C1135d extends C3358j implements C4150l<C0005a, C1076b0> {

        /* renamed from: f */
        public static final C1135d f3027f = new C1135d();

        C1135d() {
            super(1);
        }

        /* renamed from: a */
        public final C1076b0 invoke(C0005a aVar) {
            C3357i.m24508e(aVar, "$this$initializer");
            return new C1076b0();
        }
    }

    /* renamed from: a */
    public static final <T extends C2629e & C1103i0> void m4636a(T t) {
        C3357i.m24508e(t, "<this>");
        C1099i.C1102c b = t.mo491a().mo3831b();
        C3357i.m24507d(b, "lifecycle.currentState");
        if (!(b == C1099i.C1102c.INITIALIZED || b == C1099i.C1102c.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (t.mo496i().mo12509c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C1073a0 a0Var = new C1073a0(t.mo496i(), (C1103i0) t);
            t.mo496i().mo12513h("androidx.lifecycle.internal.SavedStateHandlesProvider", a0Var);
            t.mo491a().mo3830a(new SavedStateHandleAttacher(a0Var));
        }
    }

    /* renamed from: b */
    public static final C1076b0 m4637b(C1103i0 i0Var) {
        Class cls = C1076b0.class;
        C3357i.m24508e(i0Var, "<this>");
        C0009c cVar = new C0009c();
        cVar.mo14a(C3364p.m24522b(cls), C1135d.f3027f);
        return (C1076b0) new C1083e0(i0Var, cVar.mo15b()).mo3823b("androidx.lifecycle.internal.SavedStateHandlesVM", cls);
    }
}
