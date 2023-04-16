package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p069j1.C3202r1;

public final /* synthetic */ class a70 implements t70 {

    /* renamed from: a */
    public static final /* synthetic */ a70 f3996a = new a70();

    private /* synthetic */ a70() {
    }

    /* renamed from: a */
    public final void mo5150a(Object obj, Map map) {
        gv0 gv0 = (gv0) obj;
        t70<eu0> t70 = s70.f14292a;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            io0.m11131g("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = gv0.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            hashMap.put(str2, valueOf);
            String obj2 = valueOf.toString();
            StringBuilder sb = new StringBuilder(str2.length() + 14 + obj2.length());
            sb.append("/canOpenURLs;");
            sb.append(str2);
            sb.append(";");
            sb.append(obj2);
            C3202r1.m24015k(sb.toString());
        }
        ((da0) gv0).mo6424t("openableURLs", hashMap);
    }
}
