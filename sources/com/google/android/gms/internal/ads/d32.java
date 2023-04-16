package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class d32 implements ow2 {

    /* renamed from: f */
    private final Map<gw2, String> f5635f = new HashMap();

    /* renamed from: g */
    private final Map<gw2, String> f5636g = new HashMap();

    /* renamed from: h */
    private final ww2 f5637h;

    public d32(Set<c32> set, ww2 ww2) {
        this.f5637h = ww2;
        for (c32 next : set) {
            this.f5635f.put(next.f5289b, next.f5288a);
            this.f5636g.put(next.f5290c, next.f5288a);
        }
    }

    /* renamed from: a */
    public final void mo5536a(gw2 gw2, String str) {
        ww2 ww2 = this.f5637h;
        String valueOf = String.valueOf(str);
        ww2.mo11744e(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."), "s.");
        if (this.f5636g.containsKey(gw2)) {
            ww2 ww22 = this.f5637h;
            String valueOf2 = String.valueOf(this.f5636g.get(gw2));
            ww22.mo11744e(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "s.");
        }
    }

    /* renamed from: b */
    public final void mo5537b(gw2 gw2, String str) {
    }

    /* renamed from: s */
    public final void mo5538s(gw2 gw2, String str) {
        ww2 ww2 = this.f5637h;
        String valueOf = String.valueOf(str);
        ww2.mo11743d(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."));
        if (this.f5635f.containsKey(gw2)) {
            ww2 ww22 = this.f5637h;
            String valueOf2 = String.valueOf(this.f5635f.get(gw2));
            ww22.mo11743d(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."));
        }
    }

    /* renamed from: z */
    public final void mo5539z(gw2 gw2, String str, Throwable th) {
        ww2 ww2 = this.f5637h;
        String valueOf = String.valueOf(str);
        ww2.mo11744e(valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task."), "f.");
        if (this.f5636g.containsKey(gw2)) {
            ww2 ww22 = this.f5637h;
            String valueOf2 = String.valueOf(this.f5636g.get(gw2));
            ww22.mo11744e(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "f.");
        }
    }
}
