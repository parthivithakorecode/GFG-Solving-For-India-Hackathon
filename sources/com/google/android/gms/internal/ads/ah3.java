package com.google.android.gms.internal.ads;

public final class ah3 extends aq3<ah3, zg3> implements lr3 {
    /* access modifiers changed from: private */
    public static final ah3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public uo3 zzf = uo3.f15667g;
    private gh3 zzg;

    static {
        ah3 ah3 = new ah3();
        zzb = ah3;
        aq3.m6218v(ah3.class, ah3);
    }

    private ah3() {
    }

    /* renamed from: G */
    public static zg3 m6077G() {
        return (zg3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static ah3 m6079I(uo3 uo3, mp3 mp3) {
        return (ah3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* renamed from: N */
    static /* synthetic */ void m6082N(ah3 ah3, gh3 gh3) {
        gh3.getClass();
        ah3.zzg = gh3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new ah3();
        } else {
            if (i2 == 4) {
                return new zg3((yg3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo5293F() {
        return this.zze;
    }

    /* renamed from: J */
    public final gh3 mo5294J() {
        gh3 gh3 = this.zzg;
        return gh3 == null ? gh3.m9788I() : gh3;
    }

    /* renamed from: K */
    public final uo3 mo5295K() {
        return this.zzf;
    }
}
