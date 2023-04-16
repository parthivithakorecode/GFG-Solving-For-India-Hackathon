package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.C1095g;
import androidx.lifecycle.C1097h;
import androidx.lifecycle.C1098h0;
import androidx.lifecycle.C1099i;
import androidx.lifecycle.C1103i0;
import androidx.lifecycle.C1111n;
import p001a0.C0005a;
import p046g0.C2623c;
import p046g0.C2627d;
import p046g0.C2629e;

/* renamed from: androidx.fragment.app.a0 */
class C0955a0 implements C1097h, C2629e, C1103i0 {

    /* renamed from: f */
    private final Fragment f2553f;

    /* renamed from: g */
    private final C1098h0 f2554g;

    /* renamed from: h */
    private C1111n f2555h = null;

    /* renamed from: i */
    private C2627d f2556i = null;

    C0955a0(Fragment fragment, C1098h0 h0Var) {
        this.f2553f = fragment;
        this.f2554g = h0Var;
    }

    /* renamed from: a */
    public C1099i mo491a() {
        mo3377c();
        return this.f2555h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3376b(C1099i.C1101b bVar) {
        this.f2555h.mo3835h(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3377c() {
        if (this.f2555h == null) {
            this.f2555h = new C1111n(this);
            this.f2556i = C2627d.m21343a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo3378d() {
        return this.f2555h != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3379e(Bundle bundle) {
        this.f2556i.mo12517d(bundle);
    }

    /* renamed from: f */
    public /* synthetic */ C0005a mo493f() {
        return C1095g.m4558a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3380g(Bundle bundle) {
        this.f2556i.mo12518e(bundle);
    }

    /* renamed from: i */
    public C2623c mo496i() {
        mo3377c();
        return this.f2556i.mo12515b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3381j(C1099i.C1102c cVar) {
        this.f2555h.mo3837o(cVar);
    }

    /* renamed from: k */
    public C1098h0 mo497k() {
        mo3377c();
        return this.f2554g;
    }
}
