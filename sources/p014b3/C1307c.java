package p014b3;

import java.sql.Timestamp;
import java.util.Date;
import p021c3.C1439a;
import p028d3.C2488a;
import p028d3.C2491c;
import p149v2.C4203e;
import p149v2.C4233w;
import p149v2.C4235x;

/* renamed from: b3.c */
class C1307c extends C4233w<Timestamp> {

    /* renamed from: b */
    static final C4235x f3515b = new C1308a();

    /* renamed from: a */
    private final C4233w<Date> f3516a;

    /* renamed from: b3.c$a */
    class C1308a implements C4235x {
        C1308a() {
        }

        public <T> C4233w<T> create(C4203e eVar, C1439a<T> aVar) {
            if (aVar.mo4848c() == Timestamp.class) {
                return new C1307c(eVar.mo15717k(Date.class), (C1308a) null);
            }
            return null;
        }
    }

    private C1307c(C4233w<Date> wVar) {
        this.f3516a = wVar;
    }

    /* synthetic */ C1307c(C4233w wVar, C1308a aVar) {
        this(wVar);
    }

    /* renamed from: f */
    public Timestamp mo4624c(C2488a aVar) {
        Date c = this.f3516a.mo4624c(aVar);
        if (c != null) {
            return new Timestamp(c.getTime());
        }
        return null;
    }

    /* renamed from: g */
    public void mo4625e(C2491c cVar, Timestamp timestamp) {
        this.f3516a.mo4625e(cVar, timestamp);
    }
}
