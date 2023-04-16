package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.rq */
public final /* synthetic */ class C2156rq implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C2267uq f13804f;

    /* renamed from: g */
    public final /* synthetic */ C1934lq f13805g;

    /* renamed from: h */
    public final /* synthetic */ C1971mq f13806h;

    /* renamed from: i */
    public final /* synthetic */ bp0 f13807i;

    public /* synthetic */ C2156rq(C2267uq uqVar, C1934lq lqVar, C1971mq mqVar, bp0 bp0) {
        this.f13804f = uqVar;
        this.f13805g = lqVar;
        this.f13806h = mqVar;
        this.f13807i = bp0;
    }

    public final void run() {
        C2267uq uqVar = this.f13804f;
        C1934lq lqVar = this.f13805g;
        C1971mq mqVar = this.f13806h;
        bp0 bp0 = this.f13807i;
        try {
            C2045oq j0 = lqVar.mo8989j0();
            C1860jq P4 = lqVar.mo8988i0() ? j0.mo9833P4(mqVar) : j0.mo9832M3(mqVar);
            if (!P4.mo8518g()) {
                bp0.mo5908f(new RuntimeException("No entry contents."));
                C2342wq.m19116e(uqVar.f15693c);
                return;
            }
            C2230tq tqVar = new C2230tq(uqVar, P4.mo8516e(), 1);
            int read = tqVar.read();
            if (read != -1) {
                tqVar.unread(read);
                bp0.mo5907e(C2416yq.m20155b(tqVar, P4.mo8517f(), P4.mo8520i(), P4.mo8514c(), P4.mo8519h()));
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e) {
            io0.m11129e("Unable to obtain a cache service instance.", e);
            bp0.mo5908f(e);
            C2342wq.m19116e(uqVar.f15693c);
        }
    }
}
