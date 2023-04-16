package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

public final class pi2 implements hj2<Bundle> {

    /* renamed from: a */
    private final String f12670a;

    public pi2(String str) {
        this.f12670a = str;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.f12670a)) {
            bundle.putString("query_info", this.f12670a);
        }
    }
}
