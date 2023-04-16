package kotlinx.coroutines.internal;

import p079k4.C3322k;
import p079k4.C3325l;

/* renamed from: kotlinx.coroutines.internal.l */
public final class C3399l {

    /* renamed from: a */
    private static final boolean f20890a;

    static {
        Object obj;
        try {
            C3322k.C3323a aVar = C3322k.f20823f;
            obj = C3322k.m24446a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            C3322k.C3323a aVar2 = C3322k.f20823f;
            obj = C3322k.m24446a(C3325l.m24450a(th));
        }
        f20890a = C3322k.m24449d(obj);
    }

    /* renamed from: a */
    public static final boolean m24643a() {
        return f20890a;
    }
}
