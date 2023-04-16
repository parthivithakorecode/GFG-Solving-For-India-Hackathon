package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class i82<AdT> implements a52<AdT> {
    /* renamed from: d */
    private static Bundle m10961d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    /* renamed from: a */
    public final cc3<AdT> mo5105a(ds2 ds2, rr2 rr2) {
        rr2 rr22 = rr2;
        String optString = rr22.f13917w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        ks2 ks2 = ds2.f5903a.f4336a;
        is2 is2 = new is2();
        is2.mo8250E(ks2);
        is2.mo8253H(optString);
        Bundle d = m10961d(ks2.f9639d.f9679r);
        Bundle d2 = m10961d(d.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        d2.putInt("gw", 1);
        String optString2 = rr22.f13917w.optString("mad_hac", (String) null);
        if (optString2 != null) {
            d2.putString("mad_hac", optString2);
        }
        String optString3 = rr22.f13917w.optString("adJson", (String) null);
        if (optString3 != null) {
            d2.putString("_ad", optString3);
        }
        d2.putBoolean("_noRefresh", true);
        Iterator<String> keys = rr22.f13862E.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = rr22.f13862E.optString(next, (String) null);
            if (next != null) {
                d2.putString(next, optString4);
            }
        }
        d.putBundle("com.google.ads.mediation.admob.AdMobAdapter", d2);
        C1902kv kvVar = ks2.f9639d;
        C1902kv kvVar2 = r5;
        C1902kv kvVar3 = new C1902kv(kvVar.f9667f, kvVar.f9668g, d2, kvVar.f9670i, kvVar.f9671j, kvVar.f9672k, kvVar.f9673l, kvVar.f9674m, kvVar.f9675n, kvVar.f9676o, kvVar.f9677p, kvVar.f9678q, d, kvVar.f9680s, kvVar.f9681t, kvVar.f9682u, kvVar.f9683v, kvVar.f9684w, kvVar.f9685x, kvVar.f9686y, kvVar.f9687z, kvVar.f9664A, kvVar.f9665B, kvVar.f9666C);
        is2.mo8264d(kvVar2);
        ks2 f = is2.mo8266f();
        Bundle bundle = new Bundle();
        ds2 ds22 = ds2;
        ur2 ur2 = ds22.f5904b.f5509b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList(ur2.f15728a));
        bundle2.putInt("refresh_interval", ur2.f15730c);
        bundle2.putString("gws_query_id", ur2.f15729b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = ds22.f5903a.f4336a.f9641f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        rr2 rr23 = rr2;
        bundle3.putString("allocation_id", rr23.f13918x);
        bundle3.putStringArrayList("click_urls", new ArrayList(rr23.f13888c));
        bundle3.putStringArrayList("imp_urls", new ArrayList(rr23.f13890d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList(rr23.f13911q));
        bundle3.putStringArrayList("fill_urls", new ArrayList(rr23.f13908n));
        bundle3.putStringArrayList("video_start_urls", new ArrayList(rr23.f13898h));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList(rr23.f13900i));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList(rr23.f13902j));
        bundle3.putString("transaction_id", rr23.f13904k);
        bundle3.putString("valid_from_timestamp", rr23.f13906l);
        bundle3.putBoolean("is_closable_area_disabled", rr23.f13870M);
        if (rr23.f13907m != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", rr23.f13907m.f17764g);
            bundle4.putString("rb_type", rr23.f13907m.f17763f);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return mo7527c(f, bundle);
    }

    /* renamed from: b */
    public final boolean mo5106b(ds2 ds2, rr2 rr2) {
        return !TextUtils.isEmpty(rr2.f13917w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract cc3<AdT> mo7527c(ks2 ks2, Bundle bundle);
}
