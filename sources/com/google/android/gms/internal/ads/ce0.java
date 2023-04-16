package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p002a1.C0024h;
import p002a1.C0044y;
import p026d1.C2475f;
import p048g2.C2635a;
import p048g2.C2637b;
import p083l1.C3444a;
import p083l1.C3449f;
import p083l1.C3451h;
import p083l1.C3454k;
import p083l1.C3455l;
import p083l1.C3456m;
import p083l1.C3458o;
import p083l1.C3460q;
import p083l1.C3461r;
import p083l1.C3463t;
import p083l1.C3464u;
import p083l1.C3465v;
import p083l1.C3468y;

public final class ce0 extends fd0 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Object f5395f;

    /* renamed from: g */
    private ee0 f5396g;

    /* renamed from: h */
    private xj0 f5397h;

    /* renamed from: i */
    private C2635a f5398i;

    /* renamed from: j */
    private View f5399j;

    /* renamed from: k */
    private C3455l f5400k;

    /* renamed from: l */
    private C3465v f5401l;

    /* renamed from: m */
    private C3460q f5402m;

    /* renamed from: n */
    private C3454k f5403n;

    /* renamed from: o */
    private final String f5404o = "";

    public ce0(C3444a aVar) {
        this.f5395f = aVar;
    }

    public ce0(C3449f fVar) {
        this.f5395f = fVar;
    }

    /* renamed from: A5 */
    private final Bundle m7323A5(String str, C1902kv kvVar, String str2) {
        String valueOf = String.valueOf(str);
        io0.m11126b(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f5395f instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (kvVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", kvVar.f9673l);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            io0.m11129e("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: B5 */
    private static final boolean m7324B5(C1902kv kvVar) {
        if (kvVar.f9672k) {
            return true;
        }
        C2125qw.m15897b();
        return bo0.m6989m();
    }

    /* renamed from: C5 */
    private static final String m7325C5(String str, C1902kv kvVar) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return kvVar.f9687z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r2.getBundle(r1.f5395f.getClass().getName());
     */
    /* renamed from: z5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle m7327z5(com.google.android.gms.internal.ads.C1902kv r2) {
        /*
            r1 = this;
            android.os.Bundle r2 = r2.f9679r
            if (r2 == 0) goto L_0x0015
            java.lang.Object r0 = r1.f5395f
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ce0.m7327z5(com.google.android.gms.internal.ads.kv):android.os.Bundle");
    }

    /* renamed from: A2 */
    public final void mo6133A2(C1902kv kvVar, String str, String str2) {
        Object obj = this.f5395f;
        if (obj instanceof C3444a) {
            mo6144S0(this.f5398i, kvVar, str, new fe0((C3444a) obj, this.f5397h));
            return;
        }
        String canonicalName = C3444a.class.getCanonicalName();
        String canonicalName2 = this.f5395f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        io0.m11131g(sb.toString());
        throw new RemoteException();
    }

    /* renamed from: E3 */
    public final void mo6134E3(C2635a aVar, C1902kv kvVar, String str, String str2, jd0 jd0) {
        C1902kv kvVar2 = kvVar;
        String str3 = str;
        String str4 = str2;
        jd0 jd02 = jd0;
        Object obj = this.f5395f;
        if ((obj instanceof MediationInterstitialAdapter) || (obj instanceof C3444a)) {
            io0.m11126b("Requesting interstitial ad from adapter.");
            Object obj2 = this.f5395f;
            if (obj2 instanceof MediationInterstitialAdapter) {
                try {
                    MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                    List<String> list = kvVar2.f9671j;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = kvVar2.f9668g;
                    ud0 ud0 = new ud0(j == -1 ? null : new Date(j), kvVar2.f9670i, hashSet, kvVar2.f9677p, m7324B5(kvVar), kvVar2.f9673l, kvVar2.f9684w, kvVar2.f9686y, m7325C5(str3, kvVar2));
                    Bundle bundle = kvVar2.f9679r;
                    mediationInterstitialAdapter.requestInterstitialAd((Context) C2637b.m21357C0(aVar), new ee0(jd02), m7323A5(str3, kvVar2, str4), ud0, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                } catch (Throwable th) {
                    io0.m11129e("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof C3444a) {
                try {
                    ((C3444a) obj2).loadInterstitialAd(new C3456m((Context) C2637b.m21357C0(aVar), "", m7323A5(str3, kvVar2, str4), m7327z5(kvVar2), m7324B5(kvVar), kvVar2.f9677p, kvVar2.f9673l, kvVar2.f9686y, m7325C5(str3, kvVar2), this.f5404o), new zd0(this, jd02));
                } catch (Throwable th2) {
                    io0.m11129e("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = C3444a.class.getCanonicalName();
            String canonicalName3 = this.f5395f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            io0.m11131g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: H */
    public final boolean mo6135H() {
        return false;
    }

    /* renamed from: I */
    public final void mo6136I() {
        if (this.f5395f instanceof MediationInterstitialAdapter) {
            io0.m11126b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f5395f).showInterstitial();
            } catch (Throwable th) {
                io0.m11129e("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f5395f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            io0.m11131g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: I4 */
    public final void mo6137I4(C2635a aVar, xj0 xj0, List<String> list) {
        io0.m11131g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    /* renamed from: J */
    public final boolean mo6138J() {
        if (this.f5395f instanceof C3444a) {
            return this.f5397h != null;
        }
        String canonicalName = C3444a.class.getCanonicalName();
        String canonicalName2 = this.f5395f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        io0.m11131g(sb.toString());
        throw new RemoteException();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6139K0(p048g2.C2635a r9, com.google.android.gms.internal.ads.j90 r10, java.util.List<com.google.android.gms.internal.ads.p90> r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f5395f
            boolean r0 = r0 instanceof p083l1.C3444a
            if (r0 == 0) goto L_0x0096
            com.google.android.gms.internal.ads.xd0 r0 = new com.google.android.gms.internal.ads.xd0
            r0.<init>(r8, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0014:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0088
            java.lang.Object r1 = r11.next()
            com.google.android.gms.internal.ads.p90 r1 = (com.google.android.gms.internal.ads.p90) r1
            java.lang.String r2 = r1.f12552f
            int r3 = r2.hashCode()
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r3) {
                case -1396342996: goto L_0x0056;
                case -1052618729: goto L_0x004c;
                case -239580146: goto L_0x0042;
                case 604727084: goto L_0x0038;
                case 1911491517: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0060
        L_0x002e:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = r5
            goto L_0x0061
        L_0x0038:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = r7
            goto L_0x0061
        L_0x0042:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = r6
            goto L_0x0061
        L_0x004c:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = r4
            goto L_0x0061
        L_0x0056:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 0
            goto L_0x0061
        L_0x0060:
            r2 = -1
        L_0x0061:
            if (r2 == 0) goto L_0x0079
            if (r2 == r7) goto L_0x0076
            if (r2 == r6) goto L_0x0073
            if (r2 == r5) goto L_0x0070
            if (r2 == r4) goto L_0x006d
            r2 = 0
            goto L_0x007b
        L_0x006d:
            a1.b r2 = p002a1.C0015b.NATIVE
            goto L_0x007b
        L_0x0070:
            a1.b r2 = p002a1.C0015b.REWARDED_INTERSTITIAL
            goto L_0x007b
        L_0x0073:
            a1.b r2 = p002a1.C0015b.REWARDED
            goto L_0x007b
        L_0x0076:
            a1.b r2 = p002a1.C0015b.INTERSTITIAL
            goto L_0x007b
        L_0x0079:
            a1.b r2 = p002a1.C0015b.BANNER
        L_0x007b:
            if (r2 == 0) goto L_0x0014
            l1.j r3 = new l1.j
            android.os.Bundle r1 = r1.f12553g
            r3.<init>(r2, r1)
            r10.add(r3)
            goto L_0x0014
        L_0x0088:
            java.lang.Object r11 = r8.f5395f
            l1.a r11 = (p083l1.C3444a) r11
            java.lang.Object r9 = p048g2.C2637b.m21357C0(r9)
            android.content.Context r9 = (android.content.Context) r9
            r11.initialize(r9, r0, r10)
            return
        L_0x0096:
            android.os.RemoteException r9 = new android.os.RemoteException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ce0.mo6139K0(g2.a, com.google.android.gms.internal.ads.j90, java.util.List):void");
    }

    /* renamed from: L */
    public final void mo6140L() {
        Object obj = this.f5395f;
        if (obj instanceof C3449f) {
            try {
                ((C3449f) obj).onResume();
            } catch (Throwable th) {
                io0.m11129e("", th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: O */
    public final pd0 mo6141O() {
        return null;
    }

    /* renamed from: O3 */
    public final void mo6142O3(C2635a aVar, C2087pv pvVar, C1902kv kvVar, String str, jd0 jd0) {
        mo6155g2(aVar, pvVar, kvVar, str, (String) null, jd0);
    }

    /* renamed from: Q2 */
    public final void mo6143Q2(C2635a aVar, C1902kv kvVar, String str, String str2, jd0 jd0, b40 b40, List<String> list) {
        C1902kv kvVar2 = kvVar;
        String str3 = str;
        String str4 = str2;
        jd0 jd02 = jd0;
        Object obj = this.f5395f;
        if ((obj instanceof MediationNativeAdapter) || (obj instanceof C3444a)) {
            io0.m11126b("Requesting native ad from adapter.");
            Object obj2 = this.f5395f;
            if (obj2 instanceof MediationNativeAdapter) {
                try {
                    MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                    List<String> list2 = kvVar2.f9671j;
                    HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                    long j = kvVar2.f9668g;
                    ge0 ge0 = new ge0(j == -1 ? null : new Date(j), kvVar2.f9670i, hashSet, kvVar2.f9677p, m7324B5(kvVar), kvVar2.f9673l, b40, list, kvVar2.f9684w, kvVar2.f9686y, m7325C5(str3, kvVar2));
                    Bundle bundle = kvVar2.f9679r;
                    Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                    this.f5396g = new ee0(jd02);
                    mediationNativeAdapter.requestNativeAd((Context) C2637b.m21357C0(aVar), this.f5396g, m7323A5(str3, kvVar2, str4), ge0, bundle2);
                } catch (Throwable th) {
                    io0.m11129e("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof C3444a) {
                try {
                    ((C3444a) obj2).loadNativeAd(new C3458o((Context) C2637b.m21357C0(aVar), "", m7323A5(str3, kvVar2, str4), m7327z5(kvVar2), m7324B5(kvVar), kvVar2.f9677p, kvVar2.f9673l, kvVar2.f9686y, m7325C5(str3, kvVar2), this.f5404o, b40), new ae0(this, jd02));
                } catch (Throwable th2) {
                    io0.m11129e("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = C3444a.class.getCanonicalName();
            String canonicalName3 = this.f5395f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            io0.m11131g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: S0 */
    public final void mo6144S0(C2635a aVar, C1902kv kvVar, String str, jd0 jd0) {
        C1902kv kvVar2 = kvVar;
        String str2 = str;
        if (this.f5395f instanceof C3444a) {
            io0.m11126b("Requesting rewarded ad from adapter.");
            try {
                be0 be0 = new be0(this, jd0);
                Bundle A5 = m7323A5(str2, kvVar2, (String) null);
                Bundle z5 = m7327z5(kvVar2);
                boolean B5 = m7324B5(kvVar);
                Location location = kvVar2.f9677p;
                int i = kvVar2.f9673l;
                int i2 = kvVar2.f9686y;
                String C5 = m7325C5(str2, kvVar2);
                C3461r rVar = r5;
                C3461r rVar2 = new C3461r((Context) C2637b.m21357C0(aVar), "", A5, z5, B5, location, i, i2, C5, "");
                ((C3444a) this.f5395f).loadRewardedAd(rVar, be0);
            } catch (Exception e) {
                io0.m11129e("", e);
                throw new RemoteException();
            }
        } else {
            String canonicalName = C3444a.class.getCanonicalName();
            String canonicalName2 = this.f5395f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            io0.m11131g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: W4 */
    public final void mo6145W4(C2635a aVar, C1902kv kvVar, String str, jd0 jd0) {
        mo6134E3(aVar, kvVar, str, (String) null, jd0);
    }

    /* renamed from: X1 */
    public final void mo6146X1(C1902kv kvVar, String str) {
        mo6133A2(kvVar, str, (String) null);
    }

    /* renamed from: Z */
    public final void mo6147Z() {
        Object obj = this.f5395f;
        if (obj instanceof C3449f) {
            try {
                ((C3449f) obj).onPause();
            } catch (Throwable th) {
                io0.m11129e("", th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: a0 */
    public final od0 mo6148a0() {
        return null;
    }

    /* renamed from: b */
    public final Bundle mo6149b() {
        Object obj = this.f5395f;
        if (obj instanceof zzcqk) {
            return ((zzcqk) obj).zza();
        }
        String canonicalName = zzcqk.class.getCanonicalName();
        String canonicalName2 = this.f5395f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        io0.m11131g(sb.toString());
        return new Bundle();
    }

    /* renamed from: c3 */
    public final void mo6150c3(C2635a aVar) {
        Object obj = this.f5395f;
        if (!(obj instanceof C3444a) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = C3444a.class.getCanonicalName();
            String canonicalName3 = this.f5395f.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            io0.m11131g(sb.toString());
            throw new RemoteException();
        } else if (obj instanceof MediationInterstitialAdapter) {
            mo6136I();
        } else {
            io0.m11126b("Show interstitial ad from adapter.");
            C3455l lVar = this.f5400k;
            if (lVar != null) {
                lVar.mo14518a((Context) C2637b.m21357C0(aVar));
            } else {
                io0.m11128d("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
    }

    /* renamed from: d */
    public final Bundle mo6151d() {
        Object obj = this.f5395f;
        if (obj instanceof zzcql) {
            return ((zzcql) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzcql.class.getCanonicalName();
        String canonicalName2 = this.f5395f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        io0.m11131g(sb.toString());
        return new Bundle();
    }

    /* renamed from: e */
    public final Bundle mo6152e() {
        return new Bundle();
    }

    /* renamed from: f */
    public final C1609cz mo6153f() {
        Object obj = this.f5395f;
        if (obj instanceof C3468y) {
            try {
                return ((C3468y) obj).getVideoController();
            } catch (Throwable th) {
                io0.m11129e("", th);
            }
        }
        return null;
    }

    /* renamed from: f1 */
    public final void mo6154f1(C2635a aVar, C2087pv pvVar, C1902kv kvVar, String str, String str2, jd0 jd0) {
        C2087pv pvVar2 = pvVar;
        C1902kv kvVar2 = kvVar;
        String str3 = str;
        if (this.f5395f instanceof C3444a) {
            io0.m11126b("Requesting interscroller ad from adapter.");
            try {
                C3444a aVar2 = (C3444a) this.f5395f;
                wd0 wd0 = new wd0(this, jd0, aVar2);
                Bundle A5 = m7323A5(str3, kvVar2, str2);
                Bundle z5 = m7327z5(kvVar2);
                boolean B5 = m7324B5(kvVar);
                Location location = kvVar2.f9677p;
                int i = kvVar2.f9673l;
                int i2 = kvVar2.f9686y;
                String C5 = m7325C5(str3, kvVar2);
                C0024h e = C0044y.m149e(pvVar2.f12808j, pvVar2.f12805g);
                C3451h hVar = r6;
                C3451h hVar2 = new C3451h((Context) C2637b.m21357C0(aVar), "", A5, z5, B5, location, i, i2, C5, e, "");
                aVar2.loadInterscrollerAd(hVar, wd0);
            } catch (Exception e2) {
                io0.m11129e("", e2);
                throw new RemoteException();
            }
        } else {
            String canonicalName = C3444a.class.getCanonicalName();
            String canonicalName2 = this.f5395f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            io0.m11131g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: g2 */
    public final void mo6155g2(C2635a aVar, C2087pv pvVar, C1902kv kvVar, String str, String str2, jd0 jd0) {
        C2087pv pvVar2 = pvVar;
        C1902kv kvVar2 = kvVar;
        String str3 = str;
        String str4 = str2;
        jd0 jd02 = jd0;
        Object obj = this.f5395f;
        if ((obj instanceof MediationBannerAdapter) || (obj instanceof C3444a)) {
            io0.m11126b("Requesting banner ad from adapter.");
            C0024h d = pvVar2.f12817s ? C0044y.m148d(pvVar2.f12808j, pvVar2.f12805g) : C0044y.m147c(pvVar2.f12808j, pvVar2.f12805g, pvVar2.f12804f);
            Object obj2 = this.f5395f;
            if (obj2 instanceof MediationBannerAdapter) {
                try {
                    MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                    List<String> list = kvVar2.f9671j;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = kvVar2.f9668g;
                    ud0 ud0 = new ud0(j == -1 ? null : new Date(j), kvVar2.f9670i, hashSet, kvVar2.f9677p, m7324B5(kvVar), kvVar2.f9673l, kvVar2.f9684w, kvVar2.f9686y, m7325C5(str3, kvVar2));
                    Bundle bundle = kvVar2.f9679r;
                    mediationBannerAdapter.requestBannerAd((Context) C2637b.m21357C0(aVar), new ee0(jd02), m7323A5(str3, kvVar2, str4), d, ud0, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                } catch (Throwable th) {
                    io0.m11129e("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof C3444a) {
                try {
                    yd0 yd0 = new yd0(this, jd02);
                    Bundle A5 = m7323A5(str3, kvVar2, str4);
                    Bundle z5 = m7327z5(kvVar2);
                    boolean B5 = m7324B5(kvVar);
                    Location location = kvVar2.f9677p;
                    int i = kvVar2.f9673l;
                    int i2 = kvVar2.f9686y;
                    String C5 = m7325C5(str3, kvVar2);
                    String str5 = this.f5404o;
                    C3451h hVar = r2;
                    C3451h hVar2 = new C3451h((Context) C2637b.m21357C0(aVar), "", A5, z5, B5, location, i, i2, C5, d, str5);
                    ((C3444a) obj2).loadBannerAd(hVar, yd0);
                } catch (Throwable th2) {
                    io0.m11129e("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = C3444a.class.getCanonicalName();
            String canonicalName3 = this.f5395f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            io0.m11131g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: h */
    public final e50 mo6156h() {
        ee0 ee0 = this.f5396g;
        if (ee0 == null) {
            return null;
        }
        C2475f t = ee0.mo6937t();
        if (t instanceof f50) {
            return ((f50) t).mo7232b();
        }
        return null;
    }

    /* renamed from: i */
    public final md0 mo6157i() {
        C3454k kVar = this.f5403n;
        if (kVar != null) {
            return new de0(kVar);
        }
        return null;
    }

    /* renamed from: i2 */
    public final void mo6158i2(C2635a aVar) {
        Context context = (Context) C2637b.m21357C0(aVar);
        Object obj = this.f5395f;
        if (obj instanceof C3463t) {
            ((C3463t) obj).mo14520a(context);
        }
    }

    /* renamed from: j */
    public final sd0 mo6159j() {
        C3465v vVar;
        C3465v u;
        Object obj = this.f5395f;
        if (obj instanceof MediationNativeAdapter) {
            ee0 ee0 = this.f5396g;
            if (ee0 == null || (u = ee0.mo6938u()) == null) {
                return null;
            }
            return new me0(u);
        } else if (!(obj instanceof C3444a) || (vVar = this.f5401l) == null) {
            return null;
        } else {
            return new me0(vVar);
        }
    }

    /* renamed from: j1 */
    public final void mo6160j1(boolean z) {
        Object obj = this.f5395f;
        if (obj instanceof C3464u) {
            try {
                ((C3464u) obj).onImmersiveModeUpdated(z);
            } catch (Throwable th) {
                io0.m11129e("", th);
            }
        } else {
            String canonicalName = C3464u.class.getCanonicalName();
            String canonicalName2 = this.f5395f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            io0.m11126b(sb.toString());
        }
    }

    /* renamed from: k */
    public final qf0 mo6161k() {
        Object obj = this.f5395f;
        if (!(obj instanceof C3444a)) {
            return null;
        }
        return qf0.m15609c(((C3444a) obj).getVersionInfo());
    }

    /* renamed from: k4 */
    public final void mo6162k4(C2635a aVar) {
        if (this.f5395f instanceof C3444a) {
            io0.m11126b("Show rewarded ad from adapter.");
            C3460q qVar = this.f5402m;
            if (qVar != null) {
                qVar.mo14519a((Context) C2637b.m21357C0(aVar));
            } else {
                io0.m11128d("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = C3444a.class.getCanonicalName();
            String canonicalName2 = this.f5395f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            io0.m11131g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: m */
    public final C2635a mo6163m() {
        Object obj = this.f5395f;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return C2637b.m21358Z2(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                io0.m11129e("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof C3444a) {
            return C2637b.m21358Z2(this.f5399j);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = C3444a.class.getCanonicalName();
            String canonicalName3 = this.f5395f.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            io0.m11131g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: n */
    public final void mo6164n() {
        Object obj = this.f5395f;
        if (obj instanceof C3449f) {
            try {
                ((C3449f) obj).onDestroy();
            } catch (Throwable th) {
                io0.m11129e("", th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: o */
    public final qf0 mo6165o() {
        Object obj = this.f5395f;
        if (!(obj instanceof C3444a)) {
            return null;
        }
        return qf0.m15609c(((C3444a) obj).getSDKVersionInfo());
    }

    /* renamed from: t3 */
    public final void mo6166t3(C2635a aVar, C1902kv kvVar, String str, xj0 xj0, String str2) {
        Object obj = this.f5395f;
        if (obj instanceof C3444a) {
            this.f5398i = aVar;
            this.f5397h = xj0;
            xj0.mo11431b0(C2637b.m21358Z2(obj));
            return;
        }
        String canonicalName = C3444a.class.getCanonicalName();
        String canonicalName2 = this.f5395f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        io0.m11131g(sb.toString());
        throw new RemoteException();
    }

    /* renamed from: v */
    public final void mo6167v() {
        if (this.f5395f instanceof C3444a) {
            C3460q qVar = this.f5402m;
            if (qVar != null) {
                qVar.mo14519a((Context) C2637b.m21357C0(this.f5398i));
            } else {
                io0.m11128d("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = C3444a.class.getCanonicalName();
            String canonicalName2 = this.f5395f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            io0.m11131g(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: v1 */
    public final void mo6168v1(C2635a aVar, C1902kv kvVar, String str, jd0 jd0) {
        C1902kv kvVar2 = kvVar;
        String str2 = str;
        if (this.f5395f instanceof C3444a) {
            io0.m11126b("Requesting rewarded interstitial ad from adapter.");
            try {
                be0 be0 = new be0(this, jd0);
                Bundle A5 = m7323A5(str2, kvVar2, (String) null);
                Bundle z5 = m7327z5(kvVar2);
                boolean B5 = m7324B5(kvVar);
                Location location = kvVar2.f9677p;
                int i = kvVar2.f9673l;
                int i2 = kvVar2.f9686y;
                String C5 = m7325C5(str2, kvVar2);
                C3461r rVar = r5;
                C3461r rVar2 = new C3461r((Context) C2637b.m21357C0(aVar), "", A5, z5, B5, location, i, i2, C5, "");
                ((C3444a) this.f5395f).loadRewardedInterstitialAd(rVar, be0);
            } catch (Exception e) {
                io0.m11129e("", e);
                throw new RemoteException();
            }
        } else {
            String canonicalName = C3444a.class.getCanonicalName();
            String canonicalName2 = this.f5395f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            io0.m11131g(sb.toString());
            throw new RemoteException();
        }
    }
}
