package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public class lg1<ListenerT> {
    @GuardedBy("this")

    /* renamed from: f */
    protected final Map<ListenerT, Executor> f10039f = new HashMap();

    protected lg1(Set<hi1<ListenerT>> set) {
        mo8946P0(set);
    }

    /* renamed from: B0 */
    public final synchronized void mo8945B0(ListenerT listenert, Executor executor) {
        this.f10039f.put(listenert, executor);
    }

    /* renamed from: P0 */
    public final synchronized void mo8946P0(Set<hi1<ListenerT>> set) {
        for (hi1<ListenerT> y0 : set) {
            mo8948y0(y0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public final synchronized void mo8947Q0(kg1<ListenerT> kg1) {
        for (Map.Entry next : this.f10039f.entrySet()) {
            ((Executor) next.getValue()).execute(new ig1(kg1, next.getKey()));
        }
    }

    /* renamed from: y0 */
    public final synchronized void mo8948y0(hi1<ListenerT> hi1) {
        mo8945B0(hi1.f8315a, hi1.f8316b);
    }
}
