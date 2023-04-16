package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zs0 extends ts0 implements C1819im<C2225tl> {

    /* renamed from: i */
    private String f18344i;

    /* renamed from: j */
    private final sq0 f18345j;

    /* renamed from: k */
    private boolean f18346k;

    /* renamed from: l */
    private final ys0 f18347l = new ys0();

    /* renamed from: m */
    private final ds0 f18348m = new ds0();

    /* renamed from: n */
    private ByteBuffer f18349n;

    /* renamed from: o */
    private boolean f18350o;

    /* renamed from: p */
    private final Object f18351p = new Object();

    /* renamed from: q */
    private final String f18352q;

    /* renamed from: r */
    private final int f18353r;

    /* renamed from: s */
    private boolean f18354s;

    public zs0(tq0 tq0, sq0 sq0) {
        super(tq0);
        this.f18345j = sq0;
        this.f18352q = tq0 != null ? tq0.mo11071q() : "";
        this.f18353r = tq0 != null ? tq0.mo11066f() : 0;
    }

    /* renamed from: A */
    protected static final String m20820A(String str) {
        String valueOf = String.valueOf(bo0.m6984e(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    /* renamed from: B */
    private final void m20821B() {
        int a = (int) this.f18347l.mo12080a();
        int a2 = (int) this.f18348m.mo6619a(this.f18349n);
        int position = this.f18349n.position();
        int round = Math.round(((float) a2) * (((float) position) / ((float) a)));
        boolean z = round > 0;
        int T = jq0.m11778T();
        int V = jq0.m11779V();
        String str = this.f18344i;
        mo11105l(str, m20820A(str), position, a, (long) round, (long) a2, z, T, V);
    }

    /* renamed from: g */
    public final void mo6288g() {
        this.f18346k = true;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo5480k(Object obj, C2299vl vlVar) {
        this.f18347l.mo12081b((C2411yl) obj);
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ void mo5484p(Object obj, int i) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.gms.internal.ads.yl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.internal.ads.yl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: com.google.android.gms.internal.ads.pr0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: com.google.android.gms.internal.ads.yl} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d1, code lost:
        if (r9.f18349n.remaining() > 0) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d3, code lost:
        m20821B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00da, code lost:
        if (r9.f18346k != false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dc, code lost:
        r12 = r1.mo12462a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e4, code lost:
        if ((r12 - r16) < r4) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e6, code lost:
        m20821B();
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f2, code lost:
        if ((r12 - r2) > (1000 * r6)) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r0 = new java.lang.StringBuilder(49);
        r0.append("Timeout exceeded. Limit: ");
        r0.append(r6);
        r0.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0119, code lost:
        throw new java.io.IOException(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011c, code lost:
        r12 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r1 = r9.f18349n.limit();
        r2 = new java.lang.StringBuilder(35);
        r2.append("Precache abort at ");
        r2.append(r1);
        r2.append(" bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0141, code lost:
        throw new java.io.IOException(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0142, code lost:
        r0 = e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6294t(java.lang.String r27) {
        /*
            r26 = this;
            r9 = r26
            r10 = r27
            r9.f18344i = r10
            java.lang.String r11 = m20820A(r27)
            java.lang.String r12 = "error"
            r13 = 0
            com.google.android.gms.internal.ads.yl r0 = new com.google.android.gms.internal.ads.yl     // Catch:{ Exception -> 0x014b }
            java.lang.String r2 = r9.f15037g     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.sq0 r1 = r9.f18345j     // Catch:{ Exception -> 0x014b }
            int r5 = r1.f14540d     // Catch:{ Exception -> 0x014b }
            r3 = 0
            int r6 = r1.f14542f     // Catch:{ Exception -> 0x014b }
            r7 = 1
            r8 = 0
            r1 = r0
            r4 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.sq0 r1 = r9.f18345j     // Catch:{ Exception -> 0x014b }
            boolean r1 = r1.f14546j     // Catch:{ Exception -> 0x014b }
            if (r1 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.pr0 r15 = new com.google.android.gms.internal.ads.pr0     // Catch:{ Exception -> 0x014b }
            android.content.Context r2 = r9.f15036f     // Catch:{ Exception -> 0x014b }
            java.lang.String r4 = r9.f18352q     // Catch:{ Exception -> 0x014b }
            int r5 = r9.f18353r     // Catch:{ Exception -> 0x014b }
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r15
            r3 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x014b }
            r0 = r15
        L_0x0037:
            android.net.Uri r16 = android.net.Uri.parse(r27)     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.vl r1 = new com.google.android.gms.internal.ads.vl     // Catch:{ Exception -> 0x014b }
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = -1
            r24 = 0
            r25 = 0
            r15 = r1
            r15.<init>(r16, r17, r18, r20, r22, r24, r25)     // Catch:{ Exception -> 0x014b }
            r0.mo5936e(r1)     // Catch:{ Exception -> 0x014b }
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.tq0> r1 = r9.f15038h     // Catch:{ Exception -> 0x014b }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.tq0 r1 = (com.google.android.gms.internal.ads.tq0) r1     // Catch:{ Exception -> 0x014b }
            if (r1 == 0) goto L_0x005d
            r1.mo7078E(r11, r9)     // Catch:{ Exception -> 0x014b }
        L_0x005d:
            e2.d r1 = p054h1.C2694t.m21592a()     // Catch:{ Exception -> 0x014b }
            long r2 = r1.mo12462a()     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.e10<java.lang.Long> r4 = com.google.android.gms.internal.ads.m10.f10611t     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.k10 r5 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ Exception -> 0x014b }
            java.lang.Object r4 = r5.mo8579b(r4)     // Catch:{ Exception -> 0x014b }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x014b }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.e10<java.lang.Long> r6 = com.google.android.gms.internal.ads.m10.f10603s     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.k10 r7 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ Exception -> 0x014b }
            java.lang.Object r6 = r7.mo8579b(r6)     // Catch:{ Exception -> 0x014b }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x014b }
            long r6 = r6.longValue()     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.sq0 r8 = r9.f18345j     // Catch:{ Exception -> 0x014b }
            int r8 = r8.f14539c     // Catch:{ Exception -> 0x014b }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ Exception -> 0x014b }
            r9.f18349n = r8     // Catch:{ Exception -> 0x014b }
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r8]     // Catch:{ Exception -> 0x014b }
            r16 = r2
        L_0x0095:
            java.nio.ByteBuffer r14 = r9.f18349n     // Catch:{ Exception -> 0x014b }
            int r14 = r14.remaining()     // Catch:{ Exception -> 0x014b }
            int r14 = java.lang.Math.min(r14, r8)     // Catch:{ Exception -> 0x014b }
            int r14 = r0.mo5935d(r15, r13, r14)     // Catch:{ Exception -> 0x014b }
            r8 = -1
            if (r14 != r8) goto L_0x00b8
            r8 = 1
            r9.f18354s = r8     // Catch:{ Exception -> 0x014b }
            com.google.android.gms.internal.ads.ds0 r0 = r9.f18348m     // Catch:{ Exception -> 0x014b }
            java.nio.ByteBuffer r1 = r9.f18349n     // Catch:{ Exception -> 0x014b }
            long r0 = r0.mo6619a(r1)     // Catch:{ Exception -> 0x014b }
            int r0 = (int) r0     // Catch:{ Exception -> 0x014b }
            long r0 = (long) r0     // Catch:{ Exception -> 0x014b }
            r9.mo11104j(r10, r11, r0)     // Catch:{ Exception -> 0x014b }
        L_0x00b6:
            r1 = 1
            goto L_0x00d7
        L_0x00b8:
            java.lang.Object r8 = r9.f18351p     // Catch:{ Exception -> 0x014b }
            monitor-enter(r8)     // Catch:{ Exception -> 0x014b }
            boolean r13 = r9.f18346k     // Catch:{ all -> 0x0146 }
            if (r13 != 0) goto L_0x00c8
            java.nio.ByteBuffer r13 = r9.f18349n     // Catch:{ all -> 0x0146 }
            r21 = r12
            r12 = 0
            r13.put(r15, r12, r14)     // Catch:{ all -> 0x0144 }
            goto L_0x00ca
        L_0x00c8:
            r21 = r12
        L_0x00ca:
            monitor-exit(r8)     // Catch:{ all -> 0x0144 }
            java.nio.ByteBuffer r8 = r9.f18349n     // Catch:{ Exception -> 0x0142 }
            int r8 = r8.remaining()     // Catch:{ Exception -> 0x0142 }
            if (r8 > 0) goto L_0x00d8
            r26.m20821B()     // Catch:{ Exception -> 0x0142 }
            goto L_0x00b6
        L_0x00d7:
            return r1
        L_0x00d8:
            boolean r8 = r9.f18346k     // Catch:{ Exception -> 0x0142 }
            if (r8 != 0) goto L_0x011c
            long r12 = r1.mo12462a()     // Catch:{ Exception -> 0x0142 }
            long r22 = r12 - r16
            int r8 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x00eb
            r26.m20821B()     // Catch:{ Exception -> 0x0142 }
            r16 = r12
        L_0x00eb:
            long r12 = r12 - r2
            r22 = 1000(0x3e8, double:4.94E-321)
            long r22 = r22 * r6
            int r8 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r8 > 0) goto L_0x00fa
            r12 = r21
            r8 = 8192(0x2000, float:1.14794E-41)
            r13 = 0
            goto L_0x0095
        L_0x00fa:
            java.lang.String r12 = "downloadTimeout"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011a }
            r1 = 49
            r0.<init>(r1)     // Catch:{ Exception -> 0x011a }
            java.lang.String r1 = "Timeout exceeded. Limit: "
            r0.append(r1)     // Catch:{ Exception -> 0x011a }
            r0.append(r6)     // Catch:{ Exception -> 0x011a }
            java.lang.String r1 = " sec"
            r0.append(r1)     // Catch:{ Exception -> 0x011a }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x011a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x011a }
            r1.<init>(r0)     // Catch:{ Exception -> 0x011a }
            throw r1     // Catch:{ Exception -> 0x011a }
        L_0x011a:
            r0 = move-exception
            goto L_0x0150
        L_0x011c:
            java.lang.String r12 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x011a }
            java.nio.ByteBuffer r1 = r9.f18349n     // Catch:{ Exception -> 0x011a }
            int r1 = r1.limit()     // Catch:{ Exception -> 0x011a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011a }
            r3 = 35
            r2.<init>(r3)     // Catch:{ Exception -> 0x011a }
            java.lang.String r3 = "Precache abort at "
            r2.append(r3)     // Catch:{ Exception -> 0x011a }
            r2.append(r1)     // Catch:{ Exception -> 0x011a }
            java.lang.String r1 = " bytes"
            r2.append(r1)     // Catch:{ Exception -> 0x011a }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x011a }
            r0.<init>(r1)     // Catch:{ Exception -> 0x011a }
            throw r0     // Catch:{ Exception -> 0x011a }
        L_0x0142:
            r0 = move-exception
            goto L_0x014e
        L_0x0144:
            r0 = move-exception
            goto L_0x0149
        L_0x0146:
            r0 = move-exception
            r21 = r12
        L_0x0149:
            monitor-exit(r8)     // Catch:{ all -> 0x0144 }
            throw r0     // Catch:{ Exception -> 0x0142 }
        L_0x014b:
            r0 = move-exception
            r21 = r12
        L_0x014e:
            r12 = r21
        L_0x0150:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 1
            int r2 = r2 + r5
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r1)
            java.lang.String r1 = ":"
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = java.lang.String.valueOf(r27)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 34
            int r3 = r0.length()
            int r1 = r1 + r3
            r2.<init>(r1)
            java.lang.String r1 = "Failed to preload url "
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = " Exception: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.io0.m11131g(r1)
            r9.mo11102h(r10, r11, r12, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zs0.mo6294t(java.lang.String):boolean");
    }

    /* renamed from: w */
    public final String mo12265w() {
        return this.f18344i;
    }

    /* renamed from: y */
    public final ByteBuffer mo12266y() {
        synchronized (this.f18351p) {
            ByteBuffer byteBuffer = this.f18349n;
            if (byteBuffer != null && !this.f18350o) {
                byteBuffer.flip();
                this.f18350o = true;
            }
            this.f18346k = true;
        }
        return this.f18349n;
    }

    /* renamed from: z */
    public final boolean mo12267z() {
        return this.f18354s;
    }
}
