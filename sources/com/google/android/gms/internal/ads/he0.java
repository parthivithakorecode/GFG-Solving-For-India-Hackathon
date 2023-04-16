package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.C1456b;
import com.google.ads.mediation.C1461e;
import com.google.ads.mediation.C1464f;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p002a1.C0044y;
import p048g2.C2635a;
import p048g2.C2637b;
import p165y0.C4364c;

public final class he0<NETWORK_EXTRAS extends C1464f, SERVER_PARAMETERS extends C1461e> extends fd0 {

    /* renamed from: f */
    private final C1456b<NETWORK_EXTRAS, SERVER_PARAMETERS> f8176f;

    /* renamed from: g */
    private final NETWORK_EXTRAS f8177g;

    public he0(C1456b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f8176f = bVar;
        this.f8177g = network_extras;
    }

    /* renamed from: A5 */
    private static final boolean m10489A5(C1902kv kvVar) {
        if (kvVar.f9672k) {
            return true;
        }
        C2125qw.m15897b();
        return bo0.m6989m();
    }

    /* renamed from: z5 */
    private final SERVER_PARAMETERS m10490z5(String str) {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Throwable th) {
                io0.m11129e("", th);
                throw new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class<SERVER_PARAMETERS> serverParametersType = this.f8176f.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (C1461e) serverParametersType.newInstance();
        server_parameters.mo4908a(hashMap);
        return server_parameters;
    }

    /* renamed from: A2 */
    public final void mo6133A2(C1902kv kvVar, String str, String str2) {
    }

    /* renamed from: E3 */
    public final void mo6134E3(C2635a aVar, C1902kv kvVar, String str, String str2, jd0 jd0) {
        C1456b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f8176f;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            io0.m11131g(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        io0.m11126b("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f8176f).requestInterstitialAd(new ke0(jd0), (Activity) C2637b.m21357C0(aVar), m10490z5(str), le0.m12708b(kvVar, m10489A5(kvVar)), this.f8177g);
        } catch (Throwable th) {
            io0.m11129e("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: H */
    public final boolean mo6135H() {
        return false;
    }

    /* renamed from: I */
    public final void mo6136I() {
        C1456b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f8176f;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            io0.m11131g(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        io0.m11126b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f8176f).showInterstitial();
        } catch (Throwable th) {
            io0.m11129e("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: I4 */
    public final void mo6137I4(C2635a aVar, xj0 xj0, List<String> list) {
    }

    /* renamed from: J */
    public final boolean mo6138J() {
        return true;
    }

    /* renamed from: K0 */
    public final void mo6139K0(C2635a aVar, j90 j90, List<p90> list) {
    }

    /* renamed from: L */
    public final void mo6140L() {
        throw new RemoteException();
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
    }

    /* renamed from: S0 */
    public final void mo6144S0(C2635a aVar, C1902kv kvVar, String str, jd0 jd0) {
    }

    /* renamed from: W4 */
    public final void mo6145W4(C2635a aVar, C1902kv kvVar, String str, jd0 jd0) {
        mo6134E3(aVar, kvVar, str, (String) null, jd0);
    }

    /* renamed from: X1 */
    public final void mo6146X1(C1902kv kvVar, String str) {
    }

    /* renamed from: Z */
    public final void mo6147Z() {
        throw new RemoteException();
    }

    /* renamed from: a0 */
    public final od0 mo6148a0() {
        return null;
    }

    /* renamed from: b */
    public final Bundle mo6149b() {
        return new Bundle();
    }

    /* renamed from: c3 */
    public final void mo6150c3(C2635a aVar) {
    }

    /* renamed from: d */
    public final Bundle mo6151d() {
        return new Bundle();
    }

    /* renamed from: e */
    public final Bundle mo6152e() {
        return new Bundle();
    }

    /* renamed from: f */
    public final C1609cz mo6153f() {
        return null;
    }

    /* renamed from: f1 */
    public final void mo6154f1(C2635a aVar, C2087pv pvVar, C1902kv kvVar, String str, String str2, jd0 jd0) {
    }

    /* renamed from: g2 */
    public final void mo6155g2(C2635a aVar, C2087pv pvVar, C1902kv kvVar, String str, String str2, jd0 jd0) {
        C4364c cVar;
        C1456b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f8176f;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            io0.m11131g(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        io0.m11126b("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f8176f;
            ke0 ke0 = new ke0(jd0);
            Activity activity = (Activity) C2637b.m21357C0(aVar);
            C1461e z5 = m10490z5(str);
            int i = 0;
            C4364c[] cVarArr = {C4364c.f22719b, C4364c.f22720c, C4364c.f22721d, C4364c.f22722e, C4364c.f22723f, C4364c.f22724g};
            while (true) {
                if (i < 6) {
                    if (cVarArr[i].mo15979b() == pvVar.f12808j && cVarArr[i].mo15978a() == pvVar.f12805g) {
                        cVar = cVarArr[i];
                        break;
                    }
                    i++;
                } else {
                    cVar = new C4364c(C0044y.m147c(pvVar.f12808j, pvVar.f12805g, pvVar.f12804f));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(ke0, activity, z5, cVar, le0.m12708b(kvVar, m10489A5(kvVar)), this.f8177g);
        } catch (Throwable th) {
            io0.m11129e("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: h */
    public final e50 mo6156h() {
        return null;
    }

    /* renamed from: i */
    public final md0 mo6157i() {
        return null;
    }

    /* renamed from: i2 */
    public final void mo6158i2(C2635a aVar) {
    }

    /* renamed from: j */
    public final sd0 mo6159j() {
        return null;
    }

    /* renamed from: j1 */
    public final void mo6160j1(boolean z) {
    }

    /* renamed from: k */
    public final qf0 mo6161k() {
        return null;
    }

    /* renamed from: k4 */
    public final void mo6162k4(C2635a aVar) {
    }

    /* renamed from: m */
    public final C2635a mo6163m() {
        C1456b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f8176f;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            io0.m11131g(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return C2637b.m21358Z2(((MediationBannerAdapter) bVar).getBannerView());
        } catch (Throwable th) {
            io0.m11129e("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: n */
    public final void mo6164n() {
        try {
            this.f8176f.destroy();
        } catch (Throwable th) {
            io0.m11129e("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: o */
    public final qf0 mo6165o() {
        return null;
    }

    /* renamed from: t3 */
    public final void mo6166t3(C2635a aVar, C1902kv kvVar, String str, xj0 xj0, String str2) {
    }

    /* renamed from: v */
    public final void mo6167v() {
    }

    /* renamed from: v1 */
    public final void mo6168v1(C2635a aVar, C1902kv kvVar, String str, jd0 jd0) {
    }
}
