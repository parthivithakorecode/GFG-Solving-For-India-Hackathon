package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

public final class wv2 {
    /* renamed from: a */
    public static final <O> dw2<O> m19222a(Callable<O> callable, Object obj, ew2 ew2) {
        return m19223b(callable, ew2.f6408a, obj, ew2);
    }

    /* renamed from: b */
    public static final <O> dw2<O> m19223b(Callable<O> callable, dc3 dc3, Object obj, ew2 ew2) {
        return new dw2(ew2, obj, (String) null, ew2.f6407d, Collections.emptyList(), dc3.mo6445C(callable), (cw2) null);
    }

    /* renamed from: c */
    public static final <O> dw2<O> m19224c(cc3<O> cc3, Object obj, ew2 ew2) {
        return new dw2(ew2, obj, (String) null, ew2.f6407d, Collections.emptyList(), cc3, (cw2) null);
    }

    /* renamed from: d */
    public static final dw2 m19225d(qv2 qv2, dc3 dc3, Object obj, ew2 ew2) {
        return m19223b(new vv2(qv2), dc3, obj, ew2);
    }
}
