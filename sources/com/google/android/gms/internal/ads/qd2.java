package com.google.android.gms.internal.ads;

import android.os.Bundle;
import p003a2.C0092o;

public final class qd2 implements hj2<Bundle> {

    /* renamed from: a */
    final ks2 f13138a;

    /* renamed from: b */
    private final long f13139b;

    public qd2(ks2 ks2, long j) {
        C0092o.m314j(ks2, "the targeting must not be null");
        this.f13138a = ks2;
        this.f13139b = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo5248c(java.lang.Object r14) {
        /*
            r13 = this;
            android.os.Bundle r14 = (android.os.Bundle) r14
            com.google.android.gms.internal.ads.ks2 r0 = r13.f13138a
            com.google.android.gms.internal.ads.kv r0 = r0.f9639d
            int r1 = r0.f9665B
            java.lang.String r2 = "http_timeout_millis"
            r14.putInt(r2, r1)
            com.google.android.gms.internal.ads.ks2 r1 = r13.f13138a
            java.lang.String r1 = r1.f9641f
            java.lang.String r2 = "slotname"
            r14.putString(r2, r1)
            com.google.android.gms.internal.ads.ks2 r1 = r13.f13138a
            com.google.android.gms.internal.ads.zr2 r1 = r1.f9650o
            int r1 = r1.f18341a
            int r2 = r1 + -1
            if (r1 == 0) goto L_0x017c
            r1 = 2
            r3 = 1
            if (r2 == r3) goto L_0x002a
            if (r2 == r1) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            java.lang.String r2 = "is_rewarded_interstitial"
            goto L_0x002c
        L_0x002a:
            java.lang.String r2 = "is_new_rewarded"
        L_0x002c:
            r14.putBoolean(r2, r3)
        L_0x002f:
            long r4 = r13.f13139b
            java.lang.String r2 = "start_signals_timestamp"
            r14.putLong(r2, r4)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r5 = "yyyyMMdd"
            r2.<init>(r5, r4)
            java.util.Date r4 = new java.util.Date
            long r5 = r0.f9668g
            r4.<init>(r5)
            java.lang.String r2 = r2.format(r4)
            long r4 = r0.f9668g
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 0
            if (r4 == 0) goto L_0x0055
            r4 = r3
            goto L_0x0056
        L_0x0055:
            r4 = r5
        L_0x0056:
            java.lang.String r6 = "cust_age"
            com.google.android.gms.internal.ads.vs2.m18664g(r14, r6, r2, r4)
            android.os.Bundle r2 = r0.f9669h
            java.lang.String r4 = "extras"
            com.google.android.gms.internal.ads.vs2.m18659b(r14, r4, r2)
            int r2 = r0.f9670i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r4 = r0.f9670i
            r6 = -1
            if (r4 == r6) goto L_0x006f
            r4 = r3
            goto L_0x0070
        L_0x006f:
            r4 = r5
        L_0x0070:
            java.lang.String r7 = "cust_gender"
            com.google.android.gms.internal.ads.vs2.m18663f(r14, r7, r2, r4)
            java.util.List<java.lang.String> r2 = r0.f9671j
            java.lang.String r4 = "kw"
            com.google.android.gms.internal.ads.vs2.m18661d(r14, r4, r2)
            int r2 = r0.f9673l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r4 = r0.f9673l
            if (r4 == r6) goto L_0x0088
            r4 = r3
            goto L_0x0089
        L_0x0088:
            r4 = r5
        L_0x0089:
            java.lang.String r7 = "tag_for_child_directed_treatment"
            com.google.android.gms.internal.ads.vs2.m18663f(r14, r7, r2, r4)
            boolean r2 = r0.f9672k
            if (r2 == 0) goto L_0x0097
            java.lang.String r2 = "test_request"
            r14.putBoolean(r2, r3)
        L_0x0097:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            int r4 = r0.f9667f
            if (r4 < r1) goto L_0x00a5
            boolean r4 = r0.f9674m
            if (r4 == 0) goto L_0x00a5
            r4 = r3
            goto L_0x00a6
        L_0x00a5:
            r4 = r5
        L_0x00a6:
            java.lang.String r7 = "d_imp_hdr"
            com.google.android.gms.internal.ads.vs2.m18663f(r14, r7, r2, r4)
            java.lang.String r2 = r0.f9675n
            int r4 = r0.f9667f
            if (r4 < r1) goto L_0x00b9
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x00b9
            r1 = r3
            goto L_0x00ba
        L_0x00b9:
            r1 = r5
        L_0x00ba:
            java.lang.String r4 = "ppid"
            com.google.android.gms.internal.ads.vs2.m18664g(r14, r4, r2, r1)
            android.location.Location r1 = r0.f9677p
            if (r1 == 0) goto L_0x0120
            float r2 = r1.getAccuracy()
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 * r4
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            long r7 = r1.getTime()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r9
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            double r7 = r1.getLatitude()
            r9 = 4711630319722168320(0x416312d000000000, double:1.0E7)
            double r7 = r7 * r9
            long r7 = (long) r7
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            double r11 = r1.getLongitude()
            double r11 = r11 * r9
            long r8 = (long) r11
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            float r2 = r2.floatValue()
            java.lang.String r9 = "radius"
            r8.putFloat(r9, r2)
            long r9 = r7.longValue()
            java.lang.String r2 = "lat"
            r8.putLong(r2, r9)
            long r1 = r1.longValue()
            java.lang.String r7 = "long"
            r8.putLong(r7, r1)
            long r1 = r4.longValue()
            java.lang.String r4 = "time"
            r8.putLong(r4, r1)
            java.lang.String r1 = "uule"
            r14.putBundle(r1, r8)
        L_0x0120:
            java.lang.String r1 = r0.f9678q
            java.lang.String r2 = "url"
            com.google.android.gms.internal.ads.vs2.m18660c(r14, r2, r1)
            java.util.List<java.lang.String> r1 = r0.f9664A
            java.lang.String r2 = "neighboring_content_urls"
            com.google.android.gms.internal.ads.vs2.m18661d(r14, r2, r1)
            android.os.Bundle r1 = r0.f9680s
            java.lang.String r2 = "custom_targeting"
            com.google.android.gms.internal.ads.vs2.m18659b(r14, r2, r1)
            java.util.List<java.lang.String> r1 = r0.f9681t
            java.lang.String r2 = "category_exclusions"
            com.google.android.gms.internal.ads.vs2.m18661d(r14, r2, r1)
            java.lang.String r1 = r0.f9682u
            java.lang.String r2 = "request_agent"
            com.google.android.gms.internal.ads.vs2.m18660c(r14, r2, r1)
            java.lang.String r1 = r0.f9683v
            java.lang.String r2 = "request_pkg"
            com.google.android.gms.internal.ads.vs2.m18660c(r14, r2, r1)
            boolean r1 = r0.f9684w
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r2 = r0.f9667f
            r4 = 7
            if (r2 < r4) goto L_0x0157
            r2 = r3
            goto L_0x0158
        L_0x0157:
            r2 = r5
        L_0x0158:
            java.lang.String r4 = "is_designed_for_families"
            com.google.android.gms.internal.ads.vs2.m18662e(r14, r4, r1, r2)
            int r1 = r0.f9667f
            r2 = 8
            if (r1 < r2) goto L_0x017b
            int r1 = r0.f9686y
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r0.f9686y
            if (r2 == r6) goto L_0x016e
            goto L_0x016f
        L_0x016e:
            r3 = r5
        L_0x016f:
            java.lang.String r2 = "tag_for_under_age_of_consent"
            com.google.android.gms.internal.ads.vs2.m18663f(r14, r2, r1, r3)
            java.lang.String r0 = r0.f9687z
            java.lang.String r1 = "max_ad_content_rating"
            com.google.android.gms.internal.ads.vs2.m18660c(r14, r1, r0)
        L_0x017b:
            return
        L_0x017c:
            r14 = 0
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qd2.mo5248c(java.lang.Object):void");
    }
}
