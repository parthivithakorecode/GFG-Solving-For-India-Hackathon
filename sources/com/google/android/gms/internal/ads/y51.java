package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class y51 {

    /* renamed from: c */
    public static final y51 f17608c = new y51((Object) null, new of0[0], 0, -9223372036854775807L, 0);

    /* renamed from: d */
    private static final of0 f17609d = new of0(0).mo9751b(0);

    /* renamed from: e */
    public static final my3<y51> f17610e = C1499a.f3815a;

    /* renamed from: a */
    public final long f17611a = 0;

    /* renamed from: b */
    private final of0[] f17612b;

    private y51(Object obj, of0[] of0Arr, long j, long j2, int i) {
        this.f17612b = of0Arr;
    }

    /* renamed from: a */
    public final of0 mo11965a(int i) {
        return i < 0 ? f17609d : this.f17612b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y51.class == obj.getClass()) {
            return n13.m13643p((Object) null, (Object) null) && Arrays.equals(this.f17612b, ((y51) obj).f17612b);
        }
    }

    public final int hashCode() {
        return (((int) -9223372036854775807L) * 961) + Arrays.hashCode(this.f17612b);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + null + ", adResumePositionUs=0, adGroups=[" + "])";
    }
}
