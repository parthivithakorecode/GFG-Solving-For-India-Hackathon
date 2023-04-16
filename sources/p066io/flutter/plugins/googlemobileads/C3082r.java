package p066io.flutter.plugins.googlemobileads;

import java.lang.ref.WeakReference;

/* renamed from: io.flutter.plugins.googlemobileads.r */
class C3082r extends C3049f {

    /* renamed from: c */
    final WeakReference<C3051g> f20185c;

    C3082r(int i, C3028a aVar, C3051g gVar) {
        super(i, aVar);
        this.f20185c = new WeakReference<>(gVar);
    }

    /* renamed from: m */
    public void mo29m() {
        if (this.f20185c.get() != null) {
            ((C3051g) this.f20185c.get()).mo13783a();
        }
    }
}
