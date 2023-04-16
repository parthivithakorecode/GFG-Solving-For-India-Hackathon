package p089m0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* renamed from: m0.v */
public abstract class C3666v {

    /* renamed from: a */
    private static final String f21421a = C3646j.m25231f("WorkerFactory");

    /* renamed from: m0.v$a */
    class C3667a extends C3666v {
        C3667a() {
        }

        /* renamed from: a */
        public ListenableWorker mo14833a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    /* renamed from: c */
    public static C3666v m25266c() {
        return new C3667a();
    }

    /* renamed from: a */
    public abstract ListenableWorker mo14833a(Context context, String str, WorkerParameters workerParameters);

    /* renamed from: b */
    public final ListenableWorker mo14834b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker a = mo14833a(context, str, workerParameters);
        if (a == null) {
            Class<? extends U> cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                C3646j c = C3646j.m25229c();
                String str2 = f21421a;
                c.mo14807b(str2, "Invalid class: " + str, th);
            }
            if (cls != null) {
                try {
                    a = (ListenableWorker) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th2) {
                    C3646j c2 = C3646j.m25229c();
                    String str3 = f21421a;
                    c2.mo14807b(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a == null || !a.isUsed()) {
            return a;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", new Object[]{getClass().getName(), str}));
    }
}
