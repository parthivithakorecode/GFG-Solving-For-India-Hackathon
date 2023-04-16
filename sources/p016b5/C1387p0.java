package p016b5;

import kotlinx.coroutines.internal.C3382h;
import p079k4.C3322k;
import p079k4.C3325l;
import p100n4.C3773d;

/* renamed from: b5.p0 */
public final class C1387p0 {
    /* renamed from: a */
    public static final String m5431a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m5432b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m5433c(C3773d<?> dVar) {
        Object obj;
        if (dVar instanceof C3382h) {
            return dVar.toString();
        }
        try {
            C3322k.C3323a aVar = C3322k.f20823f;
            obj = C3322k.m24446a(dVar + '@' + m5432b(dVar));
        } catch (Throwable th) {
            C3322k.C3323a aVar2 = C3322k.f20823f;
            obj = C3322k.m24446a(C3325l.m24450a(th));
        }
        Throwable b = C3322k.m24447b(obj);
        String str = obj;
        if (b != null) {
            str = dVar.getClass().getName() + '@' + m5432b(dVar);
        }
        return (String) str;
    }
}
