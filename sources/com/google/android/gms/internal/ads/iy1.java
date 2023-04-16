package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class iy1 implements ya1, td1, pc1 {

    /* renamed from: f */
    private final uy1 f8864f;

    /* renamed from: g */
    private final String f8865g;

    /* renamed from: h */
    private int f8866h = 0;

    /* renamed from: i */
    private hy1 f8867i = hy1.AD_REQUESTED;

    /* renamed from: j */
    private oa1 f8868j;

    /* renamed from: k */
    private C1605cv f8869k;

    iy1(uy1 uy1, ks2 ks2) {
        this.f8864f = uy1;
        this.f8865g = ks2.f9641f;
    }

    /* renamed from: c */
    private static JSONObject m11357c(C1605cv cvVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", cvVar.f5531h);
        jSONObject.put("errorCode", cvVar.f5529f);
        jSONObject.put("errorDescription", cvVar.f5530g);
        C1605cv cvVar2 = cvVar.f5532i;
        jSONObject.put("underlyingError", cvVar2 == null ? null : m11357c(cvVar2));
        return jSONObject;
    }

    /* renamed from: e */
    private static JSONObject m11358e(oa1 oa1) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", oa1.mo9702b());
        jSONObject.put("responseSecsSinceEpoch", oa1.mo9703c());
        jSONObject.put("responseId", oa1.mo9704d());
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10376R6)).booleanValue()) {
            String g = oa1.mo9707g();
            if (!TextUtils.isEmpty(g)) {
                String valueOf = String.valueOf(g);
                io0.m11126b(valueOf.length() != 0 ? "Bidding data: ".concat(valueOf) : new String("Bidding data: "));
                jSONObject.put("biddingData", new JSONObject(g));
            }
        }
        JSONArray jSONArray = new JSONArray();
        List<C2235tv> e = oa1.mo9705e();
        if (e != null) {
            for (C2235tv next : e) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adapterClassName", next.f15052f);
                jSONObject2.put("latencyMillis", next.f15053g);
                C1605cv cvVar = next.f15054h;
                jSONObject2.put("error", cvVar == null ? null : m11357c(cvVar));
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    /* renamed from: U */
    public final void mo8308U(v61 v61) {
        this.f8868j = v61.mo11409c();
        this.f8867i = hy1.AD_LOADED;
    }

    /* renamed from: a */
    public final JSONObject mo8309a() {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f8867i);
        jSONObject.put("format", rr2.m16425a(this.f8866h));
        oa1 oa1 = this.f8868j;
        JSONObject jSONObject2 = null;
        if (oa1 != null) {
            jSONObject2 = m11358e(oa1);
        } else {
            C1605cv cvVar = this.f8869k;
            if (!(cvVar == null || (iBinder = cvVar.f5533j) == null)) {
                oa1 oa12 = (oa1) iBinder;
                jSONObject2 = m11358e(oa12);
                List<C2235tv> e = oa12.mo9705e();
                if (e != null && e.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(m11357c(this.f8869k));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    /* renamed from: b */
    public final boolean mo8310b() {
        return this.f8867i != hy1.AD_REQUESTED;
    }

    /* renamed from: d */
    public final void mo7808d(C1605cv cvVar) {
        this.f8867i = hy1.AD_LOAD_FAILED;
        this.f8869k = cvVar;
    }

    /* renamed from: n0 */
    public final void mo6025n0(vi0 vi0) {
        this.f8864f.mo11334e(this.f8865g, this);
    }

    /* renamed from: q */
    public final void mo6026q(ds2 ds2) {
        if (!ds2.f5904b.f5508a.isEmpty()) {
            this.f8866h = ds2.f5904b.f5508a.get(0).f13886b;
        }
    }
}
