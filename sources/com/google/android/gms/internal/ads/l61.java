package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import javax.annotation.concurrent.GuardedBy;
import p048g2.C2635a;
import p054h1.C2694t;
import p102o.C3801a;

public final class l61 implements lc1, qb1 {

    /* renamed from: f */
    private final Context f9913f;

    /* renamed from: g */
    private final eu0 f9914g;

    /* renamed from: h */
    private final rr2 f9915h;

    /* renamed from: i */
    private final po0 f9916i;
    @GuardedBy("this")

    /* renamed from: j */
    private C2635a f9917j;
    @GuardedBy("this")

    /* renamed from: k */
    private boolean f9918k;

    public l61(Context context, eu0 eu0, rr2 rr2, po0 po0) {
        this.f9913f = context;
        this.f9914g = eu0;
        this.f9915h = rr2;
        this.f9916i = po0;
    }

    /* renamed from: a */
    private final synchronized void m12603a() {
        ug0 ug0;
        vg0 vg0;
        if (this.f9915h.f13874Q) {
            if (this.f9914g != null) {
                if (C2694t.m21600i().mo10791V(this.f9913f)) {
                    po0 po0 = this.f9916i;
                    int i = po0.f12730g;
                    int i2 = po0.f12731h;
                    StringBuilder sb = new StringBuilder(23);
                    sb.append(i);
                    sb.append(".");
                    sb.append(i2);
                    String sb2 = sb.toString();
                    String a = this.f9915h.f13876S.mo9591a();
                    if (this.f9915h.f13876S.mo9592b() == 1) {
                        ug0 = ug0.VIDEO;
                        vg0 = vg0.DEFINED_BY_JAVASCRIPT;
                    } else {
                        ug0 = ug0.HTML_DISPLAY;
                        vg0 = this.f9915h.f13894f == 1 ? vg0.ONE_PIXEL : vg0.BEGIN_TO_RENDER;
                    }
                    C2635a S = C2694t.m21600i().mo10788S(sb2, this.f9914g.mo7150w(), "", "javascript", a, vg0, ug0, this.f9915h.f13903j0);
                    this.f9917j = S;
                    eu0 eu0 = this.f9914g;
                    if (S != null) {
                        C2694t.m21600i().mo10790U(this.f9917j, (View) eu0);
                        this.f9914g.mo7095N0(this.f9917j);
                        C2694t.m21600i().mo10785P(this.f9917j);
                        this.f9918k = true;
                        this.f9914g.mo6424t("onSdkLoaded", new C3801a());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo5153k() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f9918k     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0008
            r3.m12603a()     // Catch:{ all -> 0x0024 }
        L_0x0008:
            com.google.android.gms.internal.ads.rr2 r0 = r3.f9915h     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.f13874Q     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            g2.a r0 = r3.f9917j     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.internal.ads.eu0 r0 = r3.f9914g     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            o.a r1 = new o.a     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = "onSdkImpression"
            r0.mo6424t(r2, r1)     // Catch:{ all -> 0x0024 }
            monitor-exit(r3)
            return
        L_0x0022:
            monitor-exit(r3)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l61.mo5153k():void");
    }

    /* renamed from: m */
    public final synchronized void mo8445m() {
        if (!this.f9918k) {
            m12603a();
        }
    }
}
