package com.google.android.gms.internal.ads;

import java.util.Map;

public final class fv1 implements ow2 {

    /* renamed from: f */
    private final Map<gw2, ev1> f6962f;

    /* renamed from: g */
    private final C1527ar f6963g;

    fv1(C1527ar arVar, Map<gw2, ev1> map) {
        this.f6962f = map;
        this.f6963g = arVar;
    }

    /* renamed from: a */
    public final void mo5536a(gw2 gw2, String str) {
        if (this.f6962f.containsKey(gw2)) {
            this.f6963g.mo5403c(this.f6962f.get(gw2).f6391b);
        }
    }

    /* renamed from: b */
    public final void mo5537b(gw2 gw2, String str) {
    }

    /* renamed from: s */
    public final void mo5538s(gw2 gw2, String str) {
        if (this.f6962f.containsKey(gw2)) {
            this.f6963g.mo5403c(this.f6962f.get(gw2).f6390a);
        }
    }

    /* renamed from: z */
    public final void mo5539z(gw2 gw2, String str, Throwable th) {
        if (this.f6962f.containsKey(gw2)) {
            this.f6963g.mo5403c(this.f6962f.get(gw2).f6392c);
        }
    }
}
