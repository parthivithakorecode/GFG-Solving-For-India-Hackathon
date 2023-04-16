package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

public final class rt1 {

    /* renamed from: a */
    private final ot1 f13934a;

    /* renamed from: b */
    private final AtomicReference<dd0> f13935b = new AtomicReference<>();

    rt1(ot1 ot1) {
        this.f13934a = ot1;
    }

    /* renamed from: e */
    private final dd0 m16436e() {
        dd0 dd0 = this.f13935b.get();
        if (dd0 != null) {
            return dd0;
        }
        io0.m11131g("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    /* renamed from: a */
    public final cf0 mo10663a(String str) {
        cf0 d0 = m16436e().mo5240d0(str);
        this.f13934a.mo9867d(str, d0);
        return d0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(r6) != false) goto L_0x004f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.at2 mo10664b(java.lang.String r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            java.lang.String r0 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            com.google.android.gms.internal.ads.at2 r1 = new com.google.android.gms.internal.ads.at2     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0017
            com.google.android.gms.internal.ads.ce0 r7 = new com.google.android.gms.internal.ads.ce0     // Catch:{ all -> 0x0083 }
            com.google.ads.mediation.admob.AdMobAdapter r0 = new com.google.ads.mediation.admob.AdMobAdapter     // Catch:{ all -> 0x0083 }
            r0.<init>()     // Catch:{ all -> 0x0083 }
            r7.<init>((p083l1.C3449f) r0)     // Catch:{ all -> 0x0083 }
            goto L_0x007a
        L_0x0017:
            java.lang.String r2 = "com.google.ads.mediation.AdUrlAdapter"
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.ce0 r7 = new com.google.android.gms.internal.ads.ce0     // Catch:{ all -> 0x0083 }
            com.google.ads.mediation.AdUrlAdapter r0 = new com.google.ads.mediation.AdUrlAdapter     // Catch:{ all -> 0x0083 }
            r0.<init>()     // Catch:{ all -> 0x0083 }
            r7.<init>((p083l1.C3449f) r0)     // Catch:{ all -> 0x0083 }
            goto L_0x007a
        L_0x002a:
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobCustomTabsAdapter"
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.ce0 r7 = new com.google.android.gms.internal.ads.ce0     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zzcaf r0 = new com.google.android.gms.internal.ads.zzcaf     // Catch:{ all -> 0x0083 }
            r0.<init>()     // Catch:{ all -> 0x0083 }
            r7.<init>((p083l1.C3449f) r0)     // Catch:{ all -> 0x0083 }
            goto L_0x007a
        L_0x003d:
            com.google.android.gms.internal.ads.dd0 r2 = r5.m16436e()     // Catch:{ all -> 0x0083 }
            boolean r3 = r0.equals(r6)     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            if (r3 != 0) goto L_0x004f
            boolean r3 = r4.equals(r6)     // Catch:{ all -> 0x0083 }
            if (r3 == 0) goto L_0x0076
        L_0x004f:
            java.lang.String r3 = "class_name"
            java.lang.String r7 = r7.getString(r3)     // Catch:{ JSONException -> 0x0070 }
            boolean r3 = r2.mo5243z(r7)     // Catch:{ JSONException -> 0x0070 }
            if (r3 == 0) goto L_0x0060
            com.google.android.gms.internal.ads.gd0 r7 = r2.mo5241s(r4)     // Catch:{ JSONException -> 0x0070 }
            goto L_0x007a
        L_0x0060:
            boolean r3 = r2.mo5242u(r7)     // Catch:{ JSONException -> 0x0070 }
            if (r3 == 0) goto L_0x006b
            com.google.android.gms.internal.ads.gd0 r7 = r2.mo5241s(r7)     // Catch:{ JSONException -> 0x0070 }
            goto L_0x007a
        L_0x006b:
            com.google.android.gms.internal.ads.gd0 r7 = r2.mo5241s(r0)     // Catch:{ JSONException -> 0x0070 }
            goto L_0x007a
        L_0x0070:
            r7 = move-exception
            java.lang.String r0 = "Invalid custom event."
            com.google.android.gms.internal.ads.io0.m11129e(r0, r7)     // Catch:{ all -> 0x0083 }
        L_0x0076:
            com.google.android.gms.internal.ads.gd0 r7 = r2.mo5241s(r6)     // Catch:{ all -> 0x0083 }
        L_0x007a:
            r1.<init>(r7)     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.ot1 r7 = r5.f13934a
            r7.mo9866c(r6, r1)
            return r1
        L_0x0083:
            r6 = move-exception
            com.google.android.gms.internal.ads.ps2 r7 = new com.google.android.gms.internal.ads.ps2
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rt1.mo10664b(java.lang.String, org.json.JSONObject):com.google.android.gms.internal.ads.at2");
    }

    /* renamed from: c */
    public final void mo10665c(dd0 dd0) {
        this.f13935b.compareAndSet((Object) null, dd0);
    }

    /* renamed from: d */
    public final boolean mo10666d() {
        return this.f13935b.get() != null;
    }
}
