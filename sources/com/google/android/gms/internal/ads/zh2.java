package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zh2 implements hj2<Bundle> {

    /* renamed from: a */
    private final String f18192a;

    /* renamed from: b */
    private final String f18193b;

    public zh2(String str, String str2) {
        this.f18192a = str;
        this.f18193b = str2;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo5248c(Object obj) {
        ((Bundle) obj).putString("request_id", ((Boolean) C2199sw.m17001c().mo8579b(m10.f10573o5)).booleanValue() ? this.f18193b : this.f18192a);
    }
}
