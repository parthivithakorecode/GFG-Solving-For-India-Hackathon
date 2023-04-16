package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final /* synthetic */ class hq1 implements C2450zn {

    /* renamed from: f */
    public final /* synthetic */ eu0 f8387f;

    public /* synthetic */ hq1(eu0 eu0) {
        this.f8387f = eu0;
    }

    /* renamed from: m0 */
    public final void mo5653m0(C2376xn xnVar) {
        eu0 eu0 = this.f8387f;
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != xnVar.f17256j ? "0" : "1");
        eu0.mo6424t("onAdVisibilityChanged", hashMap);
    }
}
