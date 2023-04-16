package p096n0;

import android.content.Context;
import android.os.PowerManager;
import androidx.core.content.C0597a;
import androidx.work.C1235a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1268a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p089m0.C3640e;
import p089m0.C3646j;
import p096n0.C3757j;
import p135t0.C4058a;
import p143u2.C4136a;
import p147v0.C4180j;
import p153w0.C4260a;

/* renamed from: n0.d */
public class C3750d implements C3748b, C4058a {

    /* renamed from: q */
    private static final String f21592q = C3646j.m25231f("Processor");

    /* renamed from: f */
    private PowerManager.WakeLock f21593f;

    /* renamed from: g */
    private Context f21594g;

    /* renamed from: h */
    private C1235a f21595h;

    /* renamed from: i */
    private C4260a f21596i;

    /* renamed from: j */
    private WorkDatabase f21597j;

    /* renamed from: k */
    private Map<String, C3757j> f21598k = new HashMap();

    /* renamed from: l */
    private Map<String, C3757j> f21599l = new HashMap();

    /* renamed from: m */
    private List<C3752e> f21600m;

    /* renamed from: n */
    private Set<String> f21601n;

    /* renamed from: o */
    private final List<C3748b> f21602o;

    /* renamed from: p */
    private final Object f21603p;

    /* renamed from: n0.d$a */
    private static class C3751a implements Runnable {

        /* renamed from: f */
        private C3748b f21604f;

        /* renamed from: g */
        private String f21605g;

        /* renamed from: h */
        private C4136a<Boolean> f21606h;

        C3751a(C3748b bVar, String str, C4136a<Boolean> aVar) {
            this.f21604f = bVar;
            this.f21605g = str;
            this.f21606h = aVar;
        }

        public void run() {
            boolean z;
            try {
                z = this.f21606h.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f21604f.mo4526a(this.f21605g, z);
        }
    }

    public C3750d(Context context, C1235a aVar, C4260a aVar2, WorkDatabase workDatabase, List<C3752e> list) {
        this.f21594g = context;
        this.f21595h = aVar;
        this.f21596i = aVar2;
        this.f21597j = workDatabase;
        this.f21600m = list;
        this.f21601n = new HashSet();
        this.f21602o = new ArrayList();
        this.f21593f = null;
        this.f21603p = new Object();
    }

    /* renamed from: e */
    private static boolean m25501e(String str, C3757j jVar) {
        if (jVar != null) {
            jVar.mo14996d();
            C3646j.m25229c().mo14806a(f21592q, String.format("WorkerWrapper interrupted for %s", new Object[]{str}), new Throwable[0]);
            return true;
        }
        C3646j.m25229c().mo14806a(f21592q, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
        return false;
    }

    /* renamed from: m */
    private void m25502m() {
        synchronized (this.f21603p) {
            if (!(!this.f21598k.isEmpty())) {
                try {
                    this.f21594g.startService(C1268a.m5101f(this.f21594g));
                } catch (Throwable th) {
                    C3646j.m25229c().mo14807b(f21592q, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f21593f;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f21593f = null;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4526a(String str, boolean z) {
        synchronized (this.f21603p) {
            this.f21599l.remove(str);
            C3646j.m25229c().mo14806a(f21592q, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
            for (C3748b a : this.f21602o) {
                a.mo4526a(str, z);
            }
        }
    }

    /* renamed from: b */
    public void mo14956b(String str) {
        synchronized (this.f21603p) {
            this.f21598k.remove(str);
            m25502m();
        }
    }

    /* renamed from: c */
    public void mo14957c(String str, C3640e eVar) {
        synchronized (this.f21603p) {
            C3646j.m25229c().mo14808d(f21592q, String.format("Moving WorkSpec (%s) to the foreground", new Object[]{str}), new Throwable[0]);
            C3757j remove = this.f21599l.remove(str);
            if (remove != null) {
                if (this.f21593f == null) {
                    PowerManager.WakeLock b = C4180j.m26635b(this.f21594g, "ProcessorForegroundLck");
                    this.f21593f = b;
                    b.acquire();
                }
                this.f21598k.put(str, remove);
                C0597a.m2455j(this.f21594g, C1268a.m5100c(this.f21594g, str, eVar));
            }
        }
    }

    /* renamed from: d */
    public void mo14958d(C3748b bVar) {
        synchronized (this.f21603p) {
            this.f21602o.add(bVar);
        }
    }

    /* renamed from: f */
    public boolean mo14959f(String str) {
        boolean contains;
        synchronized (this.f21603p) {
            contains = this.f21601n.contains(str);
        }
        return contains;
    }

    /* renamed from: g */
    public boolean mo14960g(String str) {
        boolean z;
        synchronized (this.f21603p) {
            if (!this.f21599l.containsKey(str)) {
                if (!this.f21598k.containsKey(str)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public boolean mo14961h(String str) {
        boolean containsKey;
        synchronized (this.f21603p) {
            containsKey = this.f21598k.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: i */
    public void mo14962i(C3748b bVar) {
        synchronized (this.f21603p) {
            this.f21602o.remove(bVar);
        }
    }

    /* renamed from: j */
    public boolean mo14963j(String str) {
        return mo14964k(str, (WorkerParameters.C1234a) null);
    }

    /* renamed from: k */
    public boolean mo14964k(String str, WorkerParameters.C1234a aVar) {
        synchronized (this.f21603p) {
            if (mo14960g(str)) {
                C3646j.m25229c().mo14806a(f21592q, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            C3757j a = new C3757j.C3760c(this.f21594g, this.f21595h, this.f21596i, this, this.f21597j, str).mo15004c(this.f21600m).mo15003b(aVar).mo15002a();
            C4136a<Boolean> b = a.mo14995b();
            b.mo4576d(new C3751a(this, str, b), this.f21596i.mo15822a());
            this.f21599l.put(str, a);
            this.f21596i.mo15824c().execute(a);
            C3646j.m25229c().mo14806a(f21592q, String.format("%s: processing %s", new Object[]{getClass().getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    /* renamed from: l */
    public boolean mo14965l(String str) {
        boolean e;
        synchronized (this.f21603p) {
            boolean z = true;
            C3646j.m25229c().mo14806a(f21592q, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.f21601n.add(str);
            C3757j remove = this.f21598k.remove(str);
            if (remove == null) {
                z = false;
            }
            if (remove == null) {
                remove = this.f21599l.remove(str);
            }
            e = m25501e(str, remove);
            if (z) {
                m25502m();
            }
        }
        return e;
    }

    /* renamed from: n */
    public boolean mo14966n(String str) {
        boolean e;
        synchronized (this.f21603p) {
            C3646j.m25229c().mo14806a(f21592q, String.format("Processor stopping foreground work %s", new Object[]{str}), new Throwable[0]);
            e = m25501e(str, this.f21598k.remove(str));
        }
        return e;
    }

    /* renamed from: o */
    public boolean mo14967o(String str) {
        boolean e;
        synchronized (this.f21603p) {
            C3646j.m25229c().mo14806a(f21592q, String.format("Processor stopping background work %s", new Object[]{str}), new Throwable[0]);
            e = m25501e(str, this.f21599l.remove(str));
        }
        return e;
    }
}
