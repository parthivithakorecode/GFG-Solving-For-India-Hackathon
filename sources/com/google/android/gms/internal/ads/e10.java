package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

public abstract class e10<T> {

    /* renamed from: a */
    private final int f6051a;

    /* renamed from: b */
    private final String f6052b;

    /* renamed from: c */
    private final T f6053c;

    /* synthetic */ e10(int i, String str, Object obj, d10 d10) {
        this.f6051a = i;
        this.f6052b = str;
        this.f6053c = obj;
        C2199sw.m16999a().mo7213d(this);
    }

    /* renamed from: f */
    public static e10<Float> m8261f(int i, String str, float f) {
        return new a10(1, str, Float.valueOf(f));
    }

    /* renamed from: g */
    public static e10<Integer> m8262g(int i, String str, int i2) {
        return new y00(1, str, Integer.valueOf(i2));
    }

    /* renamed from: h */
    public static e10<Long> m8263h(int i, String str, long j) {
        return new z00(1, str, Long.valueOf(j));
    }

    /* renamed from: i */
    public static e10<Boolean> m8264i(int i, String str, Boolean bool) {
        return new x00(i, str, bool);
    }

    /* renamed from: j */
    public static e10<String> m8265j(int i, String str, String str2) {
        return new b10(1, str, str2);
    }

    /* renamed from: k */
    public static e10<String> m8266k(int i, String str) {
        e10<String> j = m8265j(1, "gads:sdk_core_constants:experiment_id", (String) null);
        C2199sw.m16999a().mo7212c(j);
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo5055a(JSONObject jSONObject);

    /* renamed from: b */
    public abstract T mo5056b(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo5057c(SharedPreferences sharedPreferences);

    /* renamed from: d */
    public abstract void mo5058d(SharedPreferences.Editor editor, T t);

    /* renamed from: e */
    public final int mo6771e() {
        return this.f6051a;
    }

    /* renamed from: l */
    public final T mo6772l() {
        return this.f6053c;
    }

    /* renamed from: m */
    public final String mo6773m() {
        return this.f6052b;
    }
}
