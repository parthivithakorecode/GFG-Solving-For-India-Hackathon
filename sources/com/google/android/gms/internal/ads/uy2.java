package com.google.android.gms.internal.ads;

public final class uy2 {

    /* renamed from: a */
    private final String f15822a;

    /* renamed from: b */
    private final String f15823b;

    private uy2(String str, String str2) {
        this.f15822a = str;
        this.f15823b = str2;
    }

    /* renamed from: a */
    public static uy2 m18250a(String str, String str2) {
        uz2.m18275a(str, "Name is null or empty");
        uz2.m18275a(str2, "Version is null or empty");
        return new uy2(str, str2);
    }

    /* renamed from: b */
    public final String mo11344b() {
        return this.f15822a;
    }

    /* renamed from: c */
    public final String mo11345c() {
        return this.f15823b;
    }
}
