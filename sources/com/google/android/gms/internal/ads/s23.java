package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;
import p034e2.C2552i;

public final class s23 {

    /* renamed from: f */
    private static final Object f14225f = new Object();

    /* renamed from: a */
    private final Context f14226a;

    /* renamed from: b */
    private final SharedPreferences f14227b;

    /* renamed from: c */
    private final String f14228c;

    /* renamed from: d */
    private final y13 f14229d;

    /* renamed from: e */
    private boolean f14230e = false;

    public s23(Context context, int i, y13 y13, boolean z) {
        this.f14226a = context;
        this.f14228c = Integer.toString(i - 1);
        this.f14227b = context.getSharedPreferences("pcvmspf", 0);
        this.f14229d = y13;
        this.f14230e = z;
    }

    /* renamed from: e */
    private final File m16588e(String str) {
        return new File(new File(this.f14226a.getDir("pccache", 0), this.f14228c), str);
    }

    /* renamed from: f */
    private static String m16589f(C2291vd vdVar) {
        C2366xd I = C2403yd.m19956I();
        I.mo11804v(vdVar.mo11451H().mo11994O());
        I.mo11800r(vdVar.mo11451H().mo11993N());
        I.mo11801s(vdVar.mo11451H().mo11990F());
        I.mo11803u(vdVar.mo11451H().mo11992H());
        I.mo11802t(vdVar.mo11451H().mo11991G());
        return C2552i.m21200a(((C2403yd) I.mo11894o()).mo5902e().mo11272l());
    }

    /* renamed from: g */
    private final String m16590g() {
        String valueOf = String.valueOf(this.f14228c);
        return valueOf.length() != 0 ? "FBAMTD".concat(valueOf) : new String("FBAMTD");
    }

    /* renamed from: h */
    private final String m16591h() {
        String valueOf = String.valueOf(this.f14228c);
        return valueOf.length() != 0 ? "LATMTD".concat(valueOf) : new String("LATMTD");
    }

    /* renamed from: i */
    private final void m16592i(int i, long j) {
        y13 y13 = this.f14229d;
        if (y13 != null) {
            y13.mo11626b(i, j);
        }
    }

    /* renamed from: j */
    private final void m16593j(int i, long j, String str) {
        y13 y13 = this.f14229d;
        if (y13 != null) {
            y13.mo11625a(i, j, str);
        }
    }

