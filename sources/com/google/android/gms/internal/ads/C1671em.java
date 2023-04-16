package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.C1708fm;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.google.android.gms.internal.ads.em */
final class C1671em<T extends C1708fm> extends Handler implements Runnable {

    /* renamed from: f */
    private final T f6275f;

    /* renamed from: g */
    private final C1633dm<T> f6276g;

    /* renamed from: h */
    public final int f6277h;

    /* renamed from: i */
    private final long f6278i;

    /* renamed from: j */
    private IOException f6279j;

    /* renamed from: k */
    private int f6280k;

    /* renamed from: l */
    private volatile Thread f6281l;

    /* renamed from: m */
    private volatile boolean f6282m;

    /* renamed from: n */
    final /* synthetic */ C1782hm f6283n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1671em(C1782hm hmVar, Looper looper, T t, C1633dm<T> dmVar, int i, long j) {
        super(looper);
        this.f6283n = hmVar;
        this.f6275f = t;
        this.f6276g = dmVar;
        this.f6277h = i;
        this.f6278i = j;
    }

    /* renamed from: d */
    private final void m8632d() {
        this.f6279j = null;
        this.f6283n.f8333a.execute(this.f6283n.f8334b);
    }

    /* renamed from: a */
    public final void mo7000a(boolean z) {
        this.f6282m = z;
        this.f6279j = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.f6275f.mo5870a();
            if (this.f6281l != null) {
                this.f6281l.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.f6283n.f8334b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f6276g.mo6503h(this.f6275f, elapsedRealtime, elapsedRealtime - this.f6278i, true);
    }

    /* renamed from: b */
    public final void mo7001b(int i) {
        IOException iOException = this.f6279j;
        if (iOException != null && this.f6280k > i) {
            throw iOException;
        }
    }

    /* renamed from: c */
    public final void mo7002c(long j) {
        C1856jm.m11730e(this.f6283n.f8334b == null);
        this.f6283n.f8334b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m8632d();
        }
    }

    public final void handleMessage(Message message) {
        if (!this.f6282m) {
            int i = message.what;
            if (i == 0) {
                m8632d();
            } else if (i != 4) {
                this.f6283n.f8334b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f6278i;
                if (this.f6275f.mo5871b()) {
                    this.f6276g.mo6503h(this.f6275f, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                int i3 = 1;
                if (i2 == 1) {
                    this.f6276g.mo6503h(this.f6275f, elapsedRealtime, j, false);
                } else if (i2 == 2) {
                    this.f6276g.mo6502d(this.f6275f, elapsedRealtime, j);
                } else if (i2 == 3) {
                    IOException iOException = (IOException) message.obj;
                    this.f6279j = iOException;
                    int i4 = this.f6276g.mo6504i(this.f6275f, elapsedRealtime, j, iOException);
                    if (i4 == 3) {
                        this.f6283n.f8335c = this.f6279j;
                    } else if (i4 != 2) {
                        if (i4 != 1) {
                            i3 = 1 + this.f6280k;
                        }
                        this.f6280k = i3;
                        mo7002c((long) Math.min((i3 - 1) * 1000, 5000));
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        try {
            this.f6281l = Thread.currentThread();
            if (!this.f6275f.mo5871b()) {
                String simpleName = this.f6275f.getClass().getSimpleName();
                C2338wm.m19040a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                this.f6275f.mo5872c();
                C2338wm.m19041b();
            }
            if (!this.f6282m) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            e = e;
            if (this.f6282m) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (InterruptedException unused) {
            C1856jm.m11730e(this.f6275f.mo5871b());
            if (!this.f6282m) {
                sendEmptyMessage(2);
            }
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (!this.f6282m) {
                e = new C1745gm(e2);
                obtainMessage(3, e).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (!this.f6282m) {
                e = new C1745gm(e3);
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.f6282m) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            C2338wm.m19041b();
            throw th;
        }
    }
}
