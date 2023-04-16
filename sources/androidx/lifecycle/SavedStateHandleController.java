package androidx.lifecycle;

import androidx.lifecycle.C1099i;
import p046g0.C2623c;

final class SavedStateHandleController implements C1107k {

    /* renamed from: a */
    private final String f2942a;

    /* renamed from: b */
    private boolean f2943b;

    /* renamed from: c */
    private final C1129y f2944c;

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3795d(C2623c cVar, C1099i iVar) {
        if (!this.f2943b) {
            this.f2943b = true;
            iVar.mo3830a(this);
            cVar.mo12513h(this.f2942a, this.f2944c.mo3879c());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* renamed from: e */
    public void mo527e(C1110m mVar, C1099i.C1101b bVar) {
        if (bVar == C1099i.C1101b.ON_DESTROY) {
            this.f2943b = false;
            mVar.mo491a().mo3832c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo3796h() {
        return this.f2943b;
    }
}
