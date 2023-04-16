package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;
import p054h1.C2694t;
import p069j1.C3163g2;

final class g70 implements t70<eu0> {
    g70() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo5150a(Object obj, Map map) {
        eu0 eu0 = (eu0) obj;
        C2694t.m21608q();
        DisplayMetrics g0 = C3163g2.m23930g0((WindowManager) eu0.getContext().getSystemService("window"));
        int i = g0.widthPixels;
        int i2 = g0.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) eu0).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        eu0.mo6424t("locationReady", hashMap);
        io0.m11131g("GET LOCATION COMPILED");
    }
}
