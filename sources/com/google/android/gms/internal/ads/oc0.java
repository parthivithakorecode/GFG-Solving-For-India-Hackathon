package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;
import p054h1.C2694t;

public final class oc0<I, O> implements xa3<I, O> {

    /* renamed from: a */
    private final tb0<O> f11978a;

    /* renamed from: b */
    private final vb0<I> f11979b;

    /* renamed from: c */
    private final String f11980c = "google.afma.activeView.handleUpdate";

    /* renamed from: d */
    private final cc3<ob0> f11981d;

    oc0(cc3<ob0> cc3, String str, vb0<I> vb0, tb0<O> tb0) {
        this.f11981d = cc3;
        this.f11979b = vb0;
        this.f11978a = tb0;
    }

    /* renamed from: a */
    public final cc3<O> mo9721a(I i) {
        return rb3.m16136n(this.f11981d, new mc0(this, i), wo0.f16891f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ cc3 mo9722b(Object obj, ob0 ob0) {
        bp0 bp0 = new bp0();
        C2694t.m21608q();
        String uuid = UUID.randomUUID().toString();
        s70.f14306o.mo8115c(uuid, new nc0(this, bp0));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        ob0.mo9998c1(this.f11980c, jSONObject);
        return bp0;
    }

    /* renamed from: c */
    public final cc3<O> mo5074c(I i) {
        return mo9721a(i);
    }
}
