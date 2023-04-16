package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import p034e2.C2553j;
import p054h1.C2694t;

public final class ht0 extends eb1 {

    /* renamed from: e */
    private final Context f8406e;

    /* renamed from: f */
    private final he1 f8407f;

    /* renamed from: g */
    private final String f8408g;

    /* renamed from: h */
    private final int f8409h;

    /* renamed from: i */
    private final boolean f8410i = ((Boolean) C2199sw.m17001c().mo8579b(m10.f10596r1)).booleanValue();

    /* renamed from: j */
    private InputStream f8411j;

    /* renamed from: k */
    private boolean f8412k;

    /* renamed from: l */
    private Uri f8413l;

    /* renamed from: m */
    private volatile C1971mq f8414m;

    /* renamed from: n */
    private boolean f8415n = false;

    /* renamed from: o */
    private boolean f8416o = false;

    /* renamed from: p */
    private boolean f8417p = false;

    /* renamed from: q */
    private boolean f8418q = false;

    /* renamed from: r */
    private long f8419r = 0;

    /* renamed from: s */
    private cc3<Long> f8420s = null;

    /* renamed from: t */
    private final AtomicLong f8421t = new AtomicLong(-1);

    /* renamed from: u */
    private final st0 f8422u;

    public ht0(Context context, he1 he1, String str, int i, vt1 vt1, st0 st0, byte[] bArr) {
        super(false);
        this.f8406e = context;
        this.f8407f = he1;
        this.f8422u = st0;
        this.f8408g = str;
        this.f8409h = i;
        mo6892j(vt1);
    }

