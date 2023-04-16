package p147v0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p053h0.C2666b;
import p141u0.C4089d;

/* renamed from: v0.c */
public class C4172c {

    /* renamed from: a */
    private final WorkDatabase f22387a;

    public C4172c(WorkDatabase workDatabase) {
        this.f22387a = workDatabase;
    }

    /* renamed from: a */
    public static void m26621a(Context context, C2666b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            bVar.mo12649f();
            try {
                bVar.mo12646A("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                bVar.mo12646A("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                bVar.mo12658y();
            } finally {
                bVar.mo12648e();
            }
        }
    }

    /* renamed from: c */
    private int m26622c(String str) {
        this.f22387a.mo3951c();
        try {
            Long a = this.f22387a.mo4517x().mo15596a(str);
            int i = 0;
            int intValue = a != null ? a.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            m26623e(str, i);
            this.f22387a.mo3965r();
            return intValue;
        } finally {
            this.f22387a.mo3955g();
        }
    }

    /* renamed from: e */
    private void m26623e(String str, int i) {
        this.f22387a.mo4517x().mo15597b(new C4089d(str, (long) i));
    }

    /* renamed from: b */
    public int mo15687b() {
        int c;
        synchronized (C4172c.class) {
            c = m26622c("next_alarm_manager_id");
        }
        return c;
    }

    /* renamed from: d */
    public int mo15688d(int i, int i2) {
        synchronized (C4172c.class) {
            int c = m26622c("next_job_scheduler_id");
            if (c >= i) {
                if (c <= i2) {
                    i = c;
                }
            }
            m26623e("next_job_scheduler_id", i + 1);
        }
        return i;
    }
}
