package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import p054h1.C2694t;

public final /* synthetic */ class tx1 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ cy1 f15073f;

    /* renamed from: g */
    public final /* synthetic */ bp0 f15074g;

    public /* synthetic */ tx1(cy1 cy1, bp0 bp0) {
        this.f15073f = cy1;
        this.f15074g = bp0;
    }

    public final void run() {
        bp0 bp0 = this.f15074g;
        String c = C2694t.m21607p().mo11025h().mo14084e().mo9801c();
        if (!TextUtils.isEmpty(c)) {
            bp0.mo5907e(c);
        } else {
            bp0.mo5908f(new Exception());
        }
    }
}
