package p046g0;

import android.os.Bundle;
import androidx.lifecycle.C1099i;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.C3353e;
import kotlin.jvm.internal.C3357i;

/* renamed from: g0.d */
public final class C2627d {

    /* renamed from: d */
    public static final C2628a f19002d = new C2628a((C3353e) null);

    /* renamed from: a */
    private final C2629e f19003a;

    /* renamed from: b */
    private final C2623c f19004b;

    /* renamed from: c */
    private boolean f19005c;

    /* renamed from: g0.d$a */
    public static final class C2628a {
        private C2628a() {
        }

        public /* synthetic */ C2628a(C3353e eVar) {
            this();
        }

        /* renamed from: a */
        public final C2627d mo12519a(C2629e eVar) {
            C3357i.m24508e(eVar, "owner");
            return new C2627d(eVar, (C3353e) null);
        }
    }

    private C2627d(C2629e eVar) {
        this.f19003a = eVar;
        this.f19004b = new C2623c();
    }

    public /* synthetic */ C2627d(C2629e eVar, C3353e eVar2) {
        this(eVar);
    }

    /* renamed from: a */
    public static final C2627d m21343a(C2629e eVar) {
        return f19002d.mo12519a(eVar);
    }

    /* renamed from: b */
    public final C2623c mo12515b() {
        return this.f19004b;
    }

    /* renamed from: c */
    public final void mo12516c() {
        C1099i a = this.f19003a.mo491a();
        C3357i.m24507d(a, "owner.lifecycle");
        if (a.mo3831b() == C1099i.C1102c.INITIALIZED) {
            a.mo3830a(new Recreator(this.f19003a));
            this.f19004b.mo12510e(a);
            this.f19005c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    /* renamed from: d */
    public final void mo12517d(Bundle bundle) {
        if (!this.f19005c) {
            mo12516c();
        }
        C1099i a = this.f19003a.mo491a();
        C3357i.m24507d(a, "owner.lifecycle");
        if (!a.mo3831b().mo3834b(C1099i.C1102c.STARTED)) {
            this.f19004b.mo12511f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + a.mo3831b()).toString());
    }

    /* renamed from: e */
    public final void mo12518e(Bundle bundle) {
        C3357i.m24508e(bundle, "outBundle");
        this.f19004b.mo12512g(bundle);
    }
}
