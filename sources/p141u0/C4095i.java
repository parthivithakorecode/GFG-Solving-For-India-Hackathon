package p141u0;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C1173h;
import java.util.ArrayList;
import java.util.List;
import p025d0.C2465a;
import p025d0.C2467c;
import p025d0.C2468d;
import p039f0.C2593b;
import p039f0.C2594c;
import p053h0.C2674f;

/* renamed from: u0.i */
public final class C4095i implements C4094h {

    /* renamed from: a */
    private final C1173h f22293a;

    /* renamed from: b */
    private final C2465a<C4093g> f22294b;

    /* renamed from: c */
    private final C2468d f22295c;

    /* renamed from: u0.i$a */
    class C4096a extends C2465a<C4093g> {
        C4096a(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo12291g(C2674f fVar, C4093g gVar) {
            String str = gVar.f22291a;
            if (str == null) {
                fVar.mo12299p(1);
            } else {
                fVar.mo12297j(1, str);
            }
            fVar.mo12302x(2, (long) gVar.f22292b);
        }
    }

    /* renamed from: u0.i$b */
    class C4097b extends C2468d {
        C4097b(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C4095i(C1173h hVar) {
        this.f22293a = hVar;
        this.f22294b = new C4096a(hVar);
        this.f22295c = new C4097b(hVar);
    }

    /* renamed from: a */
    public List<String> mo15601a() {
        C2467c m = C2467c.m20905m("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f22293a.mo3950b();
        Cursor b = C2594c.m21277b(this.f22293a, m, false, (CancellationSignal) null);
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

    /* renamed from: b */
    public C4093g mo15602b(String str) {
        C2467c m = C2467c.m20905m("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            m.mo12299p(1);
        } else {
            m.mo12297j(1, str);
        }
        this.f22293a.mo3950b();
        C4093g gVar = null;
        Cursor b = C2594c.m21277b(this.f22293a, m, false, (CancellationSignal) null);
        try {
            int b2 = C2593b.m21275b(b, "work_spec_id");
            int b3 = C2593b.m21275b(b, "system_id");
            if (b.moveToFirst()) {
                gVar = new C4093g(b.getString(b2), b.getInt(b3));
            }
            return gVar;
        } finally {
            b.close();
            m.mo12301v();
        }
    }

    /* renamed from: c */
    public void mo15603c(C4093g gVar) {
        this.f22293a.mo3950b();
        this.f22293a.mo3951c();
        try {
            this.f22294b.mo12292h(gVar);
            this.f22293a.mo3965r();
        } finally {
            this.f22293a.mo3955g();
        }
    }

    /* renamed from: d */
    public void mo15604d(String str) {
        this.f22293a.mo3950b();
        C2674f a = this.f22295c.mo12303a();
        if (str == null) {
            a.mo12299p(1);
        } else {
            a.mo12297j(1, str);
        }
        this.f22293a.mo3951c();
        try {
            a.mo12665k();
            this.f22293a.mo3965r();
        } finally {
            this.f22293a.mo3955g();
            this.f22295c.mo12306f(a);
        }
    }
}
