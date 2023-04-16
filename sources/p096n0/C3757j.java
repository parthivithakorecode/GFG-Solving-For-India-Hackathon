package p096n0;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C1235a;
import androidx.work.C1239b;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.futures.C1284d;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p089m0.C3643h;
import p089m0.C3646j;
import p089m0.C3662s;
import p135t0.C4058a;
import p141u0.C4086b;
import p141u0.C4108p;
import p141u0.C4111q;
import p141u0.C4123t;
import p143u2.C4136a;
import p147v0.C4173d;
import p147v0.C4181k;
import p147v0.C4184l;
import p147v0.C4186m;
import p153w0.C4260a;

/* renamed from: n0.j */
public class C3757j implements Runnable {

    /* renamed from: y */
    static final String f21633y = C3646j.m25231f("WorkerWrapper");

    /* renamed from: f */
    Context f21634f;

    /* renamed from: g */
    private String f21635g;

    /* renamed from: h */
    private List<C3752e> f21636h;

    /* renamed from: i */
    private WorkerParameters.C1234a f21637i;

    /* renamed from: j */
    C4108p f21638j;

    /* renamed from: k */
    ListenableWorker f21639k;

    /* renamed from: l */
    C4260a f21640l;

    /* renamed from: m */
    ListenableWorker.C1229a f21641m = ListenableWorker.C1229a.m4941a();

    /* renamed from: n */
    private C1235a f21642n;

    /* renamed from: o */
    private C4058a f21643o;

    /* renamed from: p */
    private WorkDatabase f21644p;

    /* renamed from: q */
    private C4111q f21645q;

    /* renamed from: r */
    private C4086b f21646r;

    /* renamed from: s */
    private C4123t f21647s;

    /* renamed from: t */
    private List<String> f21648t;

    /* renamed from: u */
    private String f21649u;

    /* renamed from: v */
    C1284d<Boolean> f21650v = C1284d.m5161u();

    /* renamed from: w */
    C4136a<ListenableWorker.C1229a> f21651w = null;

    /* renamed from: x */
    private volatile boolean f21652x;

    /* renamed from: n0.j$a */
    class C3758a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C4136a f21653f;

        /* renamed from: g */
        final /* synthetic */ C1284d f21654g;

        C3758a(C4136a aVar, C1284d dVar) {
            this.f21653f = aVar;
            this.f21654g = dVar;
        }

