package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p054h1.C2694t;

public final /* synthetic */ class ea0 {
    /* renamed from: a */
    public static void m8395a(fa0 fa0, String str, Map map) {
        try {
            fa0.mo6423s(str, C2694t.m21608q().mo14024N(map));
        } catch (JSONException unused) {
            io0.m11131g("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: b */
    public static void m8396b(fa0 fa0, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        io0.m11126b(sb2.length() != 0 ? "Dispatching AFMA event: ".concat(sb2) : new String("Dispatching AFMA event: "));
        fa0.mo7273b(sb.toString());
    }

    /* renamed from: c */
    public static void m8397c(fa0 fa0, String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        fa0.mo7273b(sb.toString());
    }

    /* renamed from: d */
    public static void m8398d(fa0 fa0, String str, JSONObject jSONObject) {
        fa0.mo7272a(str, jSONObject.toString());
    }
}
