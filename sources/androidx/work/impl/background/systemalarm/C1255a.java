package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import p089m0.C3646j;
import p096n0.C3756i;
import p141u0.C4093g;
import p141u0.C4094h;
import p147v0.C4172c;

/* renamed from: androidx.work.impl.background.systemalarm.a */
class C1255a {

    /* renamed from: a */
    private static final String f3393a = C3646j.m25231f("Alarms");

    /* renamed from: a */
    public static void m5047a(Context context, C3756i iVar, String str) {
        C4094h y = iVar.mo14986o().mo4518y();
        C4093g b = y.mo15602b(str);
        if (b != null) {
            m5048b(context, str, b.f22292b);
            C3646j.m25229c().mo14806a(f3393a, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str}), new Throwable[0]);
            y.mo15604d(str);
        }
    }

    /* renamed from: b */
    private static void m5048b(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1256b.m5052c(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service != null && alarmManager != null) {
            C3646j.m25229c().mo14806a(f3393a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    /* renamed from: c */
    public static void m5049c(Context context, C3756i iVar, String str, long j) {
        int i;
        WorkDatabase o = iVar.mo14986o();
        C4094h y = o.mo4518y();
        C4093g b = y.mo15602b(str);
        if (b != null) {
            m5048b(context, str, b.f22292b);
            i = b.f22292b;
        } else {
            i = new C4172c(o).mo15687b();
            y.mo15603c(new C4093g(str, i));
        }
        m5050d(context, str, i, j);
    }

    /* renamed from: d */
    private static void m5050d(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = Build.VERSION.SDK_INT;
        PendingIntent service = PendingIntent.getService(context, i, C1256b.m5052c(context, str), i2 >= 23 ? 201326592 : 134217728);
        if (alarmManager == null) {
            return;
        }
        if (i2 >= 19) {
            alarmManager.setExact(0, j, service);
        } else {
            alarmManager.set(0, j, service);
        }
    }
}
