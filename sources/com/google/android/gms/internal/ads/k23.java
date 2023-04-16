package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import p034e2.C2552i;

public final class k23 {

    /* renamed from: a */
    private final File f9349a;

    /* renamed from: b */
    final File f9350b;

    /* renamed from: c */
    private final SharedPreferences f9351c;

    /* renamed from: d */
    private final int f9352d;

    public k23(Context context, int i) {
        this.f9351c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        l23.m12513a(dir, false);
        this.f9349a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        l23.m12513a(dir2, true);
        this.f9350b = dir2;
        this.f9352d = i;
    }

    /* renamed from: a */
    static String m11967a(C2403yd ydVar) {
        return C2552i.m21200a(ydVar.mo5902e().mo11272l());
    }

    /* renamed from: e */
    private final File m11968e() {
        File file = new File(this.f9349a, Integer.toString(this.f9352d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: f */
    private final String m11969f() {
        int i = this.f9352d;
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    /* renamed from: g */
    private final String m11970g() {
        int i = this.f9352d;
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0162  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8588b(com.google.android.gms.internal.ads.C2291vd r8, com.google.android.gms.internal.ads.r23 r9) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.yd r0 = r8.mo11451H()
            java.lang.String r0 = r0.mo11994O()
            com.google.android.gms.internal.ads.uo3 r1 = r8.mo11453J()
            byte[] r1 = r1.mo11272l()
            com.google.android.gms.internal.ads.uo3 r2 = r8.mo11452I()
            byte[] r2 = r2.mo11272l()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r3 != 0) goto L_0x017d
            if (r2 == 0) goto L_0x017d
            int r3 = r2.length
            if (r3 != 0) goto L_0x0026
            goto L_0x017d
        L_0x0026:
            java.io.File r3 = r7.f9350b
            com.google.android.gms.internal.ads.l23.m12516d(r3)
            java.io.File r3 = r7.f9350b
            r3.mkdirs()
            java.io.File r3 = r7.f9350b
            java.io.File r3 = com.google.android.gms.internal.ads.l23.m12515c(r0, r3)
            r3.mkdirs()
            java.io.File r3 = r7.f9350b
            java.lang.String r5 = "pcam.jar"
            java.io.File r3 = com.google.android.gms.internal.ads.l23.m12514b(r0, r5, r3)
            if (r1 == 0) goto L_0x004c
            int r6 = r1.length
            if (r6 <= 0) goto L_0x004c
            boolean r1 = com.google.android.gms.internal.ads.l23.m12517e(r3, r1)
            if (r1 == 0) goto L_0x017d
        L_0x004c:
            java.io.File r1 = r7.f9350b
            java.lang.String r3 = "pcbc"
            java.io.File r0 = com.google.android.gms.internal.ads.l23.m12514b(r0, r3, r1)
            boolean r0 = com.google.android.gms.internal.ads.l23.m12517e(r0, r2)
            if (r0 == 0) goto L_0x017d
            com.google.android.gms.internal.ads.yd r0 = r8.mo11451H()
            java.lang.String r0 = r0.mo11994O()
            java.io.File r1 = r7.f9350b
            java.io.File r0 = com.google.android.gms.internal.ads.l23.m12514b(r0, r5, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0078
            if (r9 == 0) goto L_0x0078
            boolean r9 = r9.mo10464a(r0)
            if (r9 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            return r4
        L_0x0078:
            com.google.android.gms.internal.ads.yd r9 = r8.mo11451H()
            java.lang.String r9 = r9.mo11994O()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 1
            if (r0 == 0) goto L_0x008a
        L_0x0087:
            r8 = r4
            goto L_0x0137
        L_0x008a:
            java.io.File r0 = r7.f9350b
            java.io.File r0 = com.google.android.gms.internal.ads.l23.m12514b(r9, r5, r0)
            java.io.File r2 = r7.f9350b
            java.io.File r2 = com.google.android.gms.internal.ads.l23.m12514b(r9, r3, r2)
            java.io.File r6 = r7.m11968e()
            java.io.File r5 = com.google.android.gms.internal.ads.l23.m12514b(r9, r5, r6)
            java.io.File r6 = r7.m11968e()
            java.io.File r9 = com.google.android.gms.internal.ads.l23.m12514b(r9, r3, r6)
            boolean r3 = r0.exists()
            if (r3 == 0) goto L_0x00b3
            boolean r0 = r0.renameTo(r5)
            if (r0 != 0) goto L_0x00b3
            goto L_0x0087
        L_0x00b3:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0087
            boolean r9 = r2.renameTo(r9)
            if (r9 == 0) goto L_0x0087
            com.google.android.gms.internal.ads.xd r9 = com.google.android.gms.internal.ads.C2403yd.m19956I()
            com.google.android.gms.internal.ads.yd r0 = r8.mo11451H()
            java.lang.String r0 = r0.mo11994O()
            r9.mo11804v(r0)
            com.google.android.gms.internal.ads.yd r0 = r8.mo11451H()
            java.lang.String r0 = r0.mo11993N()
            r9.mo11800r(r0)
            com.google.android.gms.internal.ads.yd r0 = r8.mo11451H()
            long r2 = r0.mo11990F()
            r9.mo11801s(r2)
            com.google.android.gms.internal.ads.yd r0 = r8.mo11451H()
            long r2 = r0.mo11992H()
            r9.mo11803u(r2)
            com.google.android.gms.internal.ads.yd r8 = r8.mo11451H()
            long r2 = r8.mo11991G()
            r9.mo11802t(r2)
            com.google.android.gms.internal.ads.aq3 r8 = r9.mo11894o()
            com.google.android.gms.internal.ads.yd r8 = (com.google.android.gms.internal.ads.C2403yd) r8
            com.google.android.gms.internal.ads.yd r9 = r7.mo8589c(r1)
            android.content.SharedPreferences r0 = r7.f9351c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r9 == 0) goto L_0x0125
            java.lang.String r2 = r8.mo11994O()
            java.lang.String r3 = r9.mo11994O()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0125
            java.lang.String r2 = r7.m11969f()
            java.lang.String r9 = m11967a(r9)
            r0.putString(r2, r9)
        L_0x0125:
            java.lang.String r9 = r7.m11970g()
            java.lang.String r8 = m11967a(r8)
            r0.putString(r9, r8)
            boolean r8 = r0.commit()
            if (r8 == 0) goto L_0x0087
            r8 = r1
        L_0x0137:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            com.google.android.gms.internal.ads.yd r0 = r7.mo8589c(r1)
            if (r0 == 0) goto L_0x0149
            java.lang.String r0 = r0.mo11994O()
            r9.add(r0)
        L_0x0149:
            r0 = 2
            com.google.android.gms.internal.ads.yd r0 = r7.mo8589c(r0)
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = r0.mo11994O()
            r9.add(r0)
        L_0x0157:
            java.io.File r0 = r7.m11968e()
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
        L_0x0160:
            if (r4 >= r1) goto L_0x017c
            r2 = r0[r4]
            java.lang.String r2 = r2.getName()
            boolean r3 = r9.contains(r2)
            if (r3 != 0) goto L_0x0179
            java.io.File r3 = r7.m11968e()
            java.io.File r2 = com.google.android.gms.internal.ads.l23.m12515c(r2, r3)
            com.google.android.gms.internal.ads.l23.m12516d(r2)
        L_0x0179:
            int r4 = r4 + 1
            goto L_0x0160
        L_0x017c:
            return r8
        L_0x017d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k23.mo8588b(com.google.android.gms.internal.ads.vd, com.google.android.gms.internal.ads.r23):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C2403yd mo8589c(int i) {
        SharedPreferences sharedPreferences;
        String str;
        if (i == 1) {
            sharedPreferences = this.f9351c;
            str = m11970g();
        } else {
            sharedPreferences = this.f9351c;
            str = m11969f();
        }
        String string = sharedPreferences.getString(str, (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            C2403yd L = C2403yd.m19959L(uo3.m17968I(C2552i.m21201b(string)));
            String O = L.mo11994O();
            File b = l23.m12514b(O, "pcam.jar", m11968e());
            if (!b.exists()) {
                b = l23.m12514b(O, "pcam", m11968e());
            }
            File b2 = l23.m12514b(O, "pcbc", m11968e());
            if (!b.exists() || !b2.exists()) {
                return null;
            }
            return L;
        } catch (mq3 unused) {
        }
    }

    /* renamed from: d */
    public final j23 mo8590d(int i) {
        C2403yd c = mo8589c(1);
        if (c == null) {
            return null;
        }
        String O = c.mo11994O();
        File b = l23.m12514b(O, "pcam.jar", m11968e());
        if (!b.exists()) {
            b = l23.m12514b(O, "pcam", m11968e());
        }
        return new j23(c, b, l23.m12514b(O, "pcbc", m11968e()), l23.m12514b(O, "pcopt", m11968e()));
    }
}
