package com.google.android.gms.internal.ads;

import p003a2.C0089n;

public final class jj0 extends lj0 {

    /* renamed from: f */
    private final String f9159f;

    /* renamed from: g */
    private final int f9160g;

    public jj0(String str, int i) {
        this.f9159f = str;
        this.f9160g = i;
    }

    /* renamed from: a */
    public final int mo8470a() {
        return this.f9160g;
    }

    /* renamed from: c */
    public final String mo8471c() {
        return this.f9159f;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof jj0)) {
            jj0 jj0 = (jj0) obj;
            return C0089n.m301a(this.f9159f, jj0.f9159f) && C0089n.m301a(Integer.valueOf(this.f9160g), Integer.valueOf(jj0.f9160g));
        }
    }
}
