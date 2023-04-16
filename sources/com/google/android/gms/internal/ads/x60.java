package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p069j1.C3202r1;

public final /* synthetic */ class x60 implements t70 {

    /* renamed from: a */
    public static final /* synthetic */ x60 f17044a = new x60();

    private /* synthetic */ x60() {
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map map) {
        gv0 gv0 = (gv0) obj;
        t70<eu0> t70 = s70.f14292a;
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10439Z5)).booleanValue()) {
            io0.m11131g("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            io0.m11131g("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(gv0.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        String obj2 = valueOf.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + obj2.length());
        sb.append("/canOpenApp;");
        sb.append(str);
        sb.append(";");
        sb.append(obj2);
        C3202r1.m24015k(sb.toString());
        ((da0) gv0).mo6424t("openableApp", hashMap);
    }
}