    /* renamed from: z */
    private final boolean m10763z() {
        if (!this.f8410i) {
            return false;
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10380S2)).booleanValue() && !this.f8417p) {
            return true;
        }
        return ((Boolean) C2199sw.m17001c().mo8579b(m10.f10388T2)).booleanValue() && !this.f8418q;
    }

    /* renamed from: a */
    public final int mo5752a(byte[] bArr, int i, int i2) {
        if (this.f8412k) {
            InputStream inputStream = this.f8411j;
            int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.f8407f.mo5752a(bArr, i, i2);
            if (!this.f8410i || this.f8411j != null) {
                mo6893o(read);
            }
            return read;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* renamed from: h */
    public final Uri mo5753h() {
        return this.f8413l;
    }

    /* renamed from: i */
    public final void mo5754i() {
        if (this.f8412k) {
            boolean z = false;
            this.f8412k = false;
            this.f8413l = null;
            if (!this.f8410i || this.f8411j != null) {
                z = true;
            }
            InputStream inputStream = this.f8411j;
            if (inputStream != null) {
                C2553j.m21202a(inputStream);
                this.f8411j = null;
            } else {
                this.f8407f.mo5754i();
            }
            if (z) {
                mo6894p();
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed GcacheDataSource.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e0  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x0105=Splitter:B:34:0x0105, B:39:0x0128=Splitter:B:39:0x0128} */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo5755k(com.google.android.gms.internal.ads.li1 r15) {
        /*
            r14 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "Cache connection took "
            boolean r2 = r14.f8412k
            if (r2 != 0) goto L_0x0200
            r2 = 1
            r14.f8412k = r2
            android.net.Uri r3 = r15.f10058a
            r14.f8413l = r3
            boolean r3 = r14.f8410i
            if (r3 != 0) goto L_0x0016
            r14.mo6896r(r15)
        L_0x0016:
            android.net.Uri r3 = r15.f10058a
            com.google.android.gms.internal.ads.mq r3 = com.google.android.gms.internal.ads.C1971mq.m13448c(r3)
            r14.f8414m = r3
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.m10.f10356P2
            com.google.android.gms.internal.ads.k10 r4 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r3 = r4.mo8579b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = -1
            r6 = 0
            if (r3 == 0) goto L_0x017e
            com.google.android.gms.internal.ads.mq r3 = r14.f8414m
            if (r3 == 0) goto L_0x01da
            com.google.android.gms.internal.ads.mq r3 = r14.f8414m
            long r7 = r15.f10063f
            r3.f11000m = r7
            com.google.android.gms.internal.ads.mq r3 = r14.f8414m
            java.lang.String r7 = r14.f8408g
            java.lang.String r7 = com.google.android.gms.internal.ads.b53.m6685c(r7)
            r3.f11001n = r7
            com.google.android.gms.internal.ads.mq r3 = r14.f8414m
            int r7 = r14.f8409h
            r3.f11002o = r7
            com.google.android.gms.internal.ads.mq r3 = r14.f8414m
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
            android.content.Context r3 = r14.f8406e
            com.google.android.gms.internal.ads.mq r11 = r14.f8414m
            java.util.concurrent.Future r3 = com.google.android.gms.internal.ads.C2379xq.m19622a(r3, r11)
            r11 = 44
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x0127, InterruptedException -> 0x0104, all -> 0x0101 }
            java.lang.Object r7 = r3.get(r7, r12)     // Catch:{ ExecutionException | TimeoutException -> 0x0127, InterruptedException -> 0x0104, all -> 0x0101 }
            com.google.android.gms.internal.ads.yq r7 = (com.google.android.gms.internal.ads.C2416yq) r7     // Catch:{ ExecutionException | TimeoutException -> 0x0127, InterruptedException -> 0x0104, all -> 0x0101 }
            boolean r8 = r7.mo12074d()     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            r14.f8415n = r8     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            boolean r8 = r7.mo12076f()     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            r14.f8417p = r8     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            boolean r8 = r7.mo12075e()     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            r14.f8418q = r8     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            long r12 = r7.mo12072a()     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            r14.f8419r = r12     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            boolean r8 = r14.m10763z()     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            if (r8 != 0) goto L_0x00d6
            java.io.InputStream r7 = r7.mo12073c()     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            r14.f8411j = r7     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            boolean r7 = r14.f8410i     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
            if (r7 == 0) goto L_0x00ae
            r14.mo6896r(r15)     // Catch:{ ExecutionException | TimeoutException -> 0x00ff, InterruptedException -> 0x00fd, all -> 0x00fb }
        L_0x00ae:
            e2.d r15 = p054h1.C2694t.m21592a()
            long r6 = r15.mo12463b()
            long r6 = r6 - r9
            com.google.android.gms.internal.ads.st0 r15 = r14.f8422u
            com.google.android.gms.internal.ads.ut0 r15 = r15.f14582a
            r15.mo11298e0(r2, r6)
            r14.f8416o = r2
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
            com.google.android.gms.internal.ads.st0 r5 = r14.f8422u
            com.google.android.gms.internal.ads.ut0 r5 = r5.f14582a
            r5.mo11298e0(r2, r3)
            r14.f8416o = r2
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
            com.google.android.gms.internal.ads.st0 r5 = r14.f8422u
            com.google.android.gms.internal.ads.ut0 r5 = r5.f14582a
            r5.mo11298e0(r4, r2)
            r14.f8416o = r4
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
            com.google.android.gms.internal.ads.st0 r5 = r14.f8422u
            com.google.android.gms.internal.ads.ut0 r5 = r5.f14582a
            r5.mo11298e0(r4, r2)
            r14.f8416o = r4
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
            com.google.android.gms.internal.ads.st0 r5 = r14.f8422u
            com.google.android.gms.internal.ads.ut0 r5 = r5.f14582a
            r5.mo11298e0(r2, r3)
            r14.f8416o = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            p069j1.C3202r1.m24015k(r0)
            throw r15
        L_0x017e:
            com.google.android.gms.internal.ads.mq r0 = r14.f8414m
            if (r0 == 0) goto L_0x01a3
            com.google.android.gms.internal.ads.mq r0 = r14.f8414m
            long r7 = r15.f10063f
            r0.f11000m = r7
            com.google.android.gms.internal.ads.mq r0 = r14.f8414m
            java.lang.String r1 = r14.f8408g
            java.lang.String r1 = com.google.android.gms.internal.ads.b53.m6685c(r1)
            r0.f11001n = r1
            com.google.android.gms.internal.ads.mq r0 = r14.f8414m
            int r1 = r14.f8409h
            r0.f11002o = r1
            com.google.android.gms.internal.ads.iq r0 = p054h1.C2694t.m21595d()
            com.google.android.gms.internal.ads.mq r1 = r14.f8414m
            com.google.android.gms.internal.ads.jq r0 = r0.mo8235b(r1)
            goto L_0x01a4
        L_0x01a3:
            r0 = 0
        L_0x01a4:
            if (r0 == 0) goto L_0x01da
            boolean r1 = r0.mo8518g()
            if (r1 == 0) goto L_0x01da
            boolean r1 = r0.mo8517f()
            r14.f8415n = r1
            boolean r1 = r0.mo8520i()
            r14.f8417p = r1
            boolean r1 = r0.mo8519h()
            r14.f8418q = r1
            long r7 = r0.mo8514c()
            r14.f8419r = r7
            r14.f8416o = r2
            boolean r1 = r14.m10763z()
            if (r1 != 0) goto L_0x01da
            java.io.InputStream r0 = r0.mo8516e()
            r14.f8411j = r0
            boolean r0 = r14.f8410i
            if (r0 == 0) goto L_0x01d9
            r14.mo6896r(r15)
        L_0x01d9:
            return r4
        L_0x01da:
            r14.f8416o = r6
            com.google.android.gms.internal.ads.mq r0 = r14.f8414m
            if (r0 == 0) goto L_0x01f9
            com.google.android.gms.internal.ads.li1 r0 = new com.google.android.gms.internal.ads.li1
            com.google.android.gms.internal.ads.mq r1 = r14.f8414m
            java.lang.String r1 = r1.f10993f
            android.net.Uri r2 = android.net.Uri.parse(r1)
            long r4 = r15.f10062e
            long r6 = r15.f10063f
            long r8 = r15.f10064g
            r3 = 0
            r10 = 0
            int r11 = r15.f10066i
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r8, r10, r11)
            r15 = r0
        L_0x01f9:
            com.google.android.gms.internal.ads.he1 r0 = r14.f8407f
            long r0 = r0.mo5755k(r15)
            return r0
        L_0x0200:
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "Attempt to open an already open GcacheDataSource."
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ht0.mo5755k(com.google.android.gms.internal.ads.li1):long");
    }

    /* renamed from: s */
    public final long mo8010s() {
        return this.f8419r;
    }

    /* renamed from: t */
    public final long mo8011t() {
        if (this.f8414m == null) {
            return -1;
        }
        if (this.f8421t.get() == -1) {
            synchronized (this) {
                if (this.f8420s == null) {
                    this.f8420s = wo0.f16886a.mo6445C(new gt0(this));
                }
            }
            if (!this.f8420s.isDone()) {
                return -1;
            }
            try {
                this.f8421t.compareAndSet(-1, this.f8420s.get().longValue());
            } catch (InterruptedException | ExecutionException unused) {
                return -1;
            }
        }
        return this.f8421t.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ Long mo8012u() {
        return Long.valueOf(C2694t.m21595d().mo8234a(this.f8414m));
    }

    /* renamed from: v */
    public final boolean mo8013v() {
        return this.f8415n;
    }

    /* renamed from: w */
    public final boolean mo8014w() {
        return this.f8418q;
    }

    /* renamed from: x */
    public final boolean mo8015x() {
        return this.f8417p;
    }

    /* renamed from: y */
    public final boolean mo8016y() {
        return this.f8416o;
    }
}
