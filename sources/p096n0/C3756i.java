package p096n0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.C1235a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import p089m0.C3646j;
import p089m0.C3651m;
import p089m0.C3659p;
import p089m0.C3663t;
import p089m0.C3664u;
import p103o0.C3818b;
import p110p0.C3886b;
import p147v0.C4167a;
import p147v0.C4174e;
import p147v0.C4178h;
import p147v0.C4179i;
import p153w0.C4260a;
import p153w0.C4261b;

/* renamed from: n0.i */
public class C3756i extends C3663t {

    /* renamed from: j */
    private static final String f21620j = C3646j.m25231f("WorkManagerImpl");

    /* renamed from: k */
    private static C3756i f21621k = null;

    /* renamed from: l */
    private static C3756i f21622l = null;

    /* renamed from: m */
    private static final Object f21623m = new Object();

    /* renamed from: a */
    private Context f21624a;

    /* renamed from: b */
    private C1235a f21625b;

    /* renamed from: c */
    private WorkDatabase f21626c;

    /* renamed from: d */
    private C4260a f21627d;

    /* renamed from: e */
    private List<C3752e> f21628e;

    /* renamed from: f */
    private C3750d f21629f;

    /* renamed from: g */
    private C4174e f21630g;

    /* renamed from: h */
    private boolean f21631h;

    /* renamed from: i */
    private BroadcastReceiver.PendingResult f21632i;

    public C3756i(Context context, C1235a aVar, C4260a aVar2) {
        this(context, aVar, aVar2, context.getResources().getBoolean(C3659p.workmanager_test_configuration));
    }

    public C3756i(Context context, C1235a aVar, C4260a aVar2, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        C3646j.m25230e(new C3646j.C3647a(aVar.mo4495j()));
        Context context2 = context;
        C1235a aVar3 = aVar;
        C4260a aVar4 = aVar2;
        WorkDatabase workDatabase2 = workDatabase;
        List<C3752e> g = mo14980g(applicationContext, aVar, aVar2);
        m25543q(context2, aVar3, aVar4, workDatabase2, g, new C3750d(context2, aVar3, aVar4, workDatabase2, g));
    }

    public C3756i(Context context, C1235a aVar, C4260a aVar2, boolean z) {
        this(context, aVar, aVar2, WorkDatabase.m4994s(context.getApplicationContext(), aVar2.mo15824c(), z));
    }

    /* renamed from: e */
    public static void m25540e(Context context, C1235a aVar) {
        synchronized (f21623m) {
            C3756i iVar = f21621k;
            if (iVar != null) {
                if (f21622l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (iVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (f21622l == null) {
                    f21622l = new C3756i(applicationContext, aVar, new C4261b(aVar.mo4497l()));
                }
                f21621k = f21622l;
            }
        }
    }

    @Deprecated
    /* renamed from: j */
    public static C3756i m25541j() {
        synchronized (f21623m) {
            C3756i iVar = f21621k;
            if (iVar != null) {
                return iVar;
            }
            C3756i iVar2 = f21622l;
            return iVar2;
        }
    }

    /* renamed from: k */
    public static C3756i m25542k(Context context) {
        C3756i j;
        synchronized (f21623m) {
            j = m25541j();
            if (j == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof C1235a.C1238c) {
                    m25540e(applicationContext, ((C1235a.C1238c) applicationContext).mo4501a());
                    j = m25542k(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return j;
    }

    /* renamed from: q */
    private void m25543q(Context context, C1235a aVar, C4260a aVar2, WorkDatabase workDatabase, List<C3752e> list, C3750d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f21624a = applicationContext;
        this.f21625b = aVar;
        this.f21627d = aVar2;
        this.f21626c = workDatabase;
        this.f21628e = list;
        this.f21629f = dVar;
        this.f21630g = new C4174e(workDatabase);
        this.f21631h = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext.isDeviceProtectedStorage()) {
            this.f21627d.mo15823b(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /* renamed from: a */
    public C3651m mo14823a(String str) {
        C4167a d = C4167a.m26604d(str, this);
        this.f21627d.mo15823b(d);
        return d.mo15679e();
    }

    /* renamed from: b */
    public C3651m mo14824b(List<? extends C3664u> list) {
        if (!list.isEmpty()) {
            return new C3754g(this, list).mo14969a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    /* renamed from: f */
    public C3651m mo14979f(UUID uuid) {
        C4167a b = C4167a.m26602b(uuid, this);
        this.f21627d.mo15823b(b);
        return b.mo15679e();
    }

    /* renamed from: g */
    public List<C3752e> mo14980g(Context context, C1235a aVar, C4260a aVar2) {
        return Arrays.asList(new C3752e[]{C3753f.m25519a(context, this), new C3818b(context, aVar, aVar2, this)});
    }

    /* renamed from: h */
    public Context mo14981h() {
        return this.f21624a;
    }

    /* renamed from: i */
    public C1235a mo14982i() {
        return this.f21625b;
    }

    /* renamed from: l */
    public C4174e mo14983l() {
        return this.f21630g;
    }

    /* renamed from: m */
    public C3750d mo14984m() {
        return this.f21629f;
    }

    /* renamed from: n */
    public List<C3752e> mo14985n() {
        return this.f21628e;
    }

    /* renamed from: o */
    public WorkDatabase mo14986o() {
        return this.f21626c;
    }

    /* renamed from: p */
    public C4260a mo14987p() {
        return this.f21627d;
    }

    /* renamed from: r */
    public void mo14988r() {
        synchronized (f21623m) {
            this.f21631h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f21632i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f21632i = null;
            }
        }
    }

    /* renamed from: s */
    public void mo14989s() {
        if (Build.VERSION.SDK_INT >= 23) {
            C3886b.m25984a(mo14981h());
        }
        mo14986o().mo4514B().mo15642u();
        C3753f.m25520b(mo14982i(), mo14986o(), mo14985n());
    }

    /* renamed from: t */
    public void mo14990t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f21623m) {
            this.f21632i = pendingResult;
            if (this.f21631h) {
                pendingResult.finish();
                this.f21632i = null;
            }
        }
    }

    /* renamed from: u */
    public void mo14991u(String str) {
        mo14992v(str, (WorkerParameters.C1234a) null);
    }

    /* renamed from: v */
    public void mo14992v(String str, WorkerParameters.C1234a aVar) {
        this.f21627d.mo15823b(new C4178h(this, str, aVar));
    }

    /* renamed from: w */
    public void mo14993w(String str) {
        this.f21627d.mo15823b(new C4179i(this, str, true));
    }

    /* renamed from: x */
    public void mo14994x(String str) {
        this.f21627d.mo15823b(new C4179i(this, str, false));
    }
}
