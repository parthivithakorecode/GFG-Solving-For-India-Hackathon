package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class vv1 {

    /* renamed from: a */
    private final Map<String, String> f16422a = new ConcurrentHashMap();

    /* renamed from: b */
    final /* synthetic */ wv1 f16423b;

    vv1(wv1 wv1) {
        this.f16423b = wv1;
    }

    /* renamed from: b */
    public final vv1 mo11533b(String str, String str2) {
        this.f16422a.put(str, str2);
        return this;
    }

    /* renamed from: c */
    public final vv1 mo11534c(rr2 rr2) {
        this.f16422a.put("aai", rr2.f13918x);
        return this;
    }

    /* renamed from: d */
    public final vv1 mo11535d(ur2 ur2) {
        this.f16422a.put("gqi", ur2.f15729b);
        return this;
    }

    /* renamed from: e */
    public final String mo11536e() {
        return this.f16423b.f16942a.mo7173a(this.f16422a);
    }

    /* renamed from: f */
    public final void mo11537f() {
        this.f16423b.f16943b.execute(new uv1(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo11538g() {
        this.f16423b.f16942a.mo7174b(this.f16422a);
    }
}
