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

final class et0 extends eb1 implements tr1 {

    /* renamed from: u */
    private static final Pattern f6358u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: v */
    private static final AtomicReference<byte[]> f6359v = new AtomicReference<>();

    /* renamed from: e */
    private final SSLSocketFactory f6360e = new dt0(this);

    /* renamed from: f */
    private final int f6361f;

    /* renamed from: g */
    private final int f6362g;

    /* renamed from: h */
    private final String f6363h;

    /* renamed from: i */
    private final sq1 f6364i;

    /* renamed from: j */
    private li1 f6365j;

    /* renamed from: k */
    private HttpURLConnection f6366k;

    /* renamed from: l */
    private InputStream f6367l;

    /* renamed from: m */
    private boolean f6368m;

    /* renamed from: n */
    private int f6369n;

    /* renamed from: o */
    private long f6370o;

    /* renamed from: p */
    private long f6371p;

    /* renamed from: q */
    private long f6372q;

    /* renamed from: r */
    private long f6373r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f6374s;

    /* renamed from: t */
    private final Set<Socket> f6375t = new HashSet();

    et0(String str, vt1 vt1, int i, int i2, int i3) {
        super(true);
        wu1.m19204c(str);
        this.f6363h = str;
        this.f6364i = new sq1();
        this.f6361f = i;
        this.f6362g = i2;
        this.f6374s = i3;
        if (vt1 != null) {
            mo6892j(vt1);
        }
    }

