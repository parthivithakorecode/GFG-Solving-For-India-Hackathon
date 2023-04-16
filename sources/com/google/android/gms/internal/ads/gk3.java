package com.google.android.gms.internal.ads;

public final class gk3 extends aq3<gk3, fk3> implements lr3 {
    /* access modifiers changed from: private */
    public static final gk3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private nk3 zzf;
    /* access modifiers changed from: private */
    public uo3 zzg = uo3.f15667g;

    static {
        gk3 gk3 = new gk3();
        zzb = gk3;
        aq3.m6218v(gk3.class, gk3);
    }

    private gk3() {
    }

    /* renamed from: G */
    public static fk3 m9817G() {
        return (fk3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static gk3 m9819I() {
        return zzb;
    }

    /* renamed from: J */
    public static gk3 m9820J(uo3 uo3, mp3 mp3) {
        return (gk3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* renamed from: N */
    static /* synthetic */ void m9822N(gk3 gk3, nk3 nk3) {
        nk3.getClass();
        gk3.zzf = nk3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new gk3();
        } else {
            if (i2 == 4) {
                return new fk3((ek3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo7656F() {
        return this.zze;
    }

    /* renamed from: K */
    public final nk3 mo7657K() {
        nk3 nk3 = this.zzf;
        return nk3 == null ? nk3.m13965I() : nk3;
    }

    /* renamed from: L */
    public final uo3 mo7658L() {
        return this.zzg;
    }
}
