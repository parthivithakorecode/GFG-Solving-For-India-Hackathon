package com.google.android.gms.internal.ads;

import java.util.Objects;

final class sy0 implements xw1 {

    /* renamed from: a */
    private final b01 f14617a;

    /* renamed from: b */
    private final yy0 f14618b;

    /* renamed from: c */
    private Long f14619c;

    /* renamed from: d */
    private String f14620d;

    /* synthetic */ sy0(b01 b01, yy0 yy0, qy0 qy0) {
        this.f14617a = b01;
        this.f14618b = yy0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ xw1 mo10906a(long j) {
        this.f14619c = Long.valueOf(j);
        return this;
    }

    /* renamed from: b */
    public final /* synthetic */ xw1 mo10907b(String str) {
        Objects.requireNonNull(str);
        this.f14620d = str;
        return this;
    }

    /* renamed from: c */
    public final ax1 mo10908c() {
        sv3.m16998c(this.f14619c, Long.class);
        sv3.m16998c(this.f14620d, String.class);
        return new uy0(this.f14617a, this.f14618b, this.f14619c, this.f14620d, (ty0) null);
    }
}
