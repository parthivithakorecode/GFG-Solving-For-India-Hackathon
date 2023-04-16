package p014b3;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p021c3.C1439a;
import p028d3.C2488a;
import p028d3.C2490b;
import p028d3.C2491c;
import p149v2.C4203e;
import p149v2.C4223s;
import p149v2.C4233w;
import p149v2.C4235x;

/* renamed from: b3.a */
final class C1303a extends C4233w<Date> {

    /* renamed from: b */
    static final C4235x f3511b = new C1304a();

    /* renamed from: a */
    private final DateFormat f3512a;

    /* renamed from: b3.a$a */
    class C1304a implements C4235x {
        C1304a() {
        }

        public <T> C4233w<T> create(C4203e eVar, C1439a<T> aVar) {
            if (aVar.mo4848c() == Date.class) {
                return new C1303a((C1304a) null);
            }
            return null;
        }
    }

    private C1303a() {
        this.f3512a = new SimpleDateFormat("MMM d, yyyy");
    }

    /* synthetic */ C1303a(C1304a aVar) {
        this();
    }

    /* renamed from: f */
    public synchronized Date mo4624c(C2488a aVar) {
        if (aVar.mo12354V() == C2490b.NULL) {
            aVar.mo12352R();
            return null;
        }
        try {
            return new Date(this.f3512a.parse(aVar.mo12353T()).getTime());
        } catch (ParseException e) {
            throw new C4223s((Throwable) e);
        }
    }

    /* renamed from: g */
    public synchronized void mo4625e(C2491c cVar, Date date) {
        cVar.mo12377Y(date == null ? null : this.f3512a.format(date));
    }
}
