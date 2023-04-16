package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;

final class la4 extends HandlerThread implements Handler.Callback {

    /* renamed from: f */
    private f32 f9971f;

    /* renamed from: g */
    private Handler f9972g;

    /* renamed from: h */
    private Error f9973h;

    /* renamed from: i */
    private RuntimeException f9974i;

    /* renamed from: j */
    private na4 f9975j;

    public la4() {
        super("ExoPlayer:DummySurface");
    }

    /* renamed from: a */
    public final na4 mo8909a(int i) {
        boolean z;
        start();
        this.f9972g = new Handler(getLooper(), this);
        this.f9971f = new f32(this.f9972g, (e22) null);
        synchronized (this) {
            z = false;
            this.f9972g.obtainMessage(1, i, 0).sendToTarget();
            while (this.f9975j == null && this.f9974i == null && this.f9973h == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f9974i;
        if (runtimeException == null) {
            Error error = this.f9973h;
            if (error == null) {
                na4 na4 = this.f9975j;
                Objects.requireNonNull(na4);
                return na4;
            }
            throw error;
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public final void mo8910b() {
        Handler handler = this.f9972g;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                int i2 = message.arg1;
                f32 f32 = this.f9971f;
                Objects.requireNonNull(f32);
                f32.mo7223b(i2);
                this.f9975j = new na4(this, this.f9971f.mo7222a(), i2 != 0, (ma4) null);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e) {
                oc2.m14399a("DummySurface", "Failed to initialize dummy surface", e);
                this.f9974i = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                try {
                    oc2.m14399a("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f9973h = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
            return true;
        } else if (i != 2) {
            return true;
        } else {
            try {
                f32 f322 = this.f9971f;
                Objects.requireNonNull(f322);
                f322.mo7224c();
            } catch (Throwable th2) {
                quit();
                throw th2;
            }
            quit();
            return true;
        }
    }
}
