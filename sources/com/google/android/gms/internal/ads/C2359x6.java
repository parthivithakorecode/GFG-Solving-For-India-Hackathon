package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.x6 */
public final class C2359x6 implements C1876k5 {

    /* renamed from: a */
    private final Map<String, C2247u6> f17040a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b */
    private long f17041b = 0;

    /* renamed from: c */
    private final C2321w6 f17042c;

    /* renamed from: d */
    private final int f17043d;

    public C2359x6(C2321w6 w6Var, int i) {
        this.f17042c = w6Var;
        this.f17043d = 5242880;
    }

    public C2359x6(File file, int i) {
        this.f17042c = new C2210t6(this, file);
        this.f17043d = 20971520;
    }

    /* renamed from: e */
    static int m19353e(InputStream inputStream) {
        return (m19360n(inputStream) << 24) | m19360n(inputStream) | (m19360n(inputStream) << 8) | (m19360n(inputStream) << 16);
    }

    /* renamed from: f */
    static long m19354f(InputStream inputStream) {
        return (((long) m19360n(inputStream)) & 255) | ((((long) m19360n(inputStream)) & 255) << 8) | ((((long) m19360n(inputStream)) & 255) << 16) | ((((long) m19360n(inputStream)) & 255) << 24) | ((((long) m19360n(inputStream)) & 255) << 32) | ((((long) m19360n(inputStream)) & 255) << 40) | ((((long) m19360n(inputStream)) & 255) << 48) | ((255 & ((long) m19360n(inputStream))) << 56);
    }

    /* renamed from: h */
    static String m19355h(C2284v6 v6Var) {
        return new String(m19359m(v6Var, m19354f(v6Var)), "UTF-8");
    }

