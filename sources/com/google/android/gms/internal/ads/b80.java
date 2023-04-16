package com.google.android.gms.internal.ads;

import java.util.Map;
import p034e2.C2548e;
import p054h1.C2676b;
import p054h1.C2694t;

public final class b80 implements t70<eu0> {

    /* renamed from: d */
    static final Map<String, Integer> f4791d = C2548e.m21181b(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a */
    private final C2676b f4792a;

    /* renamed from: b */
    private final yf0 f4793b;

    /* renamed from: c */
    private final fg0 f4794c;

    public b80(C2676b bVar, yf0 yf0, fg0 fg0) {
        this.f4792a = bVar;
        this.f4793b = yf0;
        this.f4794c = fg0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5150a(Object obj, Map map) {
        eu0 eu0 = (eu0) obj;
        int intValue = f4791d.get((String) map.get("a")).intValue();
        int i = 6;
        boolean z = true;
        if (intValue != 5) {
            if (intValue != 7) {
                if (!this.f4792a.mo12668c()) {
                    this.f4792a.mo12667b((String) null);
                    return;
                } else if (intValue == 1) {
                    this.f4793b.mo12005i(map);
                    return;
                } else if (intValue == 3) {
                    new bg0(eu0, map).mo5849i();
                    return;
                } else if (intValue == 4) {
                    new wf0(eu0, map).mo11647j();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.f4793b.mo12004h(true);
                        return;
                    } else if (intValue != 7) {
                        io0.m11130f("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f4794c.mo6302c();
            return;
        }
        String str = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            z = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        }
        if (eu0 == null) {
            io0.m11131g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = z ? -1 : C2694t.m21609r().mo14002g();
        }
        eu0.mo7084H0(i);
    }
}
