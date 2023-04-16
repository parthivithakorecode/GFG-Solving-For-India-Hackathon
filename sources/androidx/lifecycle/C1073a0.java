package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.C3357i;
import kotlin.jvm.internal.C3358j;
import p046g0.C2623c;
import p079k4.C3316e;
import p145u4.C4139a;

/* renamed from: androidx.lifecycle.a0 */
public final class C1073a0 implements C2623c.C2626c {

    /* renamed from: a */
    private final C2623c f2953a;

    /* renamed from: b */
    private boolean f2954b;

    /* renamed from: c */
    private Bundle f2955c;

    /* renamed from: d */
    private final C3316e f2956d;

    /* renamed from: androidx.lifecycle.a0$a */
    static final class C1074a extends C3358j implements C4139a<C1076b0> {

        /* renamed from: f */
        final /* synthetic */ C1103i0 f2957f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1074a(C1103i0 i0Var) {
            super(0);
            this.f2957f = i0Var;
        }

        /* renamed from: a */
        public final C1076b0 invoke() {
            return C1131z.m4637b(this.f2957f);
        }
    }

    public C1073a0(C2623c cVar, C1103i0 i0Var) {
        C3357i.m24508e(cVar, "savedStateRegistry");
        C3357i.m24508e(i0Var, "viewModelStoreOwner");
        this.f2953a = cVar;
        this.f2956d = C3318g.m24441a(new C1074a(i0Var));
    }

    /* renamed from: b */
    private final C1076b0 m4524b() {
        return (C1076b0) this.f2956d.getValue();
    }

    /* renamed from: a */
    public Bundle mo534a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2955c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry next : m4524b().mo3806e().entrySet()) {
            String str = (String) next.getKey();
            Bundle a = ((C1129y) next.getValue()).mo3879c().mo534a();
            if (!C3357i.m24504a(a, Bundle.EMPTY)) {
                bundle.putBundle(str, a);
            }
        }
        this.f2954b = false;
        return bundle;
    }

    /* renamed from: c */
    public final void mo3803c() {
        if (!this.f2954b) {
            this.f2955c = this.f2953a.mo12508b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f2954b = true;
            m4524b();
        }
    }
}
