package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.hc1;
import java.util.Iterator;

public final class fa2<AdT, AdapterT, ListenerT extends hc1> implements a52<AdT> {

    /* renamed from: a */
    private final c52<AdapterT, ListenerT> f6775a;

    /* renamed from: b */
    private final j52<AdT, AdapterT, ListenerT> f6776b;

    /* renamed from: c */
    private final nw2 f6777c;

    /* renamed from: d */
    private final dc3 f6778d;

    public fa2(nw2 nw2, dc3 dc3, c52<AdapterT, ListenerT> c52, j52<AdT, AdapterT, ListenerT> j52) {
        this.f6777c = nw2;
        this.f6778d = dc3;
        this.f6776b = j52;
        this.f6775a = c52;
    }

    /* renamed from: e */
    static final String m9088e(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public final cc3<AdT> mo5105a(ds2 ds2, rr2 rr2) {
        d52<AdapterT, ListenerT> d52;
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        Iterator<String> it = rr2.f13915u.iterator();
        while (true) {
            if (!it.hasNext()) {
                d52 = null;
                break;
            }
            try {
                d52 = this.f6775a.mo6058a(it.next(), rr2.f13917w);
                break;
            } catch (ps2 unused) {
            }
        }
        if (d52 == null) {
            return rb3.m16130h(new f82("Unable to instantiate mediation adapter class."));
        }
        bp0 bp0 = new bp0();
        d52.f5648c.mo7911P4(new ea2(this, d52, bp0));
        if (rr2.f13867J) {
            Bundle bundle = ds2.f5903a.f4336a.f9639d.f9679r;
            Bundle bundle2 = bundle.getBundle(cls.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(cls.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        nw2 nw2 = this.f6777c;
        return wv2.m19225d(new da2(this, ds2, rr2, d52), this.f6778d, gw2.ADAPTER_LOAD_AD_SYN, nw2).mo6682b(gw2.ADAPTER_LOAD_AD_ACK).mo6684d(bp0).mo6682b(gw2.ADAPTER_WRAP_ADAPTER).mo6685e(new ca2(this, ds2, rr2, d52)).mo6681a();
    }

    /* renamed from: b */
    public final boolean mo5106b(ds2 ds2, rr2 rr2) {
        return !rr2.f13915u.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo7279c(ds2 ds2, rr2 rr2, d52 d52, Void voidR) {
        return this.f6776b.mo6411a(ds2, rr2, d52);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo7280d(ds2 ds2, rr2 rr2, d52 d52) {
        this.f6776b.mo6412b(ds2, rr2, d52);
    }
}
