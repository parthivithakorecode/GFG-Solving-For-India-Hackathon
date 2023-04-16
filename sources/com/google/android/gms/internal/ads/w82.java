package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class w82<AdT> implements xa3<ds2, AdT> {

    /* renamed from: a */
    private final nw2 f16747a;

    /* renamed from: b */
    private final xa1 f16748b;

    /* renamed from: c */
    private final zx2 f16749c;

    /* renamed from: d */
    private final cy2 f16750d;

    /* renamed from: e */
    private final Executor f16751e;

    /* renamed from: f */
    private final ScheduledExecutorService f16752f;

    /* renamed from: g */
    private final y61<AdT> f16753g;

    /* renamed from: h */
    private final r82 f16754h;

    /* renamed from: i */
    private final f52 f16755i;

    public w82(nw2 nw2, r82 r82, xa1 xa1, zx2 zx2, cy2 cy2, y61<AdT> y61, Executor executor, ScheduledExecutorService scheduledExecutorService, f52 f52) {
        this.f16747a = nw2;
        this.f16754h = r82;
        this.f16748b = xa1;
        this.f16749c = zx2;
        this.f16750d = cy2;
        this.f16753g = y61;
        this.f16751e = executor;
        this.f16752f = scheduledExecutorService;
        this.f16755i = f52;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ cc3 mo11619b(ds2 ds2, rr2 rr2, a52 a52, Throwable th) {
        r82 r82 = this.f16754h;
        cc3 o = rb3.m16137o(a52.mo5105a(ds2, rr2), (long) rr2.f13872O, TimeUnit.MILLISECONDS, this.f16752f);
        r82.mo10492e(ds2, rr2, o, this.f16749c);
        return o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0115  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.cc3 mo5074c(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.ds2 r9 = (com.google.android.gms.internal.ads.ds2) r9
            com.google.android.gms.internal.ads.cs2 r0 = r9.f5904b
            com.google.android.gms.internal.ads.ur2 r0 = r0.f5509b
            int r0 = r0.f15732e
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 300(0x12c, float:4.2E-43)
            if (r0 == 0) goto L_0x0044
            if (r0 < r1) goto L_0x0027
            if (r0 >= r2) goto L_0x0027
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10397U3
            com.google.android.gms.internal.ads.k10 r3 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r0 = r3.mo8579b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "No fill."
            goto L_0x0046
        L_0x0027:
            if (r0 < r2) goto L_0x0030
            r3 = 400(0x190, float:5.6E-43)
            if (r0 >= r3) goto L_0x0030
            java.lang.String r0 = "No location header to follow redirect or too many redirects."
            goto L_0x0046
        L_0x0030:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 46
            r3.<init>(r4)
            java.lang.String r4 = "Received error HTTP response code: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x0046
        L_0x0044:
            java.lang.String r0 = "No ad config."
        L_0x0046:
            com.google.android.gms.internal.ads.cs2 r3 = r9.f5904b
            com.google.android.gms.internal.ads.ur2 r3 = r3.f5509b
            com.google.android.gms.internal.ads.tr2 r3 = r3.f15736i
            if (r3 == 0) goto L_0x0052
            java.lang.String r0 = r3.mo11100a()
        L_0x0052:
            com.google.android.gms.internal.ads.f52 r3 = r8.f16755i
            com.google.android.gms.internal.ads.cs2 r4 = r9.f5904b
            com.google.android.gms.internal.ads.ur2 r4 = r4.f5509b
            r3.mo7238e(r4)
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.m10.f10475d6
            com.google.android.gms.internal.ads.k10 r4 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r3 = r4.mo8579b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 3
            if (r3 == 0) goto L_0x0085
            com.google.android.gms.internal.ads.cs2 r3 = r9.f5904b
            com.google.android.gms.internal.ads.ur2 r3 = r3.f5509b
            int r3 = r3.f15732e
            if (r3 == 0) goto L_0x0085
            if (r3 < r1) goto L_0x007a
            if (r3 < r2) goto L_0x0085
        L_0x007a:
            com.google.android.gms.internal.ads.u82 r9 = new com.google.android.gms.internal.ads.u82
            r9.<init>(r4, r0)
            com.google.android.gms.internal.ads.cc3 r9 = com.google.android.gms.internal.ads.rb3.m16130h(r9)
            goto L_0x017f
        L_0x0085:
            com.google.android.gms.internal.ads.nw2 r1 = r8.f16747a
            com.google.android.gms.internal.ads.gw2 r2 = com.google.android.gms.internal.ads.gw2.RENDER_CONFIG_INIT
            com.google.android.gms.internal.ads.u82 r3 = new com.google.android.gms.internal.ads.u82
            r3.<init>(r4, r0)
            com.google.android.gms.internal.ads.cc3 r0 = com.google.android.gms.internal.ads.rb3.m16130h(r3)
            com.google.android.gms.internal.ads.dw2 r0 = com.google.android.gms.internal.ads.wv2.m19224c(r0, r2, r1)
            com.google.android.gms.internal.ads.rv2 r0 = r0.mo6681a()
            com.google.android.gms.internal.ads.xa1 r1 = r8.f16748b
            com.google.android.gms.internal.ads.h21 r2 = new com.google.android.gms.internal.ads.h21
            com.google.android.gms.internal.ads.cy2 r3 = r8.f16750d
            com.google.android.gms.internal.ads.zx2 r4 = r8.f16749c
            r2.<init>(r9, r3, r4)
            java.util.concurrent.Executor r3 = r8.f16751e
            r1.mo8945B0(r2, r3)
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.m10.f10484e6
            com.google.android.gms.internal.ads.k10 r2 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r1 = r2.mo8579b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0106
            com.google.android.gms.internal.ads.cs2 r1 = r9.f5904b
            java.util.List<com.google.android.gms.internal.ads.rr2> r1 = r1.f5508a
            java.util.Iterator r1 = r1.iterator()
        L_0x00c4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0106
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.rr2 r2 = (com.google.android.gms.internal.ads.rr2) r2
            com.google.android.gms.internal.ads.f52 r3 = r8.f16755i
            r3.mo7236c(r2)
            java.util.List<java.lang.String> r3 = r2.f13884a
            java.util.Iterator r3 = r3.iterator()
        L_0x00db:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00f8
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.internal.ads.y61<AdT> r5 = r8.f16753g
            int r6 = r2.f13886b
            com.google.android.gms.internal.ads.a52 r4 = r5.mo11666a(r6, r4)
            if (r4 == 0) goto L_0x00db
            boolean r4 = r4.mo5106b(r9, r2)
            if (r4 == 0) goto L_0x00db
            goto L_0x00c4
        L_0x00f8:
            com.google.android.gms.internal.ads.f52 r3 = r8.f16755i
            r4 = 0
            r6 = 1
            r7 = 0
            com.google.android.gms.internal.ads.cv r6 = com.google.android.gms.internal.ads.dt2.m8099d(r6, r7, r7)
            r3.mo7237d(r2, r4, r6)
            goto L_0x00c4
        L_0x0106:
            com.google.android.gms.internal.ads.cs2 r1 = r9.f5904b
            java.util.List<com.google.android.gms.internal.ads.rr2> r1 = r1.f5508a
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x010f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x017e
            java.lang.Object r3 = r1.next()
            com.google.android.gms.internal.ads.rr2 r3 = (com.google.android.gms.internal.ads.rr2) r3
            java.util.List<java.lang.String> r4 = r3.f13884a
            java.util.Iterator r4 = r4.iterator()
        L_0x0121:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x017b
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.y61<AdT> r6 = r8.f16753g
            int r7 = r3.f13886b
            com.google.android.gms.internal.ads.a52 r6 = r6.mo11666a(r7, r5)
            if (r6 == 0) goto L_0x0121
            boolean r7 = r6.mo5106b(r9, r3)
            if (r7 == 0) goto L_0x0121
            com.google.android.gms.internal.ads.nw2 r4 = r8.f16747a
            com.google.android.gms.internal.ads.gw2 r7 = com.google.android.gms.internal.ads.gw2.RENDER_CONFIG_WATERFALL
            com.google.android.gms.internal.ads.dw2 r0 = r4.mo7176b(r7, r0)
            java.lang.String r4 = java.lang.String.valueOf(r5)
            int r4 = r4.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r4 = r4 + 26
            r7.<init>(r4)
            java.lang.String r4 = "render-config-"
            r7.append(r4)
            r7.append(r2)
            java.lang.String r4 = "-"
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = r7.toString()
            com.google.android.gms.internal.ads.dw2 r0 = r0.mo6688h(r4)
            com.google.android.gms.internal.ads.v82 r4 = new com.google.android.gms.internal.ads.v82
            r4.<init>(r8, r9, r3, r6)
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            com.google.android.gms.internal.ads.dw2 r0 = r0.mo6683c(r3, r4)
            com.google.android.gms.internal.ads.rv2 r0 = r0.mo6681a()
        L_0x017b:
            int r2 = r2 + 1
            goto L_0x010f
        L_0x017e:
            r9 = r0
        L_0x017f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w82.mo5074c(java.lang.Object):com.google.android.gms.internal.ads.cc3");
    }
}
