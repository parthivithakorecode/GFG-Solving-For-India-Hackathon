package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.C1457c;
import com.google.ads.mediation.C1460d;
import com.google.ads.mediation.C1461e;
import com.google.ads.mediation.C1464f;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import p165y0.C4362a;

public final class ke0<NETWORK_EXTRAS extends C1464f, SERVER_PARAMETERS extends C1461e> implements C1457c, C1460d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final jd0 f9492a;

    public ke0(jd0 jd0) {
        this.f9492a = jd0;
    }

    /* renamed from: a */
    public final void mo4899a(MediationBannerAdapter<?, ?> mediationBannerAdapter, C4362a aVar) {
        io0.m11126b("Adapter called onFailedToReceiveAd with error. ".concat(String.valueOf(aVar)));
        C2125qw.m15897b();
        if (!bo0.m6992p()) {
            io0.m11133i("#008 Must be called on the main UI thread.", (Throwable) null);
            bo0.f4987b.post(new ie0(this, aVar));
            return;
        }
        try {
            this.f9492a.mo7304A(le0.m12707a(aVar));
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo4907b(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, C4362a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        io0.m11126b(sb.toString());
        C2125qw.m15897b();
        if (!bo0.m6992p()) {
            io0.m11133i("#008 Must be called on the main UI thread.", (Throwable) null);
            bo0.f4987b.post(new je0(this, aVar));
            return;
        }
        try {
            this.f9492a.mo7304A(le0.m12707a(aVar));
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }
}
