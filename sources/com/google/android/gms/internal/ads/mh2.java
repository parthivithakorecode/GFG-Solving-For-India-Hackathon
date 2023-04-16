package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import p054h1.C2694t;

public final class mh2 implements ij2<nh2> {

    /* renamed from: a */
    private final dc3 f10880a;

    /* renamed from: b */
    private final Context f10881b;

    /* renamed from: c */
    private final Set<String> f10882c;

    public mh2(dc3 dc3, Context context, Set<String> set) {
        this.f10880a = dc3;
        this.f10881b = context;
        this.f10882c = set;
    }

    /* renamed from: a */
    public final cc3<nh2> mo5813a() {
        return this.f10880a.mo6445C(new lh2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ nh2 mo9254b() {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10245B3)).booleanValue()) {
            Set<String> set = this.f10882c;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                return new nh2(C2694t.m21600i().mo10786Q(this.f10881b));
            }
        }
        return new nh2((String) null);
    }
}