    /* renamed from: v */
    private final void m8726v() {
        HttpURLConnection httpURLConnection = this.f6366k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                io0.m11129e("Unexpected error while disconnecting", e);
            }
            this.f6366k = null;
        }
    }

    /* renamed from: a */
    public final int mo5752a(byte[] bArr, int i, int i2) {
        try {
            if (this.f6372q != this.f6370o) {
                byte[] andSet = f6359v.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j = this.f6372q;
                    long j2 = this.f6370o;
                    if (j == j2) {
                        f6359v.set(andSet);
                        break;
                    }
                    int read = this.f6367l.read(andSet, 0, (int) Math.min(j2 - j, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f6372q += (long) read;
                        mo6893o(read);
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.f6371p;
            if (j3 != -1) {
                long j4 = j3 - this.f6373r;
                if (j4 != 0) {
                    i2 = (int) Math.min((long) i2, j4);
                }
                return -1;
            }
            int read2 = this.f6367l.read(bArr, i, i2);
            if (read2 != -1) {
                this.f6373r += (long) read2;
                mo6893o(read2);
                return read2;
            } else if (this.f6371p == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new qo1(e, this.f6365j, 2000, 2);
        }
    }

    /* renamed from: h */
    public final Uri mo5753h() {
        HttpURLConnection httpURLConnection = this.f6366k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|(1:6)(1:7)|8|9|(5:13|14|(2:16|(1:18))(2:19|(1:21))|22|(1:26))|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5754i() {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f6367l     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x0079
            java.net.HttpURLConnection r2 = r9.f6366k     // Catch:{ all -> 0x008d }
            long r3 = r9.f6371p     // Catch:{ all -> 0x008d }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            long r7 = r9.f6373r     // Catch:{ all -> 0x008d }
            long r3 = r3 - r7
        L_0x0014:
            int r7 = com.google.android.gms.internal.ads.n13.f11236a     // Catch:{ all -> 0x008d }
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
            java.io.InputStream r2 = r9.f6367l     // Catch:{ IOException -> 0x006d }
            r2.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0079
        L_0x006d:
            r2 = move-exception
            com.google.android.gms.internal.ads.qo1 r3 = new com.google.android.gms.internal.ads.qo1     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.li1 r4 = r9.f6365j     // Catch:{ all -> 0x008d }
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.li1) r4, (int) r5, (int) r6)     // Catch:{ all -> 0x008d }
            throw r3     // Catch:{ all -> 0x008d }
        L_0x0079:
            r9.f6367l = r0
            r9.m8726v()
            boolean r0 = r9.f6368m
            if (r0 == 0) goto L_0x0087
            r9.f6368m = r1
            r9.mo6894p()
        L_0x0087:
            java.util.Set<java.net.Socket> r0 = r9.f6375t
            r0.clear()
            return
        L_0x008d:
            r2 = move-exception
            r9.f6367l = r0
            r9.m8726v()
            boolean r0 = r9.f6368m
            if (r0 == 0) goto L_0x009c
            r9.f6368m = r1
            r9.mo6894p()
        L_0x009c:
            java.util.Set<java.net.Socket> r0 = r9.f6375t
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.et0.mo5754i():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010b, code lost:
        if (r2 != 0) goto L_0x0110;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01f1  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo5755k(com.google.android.gms.internal.ads.li1 r22) {
        /*
            r21 = this;
            r1 = r21
            r7 = r22
            java.lang.String r2 = "Unable to connect to "
            r1.f6365j = r7
            r3 = 0
            r1.f6373r = r3
            r1.f6372q = r3
            r5 = 1
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x02cf }
            android.net.Uri r6 = r7.f10058a     // Catch:{ IOException -> 0x02cf }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x02cf }
            r0.<init>(r6)     // Catch:{ IOException -> 0x02cf }
            long r8 = r7.f10063f     // Catch:{ IOException -> 0x02cf }
            long r10 = r7.f10064g     // Catch:{ IOException -> 0x02cf }
            boolean r6 = r7.mo8963b(r5)     // Catch:{ IOException -> 0x02cf }
            r13 = 0
        L_0x0023:
            int r14 = r13 + 1
            r15 = 20
            if (r13 > r15) goto L_0x02b6
            java.net.URLConnection r13 = r0.openConnection()     // Catch:{ IOException -> 0x02cf }
            java.net.HttpURLConnection r13 = (java.net.HttpURLConnection) r13     // Catch:{ IOException -> 0x02cf }
            boolean r5 = r13 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x02cf }
            if (r5 == 0) goto L_0x003b
            r5 = r13
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ IOException -> 0x02cf }
            javax.net.ssl.SSLSocketFactory r12 = r1.f6360e     // Catch:{ IOException -> 0x02cf }
            r5.setSSLSocketFactory(r12)     // Catch:{ IOException -> 0x02cf }
        L_0x003b:
            int r5 = r1.f6361f     // Catch:{ IOException -> 0x02cf }
            r13.setConnectTimeout(r5)     // Catch:{ IOException -> 0x02cf }
            int r5 = r1.f6362g     // Catch:{ IOException -> 0x02cf }
            r13.setReadTimeout(r5)     // Catch:{ IOException -> 0x02cf }
            com.google.android.gms.internal.ads.sq1 r5 = r1.f6364i     // Catch:{ IOException -> 0x02cf }
            java.util.Map r5 = r5.mo10842a()     // Catch:{ IOException -> 0x02cf }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x02cf }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x02cf }
        L_0x0053:
            boolean r12 = r5.hasNext()     // Catch:{ IOException -> 0x02cf }
            if (r12 == 0) goto L_0x0073
            java.lang.Object r12 = r5.next()     // Catch:{ IOException -> 0x02cf }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ IOException -> 0x02cf }
            java.lang.Object r16 = r12.getKey()     // Catch:{ IOException -> 0x02cf }
            r15 = r16
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x02cf }
            java.lang.Object r12 = r12.getValue()     // Catch:{ IOException -> 0x02cf }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x02cf }
            r13.setRequestProperty(r15, r12)     // Catch:{ IOException -> 0x02cf }
            r15 = 20
            goto L_0x0053
        L_0x0073:
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            r12 = 27
            r17 = -1
            if (r5 != 0) goto L_0x007f
            int r5 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x00b9
        L_0x007f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02cf }
            r5.<init>(r12)     // Catch:{ IOException -> 0x02cf }
            java.lang.String r15 = "bytes="
            r5.append(r15)     // Catch:{ IOException -> 0x02cf }
            r5.append(r8)     // Catch:{ IOException -> 0x02cf }
            java.lang.String r15 = "-"
            r5.append(r15)     // Catch:{ IOException -> 0x02cf }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x02cf }
            int r15 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r15 == 0) goto L_0x00b4
            long r19 = r8 + r10
            long r3 = r19 + r17
            int r15 = r5.length()     // Catch:{ IOException -> 0x02cf }
            r16 = 20
            int r15 = r15 + 20
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02cf }
            r12.<init>(r15)     // Catch:{ IOException -> 0x02cf }
            r12.append(r5)     // Catch:{ IOException -> 0x02cf }
            r12.append(r3)     // Catch:{ IOException -> 0x02cf }
            java.lang.String r5 = r12.toString()     // Catch:{ IOException -> 0x02cf }
        L_0x00b4:
            java.lang.String r3 = "Range"
            r13.setRequestProperty(r3, r5)     // Catch:{ IOException -> 0x02cf }
        L_0x00b9:
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = r1.f6363h     // Catch:{ IOException -> 0x02cf }
            r13.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x02cf }
            if (r6 != 0) goto L_0x00c9
            java.lang.String r3 = "Accept-Encoding"
            java.lang.String r4 = "identity"
            r13.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x02cf }
        L_0x00c9:
            r3 = 0
            r13.setInstanceFollowRedirects(r3)     // Catch:{ IOException -> 0x02cf }
            r13.setDoOutput(r3)     // Catch:{ IOException -> 0x02cf }
            r13.connect()     // Catch:{ IOException -> 0x02cf }
            int r4 = r13.getResponseCode()     // Catch:{ IOException -> 0x02cf }
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 == r5) goto L_0x0265
            r5 = 301(0x12d, float:4.22E-43)
            if (r4 == r5) goto L_0x0265
            r5 = 302(0x12e, float:4.23E-43)
            if (r4 == r5) goto L_0x0265
            r5 = 303(0x12f, float:4.25E-43)
            if (r4 == r5) goto L_0x0265
            r5 = 307(0x133, float:4.3E-43)
            if (r4 == r5) goto L_0x0265
            r5 = 308(0x134, float:4.32E-43)
            if (r4 != r5) goto L_0x00f1
            goto L_0x0265
        L_0x00f1:
            r1.f6366k = r13     // Catch:{ IOException -> 0x02cf }
            int r0 = r13.getResponseCode()     // Catch:{ IOException -> 0x023f }
            r1.f6369n = r0     // Catch:{ IOException -> 0x023f }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 < r2) goto L_0x0217
            r3 = 299(0x12b, float:4.19E-43)
            if (r0 <= r3) goto L_0x0103
            goto L_0x0217
        L_0x0103:
            if (r0 != r2) goto L_0x010e
            long r2 = r7.f10063f
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x010e
            goto L_0x0110
        L_0x010e:
            r2 = 0
        L_0x0110:
            r1.f6370o = r2
            r2 = 1
            boolean r0 = r7.mo8963b(r2)
            long r2 = r7.f10064g
            if (r0 != 0) goto L_0x01f7
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0121
            goto L_0x01f7
        L_0x0121:
            java.net.HttpURLConnection r0 = r1.f6366k
            java.lang.String r2 = "Content-Length"
            java.lang.String r2 = r0.getHeaderField(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r4 = "]"
            if (r3 != 0) goto L_0x0157
            long r5 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0136 }
            goto L_0x0159
        L_0x0136:
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 28
            r5.<init>(r3)
            java.lang.String r3 = "Unexpected Content-Length ["
            r5.append(r3)
            r5.append(r2)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            com.google.android.gms.internal.ads.io0.m11128d(r3)
        L_0x0157:
            r5 = r17
        L_0x0159:
            java.lang.String r3 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x01ed
            java.util.regex.Pattern r3 = f6358u
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r8 = r3.find()
            if (r8 == 0) goto L_0x01ed
            r8 = 2
            java.lang.String r8 = r3.group(r8)     // Catch:{ NumberFormatException -> 0x01cb }
            long r8 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x01cb }
            r10 = 1
            java.lang.String r3 = r3.group(r10)     // Catch:{ NumberFormatException -> 0x01cb }
            long r10 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x01cb }
            long r8 = r8 - r10
            r10 = 1
            long r8 = r8 + r10
            r19 = 0
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 >= 0) goto L_0x018f
            r5 = r8
            goto L_0x01ed
        L_0x018f:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x01ed
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ NumberFormatException -> 0x01cb }
            int r3 = r3.length()     // Catch:{ NumberFormatException -> 0x01cb }
            int r3 = r3 + 26
            java.lang.String r10 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01cb }
            int r10 = r10.length()     // Catch:{ NumberFormatException -> 0x01cb }
            int r3 = r3 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x01cb }
            r10.<init>(r3)     // Catch:{ NumberFormatException -> 0x01cb }
            java.lang.String r3 = "Inconsistent headers ["
            r10.append(r3)     // Catch:{ NumberFormatException -> 0x01cb }
            r10.append(r2)     // Catch:{ NumberFormatException -> 0x01cb }
            java.lang.String r2 = "] ["
            r10.append(r2)     // Catch:{ NumberFormatException -> 0x01cb }
            r10.append(r0)     // Catch:{ NumberFormatException -> 0x01cb }
            r10.append(r4)     // Catch:{ NumberFormatException -> 0x01cb }
            java.lang.String r2 = r10.toString()     // Catch:{ NumberFormatException -> 0x01cb }
            com.google.android.gms.internal.ads.io0.m11131g(r2)     // Catch:{ NumberFormatException -> 0x01cb }
            long r2 = java.lang.Math.max(r5, r8)     // Catch:{ NumberFormatException -> 0x01cb }
            r5 = r2
            goto L_0x01ed
        L_0x01cb:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r8 = 27
            int r2 = r2 + r8
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected Content-Range ["
            r3.append(r2)
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.internal.ads.io0.m11128d(r0)
        L_0x01ed:
            int r0 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x01f5
            long r2 = r1.f6370o
            long r17 = r5 - r2
        L_0x01f5:
            r2 = r17
        L_0x01f7:
            r1.f6371p = r2
            java.net.HttpURLConnection r0 = r1.f6366k     // Catch:{ IOException -> 0x020a }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x020a }
            r1.f6367l = r0     // Catch:{ IOException -> 0x020a }
            r2 = 1
            r1.f6368m = r2
            r21.mo6896r(r22)
            long r2 = r1.f6371p
            return r2
        L_0x020a:
            r0 = move-exception
            r21.m8726v()
            com.google.android.gms.internal.ads.qo1 r2 = new com.google.android.gms.internal.ads.qo1
            r3 = 2000(0x7d0, float:2.803E-42)
            r4 = 1
            r2.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.li1) r7, (int) r3, (int) r4)
            throw r2
        L_0x0217:
            java.net.HttpURLConnection r0 = r1.f6366k
            java.util.Map r6 = r0.getHeaderFields()
            r21.m8726v()
            com.google.android.gms.internal.ads.rp1 r0 = new com.google.android.gms.internal.ads.rp1
            int r3 = r1.f6369n
            r4 = 0
            r5 = 0
            byte[] r8 = com.google.android.gms.internal.ads.n13.f11241f
            r2 = r0
            r7 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8)
            int r2 = r1.f6369n
            r3 = 416(0x1a0, float:5.83E-43)
            if (r2 != r3) goto L_0x023e
            com.google.android.gms.internal.ads.if1 r2 = new com.google.android.gms.internal.ads.if1
            r3 = 2008(0x7d8, float:2.814E-42)
            r2.<init>(r3)
            r0.initCause(r2)
        L_0x023e:
            throw r0
        L_0x023f:
            r0 = move-exception
            r21.m8726v()
            com.google.android.gms.internal.ads.qo1 r3 = new com.google.android.gms.internal.ads.qo1
            android.net.Uri r4 = r7.f10058a
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r5 = r4.length()
            if (r5 == 0) goto L_0x025a
            java.lang.String r2 = r2.concat(r4)
            goto L_0x0260
        L_0x025a:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2)
            r2 = r4
        L_0x0260:
            r4 = 1
            r3.<init>((java.lang.String) r2, (java.io.IOException) r0, (com.google.android.gms.internal.ads.li1) r7, (int) r4)
            throw r3
        L_0x0265:
            r19 = 0
            java.lang.String r4 = "Location"
            java.lang.String r4 = r13.getHeaderField(r4)     // Catch:{ IOException -> 0x02cf }
            r13.disconnect()     // Catch:{ IOException -> 0x02cf }
            if (r4 == 0) goto L_0x02ae
            java.net.URL r5 = new java.net.URL     // Catch:{ IOException -> 0x02cf }
            r5.<init>(r0, r4)     // Catch:{ IOException -> 0x02cf }
            java.lang.String r0 = r5.getProtocol()     // Catch:{ IOException -> 0x02cf }
            java.lang.String r4 = "https"
            boolean r4 = r4.equals(r0)     // Catch:{ IOException -> 0x02cf }
            if (r4 != 0) goto L_0x02a7
            java.lang.String r4 = "http"
            boolean r4 = r4.equals(r0)     // Catch:{ IOException -> 0x02cf }
            if (r4 != 0) goto L_0x02a7
            java.net.ProtocolException r3 = new java.net.ProtocolException     // Catch:{ IOException -> 0x02cf }
            java.lang.String r4 = "Unsupported protocol redirect: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x02cf }
            int r5 = r0.length()     // Catch:{ IOException -> 0x02cf }
            if (r5 == 0) goto L_0x029e
            java.lang.String r0 = r4.concat(r0)     // Catch:{ IOException -> 0x02cf }
            goto L_0x02a3
        L_0x029e:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x02cf }
            r0.<init>(r4)     // Catch:{ IOException -> 0x02cf }
        L_0x02a3:
            r3.<init>(r0)     // Catch:{ IOException -> 0x02cf }
            throw r3     // Catch:{ IOException -> 0x02cf }
        L_0x02a7:
            r0 = r5
            r13 = r14
            r3 = r19
            r5 = 1
            goto L_0x0023
        L_0x02ae:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x02cf }
            java.lang.String r3 = "Null location redirect"
            r0.<init>(r3)     // Catch:{ IOException -> 0x02cf }
            throw r0     // Catch:{ IOException -> 0x02cf }
        L_0x02b6:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x02cf }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02cf }
            r4 = 31
            r3.<init>(r4)     // Catch:{ IOException -> 0x02cf }
            java.lang.String r4 = "Too many redirects: "
            r3.append(r4)     // Catch:{ IOException -> 0x02cf }
            r3.append(r14)     // Catch:{ IOException -> 0x02cf }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x02cf }
            r0.<init>(r3)     // Catch:{ IOException -> 0x02cf }
            throw r0     // Catch:{ IOException -> 0x02cf }
        L_0x02cf:
            r0 = move-exception
            com.google.android.gms.internal.ads.qo1 r3 = new com.google.android.gms.internal.ads.qo1
            android.net.Uri r4 = r7.f10058a
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r5 = r4.length()
            if (r5 == 0) goto L_0x02e7
            java.lang.String r2 = r2.concat(r4)
            goto L_0x02ed
        L_0x02e7:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2)
            r2 = r4
        L_0x02ed:
            r4 = 1
            r3.<init>((java.lang.String) r2, (java.io.IOException) r0, (com.google.android.gms.internal.ads.li1) r7, (int) r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.et0.mo5755k(com.google.android.gms.internal.ads.li1):long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo7071u(int i) {
        this.f6374s = i;
        for (Socket next : this.f6375t) {
            if (!next.isClosed()) {
                try {
                    next.setReceiveBufferSize(this.f6374s);
                } catch (SocketException e) {
                    io0.m11132h("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    public final Map<String, List<String>> zza() {
        HttpURLConnection httpURLConnection = this.f6366k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
