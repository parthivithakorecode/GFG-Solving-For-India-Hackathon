package com.google.android.gms.internal.ads;

public final class yt3 extends aq3<yt3, xt3> implements lr3 {
    /* access modifiers changed from: private */
    public static final yt3 zzb;
    private int zze;
    private uo3 zzf;
    private uo3 zzg;
    private uo3 zzh;

    static {
        yt3 yt3 = new yt3();
        zzb = yt3;
        aq3.m6218v(yt3.class, yt3);
    }

    private yt3() {
        uo3 uo3 = uo3.f15667g;
        this.zzf = uo3;
        this.zzg = uo3;
        this.zzh = uo3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new yt3();
        } else {
            if (i2 == 4) {
                return new xt3((ot3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
