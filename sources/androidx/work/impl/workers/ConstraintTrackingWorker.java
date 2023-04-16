package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.C1284d;
import java.util.Collections;
import java.util.List;
import p089m0.C3646j;
import p096n0.C3756i;
import p117q0.C3938c;
import p117q0.C3939d;
import p141u0.C4108p;
import p143u2.C4136a;
import p153w0.C4260a;

public class ConstraintTrackingWorker extends ListenableWorker implements C3938c {

    /* renamed from: p */
    private static final String f3499p = C3646j.m25231f("ConstraintTrkngWrkr");

    /* renamed from: k */
    private WorkerParameters f3500k;

    /* renamed from: l */
    final Object f3501l = new Object();

    /* renamed from: m */
    volatile boolean f3502m = false;

    /* renamed from: n */
    C1284d<ListenableWorker.C1229a> f3503n = C1284d.m5161u();

    /* renamed from: o */
    private ListenableWorker f3504o;

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    class C1285a implements Runnable {
        C1285a() {
        }

        public void run() {
            ConstraintTrackingWorker.this.mo4601f();
        }
    }

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$b */
    class C1286b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C4136a f3506f;

        C1286b(C4136a aVar) {
            this.f3506f = aVar;
        }

        public void run() {
            synchronized (ConstraintTrackingWorker.this.f3501l) {
                if (ConstraintTrackingWorker.this.f3502m) {
                    ConstraintTrackingWorker.this.mo4600c();
                } else {
                    ConstraintTrackingWorker.this.f3503n.mo4585s(this.f3506f);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f3500k = workerParameters;
    }

    /* renamed from: a */
    public WorkDatabase mo4598a() {
        return C3756i.m25542k(getApplicationContext()).mo14986o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4599b() {
        this.f3503n.mo4583q(ListenableWorker.C1229a.m4941a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4600c() {
        this.f3503n.mo4583q(ListenableWorker.C1229a.m4942b());
    }

    /* renamed from: d */
    public void mo4531d(List<String> list) {
        C3646j.m25229c().mo14806a(f3499p, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f3501l) {
            this.f3502m = true;
        }
    }

    /* renamed from: e */
    public void mo4532e(List<String> list) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4601f() {
        String i = getInputData().mo4505i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(i)) {
            C3646j.m25229c().mo14807b(f3499p, "No worker to delegate to.", new Throwable[0]);
        } else {
            ListenableWorker b = getWorkerFactory().mo14834b(getApplicationContext(), i, this.f3500k);
            this.f3504o = b;
            if (b == null) {
                C3646j.m25229c().mo14806a(f3499p, "No worker to delegate to.", new Throwable[0]);
            } else {
                C4108p k = mo4598a().mo4514B().mo15632k(getId().toString());
                if (k == null) {
                    mo4599b();
                    return;
                }
                C3939d dVar = new C3939d(getApplicationContext(), getTaskExecutor(), this);
                dVar.mo15403d(Collections.singletonList(k));
                if (dVar.mo15402c(getId().toString())) {
                    C3646j.m25229c().mo14806a(f3499p, String.format("Constraints met for delegate %s", new Object[]{i}), new Throwable[0]);
                    try {
                        C4136a<ListenableWorker.C1229a> startWork = this.f3504o.startWork();
                        startWork.mo4576d(new C1286b(startWork), getBackgroundExecutor());
                        return;
                    } catch (Throwable th) {
                        C3646j c = C3646j.m25229c();
                        String str = f3499p;
                        c.mo14806a(str, String.format("Delegated worker %s threw exception in startWork.", new Object[]{i}), th);
                        synchronized (this.f3501l) {
                            if (this.f3502m) {
                                C3646j.m25229c().mo14806a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                                mo4600c();
                            } else {
                                mo4599b();
                            }
                            return;
                        }
                    }
                } else {
                    C3646j.m25229c().mo14806a(f3499p, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{i}), new Throwable[0]);
                    mo4600c();
                    return;
                }
            }
        }
        mo4599b();
    }

    public C4260a getTaskExecutor() {
        return C3756i.m25542k(getApplicationContext()).mo14987p();
    }

    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f3504o;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f3504o;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.f3504o.stop();
        }
    }

    public C4136a<ListenableWorker.C1229a> startWork() {
        getBackgroundExecutor().execute(new C1285a());
        return this.f3503n;
    }
}
