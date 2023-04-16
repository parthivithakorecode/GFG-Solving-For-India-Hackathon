package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.u6 */
final class C2247u6 {

    /* renamed from: a */
    long f15415a;

    /* renamed from: b */
    final String f15416b;

    /* renamed from: c */
    final String f15417c;

    /* renamed from: d */
    final long f15418d;

    /* renamed from: e */
    final long f15419e;

    /* renamed from: f */
    final long f15420f;

    /* renamed from: g */
    final long f15421g;

    /* renamed from: h */
    final List<C2172s5> f15422h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C2247u6(java.lang.String r14, com.google.android.gms.internal.ads.C1839j5 r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f8984b
            long r3 = r15.f8985c
            long r5 = r15.f8986d
            long r7 = r15.f8987e
            long r9 = r15.f8988f
            java.util.List<com.google.android.gms.internal.ads.s5> r0 = r15.f8990h
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            r11 = r0
            goto L_0x0044
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.String> r15 = r15.f8989g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x0023:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x000e
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.s5 r11 = new com.google.android.gms.internal.ads.s5
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L_0x0023
        L_0x0044:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2247u6.<init>(java.lang.String, com.google.android.gms.internal.ads.j5):void");
    }

    private C2247u6(String str, String str2, long j, long j2, long j3, long j4, List<C2172s5> list) {
        this.f15416b = str;
        this.f15417c = true == "".equals(str2) ? null : str2;
        this.f15418d = j;
        this.f15419e = j2;
        this.f15420f = j3;
        this.f15421g = j4;
        this.f15422h = list;
    }

    /* renamed from: a */
    static C2247u6 m17730a(C2284v6 v6Var) {
        if (C2359x6.m19353e(v6Var) == 538247942) {
            String h = C2359x6.m19355h(v6Var);
            String h2 = C2359x6.m19355h(v6Var);
            long f = C2359x6.m19354f(v6Var);
            long f2 = C2359x6.m19354f(v6Var);
            long f3 = C2359x6.m19354f(v6Var);
            long f4 = C2359x6.m19354f(v6Var);
            int e = C2359x6.m19353e(v6Var);
            if (e >= 0) {
                List emptyList = e == 0 ? Collections.emptyList() : new ArrayList();
                for (int i = 0; i < e; i++) {
                    emptyList.add(new C2172s5(C2359x6.m19355h(v6Var).intern(), C2359x6.m19355h(v6Var).intern()));
                }
                return new C2247u6(h, h2, f, f2, f3, f4, emptyList);
            }
            StringBuilder sb = new StringBuilder(31);
            sb.append("readHeaderList size=");
            sb.append(e);
            throw new IOException(sb.toString());
        }
        throw new IOException();
    }
}
