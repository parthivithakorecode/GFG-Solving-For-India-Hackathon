package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ow */
public final class C2051ow {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1865jv f12217a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1791hv f12218b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2462zz f12219c;

    /* renamed from: d */
    private final j60 f12220d;

    /* renamed from: e */
    private final sk0 f12221e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final wg0 f12222f;

    /* renamed from: g */
    private final k60 f12223g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public zh0 f12224h;

    public C2051ow(C1865jv jvVar, C1791hv hvVar, C2462zz zzVar, j60 j60, sk0 sk0, wg0 wg0, k60 k60) {
        this.f12217a = jvVar;
        this.f12218b = hvVar;
        this.f12219c = zzVar;
        this.f12220d = j60;
        this.f12221e = sk0;
        this.f12222f = wg0;
        this.f12223g = k60;
    }

    /* renamed from: n */
    static /* bridge */ /* synthetic */ void m14660n(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        C2125qw.m15897b().mo5899i(context, C2125qw.m15898c().f12729f, "gmob-apps", bundle, true);
    }

    /* renamed from: c */
    public final C1867jx mo9871c(Context context, String str, dd0 dd0) {
        return (C1867jx) new C1903kw(this, context, str, dd0).mo10181d(context, false);
    }

    /* renamed from: d */
    public final C2015nx mo9872d(Context context, C2087pv pvVar, String str, dd0 dd0) {
        return (C2015nx) new C1755gw(this, context, pvVar, str, dd0).mo10181d(context, false);
    }

    /* renamed from: e */
    public final C2015nx mo9873e(Context context, C2087pv pvVar, String str, dd0 dd0) {
        return (C2015nx) new C1829iw(this, context, pvVar, str, dd0).mo10181d(context, false);
    }

    /* renamed from: g */
    public final ng0 mo9874g(Context context, dd0 dd0) {
        return (ng0) new C1643dw(this, context, dd0).mo10181d(context, false);
    }

    /* renamed from: i */
    public final zg0 mo9875i(Activity activity) {
        C2458zv zvVar = new C2458zv(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            io0.m11128d("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zg0) zvVar.mo10181d(activity, z);
    }

    /* renamed from: k */
    public final fk0 mo9876k(Context context, String str, dd0 dd0) {
        return (fk0) new C2014nw(this, context, str, dd0).mo10181d(context, false);
    }

    /* renamed from: l */
    public final bn0 mo9877l(Context context, dd0 dd0) {
        return (bn0) new C1569bw(this, context, dd0).mo10181d(context, false);
    }
}
