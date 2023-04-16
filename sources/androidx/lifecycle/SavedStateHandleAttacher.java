package androidx.lifecycle;

import androidx.lifecycle.C1099i;
import kotlin.jvm.internal.C3357i;

public final class SavedStateHandleAttacher implements C1107k {

    /* renamed from: a */
    private final C1073a0 f2941a;

    public SavedStateHandleAttacher(C1073a0 a0Var) {
        C3357i.m24508e(a0Var, "provider");
        this.f2941a = a0Var;
    }

    /* renamed from: e */
    public void mo527e(C1110m mVar, C1099i.C1101b bVar) {
        C3357i.m24508e(mVar, "source");
        C3357i.m24508e(bVar, "event");
        if (bVar == C1099i.C1101b.ON_CREATE) {
            mVar.mo491a().mo3832c(this);
            this.f2941a.mo3803c();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + bVar).toString());
    }
}
