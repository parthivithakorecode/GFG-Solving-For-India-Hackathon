package androidx.lifecycle;

import androidx.lifecycle.C1099i;

class CompositeGeneratedAdaptersObserver implements C1107k {

    /* renamed from: a */
    private final C1093f[] f2913a;

    CompositeGeneratedAdaptersObserver(C1093f[] fVarArr) {
        this.f2913a = fVarArr;
    }

    /* renamed from: e */
    public void mo527e(C1110m mVar, C1099i.C1101b bVar) {
        C1116r rVar = new C1116r();
        for (C1093f a : this.f2913a) {
            a.mo3825a(mVar, bVar, false, rVar);
        }
        for (C1093f a2 : this.f2913a) {
            a2.mo3825a(mVar, bVar, true, rVar);
        }
    }
}
