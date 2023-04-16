package p141u0;

import androidx.room.C1173h;
import androidx.work.C1239b;
import p025d0.C2465a;
import p025d0.C2468d;
import p053h0.C2674f;

/* renamed from: u0.o */
public final class C4104o implements C4103n {

    /* renamed from: a */
    private final C1173h f22305a;

    /* renamed from: b */
    private final C2465a<C4102m> f22306b;

    /* renamed from: c */
    private final C2468d f22307c;

    /* renamed from: d */
    private final C2468d f22308d;

    /* renamed from: u0.o$a */
    class C4105a extends C2465a<C4102m> {
        C4105a(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* renamed from: i */
        public void mo12291g(C2674f fVar, C4102m mVar) {
            String str = mVar.f22303a;
            if (str == null) {
                fVar.mo12299p(1);
            } else {
                fVar.mo12297j(1, str);
            }
            byte[] k = C1239b.m4985k(mVar.f22304b);
            if (k == null) {
                fVar.mo12299p(2);
            } else {
                fVar.mo12293D(2, k);
            }
        }
    }

    /* renamed from: u0.o$b */
    class C4106b extends C2468d {
        C4106b(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: u0.o$c */
    class C4107c extends C2468d {
        C4107c(C1173h hVar) {
            super(hVar);
        }

        /* renamed from: d */
        public String mo12305d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C4104o(C1173h hVar) {
        this.f22305a = hVar;
        this.f22306b = new C4105a(hVar);
        this.f22307c = new C4106b(hVar);
        this.f22308d = new C4107c(hVar);
    }

    /* renamed from: a */
    public void mo15609a(String str) {
        this.f22305a.mo3950b();
        C2674f a = this.f22307c.mo12303a();
        if (str == null) {
            a.mo12299p(1);
        } else {
            a.mo12297j(1, str);
        }
        this.f22305a.mo3951c();
        try {
            a.mo12665k();
            this.f22305a.mo3965r();
        } finally {
            this.f22305a.mo3955g();
            this.f22307c.mo12306f(a);
        }
    }

    /* renamed from: b */
    public void mo15610b(C4102m mVar) {
        this.f22305a.mo3950b();
        this.f22305a.mo3951c();
        try {
            this.f22306b.mo12292h(mVar);
            this.f22305a.mo3965r();
        } finally {
            this.f22305a.mo3955g();
        }
    }

    /* renamed from: c */
    public void mo15611c() {
        this.f22305a.mo3950b();
        C2674f a = this.f22308d.mo12303a();
        this.f22305a.mo3951c();
        try {
            a.mo12665k();
            this.f22305a.mo3965r();
        } finally {
            this.f22305a.mo3955g();
            this.f22308d.mo12306f(a);
        }
    }
}
