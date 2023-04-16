package com.google.android.gms.internal.ads;

import java.util.Map;
import p061i1.C2824w;

final class d80 implements C2824w {

    /* renamed from: a */
    boolean f5683a = false;

    /* renamed from: b */
    final /* synthetic */ boolean f5684b;

    /* renamed from: c */
    final /* synthetic */ C2420yu f5685c;

    /* renamed from: d */
    final /* synthetic */ Map f5686d;

    /* renamed from: e */
    final /* synthetic */ Map f5687e;

    d80(f80 f80, boolean z, C2420yu yuVar, Map map, Map map2) {
        this.f5684b = z;
        this.f5685c = yuVar;
        this.f5686d = map;
        this.f5687e = map2;
    }

    /* renamed from: E */
    public final void mo6078E(int i) {
    }

    /* renamed from: c */
    public final void mo6079c(boolean z) {
        if (!this.f5683a) {
            if (z && this.f5684b) {
                ((pi1) this.f5685c).mo8182r();
            }
            this.f5683a = true;
            this.f5686d.put((String) this.f5687e.get("event_id"), Boolean.valueOf(z));
            ((da0) this.f5685c).mo6424t("openIntentAsync", this.f5686d);
        }
    }
}