    /* renamed from: j */
    static void m19356j(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: k */
    static void m19357k(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: l */
    static void m19358l(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        m19357k(outputStream, (long) length);
        outputStream.write(bytes, 0, length);
    }

    /* renamed from: m */
    static byte[] m19359m(C2284v6 v6Var, long j) {
        long d = v6Var.mo11406d();
        if (j >= 0 && j <= d) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(v6Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(d);
        throw new IOException(sb.toString());
    }

    /* renamed from: n */
    private static int m19360n(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: o */
    private final void m19361o(String str, C2247u6 u6Var) {
        if (!this.f17040a.containsKey(str)) {
            this.f17041b += u6Var.f15415a;
        } else {
            this.f17041b += u6Var.f15415a - this.f17040a.get(str).f15415a;
        }
        this.f17040a.put(str, u6Var);
    }

    /* renamed from: p */
    private final void m19362p(String str) {
        C2247u6 remove = this.f17040a.remove(str);
        if (remove != null) {
            this.f17041b -= remove.f15415a;
        }
    }

    /* renamed from: q */
    private static final String m19363q(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x005a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo8615a() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.w6 r0 = r9.f17042c     // Catch:{ all -> 0x0062 }
            java.io.File r0 = r0.zza()     // Catch:{ all -> 0x0062 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0062 }
            r2 = 0
            if (r1 != 0) goto L_0x0026
            boolean r1 = r0.mkdirs()     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0024
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0062 }
            r1[r2] = r0     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "Unable to create cache dir %s"
            com.google.android.gms.internal.ads.C1988n6.m13724b(r0, r1)     // Catch:{ all -> 0x0062 }
            monitor-exit(r9)
            return
        L_0x0024:
            monitor-exit(r9)
            return
        L_0x0026:
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r9)
            return
        L_0x002e:
            int r1 = r0.length     // Catch:{ all -> 0x0062 }
        L_0x002f:
            if (r2 >= r1) goto L_0x0060
            r3 = r0[r2]     // Catch:{ all -> 0x0062 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x005a }
            com.google.android.gms.internal.ads.v6 r6 = new com.google.android.gms.internal.ads.v6     // Catch:{ IOException -> 0x005a }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x005a }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x005a }
            r8.<init>(r3)     // Catch:{ IOException -> 0x005a }
            r7.<init>(r8)     // Catch:{ IOException -> 0x005a }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x005a }
            com.google.android.gms.internal.ads.u6 r7 = com.google.android.gms.internal.ads.C2247u6.m17730a(r6)     // Catch:{ all -> 0x0055 }
            r7.f15415a = r4     // Catch:{ all -> 0x0055 }
            java.lang.String r4 = r7.f15416b     // Catch:{ all -> 0x0055 }
            r9.m19361o(r4, r7)     // Catch:{ all -> 0x0055 }
            r6.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005d
        L_0x0055:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x005a }
            throw r4     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            r3.delete()     // Catch:{ all -> 0x0062 }
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0060:
            monitor-exit(r9)
            return
        L_0x0062:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2359x6.mo8615a():void");
    }

    /* renamed from: b */
    public final synchronized C1839j5 mo8616b(String str) {
        C2284v6 v6Var;
        C2247u6 u6Var = this.f17040a.get(str);
        if (u6Var == null) {
            return null;
        }
        File g = mo11772g(str);
        try {
            v6Var = new C2284v6(new BufferedInputStream(new FileInputStream(g)), g.length());
            C2247u6 a = C2247u6.m17730a(v6Var);
            if (!TextUtils.equals(str, a.f15416b)) {
                C1988n6.m13723a("%s: key=%s, found=%s", g.getAbsolutePath(), str, a.f15416b);
                m19362p(str);
                v6Var.close();
                return null;
            }
            byte[] m = m19359m(v6Var, v6Var.mo11406d());
            C1839j5 j5Var = new C1839j5();
            j5Var.f8983a = m;
            j5Var.f8984b = u6Var.f15417c;
            j5Var.f8985c = u6Var.f15418d;
            j5Var.f8986d = u6Var.f15419e;
            j5Var.f8987e = u6Var.f15420f;
            j5Var.f8988f = u6Var.f15421g;
            List<C2172s5> list = u6Var.f15422h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (C2172s5 next : list) {
                treeMap.put(next.mo10727a(), next.mo10728b());
            }
            j5Var.f8989g = treeMap;
            j5Var.f8990h = Collections.unmodifiableList(u6Var.f15422h);
            v6Var.close();
            return j5Var;
        } catch (IOException e) {
            C1988n6.m13723a("%s: %s", g.getAbsolutePath(), e.toString());
            mo11773i(str);
            return null;
        } catch (Throwable th) {
            v6Var.close();
            throw th;
        }
    }

    /* renamed from: c */
    public final synchronized void mo8617c(String str, boolean z) {
        C1839j5 b = mo8616b(str);
        if (b != null) {
            b.f8988f = 0;
            b.f8987e = 0;
            mo8618d(str, b);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0163 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo8618d(java.lang.String r16, com.google.android.gms.internal.ads.C1839j5 r17) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r2 = r17
            monitor-enter(r15)
            long r3 = r1.f17041b     // Catch:{ all -> 0x019a }
            byte[] r5 = r2.f8983a     // Catch:{ all -> 0x019a }
            int r5 = r5.length     // Catch:{ all -> 0x019a }
            int r6 = r1.f17043d     // Catch:{ all -> 0x019a }
            long r7 = (long) r5
            long r3 = r3 + r7
            long r7 = (long) r6
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r4 = 1063675494(0x3f666666, float:0.9)
            if (r3 <= 0) goto L_0x0021
            float r3 = (float) r5
            float r5 = (float) r6
            float r5 = r5 * r4
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            monitor-exit(r15)
            return
        L_0x0021:
            java.io.File r3 = r15.mo11772g(r16)     // Catch:{ all -> 0x019a }
            r6 = 0
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0163 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0163 }
            r8.<init>(r3)     // Catch:{ IOException -> 0x0163 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0163 }
            com.google.android.gms.internal.ads.u6 r8 = new com.google.android.gms.internal.ads.u6     // Catch:{ IOException -> 0x0163 }
            r8.<init>(r0, r2)     // Catch:{ IOException -> 0x0163 }
            r9 = 538247942(0x20150306, float:1.2621791E-19)
            m19356j(r7, r9)     // Catch:{ IOException -> 0x013d }
            java.lang.String r9 = r8.f15416b     // Catch:{ IOException -> 0x013d }
            m19358l(r7, r9)     // Catch:{ IOException -> 0x013d }
            java.lang.String r9 = r8.f15417c     // Catch:{ IOException -> 0x013d }
            if (r9 != 0) goto L_0x0046
            java.lang.String r9 = ""
        L_0x0046:
            m19358l(r7, r9)     // Catch:{ IOException -> 0x013d }
            long r9 = r8.f15418d     // Catch:{ IOException -> 0x013d }
            m19357k(r7, r9)     // Catch:{ IOException -> 0x013d }
            long r9 = r8.f15419e     // Catch:{ IOException -> 0x013d }
            m19357k(r7, r9)     // Catch:{ IOException -> 0x013d }
            long r9 = r8.f15420f     // Catch:{ IOException -> 0x013d }
            m19357k(r7, r9)     // Catch:{ IOException -> 0x013d }
            long r9 = r8.f15421g     // Catch:{ IOException -> 0x013d }
            m19357k(r7, r9)     // Catch:{ IOException -> 0x013d }
            java.util.List<com.google.android.gms.internal.ads.s5> r9 = r8.f15422h     // Catch:{ IOException -> 0x013d }
            if (r9 == 0) goto L_0x0087
            int r10 = r9.size()     // Catch:{ IOException -> 0x013d }
            m19356j(r7, r10)     // Catch:{ IOException -> 0x013d }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ IOException -> 0x013d }
        L_0x006c:
            boolean r10 = r9.hasNext()     // Catch:{ IOException -> 0x013d }
            if (r10 == 0) goto L_0x008a
            java.lang.Object r10 = r9.next()     // Catch:{ IOException -> 0x013d }
            com.google.android.gms.internal.ads.s5 r10 = (com.google.android.gms.internal.ads.C2172s5) r10     // Catch:{ IOException -> 0x013d }
            java.lang.String r11 = r10.mo10727a()     // Catch:{ IOException -> 0x013d }
            m19358l(r7, r11)     // Catch:{ IOException -> 0x013d }
            java.lang.String r10 = r10.mo10728b()     // Catch:{ IOException -> 0x013d }
            m19358l(r7, r10)     // Catch:{ IOException -> 0x013d }
            goto L_0x006c
        L_0x0087:
            m19356j(r7, r6)     // Catch:{ IOException -> 0x013d }
        L_0x008a:
            r7.flush()     // Catch:{ IOException -> 0x013d }
            byte[] r2 = r2.f8983a     // Catch:{ IOException -> 0x0163 }
            r7.write(r2)     // Catch:{ IOException -> 0x0163 }
            r7.close()     // Catch:{ IOException -> 0x0163 }
            long r9 = r3.length()     // Catch:{ IOException -> 0x0163 }
            r8.f15415a = r9     // Catch:{ IOException -> 0x0163 }
            r15.m19361o(r0, r8)     // Catch:{ IOException -> 0x0163 }
            long r7 = r1.f17041b     // Catch:{ IOException -> 0x0163 }
            int r0 = r1.f17043d     // Catch:{ IOException -> 0x0163 }
            long r9 = (long) r0     // Catch:{ IOException -> 0x0163 }
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a9
            goto L_0x0198
        L_0x00a9:
            boolean r0 = com.google.android.gms.internal.ads.C1988n6.f11315b     // Catch:{ IOException -> 0x0163 }
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = "Pruning old cache entries."
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x0163 }
            com.google.android.gms.internal.ads.C1988n6.m13726d(r0, r2)     // Catch:{ IOException -> 0x0163 }
        L_0x00b4:
            long r7 = r1.f17041b     // Catch:{ IOException -> 0x0163 }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0163 }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.u6> r0 = r1.f17040a     // Catch:{ IOException -> 0x0163 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x0163 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x0163 }
            r2 = r6
        L_0x00c5:
            boolean r11 = r0.hasNext()     // Catch:{ IOException -> 0x0163 }
            r12 = 2
            if (r11 == 0) goto L_0x0114
            java.lang.Object r11 = r0.next()     // Catch:{ IOException -> 0x0163 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ IOException -> 0x0163 }
            java.lang.Object r11 = r11.getValue()     // Catch:{ IOException -> 0x0163 }
            com.google.android.gms.internal.ads.u6 r11 = (com.google.android.gms.internal.ads.C2247u6) r11     // Catch:{ IOException -> 0x0163 }
            java.lang.String r13 = r11.f15416b     // Catch:{ IOException -> 0x0163 }
            java.io.File r13 = r15.mo11772g(r13)     // Catch:{ IOException -> 0x0163 }
            boolean r13 = r13.delete()     // Catch:{ IOException -> 0x0163 }
            if (r13 == 0) goto L_0x00ec
            long r13 = r1.f17041b     // Catch:{ IOException -> 0x0163 }
            long r4 = r11.f15415a     // Catch:{ IOException -> 0x0163 }
            long r13 = r13 - r4
            r1.f17041b = r13     // Catch:{ IOException -> 0x0163 }
            goto L_0x00fe
        L_0x00ec:
            java.lang.String r4 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x0163 }
            java.lang.String r11 = r11.f15416b     // Catch:{ IOException -> 0x0163 }
            r5[r6] = r11     // Catch:{ IOException -> 0x0163 }
            java.lang.String r11 = m19363q(r11)     // Catch:{ IOException -> 0x0163 }
            r13 = 1
            r5[r13] = r11     // Catch:{ IOException -> 0x0163 }
            com.google.android.gms.internal.ads.C1988n6.m13723a(r4, r5)     // Catch:{ IOException -> 0x0163 }
        L_0x00fe:
            r0.remove()     // Catch:{ IOException -> 0x0163 }
            int r2 = r2 + 1
            long r4 = r1.f17041b     // Catch:{ IOException -> 0x0163 }
            float r4 = (float) r4     // Catch:{ IOException -> 0x0163 }
            int r5 = r1.f17043d     // Catch:{ IOException -> 0x0163 }
            float r5 = (float) r5     // Catch:{ IOException -> 0x0163 }
            r11 = 1063675494(0x3f666666, float:0.9)
            float r5 = r5 * r11
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r4 = r11
            goto L_0x00c5
        L_0x0114:
            boolean r0 = com.google.android.gms.internal.ads.C1988n6.f11315b     // Catch:{ IOException -> 0x0163 }
            if (r0 == 0) goto L_0x0198
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x0163 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0163 }
            r0[r6] = r2     // Catch:{ IOException -> 0x0163 }
            long r4 = r1.f17041b     // Catch:{ IOException -> 0x0163 }
            long r4 = r4 - r7
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0163 }
            r4 = 1
            r0[r4] = r2     // Catch:{ IOException -> 0x0163 }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0163 }
            long r4 = r4 - r9
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0163 }
            r0[r12] = r2     // Catch:{ IOException -> 0x0163 }
            java.lang.String r2 = "pruned %d files, %d bytes, %d ms"
            com.google.android.gms.internal.ads.C1988n6.m13726d(r2, r0)     // Catch:{ IOException -> 0x0163 }
            monitor-exit(r15)
            return
        L_0x013d:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0163 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0163 }
            r4[r6] = r0     // Catch:{ IOException -> 0x0163 }
            java.lang.String r0 = "%s"
            com.google.android.gms.internal.ads.C1988n6.m13723a(r0, r4)     // Catch:{ IOException -> 0x0163 }
            r7.close()     // Catch:{ IOException -> 0x0163 }
            java.lang.String r0 = "Failed to write header for %s"
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0163 }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x0163 }
            r4[r6] = r2     // Catch:{ IOException -> 0x0163 }
            com.google.android.gms.internal.ads.C1988n6.m13723a(r0, r4)     // Catch:{ IOException -> 0x0163 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0163 }
            r0.<init>()     // Catch:{ IOException -> 0x0163 }
            throw r0     // Catch:{ IOException -> 0x0163 }
        L_0x0163:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x019a }
            if (r0 != 0) goto L_0x0177
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x019a }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ all -> 0x019a }
            r0[r6] = r2     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "Could not clean up file %s"
            com.google.android.gms.internal.ads.C1988n6.m13723a(r2, r0)     // Catch:{ all -> 0x019a }
        L_0x0177:
            com.google.android.gms.internal.ads.w6 r0 = r1.f17042c     // Catch:{ all -> 0x019a }
            java.io.File r0 = r0.zza()     // Catch:{ all -> 0x019a }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x019a }
            if (r0 != 0) goto L_0x0198
            java.lang.String r0 = "Re-initializing cache after external clearing."
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ all -> 0x019a }
            com.google.android.gms.internal.ads.C1988n6.m13723a(r0, r2)     // Catch:{ all -> 0x019a }
            java.util.Map<java.lang.String, com.google.android.gms.internal.ads.u6> r0 = r1.f17040a     // Catch:{ all -> 0x019a }
            r0.clear()     // Catch:{ all -> 0x019a }
            r2 = 0
            r1.f17041b = r2     // Catch:{ all -> 0x019a }
            r15.mo8615a()     // Catch:{ all -> 0x019a }
            monitor-exit(r15)
            return
        L_0x0198:
            monitor-exit(r15)
            return
        L_0x019a:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2359x6.mo8618d(java.lang.String, com.google.android.gms.internal.ads.j5):void");
    }

    /* renamed from: g */
    public final File mo11772g(String str) {
        return new File(this.f17042c.zza(), m19363q(str));
    }

    /* renamed from: i */
    public final synchronized void mo11773i(String str) {
        boolean delete = mo11772g(str).delete();
        m19362p(str);
        if (!delete) {
            C1988n6.m13723a("Could not delete cache entry for key=%s, filename=%s", str, m19363q(str));
        }
    }
}
