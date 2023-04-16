package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class ys0 {

    /* renamed from: a */
    private final ArrayList<C2411yl> f17854a = new ArrayList<>();

    /* renamed from: b */
    private long f17855b;

    ys0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo12080a() {
        Iterator<C2411yl> it = this.f17854a.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> b = it.next().mo6219b();
            if (b != null) {
                for (Map.Entry next : b.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) next.getKey())) {
                            this.f17855b = Math.max(this.f17855b, Long.parseLong((String) ((List) next.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f17855b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12081b(C2411yl ylVar) {
        this.f17854a.add(ylVar);
    }
}
