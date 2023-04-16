package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p089m0.C3646j;
import p096n0.C3748b;
import p096n0.C3750d;
import p096n0.C3756i;
import p147v0.C4176g;
import p147v0.C4180j;
import p147v0.C4188n;
import p153w0.C4260a;

/* renamed from: androidx.work.impl.background.systemalarm.e */
public class C1259e implements C3748b {

    /* renamed from: p */
    static final String f3413p = C3646j.m25231f("SystemAlarmDispatcher");

    /* renamed from: f */
    final Context f3414f;

    /* renamed from: g */
    private final C4260a f3415g;

    /* renamed from: h */
    private final C4188n f3416h;

    /* renamed from: i */
    private final C3750d f3417i;

    /* renamed from: j */
    private final C3756i f3418j;

    /* renamed from: k */
    final C1256b f3419k;

    /* renamed from: l */
    private final Handler f3420l;

    /* renamed from: m */
    final List<Intent> f3421m;

    /* renamed from: n */
    Intent f3422n;

    /* renamed from: o */
    private C1262c f3423o;

    /* renamed from: androidx.work.impl.background.systemalarm.e$a */
    class C1260a implements Runnable {
        C1260a() {
        }

        public void run() {
            C1263d dVar;
            C1259e eVar;
            synchronized (C1259e.this.f3421m) {
                C1259e eVar2 = C1259e.this;
                eVar2.f3422n = eVar2.f3421m.get(0);
            }
            Intent intent = C1259e.this.f3422n;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C1259e.this.f3422n.getIntExtra("KEY_START_ID", 0);
                C3646j c = C3646j.m25229c();
                String str = C1259e.f3413p;
                c.mo14806a(str, String.format("Processing command %s, %s", new Object[]{C1259e.this.f3422n, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock b = C4180j.m26635b(C1259e.this.f3414f, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    C3646j.m25229c().mo14806a(str, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.acquire();
                    C1259e eVar3 = C1259e.this;
                    eVar3.f3419k.mo4528p(eVar3.f3422n, intExtra, eVar3);
                    C3646j.m25229c().mo14806a(str, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.release();
                    eVar = C1259e.this;
                    dVar = new C1263d(eVar);
                } catch (Throwable th) {
                    C3646j.m25229c().mo14806a(C1259e.f3413p, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.release();
                    C1259e eVar4 = C1259e.this;
                    eVar4.mo4541k(new C1263d(eVar4));
                    throw th;
                }
                eVar.mo4541k(dVar);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$b */
    static class C1261b implements Runnable {

        /* renamed from: f */
        private final C1259e f3425f;

        /* renamed from: g */
        private final Intent f3426g;

        /* renamed from: h */
        private final int f3427h;

        C1261b(C1259e eVar, Intent intent, int i) {
            this.f3425f = eVar;
            this.f3426g = intent;
            this.f3427h = i;
        }

        public void run() {
            this.f3425f.mo4534b(this.f3426g, this.f3427h);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$c */
    interface C1262c {
        /* renamed from: b */
        void mo4525b();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$d */
    static class C1263d implements Runnable {

        /* renamed from: f */
        private final C1259e f3428f;

        C1263d(C1259e eVar) {
            this.f3428f = eVar;
        }

        public void run() {
            this.f3428f.mo4535d();
        }
    }

    C1259e(Context context) {
        this(context, (C3750d) null, (C3756i) null);
    }

    C1259e(Context context, C3750d dVar, C3756i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f3414f = applicationContext;
        this.f3419k = new C1256b(applicationContext);
        this.f3416h = new C4188n();
        iVar = iVar == null ? C3756i.m25542k(context) : iVar;
        this.f3418j = iVar;
        dVar = dVar == null ? iVar.mo14984m() : dVar;
        this.f3417i = dVar;
        this.f3415g = iVar.mo14987p();
        dVar.mo14958d(this);
        this.f3421m = new ArrayList();
        this.f3422n = null;
        this.f3420l = new Handler(Looper.getMainLooper());
    }

    /* renamed from: c */
    private void m5075c() {
        if (this.f3420l.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: i */
    private boolean m5076i(String str) {
        m5075c();
        synchronized (this.f3421m) {
            for (Intent action : this.f3421m) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: l */
    private void m5077l() {
        m5075c();
        PowerManager.WakeLock b = C4180j.m26635b(this.f3414f, "ProcessCommand");
        try {
            b.acquire();
            this.f3418j.mo14987p().mo15823b(new C1260a());
        } finally {
            b.release();
        }
    }

    /* renamed from: a */
    public void mo4526a(String str, boolean z) {
        mo4541k(new C1261b(this, C1256b.m5053d(this.f3414f, str, z), 0));
    }

    /* renamed from: b */
    public boolean mo4534b(Intent intent, int i) {
        C3646j c = C3646j.m25229c();
        String str = f3413p;
        boolean z = false;
        c.mo14806a(str, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        m5075c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C3646j.m25229c().mo14810h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m5076i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.f3421m) {
                if (!this.f3421m.isEmpty()) {
                    z = true;
                }
                this.f3421m.add(intent);
                if (!z) {
                    m5077l();
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4535d() {
        C3646j c = C3646j.m25229c();
        String str = f3413p;
        c.mo14806a(str, "Checking if commands are complete.", new Throwable[0]);
        m5075c();
        synchronized (this.f3421m) {
            if (this.f3422n != null) {
                C3646j.m25229c().mo14806a(str, String.format("Removing command %s", new Object[]{this.f3422n}), new Throwable[0]);
                if (this.f3421m.remove(0).equals(this.f3422n)) {
                    this.f3422n = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            C4176g c2 = this.f3415g.mo15824c();
            if (!this.f3419k.mo4527o() && this.f3421m.isEmpty() && !c2.mo15691a()) {
                C3646j.m25229c().mo14806a(str, "No more commands & intents.", new Throwable[0]);
                C1262c cVar = this.f3423o;
                if (cVar != null) {
                    cVar.mo4525b();
                }
            } else if (!this.f3421m.isEmpty()) {
                m5077l();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C3750d mo4536e() {
        return this.f3417i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C4260a mo4537f() {
        return this.f3415g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C3756i mo4538g() {
        return this.f3418j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C4188n mo4539h() {
        return this.f3416h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4540j() {
        C3646j.m25229c().mo14806a(f3413p, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f3417i.mo14962i(this);
        this.f3416h.mo15703a();
        this.f3423o = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4541k(Runnable runnable) {
        this.f3420l.post(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo4542m(C1262c cVar) {
        if (this.f3423o != null) {
            C3646j.m25229c().mo14807b(f3413p, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f3423o = cVar;
        }
    }
}
