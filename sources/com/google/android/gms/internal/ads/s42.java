package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import java.util.HashMap;
import p061i1.C2816o;

public final /* synthetic */ class s42 implements DialogInterface.OnCancelListener {

    /* renamed from: f */
    public final /* synthetic */ o42 f14257f;

    /* renamed from: g */
    public final /* synthetic */ String f14258g;

    /* renamed from: h */
    public final /* synthetic */ wv1 f14259h;

    /* renamed from: i */
    public final /* synthetic */ Activity f14260i;

    /* renamed from: j */
    public final /* synthetic */ xw2 f14261j;

    /* renamed from: k */
    public final /* synthetic */ C2816o f14262k;

    public /* synthetic */ s42(o42 o42, String str, wv1 wv1, Activity activity, xw2 xw2, C2816o oVar) {
        this.f14257f = o42;
        this.f14258g = str;
        this.f14259h = wv1;
        this.f14260i = activity;
        this.f14261j = xw2;
        this.f14262k = oVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        o42 o42 = this.f14257f;
        String str = this.f14258g;
        wv1 wv1 = this.f14259h;
        Activity activity = this.f14260i;
        xw2 xw2 = this.f14261j;
        C2816o oVar = this.f14262k;
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
