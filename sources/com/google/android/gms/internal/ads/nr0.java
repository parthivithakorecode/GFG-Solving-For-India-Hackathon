package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

final class nr0 implements C1596cm {

    /* renamed from: q */
    private static final Pattern f11603q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: r */
    private static final AtomicReference<byte[]> f11604r = new AtomicReference<>();

    /* renamed from: a */
    private final SSLSocketFactory f11605a = new lr0(this);

    /* renamed from: b */
    private final int f11606b;

    /* renamed from: c */
    private final int f11607c;

    /* renamed from: d */
    private final String f11608d;

    /* renamed from: e */
    private final C1559bm f11609e;

    /* renamed from: f */
    private final C1819im<? super nr0> f11610f;

    /* renamed from: g */
    private C2299vl f11611g;

    /* renamed from: h */
    private HttpURLConnection f11612h;

    /* renamed from: i */
    private InputStream f11613i;

    /* renamed from: j */
    private boolean f11614j;

    /* renamed from: k */
    private long f11615k;

    /* renamed from: l */
    private long f11616l;

    /* renamed from: m */
    private long f11617m;

    /* renamed from: n */
    private long f11618n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f11619o;

    /* renamed from: p */
    private final Set<Socket> f11620p = new HashSet();

    nr0(String str, C1819im<? super nr0> imVar, int i, int i2, int i3) {
        C1856jm.m11727b(str);
        this.f11608d = str;
        this.f11610f = imVar;
        this.f11609e = new C1559bm();
        this.f11606b = i;
        this.f11607c = i2;
        this.f11619o = i3;
    }

