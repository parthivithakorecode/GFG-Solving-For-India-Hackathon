package p131s2;

/* renamed from: s2.l */
final class C4032l implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C4028h f22208f;

    /* renamed from: g */
    final /* synthetic */ C4033m f22209g;

    C4032l(C4033m mVar, C4028h hVar) {
        this.f22209g = mVar;
        this.f22208f = hVar;
    }

    public final void run() {
        if (this.f22208f.mo15513k()) {
            this.f22209g.f22212c.mo15520r();
            return;
        }
        try {
            this.f22209g.f22212c.mo15516n(this.f22209g.f22211b.mo10211a(this.f22208f));
        } catch (C4027g e) {
            if (e.getCause() instanceof Exception) {
                this.f22209g.f22212c.mo15518p((Exception) e.getCause());
            } else {
                this.f22209g.f22212c.mo15518p(e);
            }
        } catch (Exception e2) {
            this.f22209g.f22212c.mo15518p(e2);
        }
    }
}
