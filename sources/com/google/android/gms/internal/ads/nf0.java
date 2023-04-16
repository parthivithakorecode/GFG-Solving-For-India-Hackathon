package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p002a1.C0024h;
import p002a1.C0044y;
import p048g2.C2635a;
import p048g2.C2637b;
import p083l1.C3451h;
import p083l1.C3455l;
import p083l1.C3456m;
import p083l1.C3458o;
import p083l1.C3460q;
import p083l1.C3461r;
import p083l1.C3468y;

public final class nf0 extends bf0 {

    /* renamed from: f */
    private final RtbAdapter f11437f;

    /* renamed from: g */
    private C3455l f11438g;

    /* renamed from: h */
    private C3460q f11439h;

    /* renamed from: i */
    private String f11440i = "";

    public nf0(RtbAdapter rtbAdapter) {
        this.f11437f = rtbAdapter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r2.getBundle(r1.f11437f.getClass().getName());
     */
    /* renamed from: A5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle m13876A5(com.google.android.gms.internal.ads.C1902kv r2) {
        /*
            r1 = this;
            android.os.Bundle r2 = r2.f9679r
            if (r2 == 0) goto L_0x0015
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r0 = r1.f11437f
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            android.os.Bundle r2 = r2.getBundle(r0)
            if (r2 == 0) goto L_0x0015
            return r2
        L_0x0015:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nf0.m13876A5(com.google.android.gms.internal.ads.kv):android.os.Bundle");
    }

    /* renamed from: B5 */
    private static final Bundle m13877B5(String str) {
        String valueOf = String.valueOf(str);
        io0.m11131g(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            io0.m11129e("", e);
            throw new RemoteException();
        }
    }

    /* renamed from: C5 */
    private static final boolean m13878C5(C1902kv kvVar) {
        if (kvVar.f9672k) {
            return true;
        }
        C2125qw.m15897b();
        return bo0.m6989m();
    }

    /* renamed from: D5 */
    private static final String m13879D5(String str, C1902kv kvVar) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return kvVar.f9687z;
        }
    }

    /* renamed from: J3 */
    public final void mo5254J3(String str, String str2, C1902kv kvVar, C2635a aVar, qe0 qe0, jd0 jd0, C2087pv pvVar) {
        C1902kv kvVar2 = kvVar;
        C2087pv pvVar2 = pvVar;
        try {
            if0 if0 = new if0(this, qe0, jd0);
            RtbAdapter rtbAdapter = this.f11437f;
            Bundle B5 = m13877B5(str2);
            Bundle A5 = m13876A5(kvVar2);
            boolean C5 = m13878C5(kvVar);
            Location location = kvVar2.f9677p;
            int i = kvVar2.f9673l;
            int i2 = kvVar2.f9686y;
            String D5 = m13879D5(str2, kvVar);
            C0024h c = C0044y.m147c(pvVar2.f12808j, pvVar2.f12805g, pvVar2.f12804f);
            String str3 = this.f11440i;
            C3451h hVar = r5;
            C3451h hVar2 = new C3451h((Context) C2637b.m21357C0(aVar), str, B5, A5, C5, location, i, i2, D5, c, str3);
            rtbAdapter.loadRtbInterscrollerAd(hVar, if0);
        } catch (Throwable th) {
            io0.m11129e("Adapter failed to render interscroller ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: L1 */
    public final void mo5255L1(String str, String str2, C1902kv kvVar, C2635a aVar, te0 te0, jd0 jd0) {
        C1902kv kvVar2 = kvVar;
        try {
            this.f11437f.loadRtbInterstitialAd(new C3456m((Context) C2637b.m21357C0(aVar), str, m13877B5(str2), m13876A5(kvVar2), m13878C5(kvVar), kvVar2.f9677p, kvVar2.f9673l, kvVar2.f9686y, m13879D5(str2, kvVar), this.f11440i), new jf0(this, te0, jd0));
        } catch (Throwable th) {
            io0.m11129e("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: N3 */
    public final void mo5256N3(String str, String str2, C1902kv kvVar, C2635a aVar, ze0 ze0, jd0 jd0) {
        C1902kv kvVar2 = kvVar;
        try {
            this.f11437f.loadRtbRewardedAd(new C3461r((Context) C2637b.m21357C0(aVar), str, m13877B5(str2), m13876A5(kvVar2), m13878C5(kvVar), kvVar2.f9677p, kvVar2.f9673l, kvVar2.f9686y, m13879D5(str2, kvVar), this.f11440i), new mf0(this, ze0, jd0));
        } catch (Throwable th) {
            io0.m11129e("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: S4 */
    public final void mo5257S4(String str, String str2, C1902kv kvVar, C2635a aVar, qe0 qe0, jd0 jd0, C2087pv pvVar) {
        C1902kv kvVar2 = kvVar;
        C2087pv pvVar2 = pvVar;
        try {
            hf0 hf0 = new hf0(this, qe0, jd0);
            RtbAdapter rtbAdapter = this.f11437f;
            Bundle B5 = m13877B5(str2);
            Bundle A5 = m13876A5(kvVar2);
            boolean C5 = m13878C5(kvVar);
            Location location = kvVar2.f9677p;
            int i = kvVar2.f9673l;
            int i2 = kvVar2.f9686y;
            String D5 = m13879D5(str2, kvVar);
            C0024h c = C0044y.m147c(pvVar2.f12808j, pvVar2.f12805g, pvVar2.f12804f);
            String str3 = this.f11440i;
            C3451h hVar = r5;
            C3451h hVar2 = new C3451h((Context) C2637b.m21357C0(aVar), str, B5, A5, C5, location, i, i2, D5, c, str3);
            rtbAdapter.loadRtbBannerAd(hVar, hf0);
        } catch (Throwable th) {
            io0.m11129e("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: b */
    public final C1609cz mo5258b() {
        RtbAdapter rtbAdapter = this.f11437f;
        if (rtbAdapter instanceof C3468y) {
            try {
                return ((C3468y) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                io0.m11129e("", th);
            }
        }
        return null;
    }

    /* renamed from: c0 */
    public final void mo5259c0(String str) {
        this.f11440i = str;
    }

    /* renamed from: d */
    public final qf0 mo5260d() {
        return qf0.m15609c(this.f11437f.getVersionInfo());
    }

    /* renamed from: e */
    public final qf0 mo5261e() {
        return qf0.m15609c(this.f11437f.getSDKVersionInfo());
    }

    /* renamed from: h0 */
    public final boolean mo5262h0(C2635a aVar) {
        C3455l lVar = this.f11438g;
        if (lVar == null) {
            return false;
        }
        try {
            lVar.mo14518a((Context) C2637b.m21357C0(aVar));
            return true;
        } catch (Throwable th) {
            io0.m11129e("", th);
            return true;
        }
    }

    /* renamed from: m0 */
    public final boolean mo5263m0(C2635a aVar) {
        C3460q qVar = this.f11439h;
        if (qVar == null) {
            return false;
        }
        try {
            qVar.mo14519a((Context) C2637b.m21357C0(aVar));
            return true;
        } catch (Throwable th) {
            io0.m11129e("", th);
            return true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: r1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5264r1(p048g2.C2635a r8, java.lang.String r9, android.os.Bundle r10, android.os.Bundle r11, com.google.android.gms.internal.ads.C2087pv r12, com.google.android.gms.internal.ads.ff0 r13) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.lf0 r0 = new com.google.android.gms.internal.ads.lf0     // Catch:{ all -> 0x008c }
            r0.<init>(r7, r13)     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r13 = r7.f11437f     // Catch:{ all -> 0x008c }
            l1.j r1 = new l1.j     // Catch:{ all -> 0x008c }
            int r2 = r9.hashCode()     // Catch:{ all -> 0x008c }
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1396342996: goto L_0x003d;
                case -1052618729: goto L_0x0033;
                case -239580146: goto L_0x0029;
                case 604727084: goto L_0x001f;
                case 1911491517: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0047
        L_0x0015:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = r4
            goto L_0x0048
        L_0x001f:
            java.lang.String r2 = "interstitial"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = r6
            goto L_0x0048
        L_0x0029:
            java.lang.String r2 = "rewarded"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = r5
            goto L_0x0048
        L_0x0033:
            java.lang.String r2 = "native"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = r3
            goto L_0x0048
        L_0x003d:
            java.lang.String r2 = "banner"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 0
            goto L_0x0048
        L_0x0047:
            r9 = -1
        L_0x0048:
            if (r9 == 0) goto L_0x0066
            if (r9 == r6) goto L_0x0063
            if (r9 == r5) goto L_0x0060
            if (r9 == r4) goto L_0x005d
            if (r9 != r3) goto L_0x0055
            a1.b r9 = p002a1.C0015b.NATIVE     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0055:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x008c }
            java.lang.String r9 = "Internal Error"
            r8.<init>(r9)     // Catch:{ all -> 0x008c }
            throw r8     // Catch:{ all -> 0x008c }
        L_0x005d:
            a1.b r9 = p002a1.C0015b.REWARDED_INTERSTITIAL     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0060:
            a1.b r9 = p002a1.C0015b.REWARDED     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0063:
            a1.b r9 = p002a1.C0015b.INTERSTITIAL     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0066:
            a1.b r9 = p002a1.C0015b.BANNER     // Catch:{ all -> 0x008c }
        L_0x0068:
            r1.<init>(r9, r11)     // Catch:{ all -> 0x008c }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x008c }
            r9.<init>()     // Catch:{ all -> 0x008c }
            r9.add(r1)     // Catch:{ all -> 0x008c }
            n1.a r11 = new n1.a     // Catch:{ all -> 0x008c }
            java.lang.Object r8 = p048g2.C2637b.m21357C0(r8)     // Catch:{ all -> 0x008c }
            android.content.Context r8 = (android.content.Context) r8     // Catch:{ all -> 0x008c }
            int r1 = r12.f12808j     // Catch:{ all -> 0x008c }
            int r2 = r12.f12805g     // Catch:{ all -> 0x008c }
            java.lang.String r12 = r12.f12804f     // Catch:{ all -> 0x008c }
            a1.h r12 = p002a1.C0044y.m147c(r1, r2, r12)     // Catch:{ all -> 0x008c }
            r11.<init>(r8, r9, r10, r12)     // Catch:{ all -> 0x008c }
            r13.collectSignals(r11, r0)     // Catch:{ all -> 0x008c }
            return
        L_0x008c:
            r8 = move-exception
            java.lang.String r9 = "Error generating signals for RTB"
            com.google.android.gms.internal.ads.io0.m11129e(r9, r8)
            android.os.RemoteException r8 = new android.os.RemoteException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nf0.mo5264r1(g2.a, java.lang.String, android.os.Bundle, android.os.Bundle, com.google.android.gms.internal.ads.pv, com.google.android.gms.internal.ads.ff0):void");
    }

    /* renamed from: u3 */
    public final void mo5265u3(String str, String str2, C1902kv kvVar, C2635a aVar, we0 we0, jd0 jd0, b40 b40) {
        C1902kv kvVar2 = kvVar;
        try {
            kf0 kf0 = new kf0(this, we0, jd0);
            RtbAdapter rtbAdapter = this.f11437f;
            C3458o oVar = r4;
            C3458o oVar2 = new C3458o((Context) C2637b.m21357C0(aVar), str, m13877B5(str2), m13876A5(kvVar2), m13878C5(kvVar), kvVar2.f9677p, kvVar2.f9673l, kvVar2.f9686y, m13879D5(str2, kvVar), this.f11440i, b40);
            rtbAdapter.loadRtbNativeAd(oVar, kf0);
        } catch (Throwable th) {
            io0.m11129e("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: w1 */
    public final void mo5266w1(String str, String str2, C1902kv kvVar, C2635a aVar, we0 we0, jd0 jd0) {
        mo5265u3(str, str2, kvVar, aVar, we0, jd0, (b40) null);
    }

    /* renamed from: w2 */
    public final void mo5267w2(String str, String str2, C1902kv kvVar, C2635a aVar, ze0 ze0, jd0 jd0) {
        C1902kv kvVar2 = kvVar;
        try {
            this.f11437f.loadRtbRewardedInterstitialAd(new C3461r((Context) C2637b.m21357C0(aVar), str, m13877B5(str2), m13876A5(kvVar2), m13878C5(kvVar), kvVar2.f9677p, kvVar2.f9673l, kvVar2.f9686y, m13879D5(str2, kvVar), this.f11440i), new mf0(this, ze0, jd0));
        } catch (Throwable th) {
            io0.m11129e("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }
}
