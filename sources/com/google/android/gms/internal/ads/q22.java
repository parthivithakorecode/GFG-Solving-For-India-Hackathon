package com.google.android.gms.internal.ads;

import android.content.Context;

public final class q22 implements pv2<o22, p22> {

    /* renamed from: a */
    protected final Context f13038a;

    /* renamed from: b */
    protected final String f13039b;

    /* renamed from: c */
    protected final ij0 f13040c;

    public q22(Context context, String str, ij0 ij0, int i, byte[] bArr) {
        this.f13038a = context;
        this.f13039b = str;
        this.f13040c = ij0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r2 = new java.io.InputStreamReader(r7.getInputStream());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        p054h1.C2694t.m21608q();
        r0 = new java.lang.StringBuilder(8192);
        r3 = new char[2048];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0150, code lost:
        r6 = r2.read(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0155, code lost:
        if (r6 == -1) goto L_0x015c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0157, code lost:
        r0.append(r3, 0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015c, code lost:
        r0 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        p034e2.C2553j.m21202a(r2);
        r4.mo7978g(r0);
        r5.f12460c = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016c, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017e, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.C2199sw.m17001c().mo8579b(com.google.android.gms.internal.ads.m10.f10397U3)).booleanValue() == false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0187, code lost:
        throw new com.google.android.gms.internal.ads.fz1(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0188, code lost:
        r5.f12461d = p054h1.C2694t.m21592a().mo12463b() - r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0198, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x021a, code lost:
        throw new com.google.android.gms.internal.ads.fz1(r1, r4.toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0241 A[Catch:{ all -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x024f A[Catch:{ all -> 0x0250 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:116:0x0251=Splitter:B:116:0x0251, B:71:0x0193=Splitter:B:71:0x0193} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.p22 mo6109c(com.google.android.gms.internal.ads.o22 r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            java.lang.String r2 = "Received error HTTP response code: "
            java.lang.String r3 = r0.f11828a
            int r11 = r0.f11829b
            java.util.Map<java.lang.String, java.lang.String> r12 = r0.f11830c
            byte[] r13 = r0.f11831d
            java.lang.String r0 = r0.f11832e
            e2.d r4 = p054h1.C2694t.m21592a()
            long r14 = r4.mo12463b()
            r10 = 1
            com.google.android.gms.internal.ads.p22 r9 = new com.google.android.gms.internal.ads.p22     // Catch:{ IOException -> 0x0257 }
            r9.<init>()     // Catch:{ IOException -> 0x0257 }
            java.lang.String r4 = "SDK version: "
            java.lang.String r5 = r1.f13039b     // Catch:{ IOException -> 0x0257 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x0257 }
            int r6 = r5.length()     // Catch:{ IOException -> 0x0257 }
            if (r6 == 0) goto L_0x0031
            java.lang.String r4 = r4.concat(r5)     // Catch:{ IOException -> 0x0257 }
            goto L_0x0037
        L_0x0031:
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x0257 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0257 }
            r4 = r5
        L_0x0037:
            com.google.android.gms.internal.ads.io0.m11130f(r4)     // Catch:{ IOException -> 0x0257 }
            java.lang.String r4 = "AdRequestServiceImpl: Sending request: "
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x0257 }
            int r6 = r5.length()     // Catch:{ IOException -> 0x0257 }
            if (r6 == 0) goto L_0x004b
            java.lang.String r4 = r4.concat(r5)     // Catch:{ IOException -> 0x0257 }
            goto L_0x0051
        L_0x004b:
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x0257 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0257 }
            r4 = r5
        L_0x0051:
            com.google.android.gms.internal.ads.io0.m11126b(r4)     // Catch:{ IOException -> 0x0257 }
            java.net.URL r4 = new java.net.URL     // Catch:{ IOException -> 0x0257 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0257 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x0257 }
            r3.<init>()     // Catch:{ IOException -> 0x0257 }
            r8 = 0
            r16 = r8
        L_0x0061:
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IOException -> 0x0257 }
            r7 = r4
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ IOException -> 0x0257 }
            j1.g2 r4 = p054h1.C2694t.m21608q()     // Catch:{ fz1 -> 0x022c, all -> 0x0229 }
            android.content.Context r5 = r1.f13038a     // Catch:{ fz1 -> 0x022c, all -> 0x0229 }
            java.lang.String r6 = r1.f13039b     // Catch:{ fz1 -> 0x022c, all -> 0x0229 }
            r17 = 0
            r18 = 0
            r21 = r7
            r7 = r17
            r8 = r21
            r19 = r9
            r9 = r18
            r1 = r10
            r10 = r11
            r4.mo14026S(r5, r6, r7, r8, r9, r10)     // Catch:{ fz1 -> 0x0223, all -> 0x021f }
            java.util.Set r4 = r12.entrySet()     // Catch:{ fz1 -> 0x0223, all -> 0x021f }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ fz1 -> 0x0223, all -> 0x021f }
        L_0x008b:
            boolean r5 = r4.hasNext()     // Catch:{ fz1 -> 0x0223, all -> 0x021f }
            if (r5 == 0) goto L_0x00ab
            java.lang.Object r5 = r4.next()     // Catch:{ fz1 -> 0x0223, all -> 0x021f }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ fz1 -> 0x0223, all -> 0x021f }
            java.lang.Object r6 = r5.getKey()     // Catch:{ fz1 -> 0x0223, all -> 0x021f }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ fz1 -> 0x0223, all -> 0x021f }
            java.lang.Object r5 = r5.getValue()     // Catch:{ fz1 -> 0x0223, all -> 0x021f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ fz1 -> 0x0223, all -> 0x021f }
            r7 = r21
            r7.addRequestProperty(r6, r5)     // Catch:{ fz1 -> 0x021d }
            r21 = r7
            goto L_0x008b
        L_0x00ab:
            r7 = r21
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ fz1 -> 0x021d }
            if (r4 != 0) goto L_0x00b8
            java.lang.String r4 = "Content-Type"
            r7.setRequestProperty(r4, r0)     // Catch:{ fz1 -> 0x021d }
        L_0x00b8:
            int r4 = r13.length     // Catch:{ fz1 -> 0x021d }
            r5 = 0
            if (r4 <= 0) goto L_0x00da
            r7.setDoOutput(r1)     // Catch:{ fz1 -> 0x021d }
            r7.setFixedLengthStreamingMode(r4)     // Catch:{ fz1 -> 0x021d }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00d5 }
            java.io.OutputStream r6 = r7.getOutputStream()     // Catch:{ all -> 0x00d5 }
            r4.<init>(r6)     // Catch:{ all -> 0x00d5 }
            r4.write(r13)     // Catch:{ all -> 0x00d2 }
            p034e2.C2553j.m21202a(r4)     // Catch:{ fz1 -> 0x021d }
            goto L_0x00da
        L_0x00d2:
            r0 = move-exception
            r5 = r4
            goto L_0x00d6
        L_0x00d5:
            r0 = move-exception
        L_0x00d6:
            p034e2.C2553j.m21202a(r5)     // Catch:{ fz1 -> 0x021d }
            throw r0     // Catch:{ fz1 -> 0x021d }
        L_0x00da:
            com.google.android.gms.internal.ads.ho0 r4 = new com.google.android.gms.internal.ads.ho0     // Catch:{ fz1 -> 0x021d }
            r4.<init>(r5)     // Catch:{ fz1 -> 0x021d }
            r4.mo7974c(r7, r13)     // Catch:{ fz1 -> 0x021d }
            int r6 = r7.getResponseCode()     // Catch:{ fz1 -> 0x021d }
            java.util.Map r8 = r7.getHeaderFields()     // Catch:{ fz1 -> 0x021d }
            java.util.Set r8 = r8.entrySet()     // Catch:{ fz1 -> 0x021d }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ fz1 -> 0x021d }
        L_0x00f2:
            boolean r9 = r8.hasNext()     // Catch:{ fz1 -> 0x021d }
            if (r9 == 0) goto L_0x0124
            java.lang.Object r9 = r8.next()     // Catch:{ fz1 -> 0x021d }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ fz1 -> 0x021d }
            java.lang.Object r10 = r9.getKey()     // Catch:{ fz1 -> 0x021d }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ fz1 -> 0x021d }
            java.lang.Object r9 = r9.getValue()     // Catch:{ fz1 -> 0x021d }
            java.util.List r9 = (java.util.List) r9     // Catch:{ fz1 -> 0x021d }
            boolean r17 = r3.containsKey(r10)     // Catch:{ fz1 -> 0x021d }
            if (r17 == 0) goto L_0x011a
            java.lang.Object r10 = r3.get(r10)     // Catch:{ fz1 -> 0x021d }
            java.util.List r10 = (java.util.List) r10     // Catch:{ fz1 -> 0x021d }
            r10.addAll(r9)     // Catch:{ fz1 -> 0x021d }
            goto L_0x00f2
        L_0x011a:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ fz1 -> 0x021d }
            r5.<init>(r9)     // Catch:{ fz1 -> 0x021d }
            r3.put(r10, r5)     // Catch:{ fz1 -> 0x021d }
            r5 = 0
            goto L_0x00f2
        L_0x0124:
            r4.mo7976e(r7, r6)     // Catch:{ fz1 -> 0x021d }
            r5 = r19
            r5.f12458a = r6     // Catch:{ fz1 -> 0x021b }
            r5.f12459b = r3     // Catch:{ fz1 -> 0x021b }
            java.lang.String r8 = ""
            r5.f12460c = r8     // Catch:{ fz1 -> 0x021b }
            r8 = 200(0xc8, float:2.8E-43)
            r9 = 300(0x12c, float:4.2E-43)
            if (r6 < r8) goto L_0x01a0
            if (r6 >= r9) goto L_0x01a0
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x019a }
            java.io.InputStream r0 = r7.getInputStream()     // Catch:{ all -> 0x019a }
            r2.<init>(r0)     // Catch:{ all -> 0x019a }
            p054h1.C2694t.m21608q()     // Catch:{ all -> 0x0198 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0198 }
            r3 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3)     // Catch:{ all -> 0x0198 }
            r3 = 2048(0x800, float:2.87E-42)
            char[] r3 = new char[r3]     // Catch:{ all -> 0x0198 }
        L_0x0150:
            int r6 = r2.read(r3)     // Catch:{ all -> 0x0198 }
            r8 = -1
            if (r6 == r8) goto L_0x015c
            r8 = 0
            r0.append(r3, r8, r6)     // Catch:{ all -> 0x0198 }
            goto L_0x0150
        L_0x015c:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0198 }
            p034e2.C2553j.m21202a(r2)     // Catch:{ fz1 -> 0x021b }
            r4.mo7978g(r0)     // Catch:{ fz1 -> 0x021b }
            r5.f12460c = r0     // Catch:{ fz1 -> 0x021b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ fz1 -> 0x021b }
            if (r0 == 0) goto L_0x0188
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.m10.f10397U3     // Catch:{ fz1 -> 0x021b }
            com.google.android.gms.internal.ads.k10 r2 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ fz1 -> 0x021b }
            java.lang.Object r0 = r2.mo8579b(r0)     // Catch:{ fz1 -> 0x021b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ fz1 -> 0x021b }
            boolean r0 = r0.booleanValue()     // Catch:{ fz1 -> 0x021b }
            if (r0 == 0) goto L_0x0181
            goto L_0x0188
        L_0x0181:
            com.google.android.gms.internal.ads.fz1 r0 = new com.google.android.gms.internal.ads.fz1     // Catch:{ fz1 -> 0x021b }
            r2 = 3
            r0.<init>(r2)     // Catch:{ fz1 -> 0x021b }
            throw r0     // Catch:{ fz1 -> 0x021b }
        L_0x0188:
            e2.d r0 = p054h1.C2694t.m21592a()     // Catch:{ fz1 -> 0x021b }
            long r2 = r0.mo12463b()     // Catch:{ fz1 -> 0x021b }
            long r2 = r2 - r14
            r5.f12461d = r2     // Catch:{ fz1 -> 0x021b }
        L_0x0193:
            r7.disconnect()     // Catch:{ IOException -> 0x0255 }
            goto L_0x024e
        L_0x0198:
            r0 = move-exception
            goto L_0x019c
        L_0x019a:
            r0 = move-exception
            r2 = 0
        L_0x019c:
            p034e2.C2553j.m21202a(r2)     // Catch:{ fz1 -> 0x021b }
            throw r0     // Catch:{ fz1 -> 0x021b }
        L_0x01a0:
            r8 = 0
            if (r6 < r9) goto L_0x01f2
            r4 = 400(0x190, float:5.6E-43)
            if (r6 >= r4) goto L_0x01f2
            java.lang.String r4 = "Location"
            java.lang.String r4 = r7.getHeaderField(r4)     // Catch:{ fz1 -> 0x021b }
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ fz1 -> 0x021b }
            if (r6 != 0) goto L_0x01e5
            java.net.URL r6 = new java.net.URL     // Catch:{ fz1 -> 0x021b }
            r6.<init>(r4)     // Catch:{ fz1 -> 0x021b }
            int r4 = r16 + 1
            com.google.android.gms.internal.ads.e10<java.lang.Integer> r9 = com.google.android.gms.internal.ads.m10.f10237A3     // Catch:{ fz1 -> 0x021b }
            com.google.android.gms.internal.ads.k10 r10 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ fz1 -> 0x021b }
            java.lang.Object r9 = r10.mo8579b(r9)     // Catch:{ fz1 -> 0x021b }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ fz1 -> 0x021b }
            int r9 = r9.intValue()     // Catch:{ fz1 -> 0x021b }
            if (r4 > r9) goto L_0x01d8
            r7.disconnect()     // Catch:{ IOException -> 0x0255 }
            r10 = r1
            r16 = r4
            r9 = r5
            r4 = r6
            r1 = r20
            goto L_0x0061
        L_0x01d8:
            java.lang.String r0 = "Too many redirects."
            com.google.android.gms.internal.ads.io0.m11131g(r0)     // Catch:{ fz1 -> 0x021b }
            com.google.android.gms.internal.ads.fz1 r0 = new com.google.android.gms.internal.ads.fz1     // Catch:{ fz1 -> 0x021b }
            java.lang.String r2 = "Too many redirects"
            r0.<init>(r1, r2)     // Catch:{ fz1 -> 0x021b }
            throw r0     // Catch:{ fz1 -> 0x021b }
        L_0x01e5:
            java.lang.String r0 = "No location header to follow redirect."
            com.google.android.gms.internal.ads.io0.m11131g(r0)     // Catch:{ fz1 -> 0x021b }
            com.google.android.gms.internal.ads.fz1 r0 = new com.google.android.gms.internal.ads.fz1     // Catch:{ fz1 -> 0x021b }
            java.lang.String r2 = "No location header to follow redirect"
            r0.<init>(r1, r2)     // Catch:{ fz1 -> 0x021b }
            throw r0     // Catch:{ fz1 -> 0x021b }
        L_0x01f2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ fz1 -> 0x021b }
            r3 = 46
            r0.<init>(r3)     // Catch:{ fz1 -> 0x021b }
            r0.append(r2)     // Catch:{ fz1 -> 0x021b }
            r0.append(r6)     // Catch:{ fz1 -> 0x021b }
            java.lang.String r0 = r0.toString()     // Catch:{ fz1 -> 0x021b }
            com.google.android.gms.internal.ads.io0.m11131g(r0)     // Catch:{ fz1 -> 0x021b }
            com.google.android.gms.internal.ads.fz1 r0 = new com.google.android.gms.internal.ads.fz1     // Catch:{ fz1 -> 0x021b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ fz1 -> 0x021b }
            r4.<init>(r3)     // Catch:{ fz1 -> 0x021b }
            r4.append(r2)     // Catch:{ fz1 -> 0x021b }
            r4.append(r6)     // Catch:{ fz1 -> 0x021b }
            java.lang.String r2 = r4.toString()     // Catch:{ fz1 -> 0x021b }
            r0.<init>(r1, r2)     // Catch:{ fz1 -> 0x021b }
            throw r0     // Catch:{ fz1 -> 0x021b }
        L_0x021b:
            r0 = move-exception
            goto L_0x022f
        L_0x021d:
            r0 = move-exception
            goto L_0x0226
        L_0x021f:
            r0 = move-exception
            r7 = r21
            goto L_0x0251
        L_0x0223:
            r0 = move-exception
            r7 = r21
        L_0x0226:
            r5 = r19
            goto L_0x022f
        L_0x0229:
            r0 = move-exception
            r1 = r10
            goto L_0x0251
        L_0x022c:
            r0 = move-exception
            r5 = r9
            r1 = r10
        L_0x022f:
            com.google.android.gms.internal.ads.e10<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.m10.f10475d6     // Catch:{ all -> 0x0250 }
            com.google.android.gms.internal.ads.k10 r3 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x0250 }
            java.lang.Object r2 = r3.mo8579b(r2)     // Catch:{ all -> 0x0250 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0250 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0250 }
            if (r2 == 0) goto L_0x024f
            e2.d r0 = p054h1.C2694t.m21592a()     // Catch:{ all -> 0x0250 }
            long r2 = r0.mo12463b()     // Catch:{ all -> 0x0250 }
            long r2 = r2 - r14
            r5.f12461d = r2     // Catch:{ all -> 0x0250 }
            goto L_0x0193
        L_0x024e:
            return r5
        L_0x024f:
            throw r0     // Catch:{ all -> 0x0250 }
        L_0x0250:
            r0 = move-exception
        L_0x0251:
            r7.disconnect()     // Catch:{ IOException -> 0x0255 }
            throw r0     // Catch:{ IOException -> 0x0255 }
        L_0x0255:
            r0 = move-exception
            goto L_0x0259
        L_0x0257:
            r0 = move-exception
            r1 = r10
        L_0x0259:
            java.lang.String r2 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Error while connecting to ad server: "
            int r4 = r2.length()
            if (r4 == 0) goto L_0x026e
            java.lang.String r2 = r3.concat(r2)
            goto L_0x0273
        L_0x026e:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
        L_0x0273:
            com.google.android.gms.internal.ads.io0.m11131g(r2)
            com.google.android.gms.internal.ads.fz1 r3 = new com.google.android.gms.internal.ads.fz1
            r3.<init>(r1, r2, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q22.mo6109c(com.google.android.gms.internal.ads.o22):com.google.android.gms.internal.ads.p22");
    }
}
