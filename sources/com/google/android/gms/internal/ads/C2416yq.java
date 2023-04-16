package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.yq */
public final class C2416yq {

    /* renamed from: a */
    private final InputStream f17839a;

    /* renamed from: b */
    private final boolean f17840b;

    /* renamed from: c */
    private final boolean f17841c;

    /* renamed from: d */
    private final long f17842d;

    /* renamed from: e */
    private final boolean f17843e;

    private C2416yq(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        this.f17839a = inputStream;
        this.f17840b = z;
        this.f17841c = z2;
        this.f17842d = j;
        this.f17843e = z3;
    }

    /* renamed from: b */
    public static C2416yq m20155b(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        return new C2416yq(inputStream, z, z2, j, z3);
    }

    /* renamed from: a */
    public final long mo12072a() {
        return this.f17842d;
    }

    /* renamed from: c */
    public final InputStream mo12073c() {
        return this.f17839a;
    }

    /* renamed from: d */
    public final boolean mo12074d() {
        return this.f17840b;
    }

    /* renamed from: e */
    public final boolean mo12075e() {
        return this.f17843e;
    }

    /* renamed from: f */
    public final boolean mo12076f() {
        return this.f17841c;
    }
}
