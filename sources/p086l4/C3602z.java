package p086l4;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C3357i;
import p079k4.C3321j;

/* renamed from: l4.z */
class C3602z extends C3601y {
    /* renamed from: d */
    public static <K, V> Map<K, V> m25080d() {
        C3596t tVar = C3596t.f21271f;
        C3357i.m24506c(tVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return tVar;
    }

    /* renamed from: e */
    public static final <K, V> Map<K, V> m25081e(Map<K, ? extends V> map) {
        C3357i.m24508e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : C3601y.m25079c(map) : m25080d();
    }

    /* renamed from: f */
    public static final <K, V> void m25082f(Map<? super K, ? super V> map, Iterable<? extends C3321j<? extends K, ? extends V>> iterable) {
        C3357i.m24508e(map, "<this>");
        C3357i.m24508e(iterable, "pairs");
        for (C3321j jVar : iterable) {
            map.put(jVar.mo14321a(), jVar.mo14322b());
        }
    }

    /* renamed from: g */
    public static <K, V> Map<K, V> m25083g(Iterable<? extends C3321j<? extends K, ? extends V>> iterable) {
        C3357i.m24508e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m25081e(m25084h(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m25080d();
        }
        if (size != 1) {
            return m25084h(iterable, new LinkedHashMap(C3601y.m25077a(collection.size())));
        }
        return C3601y.m25078b((C3321j) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    /* renamed from: h */
    public static final <K, V, M extends Map<? super K, ? super V>> M m25084h(Iterable<? extends C3321j<? extends K, ? extends V>> iterable, M m) {
        C3357i.m24508e(iterable, "<this>");
        C3357i.m24508e(m, "destination");
        m25082f(m, iterable);
        return m;
    }

    /* renamed from: i */
    public static <K, V> Map<K, V> m25085i(Map<? extends K, ? extends V> map) {
        C3357i.m24508e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m25086j(map) : C3601y.m25079c(map) : m25080d();
    }

    /* renamed from: j */
    public static final <K, V> Map<K, V> m25086j(Map<? extends K, ? extends V> map) {
        C3357i.m24508e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
