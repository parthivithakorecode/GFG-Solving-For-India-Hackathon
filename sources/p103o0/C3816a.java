package p103o0;

import java.util.HashMap;
import java.util.Map;
import p089m0.C3646j;
import p089m0.C3660q;
import p141u0.C4108p;

/* renamed from: o0.a */
public class C3816a {

    /* renamed from: d */
    static final String f21790d = C3646j.m25231f("DelayedWorkTracker");

    /* renamed from: a */
    final C3818b f21791a;

    /* renamed from: b */
    private final C3660q f21792b;

    /* renamed from: c */
    private final Map<String, Runnable> f21793c = new HashMap();

    /* renamed from: o0.a$a */
    class C3817a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C4108p f21794f;

        C3817a(C4108p pVar) {
            this.f21794f = pVar;
        }

        public void run() {
            C3646j.m25229c().mo14806a(C3816a.f21790d, String.format("Scheduling work %s", new Object[]{this.f21794f.f22314a}), new Throwable[0]);
            C3816a.this.f21791a.mo4547c(this.f21794f);
        }
    }

    public C3816a(C3818b bVar, C3660q qVar) {
        this.f21791a = bVar;
        this.f21792b = qVar;
    }

    /* renamed from: a */
    public void mo15199a(C4108p pVar) {
        Runnable remove = this.f21793c.remove(pVar.f22314a);
        if (remove != null) {
            this.f21792b.mo14821b(remove);
        }
        C3817a aVar = new C3817a(pVar);
        this.f21793c.put(pVar.f22314a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.f21792b.mo14820a(pVar.mo15613a() - currentTimeMillis, aVar);
    }

    /* renamed from: b */
    public void mo15200b(String str) {
        Runnable remove = this.f21793c.remove(str);
        if (remove != null) {
            this.f21792b.mo14821b(remove);
        }
    }
}
