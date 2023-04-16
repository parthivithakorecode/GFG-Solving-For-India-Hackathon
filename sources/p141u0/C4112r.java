package p141u0;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C1173h;
import androidx.work.C1239b;
import java.util.ArrayList;
import java.util.List;
import p025d0.C2465a;
import p025d0.C2467c;
import p025d0.C2468d;
import p039f0.C2593b;
import p039f0.C2594c;
import p039f0.C2596e;
import p053h0.C2674f;
import p089m0.C3635b;
import p089m0.C3662s;
import p141u0.C4108p;

/* renamed from: u0.r */
public final class C4112r implements C4111q {

    /* renamed from: a */
    private final C1173h f22334a;

    /* renamed from: b */
    private final C2465a<C4108p> f22335b;

    /* renamed from: c */
    private final C2468d f22336c;

    /* renamed from: d */
    private final C2468d f22337d;

    /* renamed from: e */
    private final C2468d f22338e;

    /* renamed from: f */
    private final C2468d f22339f;

    /* renamed from: g */
    private final C2468d f22340g;

    /* renamed from: h */
    private final C2468d f22341h;

    /* renamed from: i */
    private final C2468d f22342i;

    /* renamed from: j */
    private final C2468d f22343j;

    /* renamed from: u0.r$a */
    class C4113a extends C2465a<C4108p> {
        C4113a(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: i */
        public void mo12291g(C2674f fVar, C4108p pVar) {
            String str = pVar.f22314a;
            if (str == null) {
                fVar.mo12299p(1);
            } else {
                fVar.mo12297j(1, str);
            }
            fVar.mo12302x(2, (long) C4126v.m26569j(pVar.f22315b));
            String str2 = pVar.f22316c;
            if (str2 == null) {
                fVar.mo12299p(3);
            } else {
                fVar.mo12297j(3, str2);
            }
            String str3 = pVar.f22317d;
            if (str3 == null) {
                fVar.mo12299p(4);
            } else {
                fVar.mo12297j(4, str3);
            }
            byte[] k = C1239b.m4985k(pVar.f22318e);
            if (k == null) {
                fVar.mo12299p(5);
            } else {
                fVar.mo12293D(5, k);
            }
            byte[] k2 = C1239b.m4985k(pVar.f22319f);
            if (k2 == null) {
                fVar.mo12299p(6);
            } else {
                fVar.mo12293D(6, k2);
            }
            fVar.mo12302x(7, pVar.f22320g);
            fVar.mo12302x(8, pVar.f22321h);
            fVar.mo12302x(9, pVar.f22322i);
            fVar.mo12302x(10, (long) pVar.f22324k);
            fVar.mo12302x(11, (long) C4126v.m26560a(pVar.f22325l));
            fVar.mo12302x(12, pVar.f22326m);
            fVar.mo12302x(13, pVar.f22327n);
            fVar.mo12302x(14, pVar.f22328o);
            fVar.mo12302x(15, pVar.f22329p);
            fVar.mo12302x(16, pVar.f22330q ? 1 : 0);
            fVar.mo12302x(17, (long) C4126v.m26568i(pVar.f22331r));
            C3635b bVar = pVar.f22323j;
            if (bVar != null) {
                fVar.mo12302x(18, (long) C4126v.m26567h(bVar.mo14767b()));
                fVar.mo12302x(19, bVar.mo14773g() ? 1 : 0);
                fVar.mo12302x(20, bVar.mo14774h() ? 1 : 0);
                fVar.mo12302x(21, bVar.mo14772f() ? 1 : 0);
                fVar.mo12302x(22, bVar.mo14776i() ? 1 : 0);
                fVar.mo12302x(23, bVar.mo14768c());
                fVar.mo12302x(24, bVar.mo14769d());
                byte[] c = C4126v.m26562c(bVar.mo14766a());
                if (c != null) {
                    fVar.mo12293D(25, c);
                    return;
                }
            } else {
                fVar.mo12299p(18);
                fVar.mo12299p(19);
                fVar.mo12299p(20);
                fVar.mo12299p(21);
                fVar.mo12299p(22);
                fVar.mo12299p(23);
                fVar.mo12299p(24);
            }
            fVar.mo12299p(25);
        }
    }

