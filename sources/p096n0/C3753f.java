package p096n0;

import android.content.Context;
import android.os.Build;
import androidx.work.C1235a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C1264f;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
import p089m0.C3646j;
import p110p0.C3886b;
import p141u0.C4108p;
import p141u0.C4111q;
import p147v0.C4173d;

/* renamed from: n0.f */
public class C3753f {

    /* renamed from: a */
    private static final String f21607a = C3646j.m25231f("Schedulers");

    /* renamed from: a */
    static C3752e m25519a(Context context, C3756i iVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            C3886b bVar = new C3886b(context, iVar);
            C4173d.m26626a(context, SystemJobService.class, true);
            C3646j.m25229c().mo14806a(f21607a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        C3752e c = m25521c(context);
        if (c != null) {
            return c;
        }
        C1264f fVar = new C1264f(context);
        C4173d.m26626a(context, SystemAlarmService.class, true);
        C3646j.m25229c().mo14806a(f21607a, "Created SystemAlarmScheduler", new Throwable[0]);
        return fVar;
    }

    /* renamed from: b */
    public static void m25520b(C1235a aVar, WorkDatabase workDatabase, List<C3752e> list) {
        if (list != null && list.size() != 0) {
            C4111q B = workDatabase.mo4514B();
            workDatabase.mo3951c();
            try {
                List<C4108p> j = B.mo15631j(aVar.mo4493h());
                List<C4108p> s = B.mo15640s(200);
                if (j != null && j.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (C4108p pVar : j) {
                        B.mo15626e(pVar.f22314a, currentTimeMillis);
                    }
                }
                workDatabase.mo3965r();
                if (j != null && j.size() > 0) {
                    C4108p[] pVarArr = (C4108p[]) j.toArray(new C4108p[j.size()]);
                    for (C3752e next : list) {
                        if (next.mo4548f()) {
                            next.mo4547c(pVarArr);
                        }
                    }
                }
                if (s != null && s.size() > 0) {
                    C4108p[] pVarArr2 = (C4108p[]) s.toArray(new C4108p[s.size()]);
                    for (C3752e next2 : list) {
                        if (!next2.mo4548f()) {
                            next2.mo4547c(pVarArr2);
                        }
                    }
                }
            } finally {
                workDatabase.mo3955g();
            }
        }
    }

    /* renamed from: c */
    private static C3752e m25521c(Context context) {
        try {
            C3752e eVar = (C3752e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            C3646j.m25229c().mo14806a(f21607a, String.format("Created %s", new Object[]{"androidx.work.impl.background.gcm.GcmScheduler"}), new Throwable[0]);
            return eVar;
        } catch (Throwable th) {
            C3646j.m25229c().mo14806a(f21607a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
