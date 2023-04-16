package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import p054h1.C2694t;

public final class oa1 extends C2424yy {

    /* renamed from: f */
    private final String f11950f;

    /* renamed from: g */
    private final String f11951g;

    /* renamed from: h */
    private final String f11952h;

    /* renamed from: i */
    private final List<C2235tv> f11953i;

    /* renamed from: j */
    private final long f11954j;

    /* renamed from: k */
    private final String f11955k;

    public oa1(rr2 rr2, String str, f52 f52, ur2 ur2) {
        String str2 = null;
        this.f11951g = rr2 == null ? null : rr2.f13882Y;
        this.f11952h = ur2 == null ? null : ur2.f15729b;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str2 = rr2.f13917w.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f11950f = str2 != null ? str2 : str;
        this.f11953i = f52.mo7235b();
        this.f11954j = C2694t.m21592a().mo12462a() / 1000;
        this.f11955k = (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10376R6)).booleanValue() || ur2 == null || TextUtils.isEmpty(ur2.f15735h)) ? "" : ur2.f15735h;
    }

    /* renamed from: b */
    public final String mo9702b() {
        return this.f11950f;
    }

    /* renamed from: c */
    public final long mo9703c() {
        return this.f11954j;
    }

    /* renamed from: d */
    public final String mo9704d() {
        return this.f11951g;
    }

    /* renamed from: e */
    public final List<C2235tv> mo9705e() {
        if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10484e6)).booleanValue()) {
            return null;
        }
        return this.f11953i;
    }

    /* renamed from: f */
    public final String mo9706f() {
        return this.f11952h;
    }

    /* renamed from: g */
    public final String mo9707g() {
        return this.f11955k;
    }
}
