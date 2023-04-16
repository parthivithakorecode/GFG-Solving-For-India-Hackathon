package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

final class md1 implements Runnable {

    /* renamed from: f */
    private final WeakReference<nd1> f10812f;

    /* synthetic */ md1(nd1 nd1, ld1 ld1) {
        this.f10812f = new WeakReference<>(nd1);
    }

    public final void run() {
        nd1 nd1 = (nd1) this.f10812f.get();
        if (nd1 != null) {
            nd1.mo8947Q0(kd1.f9482a);
        }
    }
}
