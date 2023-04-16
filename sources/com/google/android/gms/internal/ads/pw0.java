package com.google.android.gms.internal.ads;

import java.util.List;

public final class pw0 {

    /* renamed from: b */
    public static final pw0 f12823b = new pw0(e73.m8347v());

    /* renamed from: c */
    public static final my3<pw0> f12824c = ot0.f12202a;

    /* renamed from: a */
    private final e73<qv0> f12825a;

    public pw0(List<qv0> list) {
        this.f12825a = e73.m8345t(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pw0.class != obj.getClass()) {
            return false;
        }
        return this.f12825a.equals(((pw0) obj).f12825a);
    }

    public final int hashCode() {
        return this.f12825a.hashCode();
    }
}