    /* renamed from: i */
    private final void m14037i() {
        HttpURLConnection httpURLConnection = this.f11612h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                io0.m11129e("Unexpected error while disconnecting", e);
            }
            this.f11612h = null;
        }
    }

    /* renamed from: b */
    public final Map<String, List<String>> mo6219b() {
        HttpURLConnection httpURLConnection = this.f11612h;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* renamed from: c */
    public final Uri mo5934c() {
        HttpURLConnection httpURLConnection = this.f11612h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: d */
    public final int mo5935d(byte[] bArr, int i, int i2) {
        try {
            if (this.f11617m != this.f11615k) {
                byte[] andSet = f11604r.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j = this.f11617m;
                    long j2 = this.f11615k;
                    if (j == j2) {
                        f11604r.set(andSet);
                        break;
                    }
                    int read = this.f11613i.read(andSet, 0, (int) Math.min(j2 - j, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f11617m += (long) read;
                        C1819im<? super nr0> imVar = this.f11610f;
                        if (imVar != null) {
                            ((as0) imVar).mo5477i0(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.f11616l;
            if (j3 != -1) {
                long j4 = j3 - this.f11618n;
                if (j4 != 0) {
                    i2 = (int) Math.min((long) i2, j4);
                }
                return -1;
            }
            int read2 = this.f11613i.read(bArr, i, i2);
            if (read2 != -1) {
                this.f11618n += (long) read2;
                C1819im<? super nr0> imVar2 = this.f11610f;
                if (imVar2 == null) {
                    return read2;
                }
                ((as0) imVar2).mo5477i0(this, read2);
                return read2;
            } else if (this.f11616l == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new C2448zl(e, this.f11611g, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fd, code lost:
        if (r3 != 0) goto L_0x0102;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01dc  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo5936e(com.google.android.gms.internal.ads.C2299vl r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "Unable to connect to "
            r1.f11611g = r2
            r4 = 0
            r1.f11618n = r4
            r1.f11617m = r4
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x02b2 }
            android.net.Uri r7 = r2.f16339a     // Catch:{ IOException -> 0x02b2 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x02b2 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x02b2 }
            long r7 = r2.f16341c     // Catch:{ IOException -> 0x02b2 }
            long r9 = r2.f16342d     // Catch:{ IOException -> 0x02b2 }
            r12 = 0
        L_0x001e:
            int r13 = r12 + 1
            r14 = 20
            if (r12 > r14) goto L_0x0299
            java.net.URLConnection r12 = r0.openConnection()     // Catch:{ IOException -> 0x02b2 }
            java.net.HttpURLConnection r12 = (java.net.HttpURLConnection) r12     // Catch:{ IOException -> 0x02b2 }
            boolean r15 = r12 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x02b2 }
            if (r15 == 0) goto L_0x0036
            r15 = r12
            javax.net.ssl.HttpsURLConnection r15 = (javax.net.ssl.HttpsURLConnection) r15     // Catch:{ IOException -> 0x02b2 }
            javax.net.ssl.SSLSocketFactory r6 = r1.f11605a     // Catch:{ IOException -> 0x02b2 }
            r15.setSSLSocketFactory(r6)     // Catch:{ IOException -> 0x02b2 }
        L_0x0036:
            int r6 = r1.f11606b     // Catch:{ IOException -> 0x02b2 }
            r12.setConnectTimeout(r6)     // Catch:{ IOException -> 0x02b2 }
            int r6 = r1.f11607c     // Catch:{ IOException -> 0x02b2 }
            r12.setReadTimeout(r6)     // Catch:{ IOException -> 0x02b2 }
            com.google.android.gms.internal.ads.bm r6 = r1.f11609e     // Catch:{ IOException -> 0x02b2 }
            java.util.Map r6 = r6.mo5882a()     // Catch:{ IOException -> 0x02b2 }
            java.util.Set r6 = r6.entrySet()     // Catch:{ IOException -> 0x02b2 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ IOException -> 0x02b2 }
        L_0x004e:
            boolean r15 = r6.hasNext()     // Catch:{ IOException -> 0x02b2 }
            if (r15 == 0) goto L_0x006c
            java.lang.Object r15 = r6.next()     // Catch:{ IOException -> 0x02b2 }
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch:{ IOException -> 0x02b2 }
            java.lang.Object r16 = r15.getKey()     // Catch:{ IOException -> 0x02b2 }
            r11 = r16
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x02b2 }
            java.lang.Object r15 = r15.getValue()     // Catch:{ IOException -> 0x02b2 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x02b2 }
            r12.setRequestProperty(r11, r15)     // Catch:{ IOException -> 0x02b2 }
            goto L_0x004e
        L_0x006c:
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            r11 = 27
            r17 = -1
            if (r6 != 0) goto L_0x0078
            int r6 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r6 == 0) goto L_0x00af
        L_0x0078:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02b2 }
            r6.<init>(r11)     // Catch:{ IOException -> 0x02b2 }
            java.lang.String r15 = "bytes="
            r6.append(r15)     // Catch:{ IOException -> 0x02b2 }
            r6.append(r7)     // Catch:{ IOException -> 0x02b2 }
            java.lang.String r15 = "-"
            r6.append(r15)     // Catch:{ IOException -> 0x02b2 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x02b2 }
            int r15 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r15 == 0) goto L_0x00aa
            long r19 = r7 + r9
            long r4 = r19 + r17
            int r15 = r6.length()     // Catch:{ IOException -> 0x02b2 }
            int r15 = r15 + r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02b2 }
            r14.<init>(r15)     // Catch:{ IOException -> 0x02b2 }
            r14.append(r6)     // Catch:{ IOException -> 0x02b2 }
            r14.append(r4)     // Catch:{ IOException -> 0x02b2 }
            java.lang.String r6 = r14.toString()     // Catch:{ IOException -> 0x02b2 }
        L_0x00aa:
            java.lang.String r4 = "Range"
            r12.setRequestProperty(r4, r6)     // Catch:{ IOException -> 0x02b2 }
        L_0x00af:
            java.lang.String r4 = "User-Agent"
            java.lang.String r5 = r1.f11608d     // Catch:{ IOException -> 0x02b2 }
            r12.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x02b2 }
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r5 = "identity"
            r12.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x02b2 }
            r4 = 0
            r12.setInstanceFollowRedirects(r4)     // Catch:{ IOException -> 0x02b2 }
            r12.setDoOutput(r4)     // Catch:{ IOException -> 0x02b2 }
            r12.connect()     // Catch:{ IOException -> 0x02b2 }
            int r4 = r12.getResponseCode()     // Catch:{ IOException -> 0x02b2 }
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 == r5) goto L_0x0249
            r5 = 301(0x12d, float:4.22E-43)
            if (r4 == r5) goto L_0x0249
            r5 = 302(0x12e, float:4.23E-43)
            if (r4 == r5) goto L_0x0249
            r5 = 303(0x12f, float:4.25E-43)
            if (r4 == r5) goto L_0x0249
            r5 = 307(0x133, float:4.3E-43)
            if (r4 == r5) goto L_0x0249
            r5 = 308(0x134, float:4.32E-43)
            if (r4 != r5) goto L_0x00e5
            goto L_0x0249
        L_0x00e5:
            r1.f11612h = r12     // Catch:{ IOException -> 0x02b2 }
            int r0 = r12.getResponseCode()     // Catch:{ IOException -> 0x0222 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 < r3) goto L_0x0206
            r4 = 299(0x12b, float:4.19E-43)
            if (r0 <= r4) goto L_0x00f5
            goto L_0x0206
        L_0x00f5:
            if (r0 != r3) goto L_0x0100
            long r3 = r2.f16341c
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0100
            goto L_0x0102
        L_0x0100:
            r3 = 0
        L_0x0102:
            r1.f11615k = r3
            long r3 = r2.f16342d
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x010e
        L_0x010a:
            r1.f11616l = r3
            goto L_0x01e4
        L_0x010e:
            java.net.HttpURLConnection r0 = r1.f11612h
            java.lang.String r3 = "Content-Length"
            java.lang.String r3 = r0.getHeaderField(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r5 = "]"
            if (r4 != 0) goto L_0x0144
            long r6 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0123 }
            goto L_0x0146
        L_0x0123:
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 28
            r6.<init>(r4)
            java.lang.String r4 = "Unexpected Content-Length ["
            r6.append(r4)
            r6.append(r3)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            com.google.android.gms.internal.ads.io0.m11128d(r4)
        L_0x0144:
            r6 = r17
        L_0x0146:
            java.lang.String r4 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x01d8
            java.util.regex.Pattern r4 = f11603q
            java.util.regex.Matcher r4 = r4.matcher(r0)
            boolean r8 = r4.find()
            if (r8 == 0) goto L_0x01d8
            r8 = 2
            java.lang.String r8 = r4.group(r8)     // Catch:{ NumberFormatException -> 0x01b8 }
            long r8 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x01b8 }
            r10 = 1
            java.lang.String r4 = r4.group(r10)     // Catch:{ NumberFormatException -> 0x01b8 }
            long r12 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x01b8 }
            long r8 = r8 - r12
            r12 = 1
            long r8 = r8 + r12
            r14 = 0
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x017c
            r6 = r8
            goto L_0x01d8
        L_0x017c:
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x01d8
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ NumberFormatException -> 0x01b8 }
            int r4 = r4.length()     // Catch:{ NumberFormatException -> 0x01b8 }
            int r4 = r4 + 26
            java.lang.String r10 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01b8 }
            int r10 = r10.length()     // Catch:{ NumberFormatException -> 0x01b8 }
            int r4 = r4 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x01b8 }
            r10.<init>(r4)     // Catch:{ NumberFormatException -> 0x01b8 }
            java.lang.String r4 = "Inconsistent headers ["
            r10.append(r4)     // Catch:{ NumberFormatException -> 0x01b8 }
            r10.append(r3)     // Catch:{ NumberFormatException -> 0x01b8 }
            java.lang.String r3 = "] ["
            r10.append(r3)     // Catch:{ NumberFormatException -> 0x01b8 }
            r10.append(r0)     // Catch:{ NumberFormatException -> 0x01b8 }
            r10.append(r5)     // Catch:{ NumberFormatException -> 0x01b8 }
            java.lang.String r3 = r10.toString()     // Catch:{ NumberFormatException -> 0x01b8 }
            com.google.android.gms.internal.ads.io0.m11131g(r3)     // Catch:{ NumberFormatException -> 0x01b8 }
            long r3 = java.lang.Math.max(r6, r8)     // Catch:{ NumberFormatException -> 0x01b8 }
            r6 = r3
            goto L_0x01d8
        L_0x01b8:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + r11
            r4.<init>(r3)
            java.lang.String r3 = "Unexpected Content-Range ["
            r4.append(r3)
            r4.append(r0)
            r4.append(r5)
            java.lang.String r0 = r4.toString()
            com.google.android.gms.internal.ads.io0.m11128d(r0)
        L_0x01d8:
            int r0 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x01e0
            long r3 = r1.f11615k
            long r17 = r6 - r3
        L_0x01e0:
            r3 = r17
            goto L_0x010a
        L_0x01e4:
            java.net.HttpURLConnection r0 = r1.f11612h     // Catch:{ IOException -> 0x01fb }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x01fb }
            r1.f11613i = r0     // Catch:{ IOException -> 0x01fb }
            r3 = 1
            r1.f11614j = r3
            com.google.android.gms.internal.ads.im<? super com.google.android.gms.internal.ads.nr0> r0 = r1.f11610f
            if (r0 == 0) goto L_0x01f8
            com.google.android.gms.internal.ads.as0 r0 = (com.google.android.gms.internal.ads.as0) r0
            r0.mo5480k(r1, r2)
        L_0x01f8:
            long r2 = r1.f11616l
            return r2
        L_0x01fb:
            r0 = move-exception
            r21.m14037i()
            com.google.android.gms.internal.ads.zl r3 = new com.google.android.gms.internal.ads.zl
            r4 = 1
            r3.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.C2299vl) r2, (int) r4)
            throw r3
        L_0x0206:
            java.net.HttpURLConnection r3 = r1.f11612h
            java.util.Map r3 = r3.getHeaderFields()
            r21.m14037i()
            com.google.android.gms.internal.ads.am r4 = new com.google.android.gms.internal.ads.am
            r4.<init>(r0, r3, r2)
            r2 = 416(0x1a0, float:5.83E-43)
            if (r0 != r2) goto L_0x0221
            com.google.android.gms.internal.ads.ul r0 = new com.google.android.gms.internal.ads.ul
            r5 = 0
            r0.<init>(r5)
            r4.initCause(r0)
        L_0x0221:
            throw r4
        L_0x0222:
            r0 = move-exception
            r4 = r0
            r21.m14037i()
            com.google.android.gms.internal.ads.zl r0 = new com.google.android.gms.internal.ads.zl
            android.net.Uri r5 = r2.f16339a
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x023e
            java.lang.String r3 = r3.concat(r5)
            goto L_0x0244
        L_0x023e:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r3 = r5
        L_0x0244:
            r5 = 1
            r0.<init>(r3, r4, r2, r5)
            throw r0
        L_0x0249:
            r5 = 0
            r14 = 0
            java.lang.String r4 = "Location"
            java.lang.String r4 = r12.getHeaderField(r4)     // Catch:{ IOException -> 0x02b2 }
            r12.disconnect()     // Catch:{ IOException -> 0x02b2 }
            if (r4 == 0) goto L_0x0291
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x02b2 }
            r6.<init>(r0, r4)     // Catch:{ IOException -> 0x02b2 }
            java.lang.String r0 = r6.getProtocol()     // Catch:{ IOException -> 0x02b2 }
            java.lang.String r4 = "https"
            boolean r4 = r4.equals(r0)     // Catch:{ IOException -> 0x02b2 }
            if (r4 != 0) goto L_0x028c
            java.lang.String r4 = "http"
            boolean r4 = r4.equals(r0)     // Catch:{ IOException -> 0x02b2 }
            if (r4 != 0) goto L_0x028c
            java.net.ProtocolException r4 = new java.net.ProtocolException     // Catch:{ IOException -> 0x02b2 }
            java.lang.String r5 = "Unsupported protocol redirect: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x02b2 }
            int r6 = r0.length()     // Catch:{ IOException -> 0x02b2 }
            if (r6 == 0) goto L_0x0283
            java.lang.String r0 = r5.concat(r0)     // Catch:{ IOException -> 0x02b2 }
            goto L_0x0288
        L_0x0283:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x02b2 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x02b2 }
        L_0x0288:
            r4.<init>(r0)     // Catch:{ IOException -> 0x02b2 }
            throw r4     // Catch:{ IOException -> 0x02b2 }
        L_0x028c:
            r0 = r6
            r12 = r13
            r4 = r14
            goto L_0x001e
        L_0x0291:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x02b2 }
            java.lang.String r4 = "Null location redirect"
            r0.<init>(r4)     // Catch:{ IOException -> 0x02b2 }
            throw r0     // Catch:{ IOException -> 0x02b2 }
        L_0x0299:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x02b2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02b2 }
            r5 = 31
            r4.<init>(r5)     // Catch:{ IOException -> 0x02b2 }
            java.lang.String r5 = "Too many redirects: "
            r4.append(r5)     // Catch:{ IOException -> 0x02b2 }
            r4.append(r13)     // Catch:{ IOException -> 0x02b2 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x02b2 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x02b2 }
            throw r0     // Catch:{ IOException -> 0x02b2 }
        L_0x02b2:
            r0 = move-exception
            com.google.android.gms.internal.ads.zl r4 = new com.google.android.gms.internal.ads.zl
            android.net.Uri r5 = r2.f16339a
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x02ca
            java.lang.String r3 = r3.concat(r5)
            goto L_0x02d0
        L_0x02ca:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r3 = r5
        L_0x02d0:
            r5 = 1
            r4.<init>(r3, r0, r2, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nr0.mo5936e(com.google.android.gms.internal.ads.vl):long");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|(1:6)(1:7)|8|9|(5:13|14|(2:16|(1:18))(2:19|(1:21))|22|(1:26))|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5937g() {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f11613i     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x0077
            java.net.HttpURLConnection r2 = r9.f11612h     // Catch:{ all -> 0x0088 }
            long r3 = r9.f11616l     // Catch:{ all -> 0x0088 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            long r7 = r9.f11618n     // Catch:{ all -> 0x0088 }
            long r3 = r3 - r7
        L_0x0014:
            int r7 = com.google.android.gms.internal.ads.C2449zm.f18287a     // Catch:{ all -> 0x0088 }
            r8 = 19
            if (r7 == r8) goto L_0x001f
            r8 = 20
            if (r7 == r8) goto L_0x001f
            goto L_0x0067
        L_0x001f:
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x0067 }
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            int r3 = r2.read()     // Catch:{ Exception -> 0x0067 }
            r4 = -1
            if (r3 == r4) goto L_0x0067
            goto L_0x0036
        L_0x002f:
            r5 = 2048(0x800, double:1.0118E-320)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0036
            goto L_0x0067
        L_0x0036:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x0067 }
            if (r4 != 0) goto L_0x004e
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0067 }
            if (r3 == 0) goto L_0x0067
        L_0x004e:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0067 }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0067 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x0067 }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x0067 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0067 }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            java.io.InputStream r2 = r9.f11613i     // Catch:{ IOException -> 0x006d }
            r2.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0077
        L_0x006d:
            r2 = move-exception
            com.google.android.gms.internal.ads.zl r3 = new com.google.android.gms.internal.ads.zl     // Catch:{ all -> 0x0088 }
            com.google.android.gms.internal.ads.vl r4 = r9.f11611g     // Catch:{ all -> 0x0088 }
            r5 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.C2299vl) r4, (int) r5)     // Catch:{ all -> 0x0088 }
            throw r3     // Catch:{ all -> 0x0088 }
        L_0x0077:
            r9.f11613i = r0
            r9.m14037i()
            boolean r0 = r9.f11614j
            if (r0 == 0) goto L_0x0082
            r9.f11614j = r1
        L_0x0082:
            java.util.Set<java.net.Socket> r0 = r9.f11620p
            r0.clear()
            return
        L_0x0088:
            r2 = move-exception
            r9.f11613i = r0
            r9.m14037i()
            boolean r0 = r9.f11614j
            if (r0 == 0) goto L_0x0094
            r9.f11614j = r1
        L_0x0094:
            java.util.Set<java.net.Socket> r0 = r9.f11620p
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nr0.mo5937g():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo9588h(int i) {
        this.f11619o = i;
        for (Socket next : this.f11620p) {
            if (!next.isClosed()) {
                try {
                    next.setReceiveBufferSize(this.f11619o);
                } catch (SocketException e) {
                    io0.m11132h("Failed to update receive buffer size.", e);
                }
            }
        }
    }
}
