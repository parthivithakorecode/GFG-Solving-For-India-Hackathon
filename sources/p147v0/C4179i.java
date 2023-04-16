package p147v0;

import androidx.work.impl.WorkDatabase;
import p089m0.C3646j;
import p089m0.C3662s;
import p096n0.C3750d;
import p096n0.C3756i;
import p141u0.C4111q;

/* renamed from: v0.i */
public class C4179i implements Runnable {

    /* renamed from: i */
    private static final String f22400i = C3646j.m25231f("StopWorkRunnable");

    /* renamed from: f */
    private final C3756i f22401f;

    /* renamed from: g */
    private final String f22402g;

    /* renamed from: h */
    private final boolean f22403h;

    public C4179i(C3756i iVar, String str, boolean z) {
        this.f22401f = iVar;
        this.f22402g = str;
        this.f22403h = z;
    }

    public void run() {
        boolean z;
        WorkDatabase o = this.f22401f.mo14986o();
        C3750d m = this.f22401f.mo14984m();
        C4111q B = o.mo4514B();
        o.mo3951c();
        try {
            boolean h = m.mo14961h(this.f22402g);
            if (this.f22403h) {
                z = this.f22401f.mo14984m().mo14966n(this.f22402g);
            } else {
                if (!h && B.mo15630i(this.f22402g) == C3662s.RUNNING) {
                    B.mo15638q(C3662s.ENQUEUED, this.f22402g);
                }
                z = this.f22401f.mo14984m().mo14967o(this.f22402g);
            }
            C3646j.m25229c().mo14806a(f22400i, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f22402g, Boolean.valueOf(z)}), new Throwable[0]);
            o.mo3965r();
        } finally {
            o.mo3955g();
        }
    }
}
