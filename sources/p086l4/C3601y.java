package p086l4;

import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.C3357i;
import p079k4.C3321j;

/* renamed from: l4.y */
class C3601y extends C3600x {
    /* renamed from: a */
    public static int m25077a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m25078b(C3321j<? extends K, ? extends V> jVar) {
        C3357i.m24508e(jVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(jVar.mo14323c(), jVar.mo14324d());
        C3357i.m24507d(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: c */
    public static final <K, V> Map<K, V> m25079c(Map<? extends K, ? extends V> map) {
        C3357i.m24508e(map, "<this>");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C3357i.m24507d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
