package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;

public final /* synthetic */ class d70 implements e43 {

    /* renamed from: a */
    public final /* synthetic */ String f5674a;

    public /* synthetic */ d70(String str) {
        this.f5674a = str;
    }

    /* renamed from: a */
    public final Object mo5054a(Object obj) {
        String str = this.f5674a;
        String str2 = (String) obj;
        t70<eu0> t70 = s70.f14292a;
        if (str2 != null) {
            if (a30.f3916f.mo9928e().booleanValue()) {
                String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                String host = Uri.parse(str).getHost();
                int i = 0;
                while (true) {
                    if (i < 3) {
                        if (host.endsWith(strArr[i])) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            String e = a30.f3911a.mo9928e();
            String e2 = a30.f3912b.mo9928e();
            if (!TextUtils.isEmpty(e)) {
                str = str.replace(e, str2);
            }
            if (!TextUtils.isEmpty(e2)) {
                Uri parse = Uri.parse(str);
                if (TextUtils.isEmpty(parse.getQueryParameter(e2))) {
                    return parse.buildUpon().appendQueryParameter(e2, str2).toString();
                }
            }
        }
        return str;
    }
}
