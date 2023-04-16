package p014b3;

import java.sql.Time;
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

/* renamed from: b3.b */
final class C1305b extends C4233w<Time> {

    /* renamed from: b */
    static final C4235x f3513b = new C1306a();

    /* renamed from: a */
    private final DateFormat f3514a;

    /* renamed from: b3.b$a */
    class C1306a implements C4235x {
        C1306a() {
        }

        public <T> C4233w<T> create(C4203e eVar, C1439a<T> aVar) {
            if (aVar.mo4848c() == Time.class) {
                return new C1305b((C1306a) null);
            }
            return null;
        }
    }

    private C1305b() {
        this.f3514a = new SimpleDateFormat("hh:mm:ss a");
    }

    /* synthetic */ C1305b(C1306a aVar) {
        this();
    }

    /* renamed from: f */
    public synchronized Time mo4624c(C2488a aVar) {
        if (aVar.mo12354V() == C2490b.NULL) {
            aVar.mo12352R();
            return null;
        }
        try {
            return new Time(this.f3514a.parse(aVar.mo12353T()).getTime());
        } catch (ParseException e) {
            throw new C4223s((Throwable) e);
        }
    }

    /* renamed from: g */
    public synchronized void mo4625e(C2491c cVar, Time time) {
        cVar.mo12377Y(time == null ? null : this.f3514a.format(time));
    }
}
