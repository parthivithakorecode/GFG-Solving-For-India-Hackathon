package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import p054h1.C2694t;

public final /* synthetic */ class bg2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ cg2 f4934a;

    public /* synthetic */ bg2(cg2 cg2) {
        this.f4934a = cg2;
    }

    public final Object call() {
        String str;
        String str2;
        String str3;
        C2694t.m21608q();
        C2414yo d = C2694t.m21607p().mo11025h().mo14083d();
        Bundle bundle = null;
        if (d != null && (!C2694t.m21607p().mo11025h().mo14102w() || !C2694t.m21607p().mo11025h().mo14101v())) {
            if (d.mo12061h()) {
                d.mo12060g();
            }
            C2043oo a = d.mo12054a();
            if (a != null) {
                str2 = a.mo9812d();
                str = a.mo9813e();
                str3 = a.mo9815f();
                if (str2 != null) {
                    C2694t.m21607p().mo11025h().mo14077I(str2);
                }
                if (str3 != null) {
                    C2694t.m21607p().mo11025h().mo14091l(str3);
                }
            } else {
                str2 = C2694t.m21607p().mo11025h().mo14087h();
                str3 = C2694t.m21607p().mo11025h().mo14088i();
                str = null;
            }
            Bundle bundle2 = new Bundle(1);
            if (!C2694t.m21607p().mo11025h().mo14101v()) {
                if (str3 == null || TextUtils.isEmpty(str3)) {
                    str3 = "no_hash";
                }
                bundle2.putString("v_fp_vertical", str3);
            }
            if (str2 != null && !C2694t.m21607p().mo11025h().mo14102w()) {
                bundle2.putString("fingerprint", str2);
                if (!str2.equals(str)) {
                    bundle2.putString("v_fp", str);
                }
            }
            if (!bundle2.isEmpty()) {
                bundle = bundle2;
            }
        }
        return new dg2(bundle);
    }
}
