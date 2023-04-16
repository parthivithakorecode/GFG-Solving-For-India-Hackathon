package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class m20 {

    /* renamed from: a */
    private MotionEvent f10680a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b */
    private MotionEvent f10681b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c */
    private final Context f10682c;

    /* renamed from: d */
    private final ScheduledExecutorService f10683d;

    /* renamed from: e */
    private final o20 f10684e;

    public m20(Context context, ScheduledExecutorService scheduledExecutorService, o20 o20, byte[] bArr) {
        this.f10682c = context;
        this.f10683d = scheduledExecutorService;
        this.f10684e = o20;
    }

    /* renamed from: a */
    public final cc3<String> mo9106a() {
        return (ib3) rb3.m16137o(ib3.m10985E(rb3.m16131i(null)), a30.f3913c.mo9928e().longValue(), TimeUnit.MILLISECONDS, this.f10683d);
    }

    /* renamed from: b */
    public final void mo9107b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f10680a.getEventTime()) {
            this.f10680a = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > this.f10681b.getEventTime()) {
            this.f10681b = MotionEvent.obtain(motionEvent);
        }
    }
}
