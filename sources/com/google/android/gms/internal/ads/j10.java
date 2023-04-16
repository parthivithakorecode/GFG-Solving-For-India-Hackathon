package com.google.android.gms.internal.ads;

final class j10 implements q30 {

    /* renamed from: a */
    final /* synthetic */ k10 f8941a;

    j10(k10 k10) {
        this.f8941a = k10;
    }

    /* renamed from: a */
    public final Double mo8325a(String str, double d) {
        return Double.valueOf((double) this.f8941a.f9338e.getFloat(str, (float) d));
    }

    /* renamed from: b */
    public final String mo8326b(String str, String str2) {
        return this.f8941a.f9338e.getString(str, str2);
    }

    /* renamed from: c */
    public final Long mo8327c(String str, long j) {
        try {
            return Long.valueOf(this.f8941a.f9338e.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf((long) this.f8941a.f9338e.getInt(str, (int) j));
        }
    }

    /* renamed from: d */
    public final Boolean mo8328d(String str, boolean z) {
        return Boolean.valueOf(this.f8941a.f9338e.getBoolean(str, z));
    }
}
