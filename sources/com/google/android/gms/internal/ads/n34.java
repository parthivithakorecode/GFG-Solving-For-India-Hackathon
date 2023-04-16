package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

final class n34 {

    /* renamed from: g */
    private static final ArrayDeque<m34> f11293g = new ArrayDeque<>();

    /* renamed from: h */
    private static final Object f11294h = new Object();

    /* renamed from: a */
    private final MediaCodec f11295a;

    /* renamed from: b */
    private final HandlerThread f11296b;

    /* renamed from: c */
    private Handler f11297c;

    /* renamed from: d */
    private final AtomicReference<RuntimeException> f11298d = new AtomicReference<>();

    /* renamed from: e */
    private final ay1 f11299e;

    /* renamed from: f */
    private boolean f11300f;

    public n34(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ay1 ay1 = new ay1(xv1.f17360a);
        this.f11295a = mediaCodec;
        this.f11296b = handlerThread;
        this.f11299e = ay1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.android.gms.internal.ads.m34} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.google.android.gms.internal.ads.m34} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* bridge */ /* synthetic */ void m13685a(com.google.android.gms.internal.ads.n34 r9, android.os.Message r10) {
        /*
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L_0x0044
            r2 = 1
            if (r0 == r2) goto L_0x0022
            r2 = 2
            if (r0 == r2) goto L_0x001c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r9 = r9.f11298d
            r9.set(r0)
            goto L_0x0057
        L_0x001c:
            com.google.android.gms.internal.ads.ay1 r9 = r9.f11299e
            r9.mo5567e()
            goto L_0x0057
        L_0x0022:
            java.lang.Object r10 = r10.obj
            r1 = r10
            com.google.android.gms.internal.ads.m34 r1 = (com.google.android.gms.internal.ads.m34) r1
            int r3 = r1.f10708a
            android.media.MediaCodec$CryptoInfo r5 = r1.f10711d
            long r6 = r1.f10712e
            int r8 = r1.f10713f
            java.lang.Object r10 = f11294h     // Catch:{ RuntimeException -> 0x003d }
            monitor-enter(r10)     // Catch:{ RuntimeException -> 0x003d }
            android.media.MediaCodec r2 = r9.f11295a     // Catch:{ all -> 0x003a }
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch:{ all -> 0x003a }
            monitor-exit(r10)     // Catch:{ all -> 0x003a }
            goto L_0x0057
        L_0x003a:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x003a }
            throw r0     // Catch:{ RuntimeException -> 0x003d }
        L_0x003d:
            r10 = move-exception
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r9 = r9.f11298d
            r9.set(r10)
            goto L_0x0057
        L_0x0044:
            java.lang.Object r10 = r10.obj
            r1 = r10
            com.google.android.gms.internal.ads.m34 r1 = (com.google.android.gms.internal.ads.m34) r1
            int r3 = r1.f10708a
            int r5 = r1.f10710c
            long r6 = r1.f10712e
            int r8 = r1.f10713f
            android.media.MediaCodec r2 = r9.f11295a     // Catch:{ RuntimeException -> 0x003d }
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch:{ RuntimeException -> 0x003d }
        L_0x0057:
            if (r1 == 0) goto L_0x0064
            java.util.ArrayDeque<com.google.android.gms.internal.ads.m34> r9 = f11293g
            monitor-enter(r9)
            r9.add(r1)     // Catch:{ all -> 0x0061 }
            monitor-exit(r9)     // Catch:{ all -> 0x0061 }
            return
        L_0x0061:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0061 }
            throw r10
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n34.m13685a(com.google.android.gms.internal.ads.n34, android.os.Message):void");
    }

    /* renamed from: g */
    private static m34 m13686g() {
        ArrayDeque<m34> arrayDeque = f11293g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                m34 m34 = new m34();
                return m34;
            }
            m34 removeFirst = arrayDeque.removeFirst();
            return removeFirst;
        }
    }

    /* renamed from: h */
    private final void m13687h() {
        RuntimeException andSet = this.f11298d.getAndSet((Object) null);
        if (andSet != null) {
            throw andSet;
        }
    }

    /* renamed from: i */
    private static byte[] m13688i(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* renamed from: j */
    private static int[] m13689j(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    /* renamed from: b */
    public final void mo9415b() {
        if (this.f11300f) {
            try {
                Handler handler = this.f11297c;
                int i = n13.f11236a;
                handler.removeCallbacksAndMessages((Object) null);
                this.f11299e.mo5565c();
                this.f11297c.obtainMessage(2).sendToTarget();
                this.f11299e.mo5563a();
                m13687h();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: c */
    public final void mo9416c(int i, int i2, int i3, long j, int i4) {
        m13687h();
        m34 g = m13686g();
        g.mo9122a(i, 0, i3, j, i4);
        Handler handler = this.f11297c;
        int i5 = n13.f11236a;
        handler.obtainMessage(0, g).sendToTarget();
    }

    /* renamed from: d */
    public final void mo9417d(int i, int i2, v21 v21, long j, int i3) {
        m13687h();
        m34 g = m13686g();
        g.mo9122a(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = g.f10711d;
        cryptoInfo.numSubSamples = v21.f15869f;
        cryptoInfo.numBytesOfClearData = m13689j(v21.f15867d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m13689j(v21.f15868e, cryptoInfo.numBytesOfEncryptedData);
        byte[] i4 = m13688i(v21.f15865b, cryptoInfo.key);
        Objects.requireNonNull(i4);
        cryptoInfo.key = i4;
        byte[] i5 = m13688i(v21.f15864a, cryptoInfo.iv);
        Objects.requireNonNull(i5);
        cryptoInfo.iv = i5;
        cryptoInfo.mode = v21.f15866c;
        if (n13.f11236a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(v21.f15870g, v21.f15871h));
        }
        this.f11297c.obtainMessage(1, g).sendToTarget();
    }

    /* renamed from: e */
    public final void mo9418e() {
        if (this.f11300f) {
            mo9415b();
            this.f11296b.quit();
        }
        this.f11300f = false;
    }

    /* renamed from: f */
    public final void mo9419f() {
        if (!this.f11300f) {
            this.f11296b.start();
            this.f11297c = new l34(this, this.f11296b.getLooper());
            this.f11300f = true;
        }
    }
}
