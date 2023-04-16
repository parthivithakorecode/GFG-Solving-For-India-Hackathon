package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p034e2.C2555l;

public final class x72 implements r72<mm1> {

    /* renamed from: a */
    private final dl1 f17061a;

    /* renamed from: b */
    private final dc3 f17062b;

    /* renamed from: c */
    private final fp1 f17063c;

    /* renamed from: d */
    private final bt2<rr1> f17064d;

    /* renamed from: e */
    private final yr1 f17065e;

    public x72(dl1 dl1, dc3 dc3, fp1 fp1, bt2<rr1> bt2, yr1 yr1) {
        this.f17061a = dl1;
        this.f17062b = dc3;
        this.f17063c = fp1;
        this.f17064d = bt2;
        this.f17065e = yr1;
    }

    /* renamed from: g */
    private final cc3<mm1> m19384g(ds2 ds2, rr2 rr2, JSONObject jSONObject) {
        cc3<rr1> a = this.f17064d.mo5943a();
        cc3<rm1> a2 = this.f17063c.mo7379a(ds2, rr2, jSONObject);
        return rb3.m16126d(a, a2).mo10266a(new w72(this, a2, a, ds2, rr2, jSONObject), this.f17062b);
    }

    /* renamed from: a */
    public final cc3<List<cc3<mm1>>> mo5105a(ds2 ds2, rr2 rr2) {
        return rb3.m16136n(rb3.m16136n(this.f17064d.mo5943a(), new u72(this, rr2), this.f17062b), new v72(this, ds2, rr2), this.f17062b);
    }

    /* renamed from: b */
    public final boolean mo5106b(ds2 ds2, rr2 rr2) {
        wr2 wr2 = rr2.f13914t;
        return (wr2 == null || wr2.f16920c == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mm1 mo11779c(cc3 cc3, cc3 cc32, ds2 ds2, rr2 rr2, JSONObject jSONObject) {
        rm1 rm1 = (rm1) cc3.get();
        rr1 rr1 = (rr1) cc32.get();
        sm1 c = this.f17061a.mo6498c(new l71(ds2, rr2, (String) null), new dn1(rm1), new tl1(jSONObject, rr1));
        c.mo10197j().mo6273b();
        c.mo10198k().mo9589a(rr1);
        c.mo10196i().mo8729a(rm1.mo10572Z());
        c.mo10199l().mo11906a(this.f17065e);
        return c.mo10195h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ cc3 mo11780d(rr1 rr1, JSONObject jSONObject) {
        this.f17064d.mo5944b(rb3.m16131i(rr1));
        if (jSONObject.optBoolean("success")) {
            return rb3.m16131i(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new qb0("process json failed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ cc3 mo11781e(rr2 rr2, rr1 rr1) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10565n6)).booleanValue() && C2555l.m21217k()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", rr2.f13914t.f16920c);
        jSONObject2.put("sdk_params", jSONObject);
        return rb3.m16136n(rr1.mo10654d("google.afma.nativeAds.preProcessJson", jSONObject2), new t72(this, rr1), this.f17062b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ cc3 mo11782f(ds2 ds2, rr2 rr2, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return rb3.m16130h(new fz1(3));
        }
        int i = 0;
        if (ds2.f5903a.f4336a.f9646k <= 1) {
            return rb3.m16135m(m19384g(ds2, rr2, jSONArray.getJSONObject(0)), s72.f14314a, this.f17062b);
        }
        int length = jSONArray.length();
        this.f17064d.mo5945c(Math.min(length, ds2.f5903a.f4336a.f9646k));
        ArrayList arrayList = new ArrayList(ds2.f5903a.f4336a.f9646k);
        while (i < ds2.f5903a.f4336a.f9646k) {
            arrayList.add(i < length ? m19384g(ds2, rr2, jSONArray.getJSONObject(i)) : rb3.m16130h(new fz1(3)));
            i++;
        }
        return rb3.m16131i(arrayList);
    }
}
