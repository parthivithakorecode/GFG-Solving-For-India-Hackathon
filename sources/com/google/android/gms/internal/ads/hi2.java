package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p048g2.C2637b;

public final class hi2 implements ij2<ii2> {

    /* renamed from: a */
    private final dc3 f8317a;

    /* renamed from: b */
    private final ScheduledExecutorService f8318b;

    /* renamed from: c */
    private final hb2 f8319c;

    /* renamed from: d */
    private final Context f8320d;

    /* renamed from: e */
    private final ks2 f8321e;

    /* renamed from: f */
    private final db2 f8322f;

    /* renamed from: g */
    private final rt1 f8323g;

    /* renamed from: h */
    final String f8324h;

    public hi2(dc3 dc3, ScheduledExecutorService scheduledExecutorService, String str, hb2 hb2, Context context, ks2 ks2, db2 db2, rt1 rt1) {
        this.f8317a = dc3;
        this.f8318b = scheduledExecutorService;
        this.f8324h = str;
        this.f8319c = hb2;
        this.f8320d = context;
        this.f8321e = ks2;
        this.f8322f = db2;
        this.f8323g = rt1;
    }

    /* renamed from: b */
    public static /* synthetic */ cc3 m10585b(hi2 hi2) {
        Map<String, List<Bundle>> a = hi2.f8319c.mo7905a(hi2.f8324h, ((Boolean) C2199sw.m17001c().mo8579b(m10.f10584p7)).booleanValue() ? hi2.f8321e.f9641f.toLowerCase(Locale.ROOT) : hi2.f8321e.f9641f);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((i73) a).entrySet().iterator();
        while (true) {
            Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle2 = hi2.f8321e.f9639d.f9679r;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            }
            arrayList.add(rb3.m16128f((ib3) rb3.m16137o(ib3.m10985E(rb3.m16134l(new fi2(hi2, str, list, bundle), hi2.f8317a)), ((Long) C2199sw.m17001c().mo8579b(m10.f10470d1)).longValue(), TimeUnit.MILLISECONDS, hi2.f8318b), Throwable.class, new bi2(str), hi2.f8317a));
        }
        for (Map.Entry value : ((i73) hi2.f8319c.mo7906b()).entrySet()) {
            lb2 lb2 = (lb2) value.getValue();
            String str2 = lb2.f9984a;
            Bundle bundle3 = hi2.f8321e.f9639d.f9679r;
            arrayList.add(rb3.m16128f((ib3) rb3.m16137o(ib3.m10985E(rb3.m16134l(new ei2(hi2, str2, lb2, bundle3 != null ? bundle3.getBundle(str2) : null), hi2.f8317a)), ((Long) C2199sw.m17001c().mo8579b(m10.f10470d1)).longValue(), TimeUnit.MILLISECONDS, hi2.f8318b), Throwable.class, new ci2(str2), hi2.f8317a));
        }
        return rb3.m16125c(arrayList).mo10266a(new gi2(arrayList), hi2.f8317a);
    }

    /* renamed from: e */
    private final cc3<JSONObject> m10586e(String str, List<Bundle> list, Bundle bundle, boolean z, boolean z2) {
        cf0 cf0;
        bp0 bp0 = new bp0();
        if (z2) {
            this.f8322f.mo6435b(str);
            cf0 = this.f8322f.mo6434a(str);
        } else {
            try {
                cf0 = this.f8323g.mo10663a(str);
            } catch (RemoteException e) {
                io0.m11129e("Couldn't create RTB adapter : ", e);
                cf0 = null;
            }
        }
        cf0 cf02 = cf0;
        Objects.requireNonNull(cf02);
        kb2 kb2 = new kb2(str, cf02, bp0);
        if (z) {
            cf02.mo5264r1(C2637b.m21358Z2(this.f8320d), this.f8324h, bundle, list.get(0), this.f8321e.f9640e, kb2);
        } else {
            kb2.mo8649a();
        }
        return bp0;
    }

    /* renamed from: a */
    public final cc3<ii2> mo5813a() {
        return rb3.m16134l(new di2(this), this.f8317a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ cc3 mo7945c(String str, List list, Bundle bundle) {
        return m10586e(str, list, bundle, true, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ cc3 mo7946d(String str, lb2 lb2, Bundle bundle) {
        return m10586e(str, Collections.singletonList(lb2.f9987d), bundle, lb2.f9985b, lb2.f9986c);
    }
}
