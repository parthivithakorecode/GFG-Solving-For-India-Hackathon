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

/* renamed from: u0.c */
public final class C4087c implements C4086b {

    /* renamed from: a */
    private final C1173h f22283a;

    /* renamed from: b */
    private final C2465a<C4085a> f22284b;

    /* renamed from: u0.c$a */
    class C4088a extends C2465a<C4085a> {
        C4088a(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo12291g(C2674f fVar, C4085a aVar) {
            String str = aVar.f22281a;
            if (str == null) {
                fVar.mo12299p(1);
            } else {
                fVar.mo12297j(1, str);
            }
            String str2 = aVar.f22282b;
            if (str2 == null) {
                fVar.mo12299p(2);
            } else {
                fVar.mo12297j(2, str2);
            }
        }
    }

    public C4087c(C1173h hVar) {
        this.f22283a = hVar;
        this.f22284b = new C4088a(hVar);
    }

    /* renamed from: a */
    public boolean mo15589a(String str) {
        boolean z = true;
        C2467c m = C2467c.m20905m("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            m.mo12299p(1);
        } else {
            m.mo12297j(1, str);
        }
        this.f22283a.mo3950b();
        boolean z2 = false;
        Cursor b = C2594c.m21277b(this.f22283a, m, false, (CancellationSignal) null);
        try {
            if (b.moveToFirst()) {
                if (b.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            b.close();
            m.mo12301v();
        }
    }

    /* renamed from: b */
    public boolean mo15590b(String str) {
        boolean z = true;
        C2467c m = C2467c.m20905m("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            m.mo12299p(1);
        } else {
            m.mo12297j(1, str);
        }
        this.f22283a.mo3950b();
        boolean z2 = false;
        Cursor b = C2594c.m21277b(this.f22283a, m, false, (CancellationSignal) null);
        try {
            if (b.moveToFirst()) {
                if (b.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            b.close();
            m.mo12301v();
        }
    }

    /* renamed from: c */
    public List<String> mo15591c(String str) {
        C2467c m = C2467c.m20905m("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            m.mo12299p(1);
        } else {
            m.mo12297j(1, str);
        }
        this.f22283a.mo3950b();
        Cursor b = C2594c.m21277b(this.f22283a, m, false, (CancellationSignal) null);
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

    /* renamed from: d */
    public void mo15592d(C4085a aVar) {
        this.f22283a.mo3950b();
        this.f22283a.mo3951c();
        try {
            this.f22284b.mo12292h(aVar);
            this.f22283a.mo3965r();
        } finally {
            this.f22283a.mo3955g();
        }
    }
}
