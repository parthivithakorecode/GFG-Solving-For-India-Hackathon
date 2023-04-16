package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: com.google.android.gms.internal.ads.jn */
final class C1857jn implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: k */
    private static final C1857jn f9197k = new C1857jn();

    /* renamed from: f */
    public volatile long f9198f;

    /* renamed from: g */
    private final Handler f9199g;

    /* renamed from: h */
    private final HandlerThread f9200h;

    /* renamed from: i */
    private Choreographer f9201i;

    /* renamed from: j */
    private int f9202j;

    private C1857jn() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f9200h = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f9199g = handler;
        handler.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static C1857jn m11740a() {
        return f9197k;
    }

    /* renamed from: b */
    public final void mo8496b() {
        this.f9199g.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void mo8497c() {
        this.f9199g.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f9198f = j;
        this.f9201i.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f9201i = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.f9202j + 1;
            this.f9202j = i2;
            if (i2 == 1) {
                this.f9201i.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f9202j - 1;
            this.f9202j = i3;
            if (i3 == 0) {
                this.f9201i.removeFrameCallback(this);
                this.f9198f = 0;
            }
            return true;
        }
    }
}
