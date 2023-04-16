package p175z4;

import java.util.Iterator;
import kotlin.jvm.internal.C3357i;

/* renamed from: z4.f */
class C4605f extends C4604e {

    /* renamed from: z4.f$a */
    public static final class C4606a implements C4601b<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f23255a;

        public C4606a(Iterator it) {
            this.f23255a = it;
        }

        public Iterator<T> iterator() {
            return this.f23255a;
        }
    }

    /* renamed from: a */
    public static <T> C4601b<T> m27633a(Iterator<? extends T> it) {
        C3357i.m24508e(it, "<this>");
        return m27634b(new C4606a(it));
    }

    /* renamed from: b */
    public static final <T> C4601b<T> m27634b(C4601b<? extends T> bVar) {
        C3357i.m24508e(bVar, "<this>");
        return bVar instanceof C4600a ? bVar : new C4600a(bVar);
    }
}
