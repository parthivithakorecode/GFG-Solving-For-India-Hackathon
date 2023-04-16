package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C3353e;
import p016b5.C1384o0;

/* renamed from: kotlinx.coroutines.internal.m */
public final class C3401m<E> {
    /* renamed from: a */
    public static <E> Object m24646a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m24647b(Object obj, int i, C3353e eVar) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m24646a(obj);
    }

    /* renamed from: c */
    public static final Object m24648c(Object obj, E e) {
        if (C1384o0.m5425a() && !(!(e instanceof List))) {
            throw new AssertionError();
        } else if (obj == null) {
            return m24646a(e);
        } else {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(e);
                return m24646a(obj);
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(e);
            return m24646a(arrayList);
        }
    }
}
