package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p054h1.C2694t;

public final class c21 implements l11 {

    /* renamed from: a */
    private final CookieManager f5276a;

    public c21(Context context) {
        this.f5276a = C2694t.m21609r().mo14007l(context);
    }

    /* renamed from: a */
    public final void mo6036a(Map<String, String> map) {
        if (this.f5276a != null) {
            if (map.get("clear") != null) {
                String str = (String) C2199sw.m17001c().mo8579b(m10.f10250C0);
                String cookie = this.f5276a.getCookie(str);
                if (cookie != null) {
                    List<String> f = z43.m20433c(b43.m6607b(';')).mo12145f(cookie);
                    int i = 0;
                    while (i < f.size()) {
                        CookieManager cookieManager = this.f5276a;
                        Iterator<String> it = z43.m20433c(b43.m6607b('=')).mo12144d(f.get(i)).iterator();
                        Objects.requireNonNull(it);
                        if (it.hasNext()) {
                            String valueOf = String.valueOf(it.next());
                            String valueOf2 = String.valueOf((String) C2199sw.m17001c().mo8579b(m10.f10595r0));
                            cookieManager.setCookie(str, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                            i++;
                        } else {
                            StringBuilder sb = new StringBuilder(91);
                            sb.append("position (0) must be less than the number of elements that remained (");
                            sb.append(0);
                            sb.append(")");
                            throw new IndexOutOfBoundsException(sb.toString());
                        }
                    }
                    return;
                }
                return;
            }
            String str2 = map.get("cookie");
            if (!TextUtils.isEmpty(str2)) {
                this.f5276a.setCookie((String) C2199sw.m17001c().mo8579b(m10.f10250C0), str2);
            }
        }
    }
}
