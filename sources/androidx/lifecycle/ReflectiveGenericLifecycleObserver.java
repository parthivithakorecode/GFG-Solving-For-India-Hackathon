package androidx.lifecycle;

import androidx.lifecycle.C1070a;
import androidx.lifecycle.C1099i;

@Deprecated
class ReflectiveGenericLifecycleObserver implements C1107k {

    /* renamed from: a */
    private final Object f2939a;

    /* renamed from: b */
    private final C1070a.C1071a f2940b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2939a = obj;
        this.f2940b = C1070a.f2946c.mo3797c(obj.getClass());
    }

    /* renamed from: e */
    public void mo527e(C1110m mVar, C1099i.C1101b bVar) {
        this.f2940b.mo3799a(mVar, bVar, this.f2939a);
    }
}
