package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import p032e0.C2537a;
import p053h0.C2666b;
import p147v0.C4172c;
import p147v0.C4174e;

/* renamed from: androidx.work.impl.a */
public class C1244a {

    /* renamed from: a */
    public static C2537a f3374a = new C1245a(1, 2);

    /* renamed from: b */
    public static C2537a f3375b = new C1246b(3, 4);

    /* renamed from: c */
    public static C2537a f3376c = new C1247c(4, 5);

    /* renamed from: d */
    public static C2537a f3377d = new C1248d(6, 7);

    /* renamed from: e */
    public static C2537a f3378e = new C1249e(7, 8);

    /* renamed from: f */
    public static C2537a f3379f = new C1250f(8, 9);

    /* renamed from: g */
    public static C2537a f3380g = new C1251g(11, 12);

    /* renamed from: androidx.work.impl.a$a */
    class C1245a extends C2537a {
        C1245a(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo4520a(C2666b bVar) {
            bVar.mo12651i("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo12651i("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.mo12651i("DROP TABLE IF EXISTS alarmInfo");
            bVar.mo12651i("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* renamed from: androidx.work.impl.a$b */
    class C1246b extends C2537a {
        C1246b(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo4520a(C2666b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                bVar.mo12651i("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* renamed from: androidx.work.impl.a$c */
    class C1247c extends C2537a {
        C1247c(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo4520a(C2666b bVar) {
            bVar.mo12651i("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.mo12651i("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* renamed from: androidx.work.impl.a$d */
    class C1248d extends C2537a {
        C1248d(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo4520a(C2666b bVar) {
            bVar.mo12651i("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* renamed from: androidx.work.impl.a$e */
    class C1249e extends C2537a {
        C1249e(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo4520a(C2666b bVar) {
            bVar.mo12651i("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* renamed from: androidx.work.impl.a$f */
    class C1250f extends C2537a {
        C1250f(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo4520a(C2666b bVar) {
            bVar.mo12651i("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$g */
    class C1251g extends C2537a {
        C1251g(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo4520a(C2666b bVar) {
            bVar.mo12651i("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$h */
    public static class C1252h extends C2537a {

        /* renamed from: c */
        final Context f3381c;

        public C1252h(Context context, int i, int i2) {
            super(i, i2);
            this.f3381c = context;
        }

        /* renamed from: a */
        public void mo4520a(C2666b bVar) {
            if (this.f18643b >= 10) {
                bVar.mo12646A("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                return;
            }
            this.f3381c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }

    /* renamed from: androidx.work.impl.a$i */
    public static class C1253i extends C2537a {

        /* renamed from: c */
        final Context f3382c;

        public C1253i(Context context) {
            super(9, 10);
            this.f3382c = context;
        }

        /* renamed from: a */
        public void mo4520a(C2666b bVar) {
            bVar.mo12651i("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            C4174e.m26627b(this.f3382c, bVar);
            C4172c.m26621a(this.f3382c, bVar);
        }
    }
}
