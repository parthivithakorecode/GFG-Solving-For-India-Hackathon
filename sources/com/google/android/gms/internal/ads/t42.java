package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import p061i1.C2816o;
import p069j1.C3219x0;

public final /* synthetic */ class t42 implements DialogInterface.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ wv1 f14702f;

    /* renamed from: g */
    public final /* synthetic */ Activity f14703g;

    /* renamed from: h */
    public final /* synthetic */ xw2 f14704h;

    /* renamed from: i */
    public final /* synthetic */ o42 f14705i;

    /* renamed from: j */
    public final /* synthetic */ String f14706j;

    /* renamed from: k */
    public final /* synthetic */ C3219x0 f14707k;

    /* renamed from: l */
    public final /* synthetic */ String f14708l;

    /* renamed from: m */
    public final /* synthetic */ Resources f14709m;

    /* renamed from: n */
    public final /* synthetic */ C2816o f14710n;

    public /* synthetic */ t42(wv1 wv1, Activity activity, xw2 xw2, o42 o42, String str, C3219x0 x0Var, String str2, Resources resources, C2816o oVar) {
        this.f14702f = wv1;
        this.f14703g = activity;
        this.f14704h = xw2;
        this.f14705i = o42;
        this.f14706j = str;
        this.f14707k = x0Var;
        this.f14708l = str2;
        this.f14709m = resources;
        this.f14710n = oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        if (r0.zzf(p048g2.C2637b.m21358Z2(r10), r14, r13) == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r19, int r20) {
        /*
            r18 = this;
            r1 = r18
            com.google.android.gms.internal.ads.wv1 r9 = r1.f14702f
            android.app.Activity r10 = r1.f14703g
            com.google.android.gms.internal.ads.xw2 r11 = r1.f14704h
            com.google.android.gms.internal.ads.o42 r12 = r1.f14705i
            java.lang.String r13 = r1.f14706j
            j1.x0 r0 = r1.f14707k
            java.lang.String r14 = r1.f14708l
            android.content.res.Resources r15 = r1.f14709m
            i1.o r8 = r1.f14710n
            if (r9 == 0) goto L_0x0034
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r2 = "dialog_action"
            java.lang.String r3 = "confirm"
            r7.put(r2, r3)
            java.lang.String r16 = "dialog_click"
            r2 = r10
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r17 = r7
            r7 = r16
            r1 = r8
            r8 = r17
            com.google.android.gms.internal.ads.w42.m18872B5(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0035
        L_0x0034:
            r1 = r8
        L_0x0035:
            g2.a r2 = p048g2.C2637b.m21358Z2(r10)     // Catch:{ RemoteException -> 0x0040 }
            boolean r0 = r0.zzf(r2, r14, r13)     // Catch:{ RemoteException -> 0x0040 }
            if (r0 != 0) goto L_0x0055
            goto L_0x0046
        L_0x0040:
            r0 = move-exception
            java.lang.String r2 = "Failed to schedule offline notification poster."
            com.google.android.gms.internal.ads.io0.m11129e(r2, r0)
        L_0x0046:
            r12.mo9648m(r13)
            if (r9 == 0) goto L_0x0055
            java.lang.String r7 = "offline_notification_worker_not_scheduled"
            r2 = r10
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            com.google.android.gms.internal.ads.w42.m18871A5(r2, r3, r4, r5, r6, r7)
        L_0x0055:
            p054h1.C2694t.m21608q()
            j1.f r0 = p054h1.C2694t.m21609r()
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            int r0 = r0.mo14006k()
            r2.<init>(r10, r0)
            if (r15 != 0) goto L_0x006a
            java.lang.String r0 = "You'll get a notification with the link when you're back online"
            goto L_0x0070
        L_0x006a:
            int r0 = p040f1.C2603b.offline_opt_in_confirmation
            java.lang.String r0 = r15.getString(r0)
        L_0x0070:
            android.app.AlertDialog$Builder r0 = r2.setMessage(r0)
            com.google.android.gms.internal.ads.r42 r3 = new com.google.android.gms.internal.ads.r42
            r3.<init>(r1)
            r0.setOnCancelListener(r3)
            android.app.AlertDialog r0 = r2.create()
            r0.show()
            java.util.Timer r2 = new java.util.Timer
            r2.<init>()
            com.google.android.gms.internal.ads.v42 r3 = new com.google.android.gms.internal.ads.v42
            r3.<init>(r0, r2, r1)
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.schedule(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t42.onClick(android.content.DialogInterface, int):void");
    }
}
