package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import p054h1.C2694t;
import p069j1.C3163g2;

@TargetApi(16)
public final class ct0 extends ts0 implements iq0 {

    /* renamed from: i */
    private jq0 f5512i;

    /* renamed from: j */
    private String f5513j;

    /* renamed from: k */
    private boolean f5514k;

    /* renamed from: l */
    private boolean f5515l;

    /* renamed from: m */
    private ks0 f5516m;

    /* renamed from: n */
    private long f5517n;

    /* renamed from: o */
    private long f5518o;

    public ct0(tq0 tq0, sq0 sq0) {
        super(tq0);
        Context context = tq0.getContext();
        jq0 ut0 = sq0.f14549m ? new ut0(context, sq0, (tq0) this.f15038h.get()) : new as0(context, sq0, (tq0) this.f15038h.get());
        this.f5512i = ut0;
        ut0.mo5446H(this);
    }

    /* renamed from: A */
    private static String m7550A(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 2 + length + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    /* renamed from: B */
    private final void m7551B(long j) {
        C3163g2.f20465i.postDelayed(new bt0(this), j);
    }

    /* renamed from: z */
    protected static final String m7552z(String str) {
        String valueOf = String.valueOf(bo0.m6984e(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    /* renamed from: a */
    public final void mo6283a() {
        jq0 jq0 = this.f5512i;
        if (jq0 != null) {
            jq0.mo5446H((iq0) null);
            this.f5512i.mo5442D();
        }
    }

    /* renamed from: b */
    public final void mo6284b(String str, Exception exc) {
        io0.m11132h("Precache exception", exc);
        C2694t.m21607p().mo11033r(exc, "VideoStreamExoPlayerCache.onException");
    }

    /* renamed from: c */
    public final void mo6285c(boolean z, long j) {
        tq0 tq0 = (tq0) this.f15038h.get();
        if (tq0 != null) {
            wo0.f16890e.execute(new at0(tq0, z, j));
        }
    }

    /* renamed from: d */
    public final void mo6286d(int i, int i2) {
    }

    /* renamed from: e */
    public final void mo6287e(String str, Exception exc) {
        io0.m11132h("Precache error", exc);
        C2694t.m21607p().mo11033r(exc, "VideoStreamExoPlayerCache.onError");
    }

    /* renamed from: g */
    public final void mo6288g() {
        synchronized (this) {
            this.f5514k = true;
            notify();
            mo6283a();
        }
        String str = this.f5513j;
        if (str != null) {
            mo11102h(this.f5513j, m7552z(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    /* renamed from: n */
    public final void mo6289n(int i) {
        this.f5512i.mo5444F(i);
    }

    /* renamed from: o */
    public final void mo6290o(int i) {
        this.f5512i.mo5445G(i);
    }

    /* renamed from: q */
    public final void mo6291q(int i) {
        this.f5512i.mo5447I(i);
    }

    /* renamed from: r */
    public final void mo6292r(int i) {
        this.f5512i.mo5448J(i);
    }

    /* renamed from: s */
    public final void mo6293s(int i) {
    }

    /* renamed from: t */
    public final boolean mo6294t(String str) {
        return mo6295u(str, new String[]{str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009e, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013a, code lost:
        r5 = r45;
        r6 = r46;
        r7 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r5.mo11104j(r6, r7, r3);
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6295u(java.lang.String r46, java.lang.String[] r47) {
        /*
            r45 = this;
            r15 = r45
            r13 = r46
            r0 = r47
            r15.f5513j = r13
            java.lang.String r14 = m7552z(r46)
            java.lang.String r17 = "error"
            r18 = 0
            int r1 = r0.length     // Catch:{ Exception -> 0x01cd }
            android.net.Uri[] r1 = new android.net.Uri[r1]     // Catch:{ Exception -> 0x01cd }
            r2 = r18
        L_0x0015:
            int r3 = r0.length     // Catch:{ Exception -> 0x01cd }
            if (r2 >= r3) goto L_0x0023
            r3 = r0[r2]     // Catch:{ Exception -> 0x01cd }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x01cd }
            r1[r2] = r3     // Catch:{ Exception -> 0x01cd }
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0023:
            com.google.android.gms.internal.ads.jq0 r0 = r15.f5512i     // Catch:{ Exception -> 0x01cd }
            java.lang.String r2 = r15.f15037g     // Catch:{ Exception -> 0x01cd }
            r0.mo5440B(r1, r2)     // Catch:{ Exception -> 0x01cd }
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.tq0> r0 = r15.f15038h     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01cd }
            com.google.android.gms.internal.ads.tq0 r0 = (com.google.android.gms.internal.ads.tq0) r0     // Catch:{ Exception -> 0x01cd }
            if (r0 == 0) goto L_0x0037
            r0.mo7078E(r14, r15)     // Catch:{ Exception -> 0x01cd }
        L_0x0037:
            e2.d r0 = p054h1.C2694t.m21592a()     // Catch:{ Exception -> 0x01cd }
            long r19 = r0.mo12462a()     // Catch:{ Exception -> 0x01cd }
            com.google.android.gms.internal.ads.e10<java.lang.Long> r1 = com.google.android.gms.internal.ads.m10.f10611t     // Catch:{ Exception -> 0x01cd }
            com.google.android.gms.internal.ads.k10 r2 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r1 = r2.mo8579b(r1)     // Catch:{ Exception -> 0x01cd }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01cd }
            long r11 = r1.longValue()     // Catch:{ Exception -> 0x01cd }
            com.google.android.gms.internal.ads.e10<java.lang.Long> r1 = com.google.android.gms.internal.ads.m10.f10603s     // Catch:{ Exception -> 0x01cd }
            com.google.android.gms.internal.ads.k10 r2 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r1 = r2.mo8579b(r1)     // Catch:{ Exception -> 0x01cd }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01cd }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x01cd }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r9 = r1 * r3
            com.google.android.gms.internal.ads.e10<java.lang.Integer> r1 = com.google.android.gms.internal.ads.m10.f10594r     // Catch:{ Exception -> 0x01cd }
            com.google.android.gms.internal.ads.k10 r2 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r1 = r2.mo8579b(r1)     // Catch:{ Exception -> 0x01cd }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x01cd }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x01cd }
            long r6 = (long) r1     // Catch:{ Exception -> 0x01cd }
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.m10.f10596r1     // Catch:{ Exception -> 0x01cd }
            com.google.android.gms.internal.ads.k10 r2 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ Exception -> 0x01cd }
            java.lang.Object r1 = r2.mo8579b(r1)     // Catch:{ Exception -> 0x01cd }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x01cd }
            boolean r21 = r1.booleanValue()     // Catch:{ Exception -> 0x01cd }
            r22 = -1
            r1 = r22
        L_0x0088:
            monitor-enter(r45)     // Catch:{ Exception -> 0x01cd }
            long r3 = r0.mo12462a()     // Catch:{ all -> 0x01c5 }
            long r3 = r3 - r19
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 > 0) goto L_0x0198
            boolean r3 = r15.f5514k     // Catch:{ all -> 0x01c5 }
            if (r3 != 0) goto L_0x018b
            boolean r3 = r15.f5515l     // Catch:{ all -> 0x01c5 }
            r24 = 1
            if (r3 == 0) goto L_0x00a1
            monitor-exit(r45)     // Catch:{ all -> 0x01c5 }
            r5 = r15
            goto L_0x015a
        L_0x00a1:
            com.google.android.gms.internal.ads.jq0 r3 = r15.f5512i     // Catch:{ all -> 0x01c5 }
            boolean r3 = r3.mo5455Q()     // Catch:{ all -> 0x01c5 }
            if (r3 == 0) goto L_0x017e
            com.google.android.gms.internal.ads.jq0 r3 = r15.f5512i     // Catch:{ all -> 0x01c5 }
            long r4 = r3.mo5463a0()     // Catch:{ all -> 0x01c5 }
            r25 = 0
            int r3 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r3 <= 0) goto L_0x015e
            com.google.android.gms.internal.ads.jq0 r3 = r15.f5512i     // Catch:{ all -> 0x01c5 }
            long r27 = r3.mo5459W()     // Catch:{ all -> 0x01c5 }
            int r3 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x012d
            int r1 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c6
            r8 = r24
            goto L_0x00c8
        L_0x00c6:
            r8 = r18
        L_0x00c8:
            if (r21 == 0) goto L_0x00d3
            com.google.android.gms.internal.ads.jq0 r1 = r15.f5512i     // Catch:{ all -> 0x01c5 }
            long r1 = r1.mo5465b0()     // Catch:{ all -> 0x01c5 }
            r29 = r1
            goto L_0x00d5
        L_0x00d3:
            r29 = r22
        L_0x00d5:
            if (r21 == 0) goto L_0x00e0
            com.google.android.gms.internal.ads.jq0 r1 = r15.f5512i     // Catch:{ all -> 0x01c5 }
            long r1 = r1.mo5461Y()     // Catch:{ all -> 0x01c5 }
            r31 = r1
            goto L_0x00e2
        L_0x00e0:
            r31 = r22
        L_0x00e2:
            if (r21 == 0) goto L_0x00ed
            com.google.android.gms.internal.ads.jq0 r1 = r15.f5512i     // Catch:{ all -> 0x01c5 }
            long r1 = r1.mo5467c0()     // Catch:{ all -> 0x01c5 }
            r33 = r1
            goto L_0x00ef
        L_0x00ed:
            r33 = r22
        L_0x00ef:
            int r16 = com.google.android.gms.internal.ads.jq0.m11778T()     // Catch:{ all -> 0x0125 }
            int r35 = com.google.android.gms.internal.ads.jq0.m11779V()     // Catch:{ all -> 0x0125 }
            r1 = r45
            r2 = r46
            r3 = r14
            r36 = r4
            r4 = r27
            r38 = r6
            r6 = r36
            r40 = r9
            r9 = r29
            r42 = r11
            r11 = r31
            r44 = r14
            r13 = r33
            r15 = r16
            r16 = r35
            r1.mo11106m(r2, r3, r4, r6, r8, r9, r11, r13, r15, r16)     // Catch:{ all -> 0x011c }
            r1 = r27
            r3 = r36
            goto L_0x0136
        L_0x011c:
            r0 = move-exception
            r5 = r45
            r6 = r46
            r7 = r44
            goto L_0x01c9
        L_0x0125:
            r0 = move-exception
            r5 = r45
            r6 = r46
            r7 = r14
            goto L_0x01c9
        L_0x012d:
            r38 = r6
            r40 = r9
            r42 = r11
            r44 = r14
            r3 = r4
        L_0x0136:
            int r5 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0145
            r5 = r45
            r6 = r46
            r7 = r44
            r5.mo11104j(r6, r7, r3)     // Catch:{ all -> 0x01c3 }
        L_0x0143:
            monitor-exit(r45)     // Catch:{ all -> 0x01c3 }
            goto L_0x015a
        L_0x0145:
            r5 = r45
            r6 = r46
            r7 = r44
            com.google.android.gms.internal.ads.jq0 r3 = r5.f5512i     // Catch:{ all -> 0x01c3 }
            long r3 = r3.mo5460X()     // Catch:{ all -> 0x01c3 }
            int r3 = (r3 > r38 ? 1 : (r3 == r38 ? 0 : -1))
            if (r3 < 0) goto L_0x015b
            int r3 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r3 <= 0) goto L_0x015b
            goto L_0x0143
        L_0x015a:
            return r24
        L_0x015b:
            r3 = r42
            goto L_0x0166
        L_0x015e:
            r38 = r6
            r40 = r9
            r6 = r13
            r7 = r14
            r5 = r15
            r3 = r11
        L_0x0166:
            r5.wait(r3)     // Catch:{ InterruptedException -> 0x0174 }
            monitor-exit(r45)     // Catch:{ all -> 0x01c3 }
            r11 = r3
            r15 = r5
            r13 = r6
            r14 = r7
            r6 = r38
            r9 = r40
            goto L_0x0088
        L_0x0174:
            java.lang.String r1 = "interrupted"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01bf }
            java.lang.String r2 = "Wait interrupted."
            r0.<init>(r2)     // Catch:{ all -> 0x01bf }
            throw r0     // Catch:{ all -> 0x01bf }
        L_0x017e:
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01bf }
            java.lang.String r2 = "ExoPlayer was released during preloading."
            r0.<init>(r2)     // Catch:{ all -> 0x01bf }
            throw r0     // Catch:{ all -> 0x01bf }
        L_0x018b:
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01bf }
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch:{ all -> 0x01bf }
            throw r0     // Catch:{ all -> 0x01bf }
        L_0x0198:
            r40 = r9
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "downloadTimeout"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01bf }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bf }
            r3 = 47
            r2.<init>(r3)     // Catch:{ all -> 0x01bf }
            java.lang.String r3 = "Timeout reached. Limit: "
            r2.append(r3)     // Catch:{ all -> 0x01bf }
            r3 = r40
            r2.append(r3)     // Catch:{ all -> 0x01bf }
            java.lang.String r3 = " ms"
            r2.append(r3)     // Catch:{ all -> 0x01bf }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01bf }
            r0.<init>(r2)     // Catch:{ all -> 0x01bf }
            throw r0     // Catch:{ all -> 0x01bf }
        L_0x01bf:
            r0 = move-exception
            r17 = r1
            goto L_0x01c9
        L_0x01c3:
            r0 = move-exception
            goto L_0x01c9
        L_0x01c5:
            r0 = move-exception
            r6 = r13
            r7 = r14
            r5 = r15
        L_0x01c9:
            monitor-exit(r45)     // Catch:{ all -> 0x01c3 }
            throw r0     // Catch:{ Exception -> 0x01cb }
        L_0x01cb:
            r0 = move-exception
            goto L_0x01d1
        L_0x01cd:
            r0 = move-exception
            r6 = r13
            r7 = r14
            r5 = r15
        L_0x01d1:
            r1 = r17
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r46)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r3 = r3 + 34
            int r3 = r3 + r4
            r8.<init>(r3)
            java.lang.String r3 = "Failed to preload url "
            r8.append(r3)
            r8.append(r6)
            java.lang.String r3 = " Exception: "
            r8.append(r3)
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.google.android.gms.internal.ads.io0.m11131g(r2)
            com.google.android.gms.internal.ads.tn0 r2 = p054h1.C2694t.m21607p()
            java.lang.String r3 = "VideoStreamExoPlayerCache.preload"
            r2.mo11033r(r0, r3)
            r45.mo6283a()
            java.lang.String r0 = m7550A(r1, r0)
            r5.mo11102h(r6, r7, r1, r0)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ct0.mo6295u(java.lang.String, java.lang.String[]):boolean");
    }

    /* renamed from: v */
    public final boolean mo6296v(String str, String[] strArr, ks0 ks0) {
        this.f5513j = str;
        this.f5516m = ks0;
        String z = m7552z(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.f5512i.mo5440B(uriArr, this.f15037g);
            tq0 tq0 = (tq0) this.f15038h.get();
            if (tq0 != null) {
                tq0.mo7078E(z, this);
            }
            this.f5517n = C2694t.m21592a().mo12462a();
            this.f5518o = -1;
            m7551B(0);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            io0.m11131g(sb.toString());
            C2694t.m21607p().mo11033r(e, "VideoStreamExoPlayerCache.preload");
            mo6283a();
            mo11102h(str, z, "error", m7550A("error", e));
            return false;
        }
    }

    /* renamed from: w */
    public final jq0 mo6297w() {
        synchronized (this) {
            this.f5515l = true;
            notify();
        }
        this.f5512i.mo5446H((iq0) null);
        jq0 jq0 = this.f5512i;
        this.f5512i = null;
        return jq0;
    }

    /* renamed from: x */
    public final void mo6298x() {
        io0.m11131g("Precache onRenderedFirstFrame");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: com.google.android.gms.internal.ads.ct0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: com.google.android.gms.internal.ads.ct0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: com.google.android.gms.internal.ads.ct0} */
    /* JADX WARNING: type inference failed for: r2v11, types: [boolean] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010c, code lost:
        r2.m7551B(((java.lang.Long) com.google.android.gms.internal.ads.C2199sw.m17001c().mo8579b(com.google.android.gms.internal.ads.m10.f10611t)).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011f, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo6299y() {
        /*
            r32 = this;
            r15 = r32
            java.lang.String r0 = r15.f5513j
            java.lang.String r13 = m7552z(r0)
            java.lang.String r17 = "error"
            com.google.android.gms.internal.ads.e10<java.lang.Long> r0 = com.google.android.gms.internal.ads.m10.f10603s     // Catch:{ Exception -> 0x016b }
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ Exception -> 0x016b }
            java.lang.Object r0 = r1.mo8579b(r0)     // Catch:{ Exception -> 0x016b }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x016b }
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x016b }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            com.google.android.gms.internal.ads.e10<java.lang.Integer> r2 = com.google.android.gms.internal.ads.m10.f10594r     // Catch:{ Exception -> 0x016b }
            com.google.android.gms.internal.ads.k10 r3 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ Exception -> 0x016b }
            java.lang.Object r2 = r3.mo8579b(r2)     // Catch:{ Exception -> 0x016b }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x016b }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x016b }
            long r11 = (long) r2     // Catch:{ Exception -> 0x016b }
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.m10.f10596r1     // Catch:{ Exception -> 0x016b }
            com.google.android.gms.internal.ads.k10 r3 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ Exception -> 0x016b }
            java.lang.Object r2 = r3.mo8579b(r2)     // Catch:{ Exception -> 0x016b }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x016b }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x016b }
            monitor-enter(r32)     // Catch:{ Exception -> 0x016b }
            e2.d r3 = p054h1.C2694t.m21592a()     // Catch:{ all -> 0x0164 }
            long r3 = r3.mo12462a()     // Catch:{ all -> 0x0164 }
            long r5 = r15.f5517n     // Catch:{ all -> 0x0164 }
            long r3 = r3 - r5
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x013c
            boolean r0 = r15.f5514k     // Catch:{ all -> 0x0164 }
            if (r0 != 0) goto L_0x012c
            boolean r0 = r15.f5515l     // Catch:{ all -> 0x0164 }
            if (r0 == 0) goto L_0x005a
            monitor-exit(r32)     // Catch:{ all -> 0x0164 }
            r2 = r15
            goto L_0x01ba
        L_0x005a:
            com.google.android.gms.internal.ads.jq0 r0 = r15.f5512i     // Catch:{ all -> 0x0164 }
            boolean r0 = r0.mo5455Q()     // Catch:{ all -> 0x0164 }
            if (r0 == 0) goto L_0x0120
            com.google.android.gms.internal.ads.jq0 r0 = r15.f5512i     // Catch:{ all -> 0x0164 }
            long r9 = r0.mo5463a0()     // Catch:{ all -> 0x0164 }
            r18 = 0
            int r0 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0109
            com.google.android.gms.internal.ads.jq0 r0 = r15.f5512i     // Catch:{ all -> 0x0164 }
            long r6 = r0.mo5459W()     // Catch:{ all -> 0x0164 }
            long r0 = r15.f5518o     // Catch:{ all -> 0x0164 }
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00de
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0080
            r0 = 1
            goto L_0x0081
        L_0x0080:
            r0 = 0
        L_0x0081:
            r8 = r0
            java.lang.String r0 = r15.f5513j     // Catch:{ all -> 0x00d9 }
            r3 = -1
            if (r2 == 0) goto L_0x008f
            com.google.android.gms.internal.ads.jq0 r1 = r15.f5512i     // Catch:{ all -> 0x0164 }
            long r20 = r1.mo5465b0()     // Catch:{ all -> 0x0164 }
            goto L_0x0091
        L_0x008f:
            r20 = r3
        L_0x0091:
            if (r2 == 0) goto L_0x009a
            com.google.android.gms.internal.ads.jq0 r1 = r15.f5512i     // Catch:{ all -> 0x0164 }
            long r22 = r1.mo5461Y()     // Catch:{ all -> 0x0164 }
            goto L_0x009c
        L_0x009a:
            r22 = r3
        L_0x009c:
            if (r2 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.jq0 r1 = r15.f5512i     // Catch:{ all -> 0x0164 }
            long r1 = r1.mo5467c0()     // Catch:{ all -> 0x0164 }
            r24 = r1
            goto L_0x00a9
        L_0x00a7:
            r24 = r3
        L_0x00a9:
            int r16 = com.google.android.gms.internal.ads.jq0.m11778T()     // Catch:{ all -> 0x00d9 }
            int r26 = com.google.android.gms.internal.ads.jq0.m11779V()     // Catch:{ all -> 0x00d9 }
            r1 = r32
            r2 = r0
            r3 = r13
            r4 = r6
            r27 = r6
            r6 = r9
            r29 = r9
            r9 = r20
            r20 = r11
            r11 = r22
            r31 = r13
            r13 = r24
            r15 = r16
            r16 = r26
            r1.mo11106m(r2, r3, r4, r6, r8, r9, r11, r13, r15, r16)     // Catch:{ all -> 0x00d5 }
            r2 = r32
            r0 = r27
            r2.f5518o = r0     // Catch:{ all -> 0x00f3 }
            r3 = r29
            goto L_0x00e5
        L_0x00d5:
            r0 = move-exception
            r2 = r32
            goto L_0x00f4
        L_0x00d9:
            r0 = move-exception
            r2 = r15
            r5 = r13
            goto L_0x0167
        L_0x00de:
            r0 = r6
            r20 = r11
            r31 = r13
            r2 = r15
            r3 = r9
        L_0x00e5:
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x00f8
            java.lang.String r0 = r2.f5513j     // Catch:{ all -> 0x00f3 }
            r5 = r31
            r2.mo11104j(r0, r5, r3)     // Catch:{ all -> 0x0162 }
        L_0x00f0:
            monitor-exit(r32)     // Catch:{ all -> 0x0162 }
            goto L_0x01ba
        L_0x00f3:
            r0 = move-exception
        L_0x00f4:
            r5 = r31
            goto L_0x0167
        L_0x00f8:
            r5 = r31
            com.google.android.gms.internal.ads.jq0 r3 = r2.f5512i     // Catch:{ all -> 0x0162 }
            long r3 = r3.mo5460X()     // Catch:{ all -> 0x0162 }
            int r3 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r3 < 0) goto L_0x010b
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x010b
            goto L_0x00f0
        L_0x0109:
            r5 = r13
            r2 = r15
        L_0x010b:
            monitor-exit(r32)     // Catch:{ all -> 0x0162 }
            com.google.android.gms.internal.ads.e10<java.lang.Long> r0 = com.google.android.gms.internal.ads.m10.f10611t
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r0 = r1.mo8579b(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2.m7551B(r0)
            return
        L_0x0120:
            r5 = r13
            r2 = r15
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = "ExoPlayer was released during preloading."
            r0.<init>(r3)     // Catch:{ all -> 0x0138 }
            throw r0     // Catch:{ all -> 0x0138 }
        L_0x012c:
            r5 = r13
            r2 = r15
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = "Abort requested before buffering finished. "
            r0.<init>(r3)     // Catch:{ all -> 0x0138 }
            throw r0     // Catch:{ all -> 0x0138 }
        L_0x0138:
            r0 = move-exception
            r17 = r1
            goto L_0x0167
        L_0x013c:
            r5 = r13
            r2 = r15
            java.lang.String r3 = "downloadTimeout"
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x015e }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x015e }
            r7 = 47
            r6.<init>(r7)     // Catch:{ all -> 0x015e }
            java.lang.String r7 = "Timeout reached. Limit: "
            r6.append(r7)     // Catch:{ all -> 0x015e }
            r6.append(r0)     // Catch:{ all -> 0x015e }
            java.lang.String r0 = " ms"
            r6.append(r0)     // Catch:{ all -> 0x015e }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x015e }
            r4.<init>(r0)     // Catch:{ all -> 0x015e }
            throw r4     // Catch:{ all -> 0x015e }
        L_0x015e:
            r0 = move-exception
            r17 = r3
            goto L_0x0167
        L_0x0162:
            r0 = move-exception
            goto L_0x0167
        L_0x0164:
            r0 = move-exception
            r5 = r13
            r2 = r15
        L_0x0167:
            monitor-exit(r32)     // Catch:{ all -> 0x0162 }
            throw r0     // Catch:{ Exception -> 0x0169 }
        L_0x0169:
            r0 = move-exception
            goto L_0x016e
        L_0x016b:
            r0 = move-exception
            r5 = r13
            r2 = r15
        L_0x016e:
            r1 = r17
            java.lang.String r3 = r2.f5513j
            java.lang.String r4 = r0.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.String r7 = java.lang.String.valueOf(r4)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r6 = r6 + 34
            int r6 = r6 + r7
            r8.<init>(r6)
            java.lang.String r6 = "Failed to preload url "
            r8.append(r6)
            r8.append(r3)
            java.lang.String r3 = " Exception: "
            r8.append(r3)
            r8.append(r4)
            java.lang.String r3 = r8.toString()
            com.google.android.gms.internal.ads.io0.m11131g(r3)
            com.google.android.gms.internal.ads.tn0 r3 = p054h1.C2694t.m21607p()
            java.lang.String r4 = "VideoStreamExoPlayerCache.preload"
            r3.mo11033r(r0, r4)
            r32.mo6283a()
            java.lang.String r0 = m7550A(r1, r0)
            java.lang.String r3 = r2.f5513j
            r2.mo11102h(r3, r5, r1, r0)
        L_0x01ba:
            com.google.android.gms.internal.ads.ls0 r0 = p054h1.C2694t.m21617z()
            com.google.android.gms.internal.ads.ks0 r1 = r2.f5516m
            r0.mo9012j(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ct0.mo6299y():void");
    }
}
