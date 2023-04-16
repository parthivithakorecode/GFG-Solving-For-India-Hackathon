package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;
import p061i1.C2816o;

final class v42 extends TimerTask {

    /* renamed from: f */
    final /* synthetic */ AlertDialog f15905f;

    /* renamed from: g */
    final /* synthetic */ Timer f15906g;

    /* renamed from: h */
    final /* synthetic */ C2816o f15907h;

    v42(AlertDialog alertDialog, Timer timer, C2816o oVar) {
        this.f15905f = alertDialog;
        this.f15906g = timer;
        this.f15907h = oVar;
    }

    public final void run() {
        this.f15905f.dismiss();
        this.f15906g.cancel();
        C2816o oVar = this.f15907h;
        if (oVar != null) {
            oVar.mo13076a();
        }
    }
}
