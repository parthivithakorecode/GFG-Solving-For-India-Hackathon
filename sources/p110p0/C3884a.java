package p110p0;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.p009os.C0674a;
import androidx.work.impl.background.systemjob.SystemJobService;
import p089m0.C3634a;
import p089m0.C3635b;
import p089m0.C3637c;
import p089m0.C3646j;
import p089m0.C3648k;
import p141u0.C4108p;

/* renamed from: p0.a */
class C3884a {

    /* renamed from: b */
    private static final String f21964b = C3646j.m25231f("SystemJobInfoConverter");

    /* renamed from: a */
    private final ComponentName f21965a;

    /* renamed from: p0.a$a */
    static /* synthetic */ class C3885a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21966a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                m0.k[] r0 = p089m0.C3648k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21966a = r0
                m0.k r1 = p089m0.C3648k.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21966a     // Catch:{ NoSuchFieldError -> 0x001d }
                m0.k r1 = p089m0.C3648k.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21966a     // Catch:{ NoSuchFieldError -> 0x0028 }
                m0.k r1 = p089m0.C3648k.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f21966a     // Catch:{ NoSuchFieldError -> 0x0033 }
                m0.k r1 = p089m0.C3648k.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f21966a     // Catch:{ NoSuchFieldError -> 0x003e }
                m0.k r1 = p089m0.C3648k.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p110p0.C3884a.C3885a.<clinit>():void");
        }
    }

    C3884a(Context context) {
        this.f21965a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* renamed from: b */
    private static JobInfo.TriggerContentUri m25980b(C3637c.C3638a aVar) {
        return new JobInfo.TriggerContentUri(aVar.mo14792a(), aVar.mo14793b() ? 1 : 0);
    }

    /* renamed from: c */
    static int m25981c(C3648k kVar) {
        int i = C3885a.f21966a[kVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            if (i == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        C3646j.m25229c().mo14806a(f21964b, String.format("API version too low. Cannot convert network type value %s", new Object[]{kVar}), new Throwable[0]);
        return 1;
    }

    /* renamed from: d */
    static void m25982d(JobInfo.Builder builder, C3648k kVar) {
        if (Build.VERSION.SDK_INT < 30 || kVar != C3648k.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m25981c(kVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JobInfo mo15348a(C4108p pVar, int i) {
        C3635b bVar = pVar.f22323j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f22314a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.mo15616d());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f21965a).setRequiresCharging(bVar.mo14773g()).setRequiresDeviceIdle(bVar.mo14774h()).setExtras(persistableBundle);
        m25982d(extras, bVar.mo14767b());
        boolean z = false;
        if (!bVar.mo14774h()) {
            extras.setBackoffCriteria(pVar.f22326m, pVar.f22325l == C3634a.LINEAR ? 0 : 1);
        }
        long max = Math.max(pVar.mo15613a() - System.currentTimeMillis(), 0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 28 || max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f22330q) {
            extras.setImportantWhileForeground(true);
        }
        if (i2 >= 24 && bVar.mo14770e()) {
            for (C3637c.C3638a b : bVar.mo14766a().mo14788b()) {
                extras.addTriggerContentUri(m25980b(b));
            }
            extras.setTriggerContentUpdateDelay(bVar.mo14768c());
            extras.setTriggerContentMaxDelay(bVar.mo14769d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(bVar.mo14772f());
            extras.setRequiresStorageNotLow(bVar.mo14776i());
        }
        if (pVar.f22324k > 0) {
            z = true;
        }
        if (C0674a.m2809c() && pVar.f22330q && !z) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
