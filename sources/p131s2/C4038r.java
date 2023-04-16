package p131s2;

/* renamed from: s2.r */
final class C4038r implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C4028h f22222f;

    /* renamed from: g */
    final /* synthetic */ C4039s f22223g;

    C4038r(C4039s sVar, C4028h hVar) {
        this.f22223g = sVar;
        this.f22222f = hVar;
    }

    public final void run() {
        synchronized (this.f22223g.f22225b) {
            if (this.f22223g.f22226c != null) {
                this.f22223g.f22226c.mo10935a(this.f22222f);
            }
        }
    }
}
