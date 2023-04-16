package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

final class bx2 implements xw2 {

    /* renamed from: a */
    private final xw2 f5073a;

    /* renamed from: b */
    private final Queue<ww2> f5074b = new LinkedBlockingQueue();

    /* renamed from: c */
    private final int f5075c = ((Integer) C2199sw.m17001c().mo8579b(m10.f10618t6)).intValue();

    /* renamed from: d */
    private final AtomicBoolean f5076d = new AtomicBoolean(false);

    public bx2(xw2 xw2, ScheduledExecutorService scheduledExecutorService) {
        this.f5073a = xw2;
        long intValue = (long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10610s6)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new ax2(this), intValue, intValue, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public static /* synthetic */ void m7124c(bx2 bx2) {
        while (!bx2.f5074b.isEmpty()) {
            bx2.f5073a.mo5981a(bx2.f5074b.remove());
        }
    }

    /* renamed from: a */
    public final void mo5981a(ww2 ww2) {
        if (this.f5074b.size() < this.f5075c) {
            this.f5074b.offer(ww2);
        } else if (!this.f5076d.getAndSet(true)) {
            Queue<ww2> queue = this.f5074b;
            ww2 b = ww2.m19233b("dropped_event");
            Map<String, String> j = ww2.mo11749j();
            if (j.containsKey("action")) {
                b.mo11742a("dropped_action", j.get("action"));
            }
            queue.offer(b);
        }
    }

    /* renamed from: b */
    public final String mo5982b(ww2 ww2) {
        return this.f5073a.mo5982b(ww2);
    }
}
