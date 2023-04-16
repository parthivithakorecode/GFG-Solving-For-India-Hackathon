package p066io.flutter.plugins.googlemobileads;

import java.lang.ref.WeakReference;
import p104o1.C3821c;

/* renamed from: io.flutter.plugins.googlemobileads.y */
class C3091y implements C3821c.C3824c {

    /* renamed from: a */
    private final WeakReference<C3088w> f20213a;

    C3091y(C3088w wVar) {
        this.f20213a = new WeakReference<>(wVar);
    }

    /* renamed from: a */
    public void mo13912a(C3821c cVar) {
        if (this.f20213a.get() != null) {
            ((C3088w) this.f20213a.get()).mo13901e(cVar);
        }
    }
}
