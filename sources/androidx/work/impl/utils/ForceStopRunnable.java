package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.p009os.C0674a;
import androidx.work.C1235a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p089m0.C3642g;
import p089m0.C3646j;
import p089m0.C3662s;
import p096n0.C3753f;
import p096n0.C3755h;
import p096n0.C3756i;
import p110p0.C3886b;
import p141u0.C4103n;
import p141u0.C4108p;
import p141u0.C4111q;
import p147v0.C4175f;

public class ForceStopRunnable implements Runnable {

    /* renamed from: i */
    private static final String f3464i = C3646j.m25231f("ForceStopRunnable");

    /* renamed from: j */
    private static final long f3465j = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: f */
    private final Context f3466f;

    /* renamed from: g */
    private final C3756i f3467g;

    /* renamed from: h */
    private int f3468h = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        private static final String f3469a = C3646j.m25231f("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                C3646j.m25229c().mo14809g(f3469a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                ForceStopRunnable.m5117g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, C3756i iVar) {
        this.f3466f = context.getApplicationContext();
        this.f3467g = iVar;
    }

    /* renamed from: c */
    static Intent m5115c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* renamed from: d */
    private static PendingIntent m5116d(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, m5115c(context), i);
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: g */
    static void m5117g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d = m5116d(context, C0674a.m2809c() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f3465j;
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, d);
        } else {
            alarmManager.set(0, currentTimeMillis, d);
        }
    }

    /* renamed from: a */
    public boolean mo4566a() {
        boolean i = Build.VERSION.SDK_INT >= 23 ? C3886b.m25989i(this.f3466f, this.f3467g) : false;
        WorkDatabase o = this.f3467g.mo14986o();
        C4111q B = o.mo4514B();
        C4103n A = o.mo4513A();
        o.mo3951c();
        try {
            List<C4108p> c = B.mo15624c();
            boolean z = c != null && !c.isEmpty();
            if (z) {
                for (C4108p next : c) {
                    B.mo15638q(C3662s.ENQUEUED, next.f22314a);
                    B.mo15626e(next.f22314a, -1);
                }
            }
            A.mo15611c();
            o.mo3965r();
            return z || i;
        } finally {
            o.mo3955g();
        }
    }

    /* renamed from: b */
    public void mo4567b() {
        boolean a = mo4566a();
        if (mo4570h()) {
            C3646j.m25229c().mo14806a(f3464i, "Rescheduling Workers.", new Throwable[0]);
            this.f3467g.mo14989s();
            this.f3467g.mo14983l().mo15690c(false);
        } else if (mo4568e()) {
            C3646j.m25229c().mo14806a(f3464i, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f3467g.mo14989s();
        } else if (a) {
            C3646j.m25229c().mo14806a(f3464i, "Found unfinished work, scheduling it.", new Throwable[0]);
            C3753f.m25520b(this.f3467g.mo14982i(), this.f3467g.mo14986o(), this.f3467g.mo14985n());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: e */
    public boolean mo4568e() {
        int i = 536870912;
        try {
            if (C0674a.m2809c()) {
                i = 570425344;
            }
            PendingIntent d = m5116d(this.f3466f, i);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d != null) {
                    d.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f3466f.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i2 = 0; i2 < historicalProcessExitReasons.size(); i2++) {
                        if (((ApplicationExitInfo) historicalProcessExitReasons.get(i2)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (d == null) {
                m5117g(this.f3466f);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e) {
            C3646j.m25229c().mo14810h(f3464i, "Ignoring exception", e);
            return true;
        }
    }

    /* renamed from: f */
    public boolean mo4569f() {
        C1235a i = this.f3467g.mo14982i();
        if (TextUtils.isEmpty(i.mo4488c())) {
            C3646j.m25229c().mo14806a(f3464i, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b = C4175f.m26631b(this.f3466f, i);
        C3646j.m25229c().mo14806a(f3464i, String.format("Is default app process = %s", new Object[]{Boolean.valueOf(b)}), new Throwable[0]);
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo4570h() {
        return this.f3467g.mo14983l().mo15689a();
    }

    /* renamed from: i */
    public void mo4571i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    public void run() {
        try {
            if (!mo4569f()) {
                this.f3467g.mo14988r();
                return;
            }
            while (true) {
                C3755h.m25538e(this.f3466f);
                C3646j.m25229c().mo14806a(f3464i, "Performing cleanup operations.", new Throwable[0]);
                mo4567b();
                break;
            }
            this.f3467g.mo14988r();
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
            int i = this.f3468h + 1;
            this.f3468h = i;
            if (i >= 3) {
                C3646j c = C3646j.m25229c();
                String str = f3464i;
                c.mo14807b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                C3642g d = this.f3467g.mo14982i().mo4489d();
                if (d != null) {
                    C3646j.m25229c().mo14806a(str, "Routing exception to the specified exception handler", illegalStateException);
                    d.mo14803a(illegalStateException);
                } else {
                    throw illegalStateException;
                }
            } else {
                C3646j.m25229c().mo14806a(f3464i, String.format("Retrying after %s", new Object[]{Long.valueOf(((long) i) * 300)}), e);
                mo4571i(((long) this.f3468h) * 300);
            }
        } catch (Throwable th) {
            this.f3467g.mo14988r();
            throw th;
        }
    }
}
