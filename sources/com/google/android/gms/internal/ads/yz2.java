package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

public final class yz2 {

    /* renamed from: a */
    private JSONObject f17948a;

    /* renamed from: b */
    private final h03 f17949b;

    public yz2(h03 h03) {
        this.f17949b = h03;
    }

    /* renamed from: a */
    public final JSONObject mo12112a() {
        return this.f17948a;
    }

    /* renamed from: b */
    public final void mo12113b() {
        this.f17949b.mo7779b(new i03(this, (byte[]) null));
    }

    /* renamed from: c */
    public final void mo12114c(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f17949b.mo7779b(new j03(this, hashSet, jSONObject, j, (long) null));
    }

    /* renamed from: d */
    public final void mo12115d(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f17949b.mo7779b(new k03(this, hashSet, jSONObject, j, (long) null));
    }

    /* renamed from: e */
    public final void mo12116e(JSONObject jSONObject) {
        this.f17948a = jSONObject;
    }
}
