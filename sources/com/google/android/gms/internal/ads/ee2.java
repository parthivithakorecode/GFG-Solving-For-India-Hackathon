package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class ee2 implements ij2<ge2> {

    /* renamed from: a */
    private final dc3 f6180a;

    /* renamed from: b */
    private final rt1 f6181b;

    /* renamed from: c */
    private final cy1 f6182c;

    /* renamed from: d */
    private final he2 f6183d;

    public ee2(dc3 dc3, rt1 rt1, cy1 cy1, he2 he2) {
        this.f6180a = dc3;
        this.f6181b = rt1;
        this.f6182c = cy1;
        this.f6183d = he2;
    }

    /* renamed from: a */
    public final cc3<ge2> mo5813a() {
        if (b53.m6686d((String) C2199sw.m17001c().mo8579b(m10.f10461c1)) || this.f6183d.mo7919b() || !this.f6182c.mo6337s()) {
            return rb3.m16131i(new ge2(new Bundle(), (fe2) null));
        }
        this.f6183d.mo7918a(true);
        return this.f6180a.mo6445C(new de2(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:4|5|6|7|8|(1:10)|11|12|(1:14)|15|16|21|19|1) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053 A[Catch:{ ps2 -> 0x005c }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.ge2 mo6939b() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.e10<java.lang.String> r0 = com.google.android.gms.internal.ads.m10.f10461c1
            com.google.android.gms.internal.ads.k10 r1 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r0 = r1.mo8579b(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ";"
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0060
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.ads.rt1 r3 = r7.f6181b     // Catch:{ ps2 -> 0x001f }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ ps2 -> 0x001f }
            r4.<init>()     // Catch:{ ps2 -> 0x001f }
            com.google.android.gms.internal.ads.at2 r3 = r3.mo10664b(r2, r4)     // Catch:{ ps2 -> 0x001f }
            r3.mo5494a()     // Catch:{ ps2 -> 0x001f }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ ps2 -> 0x001f }
            r4.<init>()     // Catch:{ ps2 -> 0x001f }
            com.google.android.gms.internal.ads.qf0 r5 = r3.mo5502i()     // Catch:{ ps2 -> 0x004d }
            if (r5 == 0) goto L_0x004d
            java.lang.String r6 = "sdk_version"
            java.lang.String r5 = r5.toString()     // Catch:{ ps2 -> 0x004d }
            r4.putString(r6, r5)     // Catch:{ ps2 -> 0x004d }
        L_0x004d:
            com.google.android.gms.internal.ads.qf0 r3 = r3.mo5501h()     // Catch:{ ps2 -> 0x005c }
            if (r3 == 0) goto L_0x005c
            java.lang.String r5 = "adapter_version"
            java.lang.String r3 = r3.toString()     // Catch:{ ps2 -> 0x005c }
            r4.putString(r5, r3)     // Catch:{ ps2 -> 0x005c }
        L_0x005c:
            r1.putBundle(r2, r4)     // Catch:{ ps2 -> 0x001f }
            goto L_0x001f
        L_0x0060:
            com.google.android.gms.internal.ads.ge2 r0 = new com.google.android.gms.internal.ads.ge2
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ee2.mo6939b():com.google.android.gms.internal.ads.ge2");
    }
}
