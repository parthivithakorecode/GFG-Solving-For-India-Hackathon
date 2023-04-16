package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import java.util.Objects;

final class ab4 implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: k */
    private static final ab4 f4057k = new ab4();

    /* renamed from: f */
    public volatile long f4058f = -9223372036854775807L;

    /* renamed from: g */
    private final Handler f4059g;

    /* renamed from: h */
    private final HandlerThread f4060h;

    /* renamed from: i */
    private Choreographer f4061i;

    /* renamed from: j */
    private int f4062j;

    private ab4() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f4060h = handlerThread;
        handlerThread.start();
        Handler e0 = n13.m13631e0(handlerThread.getLooper(), this);
        this.f4059g = e0;
        e0.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static ab4 m6008a() {
        return f4057k;
    }

    /* renamed from: b */
    public final void mo5220b() {
        this.f4059g.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void mo5221c() {
        this.f4059g.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f4058f = j;
        Choreographer choreographer = this.f4061i;
        Objects.requireNonNull(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f4061i = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.f4062j + 1;
            this.f4062j = i2;
            if (i2 == 1) {
                Choreographer choreographer = this.f4061i;
                Objects.requireNonNull(choreographer);
                choreographer.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f4062j - 1;
            this.f4062j = i3;
            if (i3 == 0) {
                Choreographer choreographer2 = this.f4061i;
                Objects.requireNonNull(choreographer2);
                choreographer2.removeFrameCallback(this);
                this.f4058f = -9223372036854775807L;
            }
            return true;
        }
    }
}
