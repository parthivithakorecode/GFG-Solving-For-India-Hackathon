package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

final class nl1 implements t70<Object> {

    /* renamed from: a */
    private final WeakReference<rl1> f11526a;

    /* synthetic */ nl1(rl1 rl1, ml1 ml1) {
        this.f11526a = new WeakReference<>(rl1);
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map<String, String> map) {
        rl1 rl1 = (rl1) this.f11526a.get();
        if (rl1 != null) {
            rl1.f13689h.mo25L();
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10557m7)).booleanValue()) {
                rl1.f13690i.mo8182r();
            }
        }
    }
}
