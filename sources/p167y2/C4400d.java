package p167y2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p028d3.C2488a;
import p028d3.C2490b;
import p028d3.C2491c;
import p149v2.C4223s;
import p149v2.C4233w;
import p149v2.C4235x;
import p161x2.C4305a;
import p161x2.C4327e;
import p161x2.C4339j;
import p173z2.C4539a;

/* renamed from: y2.d */
public final class C4400d<T extends Date> extends C4233w<T> {

    /* renamed from: a */
    private final C4402b<T> f22757a;

    /* renamed from: b */
    private final List<DateFormat> f22758b;

    /* renamed from: y2.d$b */
    public static abstract class C4402b<T extends Date> {

        /* renamed from: b */
        public static final C4402b<Date> f22759b = new C4403a(Date.class);

        /* renamed from: a */
        private final Class<T> f22760a;

        /* renamed from: y2.d$b$a */
        class C4403a extends C4402b<Date> {
            C4403a(Class cls) {
                super(cls);
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public Date mo4633d(Date date) {
                return date;
            }
        }

        protected C4402b(Class<T> cls) {
            this.f22760a = cls;
        }

        /* renamed from: c */
        private final C4235x m27056c(C4400d<T> dVar) {
            return C4425n.m27134b(this.f22760a, dVar);
        }

        /* renamed from: a */
        public final C4235x mo16020a(int i, int i2) {
            return m27056c(new C4400d(this, i, i2));
        }

        /* renamed from: b */
        public final C4235x mo16021b(String str) {
            return m27056c(new C4400d(this, str));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract T mo4633d(Date date);
    }

    private C4400d(C4402b<T> bVar, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f22758b = arrayList;
        this.f22757a = (C4402b) C4305a.m26883b(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C4327e.m26941e()) {
            arrayList.add(C4339j.m26962c(i, i2));
        }
    }

    private C4400d(C4402b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f22758b = arrayList;
        this.f22757a = (C4402b) C4305a.m26883b(bVar);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    /* renamed from: f */
    private Date m27051f(String str) {
        synchronized (this.f22758b) {
            for (DateFormat parse : this.f22758b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                return C4539a.m27470c(str, new ParsePosition(0));
            } catch (ParseException e) {
                throw new C4223s(str, e);
            }
        }
    }

    /* renamed from: g */
    public T mo4624c(C2488a aVar) {
        if (aVar.mo12354V() == C2490b.NULL) {
            aVar.mo12352R();
            return null;
        }
        return this.f22757a.mo4633d(m27051f(aVar.mo12353T()));
    }

    /* renamed from: h */
    public void mo4625e(C2491c cVar, Date date) {
        if (date == null) {
            cVar.mo12369H();
            return;
        }
        synchronized (this.f22758b) {
            cVar.mo12377Y(this.f22758b.get(0).format(date));
        }
    }

    public String toString() {
        StringBuilder sb;
        String simpleName;
        DateFormat dateFormat = this.f22758b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        sb.append(simpleName);
        sb.append(')');
        return sb.toString();
    }
}
