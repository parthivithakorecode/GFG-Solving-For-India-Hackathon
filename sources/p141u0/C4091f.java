package p141u0;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C1173h;
import p025d0.C2465a;
import p025d0.C2467c;
import p039f0.C2594c;
import p053h0.C2674f;

/* renamed from: u0.f */
public final class C4091f implements C4090e {

    /* renamed from: a */
    private final C1173h f22288a;

    /* renamed from: b */
    private final C2465a<C4089d> f22289b;

    /* renamed from: u0.f$a */
    class C4092a extends C2465a<C4089d> {
        C4092a(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo12291g(C2674f fVar, C4089d dVar) {
            String str = dVar.f22286a;
            if (str == null) {
                fVar.mo12299p(1);
            } else {
                fVar.mo12297j(1, str);
            }
            Long l = dVar.f22287b;
            if (l == null) {
                fVar.mo12299p(2);
            } else {
                fVar.mo12302x(2, l.longValue());
            }
        }
    }

    public C4091f(C1173h hVar) {
        this.f22288a = hVar;
        this.f22289b = new C4092a(hVar);
    }

    /* renamed from: a */
    public Long mo15596a(String str) {
        C2467c m = C2467c.m20905m("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            m.mo12299p(1);
        } else {
            m.mo12297j(1, str);
        }
        this.f22288a.mo3950b();
        Long l = null;
        Cursor b = C2594c.m21277b(this.f22288a, m, false, (CancellationSignal) null);
        try {
            if (b.moveToFirst()) {
                if (!b.isNull(0)) {
                    l = Long.valueOf(b.getLong(0));
                }
            }
            return l;
        } finally {
            b.close();
            m.mo12301v();
        }
    }

    /* renamed from: b */
    public void mo15597b(C4089d dVar) {
        this.f22288a.mo3950b();
        this.f22288a.mo3951c();
        try {
            this.f22289b.mo12292h(dVar);
            this.f22288a.mo3965r();
        } finally {
            this.f22288a.mo3955g();
        }
    }
}