    /* renamed from: u0.r$b */
    class C4114b extends C2468d {
        C4114b(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: u0.r$c */
    class C4115c extends C2468d {
        C4115c(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: u0.r$d */
    class C4116d extends C2468d {
        C4116d(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: u0.r$e */
    class C4117e extends C2468d {
        C4117e(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: u0.r$f */
    class C4118f extends C2468d {
        C4118f(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: u0.r$g */
    class C4119g extends C2468d {
        C4119g(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: u0.r$h */
    class C4120h extends C2468d {
        C4120h(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: u0.r$i */
    class C4121i extends C2468d {
        C4121i(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public C4112r(C1173h hVar) {
        this.f22334a = hVar;
        this.f22335b = new C4113a(hVar);
        this.f22336c = new C4114b(hVar);
        this.f22337d = new C4115c(hVar);
        this.f22338e = new C4116d(hVar);
        this.f22339f = new C4117e(hVar);
        this.f22340g = new C4118f(hVar);
        this.f22341h = new C4119g(hVar);
        this.f22342i = new C4120h(hVar);
        this.f22343j = new C4121i(hVar);
    }

    /* renamed from: a */
    public void mo15622a(String str) {
        this.f22334a.mo3950b();
        C2674f a = this.f22336c.mo12303a();
        if (str == null) {
            a.mo12299p(1);
        } else {
            a.mo12297j(1, str);
        }
        this.f22334a.mo3951c();
        try {
            a.mo12665k();
            this.f22334a.mo3965r();
        } finally {
            this.f22334a.mo3955g();
            this.f22336c.mo12306f(a);
        }
    }

    /* renamed from: b */
    public void mo15623b(C4108p pVar) {
        this.f22334a.mo3950b();
        this.f22334a.mo3951c();
        try {
            this.f22335b.mo12292h(pVar);
            this.f22334a.mo3965r();
        } finally {
            this.f22334a.mo3955g();
        }
    }

    /* renamed from: c */
    public List<C4108p> mo15624c() {
        C2467c cVar;
        C2467c m = C2467c.m20905m("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f22334a.mo3950b();
        Cursor b = C2594c.m21277b(this.f22334a, m, false, (CancellationSignal) null);
        try {
            int b2 = C2593b.m21275b(b, "required_network_type");
            int b3 = C2593b.m21275b(b, "requires_charging");
            int b4 = C2593b.m21275b(b, "requires_device_idle");
            int b5 = C2593b.m21275b(b, "requires_battery_not_low");
            int b6 = C2593b.m21275b(b, "requires_storage_not_low");
            int b7 = C2593b.m21275b(b, "trigger_content_update_delay");
            int b8 = C2593b.m21275b(b, "trigger_max_content_delay");
            int b9 = C2593b.m21275b(b, "content_uri_triggers");
            int b10 = C2593b.m21275b(b, "id");
            int b11 = C2593b.m21275b(b, "state");
            int b12 = C2593b.m21275b(b, "worker_class_name");
            int b13 = C2593b.m21275b(b, "input_merger_class_name");
            int b14 = C2593b.m21275b(b, "input");
            int b15 = C2593b.m21275b(b, "output");
            cVar = m;
            try {
                int b16 = C2593b.m21275b(b, "initial_delay");
                int b17 = C2593b.m21275b(b, "interval_duration");
                int b18 = C2593b.m21275b(b, "flex_duration");
                int b19 = C2593b.m21275b(b, "run_attempt_count");
                int b20 = C2593b.m21275b(b, "backoff_policy");
                int b21 = C2593b.m21275b(b, "backoff_delay_duration");
                int b22 = C2593b.m21275b(b, "period_start_time");
                int b23 = C2593b.m21275b(b, "minimum_retention_duration");
                int b24 = C2593b.m21275b(b, "schedule_requested_at");
                int b25 = C2593b.m21275b(b, "run_in_foreground");
                int b26 = C2593b.m21275b(b, "out_of_quota_policy");
                int i = b15;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(b10);
                    int i2 = b10;
                    String string2 = b.getString(b12);
                    int i3 = b12;
                    C3635b bVar = new C3635b();
                    int i4 = b2;
                    bVar.mo14778k(C4126v.m26564e(b.getInt(b2)));
                    bVar.mo14780m(b.getInt(b3) != 0);
                    bVar.mo14781n(b.getInt(b4) != 0);
                    bVar.mo14779l(b.getInt(b5) != 0);
                    bVar.mo14782o(b.getInt(b6) != 0);
                    int i5 = b3;
                    int i6 = b4;
                    bVar.mo14783p(b.getLong(b7));
                    bVar.mo14784q(b.getLong(b8));
                    bVar.mo14777j(C4126v.m26561b(b.getBlob(b9)));
                    C4108p pVar = new C4108p(string, string2);
                    pVar.f22315b = C4126v.m26566g(b.getInt(b11));
                    pVar.f22317d = b.getString(b13);
                    pVar.f22318e = C1239b.m4984g(b.getBlob(b14));
                    int i7 = i;
                    pVar.f22319f = C1239b.m4984g(b.getBlob(i7));
                    int i8 = i5;
                    i = i7;
                    int i9 = b16;
                    pVar.f22320g = b.getLong(i9);
                    int i10 = b14;
                    int i11 = b17;
                    pVar.f22321h = b.getLong(i11);
                    int i12 = i9;
                    int i13 = b5;
                    int i14 = b18;
                    pVar.f22322i = b.getLong(i14);
                    int i15 = b19;
                    pVar.f22324k = b.getInt(i15);
                    int i16 = b20;
                    int i17 = i11;
                    pVar.f22325l = C4126v.m26563d(b.getInt(i16));
                    b18 = i14;
                    int i18 = i13;
                    int i19 = b21;
                    pVar.f22326m = b.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = b22;
                    pVar.f22327n = b.getLong(i22);
                    int i23 = i19;
                    b22 = i22;
                    int i24 = b23;
                    pVar.f22328o = b.getLong(i24);
                    int i25 = i20;
                    int i26 = b24;
                    pVar.f22329p = b.getLong(i26);
                    int i27 = b25;
                    pVar.f22330q = b.getInt(i27) != 0;
                    int i28 = b26;
                    int i29 = i26;
                    pVar.f22331r = C4126v.m26565f(b.getInt(i28));
                    pVar.f22323j = bVar;
                    arrayList.add(pVar);
                    b26 = i28;
                    b3 = i8;
                    b14 = i10;
                    b16 = i12;
                    b17 = i17;
                    b19 = i25;
                    b24 = i29;
                    b10 = i2;
                    b12 = i3;
                    b2 = i4;
                    b25 = i27;
                    b23 = i24;
                    b4 = i6;
                    int i30 = i21;
                    b21 = i23;
                    b5 = i18;
                    b20 = i30;
                }
                b.close();
                cVar.mo12301v();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b.close();
                cVar.mo12301v();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = m;
            b.close();
            cVar.mo12301v();
            throw th;
        }
    }

    /* renamed from: d */
    public boolean mo15625d() {
        boolean z = false;
        C2467c m = C2467c.m20905m("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f22334a.mo3950b();
        Cursor b = C2594c.m21277b(this.f22334a, m, false, (CancellationSignal) null);
        try {
            if (b.moveToFirst() && b.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            b.close();
            m.mo12301v();
        }
    }

    /* renamed from: e */
    public int mo15626e(String str, long j) {
        this.f22334a.mo3950b();
        C2674f a = this.f22341h.mo12303a();
        a.mo12302x(1, j);
        if (str == null) {
            a.mo12299p(2);
        } else {
            a.mo12297j(2, str);
        }
        this.f22334a.mo3951c();
        try {
            int k = a.mo12665k();
            this.f22334a.mo3965r();
            return k;
        } finally {
            this.f22334a.mo3955g();
            this.f22341h.mo12306f(a);
        }
    }

    /* renamed from: f */
    public List<String> mo15627f(String str) {
        C2467c m = C2467c.m20905m("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m.mo12299p(1);
        } else {
            m.mo12297j(1, str);
        }
        this.f22334a.mo3950b();
        Cursor b = C2594c.m21277b(this.f22334a, m, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(b.getString(0));
            }
            return arrayList;
        } finally {
            b.close();
            m.mo12301v();
        }
    }

    /* renamed from: g */
    public List<C4108p.C4110b> mo15628g(String str) {
        C2467c m = C2467c.m20905m("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            m.mo12299p(1);
        } else {
            m.mo12297j(1, str);
        }
        this.f22334a.mo3950b();
        Cursor b = C2594c.m21277b(this.f22334a, m, false, (CancellationSignal) null);
        try {
            int b2 = C2593b.m21275b(b, "id");
            int b3 = C2593b.m21275b(b, "state");
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                C4108p.C4110b bVar = new C4108p.C4110b();
                bVar.f22332a = b.getString(b2);
                bVar.f22333b = C4126v.m26566g(b.getInt(b3));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b.close();
            m.mo12301v();
        }
    }

    /* renamed from: h */
    public List<C4108p> mo15629h(long j) {
        C2467c cVar;
        C2467c m = C2467c.m20905m("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        m.mo12302x(1, j);
        this.f22334a.mo3950b();
        Cursor b = C2594c.m21277b(this.f22334a, m, false, (CancellationSignal) null);
        try {
            int b2 = C2593b.m21275b(b, "required_network_type");
            int b3 = C2593b.m21275b(b, "requires_charging");
            int b4 = C2593b.m21275b(b, "requires_device_idle");
            int b5 = C2593b.m21275b(b, "requires_battery_not_low");
            int b6 = C2593b.m21275b(b, "requires_storage_not_low");
            int b7 = C2593b.m21275b(b, "trigger_content_update_delay");
            int b8 = C2593b.m21275b(b, "trigger_max_content_delay");
            int b9 = C2593b.m21275b(b, "content_uri_triggers");
            int b10 = C2593b.m21275b(b, "id");
            int b11 = C2593b.m21275b(b, "state");
            int b12 = C2593b.m21275b(b, "worker_class_name");
            int b13 = C2593b.m21275b(b, "input_merger_class_name");
            int b14 = C2593b.m21275b(b, "input");
            int b15 = C2593b.m21275b(b, "output");
            cVar = m;
            try {
                int b16 = C2593b.m21275b(b, "initial_delay");
                int b17 = C2593b.m21275b(b, "interval_duration");
                int b18 = C2593b.m21275b(b, "flex_duration");
                int b19 = C2593b.m21275b(b, "run_attempt_count");
                int b20 = C2593b.m21275b(b, "backoff_policy");
                int b21 = C2593b.m21275b(b, "backoff_delay_duration");
                int b22 = C2593b.m21275b(b, "period_start_time");
                int b23 = C2593b.m21275b(b, "minimum_retention_duration");
                int b24 = C2593b.m21275b(b, "schedule_requested_at");
                int b25 = C2593b.m21275b(b, "run_in_foreground");
                int b26 = C2593b.m21275b(b, "out_of_quota_policy");
                int i = b15;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(b10);
                    int i2 = b10;
                    String string2 = b.getString(b12);
                    int i3 = b12;
                    C3635b bVar = new C3635b();
                    int i4 = b2;
                    bVar.mo14778k(C4126v.m26564e(b.getInt(b2)));
                    bVar.mo14780m(b.getInt(b3) != 0);
                    bVar.mo14781n(b.getInt(b4) != 0);
                    bVar.mo14779l(b.getInt(b5) != 0);
                    bVar.mo14782o(b.getInt(b6) != 0);
                    int i5 = b3;
                    int i6 = b4;
                    bVar.mo14783p(b.getLong(b7));
                    bVar.mo14784q(b.getLong(b8));
                    bVar.mo14777j(C4126v.m26561b(b.getBlob(b9)));
                    C4108p pVar = new C4108p(string, string2);
                    pVar.f22315b = C4126v.m26566g(b.getInt(b11));
                    pVar.f22317d = b.getString(b13);
                    pVar.f22318e = C1239b.m4984g(b.getBlob(b14));
                    int i7 = i;
                    pVar.f22319f = C1239b.m4984g(b.getBlob(i7));
                    int i8 = b16;
                    int i9 = i5;
                    i = i7;
                    pVar.f22320g = b.getLong(i8);
                    int i10 = b13;
                    int i11 = b17;
                    pVar.f22321h = b.getLong(i11);
                    int i12 = i8;
                    int i13 = b5;
                    int i14 = b18;
                    pVar.f22322i = b.getLong(i14);
                    int i15 = b19;
                    pVar.f22324k = b.getInt(i15);
                    int i16 = b20;
                    int i17 = i11;
                    pVar.f22325l = C4126v.m26563d(b.getInt(i16));
                    b18 = i14;
                    int i18 = i13;
                    int i19 = b21;
                    pVar.f22326m = b.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = b22;
                    pVar.f22327n = b.getLong(i22);
                    int i23 = i19;
                    b22 = i22;
                    int i24 = b23;
                    pVar.f22328o = b.getLong(i24);
                    int i25 = i20;
                    int i26 = b24;
                    pVar.f22329p = b.getLong(i26);
                    int i27 = b25;
                    pVar.f22330q = b.getInt(i27) != 0;
                    int i28 = b26;
                    int i29 = i26;
                    pVar.f22331r = C4126v.m26565f(b.getInt(i28));
                    pVar.f22323j = bVar;
                    arrayList.add(pVar);
                    b3 = i9;
                    b26 = i28;
                    b13 = i10;
                    b16 = i12;
                    b17 = i17;
                    b19 = i25;
                    b24 = i29;
                    b10 = i2;
                    b12 = i3;
                    b2 = i4;
                    b25 = i27;
                    b23 = i24;
                    b4 = i6;
                    int i30 = i21;
                    b21 = i23;
                    b5 = i18;
                    b20 = i30;
                }
                b.close();
                cVar.mo12301v();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b.close();
                cVar.mo12301v();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = m;
            b.close();
            cVar.mo12301v();
            throw th;
        }
    }

    /* renamed from: i */
    public C3662s mo15630i(String str) {
        C2467c m = C2467c.m20905m("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            m.mo12299p(1);
        } else {
            m.mo12297j(1, str);
        }
        this.f22334a.mo3950b();
        C3662s sVar = null;
        Cursor b = C2594c.m21277b(this.f22334a, m, false, (CancellationSignal) null);
        try {
            if (b.moveToFirst()) {
                sVar = C4126v.m26566g(b.getInt(0));
            }
            return sVar;
        } finally {
            b.close();
            m.mo12301v();
        }
    }

    /* renamed from: j */
    public List<C4108p> mo15631j(int i) {
        C2467c cVar;
        C2467c m = C2467c.m20905m("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        m.mo12302x(1, (long) i);
        this.f22334a.mo3950b();
        Cursor b = C2594c.m21277b(this.f22334a, m, false, (CancellationSignal) null);
        try {
            int b2 = C2593b.m21275b(b, "required_network_type");
            int b3 = C2593b.m21275b(b, "requires_charging");
            int b4 = C2593b.m21275b(b, "requires_device_idle");
            int b5 = C2593b.m21275b(b, "requires_battery_not_low");
            int b6 = C2593b.m21275b(b, "requires_storage_not_low");
            int b7 = C2593b.m21275b(b, "trigger_content_update_delay");
            int b8 = C2593b.m21275b(b, "trigger_max_content_delay");
            int b9 = C2593b.m21275b(b, "content_uri_triggers");
            int b10 = C2593b.m21275b(b, "id");
            int b11 = C2593b.m21275b(b, "state");
            int b12 = C2593b.m21275b(b, "worker_class_name");
            int b13 = C2593b.m21275b(b, "input_merger_class_name");
            int b14 = C2593b.m21275b(b, "input");
            int b15 = C2593b.m21275b(b, "output");
            cVar = m;
            try {
                int b16 = C2593b.m21275b(b, "initial_delay");
                int b17 = C2593b.m21275b(b, "interval_duration");
                int b18 = C2593b.m21275b(b, "flex_duration");
                int b19 = C2593b.m21275b(b, "run_attempt_count");
                int b20 = C2593b.m21275b(b, "backoff_policy");
                int b21 = C2593b.m21275b(b, "backoff_delay_duration");
                int b22 = C2593b.m21275b(b, "period_start_time");
                int b23 = C2593b.m21275b(b, "minimum_retention_duration");
                int b24 = C2593b.m21275b(b, "schedule_requested_at");
                int b25 = C2593b.m21275b(b, "run_in_foreground");
                int b26 = C2593b.m21275b(b, "out_of_quota_policy");
                int i2 = b15;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(b10);
                    int i3 = b10;
                    String string2 = b.getString(b12);
                    int i4 = b12;
                    C3635b bVar = new C3635b();
                    int i5 = b2;
                    bVar.mo14778k(C4126v.m26564e(b.getInt(b2)));
                    bVar.mo14780m(b.getInt(b3) != 0);
                    bVar.mo14781n(b.getInt(b4) != 0);
                    bVar.mo14779l(b.getInt(b5) != 0);
                    bVar.mo14782o(b.getInt(b6) != 0);
                    int i6 = b3;
                    int i7 = b4;
                    bVar.mo14783p(b.getLong(b7));
                    bVar.mo14784q(b.getLong(b8));
                    bVar.mo14777j(C4126v.m26561b(b.getBlob(b9)));
                    C4108p pVar = new C4108p(string, string2);
                    pVar.f22315b = C4126v.m26566g(b.getInt(b11));
                    pVar.f22317d = b.getString(b13);
                    pVar.f22318e = C1239b.m4984g(b.getBlob(b14));
                    int i8 = i2;
                    pVar.f22319f = C1239b.m4984g(b.getBlob(i8));
                    int i9 = i6;
                    i2 = i8;
                    int i10 = b16;
                    pVar.f22320g = b.getLong(i10);
                    int i11 = b13;
                    int i12 = b17;
                    pVar.f22321h = b.getLong(i12);
                    int i13 = i10;
                    int i14 = b5;
                    int i15 = b18;
                    pVar.f22322i = b.getLong(i15);
                    int i16 = b19;
                    pVar.f22324k = b.getInt(i16);
                    int i17 = b20;
                    int i18 = i12;
                    pVar.f22325l = C4126v.m26563d(b.getInt(i17));
                    b18 = i15;
                    int i19 = i14;
                    int i20 = b21;
                    pVar.f22326m = b.getLong(i20);
                    int i21 = i16;
                    int i22 = i17;
                    int i23 = b22;
                    pVar.f22327n = b.getLong(i23);
                    int i24 = i20;
                    b22 = i23;
                    int i25 = b23;
                    pVar.f22328o = b.getLong(i25);
                    int i26 = i21;
                    int i27 = b24;
                    pVar.f22329p = b.getLong(i27);
                    int i28 = b25;
                    pVar.f22330q = b.getInt(i28) != 0;
                    int i29 = b26;
                    int i30 = i27;
                    pVar.f22331r = C4126v.m26565f(b.getInt(i29));
                    pVar.f22323j = bVar;
                    arrayList.add(pVar);
                    b26 = i29;
                    b3 = i9;
                    b13 = i11;
                    b16 = i13;
                    b17 = i18;
                    b19 = i26;
                    b24 = i30;
                    b10 = i3;
                    b12 = i4;
                    b2 = i5;
                    b25 = i28;
                    b23 = i25;
                    b4 = i7;
                    int i31 = i22;
                    b21 = i24;
                    b5 = i19;
                    b20 = i31;
                }
                b.close();
                cVar.mo12301v();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b.close();
                cVar.mo12301v();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = m;
            b.close();
            cVar.mo12301v();
            throw th;
        }
    }

    /* renamed from: k */
    public C4108p mo15632k(String str) {
        C2467c cVar;
        C4108p pVar;
        String str2 = str;
        C2467c m = C2467c.m20905m("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            m.mo12299p(1);
        } else {
            m.mo12297j(1, str2);
        }
        this.f22334a.mo3950b();
        Cursor b = C2594c.m21277b(this.f22334a, m, false, (CancellationSignal) null);
        try {
            int b2 = C2593b.m21275b(b, "required_network_type");
            int b3 = C2593b.m21275b(b, "requires_charging");
            int b4 = C2593b.m21275b(b, "requires_device_idle");
            int b5 = C2593b.m21275b(b, "requires_battery_not_low");
            int b6 = C2593b.m21275b(b, "requires_storage_not_low");
            int b7 = C2593b.m21275b(b, "trigger_content_update_delay");
            int b8 = C2593b.m21275b(b, "trigger_max_content_delay");
            int b9 = C2593b.m21275b(b, "content_uri_triggers");
            int b10 = C2593b.m21275b(b, "id");
            int b11 = C2593b.m21275b(b, "state");
            int b12 = C2593b.m21275b(b, "worker_class_name");
            int b13 = C2593b.m21275b(b, "input_merger_class_name");
            int b14 = C2593b.m21275b(b, "input");
            int b15 = C2593b.m21275b(b, "output");
            cVar = m;
            try {
                int b16 = C2593b.m21275b(b, "initial_delay");
                int b17 = C2593b.m21275b(b, "interval_duration");
                int b18 = C2593b.m21275b(b, "flex_duration");
                int b19 = C2593b.m21275b(b, "run_attempt_count");
                int b20 = C2593b.m21275b(b, "backoff_policy");
                int b21 = C2593b.m21275b(b, "backoff_delay_duration");
                int b22 = C2593b.m21275b(b, "period_start_time");
                int b23 = C2593b.m21275b(b, "minimum_retention_duration");
                int b24 = C2593b.m21275b(b, "schedule_requested_at");
                int b25 = C2593b.m21275b(b, "run_in_foreground");
                int b26 = C2593b.m21275b(b, "out_of_quota_policy");
                if (b.moveToFirst()) {
                    String string = b.getString(b10);
                    String string2 = b.getString(b12);
                    int i = b26;
                    C3635b bVar = new C3635b();
                    bVar.mo14778k(C4126v.m26564e(b.getInt(b2)));
                    bVar.mo14780m(b.getInt(b3) != 0);
                    bVar.mo14781n(b.getInt(b4) != 0);
                    bVar.mo14779l(b.getInt(b5) != 0);
                    bVar.mo14782o(b.getInt(b6) != 0);
                    bVar.mo14783p(b.getLong(b7));
                    bVar.mo14784q(b.getLong(b8));
                    bVar.mo14777j(C4126v.m26561b(b.getBlob(b9)));
                    C4108p pVar2 = new C4108p(string, string2);
                    pVar2.f22315b = C4126v.m26566g(b.getInt(b11));
                    pVar2.f22317d = b.getString(b13);
                    pVar2.f22318e = C1239b.m4984g(b.getBlob(b14));
                    pVar2.f22319f = C1239b.m4984g(b.getBlob(b15));
                    pVar2.f22320g = b.getLong(b16);
                    pVar2.f22321h = b.getLong(b17);
                    pVar2.f22322i = b.getLong(b18);
                    pVar2.f22324k = b.getInt(b19);
                    pVar2.f22325l = C4126v.m26563d(b.getInt(b20));
                    pVar2.f22326m = b.getLong(b21);
                    pVar2.f22327n = b.getLong(b22);
                    pVar2.f22328o = b.getLong(b23);
                    pVar2.f22329p = b.getLong(b24);
                    pVar2.f22330q = b.getInt(b25) != 0;
                    pVar2.f22331r = C4126v.m26565f(b.getInt(i));
                    pVar2.f22323j = bVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                b.close();
                cVar.mo12301v();
                return pVar;
            } catch (Throwable th) {
                th = th;
                b.close();
                cVar.mo12301v();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = m;
            b.close();
            cVar.mo12301v();
            throw th;
        }
    }

    /* renamed from: l */
    public int mo15633l(String str) {
        this.f22334a.mo3950b();
        C2674f a = this.f22340g.mo12303a();
        if (str == null) {
            a.mo12299p(1);
        } else {
            a.mo12297j(1, str);
        }
        this.f22334a.mo3951c();
        try {
            int k = a.mo12665k();
            this.f22334a.mo3965r();
            return k;
        } finally {
            this.f22334a.mo3955g();
            this.f22340g.mo12306f(a);
        }
    }

    /* renamed from: m */
    public List<String> mo15634m(String str) {
        C2467c m = C2467c.m20905m("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            m.mo12299p(1);
        } else {
            m.mo12297j(1, str);
        }
        this.f22334a.mo3950b();
        Cursor b = C2594c.m21277b(this.f22334a, m, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(b.getString(0));
            }
            return arrayList;
        } finally {
            b.close();
            m.mo12301v();
        }
    }

    /* renamed from: n */
    public List<C1239b> mo15635n(String str) {
        C2467c m = C2467c.m20905m("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            m.mo12299p(1);
        } else {
            m.mo12297j(1, str);
        }
        this.f22334a.mo3950b();
        Cursor b = C2594c.m21277b(this.f22334a, m, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(C1239b.m4984g(b.getBlob(0)));
            }
            return arrayList;
        } finally {
            b.close();
            m.mo12301v();
        }
    }

    /* renamed from: o */
    public int mo15636o(String str) {
        this.f22334a.mo3950b();
        C2674f a = this.f22339f.mo12303a();
        if (str == null) {
            a.mo12299p(1);
        } else {
            a.mo12297j(1, str);
        }
        this.f22334a.mo3951c();
        try {
            int k = a.mo12665k();
            this.f22334a.mo3965r();
            return k;
        } finally {
            this.f22334a.mo3955g();
            this.f22339f.mo12306f(a);
        }
    }

    /* renamed from: p */
    public void mo15637p(String str, long j) {
        this.f22334a.mo3950b();
        C2674f a = this.f22338e.mo12303a();
        a.mo12302x(1, j);
        if (str == null) {
            a.mo12299p(2);
        } else {
            a.mo12297j(2, str);
        }
        this.f22334a.mo3951c();
        try {
            a.mo12665k();
            this.f22334a.mo3965r();
        } finally {
            this.f22334a.mo3955g();
            this.f22338e.mo12306f(a);
        }
    }

    /* renamed from: q */
    public int mo15638q(C3662s sVar, String... strArr) {
        this.f22334a.mo3950b();
        StringBuilder b = C2596e.m21281b();
        b.append("UPDATE workspec SET state=");
        b.append("?");
        b.append(" WHERE id IN (");
        C2596e.m21280a(b, strArr.length);
        b.append(")");
        C2674f d = this.f22334a.mo3952d(b.toString());
        d.mo12302x(1, (long) C4126v.m26569j(sVar));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                d.mo12299p(i);
            } else {
                d.mo12297j(i, str);
            }
            i++;
        }
        this.f22334a.mo3951c();
        try {
            int k = d.mo12665k();
            this.f22334a.mo3965r();
            return k;
        } finally {
            this.f22334a.mo3955g();
        }
    }

    /* renamed from: r */
    public List<C4108p> mo15639r() {
        C2467c cVar;
        C2467c m = C2467c.m20905m("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f22334a.mo3950b();
        Cursor b = C2594c.m21277b(this.f22334a, m, false, (CancellationSignal) null);
        try {
            int b2 = C2593b.m21275b(b, "required_network_type");
            int b3 = C2593b.m21275b(b, "requires_charging");
            int b4 = C2593b.m21275b(b, "requires_device_idle");
            int b5 = C2593b.m21275b(b, "requires_battery_not_low");
            int b6 = C2593b.m21275b(b, "requires_storage_not_low");
            int b7 = C2593b.m21275b(b, "trigger_content_update_delay");
            int b8 = C2593b.m21275b(b, "trigger_max_content_delay");
            int b9 = C2593b.m21275b(b, "content_uri_triggers");
            int b10 = C2593b.m21275b(b, "id");
            int b11 = C2593b.m21275b(b, "state");
            int b12 = C2593b.m21275b(b, "worker_class_name");
            int b13 = C2593b.m21275b(b, "input_merger_class_name");
            int b14 = C2593b.m21275b(b, "input");
            int b15 = C2593b.m21275b(b, "output");
            cVar = m;
            try {
                int b16 = C2593b.m21275b(b, "initial_delay");
                int b17 = C2593b.m21275b(b, "interval_duration");
                int b18 = C2593b.m21275b(b, "flex_duration");
                int b19 = C2593b.m21275b(b, "run_attempt_count");
                int b20 = C2593b.m21275b(b, "backoff_policy");
                int b21 = C2593b.m21275b(b, "backoff_delay_duration");
                int b22 = C2593b.m21275b(b, "period_start_time");
                int b23 = C2593b.m21275b(b, "minimum_retention_duration");
                int b24 = C2593b.m21275b(b, "schedule_requested_at");
                int b25 = C2593b.m21275b(b, "run_in_foreground");
                int b26 = C2593b.m21275b(b, "out_of_quota_policy");
                int i = b15;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(b10);
                    int i2 = b10;
                    String string2 = b.getString(b12);
                    int i3 = b12;
                    C3635b bVar = new C3635b();
                    int i4 = b2;
                    bVar.mo14778k(C4126v.m26564e(b.getInt(b2)));
                    bVar.mo14780m(b.getInt(b3) != 0);
                    bVar.mo14781n(b.getInt(b4) != 0);
                    bVar.mo14779l(b.getInt(b5) != 0);
                    bVar.mo14782o(b.getInt(b6) != 0);
                    int i5 = b3;
                    int i6 = b4;
                    bVar.mo14783p(b.getLong(b7));
                    bVar.mo14784q(b.getLong(b8));
                    bVar.mo14777j(C4126v.m26561b(b.getBlob(b9)));
                    C4108p pVar = new C4108p(string, string2);
                    pVar.f22315b = C4126v.m26566g(b.getInt(b11));
                    pVar.f22317d = b.getString(b13);
                    pVar.f22318e = C1239b.m4984g(b.getBlob(b14));
                    int i7 = i;
                    pVar.f22319f = C1239b.m4984g(b.getBlob(i7));
                    int i8 = i5;
                    i = i7;
                    int i9 = b16;
                    pVar.f22320g = b.getLong(i9);
                    int i10 = b14;
                    int i11 = b17;
                    pVar.f22321h = b.getLong(i11);
                    int i12 = i9;
                    int i13 = b5;
                    int i14 = b18;
                    pVar.f22322i = b.getLong(i14);
                    int i15 = b19;
                    pVar.f22324k = b.getInt(i15);
                    int i16 = b20;
                    int i17 = i11;
                    pVar.f22325l = C4126v.m26563d(b.getInt(i16));
                    b18 = i14;
                    int i18 = i13;
                    int i19 = b21;
                    pVar.f22326m = b.getLong(i19);
                    int i20 = i15;
                    int i21 = i16;
                    int i22 = b22;
                    pVar.f22327n = b.getLong(i22);
                    int i23 = i19;
                    b22 = i22;
                    int i24 = b23;
                    pVar.f22328o = b.getLong(i24);
                    int i25 = i20;
                    int i26 = b24;
                    pVar.f22329p = b.getLong(i26);
                    int i27 = b25;
                    pVar.f22330q = b.getInt(i27) != 0;
                    int i28 = b26;
                    int i29 = i26;
                    pVar.f22331r = C4126v.m26565f(b.getInt(i28));
                    pVar.f22323j = bVar;
                    arrayList.add(pVar);
                    b26 = i28;
                    b3 = i8;
                    b14 = i10;
                    b16 = i12;
                    b17 = i17;
                    b19 = i25;
                    b24 = i29;
                    b10 = i2;
                    b12 = i3;
                    b2 = i4;
                    b25 = i27;
                    b23 = i24;
                    b4 = i6;
                    int i30 = i21;
                    b21 = i23;
                    b5 = i18;
                    b20 = i30;
                }
                b.close();
                cVar.mo12301v();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b.close();
                cVar.mo12301v();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = m;
            b.close();
            cVar.mo12301v();
            throw th;
        }
    }

    /* renamed from: s */
    public List<C4108p> mo15640s(int i) {
        C2467c cVar;
        C2467c m = C2467c.m20905m("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        m.mo12302x(1, (long) i);
        this.f22334a.mo3950b();
        Cursor b = C2594c.m21277b(this.f22334a, m, false, (CancellationSignal) null);
        try {
            int b2 = C2593b.m21275b(b, "required_network_type");
            int b3 = C2593b.m21275b(b, "requires_charging");
            int b4 = C2593b.m21275b(b, "requires_device_idle");
            int b5 = C2593b.m21275b(b, "requires_battery_not_low");
            int b6 = C2593b.m21275b(b, "requires_storage_not_low");
            int b7 = C2593b.m21275b(b, "trigger_content_update_delay");
            int b8 = C2593b.m21275b(b, "trigger_max_content_delay");
            int b9 = C2593b.m21275b(b, "content_uri_triggers");
            int b10 = C2593b.m21275b(b, "id");
            int b11 = C2593b.m21275b(b, "state");
            int b12 = C2593b.m21275b(b, "worker_class_name");
            int b13 = C2593b.m21275b(b, "input_merger_class_name");
            int b14 = C2593b.m21275b(b, "input");
            int b15 = C2593b.m21275b(b, "output");
            cVar = m;
            try {
                int b16 = C2593b.m21275b(b, "initial_delay");
                int b17 = C2593b.m21275b(b, "interval_duration");
                int b18 = C2593b.m21275b(b, "flex_duration");
                int b19 = C2593b.m21275b(b, "run_attempt_count");
                int b20 = C2593b.m21275b(b, "backoff_policy");
                int b21 = C2593b.m21275b(b, "backoff_delay_duration");
                int b22 = C2593b.m21275b(b, "period_start_time");
                int b23 = C2593b.m21275b(b, "minimum_retention_duration");
                int b24 = C2593b.m21275b(b, "schedule_requested_at");
                int b25 = C2593b.m21275b(b, "run_in_foreground");
                int b26 = C2593b.m21275b(b, "out_of_quota_policy");
                int i2 = b15;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(b10);
                    int i3 = b10;
                    String string2 = b.getString(b12);
                    int i4 = b12;
                    C3635b bVar = new C3635b();
                    int i5 = b2;
                    bVar.mo14778k(C4126v.m26564e(b.getInt(b2)));
                    bVar.mo14780m(b.getInt(b3) != 0);
                    bVar.mo14781n(b.getInt(b4) != 0);
                    bVar.mo14779l(b.getInt(b5) != 0);
                    bVar.mo14782o(b.getInt(b6) != 0);
                    int i6 = b3;
                    int i7 = b4;
                    bVar.mo14783p(b.getLong(b7));
                    bVar.mo14784q(b.getLong(b8));
                    bVar.mo14777j(C4126v.m26561b(b.getBlob(b9)));
                    C4108p pVar = new C4108p(string, string2);
                    pVar.f22315b = C4126v.m26566g(b.getInt(b11));
                    pVar.f22317d = b.getString(b13);
                    pVar.f22318e = C1239b.m4984g(b.getBlob(b14));
                    int i8 = i2;
                    pVar.f22319f = C1239b.m4984g(b.getBlob(i8));
                    int i9 = i6;
                    i2 = i8;
                    int i10 = b16;
                    pVar.f22320g = b.getLong(i10);
                    int i11 = b13;
                    int i12 = b17;
                    pVar.f22321h = b.getLong(i12);
                    int i13 = i10;
                    int i14 = b5;
                    int i15 = b18;
                    pVar.f22322i = b.getLong(i15);
                    int i16 = b19;
                    pVar.f22324k = b.getInt(i16);
                    int i17 = b20;
                    int i18 = i12;
                    pVar.f22325l = C4126v.m26563d(b.getInt(i17));
                    b18 = i15;
                    int i19 = i14;
                    int i20 = b21;
                    pVar.f22326m = b.getLong(i20);
                    int i21 = i16;
                    int i22 = i17;
                    int i23 = b22;
                    pVar.f22327n = b.getLong(i23);
                    int i24 = i20;
                    b22 = i23;
                    int i25 = b23;
                    pVar.f22328o = b.getLong(i25);
                    int i26 = i21;
                    int i27 = b24;
                    pVar.f22329p = b.getLong(i27);
                    int i28 = b25;
                    pVar.f22330q = b.getInt(i28) != 0;
                    int i29 = b26;
                    int i30 = i27;
                    pVar.f22331r = C4126v.m26565f(b.getInt(i29));
                    pVar.f22323j = bVar;
                    arrayList.add(pVar);
                    b26 = i29;
                    b3 = i9;
                    b13 = i11;
                    b16 = i13;
                    b17 = i18;
                    b19 = i26;
                    b24 = i30;
                    b10 = i3;
                    b12 = i4;
                    b2 = i5;
                    b25 = i28;
                    b23 = i25;
                    b4 = i7;
                    int i31 = i22;
                    b21 = i24;
                    b5 = i19;
                    b20 = i31;
                }
                b.close();
                cVar.mo12301v();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b.close();
                cVar.mo12301v();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = m;
            b.close();
            cVar.mo12301v();
            throw th;
        }
    }

    /* renamed from: t */
    public void mo15641t(String str, C1239b bVar) {
        this.f22334a.mo3950b();
        C2674f a = this.f22337d.mo12303a();
        byte[] k = C1239b.m4985k(bVar);
        if (k == null) {
            a.mo12299p(1);
        } else {
            a.mo12293D(1, k);
        }
        if (str == null) {
            a.mo12299p(2);
        } else {
            a.mo12297j(2, str);
        }
        this.f22334a.mo3951c();
        try {
            a.mo12665k();
            this.f22334a.mo3965r();
        } finally {
            this.f22334a.mo3955g();
            this.f22337d.mo12306f(a);
        }
    }

    /* renamed from: u */
    public int mo15642u() {
        this.f22334a.mo3950b();
        C2674f a = this.f22342i.mo12303a();
        this.f22334a.mo3951c();
        try {
            int k = a.mo12665k();
            this.f22334a.mo3965r();
            return k;
        } finally {
            this.f22334a.mo3955g();
            this.f22342i.mo12306f(a);
        }
    }
}
