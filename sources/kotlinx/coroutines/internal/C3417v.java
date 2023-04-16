package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p016b5.C1317a2;

/* renamed from: kotlinx.coroutines.internal.v */
public final class C3417v {

    /* renamed from: a */
    public static final C3417v f20920a;

    /* renamed from: b */
    private static final boolean f20921b = C3379f0.m24578e("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: c */
    public static final C1317a2 f20922c;

    static {
        C3417v vVar = new C3417v();
        f20920a = vVar;
        f20922c = vVar.m24694a();
    }

    private C3417v() {
    }

    /* renamed from: a */
    private final C1317a2 m24694a() {
        T t;
        Class<C3416u> cls = C3416u.class;
        try {
            List<C3416u> c = f20921b ? C3397k.f20889a.mo14436c() : C4608h.m27638f(C4605f.m27633a(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            Iterator<T> it = c.iterator();
            if (!it.hasNext()) {
                t = null;
            } else {
                t = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((C3416u) t).getLoadPriority();
                    do {
                        T next = it.next();
                        int loadPriority2 = ((C3416u) next).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            t = next;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            }
            C3416u uVar = (C3416u) t;
            C1317a2 e = uVar == null ? null : C3418w.m24699e(uVar, c);
            return e == null ? C3418w.m24696b((Throwable) null, (String) null, 3, (Object) null) : e;
        } catch (Throwable th) {
            return C3418w.m24696b(th, (String) null, 2, (Object) null);
        }
    }
}
