package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class h03 {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f7941a;

    /* renamed from: b */
    private final ThreadPoolExecutor f7942b;

    /* renamed from: c */
    private final ArrayDeque<g03> f7943c = new ArrayDeque<>();

    /* renamed from: d */
    private g03 f7944d = null;

    public h03() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f7941a = linkedBlockingQueue;
        this.f7942b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: c */
    private final void m10179c() {
        g03 poll = this.f7943c.poll();
        this.f7944d = poll;
        if (poll != null) {
            poll.executeOnExecutor(this.f7942b, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo7778a(g03 g03) {
        this.f7944d = null;
        m10179c();
    }

    /* renamed from: b */
    public final void mo7779b(g03 g03) {
        g03.mo7491b(this);
        this.f7943c.add(g03);
        if (this.f7944d == null) {
            m10179c();
        }
    }
}
