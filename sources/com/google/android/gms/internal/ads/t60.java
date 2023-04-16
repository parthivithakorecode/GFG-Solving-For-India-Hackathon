package com.google.android.gms.internal.ads;

import java.util.Map;

public final class t60 implements t70<Object> {

    /* renamed from: a */
    private final u60 f14725a;

    public t60(u60 u60) {
        this.f14725a = u60;
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            io0.m11131g("App event with no name parameter.");
        } else {
            this.f14725a.mo9005Q(str, map.get("info"));
        }
    }
}
