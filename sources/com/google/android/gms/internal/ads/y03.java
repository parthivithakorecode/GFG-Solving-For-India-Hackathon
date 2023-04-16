package com.google.android.gms.internal.ads;

import java.util.Objects;

final class y03 extends v03 {

    /* renamed from: a */
    private String f17532a;

    /* renamed from: b */
    private Boolean f17533b;

    /* renamed from: c */
    private Boolean f17534c;

    y03() {
    }

    /* renamed from: a */
    public final v03 mo11361a(String str) {
        Objects.requireNonNull(str, "Null clientVersion");
        this.f17532a = str;
        return this;
    }

    /* renamed from: b */
    public final v03 mo11362b(boolean z) {
        this.f17534c = Boolean.TRUE;
        return this;
    }

    /* renamed from: c */
    public final v03 mo11363c(boolean z) {
        this.f17533b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: d */
    public final w03 mo11364d() {
        Boolean bool;
        String str = this.f17532a;
        if (str != null && (bool = this.f17533b) != null && this.f17534c != null) {
            return new a13(str, bool.booleanValue(), this.f17534c.booleanValue(), (z03) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f17532a == null) {
            sb.append(" clientVersion");
        }
        if (this.f17533b == null) {
            sb.append(" shouldGetAdvertisingId");
        }
        if (this.f17534c == null) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
