package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.v94;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

@SuppressLint({"HandlerLeak"})
final class u94<T extends v94> extends Handler implements Runnable {

    /* renamed from: f */
    private final T f15479f;

    /* renamed from: g */
    private final long f15480g;

    /* renamed from: h */
    private r94<T> f15481h;

    /* renamed from: i */
    private IOException f15482i;

    /* renamed from: j */
    private int f15483j;

    /* renamed from: k */
    private Thread f15484k;

    /* renamed from: l */
    private boolean f15485l;

    /* renamed from: m */
    private volatile boolean f15486m;

    /* renamed from: n */
    final /* synthetic */ aa4 f15487n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u94(aa4 aa4, Looper looper, T t, r94<T> r94, int i, long j) {
        super(looper);
        this.f15487n = aa4;
        this.f15479f = t;
        this.f15481h = r94;
        this.f15480g = j;
    }

    /* renamed from: d */
    private final void m17776d() {
        this.f15482i = null;
        ExecutorService d = this.f15487n.f4045a;
        u94 c = this.f15487n.f4046b;
        Objects.requireNonNull(c);
        d.execute(c);
    }

    /* renamed from: a */
    public final void mo11196a(boolean z) {
        this.f15486m = z;
        this.f15482i = null;
        if (hasMessages(0)) {
            this.f15485l = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.f15485l = true;
                this.f15479f.mo9693f();
                Thread thread = this.f15484k;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.f15487n.f4046b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            r94<T> r94 = this.f15481h;
            Objects.requireNonNull(r94);
            r94.mo10498k(this.f15479f, elapsedRealtime, elapsedRealtime - this.f15480g, true);
            this.f15481h = null;
        }
    }

    /* renamed from: b */
    public final void mo11197b(int i) {
        IOException iOException = this.f15482i;
        if (iOException != null && this.f15483j > i) {
            throw iOException;
        }
    }