    /* renamed from: k */
    private final C2403yd m16594k(int i) {
        SharedPreferences sharedPreferences;
        String str;
        int i2;
        if (i == 1) {
            sharedPreferences = this.f14227b;
            str = m16591h();
        } else {
            sharedPreferences = this.f14227b;
            str = m16590g();
        }
        String string = sharedPreferences.getString(str, (String) null);
        if (string == null) {
            return null;
        }
        try {
            return C2403yd.m19960M(uo3.m17968I(C2552i.m21201b(string)), this.f14230e ? mp3.m13445a() : mp3.m13446b());
        } catch (mq3 unused) {
            return null;
        } catch (NullPointerException unused2) {
            i2 = 2029;
            m16592i(i2, System.currentTimeMillis());
            return null;
        } catch (RuntimeException unused3) {
            i2 = 2032;
            m16592i(i2, System.currentTimeMillis());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        return r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo10708a(com.google.android.gms.internal.ads.C2291vd r7) {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Object r2 = f14225f
            monitor-enter(r2)
            com.google.android.gms.internal.ads.yd r3 = r7.mo11451H()     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = r3.mo11994O()     // Catch:{ all -> 0x0054 }
            java.io.File r3 = r6.m16588e(r3)     // Catch:{ all -> 0x0054 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0054 }
            java.lang.String r5 = "pcbc"
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.uo3 r3 = r7.mo11452I()     // Catch:{ all -> 0x0054 }
            byte[] r3 = r3.mo11272l()     // Catch:{ all -> 0x0054 }
            boolean r3 = com.google.android.gms.internal.ads.l23.m12517e(r4, r3)     // Catch:{ all -> 0x0054 }
            if (r3 != 0) goto L_0x0030
            r7 = 4020(0xfb4, float:5.633E-42)
            r6.m16592i(r7, r0)     // Catch:{ all -> 0x0054 }
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            r7 = 0
            return r7
        L_0x0030:
            java.lang.String r7 = m16589f(r7)     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences r3 = r6.f14227b     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r6.m16591h()     // Catch:{ all -> 0x0054 }
            r3.putString(r4, r7)     // Catch:{ all -> 0x0054 }
            boolean r7 = r3.commit()     // Catch:{ all -> 0x0054 }
            if (r7 == 0) goto L_0x004d
            r3 = 5015(0x1397, float:7.028E-42)
            r6.m16592i(r3, r0)     // Catch:{ all -> 0x0054 }
            goto L_0x0052
        L_0x004d:
            r3 = 4021(0xfb5, float:5.635E-42)
            r6.m16592i(r3, r0)     // Catch:{ all -> 0x0054 }
        L_0x0052:
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            return r7
        L_0x0054:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s23.mo10708a(com.google.android.gms.internal.ads.vd):boolean");
    }

    /* renamed from: b */
    public final boolean mo10709b(C2291vd vdVar, r23 r23) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f14225f) {
            C2403yd k = m16594k(1);
            String O = vdVar.mo11451H().mo11994O();
            if (k == null || !k.mo11994O().equals(O)) {
                long currentTimeMillis2 = System.currentTimeMillis();
                File e = m16588e(O);
                if (e.exists()) {
                    String str = "1";
                    if (true != e.isDirectory()) {
                        str = "0";
                    }
                    String str2 = "1";
                    if (true != e.isFile()) {
                        str2 = "0";
                    }
                    StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length());
                    sb.append("d:");
                    sb.append(str);
                    sb.append(",f:");
                    sb.append(str2);
                    m16593j(4023, currentTimeMillis2, sb.toString());
                    m16592i(4015, currentTimeMillis2);
                } else if (!e.mkdirs()) {
                    String str3 = "1";
                    if (true != e.canWrite()) {
                        str3 = "0";
                    }
                    m16593j(4024, currentTimeMillis2, str3.length() != 0 ? "cw:".concat(str3) : new String("cw:"));
                    m16592i(4015, currentTimeMillis2);
                    return false;
                }
                File e2 = m16588e(O);
                File file = new File(e2, "pcam.jar");
                File file2 = new File(e2, "pcbc");
                if (!l23.m12517e(file, vdVar.mo11453J().mo11272l())) {
                    m16592i(4016, currentTimeMillis);
                    return false;
                } else if (!l23.m12517e(file2, vdVar.mo11452I().mo11272l())) {
                    m16592i(4017, currentTimeMillis);
                    return false;
                } else if (r23 == null || r23.mo10464a(file)) {
                    String f = m16589f(vdVar);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    String string = this.f14227b.getString(m16591h(), (String) null);
                    SharedPreferences.Editor edit = this.f14227b.edit();
                    edit.putString(m16591h(), f);
                    if (string != null) {
                        edit.putString(m16590g(), string);
                    }
                    if (!edit.commit()) {
                        m16592i(4019, currentTimeMillis3);
                        return false;
                    }
                    HashSet hashSet = new HashSet();
                    C2403yd k2 = m16594k(1);
                    if (k2 != null) {
                        hashSet.add(k2.mo11994O());
                    }
                    C2403yd k3 = m16594k(2);
                    if (k3 != null) {
                        hashSet.add(k3.mo11994O());
                    }
                    for (File file3 : new File(this.f14226a.getDir("pccache", 0), this.f14228c).listFiles()) {
                        if (!hashSet.contains(file3.getName())) {
                            l23.m12516d(file3);
                        }
                    }
                    m16592i(5014, currentTimeMillis);
                    return true;
                } else {
                    m16592i(4018, currentTimeMillis);
                    l23.m12516d(e2);
                    return false;
                }
            } else {
                m16592i(4014, currentTimeMillis);
                return false;
            }
        }
    }

    /* renamed from: c */
    public final j23 mo10710c(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f14225f) {
            C2403yd k = m16594k(1);
            if (k == null) {
                m16592i(4022, currentTimeMillis);
                return null;
            }
            File e = m16588e(k.mo11994O());
            File file = new File(e, "pcam.jar");
            if (!file.exists()) {
                file = new File(e, "pcam");
            }
            File file2 = new File(e, "pcbc");
            File file3 = new File(e, "pcopt");
            m16592i(5016, currentTimeMillis);
            j23 j23 = new j23(k, file, file2, file3);
            return j23;
        }
    }

    /* renamed from: d */
    public final boolean mo10711d(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f14225f) {
            C2403yd k = m16594k(1);
            if (k == null) {
                m16592i(4025, currentTimeMillis);
                return false;
            }
            File e = m16588e(k.mo11994O());
            if (!new File(e, "pcam.jar").exists()) {
                m16592i(4026, currentTimeMillis);
                return false;
            } else if (!new File(e, "pcbc").exists()) {
                m16592i(4027, currentTimeMillis);
                return false;
            } else {
                m16592i(5019, currentTimeMillis);
                return true;
            }
        }
    }
}
