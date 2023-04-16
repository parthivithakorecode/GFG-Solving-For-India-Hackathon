package p003a2;

import android.os.Bundle;
import p160x1.C4280b;

/* renamed from: a2.u0 */
public final class C0106u0 extends C0081j0 {

    /* renamed from: g */
    final /* synthetic */ C0052c f224g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0106u0(C0052c cVar, int i, Bundle bundle) {
        super(cVar, i, (Bundle) null);
        this.f224g = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo250f() {
        this.f224g.f110u.mo197b(C4280b.f22574j);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo251g(C4280b bVar) {
        if (!this.f224g.mo189t() || !C0052c.m173Y(this.f224g)) {
            this.f224g.f110u.mo197b(bVar);
            this.f224g.mo163K(bVar);
            return;
        }
        C0052c.m169U(this.f224g, 16);
    }
}
