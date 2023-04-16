package com.google.android.gms.internal.ads;

import android.os.Bundle;

final class x32 implements nb3<Bundle> {

    /* renamed from: a */
    final /* synthetic */ boolean f17019a;

    /* renamed from: b */
    final /* synthetic */ y32 f17020b;

    x32(y32 y32, boolean z) {
        this.f17020b = y32;
        this.f17019a = z;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo5436a(java.lang.Object r8) {
        /*
            r7 = this;
            android.os.Bundle r8 = (android.os.Bundle) r8
            com.google.android.gms.internal.ads.y32 r0 = r7.f17020b
            j1.t1 r0 = r0.f17586f
            boolean r0 = r0.mo14078J()
            if (r0 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r0 = "ad_types"
            java.lang.Object r0 = r8.get(r0)
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L_0x001c
            java.util.List r0 = (java.util.List) r0
            goto L_0x0026
        L_0x001c:
            boolean r1 = r0 instanceof java.lang.String[]
            if (r1 == 0) goto L_0x004c
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
        L_0x0026:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0033:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x0033
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            goto L_0x0033
        L_0x0047:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L_0x0050
        L_0x004c:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0050:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0059:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b3
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1396342996: goto L_0x008e;
                case -1052618729: goto L_0x0084;
                case -239580146: goto L_0x007a;
                case 604727084: goto L_0x0070;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0098
        L_0x0070:
            java.lang.String r2 = "interstitial"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0098
            r1 = r6
            goto L_0x0099
        L_0x007a:
            java.lang.String r2 = "rewarded"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0098
            r1 = r3
            goto L_0x0099
        L_0x0084:
            java.lang.String r2 = "native"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0098
            r1 = r5
            goto L_0x0099
        L_0x008e:
            java.lang.String r2 = "banner"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0098
            r1 = 0
            goto L_0x0099
        L_0x0098:
            r1 = -1
        L_0x0099:
            if (r1 == 0) goto L_0x00ad
            if (r1 == r6) goto L_0x00aa
            if (r1 == r5) goto L_0x00a7
            if (r1 == r3) goto L_0x00a4
            com.google.android.gms.internal.ads.xr r1 = com.google.android.gms.internal.ads.C2380xr.AD_FORMAT_TYPE_UNSPECIFIED
            goto L_0x00af
        L_0x00a4:
            com.google.android.gms.internal.ads.xr r1 = com.google.android.gms.internal.ads.C2380xr.REWARD_BASED_VIDEO_AD
            goto L_0x00af
        L_0x00a7:
            com.google.android.gms.internal.ads.xr r1 = com.google.android.gms.internal.ads.C2380xr.NATIVE_APP_INSTALL
            goto L_0x00af
        L_0x00aa:
            com.google.android.gms.internal.ads.xr r1 = com.google.android.gms.internal.ads.C2380xr.INTERSTITIAL
            goto L_0x00af
        L_0x00ad:
            com.google.android.gms.internal.ads.xr r1 = com.google.android.gms.internal.ads.C2380xr.BANNER
        L_0x00af:
            r4.add(r1)
            goto L_0x0059
        L_0x00b3:
            com.google.android.gms.internal.ads.y32 r0 = r7.f17020b
            com.google.android.gms.internal.ads.ot r6 = com.google.android.gms.internal.ads.y32.f17580h.get(com.google.android.gms.internal.ads.vs2.m18658a(com.google.android.gms.internal.ads.vs2.m18658a(r8, "device"), "network").getInt("active_network_state", -1), com.google.android.gms.internal.ads.C2048ot.UNSPECIFIED)
            com.google.android.gms.internal.ads.y32 r0 = r7.f17020b
            com.google.android.gms.internal.ads.ft r5 = com.google.android.gms.internal.ads.y32.m19829a(r0, r8)
            com.google.android.gms.internal.ads.y32 r8 = r7.f17020b
            com.google.android.gms.internal.ads.n32 r8 = r8.f17585e
            boolean r3 = r7.f17019a
            com.google.android.gms.internal.ads.w32 r0 = new com.google.android.gms.internal.ads.w32
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r8.mo9411a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x32.mo5436a(java.lang.Object):void");
    }

    /* renamed from: b */
    public final void mo5437b(Throwable th) {
        io0.m11128d("Failed to get signals bundle");
    }
}
