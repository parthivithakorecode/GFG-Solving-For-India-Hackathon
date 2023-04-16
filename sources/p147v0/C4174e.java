package p147v0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p053h0.C2666b;
import p141u0.C4089d;

/* renamed from: v0.e */
public class C4174e {

    /* renamed from: a */
    private final WorkDatabase f22389a;

    public C4174e(WorkDatabase workDatabase) {
        this.f22389a = workDatabase;
    }

    /* renamed from: b */
    public static void m26627b(Context context, C2666b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = 0;
            long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j = 1;
            }
            bVar.mo12649f();
            try {
                bVar.mo12646A("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                bVar.mo12646A("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                sharedPreferences.edit().clear().apply();
                bVar.mo12658y();
            } finally {
                bVar.mo12648e();
            }
        }
    }

    /* renamed from: a */
    public boolean mo15689a() {
        Long a = this.f22389a.mo4517x().mo15596a("reschedule_needed");
        return a != null && a.longValue() == 1;
    }

    /* renamed from: c */
    public void mo15690c(boolean z) {
        this.f22389a.mo4517x().mo15597b(new C4089d("reschedule_needed", z));
    }
}
