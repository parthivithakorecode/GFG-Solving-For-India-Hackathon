package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ov3<K, V> extends gv3<K, V, V> {

    /* renamed from: b */
    private static final yv3<Map<Object, Object>> f12216b = lv3.m12941b(Collections.emptyMap());

    /* synthetic */ ov3(Map map, mv3 mv3) {
        super(map);
    }

    /* renamed from: c */
    public static <K, V> nv3<K, V> m14651c(int i) {
        return new nv3<>(i, (mv3) null);
    }

    /* renamed from: d */
    public final Map<K, V> mo5051a() {
        LinkedHashMap b = hv3.m10800b(mo7718b().size());
        for (Map.Entry entry : mo7718b().entrySet()) {
            b.put(entry.getKey(), ((yv3) entry.getValue()).mo5051a());
        }
        return Collections.unmodifiableMap(b);
    }
}
