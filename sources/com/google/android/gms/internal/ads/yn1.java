package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final /* synthetic */ class yn1 implements t70 {

    /* renamed from: a */
    public final /* synthetic */ co1 f17804a;

    public /* synthetic */ yn1(co1 co1) {
        this.f17804a = co1;
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map map) {
        eu0 eu0 = (eu0) obj;
        eu0.mo7077D0().mo9048f1(new bo1(this.f17804a, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            eu0.loadData(str, "text/html", "UTF-8");
        } else {
            eu0.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
        }
    }
}
