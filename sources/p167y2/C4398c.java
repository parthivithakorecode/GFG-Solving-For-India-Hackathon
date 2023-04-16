package p167y2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p021c3.C1439a;
import p028d3.C2488a;
import p028d3.C2490b;
import p028d3.C2491c;
import p149v2.C4203e;
import p149v2.C4223s;
import p149v2.C4233w;
import p149v2.C4235x;
import p161x2.C4327e;
import p161x2.C4339j;
import p173z2.C4539a;

/* renamed from: y2.c */
public final class C4398c extends C4233w<Date> {

    /* renamed from: b */
    public static final C4235x f22755b = new C4399a();

    /* renamed from: a */
    private final List<DateFormat> f22756a;

    /* renamed from: y2.c$a */
    class C4399a implements C4235x {
        C4399a() {
        }

        public <T> C4233w<T> create(C4203e eVar, C1439a<T> aVar) {
            if (aVar.mo4848c() == Date.class) {
                return new C4398c();
            }
            return null;
        }
    }

    public C4398c() {
        ArrayList arrayList = new ArrayList();
        this.f22756a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C4327e.m26941e()) {
            arrayList.add(C4339j.m26962c(2, 2));
        }
    }

    /* renamed from: f */
    private synchronized Date m27046f(String str) {
        for (DateFormat parse : this.f22756a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C4539a.m27470c(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new C4223s(str, e);
        }
    }

    /* renamed from: g */
    public Date mo4624c(C2488a aVar) {
        if (aVar.mo12354V() != C2490b.NULL) {
            return m27046f(aVar.mo12353T());
        }
        aVar.mo12352R();
        return null;
    }

    /* renamed from: h */
    public synchronized void mo4625e(C2491c cVar, Date date) {
        if (date == null) {
            cVar.mo12369H();
        } else {
            cVar.mo12377Y(this.f22756a.get(0).format(date));
        }
    }
}
