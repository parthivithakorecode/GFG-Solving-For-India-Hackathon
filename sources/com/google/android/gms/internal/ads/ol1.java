package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ol1 extends eb1 implements tr1 {

    /* renamed from: e */
    private final boolean f12079e;

    /* renamed from: f */
    private final int f12080f;

    /* renamed from: g */
    private final int f12081g;

    /* renamed from: h */
    private final String f12082h;

    /* renamed from: i */
    private final sq1 f12083i;

    /* renamed from: j */
    private final sq1 f12084j;

    /* renamed from: k */
    private li1 f12085k;

    /* renamed from: l */
    private HttpURLConnection f12086l;

    /* renamed from: m */
    private InputStream f12087m;

    /* renamed from: n */
    private boolean f12088n;

    /* renamed from: o */
    private int f12089o;

    /* renamed from: p */
    private long f12090p;

    /* renamed from: q */
    private long f12091q;

    private ol1(String str, int i, int i2, boolean z, sq1 sq1, r43<String> r43, boolean z2) {
        super(true);
        this.f12082h = str;
        this.f12080f = i;
        this.f12081g = i2;
        this.f12079e = z;
        this.f12083i = sq1;
        this.f12084j = new sq1();
    }

    /* synthetic */ ol1(String str, int i, int i2, boolean z, sq1 sq1, r43 r43, boolean z2, nk1 nk1) {
        this(str, i, i2, z, sq1, (r43<String>) null, false);
    }

    /* renamed from: s */
    private final HttpURLConnection m14511s(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) {
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f12080f);
        httpURLConnection.setReadTimeout(this.f12081g);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f12083i.mo10842a());
        hashMap.putAll(this.f12084j.mo10842a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j == 0 && j2 == -1) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            str = sb.toString();
        }
        if (str != null) {
            httpURLConnection.setRequestProperty("Range", str);
        }
        String str2 = this.f12082h;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setRequestMethod(li1.m12757a(1));
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* renamed from: t */
    private final URL m14512t(URL url, String str, li1 li1) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    String valueOf = String.valueOf(protocol);
                    throw new qo1(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "), li1, 2001, 1);
                } else if (this.f12079e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    String protocol2 = url.getProtocol();
                    StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 41 + protocol.length());
                    sb.append("Disallowed cross-protocol redirect (");
                    sb.append(protocol2);
                    sb.append(" to ");
                    sb.append(protocol);
                    sb.append(")");
                    throw new qo1(sb.toString(), li1, 2001, 1);
                }
            } catch (MalformedURLException e) {
                throw new qo1((IOException) e, li1, 2001, 1);
            }
        } else {
            throw new qo1("Null location redirect", li1, 2001, 1);
        }
    }

    /* renamed from: u */
    private final void m14513u() {
        HttpURLConnection httpURLConnection = this.f12086l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                oc2.m14399a("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f12086l = null;
        }
    }

    /* renamed from: a */
    public final int mo5752a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f12090p;
            if (j != -1) {
                long j2 = j - this.f12091q;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j2);
            }
            InputStream inputStream = this.f12087m;
            int i3 = n13.f11236a;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.f12091q += (long) read;
            mo6893o(read);
            return read;
        } catch (IOException e) {
            li1 li1 = this.f12085k;
            int i4 = n13.f11236a;
            throw qo1.m15781a(e, li1, 2);
        }
    }

    /* renamed from: h */
    public final Uri mo5753h() {
        HttpURLConnection httpURLConnection = this.f12086l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(1:6)(1:7)|8|(3:10|11|(5:15|16|(2:18|(1:20))(2:21|(1:23))|24|(4:28|29|30|31)))|32|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x006d */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5754i() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r10.f12087m     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x007f
            long r3 = r10.f12090p     // Catch:{ all -> 0x008e }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0010
            r3 = r5
            goto L_0x0013
        L_0x0010:
            long r7 = r10.f12091q     // Catch:{ all -> 0x008e }
            long r3 = r3 - r7
        L_0x0013:
            java.net.HttpURLConnection r7 = r10.f12086l     // Catch:{ all -> 0x008e }
            if (r7 == 0) goto L_0x006d
            int r8 = com.google.android.gms.internal.ads.n13.f11236a     // Catch:{ all -> 0x008e }
            r9 = 19
            if (r8 < r9) goto L_0x006d
            r9 = 20
            if (r8 <= r9) goto L_0x0022
            goto L_0x006d
        L_0x0022:
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ Exception -> 0x006d }
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0032
            int r3 = r7.read()     // Catch:{ Exception -> 0x006d }
            r4 = -1
            if (r3 == r4) goto L_0x006d
            goto L_0x0039
        L_0x0032:
            r5 = 2048(0x800, double:1.0118E-320)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0039
            goto L_0x006d
        L_0x0039:
            java.lang.Class r3 = r7.getClass()     // Catch:{ Exception -> 0x006d }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r4.equals(r3)     // Catch:{ Exception -> 0x006d }
            if (r4 != 0) goto L_0x0051
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r4.equals(r3)     // Catch:{ Exception -> 0x006d }
            if (r3 == 0) goto L_0x006d
        L_0x0051:
            java.lang.Class r3 = r7.getClass()     // Catch:{ Exception -> 0x006d }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x006d }
            java.util.Objects.requireNonNull(r3)
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x006d }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x006d }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x006d }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006d }
            r3.invoke(r7, r4)     // Catch:{ Exception -> 0x006d }
        L_0x006d:
            r2.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x007f
        L_0x0071:
            r2 = move-exception
            com.google.android.gms.internal.ads.qo1 r3 = new com.google.android.gms.internal.ads.qo1     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.li1 r4 = r10.f12085k     // Catch:{ all -> 0x008e }
            int r5 = com.google.android.gms.internal.ads.n13.f11236a     // Catch:{ all -> 0x008e }
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.li1) r4, (int) r5, (int) r6)     // Catch:{ all -> 0x008e }
            throw r3     // Catch:{ all -> 0x008e }
        L_0x007f:
            r10.f12087m = r0
            r10.m14513u()
            boolean r0 = r10.f12088n
            if (r0 == 0) goto L_0x008d
            r10.f12088n = r1
            r10.mo6894p()
        L_0x008d:
            return
        L_0x008e:
            r2 = move-exception
            r10.f12087m = r0
            r10.m14513u()
            boolean r0 = r10.f12088n
            if (r0 == 0) goto L_0x009d
            r10.f12088n = r1
            r10.mo6894p()
        L_0x009d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ol1.mo5754i():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (r8 != 0) goto L_0x00b8;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo5755k(com.google.android.gms.internal.ads.li1 r25) {
        /*
            r24 = this;
            r12 = r24
            r13 = r25
            r12.f12085k = r13
            r14 = 0
            r12.f12091q = r14
            r12.f12090p = r14
            r24.mo6895q(r25)
            r11 = 1
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x01f5 }
            android.net.Uri r0 = r13.f10058a     // Catch:{ IOException -> 0x01f5 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x01f5 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01f5 }
            long r9 = r13.f10063f     // Catch:{ IOException -> 0x01f5 }
            long r7 = r13.f10064g     // Catch:{ IOException -> 0x01f5 }
            boolean r0 = r13.mo8963b(r11)     // Catch:{ IOException -> 0x01f5 }
            boolean r1 = r12.f12079e     // Catch:{ IOException -> 0x01f5 }
            r5 = 0
            if (r1 != 0) goto L_0x0041
            r3 = 1
            r4 = 0
            r16 = 1
            java.util.Map<java.lang.String, java.lang.String> r6 = r13.f10061d     // Catch:{ IOException -> 0x01f5 }
            r1 = r24
            r17 = r6
            r5 = r9
            r9 = r0
            r10 = r16
            r11 = r17
            java.net.HttpURLConnection r0 = r1.m14511s(r2, r3, r4, r5, r7, r9, r10, r11)     // Catch:{ IOException -> 0x003d }
            goto L_0x008b
        L_0x003d:
            r0 = move-exception
            r5 = 1
            goto L_0x01f7
        L_0x0041:
            r11 = r2
            r5 = 0
        L_0x0043:
            int r6 = r5 + 1
            r1 = 20
            if (r5 > r1) goto L_0x01ce
            r3 = 1
            r4 = 0
            r16 = 0
            java.util.Map<java.lang.String, java.lang.String> r5 = r13.f10061d     // Catch:{ IOException -> 0x003d }
            r1 = r24
            r2 = r11
            r17 = r5
            r18 = r6
            r5 = r9
            r19 = r7
            r21 = r9
            r9 = r0
            r10 = r16
            r23 = r11
            r11 = r17
            java.net.HttpURLConnection r1 = r1.m14511s(r2, r3, r4, r5, r7, r9, r10, r11)     // Catch:{ IOException -> 0x003d }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x003d }
            java.lang.String r3 = "Location"
            java.lang.String r3 = r1.getHeaderField(r3)     // Catch:{ IOException -> 0x003d }
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 == r4) goto L_0x01bb
            r4 = 301(0x12d, float:4.22E-43)
            if (r2 == r4) goto L_0x01bb
            r4 = 302(0x12e, float:4.23E-43)
            if (r2 == r4) goto L_0x01bb
            r4 = 303(0x12f, float:4.25E-43)
            if (r2 == r4) goto L_0x01bb
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto L_0x01bb
            r4 = 308(0x134, float:4.32E-43)
            if (r2 != r4) goto L_0x008a
            goto L_0x01bb
        L_0x008a:
            r0 = r1
        L_0x008b:
            r12.f12086l = r0     // Catch:{ IOException -> 0x003d }
            int r1 = r0.getResponseCode()     // Catch:{ IOException -> 0x003d }
            r12.f12089o = r1     // Catch:{ IOException -> 0x003d }
            java.lang.String r3 = r0.getResponseMessage()     // Catch:{ IOException -> 0x003d }
            int r1 = r12.f12089o
            r2 = 2008(0x7d8, float:2.814E-42)
            java.lang.String r4 = "Content-Range"
            r5 = 200(0xc8, float:2.8E-43)
            r6 = -1
            if (r1 < r5) goto L_0x0163
            r8 = 299(0x12b, float:4.19E-43)
            if (r1 <= r8) goto L_0x00a9
            goto L_0x0163
        L_0x00a9:
            r0.getContentType()
            int r1 = r12.f12089o
            if (r1 != r5) goto L_0x00b7
            long r8 = r13.f10063f
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r8 = r14
        L_0x00b8:
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r1 = r0.getHeaderField(r1)
            java.lang.String r3 = "gzip"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x00e6
            long r10 = r13.f10064g
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x00cf
            r12.f12090p = r10
            goto L_0x00ea
        L_0x00cf:
            java.lang.String r3 = "Content-Length"
            java.lang.String r3 = r0.getHeaderField(r3)
            java.lang.String r4 = r0.getHeaderField(r4)
            long r3 = com.google.android.gms.internal.ads.us1.m18035a(r3, r4)
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x00e3
            long r6 = r3 - r8
        L_0x00e3:
            r12.f12090p = r6
            goto L_0x00ea
        L_0x00e6:
            long r3 = r13.f10064g
            r12.f12090p = r3
        L_0x00ea:
            r3 = 2000(0x7d0, float:2.803E-42)
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0158 }
            r12.f12087m = r0     // Catch:{ IOException -> 0x0158 }
            if (r1 == 0) goto L_0x00fd
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0158 }
            java.io.InputStream r1 = r12.f12087m     // Catch:{ IOException -> 0x0158 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0158 }
            r12.f12087m = r0     // Catch:{ IOException -> 0x0158 }
        L_0x00fd:
            r5 = 1
            r12.f12088n = r5
            r24.mo6896r(r25)
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0108
            goto L_0x0144
        L_0x0108:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0147 }
        L_0x010c:
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x0144
            r6 = 4096(0x1000, double:2.0237E-320)
            long r6 = java.lang.Math.min(r8, r6)     // Catch:{ IOException -> 0x0147 }
            int r1 = (int) r6     // Catch:{ IOException -> 0x0147 }
            java.io.InputStream r4 = r12.f12087m     // Catch:{ IOException -> 0x0147 }
            int r6 = com.google.android.gms.internal.ads.n13.f11236a     // Catch:{ IOException -> 0x0147 }
            r6 = 0
            int r1 = r4.read(r0, r6, r1)     // Catch:{ IOException -> 0x0147 }
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ IOException -> 0x0147 }
            boolean r4 = r4.isInterrupted()     // Catch:{ IOException -> 0x0147 }
            if (r4 != 0) goto L_0x0139
            r4 = -1
            if (r1 == r4) goto L_0x0133
            long r10 = (long) r1     // Catch:{ IOException -> 0x0147 }
            long r8 = r8 - r10
            r12.mo6893o(r1)     // Catch:{ IOException -> 0x0147 }
            goto L_0x010c
        L_0x0133:
            com.google.android.gms.internal.ads.qo1 r0 = new com.google.android.gms.internal.ads.qo1     // Catch:{ IOException -> 0x0147 }
            r0.<init>(r13, r2, r5)     // Catch:{ IOException -> 0x0147 }
            throw r0     // Catch:{ IOException -> 0x0147 }
        L_0x0139:
            com.google.android.gms.internal.ads.qo1 r0 = new com.google.android.gms.internal.ads.qo1     // Catch:{ IOException -> 0x0147 }
            java.io.InterruptedIOException r1 = new java.io.InterruptedIOException     // Catch:{ IOException -> 0x0147 }
            r1.<init>()     // Catch:{ IOException -> 0x0147 }
            r0.<init>((java.io.IOException) r1, (com.google.android.gms.internal.ads.li1) r13, (int) r3, (int) r5)     // Catch:{ IOException -> 0x0147 }
            throw r0     // Catch:{ IOException -> 0x0147 }
        L_0x0144:
            long r0 = r12.f12090p
            return r0
        L_0x0147:
            r0 = move-exception
            r24.m14513u()
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.qo1
            if (r1 == 0) goto L_0x0152
            com.google.android.gms.internal.ads.qo1 r0 = (com.google.android.gms.internal.ads.qo1) r0
            throw r0
        L_0x0152:
            com.google.android.gms.internal.ads.qo1 r1 = new com.google.android.gms.internal.ads.qo1
            r1.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.li1) r13, (int) r3, (int) r5)
            throw r1
        L_0x0158:
            r0 = move-exception
            r5 = 1
            r24.m14513u()
            com.google.android.gms.internal.ads.qo1 r1 = new com.google.android.gms.internal.ads.qo1
            r1.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.li1) r13, (int) r3, (int) r5)
            throw r1
        L_0x0163:
            r5 = 1
            java.util.Map r8 = r0.getHeaderFields()
            int r1 = r12.f12089o
            r9 = 416(0x1a0, float:5.83E-43)
            if (r1 != r9) goto L_0x018a
            java.lang.String r1 = r0.getHeaderField(r4)
            long r10 = com.google.android.gms.internal.ads.us1.m18036b(r1)
            r4 = r3
            long r2 = r13.f10063f
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x018b
            r12.f12088n = r5
            r24.mo6896r(r25)
            long r0 = r13.f10064g
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0189
            return r0
        L_0x0189:
            return r14
        L_0x018a:
            r4 = r3
        L_0x018b:
            java.io.InputStream r0 = r0.getErrorStream()
            if (r0 == 0) goto L_0x0196
            byte[] r0 = com.google.android.gms.internal.ads.n13.m13651x(r0)     // Catch:{ IOException -> 0x019a }
            goto L_0x0198
        L_0x0196:
            byte[] r0 = com.google.android.gms.internal.ads.n13.f11241f     // Catch:{ IOException -> 0x019a }
        L_0x0198:
            r7 = r0
            goto L_0x019d
        L_0x019a:
            byte[] r0 = com.google.android.gms.internal.ads.n13.f11241f
            goto L_0x0198
        L_0x019d:
            r24.m14513u()
            int r0 = r12.f12089o
            if (r0 != r9) goto L_0x01ac
            com.google.android.gms.internal.ads.if1 r0 = new com.google.android.gms.internal.ads.if1
            r1 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r1)
            goto L_0x01ad
        L_0x01ac:
            r0 = 0
        L_0x01ad:
            com.google.android.gms.internal.ads.rp1 r9 = new com.google.android.gms.internal.ads.rp1
            int r2 = r12.f12089o
            r1 = r9
            r3 = r4
            r4 = r0
            r5 = r8
            r6 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7)
            throw r9
        L_0x01bb:
            r5 = 1
            r6 = 0
            r1.disconnect()     // Catch:{ IOException -> 0x01f3 }
            r2 = r23
            java.net.URL r11 = r12.m14512t(r2, r3, r13)     // Catch:{ IOException -> 0x01f3 }
            r5 = r18
            r7 = r19
            r9 = r21
            goto L_0x0043
        L_0x01ce:
            r18 = r6
            r5 = 1
            com.google.android.gms.internal.ads.qo1 r0 = new com.google.android.gms.internal.ads.qo1     // Catch:{ IOException -> 0x01f3 }
            java.net.NoRouteToHostException r1 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x01f3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01f3 }
            r3 = 31
            r2.<init>(r3)     // Catch:{ IOException -> 0x01f3 }
            java.lang.String r3 = "Too many redirects: "
            r2.append(r3)     // Catch:{ IOException -> 0x01f3 }
            r3 = r18
            r2.append(r3)     // Catch:{ IOException -> 0x01f3 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x01f3 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01f3 }
            r2 = 2001(0x7d1, float:2.804E-42)
            r0.<init>((java.io.IOException) r1, (com.google.android.gms.internal.ads.li1) r13, (int) r2, (int) r5)     // Catch:{ IOException -> 0x01f3 }
            throw r0     // Catch:{ IOException -> 0x01f3 }
        L_0x01f3:
            r0 = move-exception
            goto L_0x01f7
        L_0x01f5:
            r0 = move-exception
            r5 = r11
        L_0x01f7:
            r24.m14513u()
            com.google.android.gms.internal.ads.qo1 r0 = com.google.android.gms.internal.ads.qo1.m15781a(r0, r13, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ol1.mo5755k(com.google.android.gms.internal.ads.li1):long");
    }

    public final Map<String, List<String>> zza() {
        HttpURLConnection httpURLConnection = this.f12086l;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }
}
