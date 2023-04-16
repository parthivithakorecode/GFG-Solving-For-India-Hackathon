package p110p0;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p089m0.C3646j;
import p089m0.C3657n;
import p089m0.C3662s;
import p096n0.C3752e;
import p096n0.C3756i;
import p141u0.C4093g;
import p141u0.C4108p;
import p141u0.C4111q;
import p147v0.C4172c;

/* renamed from: p0.b */
public class C3886b implements C3752e {

    /* renamed from: j */
    private static final String f21967j = C3646j.m25231f("SystemJobScheduler");

    /* renamed from: f */
    private final Context f21968f;

    /* renamed from: g */
    private final JobScheduler f21969g;

    /* renamed from: h */
    private final C3756i f21970h;

    /* renamed from: i */
    private final C3884a f21971i;

    public C3886b(Context context, C3756i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new C3884a(context));
    }

    public C3886b(Context context, C3756i iVar, JobScheduler jobScheduler, C3884a aVar) {
        this.f21968f = context;
        this.f21970h = iVar;
        this.f21969g = jobScheduler;
        this.f21971i = aVar;
    }

    /* renamed from: a */
    public static void m25984a(Context context) {
        List<JobInfo> g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (g = m25987g(context, jobScheduler)) != null && !g.isEmpty()) {
            for (JobInfo id : g) {
                m25985d(jobScheduler, id.getId());
            }
        }
    }

    /* renamed from: d */
    private static void m25985d(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C3646j.m25229c().mo14807b(f21967j, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    /* renamed from: e */
    private static List<Integer> m25986e(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g = m25987g(context, jobScheduler);
        if (g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : g) {
            if (str.equals(m25988h(next))) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private static List<JobInfo> m25987g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C3646j.m25229c().mo14807b(f21967j, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private static String m25988h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m25989i(Context context, C3756i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g = m25987g(context, jobScheduler);
        List<String> a = iVar.mo14986o().mo4518y().mo15601a();
        boolean z = false;
        HashSet hashSet = new HashSet(g != null ? g.size() : 0);
        if (g != null && !g.isEmpty()) {
            for (JobInfo next : g) {
                String h = m25988h(next);
                if (!TextUtils.isEmpty(h)) {
                    hashSet.add(h);
                } else {
                    m25985d(jobScheduler, next.getId());
                }
            }
        }
        Iterator<String> it = a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    C3646j.m25229c().mo14806a(f21967j, "Reconciling jobs", new Throwable[0]);
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            WorkDatabase o = iVar.mo14986o();
            o.mo3951c();
            try {
                C4111q B = o.mo4514B();
                for (String e : a) {
                    B.mo15626e(e, -1);
                }
                o.mo3965r();
            } finally {
                o.mo3955g();
            }
        }
        return z;
    }

    /* renamed from: b */
    public void mo4546b(String str) {
        List<Integer> e = m25986e(this.f21968f, this.f21969g, str);
        if (e != null && !e.isEmpty()) {
            for (Integer intValue : e) {
                m25985d(this.f21969g, intValue.intValue());
            }
            this.f21970h.mo14986o().mo4518y().mo15604d(str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public void mo4547c(C4108p... pVarArr) {
        List<Integer> e;
        WorkDatabase o = this.f21970h.mo14986o();
        C4172c cVar = new C4172c(o);
        int length = pVarArr.length;
        int i = 0;
        while (i < length) {
            C4108p pVar = pVarArr[i];
            o.mo3951c();
            try {
                C4108p k = o.mo4514B().mo15632k(pVar.f22314a);
                if (k == null) {
                    C3646j.m25229c().mo14810h(f21967j, "Skipping scheduling " + pVar.f22314a + " because it's no longer in the DB", new Throwable[0]);
                } else if (k.f22315b != C3662s.ENQUEUED) {
                    C3646j.m25229c().mo14810h(f21967j, "Skipping scheduling " + pVar.f22314a + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    C4093g b = o.mo4518y().mo15602b(pVar.f22314a);
                    int d = b != null ? b.f22292b : cVar.mo15688d(this.f21970h.mo14982i().mo4494i(), this.f21970h.mo14982i().mo4492g());
                    if (b == null) {
                        this.f21970h.mo14986o().mo4518y().mo15603c(new C4093g(pVar.f22314a, d));
                    }
                    mo15349j(pVar, d);
                    if (Build.VERSION.SDK_INT == 23 && (e = m25986e(this.f21968f, this.f21969g, pVar.f22314a)) != null) {
                        int indexOf = e.indexOf(Integer.valueOf(d));
                        if (indexOf >= 0) {
                            e.remove(indexOf);
                        }
                        mo15349j(pVar, !e.isEmpty() ? e.get(0).intValue() : cVar.mo15688d(this.f21970h.mo14982i().mo4494i(), this.f21970h.mo14982i().mo4492g()));
                    }
                }
                o.mo3965r();
                o.mo3955g();
                i++;
            } catch (Throwable th) {
                o.mo3955g();
                throw th;
            }
        }
    }

    /* renamed from: f */
    public boolean mo4548f() {
        return true;
    }

    /* renamed from: j */
    public void mo15349j(C4108p pVar, int i) {
        JobInfo a = this.f21971i.mo15348a(pVar, i);
        C3646j c = C3646j.m25229c();
        String str = f21967j;
        c.mo14806a(str, String.format("Scheduling work ID %s Job ID %s", new Object[]{pVar.f22314a, Integer.valueOf(i)}), new Throwable[0]);
        try {
            if (this.f21969g.schedule(a) == 0) {
                C3646j.m25229c().mo14810h(str, String.format("Unable to schedule work ID %s", new Object[]{pVar.f22314a}), new Throwable[0]);
                if (pVar.f22330q && pVar.f22331r == C3657n.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f22330q = false;
                    C3646j.m25229c().mo14806a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{pVar.f22314a}), new Throwable[0]);
                    mo15349j(pVar, i);
                }
            }
        } catch (IllegalStateException e) {
            List<JobInfo> g = m25987g(this.f21968f, this.f21969g);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(g != null ? g.size() : 0), Integer.valueOf(this.f21970h.mo14986o().mo4514B().mo15639r().size()), Integer.valueOf(this.f21970h.mo14982i().mo4493h())});
            C3646j.m25229c().mo14807b(f21967j, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            C3646j.m25229c().mo14807b(f21967j, String.format("Unable to schedule %s", new Object[]{pVar}), th);
        }
    }
}
