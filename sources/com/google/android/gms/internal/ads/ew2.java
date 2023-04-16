package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

public abstract class ew2<E> {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final cc3<?> f6407d = rb3.m16131i(null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final dc3 f6408a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f6409b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final fw2<E> f6410c;

    public ew2(dc3 dc3, ScheduledExecutorService scheduledExecutorService, fw2<E> fw2) {
        this.f6408a = dc3;
        this.f6409b = scheduledExecutorService;
        this.f6410c = fw2;
    }

    /* renamed from: a */
    public final uv2 mo7175a(E e, cc3<?>... cc3Arr) {
        return new uv2(this, e, Arrays.asList(cc3Arr), (tv2) null);
    }

    /* renamed from: b */
    public final <I> dw2<I> mo7176b(E e, cc3<I> cc3) {
        return new dw2(this, e, (String) null, cc3, Collections.singletonList(cc3), cc3, (cw2) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo7177f(E e);
}
