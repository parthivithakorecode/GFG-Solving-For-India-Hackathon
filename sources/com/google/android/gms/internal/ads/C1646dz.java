package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.dz */
public class C1646dz extends IOException {

    /* renamed from: f */
    public final boolean f5990f;

    /* renamed from: g */
    public final int f5991g;

    protected C1646dz(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f5990f = z;
        this.f5991g = i;
    }

    /* renamed from: a */
    public static C1646dz m8223a(String str, Throwable th) {
        return new C1646dz(str, th, true, 1);
    }

    /* renamed from: b */
    public static C1646dz m8224b(String str, Throwable th) {
        return new C1646dz(str, th, true, 0);
    }

    /* renamed from: c */
    public static C1646dz m8225c(String str) {
        return new C1646dz(str, (Throwable) null, false, 1);
    }
}
