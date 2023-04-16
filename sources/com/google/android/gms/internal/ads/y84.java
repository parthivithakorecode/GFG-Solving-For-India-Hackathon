package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class y84 {

    /* renamed from: a */
    private final CopyOnWriteArrayList<x84> f17637a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public final void mo11981a(Handler handler, z84 z84) {
        mo11983c(z84);
        this.f17637a.add(new x84(handler, z84));
    }

    /* renamed from: b */
    public final void mo11982b(int i, long j, long j2) {
        Iterator<x84> it = this.f17637a.iterator();
        while (it.hasNext()) {
            x84 next = it.next();
            if (!next.f17083c) {
                next.f17081a.post(new w84(next, i, j, j2));
            }
        }
    }

    /* renamed from: c */
    public final void mo11983c(z84 z84) {
        Iterator<x84> it = this.f17637a.iterator();
        while (it.hasNext()) {
            x84 next = it.next();
            if (next.f17082b == z84) {
                next.mo11788c();
                this.f17637a.remove(next);
            }
        }
    }
}
