package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class tr3 {

    /* renamed from: c */
    private static final tr3 f15033c = new tr3();

    /* renamed from: a */
    private final fs3 f15034a = new cr3();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, es3<?>> f15035b = new ConcurrentHashMap();

    private tr3() {
    }

    /* renamed from: a */
    public static tr3 m17481a() {
        return f15033c;
    }

    /* renamed from: b */
    public final <T> es3<T> mo11101b(Class<T> cls) {
        kq3.m12305f(cls, "messageType");
        es3<T> es3 = (es3) this.f15035b.get(cls);
        if (es3 == null) {
            es3 = this.f15034a.mo6274d(cls);
            kq3.m12305f(cls, "messageType");
            kq3.m12305f(es3, "schema");
            es3<T> putIfAbsent = this.f15035b.putIfAbsent(cls, es3);
            return putIfAbsent == null ? es3 : putIfAbsent;
        }
    }
}