    /* renamed from: c */
    public final void mo11198c(long j) {
        wu1.m19207f(this.f15487n.f4046b == null);
        this.f15487n.f4046b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m17776d();
        }
    }

    public final void handleMessage(Message message) {
        if (!this.f15486m) {
            int i = message.what;
            if (i == 0) {
                m17776d();
            } else if (i != 3) {
                this.f15487n.f4046b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f15480g;
                r94<T> r94 = this.f15481h;
                Objects.requireNonNull(r94);
                if (this.f15485l) {
                    r94.mo10498k(this.f15479f, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    try {
                        r94.mo10497h(this.f15479f, elapsedRealtime, j);
                    } catch (RuntimeException e) {
                        oc2.m14399a("LoadTask", "Unexpected exception handling load completed", e);
                        this.f15487n.f4047c = new z94(e);
                    }
                } else if (i2 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.f15482i = iOException;
                    int i3 = this.f15483j + 1;
                    this.f15483j = i3;
                    t94 m = r94.mo10499m(this.f15479f, elapsedRealtime, j, iOException, i3);
                    if (m.f14791a == 3) {
                        this.f15487n.f4047c = this.f15482i;
                    } else if (m.f14791a != 2) {
                        if (m.f14791a == 1) {
                            this.f15483j = 1;
                        }
                        mo11198c(m.f14792b != -9223372036854775807L ? m.f14792b : (long) Math.min((this.f15483j - 1) * 1000, 5000));
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007d, code lost:
        r0.sendToTarget();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0080, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 2
            monitor-enter(r5)     // Catch:{ IOException -> 0x0093, Exception -> 0x0081, OutOfMemoryError -> 0x0068, Error -> 0x0053 }
            boolean r1 = r5.f15485l     // Catch:{ all -> 0x0050 }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0050 }
            r5.f15484k = r3     // Catch:{ all -> 0x0050 }
            monitor-exit(r5)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x003d
            java.lang.String r1 = "load:"
            T r3 = r5.f15479f     // Catch:{ IOException -> 0x0093, Exception -> 0x0081, OutOfMemoryError -> 0x0068, Error -> 0x0053 }
            java.lang.Class r3 = r3.getClass()     // Catch:{ IOException -> 0x0093, Exception -> 0x0081, OutOfMemoryError -> 0x0068, Error -> 0x0053 }
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ IOException -> 0x0093, Exception -> 0x0081, OutOfMemoryError -> 0x0068, Error -> 0x0053 }
            int r4 = r3.length()     // Catch:{ IOException -> 0x0093, Exception -> 0x0081, OutOfMemoryError -> 0x0068, Error -> 0x0053 }
            if (r4 == 0) goto L_0x0026
            java.lang.String r1 = r1.concat(r3)     // Catch:{ IOException -> 0x0093, Exception -> 0x0081, OutOfMemoryError -> 0x0068, Error -> 0x0053 }
            goto L_0x002c
        L_0x0026:
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x0093, Exception -> 0x0081, OutOfMemoryError -> 0x0068, Error -> 0x0053 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0093, Exception -> 0x0081, OutOfMemoryError -> 0x0068, Error -> 0x0053 }
            r1 = r3
        L_0x002c:
            com.google.android.gms.internal.ads.lz2.m12992a(r1)     // Catch:{ IOException -> 0x0093, Exception -> 0x0081, OutOfMemoryError -> 0x0068, Error -> 0x0053 }
            T r1 = r5.f15479f     // Catch:{ all -> 0x0038 }
            r1.mo9694h()     // Catch:{ all -> 0x0038 }
            com.google.android.gms.internal.ads.lz2.m12993b()     // Catch:{ IOException -> 0x0093, Exception -> 0x0081, OutOfMemoryError -> 0x0068, Error -> 0x0053 }
            goto L_0x003d
        L_0x0038:
            r1 = move-exception
            com.google.android.gms.internal.ads.lz2.m12993b()     // Catch:{ IOException -> 0x0093, Exception -> 0x0081, OutOfMemoryError -> 0x0068, Error -> 0x0053 }
            throw r1     // Catch:{ IOException -> 0x0093, Exception -> 0x0081, OutOfMemoryError -> 0x0068, Error -> 0x0053 }
        L_0x003d:
            monitor-enter(r5)     // Catch:{ IOException -> 0x0093, Exception -> 0x0081, OutOfMemoryError -> 0x0068, Error -> 0x0053 }
            r1 = 0
            r5.f15484k = r1     // Catch:{ all -> 0x004d }
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x004d }
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            boolean r1 = r5.f15486m     // Catch:{ IOException -> 0x0093, Exception -> 0x0081, OutOfMemoryError -> 0x0068, Error -> 0x0053 }
            if (r1 != 0) goto L_0x009d
            r5.sendEmptyMessage(r2)     // Catch:{ IOException -> 0x0093, Exception -> 0x0081, OutOfMemoryError -> 0x0068, Error -> 0x0053 }
            return
        L_0x004d:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            throw r1     // Catch:{ IOException -> 0x0093, Exception -> 0x0081, OutOfMemoryError -> 0x0068, Error -> 0x0053 }
        L_0x0050:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0050 }
            throw r1     // Catch:{ IOException -> 0x0093, Exception -> 0x0081, OutOfMemoryError -> 0x0068, Error -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            boolean r1 = r5.f15486m
            if (r1 != 0) goto L_0x0067
            java.lang.String r1 = "LoadTask"
            java.lang.String r2 = "Unexpected error loading stream"
            com.google.android.gms.internal.ads.oc2.m14399a(r1, r2, r0)
            r1 = 3
            android.os.Message r1 = r5.obtainMessage(r1, r0)
            r1.sendToTarget()
        L_0x0067:
            throw r0
        L_0x0068:
            r1 = move-exception
            boolean r2 = r5.f15486m
            if (r2 != 0) goto L_0x009d
            java.lang.String r2 = "LoadTask"
            java.lang.String r3 = "OutOfMemory error loading stream"
            com.google.android.gms.internal.ads.oc2.m14399a(r2, r3, r1)
            com.google.android.gms.internal.ads.z94 r2 = new com.google.android.gms.internal.ads.z94
            r2.<init>(r1)
        L_0x0079:
            android.os.Message r0 = r5.obtainMessage(r0, r2)
        L_0x007d:
            r0.sendToTarget()
            return
        L_0x0081:
            r1 = move-exception
            boolean r2 = r5.f15486m
            if (r2 != 0) goto L_0x009d
            java.lang.String r2 = "LoadTask"
            java.lang.String r3 = "Unexpected exception loading stream"
            com.google.android.gms.internal.ads.oc2.m14399a(r2, r3, r1)
            com.google.android.gms.internal.ads.z94 r2 = new com.google.android.gms.internal.ads.z94
            r2.<init>(r1)
            goto L_0x0079
        L_0x0093:
            r1 = move-exception
            boolean r2 = r5.f15486m
            if (r2 != 0) goto L_0x009d
            android.os.Message r0 = r5.obtainMessage(r0, r1)
            goto L_0x007d
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.u94.run():void");
    }
}
