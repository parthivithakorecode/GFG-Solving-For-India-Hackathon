package p131s2;

import java.util.concurrent.Executor;

/* renamed from: s2.n */
final class C4034n implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C4028h f22213f;

    /* renamed from: g */
    final /* synthetic */ C4035o f22214g;

    C4034n(C4035o oVar, C4028h hVar) {
        this.f22214g = oVar;
        this.f22213f = hVar;
    }

    public final void run() {
        try {
            C4028h hVar = (C4028h) this.f22214g.f22216b.mo10211a(this.f22213f);
            if (hVar == null) {
                this.f22214g.mo7781d(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C4030j.f22207b;
            hVar.mo15507e(executor, this.f22214g);
            hVar.mo15506d(executor, this.f22214g);
            hVar.mo15503a(executor, this.f22214g);
        } catch (C4027g e) {
            if (e.getCause() instanceof Exception) {
                this.f22214g.f22217c.mo15518p((Exception) e.getCause());
            } else {
                this.f22214g.f22217c.mo15518p(e);
            }
        } catch (Exception e2) {
            this.f22214g.f22217c.mo15518p(e2);
        }
    }
}
