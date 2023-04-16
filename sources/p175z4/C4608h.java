package p175z4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3357i;
import p145u4.C4150l;

/* renamed from: z4.h */
class C4608h extends C4607g {

    /* renamed from: z4.h$a */
    public static final class C4609a implements Iterable<T> {

        /* renamed from: f */
        final /* synthetic */ C4601b f23256f;

        public C4609a(C4601b bVar) {
            this.f23256f = bVar;
        }

        public Iterator<T> iterator() {
            return this.f23256f.iterator();
        }
    }

    /* renamed from: c */
    public static <T> Iterable<T> m27635c(C4601b<? extends T> bVar) {
        C3357i.m24508e(bVar, "<this>");
        return new C4609a(bVar);
    }

    /* renamed from: d */
    public static <T, R> C4601b<R> m27636d(C4601b<? extends T> bVar, C4150l<? super T, ? extends R> lVar) {
        C3357i.m24508e(bVar, "<this>");
        C3357i.m24508e(lVar, "transform");
        return new C4610i(bVar, lVar);
    }

    /* renamed from: e */
    public static final <T, C extends Collection<? super T>> C m27637e(C4601b<? extends T> bVar, C c) {
        C3357i.m24508e(bVar, "<this>");
        C3357i.m24508e(c, "destination");
        for (Object add : bVar) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: f */
    public static <T> List<T> m27638f(C4601b<? extends T> bVar) {
        C3357i.m24508e(bVar, "<this>");
        return C3585i.m25033f(m27639g(bVar));
    }

    /* renamed from: g */
    public static final <T> List<T> m27639g(C4601b<? extends T> bVar) {
        C3357i.m24508e(bVar, "<this>");
        return (List) m27637e(bVar, new ArrayList());
    }
}
