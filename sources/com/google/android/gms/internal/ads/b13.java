package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p003a2.C0052c;
import p160x1.C4280b;

final class b13 implements C0052c.C0053a, C0052c.C0054b {

    /* renamed from: a */
    protected final c23 f4633a;

    /* renamed from: b */
    private final String f4634b;

    /* renamed from: c */
    private final String f4635c;

    /* renamed from: d */
    private final LinkedBlockingQueue<C1509a9> f4636d = new LinkedBlockingQueue<>();

    /* renamed from: e */
    private final HandlerThread f4637e;

    public b13(Context context, String str, String str2) {
        this.f4634b = str;
        this.f4635c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f4637e = handlerThread;
        handlerThread.start();
        c23 c23 = new c23(context, handlerThread.getLooper(), this, this, 9200000);
        this.f4633a = c23;
        c23.mo186q();
    }

    /* renamed from: a */
    static C1509a9 m6550a() {
        C1842j8 f0 = C1509a9.m5946f0();
        f0.mo8411r0(32768);
        return (C1509a9) f0.mo11894o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        mo5622c();
        r3.f4637e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.f4636d.put(m6550a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo139C0(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.h23 r4 = r3.mo5623d()
            if (r4 == 0) goto L_0x0039
            com.google.android.gms.internal.ads.d23 r0 = new com.google.android.gms.internal.ads.d23     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r3.f4634b     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = r3.f4635c     // Catch:{ all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.f23 r4 = r4.mo7812b3(r0)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.a9 r4 = r4.mo7218c()     // Catch:{ all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.a9> r0 = r3.f4636d     // Catch:{ all -> 0x0025 }
            r0.put(r4)     // Catch:{ all -> 0x0025 }
        L_0x001c:
            r3.mo5622c()
            android.os.HandlerThread r4 = r3.f4637e
            r4.quit()
            return
        L_0x0025:
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.a9> r4 = r3.f4636d     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            com.google.android.gms.internal.ads.a9 r0 = m6550a()     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            goto L_0x001c
        L_0x002f:
            r4 = move-exception
            r3.mo5622c()
            android.os.HandlerThread r0 = r3.f4637e
            r0.quit()
            throw r4
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b13.mo139C0(android.os.Bundle):void");
    }

    /* renamed from: D */
    public final void mo140D(int i) {
        try {
            this.f4636d.put(m6550a());
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: b */
    public final C1509a9 mo5621b(int i) {
        C1509a9 a9Var;
        try {
            a9Var = this.f4636d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            a9Var = null;
        }
        return a9Var == null ? m6550a() : a9Var;
    }

    /* renamed from: c */
    public final void mo5622c() {
        c23 c23 = this.f4633a;
        if (c23 == null) {
            return;
        }
        if (c23.mo173a() || this.f4633a.mo179j()) {
            this.f4633a.mo184o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final h23 mo5623d() {
        try {
            return this.f4633a.mo6038i0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: n0 */
    public final void mo196n0(C4280b bVar) {
        try {
            this.f4636d.put(m6550a());
        } catch (InterruptedException unused) {
        }
    }
}
