package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p089m0.C3646j;
import p096n0.C3756i;
import p141u0.C4093g;
import p141u0.C4094h;
import p141u0.C4099k;
import p141u0.C4108p;
import p141u0.C4111q;
import p141u0.C4123t;

public class DiagnosticsWorker extends Worker {

    /* renamed from: l */
    private static final String f3508l = C3646j.m25231f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    private static String m5171a(C4108p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{pVar.f22314a, pVar.f22316c, num, pVar.f22315b.name(), str, str2});
    }

    /* renamed from: b */
    private static String m5172b(C4099k kVar, C4123t tVar, C4094h hVar, List<C4108p> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"}));
        for (C4108p next : list) {
            Integer num = null;
            C4093g b = hVar.mo15602b(next.f22314a);
            if (b != null) {
                num = Integer.valueOf(b.f22292b);
            }
            sb.append(m5171a(next, TextUtils.join(",", kVar.mo15607b(next.f22314a)), num, TextUtils.join(",", tVar.mo15645b(next.f22314a))));
        }
        return sb.toString();
    }

    public ListenableWorker.C1229a doWork() {
        WorkDatabase o = C3756i.m25542k(getApplicationContext()).mo14986o();
        C4111q B = o.mo4514B();
        C4099k z = o.mo4519z();
        C4123t C = o.mo4515C();
        C4094h y = o.mo4518y();
        List<C4108p> h = B.mo15629h(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        List<C4108p> c = B.mo15624c();
        List<C4108p> s = B.mo15640s(200);
        if (h != null && !h.isEmpty()) {
            C3646j c2 = C3646j.m25229c();
            String str = f3508l;
            c2.mo14808d(str, "Recently completed work:\n\n", new Throwable[0]);
            C3646j.m25229c().mo14808d(str, m5172b(z, C, y, h), new Throwable[0]);
        }
        if (c != null && !c.isEmpty()) {
            C3646j c3 = C3646j.m25229c();
            String str2 = f3508l;
            c3.mo14808d(str2, "Running work:\n\n", new Throwable[0]);
            C3646j.m25229c().mo14808d(str2, m5172b(z, C, y, c), new Throwable[0]);
        }
        if (s != null && !s.isEmpty()) {
            C3646j c4 = C3646j.m25229c();
            String str3 = f3508l;
            c4.mo14808d(str3, "Enqueued work:\n\n", new Throwable[0]);
            C3646j.m25229c().mo14808d(str3, m5172b(z, C, y, s), new Throwable[0]);
        }
        return ListenableWorker.C1229a.m4943c();
    }
}
