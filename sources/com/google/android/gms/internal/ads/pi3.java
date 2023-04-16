package com.google.android.gms.internal.ads;

public final class pi3 extends aq3<pi3, oi3> implements lr3 {
    /* access modifiers changed from: private */
    public static final pi3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public uo3 zzf = uo3.f15667g;

    static {
        pi3 pi3 = new pi3();
        zzb = pi3;
        aq3.m6218v(pi3.class, pi3);
    }

    private pi3() {
    }

    /* renamed from: G */
    public static oi3 m15079G() {
        return (oi3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static pi3 m15081I(uo3 uo3, mp3 mp3) {
        return (pi3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new pi3();
        } else {
            if (i2 == 4) {
                return new oi3((ni3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo10064F() {
        return this.zze;
    }

    /* renamed from: J */
    public final uo3 mo10065J() {
        return this.zzf;
    }
}