        public void run() {
            try {
                this.f21653f.get();
                C3646j.m25229c().mo14806a(C3757j.f21633y, String.format("Starting work for %s", new Object[]{C3757j.this.f21638j.f22316c}), new Throwable[0]);
                C3757j jVar = C3757j.this;
                jVar.f21651w = jVar.f21639k.startWork();
                this.f21654g.mo4585s(C3757j.this.f21651w);
            } catch (Throwable th) {
                this.f21654g.mo4584r(th);
            }
        }
    }

    /* renamed from: n0.j$b */
    class C3759b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1284d f21656f;

        /* renamed from: g */
        final /* synthetic */ String f21657g;

        C3759b(C1284d dVar, String str) {
            this.f21656f = dVar;
            this.f21657g = str;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                ListenableWorker.C1229a aVar = (ListenableWorker.C1229a) this.f21656f.get();
                if (aVar == null) {
                    C3646j.m25229c().mo14807b(C3757j.f21633y, String.format("%s returned a null result. Treating it as a failure.", new Object[]{C3757j.this.f21638j.f22316c}), new Throwable[0]);
                } else {
                    C3646j.m25229c().mo14806a(C3757j.f21633y, String.format("%s returned a %s result.", new Object[]{C3757j.this.f21638j.f22316c, aVar}), new Throwable[0]);
                    C3757j.this.f21641m = aVar;
                }
            } catch (CancellationException e) {
                C3646j.m25229c().mo14808d(C3757j.f21633y, String.format("%s was cancelled", new Object[]{this.f21657g}), e);
            } catch (InterruptedException | ExecutionException e2) {
                C3646j.m25229c().mo14807b(C3757j.f21633y, String.format("%s failed because it threw an exception/error", new Object[]{this.f21657g}), e2);
            } catch (Throwable th) {
                C3757j.this.mo14997f();
                throw th;
            }
            C3757j.this.mo14997f();
        }
    }

    /* renamed from: n0.j$c */
    public static class C3760c {

        /* renamed from: a */
        Context f21659a;

        /* renamed from: b */
        ListenableWorker f21660b;

        /* renamed from: c */
        C4058a f21661c;

        /* renamed from: d */
        C4260a f21662d;

        /* renamed from: e */
        C1235a f21663e;

        /* renamed from: f */
        WorkDatabase f21664f;

        /* renamed from: g */
        String f21665g;

        /* renamed from: h */
        List<C3752e> f21666h;

        /* renamed from: i */
        WorkerParameters.C1234a f21667i = new WorkerParameters.C1234a();

        public C3760c(Context context, C1235a aVar, C4260a aVar2, C4058a aVar3, WorkDatabase workDatabase, String str) {
            this.f21659a = context.getApplicationContext();
            this.f21662d = aVar2;
            this.f21661c = aVar3;
            this.f21663e = aVar;
            this.f21664f = workDatabase;
            this.f21665g = str;
        }

        /* renamed from: a */
        public C3757j mo15002a() {
            return new C3757j(this);
        }

        /* renamed from: b */
        public C3760c mo15003b(WorkerParameters.C1234a aVar) {
            if (aVar != null) {
                this.f21667i = aVar;
            }
            return this;
        }

        /* renamed from: c */
        public C3760c mo15004c(List<C3752e> list) {
            this.f21666h = list;
            return this;
        }
    }

    C3757j(C3760c cVar) {
        this.f21634f = cVar.f21659a;
        this.f21640l = cVar.f21662d;
        this.f21643o = cVar.f21661c;
        this.f21635g = cVar.f21665g;
        this.f21636h = cVar.f21666h;
        this.f21637i = cVar.f21667i;
        this.f21639k = cVar.f21660b;
        this.f21642n = cVar.f21663e;
        WorkDatabase workDatabase = cVar.f21664f;
        this.f21644p = workDatabase;
        this.f21645q = workDatabase.mo4514B();
        this.f21646r = this.f21644p.mo4516t();
        this.f21647s = this.f21644p.mo4515C();
    }

    /* renamed from: a */
    private String m25562a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f21635g);
        sb.append(", tags={ ");
        boolean z = true;
        for (String next : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    /* renamed from: c */
    private void m25563c(ListenableWorker.C1229a aVar) {
        if (aVar instanceof ListenableWorker.C1229a.C1232c) {
            C3646j.m25229c().mo14808d(f21633y, String.format("Worker result SUCCESS for %s", new Object[]{this.f21649u}), new Throwable[0]);
            if (!this.f21638j.mo15616d()) {
                m25570m();
                return;
            }
        } else if (aVar instanceof ListenableWorker.C1229a.C1231b) {
            C3646j.m25229c().mo14808d(f21633y, String.format("Worker result RETRY for %s", new Object[]{this.f21649u}), new Throwable[0]);
            m25565g();
            return;
        } else {
            C3646j.m25229c().mo14808d(f21633y, String.format("Worker result FAILURE for %s", new Object[]{this.f21649u}), new Throwable[0]);
            if (!this.f21638j.mo15616d()) {
                mo14998l();
                return;
            }
        }
        m25566h();
    }

    /* renamed from: e */
    private void m25564e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f21645q.mo15630i(str2) != C3662s.CANCELLED) {
                this.f21645q.mo15638q(C3662s.FAILED, str2);
            }
            linkedList.addAll(this.f21646r.mo15591c(str2));
        }
    }

    /* renamed from: g */
    private void m25565g() {
        this.f21644p.mo3951c();
        try {
            this.f21645q.mo15638q(C3662s.ENQUEUED, this.f21635g);
            this.f21645q.mo15637p(this.f21635g, System.currentTimeMillis());
            this.f21645q.mo15626e(this.f21635g, -1);
            this.f21644p.mo3965r();
        } finally {
            this.f21644p.mo3955g();
            m25567i(true);
        }
    }

    /* renamed from: h */
    private void m25566h() {
        this.f21644p.mo3951c();
        try {
            this.f21645q.mo15637p(this.f21635g, System.currentTimeMillis());
            this.f21645q.mo15638q(C3662s.ENQUEUED, this.f21635g);
            this.f21645q.mo15633l(this.f21635g);
            this.f21645q.mo15626e(this.f21635g, -1);
            this.f21644p.mo3965r();
        } finally {
            this.f21644p.mo3955g();
            m25567i(false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    private void m25567i(boolean z) {
        ListenableWorker listenableWorker;
        this.f21644p.mo3951c();
        try {
            if (!this.f21644p.mo4514B().mo15625d()) {
                C4173d.m26626a(this.f21634f, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f21645q.mo15638q(C3662s.ENQUEUED, this.f21635g);
                this.f21645q.mo15626e(this.f21635g, -1);
            }
            if (!(this.f21638j == null || (listenableWorker = this.f21639k) == null || !listenableWorker.isRunInForeground())) {
                this.f21643o.mo14956b(this.f21635g);
            }
            this.f21644p.mo3965r();
            this.f21644p.mo3955g();
            this.f21650v.mo4583q(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f21644p.mo3955g();
            throw th;
        }
    }

    /* renamed from: j */
    private void m25568j() {
        C3662s i = this.f21645q.mo15630i(this.f21635g);
        if (i == C3662s.RUNNING) {
            C3646j.m25229c().mo14806a(f21633y, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f21635g}), new Throwable[0]);
            m25567i(true);
            return;
        }
        C3646j.m25229c().mo14806a(f21633y, String.format("Status for %s is %s; not doing any work", new Object[]{this.f21635g, i}), new Throwable[0]);
        m25567i(false);
    }

    /* renamed from: k */
    private void m25569k() {
        C1239b b;
        if (!m25571n()) {
            this.f21644p.mo3951c();
            try {
                C4108p k = this.f21645q.mo15632k(this.f21635g);
                this.f21638j = k;
                if (k == null) {
                    C3646j.m25229c().mo14807b(f21633y, String.format("Didn't find WorkSpec for id %s", new Object[]{this.f21635g}), new Throwable[0]);
                    m25567i(false);
                    this.f21644p.mo3965r();
                } else if (k.f22315b != C3662s.ENQUEUED) {
                    m25568j();
                    this.f21644p.mo3965r();
                    C3646j.m25229c().mo14806a(f21633y, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.f21638j.f22316c}), new Throwable[0]);
                    this.f21644p.mo3955g();
                } else {
                    if (k.mo15616d() || this.f21638j.mo15615c()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        C4108p pVar = this.f21638j;
                        if (!(pVar.f22327n == 0) && currentTimeMillis < pVar.mo15613a()) {
                            C3646j.m25229c().mo14806a(f21633y, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f21638j.f22316c}), new Throwable[0]);
                            m25567i(true);
                            this.f21644p.mo3965r();
                            this.f21644p.mo3955g();
                            return;
                        }
                    }
                    this.f21644p.mo3965r();
                    this.f21644p.mo3955g();
                    if (this.f21638j.mo15616d()) {
                        b = this.f21638j.f22318e;
                    } else {
                        C3643h b2 = this.f21642n.mo4491f().mo14805b(this.f21638j.f22317d);
                        if (b2 == null) {
                            C3646j.m25229c().mo14807b(f21633y, String.format("Could not create Input Merger %s", new Object[]{this.f21638j.f22317d}), new Throwable[0]);
                            mo14998l();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f21638j.f22318e);
                        arrayList.addAll(this.f21645q.mo15635n(this.f21635g));
                        b = b2.mo4439b(arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f21635g), b, this.f21648t, this.f21637i, this.f21638j.f22324k, this.f21642n.mo4490e(), this.f21640l, this.f21642n.mo4498m(), new C4186m(this.f21644p, this.f21640l), new C4184l(this.f21644p, this.f21643o, this.f21640l));
                    if (this.f21639k == null) {
                        this.f21639k = this.f21642n.mo4498m().mo14834b(this.f21634f, this.f21638j.f22316c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f21639k;
                    if (listenableWorker == null) {
                        C3646j.m25229c().mo14807b(f21633y, String.format("Could not create Worker %s", new Object[]{this.f21638j.f22316c}), new Throwable[0]);
                        mo14998l();
                    } else if (listenableWorker.isUsed()) {
                        C3646j.m25229c().mo14807b(f21633y, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f21638j.f22316c}), new Throwable[0]);
                        mo14998l();
                    } else {
                        this.f21639k.setUsed();
                        if (!m25572o()) {
                            m25568j();
                        } else if (!m25571n()) {
                            C1284d u = C1284d.m5161u();
                            C4181k kVar = new C4181k(this.f21634f, this.f21638j, this.f21639k, workerParameters.mo4477b(), this.f21640l);
                            this.f21640l.mo15822a().execute(kVar);
                            C4136a<Void> a = kVar.mo15697a();
                            a.mo4576d(new C3758a(a, u), this.f21640l.mo15822a());
                            u.mo4576d(new C3759b(u, this.f21649u), this.f21640l.mo15824c());
                        }
                    }
                }
            } finally {
                this.f21644p.mo3955g();
            }
        }
    }

    /* renamed from: m */
    private void m25570m() {
        this.f21644p.mo3951c();
        try {
            this.f21645q.mo15638q(C3662s.SUCCEEDED, this.f21635g);
            this.f21645q.mo15641t(this.f21635g, ((ListenableWorker.C1229a.C1232c) this.f21641m).mo4469e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String next : this.f21646r.mo15591c(this.f21635g)) {
                if (this.f21645q.mo15630i(next) == C3662s.BLOCKED && this.f21646r.mo15589a(next)) {
                    C3646j.m25229c().mo14808d(f21633y, String.format("Setting status to enqueued for %s", new Object[]{next}), new Throwable[0]);
                    this.f21645q.mo15638q(C3662s.ENQUEUED, next);
                    this.f21645q.mo15637p(next, currentTimeMillis);
                }
            }
            this.f21644p.mo3965r();
        } finally {
            this.f21644p.mo3955g();
            m25567i(false);
        }
    }

    /* renamed from: n */
    private boolean m25571n() {
        if (!this.f21652x) {
            return false;
        }
        C3646j.m25229c().mo14806a(f21633y, String.format("Work interrupted for %s", new Object[]{this.f21649u}), new Throwable[0]);
        C3662s i = this.f21645q.mo15630i(this.f21635g);
        if (i == null) {
            m25567i(false);
        } else {
            m25567i(!i.mo14822b());
        }
        return true;
    }

    /* renamed from: o */
    private boolean m25572o() {
        this.f21644p.mo3951c();
        try {
            boolean z = true;
            if (this.f21645q.mo15630i(this.f21635g) == C3662s.ENQUEUED) {
                this.f21645q.mo15638q(C3662s.RUNNING, this.f21635g);
                this.f21645q.mo15636o(this.f21635g);
            } else {
                z = false;
            }
            this.f21644p.mo3965r();
            return z;
        } finally {
            this.f21644p.mo3955g();
        }
    }

    /* renamed from: b */
    public C4136a<Boolean> mo14995b() {
        return this.f21650v;
    }

    /* renamed from: d */
    public void mo14996d() {
        boolean z;
        this.f21652x = true;
        m25571n();
        C4136a<ListenableWorker.C1229a> aVar = this.f21651w;
        if (aVar != null) {
            z = aVar.isDone();
            this.f21651w.cancel(true);
        } else {
            z = false;
        }
        ListenableWorker listenableWorker = this.f21639k;
        if (listenableWorker == null || z) {
            C3646j.m25229c().mo14806a(f21633y, String.format("WorkSpec %s is already done. Not interrupting.", new Object[]{this.f21638j}), new Throwable[0]);
            return;
        }
        listenableWorker.stop();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo14997f() {
        if (!m25571n()) {
            this.f21644p.mo3951c();
            try {
                C3662s i = this.f21645q.mo15630i(this.f21635g);
                this.f21644p.mo4513A().mo15609a(this.f21635g);
                if (i == null) {
                    m25567i(false);
                } else if (i == C3662s.RUNNING) {
                    m25563c(this.f21641m);
                } else if (!i.mo14822b()) {
                    m25565g();
                }
                this.f21644p.mo3965r();
            } finally {
                this.f21644p.mo3955g();
            }
        }
        List<C3752e> list = this.f21636h;
        if (list != null) {
            for (C3752e b : list) {
                b.mo4546b(this.f21635g);
            }
            C3753f.m25520b(this.f21642n, this.f21644p, this.f21636h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo14998l() {
        this.f21644p.mo3951c();
        try {
            m25564e(this.f21635g);
            this.f21645q.mo15641t(this.f21635g, ((ListenableWorker.C1229a.C1230a) this.f21641m).mo4462e());
            this.f21644p.mo3965r();
        } finally {
            this.f21644p.mo3955g();
            m25567i(false);
        }
    }

    public void run() {
        List<String> b = this.f21647s.mo15645b(this.f21635g);
        this.f21648t = b;
        this.f21649u = m25562a(b);
        m25569k();
    }
}
