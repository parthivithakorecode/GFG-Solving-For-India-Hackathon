package p014b3;

import java.sql.Timestamp;
import java.util.Date;
import p149v2.C4235x;
import p167y2.C4400d;

/* renamed from: b3.d */
public final class C1309d {

    /* renamed from: a */
    public static final boolean f3517a;

    /* renamed from: b */
    public static final C4400d.C4402b<? extends Date> f3518b;

    /* renamed from: c */
    public static final C4400d.C4402b<? extends Date> f3519c;

    /* renamed from: d */
    public static final C4235x f3520d;

    /* renamed from: e */
    public static final C4235x f3521e;

    /* renamed from: f */
    public static final C4235x f3522f;

    /* renamed from: b3.d$a */
    class C1310a extends C4400d.C4402b<java.sql.Date> {
        C1310a(Class cls) {
            super(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public java.sql.Date mo4633d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* renamed from: b3.d$b */
    class C1311b extends C4400d.C4402b<Timestamp> {
        C1311b(Class cls) {
            super(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Timestamp mo4633d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z;
        C4235x xVar;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f3517a = z;
        if (z) {
            f3518b = new C1310a(java.sql.Date.class);
            f3519c = new C1311b(Timestamp.class);
            f3520d = C1303a.f3511b;
            f3521e = C1305b.f3513b;
            xVar = C1307c.f3515b;
        } else {
            xVar = null;
            f3518b = null;
            f3519c = null;
            f3520d = null;
            f3521e = null;
        }
        f3522f = xVar;
    }
}
