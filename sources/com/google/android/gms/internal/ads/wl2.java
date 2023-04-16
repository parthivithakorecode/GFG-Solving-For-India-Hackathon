package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p069j1.C3193o1;

public final /* synthetic */ class wl2 implements Callable {

    /* renamed from: a */
    public static final /* synthetic */ wl2 f16857a = new wl2();

    private /* synthetic */ wl2() {
    }

    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) C2199sw.m17001c().mo8579b(m10.f10273F);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) C2199sw.m17001c().mo8579b(m10.f10281G)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, C3193o1.m24003a(str2));
                }
            }
        }
        return new zl2(hashMap);
    }
}
