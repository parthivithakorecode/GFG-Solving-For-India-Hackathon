package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;
import p002a1.C0037u;

/* renamed from: com.google.android.gms.internal.ads.nv */
public final /* synthetic */ class C2013nv implements Comparator {

    /* renamed from: f */
    public static final /* synthetic */ C2013nv f11718f = new C2013nv();

    private /* synthetic */ C2013nv() {
    }

    public final int compare(Object obj, Object obj2) {
        List<String> list = C0037u.f55e;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
