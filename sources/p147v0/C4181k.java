package p147v0;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.core.p009os.C0674a;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C1284d;
import p089m0.C3640e;
import p089m0.C3641f;
import p089m0.C3646j;
import p141u0.C4108p;
import p143u2.C4136a;
import p153w0.C4260a;

/* renamed from: v0.k */
public class C4181k implements Runnable {

    /* renamed from: l */
    static final String f22406l = C3646j.m25231f("WorkForegroundRunnable");

    /* renamed from: f */
    final C1284d<Void> f22407f = C1284d.m5161u();

    /* renamed from: g */
    final Context f22408g;

    /* renamed from: h */
    final C4108p f22409h;

    /* renamed from: i */
    final ListenableWorker f22410i;

    /* renamed from: j */
    final C3641f f22411j;

    /* renamed from: k */
    final C4260a f22412k;

    /* renamed from: v0.k$a */
    class C4182a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1284d f22413f;

        C4182a(C1284d dVar) {
            this.f22413f = dVar;
        }

        public void run() {
            this.f22413f.mo4585s(C4181k.this.f22410i.getForegroundInfoAsync());
        }
    }

    /* renamed from: v0.k$b */
    class C4183b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1284d f22415f;

        C4183b(C1284d dVar) {
            this.f22415f = dVar;
        }

        public void run() {
            try {
                C3640e eVar = (C3640e) this.f22415f.get();
                if (eVar != null) {
                    C3646j.m25229c().mo14806a(C4181k.f22406l, String.format("Updating notification for %s", new Object[]{C4181k.this.f22409h.f22316c}), new Throwable[0]);
                    C4181k.this.f22410i.setRunInForeground(true);
                    C4181k kVar = C4181k.this;
                    kVar.f22407f.mo4585s(kVar.f22411j.mo14802a(kVar.f22408g, kVar.f22410i.getId(), eVar));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[]{C4181k.this.f22409h.f22316c}));
            } catch (Throwable th) {
                C4181k.this.f22407f.mo4584r(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public C4181k(Context context, C4108p pVar, ListenableWorker listenableWorker, C3641f fVar, C4260a aVar) {
        this.f22408g = context;
        this.f22409h = pVar;
        this.f22410i = listenableWorker;
        this.f22411j = fVar;
        this.f22412k = aVar;
    }

    /* renamed from: a */
    public C4136a<Void> mo15697a() {
        return this.f22407f;
    }

    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.f22409h.f22330q || C0674a.m2809c()) {
            this.f22407f.mo4583q(null);
            return;
        }
        C1284d u = C1284d.m5161u();
        this.f22412k.mo15822a().execute(new C4182a(u));
        u.mo4576d(new C4183b(u), this.f22412k.mo15822a());
    }
}
