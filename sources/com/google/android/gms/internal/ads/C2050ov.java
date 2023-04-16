package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import p002a1.C0037u;

/* renamed from: com.google.android.gms.internal.ads.ov */
public final class C2050ov {

    /* renamed from: a */
    public static final C2050ov f12212a = new C2050ov();

    protected C2050ov() {
    }

    /* renamed from: a */
    public final C1902kv mo9869a(Context context, C1906kz kzVar) {
        List list;
        Context context2;
        String str;
        C1906kz kzVar2 = kzVar;
        Date n = kzVar.mo8835n();
        long time = n != null ? n.getTime() : -1;
        String k = kzVar.mo8832k();
        int a = kzVar.mo8822a();
        Set<String> r = kzVar.mo8839r();
        if (!r.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(r));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean t = kzVar2.mo8841t(context2);
        Location d = kzVar.mo8825d();
        Bundle f = kzVar2.mo8827f(AdMobAdapter.class);
        kzVar.mo8829h();
        String l = kzVar.mo8833l();
        kzVar.mo8830i();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            C2125qw.m15897b();
            str = bo0.m6988l(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean s = kzVar.mo8840s();
        C0037u b = C2276uz.m18256e().mo11346b();
        return new C1902kv(8, time, f, a, list, t, Math.max(kzVar.mo8824c(), b.mo108b()), false, l, (p00) null, d, k, kzVar.mo8828g(), kzVar.mo8826e(), Collections.unmodifiableList(new ArrayList(kzVar.mo8838q())), kzVar.mo8834m(), str, s, (C1531av) null, Math.max(-1, b.mo109c()), (String) Collections.max(Arrays.asList(new String[]{null, b.mo107a()}), C2013nv.f11718f), kzVar.mo8836o(), kzVar.mo8823b(), kzVar.mo8831j());
    }
}
