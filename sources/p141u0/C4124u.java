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

/* renamed from: u0.u */
public final class C4124u implements C4123t {

    /* renamed from: a */
    private final C1173h f22355a;

    /* renamed from: b */
    private final C2465a<C4122s> f22356b;

    /* renamed from: u0.u$a */
    class C4125a extends C2465a<C4122s> {
        C4125a(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo12291g(C2674f fVar, C4122s sVar) {
            String str = sVar.f22353a;
            if (str == null) {
                fVar.mo12299p(1);
            } else {
                fVar.mo12297j(1, str);
            }
            String str2 = sVar.f22354b;
            if (str2 == null) {
                fVar.mo12299p(2);
            } else {
                fVar.mo12297j(2, str2);
            }
        }
    }

    public C4124u(C1173h hVar) {
        this.f22355a = hVar;
        this.f22356b = new C4125a(hVar);
    }

    /* renamed from: a */
    public void mo15644a(C4122s sVar) {
        this.f22355a.mo3950b();
        this.f22355a.mo3951c();
        try {
            this.f22356b.mo12292h(sVar);
            this.f22355a.mo3965r();
        } finally {
            this.f22355a.mo3955g();
        }
    }

    /* renamed from: b */
    public List<String> mo15645b(String str) {
        C2467c m = C2467c.m20905m("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            m.mo12299p(1);
        } else {
            m.mo12297j(1, str);
        }
        this.f22355a.mo3950b();
        Cursor b = C2594c.m21277b(this.f22355a, m, false, (CancellationSignal) null);
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
