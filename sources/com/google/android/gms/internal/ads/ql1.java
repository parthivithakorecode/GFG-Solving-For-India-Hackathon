package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

final class ql1 implements t70<Object> {

    /* renamed from: a */
    private final WeakReference<rl1> f13228a;

    /* synthetic */ ql1(rl1 rl1, pl1 pl1) {
        this.f13228a = new WeakReference<>(rl1);
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map<String, String> map) {
        rl1 rl1 = (rl1) this.f13228a.get();
        if (rl1 != null) {
            rl1.f13688g.zza();
        }
    }
}
