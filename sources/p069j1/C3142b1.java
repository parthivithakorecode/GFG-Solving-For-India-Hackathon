package p069j1;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.s33;
import p003a2.C0092o;

/* renamed from: j1.b1 */
public final class C3142b1 {

    /* renamed from: a */
    private HandlerThread f20437a = null;

    /* renamed from: b */
    private Handler f20438b = null;

    /* renamed from: c */
    private int f20439c = 0;

    /* renamed from: d */
    private final Object f20440d = new Object();

    /* renamed from: a */
    public final Handler mo13973a() {
        return this.f20438b;
    }

    /* renamed from: b */
    public final Looper mo13974b() {
        Looper looper;
        synchronized (this.f20440d) {
            if (this.f20439c != 0) {
                C0092o.m314j(this.f20437a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f20437a == null) {
                C3202r1.m24015k("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f20437a = handlerThread;
                handlerThread.start();
                this.f20438b = new s33(this.f20437a.getLooper());
                C3202r1.m24015k("Looper thread started.");
            } else {
                C3202r1.m24015k("Resuming the looper thread");
                this.f20440d.notifyAll();
            }
            this.f20439c++;
            looper = this.f20437a.getLooper();
        }
        return looper;
    }
}
