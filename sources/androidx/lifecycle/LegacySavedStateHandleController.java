package androidx.lifecycle;

import androidx.lifecycle.C1099i;
import p046g0.C2623c;
import p046g0.C2629e;

class LegacySavedStateHandleController {

    /* renamed from: androidx.lifecycle.LegacySavedStateHandleController$a */
    static final class C1066a implements C2623c.C2624a {
        C1066a() {
        }

        /* renamed from: a */
        public void mo3781a(C2629e eVar) {
            if (eVar instanceof C1103i0) {
                C1098h0 k = ((C1103i0) eVar).mo497k();
                C2623c i = eVar.mo496i();
                for (String b : k.mo3828c()) {
                    LegacySavedStateHandleController.m4485a(k.mo3827b(b), i, eVar.mo491a());
                }
                if (!k.mo3828c().isEmpty()) {
                    i.mo12514i(C1066a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    /* renamed from: a */
    static void m4485a(C1081d0 d0Var, C2623c cVar, C1099i iVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) d0Var.mo3821c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.mo3796h()) {
            savedStateHandleController.mo3795d(cVar, iVar);
            m4486b(cVar, iVar);
        }
    }

    /* renamed from: b */
    private static void m4486b(final C2623c cVar, final C1099i iVar) {
        C1099i.C1102c b = iVar.mo3831b();
        if (b == C1099i.C1102c.INITIALIZED || b.mo3834b(C1099i.C1102c.STARTED)) {
            cVar.mo12514i(C1066a.class);
        } else {
            iVar.mo3830a(new C1107k() {
                /* renamed from: e */
                public void mo527e(C1110m mVar, C1099i.C1101b bVar) {
                    if (bVar == C1099i.C1101b.ON_START) {
                        C1099i.this.mo3832c(this);
                        cVar.mo12514i(C1066a.class);
                    }
                }
            });
        }
    }
}
