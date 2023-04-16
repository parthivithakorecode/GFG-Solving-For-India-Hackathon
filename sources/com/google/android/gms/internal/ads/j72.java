package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final /* synthetic */ class j72 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ CopyOnWriteArraySet f9019f;

    /* renamed from: g */
    public final /* synthetic */ int f9020g;

    /* renamed from: h */
    public final /* synthetic */ k82 f9021h;

    public /* synthetic */ j72(CopyOnWriteArraySet copyOnWriteArraySet, int i, k82 k82) {
        this.f9019f = copyOnWriteArraySet;
        this.f9020g = i;
        this.f9021h = k82;
    }

    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f9019f;
        int i = this.f9020g;
        k82 k82 = this.f9021h;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((ma2) it.next()).mo9154a(i, k82);
        }
    }
}
