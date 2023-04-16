package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

final class p34 extends MediaCodec.Callback {

    /* renamed from: a */
    private final Object f12491a = new Object();

    /* renamed from: b */
    private final HandlerThread f12492b;

    /* renamed from: c */
    private Handler f12493c;

    /* renamed from: d */
    private final u34 f12494d;

    /* renamed from: e */
    private final u34 f12495e;

    /* renamed from: f */
    private final ArrayDeque<MediaCodec.BufferInfo> f12496f;

    /* renamed from: g */
    private final ArrayDeque<MediaFormat> f12497g;

    /* renamed from: h */
    private MediaFormat f12498h;

    /* renamed from: i */
    private MediaFormat f12499i;

    /* renamed from: j */
    private MediaCodec.CodecException f12500j;

    /* renamed from: k */
    private long f12501k;

    /* renamed from: l */
    private boolean f12502l;

    /* renamed from: m */
    private IllegalStateException f12503m;

    p34(HandlerThread handlerThread) {
        this.f12492b = handlerThread;
        this.f12494d = new u34();
        this.f12495e = new u34();
        this.f12496f = new ArrayDeque<>();
        this.f12497g = new ArrayDeque<>();
    }

    /* renamed from: h */
    private final void m14813h(MediaFormat mediaFormat) {
        this.f12495e.mo11156b(-2);
        this.f12497g.add(mediaFormat);
    }

    /* renamed from: i */
    private final void m14814i() {
        if (!this.f12497g.isEmpty()) {
            this.f12499i = this.f12497g.getLast();
        }
        this.f12494d.mo11157c();
        this.f12495e.mo11157c();
        this.f12496f.clear();
        this.f12497g.clear();
        this.f12500j = null;
    }

    /* renamed from: j */
    private final void m14815j() {
        IllegalStateException illegalStateException = this.f12503m;
        if (illegalStateException != null) {
            this.f12503m = null;
            throw illegalStateException;
        }
    }

    /* renamed from: k */
    private final void m14816k() {
        MediaCodec.CodecException codecException = this.f12500j;
        if (codecException != null) {
            this.f12500j = null;
            throw codecException;
        }
    }

    /* renamed from: l */
    private final void m14817l(IllegalStateException illegalStateException) {
        synchronized (this.f12491a) {
            this.f12503m = illegalStateException;
        }
    }

    /* renamed from: m */
    private final boolean m14818m() {
        return this.f12501k > 0 || this.f12502l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9948a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f12491a
            monitor-enter(r0)
            boolean r1 = r3.m14818m()     // Catch:{ all -> 0x0023 }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return r2
        L_0x000c:
            r3.m14815j()     // Catch:{ all -> 0x0023 }
            r3.m14816k()     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.u34 r1 = r3.f12494d     // Catch:{ all -> 0x0023 }
            boolean r1 = r1.mo11158d()     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x001b
            goto L_0x0021
        L_0x001b:
            com.google.android.gms.internal.ads.u34 r1 = r3.f12494d     // Catch:{ all -> 0x0023 }
            int r2 = r1.mo11155a()     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return r2
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p34.mo9948a():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9949b(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f12491a
            monitor-enter(r0)
            boolean r1 = r9.m14818m()     // Catch:{ all -> 0x004e }
            r2 = -1
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r2
        L_0x000c:
            r9.m14815j()     // Catch:{ all -> 0x004e }
            r9.m14816k()     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.ads.u34 r1 = r9.f12495e     // Catch:{ all -> 0x004e }
            boolean r1 = r1.mo11158d()     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x001c
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r2
        L_0x001c:
            com.google.android.gms.internal.ads.u34 r1 = r9.f12495e     // Catch:{ all -> 0x004e }
            int r1 = r1.mo11155a()     // Catch:{ all -> 0x004e }
            r2 = -2
            if (r1 < 0) goto L_0x003f
            android.media.MediaFormat r2 = r9.f12498h     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.ads.wu1.m19203b(r2)     // Catch:{ all -> 0x004e }
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r2 = r9.f12496f     // Catch:{ all -> 0x004e }
            java.lang.Object r2 = r2.remove()     // Catch:{ all -> 0x004e }
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch:{ all -> 0x004e }
            int r4 = r2.offset     // Catch:{ all -> 0x004e }
            int r5 = r2.size     // Catch:{ all -> 0x004e }
            long r6 = r2.presentationTimeUs     // Catch:{ all -> 0x004e }
            int r8 = r2.flags     // Catch:{ all -> 0x004e }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x004e }
            goto L_0x004c
        L_0x003f:
            if (r1 != r2) goto L_0x004c
            java.util.ArrayDeque<android.media.MediaFormat> r10 = r9.f12497g     // Catch:{ all -> 0x004e }
            java.lang.Object r10 = r10.remove()     // Catch:{ all -> 0x004e }
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch:{ all -> 0x004e }
            r9.f12498h = r10     // Catch:{ all -> 0x004e }
            r1 = r2
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return r1
        L_0x004e:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p34.mo9949b(android.media.MediaCodec$BufferInfo):int");
    }

    /* renamed from: c */
    public final MediaFormat mo9950c() {
        MediaFormat mediaFormat;
        synchronized (this.f12491a) {
            mediaFormat = this.f12498h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: d */
    public final void mo9951d(Runnable runnable) {
        synchronized (this.f12491a) {
            this.f12501k++;
            Handler handler = this.f12493c;
            int i = n13.f11236a;
            handler.post(new o34(this, runnable));
        }
    }

    /* renamed from: e */
    public final void mo9952e(MediaCodec mediaCodec) {
        wu1.m19207f(this.f12493c == null);
        this.f12492b.start();
        Handler handler = new Handler(this.f12492b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f12493c = handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo9953f(Runnable runnable) {
        synchronized (this.f12491a) {
            if (!this.f12502l) {
                long j = this.f12501k - 1;
                this.f12501k = j;
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i <= 0) {
                    if (i < 0) {
                        e = new IllegalStateException();
                    } else {
                        m14814i();
                        try {
                            ((f34) runnable).f6684f.start();
                        } catch (IllegalStateException e) {
                            e = e;
                        } catch (Exception e2) {
                            m14817l(new IllegalStateException(e2));
                        }
                    }
                    m14817l(e);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo9954g() {
        synchronized (this.f12491a) {
            this.f12502l = true;
            this.f12492b.quit();
            m14814i();
        }
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f12491a) {
            this.f12500j = codecException;
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f12491a) {
            this.f12494d.mo11156b(i);
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f12491a) {
            MediaFormat mediaFormat = this.f12499i;
            if (mediaFormat != null) {
                m14813h(mediaFormat);
                this.f12499i = null;
            }
            this.f12495e.mo11156b(i);
            this.f12496f.add(bufferInfo);
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f12491a) {
            m14813h(mediaFormat);
            this.f12499i = null;
        }
    }
}
