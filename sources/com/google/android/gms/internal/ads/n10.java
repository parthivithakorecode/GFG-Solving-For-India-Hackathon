package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class n10 {
    /* renamed from: a */
    static List<String> m13591a() {
        ArrayList arrayList = new ArrayList();
        m13593c(arrayList, p20.m14769c("gad:dynamite_module:experiment_id", ""));
        m13593c(arrayList, z20.f17981a);
        m13593c(arrayList, z20.f17982b);
        m13593c(arrayList, z20.f17983c);
        m13593c(arrayList, z20.f17984d);
        m13593c(arrayList, z20.f17985e);
        m13593c(arrayList, z20.f17991k);
        m13593c(arrayList, z20.f17986f);
        m13593c(arrayList, z20.f17987g);
        m13593c(arrayList, z20.f17988h);
        m13593c(arrayList, z20.f17989i);
        m13593c(arrayList, z20.f17990j);
        return arrayList;
    }

    /* renamed from: b */
    static List<String> m13592b() {
        ArrayList arrayList = new ArrayList();
        m13593c(arrayList, l30.f9876a);
        return arrayList;
    }

    /* renamed from: c */
    private static void m13593c(List<String> list, p20<String> p20) {
        String e = p20.mo9928e();
        if (!TextUtils.isEmpty(e)) {
            list.add(e);
        }
    }
}
