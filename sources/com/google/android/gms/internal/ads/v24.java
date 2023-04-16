package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class v24 {

    /* renamed from: a */
    public final int f15881a;

    /* renamed from: b */
    public final s54 f15882b;

    /* renamed from: c */
    private final CopyOnWriteArrayList<u24> f15883c;

    public v24() {
        this(new CopyOnWriteArrayList(), 0, (s54) null);
    }

    private v24(CopyOnWriteArrayList<u24> copyOnWriteArrayList, int i, s54 s54) {
        this.f15883c = copyOnWriteArrayList;
        this.f15881a = i;
        this.f15882b = s54;
    }

    /* renamed from: a */
    public final v24 mo11371a(int i, s54 s54) {
        return new v24(this.f15883c, i, s54);
    }

    /* renamed from: b */
    public final void mo11372b(Handler handler, w24 w24) {
        this.f15883c.add(new u24(handler, w24));
    }

    /* renamed from: c */
    public final void mo11373c(w24 w24) {
        Iterator<u24> it = this.f15883c.iterator();
        while (it.hasNext()) {
            u24 next = it.next();
            if (next.f15375b == w24) {
                this.f15883c.remove(next);
            }
        }
    }
}
