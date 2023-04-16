package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

final class ll1 implements t70<Object> {

    /* renamed from: a */
    private final WeakReference<rl1> f10079a;

    /* synthetic */ ll1(rl1 rl1, kl1 kl1) {
        this.f10079a = new WeakReference<>(rl1);
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map<String, String> map) {
        rl1 rl1 = (rl1) this.f10079a.get();
        if (rl1 != null && "_ac".equals(map.get("eventName"))) {
            rl1.f13689h.mo25L();
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10557m7)).booleanValue()) {
                rl1.f13690i.mo8182r();
            }
        }
    }
}
