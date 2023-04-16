package androidx.work.impl;

import androidx.room.C1151a;
import androidx.room.C1159e;
import androidx.room.C1173h;
import androidx.room.C1178i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p039f0.C2594c;
import p039f0.C2597f;
import p053h0.C2666b;
import p053h0.C2667c;
import p141u0.C4086b;
import p141u0.C4087c;
import p141u0.C4090e;
import p141u0.C4091f;
import p141u0.C4094h;
import p141u0.C4095i;
import p141u0.C4099k;
import p141u0.C4100l;
import p141u0.C4103n;
import p141u0.C4104o;
import p141u0.C4111q;
import p141u0.C4112r;
import p141u0.C4123t;
import p141u0.C4124u;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m */
    private volatile C4111q f3366m;

    /* renamed from: n */
    private volatile C4086b f3367n;

    /* renamed from: o */
    private volatile C4123t f3368o;

    /* renamed from: p */
    private volatile C4094h f3369p;

    /* renamed from: q */
    private volatile C4099k f3370q;

    /* renamed from: r */
    private volatile C4103n f3371r;

    /* renamed from: s */
    private volatile C4090e f3372s;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    class C1243a extends C1178i.C1179a {
        C1243a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo3984a(C2666b bVar) {
            bVar.mo12651i("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo12651i("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            bVar.mo12651i("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            bVar.mo12651i("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            bVar.mo12651i("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            bVar.mo12651i("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            bVar.mo12651i("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo12651i("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            bVar.mo12651i("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo12651i("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo12651i("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            bVar.mo12651i("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.mo12651i("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            bVar.mo12651i("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.mo12651i("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        /* renamed from: b */
        public void mo3985b(C2666b bVar) {
            bVar.mo12651i("DROP TABLE IF EXISTS `Dependency`");
            bVar.mo12651i("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.mo12651i("DROP TABLE IF EXISTS `WorkTag`");
            bVar.mo12651i("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.mo12651i("DROP TABLE IF EXISTS `WorkName`");
            bVar.mo12651i("DROP TABLE IF EXISTS `WorkProgress`");
            bVar.mo12651i("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f3131h != null) {
                int size = WorkDatabase_Impl.this.f3131h.size();
                for (int i = 0; i < size; i++) {
                    ((C1173h.C1175b) WorkDatabase_Impl.this.f3131h.get(i)).mo3974b(bVar);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo3986c(C2666b bVar) {
            if (WorkDatabase_Impl.this.f3131h != null) {
                int size = WorkDatabase_Impl.this.f3131h.size();
                for (int i = 0; i < size; i++) {
                    ((C1173h.C1175b) WorkDatabase_Impl.this.f3131h.get(i)).mo3973a(bVar);
                }
            }
        }

        /* renamed from: d */
        public void mo3987d(C2666b bVar) {
            C2666b unused = WorkDatabase_Impl.this.f3124a = bVar;
            bVar.mo12651i("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.mo3961m(bVar);
            if (WorkDatabase_Impl.this.f3131h != null) {
                int size = WorkDatabase_Impl.this.f3131h.size();
                for (int i = 0; i < size; i++) {
                    ((C1173h.C1175b) WorkDatabase_Impl.this.f3131h.get(i)).mo3975c(bVar);
                }
            }
        }

        /* renamed from: e */
        public void mo3988e(C2666b bVar) {
        }

        /* renamed from: f */
        public void mo3989f(C2666b bVar) {
            C2594c.m21276a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C1178i.C1180b mo3990g(C2666b bVar) {
            C2666b bVar2 = bVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C2597f.C2598a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new C2597f.C2598a("prerequisite_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C2597f.C2599b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new C2597f.C2599b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C2597f.C2601d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            hashSet2.add(new C2597f.C2601d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"})));
            C2597f fVar = new C2597f("Dependency", hashMap, hashSet, hashSet2);
            C2597f a = C2597f.m21282a(bVar2, "Dependency");
            if (!fVar.equals(a)) {
                return new C1178i.C1180b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new C2597f.C2598a("id", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("state", new C2597f.C2598a("state", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new C2597f.C2598a("worker_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new C2597f.C2598a("input_merger_class_name", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("input", new C2597f.C2598a("input", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new C2597f.C2598a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new C2597f.C2598a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new C2597f.C2598a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new C2597f.C2598a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new C2597f.C2598a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new C2597f.C2598a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new C2597f.C2598a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_start_time", new C2597f.C2598a("period_start_time", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("minimum_retention_duration", new C2597f.C2598a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new C2597f.C2598a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new C2597f.C2598a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("out_of_quota_policy", new C2597f.C2598a("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("required_network_type", new C2597f.C2598a("required_network_type", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("requires_charging", new C2597f.C2598a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new C2597f.C2598a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new C2597f.C2598a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new C2597f.C2598a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new C2597f.C2598a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new C2597f.C2598a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new C2597f.C2598a("content_uri_triggers", "BLOB", false, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C2597f.C2601d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"})));
            hashSet4.add(new C2597f.C2601d("index_WorkSpec_period_start_time", false, Arrays.asList(new String[]{"period_start_time"})));
            C2597f fVar2 = new C2597f("WorkSpec", hashMap2, hashSet3, hashSet4);
            C2597f a2 = C2597f.m21282a(bVar2, "WorkSpec");
            if (!fVar2.equals(a2)) {
                return new C1178i.C1180b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C2597f.C2598a("tag", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new C2597f.C2598a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C2597f.C2599b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C2597f.C2601d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            C2597f fVar3 = new C2597f("WorkTag", hashMap3, hashSet5, hashSet6);
            C2597f a3 = C2597f.m21282a(bVar2, "WorkTag");
            if (!fVar3.equals(a3)) {
                return new C1178i.C1180b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new C2597f.C2598a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("system_id", new C2597f.C2598a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C2597f.C2599b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C2597f fVar4 = new C2597f("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C2597f a4 = C2597f.m21282a(bVar2, "SystemIdInfo");
            if (!fVar4.equals(a4)) {
                return new C1178i.C1180b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new C2597f.C2598a("name", "TEXT", true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new C2597f.C2598a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C2597f.C2599b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C2597f.C2601d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            C2597f fVar5 = new C2597f("WorkName", hashMap5, hashSet8, hashSet9);
            C2597f a5 = C2597f.m21282a(bVar2, "WorkName");
            if (!fVar5.equals(a5)) {
                return new C1178i.C1180b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C2597f.C2598a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("progress", new C2597f.C2598a("progress", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C2597f.C2599b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C2597f fVar6 = new C2597f("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C2597f a6 = C2597f.m21282a(bVar2, "WorkProgress");
            if (!fVar6.equals(a6)) {
                return new C1178i.C1180b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new C2597f.C2598a("key", "TEXT", true, 1, (String) null, 1));
            hashMap7.put("long_value", new C2597f.C2598a("long_value", "INTEGER", false, 0, (String) null, 1));
            C2597f fVar7 = new C2597f("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C2597f a7 = C2597f.m21282a(bVar2, "Preference");
            if (fVar7.equals(a7)) {
                return new C1178i.C1180b(true, (String) null);
            }
            return new C1178i.C1180b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar7 + "\n Found:\n" + a7);
        }
    }

    /* renamed from: A */
    public C4103n mo4513A() {
        C4103n nVar;
        if (this.f3371r != null) {
            return this.f3371r;
        }
        synchronized (this) {
            if (this.f3371r == null) {
                this.f3371r = new C4104o(this);
            }
            nVar = this.f3371r;
        }
        return nVar;
    }

    /* renamed from: B */
    public C4111q mo4514B() {
        C4111q qVar;
        if (this.f3366m != null) {
            return this.f3366m;
        }
        synchronized (this) {
            if (this.f3366m == null) {
                this.f3366m = new C4112r(this);
            }
            qVar = this.f3366m;
        }
        return qVar;
    }

    /* renamed from: C */
    public C4123t mo4515C() {
        C4123t tVar;
        if (this.f3368o != null) {
            return this.f3368o;
        }
        synchronized (this) {
            if (this.f3368o == null) {
                this.f3368o = new C4124u(this);
            }
            tVar = this.f3368o;
        }
        return tVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C1159e mo3953e() {
        return new C1159e(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C2667c mo3954f(C1151a aVar) {
        return aVar.f3060a.mo3996a(C2667c.C2669b.m21485a(aVar.f3061b).mo12662c(aVar.f3062c).mo12661b(new C1178i(aVar, new C1243a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).mo12660a());
    }

    /* renamed from: t */
    public C4086b mo4516t() {
        C4086b bVar;
        if (this.f3367n != null) {
            return this.f3367n;
        }
        synchronized (this) {
            if (this.f3367n == null) {
                this.f3367n = new C4087c(this);
            }
            bVar = this.f3367n;
        }
        return bVar;
    }

    /* renamed from: x */
    public C4090e mo4517x() {
        C4090e eVar;
        if (this.f3372s != null) {
            return this.f3372s;
        }
        synchronized (this) {
            if (this.f3372s == null) {
                this.f3372s = new C4091f(this);
            }
            eVar = this.f3372s;
        }
        return eVar;
    }

    /* renamed from: y */
    public C4094h mo4518y() {
        C4094h hVar;
        if (this.f3369p != null) {
            return this.f3369p;
        }
        synchronized (this) {
            if (this.f3369p == null) {
                this.f3369p = new C4095i(this);
            }
            hVar = this.f3369p;
        }
        return hVar;
    }

    /* renamed from: z */
    public C4099k mo4519z() {
        C4099k kVar;
        if (this.f3370q != null) {
            return this.f3370q;
        }
        synchronized (this) {
            if (this.f3370q == null) {
                this.f3370q = new C4100l(this);
            }
            kVar = this.f3370q;
        }
        return kVar;
    }
}
