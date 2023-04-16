package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import p034e2.C2553j;
import p054h1.C2694t;

public final class pr0 implements C2225tl {

    /* renamed from: a */
    private final C1819im<C2225tl> f12764a;

    /* renamed from: b */
    private final Context f12765b;

    /* renamed from: c */
    private final C2225tl f12766c;

    /* renamed from: d */
    private final String f12767d;

    /* renamed from: e */
    private final int f12768e;

    /* renamed from: f */
    private final boolean f12769f = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10596r1)).booleanValue();

    /* renamed from: g */
    private InputStream f12770g;

    /* renamed from: h */
    private boolean f12771h;

    /* renamed from: i */
    private Uri f12772i;

    /* renamed from: j */
    private volatile C1971mq f12773j;

    /* renamed from: k */
    private boolean f12774k = false;

    /* renamed from: l */
    private boolean f12775l = false;

    /* renamed from: m */
    private boolean f12776m = false;

    /* renamed from: n */
    private boolean f12777n = false;

    /* renamed from: o */
    private long f12778o = 0;

    /* renamed from: p */
    private cc3<Long> f12779p = null;

    /* renamed from: q */
    private final AtomicLong f12780q = new AtomicLong(-1);

    /* renamed from: r */
    private final yr0 f12781r;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.google.android.gms.internal.ads.tl] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.tl, java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.String, int] */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.im<com.google.android.gms.internal.ads.tl>, int] */
    /* JADX WARNING: type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.yr0, com.google.android.gms.internal.ads.im<com.google.android.gms.internal.ads.tl>] */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public pr0(android.content.Context r1, android.content.Context r2, com.google.android.gms.internal.ads.C2225tl r3, java.lang.String r4, int r5, com.google.android.gms.internal.ads.C1819im<com.google.android.gms.internal.ads.C2225tl> r6, com.google.android.gms.internal.ads.yr0 r7) {
        /*
            r0 = this;
            r0.<init>()
            r0.f12765b = r1
            r0.f12766c = r2
            r0.f12764a = r5
            r0.f12781r = r6
            r0.f12767d = r3
            r0.f12768e = r4
            r1 = 0
            r0.f12774k = r1
            r0.f12775l = r1
            r0.f12776m = r1
            r0.f12777n = r1
            r1 = 0
            r0.f12778o = r1
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r2 = -1
            r1.<init>(r2)
            r0.f12780q = r1
            r1 = 0
            r0.f12779p = r1
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.m10.f10596r1
            com.google.android.gms.internal.ads.k10 r2 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r1 = r2.mo8579b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.f12769f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pr0.<init>(android.content.Context, com.google.android.gms.internal.ads.tl, java.lang.String, int, com.google.android.gms.internal.ads.im, com.google.android.gms.internal.ads.yr0, byte[]):void");
    }

    /* renamed from: m */
    private final void m15222m(C2299vl vlVar) {
        C1819im<C2225tl> imVar = this.f12764a;
        if (imVar != null) {
            ((as0) imVar).mo5480k(this, vlVar);
        }
    }

    /* renamed from: n */
    private final boolean m15223n() {
        if (!this.f12769f) {
            return false;
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10380S2)).booleanValue() && !this.f12776m) {
            return true;
        }
        return ((Boolean) C2199sw.m17001c().mo8579b(m10.f10388T2)).booleanValue() && !this.f12777n;
    }

    /* renamed from: a */
    public final long mo10149a() {
        return this.f12778o;
    }

    /* renamed from: c */
    public final Uri mo5934c() {
        return this.f12772i;
    }

    /* renamed from: d */
    public final int mo5935d(byte[] bArr, int i, int i2) {
        C1819im<C2225tl> imVar;
        if (this.f12771h) {
            InputStream inputStream = this.f12770g;
            int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.f12766c.mo5935d(bArr, i, i2);
            if ((!this.f12769f || this.f12770g != null) && (imVar = this.f12764a) != null) {
                ((as0) imVar).mo5477i0(this, read);
            }
            return read;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e0  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x0105=Splitter:B:34:0x0105, B:39:0x0128=Splitter:B:39:0x0128} */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo5936e(com.google.android.gms.internal.ads.C2299vl r15) {
        /*
            r14 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "Cache connection took "
            boolean r2 = r14.f12771h
            if (r2 != 0) goto L_0x01ff
            r2 = 1
            r14.f12771h = r2
            android.net.Uri r3 = r15.f16339a
            r14.f12772i = r3
            boolean r3 = r14.f12769f
            if (r3 != 0) goto L_0x0016
            r14.m15222m(r15)
        L_0x0016:
            android.net.Uri r3 = r15.f16339a
            com.google.android.gms.internal.ads.mq r3 = com.google.android.gms.internal.ads.C1971mq.m13448c(r3)
            r14.f12773j = r3
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.m10.f10356P2
            com.google.android.gms.internal.ads.k10 r4 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r3 = r4.mo8579b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = -1
            r6 = 0
            if (r3 == 0) goto L_0x017e
            com.google.android.gms.internal.ads.mq r3 = r14.f12773j
            if (r3 == 0) goto L_0x01da
            com.google.android.gms.internal.ads.mq r3 = r14.f12773j
            long r7 = r15.f16341c
            r3.f11000m = r7
            com.google.android.gms.internal.ads.mq r3 = r14.f12773j
            java.lang.String r7 = r14.f12767d
            java.lang.String r7 = com.google.android.gms.internal.ads.b53.m6685c(r7)
            r3.f11001n = r7
            com.google.android.gms.internal.ads.mq r3 = r14.f12773j
            int r7 = r14.f12768e
            r3.f11002o = r7
            com.google.android.gms.internal.ads.mq r3 = r14.f12773j
            boolean r3 = r3.f10999l
            if (r3 == 0) goto L_0x0056
            com.google.android.gms.internal.ads.e10<java.lang.Long> r3 = com.google.android.gms.internal.ads.m10.f10372R2
            goto L_0x0058
        L_0x0056:
            com.google.android.gms.internal.ads.e10<java.lang.Long> r3 = com.google.android.gms.internal.ads.m10.f10364Q2
        L_0x0058:
            com.google.android.gms.internal.ads.k10 r7 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r3 = r7.mo8579b(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r7 = r3.longValue()
            e2.d r3 = p054h1.C2694t.m21592a()
            long r9 = r3.mo12463b()
            p054h1.C2694t.m21596e()
            android.content.Context r3 = r14.f12765b
            com.google.android.gms.internal.ads.mq r11 = r14.f12773j
            java.util.concurrent.Future r3 = com.google.android.gms.internal.ads.C2379xq.m19622a(r3, r11)
            r11 = 44
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x0127, InterruptedException -> 0x0104, all -> 0x0101 }
            java.lang.Object r7 = r3.get(r7, r12)     // Catch:{ ExecutionException | TimeoutException -> 0x0127, InterruptedException -> 0x0104, all -> 0x0101 }
            com.google.android.gms.internal.ads.yq r7 = (com.google.android.gms.internal.ads.C2416yq) r7     // Catch:{ ExecutionException | TimeoutException -> 0x0127, InterruptedException -> 0x0104, all -> 0x0101 }
            boolean r8 = r7.mo12074d()     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            r14.f12774k = r8     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            boolean r8 = r7.mo12076f()     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            r14.f12776m = r8     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            boolean r8 = r7.mo12075e()     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            r14.f12777n = r8     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            long r12 = r7.mo12072a()     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            r14.f12778o = r12     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            boolean r8 = r14.m15223n()     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            if (r8 != 0) goto L_0x00d6
            java.io.InputStream r7 = r7.mo12073c()     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            r14.f12770g = r7     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            boolean r7 = r14.f12769f     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            if (r7 == 0) goto L_0x00ae
            r14.m15222m(r15)     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
        L_0x00ae:
            e2.d r15 = p054h1.C2694t.m21592a()
            long r6 = r15.mo12463b()
            long r6 = r6 - r9
            com.google.android.gms.internal.ads.yr0 r15 = r14.f12781r
            com.google.android.gms.internal.ads.as0 r15 = r15.f17852a
            r15.mo5476h0(r2, r6)
            r14.f12775l = r2
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r11)
            r15.append(r1)
            r15.append(r6)
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            p069j1.C3202r1.m24015k(r15)
            return r4
        L_0x00d6:
            e2.d r3 = p054h1.C2694t.m21592a()
            long r3 = r3.mo12463b()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.yr0 r5 = r14.f12781r
            com.google.android.gms.internal.ads.as0 r5 = r5.f17852a
            r5.mo5476h0(r2, r3)
            r14.f12775l = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x014f
        L_0x00fb:
            r15 = move-exception
            goto L_0x0156
        L_0x00fd:
            r4 = r2
            goto L_0x0105
        L_0x00ff:
            r4 = r2
            goto L_0x0128
        L_0x0101:
            r15 = move-exception
            r2 = r6
            goto L_0x0156
        L_0x0104:
            r4 = r6
        L_0x0105:
            r3.cancel(r2)     // Catch:{ all -> 0x0154 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0154 }
            r2.interrupt()     // Catch:{ all -> 0x0154 }
            e2.d r2 = p054h1.C2694t.m21592a()
            long r2 = r2.mo12463b()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.yr0 r5 = r14.f12781r
            com.google.android.gms.internal.ads.as0 r5 = r5.f17852a
            r5.mo5476h0(r4, r2)
            r14.f12775l = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
            goto L_0x0142
        L_0x0127:
            r4 = r6
        L_0x0128:
            r3.cancel(r2)     // Catch:{ all -> 0x0154 }
            e2.d r2 = p054h1.C2694t.m21592a()
            long r2 = r2.mo12463b()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.yr0 r5 = r14.f12781r
            com.google.android.gms.internal.ads.as0 r5 = r5.f17852a
            r5.mo5476h0(r4, r2)
            r14.f12775l = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
        L_0x0142:
            r4.append(r1)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L_0x014f:
            p069j1.C3202r1.m24015k(r0)
            goto L_0x01da
        L_0x0154:
            r15 = move-exception
            r2 = r4
        L_0x0156:
            e2.d r3 = p054h1.C2694t.m21592a()
            long r3 = r3.mo12463b()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.yr0 r5 = r14.f12781r
            com.google.android.gms.internal.ads.as0 r5 = r5.f17852a
            r5.mo5476h0(r2, r3)
            r14.f12775l = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            p069j1.C3202r1.m24015k(r0)
            throw r15
        L_0x017e:
            com.google.android.gms.internal.ads.mq r0 = r14.f12773j
            if (r0 == 0) goto L_0x01a3
            com.google.android.gms.internal.ads.mq r0 = r14.f12773j
            long r7 = r15.f16341c
            r0.f11000m = r7
            com.google.android.gms.internal.ads.mq r0 = r14.f12773j
            java.lang.String r1 = r14.f12767d
            java.lang.String r1 = com.google.android.gms.internal.ads.b53.m6685c(r1)
            r0.f11001n = r1
            com.google.android.gms.internal.ads.mq r0 = r14.f12773j
            int r1 = r14.f12768e
            r0.f11002o = r1
            com.google.android.gms.internal.ads.iq r0 = p054h1.C2694t.m21595d()
            com.google.android.gms.internal.ads.mq r1 = r14.f12773j
            com.google.android.gms.internal.ads.jq r0 = r0.mo8235b(r1)
            goto L_0x01a4
        L_0x01a3:
            r0 = 0
        L_0x01a4:
            if (r0 == 0) goto L_0x01da
            boolean r1 = r0.mo8518g()
            if (r1 == 0) goto L_0x01da
            boolean r1 = r0.mo8517f()
            r14.f12774k = r1
            boolean r1 = r0.mo8520i()
            r14.f12776m = r1
            boolean r1 = r0.mo8519h()
            r14.f12777n = r1
            long r7 = r0.mo8514c()
            r14.f12778o = r7
            r14.f12775l = r2
            boolean r1 = r14.m15223n()
            if (r1 != 0) goto L_0x01da
            java.io.InputStream r0 = r0.mo8516e()
            r14.f12770g = r0
            boolean r0 = r14.f12769f
            if (r0 == 0) goto L_0x01d9
            r14.m15222m(r15)
        L_0x01d9:
            return r4
        L_0x01da:
            r14.f12775l = r6
            com.google.android.gms.internal.ads.mq r0 = r14.f12773j
            if (r0 == 0) goto L_0x01f8
            com.google.android.gms.internal.ads.vl r0 = new com.google.android.gms.internal.ads.vl
            com.google.android.gms.internal.ads.mq r1 = r14.f12773j
            java.lang.String r1 = r1.f10993f
            android.net.Uri r2 = android.net.Uri.parse(r1)
            r3 = 0
            long r4 = r15.f16340b
            long r6 = r15.f16341c
            long r8 = r15.f16342d
            r10 = 0
            r11 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r8, r10, r11)
            r15 = r0
        L_0x01f8:
            com.google.android.gms.internal.ads.tl r0 = r14.f12766c
            long r0 = r0.mo5936e(r15)
            return r0
        L_0x01ff:
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "Attempt to open an already open CacheDataSource."
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pr0.mo5936e(com.google.android.gms.internal.ads.vl):long");
    }

    /* renamed from: f */
    public final long mo10150f() {
        if (this.f12773j == null) {
            return -1;
        }
        if (this.f12780q.get() == -1) {
            synchronized (this) {
                if (this.f12779p == null) {
                    this.f12779p = wo0.f16886a.mo6445C(new or0(this));
                }
            }
            if (!this.f12779p.isDone()) {
                return -1;
            }
            try {
                this.f12780q.compareAndSet(-1, this.f12779p.get().longValue());
            } catch (InterruptedException | ExecutionException unused) {
                return -1;
            }
        }
        return this.f12780q.get();
    }

    /* renamed from: g */
    public final void mo5937g() {
        if (this.f12771h) {
            this.f12771h = false;
            this.f12772i = null;
            InputStream inputStream = this.f12770g;
            if (inputStream != null) {
                C2553j.m21202a(inputStream);
                this.f12770g = null;
                return;
            }
            this.f12766c.mo5937g();
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ Long mo10151h() {
        return Long.valueOf(C2694t.m21595d().mo8234a(this.f12773j));
    }

    /* renamed from: i */
    public final boolean mo10152i() {
        return this.f12774k;
    }

    /* renamed from: j */
    public final boolean mo10153j() {
        return this.f12777n;
    }

    /* renamed from: k */
    public final boolean mo10154k() {
        return this.f12776m;
    }

    /* renamed from: l */
    public final boolean mo10155l() {
        return this.f12775l;
    }
}
