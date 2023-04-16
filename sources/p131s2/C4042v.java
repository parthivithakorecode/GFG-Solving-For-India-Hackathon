package p131s2;

/* renamed from: s2.v */
final class C4042v implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C4028h f22232f;

    /* renamed from: g */
    final /* synthetic */ C4043w f22233g;

    C4042v(C4043w wVar, C4028h hVar) {
        this.f22233g = wVar;
        this.f22232f = hVar;
    }

    public final void run() {
        synchronized (this.f22233g.f22235b) {
            if (this.f22233g.f22236c != null) {
                this.f22233g.f22236c.mo15523c(this.f22232f.mo15512j());
            }
        }
    }
}
