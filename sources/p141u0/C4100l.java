package p141u0;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C1173h;
import java.util.ArrayList;
import java.util.List;
import p025d0.C2465a;
import p025d0.C2467c;
import p039f0.C2594c;
import p053h0.C2674f;

/* renamed from: u0.l */
public final class C4100l implements C4099k {

    /* renamed from: a */
    private final C1173h f22300a;

    /* renamed from: b */
    private final C2465a<C4098j> f22301b;

    /* renamed from: u0.l$a */
    class C4101a extends C2465a<C4098j> {
        C4101a(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo12291g(C2674f fVar, C4098j jVar) {
            String str = jVar.f22298a;
            if (str == null) {
                fVar.mo12299p(1);
            } else {
                fVar.mo12297j(1, str);
            }
            String str2 = jVar.f22299b;
            if (str2 == null) {
                fVar.mo12299p(2);
            } else {
                fVar.mo12297j(2, str2);
            }
        }
    }

    public C4100l(C1173h hVar) {
        this.f22300a = hVar;
        this.f22301b = new C4101a(hVar);
    }

    /* renamed from: a */
    public void mo15606a(C4098j jVar) {
        this.f22300a.mo3950b();
        this.f22300a.mo3951c();
        try {
            this.f22301b.mo12292h(jVar);
            this.f22300a.mo3965r();
        } finally {
            this.f22300a.mo3955g();
        }
    }

    /* renamed from: b */
    public List<String> mo15607b(String str) {
        C2467c m = C2467c.m20905m("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            m.mo12299p(1);
        } else {
            m.mo12297j(1, str);
        }
        this.f22300a.mo3950b();
        Cursor b = C2594c.m21277b(this.f22300a, m, false, (CancellationSignal) null);
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
}
