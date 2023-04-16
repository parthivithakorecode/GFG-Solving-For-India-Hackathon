package p086l4;

import java.util.Collection;
import kotlin.jvm.internal.C3357i;

/* renamed from: l4.n */
class C3590n extends C3589m {
    /* renamed from: i */
    public static <T> boolean m25036i(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C3357i.m24508e(collection, "<this>");
        C3357i.m24508e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }
}
