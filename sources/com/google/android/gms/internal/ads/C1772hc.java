package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hc */
final class C1772hc {

    /* renamed from: a */
    static bd3 f8154a;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r0 != null) goto L_0x0035;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m10452a(com.google.android.gms.internal.ads.C1735gc r6) {
        /*
            com.google.android.gms.internal.ads.bd3 r0 = f8154a
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            com.google.android.gms.internal.ads.e10<java.lang.String> r0 = com.google.android.gms.internal.ads.m10.f10411W1
            com.google.android.gms.internal.ads.k10 r2 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r0 = r2.mo8579b(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 0
            if (r0 == 0) goto L_0x001b
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0035
        L_0x001b:
            r0 = 0
            if (r6 != 0) goto L_0x001f
            goto L_0x0033
        L_0x001f:
            java.lang.String r3 = "PDJGtr7hH5z8kziZtOwKBHfUklGaxsnuMOcaf4/XJNQXH5uqgOnO+ZxxlrN1G5R2"
            java.lang.String r4 = "8jFByxLLStK1ZA6Q/SQPKITUmXlRJfaQf0bJ+6rt27M="
            java.lang.reflect.Method r6 = r6.mo7574j(r3, r4)
            if (r6 != 0) goto L_0x002a
            goto L_0x0033
        L_0x002a:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Object r6 = r6.invoke(r0, r3)
            java.lang.String r6 = (java.lang.String) r6
            r0 = r6
        L_0x0033:
            if (r0 == 0) goto L_0x0117
        L_0x0035:
            byte[] r6 = com.google.android.gms.internal.ads.C2102q9.m15535b(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0117 }
            com.google.android.gms.internal.ads.md3 r6 = com.google.android.gms.internal.ads.qd3.m15600a(r6)     // Catch:{  }
            com.google.android.gms.internal.ads.yl3 r0 = com.google.android.gms.internal.ads.dg3.f5811a     // Catch:{  }
            java.util.List r0 = r0.mo12049H()     // Catch:{  }
            java.util.Iterator r0 = r0.iterator()     // Catch:{  }
        L_0x0047:
            boolean r3 = r0.hasNext()     // Catch:{  }
            if (r3 == 0) goto L_0x010e
            java.lang.Object r3 = r0.next()     // Catch:{  }
            com.google.android.gms.internal.ads.wk3 r3 = (com.google.android.gms.internal.ads.wk3) r3     // Catch:{  }
            java.lang.String r4 = r3.mo11670J()     // Catch:{  }
            boolean r4 = r4.isEmpty()     // Catch:{  }
            if (r4 != 0) goto L_0x0106
            java.lang.String r4 = r3.mo11669I()     // Catch:{  }
            boolean r4 = r4.isEmpty()     // Catch:{  }
            if (r4 != 0) goto L_0x00fe
            java.lang.String r4 = r3.mo11668H()     // Catch:{  }
            boolean r4 = r4.isEmpty()     // Catch:{  }
            if (r4 != 0) goto L_0x00f6
            java.lang.String r4 = r3.mo11668H()     // Catch:{  }
            java.lang.String r5 = "TinkAead"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo11668H()     // Catch:{  }
            java.lang.String r5 = "TinkMac"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo11668H()     // Catch:{  }
            java.lang.String r5 = "TinkHybridDecrypt"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo11668H()     // Catch:{  }
            java.lang.String r5 = "TinkHybridEncrypt"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo11668H()     // Catch:{  }
            java.lang.String r5 = "TinkPublicKeySign"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo11668H()     // Catch:{  }
            java.lang.String r5 = "TinkPublicKeyVerify"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo11668H()     // Catch:{  }
            java.lang.String r5 = "TinkStreamingAead"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo11668H()     // Catch:{  }
            java.lang.String r5 = "TinkDeterministicAead"
            boolean r4 = r4.equals(r5)     // Catch:{  }
            if (r4 != 0) goto L_0x0047
            java.lang.String r4 = r3.mo11668H()     // Catch:{  }
            com.google.android.gms.internal.ads.xc3 r4 = com.google.android.gms.internal.ads.ee3.m8517a(r4)     // Catch:{  }
            com.google.android.gms.internal.ads.vd3 r5 = r4.zza()     // Catch:{  }
            com.google.android.gms.internal.ads.ee3.m8530n(r5)     // Catch:{  }
            r3.mo11670J()     // Catch:{  }
            r3.mo11669I()     // Catch:{  }
            r3.mo11667F()     // Catch:{  }
            com.google.android.gms.internal.ads.dd3 r4 = r4.mo11798a()     // Catch:{  }
            boolean r3 = r3.mo11671K()     // Catch:{  }
            com.google.android.gms.internal.ads.ee3.m8528l(r4, r3)     // Catch:{  }
            goto L_0x0047
        L_0x00f6:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing catalogue_name."
            r6.<init>(r0)     // Catch:{  }
            throw r6     // Catch:{  }
        L_0x00fe:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing primitive_name."
            r6.<init>(r0)     // Catch:{  }
            throw r6     // Catch:{  }
        L_0x0106:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing type_url."
            r6.<init>(r0)     // Catch:{  }
            throw r6     // Catch:{  }
        L_0x010e:
            com.google.android.gms.internal.ads.bd3 r6 = com.google.android.gms.internal.ads.hg3.m10564a(r6)     // Catch:{  }
            f8154a = r6     // Catch:{  }
            if (r6 == 0) goto L_0x0117
            return r1
        L_0x0117:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1772hc.m10452a(com.google.android.gms.internal.ads.gc):boolean");
    }
}
