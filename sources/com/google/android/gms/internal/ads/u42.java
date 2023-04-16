package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.HashMap;
import p061i1.C2816o;

public final /* synthetic */ class u42 implements DialogInterface.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ o42 f15393f;

    /* renamed from: g */
    public final /* synthetic */ String f15394g;

    /* renamed from: h */
    public final /* synthetic */ wv1 f15395h;

    /* renamed from: i */
    public final /* synthetic */ Activity f15396i;

    /* renamed from: j */
    public final /* synthetic */ xw2 f15397j;

    /* renamed from: k */
    public final /* synthetic */ C2816o f15398k;

    public /* synthetic */ u42(o42 o42, String str, wv1 wv1, Activity activity, xw2 xw2, C2816o oVar) {
        this.f15393f = o42;
        this.f15394g = str;
        this.f15395h = wv1;
        this.f15396i = activity;
        this.f15397j = xw2;
        this.f15398k = oVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        o42 o42 = this.f15393f;
        String str = this.f15394g;
        wv1 wv1 = this.f15395h;
        Activity activity = this.f15396i;
        xw2 xw2 = this.f15397j;
        C2816o oVar = this.f15398k;
        o42.mo9648m(str);
        if (wv1 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("dialog_action", "dismiss");
            w42.m18872B5(activity, wv1, xw2, o42, str, "dialog_click", hashMap);
        }
        if (oVar != null) {
            oVar.mo13076a();
        }
    }
}
