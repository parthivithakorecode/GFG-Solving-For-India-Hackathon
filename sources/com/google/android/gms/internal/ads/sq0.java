package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class sq0 {

    /* renamed from: a */
    public final boolean f14537a;

    /* renamed from: b */
    public final int f14538b;

    /* renamed from: c */
    public final int f14539c;

    /* renamed from: d */
    public final int f14540d;

    /* renamed from: e */
    public final String f14541e;

    /* renamed from: f */
    public final int f14542f;

    /* renamed from: g */
    public final int f14543g;

    /* renamed from: h */
    public final int f14544h;

    /* renamed from: i */
    public final int f14545i;

    /* renamed from: j */
    public final boolean f14546j;

    /* renamed from: k */
    public final int f14547k;

    /* renamed from: l */
    public final boolean f14548l;

    /* renamed from: m */
    public final boolean f14549m;

    /* renamed from: n */
    public final boolean f14550n;

    public sq0(String str) {
        String str2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f14537a = m16939a(jSONObject, "aggressive_media_codec_release", m10.f10257D);
        this.f14538b = m16940b(jSONObject, "byte_buffer_precache_limit", m10.f10522j);
        this.f14539c = m16940b(jSONObject, "exo_cache_buffer_size", m10.f10594r);
        this.f14540d = m16940b(jSONObject, "exo_connect_timeout_millis", m10.f10486f);
        e10 e10 = m10.f10477e;
        if (jSONObject != null) {
            try {
                str2 = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.f14541e = str2;
            this.f14542f = m16940b(jSONObject, "exo_read_timeout_millis", m10.f10495g);
            this.f14543g = m16940b(jSONObject, "load_check_interval_bytes", m10.f10504h);
            this.f14544h = m16940b(jSONObject, "player_precache_limit", m10.f10513i);
            this.f14545i = m16940b(jSONObject, "socket_receive_buffer_size", m10.f10531k);
            this.f14546j = m16939a(jSONObject, "use_cache_data_source", m10.f10348O2);
            this.f14547k = m16940b(jSONObject, "min_retry_count", m10.f10540l);
            this.f14548l = m16939a(jSONObject, "treat_load_exception_as_non_fatal", m10.f10567o);
            this.f14549m = m16939a(jSONObject, "using_official_simple_exo_player", m10.f10605s1);
            this.f14550n = m16939a(jSONObject, "enable_multiple_video_playback", m10.f10613t1);
        }
        str2 = (String) C2199sw.m17001c().mo8579b(e10);
        this.f14541e = str2;
        this.f14542f = m16940b(jSONObject, "exo_read_timeout_millis", m10.f10495g);
        this.f14543g = m16940b(jSONObject, "load_check_interval_bytes", m10.f10504h);
        this.f14544h = m16940b(jSONObject, "player_precache_limit", m10.f10513i);
        this.f14545i = m16940b(jSONObject, "socket_receive_buffer_size", m10.f10531k);
        this.f14546j = m16939a(jSONObject, "use_cache_data_source", m10.f10348O2);
        this.f14547k = m16940b(jSONObject, "min_retry_count", m10.f10540l);
        this.f14548l = m16939a(jSONObject, "treat_load_exception_as_non_fatal", m10.f10567o);
        this.f14549m = m16939a(jSONObject, "using_official_simple_exo_player", m10.f10605s1);
        this.f14550n = m16939a(jSONObject, "enable_multiple_video_playback", m10.f10613t1);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.e10, com.google.android.gms.internal.ads.e10<java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean m16939a(org.json.JSONObject r1, java.lang.String r2, com.google.android.gms.internal.ads.e10<java.lang.Boolean> r3) {
        /*
            com.google.android.gms.internal.ads.k10 r0 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r3 = r0.mo8579b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r1 == 0) goto L_0x0014
            boolean r3 = r1.getBoolean(r2)     // Catch:{ JSONException -> 0x0014 }
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sq0.m16939a(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.e10):boolean");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.e10, com.google.android.gms.internal.ads.e10<java.lang.Integer>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final int m16940b(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.e10<java.lang.Integer> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            int r0 = r0.getInt(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.k10 r0 = com.google.android.gms.internal.ads.C2199sw.m17001c()
            java.lang.Object r0 = r0.mo8579b(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sq0.m16940b(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.e10):int");
    }
}
