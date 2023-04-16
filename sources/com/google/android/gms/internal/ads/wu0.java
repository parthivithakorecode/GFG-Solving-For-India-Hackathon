package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

final class wu0 implements t70<eu0> {

    /* renamed from: a */
    final /* synthetic */ yu0 f16937a;

    wu0(yu0 yu0) {
        this.f16937a = yu0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5150a(Object obj, Map map) {
        eu0 eu0 = (eu0) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f16937a) {
                        if (this.f16937a.f17870K != parseInt) {
                            this.f16937a.f17870K = parseInt;
                            this.f16937a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    io0.m11132h("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
