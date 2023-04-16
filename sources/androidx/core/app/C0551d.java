package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;

/* renamed from: androidx.core.app.d */
public final class C0551d {

    /* renamed from: androidx.core.app.d$a */
    static class C0552a {
        /* renamed from: a */
        static void m2202a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExact(i, j, pendingIntent);
        }
    }

    /* renamed from: androidx.core.app.d$b */
    static class C0553b {
        /* renamed from: a */
        static void m2203a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
        }

        /* renamed from: b */
        static void m2204b(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
        }
    }

    /* renamed from: a */
    public static void m2200a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 19) {
            C0552a.m2202a(alarmManager, i, j, pendingIntent);
        } else {
            alarmManager.set(i, j, pendingIntent);
        }
    }

    /* renamed from: b */
    public static void m2201b(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0553b.m2204b(alarmManager, i, j, pendingIntent);
        } else {
            m2200a(alarmManager, i, j, pendingIntent);
        }
    }
}
