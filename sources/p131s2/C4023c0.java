package p131s2;

import java.util.concurrent.Callable;

/* renamed from: s2.c0 */
final class C4023c0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C4021b0 f22203f;

    /* renamed from: g */
    final /* synthetic */ Callable f22204g;

    C4023c0(C4021b0 b0Var, Callable callable) {
        this.f22203f = b0Var;
        this.f22204g = callable;
    }

    public final void run() {
        try {
            this.f22203f.mo15516n(this.f22204g.call());
        } catch (Exception e) {
            this.f22203f.mo15518p(e);
        } catch (Throwable th) {
            this.f22203f.mo15518p(new RuntimeException(th));
        }
    }
}
