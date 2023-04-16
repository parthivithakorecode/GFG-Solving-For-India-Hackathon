package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C1284d;
import p143u2.C4136a;

public abstract class Worker extends ListenableWorker {

    /* renamed from: k */
    C1284d<ListenableWorker.C1229a> f3319k;

    /* renamed from: androidx.work.Worker$a */
    class C1233a implements Runnable {
        C1233a() {
        }

        public void run() {
            try {
                Worker.this.f3319k.mo4583q(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.f3319k.mo4584r(th);
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.C1229a doWork();

    public final C4136a<ListenableWorker.C1229a> startWork() {
        this.f3319k = C1284d.m5161u();
        getBackgroundExecutor().execute(new C1233a());
        return this.f3319k;
    }
}
