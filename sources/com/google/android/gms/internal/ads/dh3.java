package com.google.android.gms.internal.ads;

public final class dh3 extends aq3<dh3, ch3> implements lr3 {
    /* access modifiers changed from: private */
    public static final dh3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private gh3 zzf;

    static {
        dh3 dh3 = new dh3();
        zzb = dh3;
        aq3.m6218v(dh3.class, dh3);
    }

    private dh3() {
    }

    /* renamed from: G */
    public static ch3 m7872G() {
        return (ch3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static dh3 m7874I(uo3 uo3, mp3 mp3) {
        return (dh3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* renamed from: L */
    static /* synthetic */ void m7876L(dh3 dh3, gh3 gh3) {
        gh3.getClass();
        dh3.zzf = gh3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new dh3();
        } else {
            if (i2 == 4) {
                return new ch3((bh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo6477F() {
        return this.zze;
    }

    /* renamed from: J */
    public final gh3 mo6478J() {
        gh3 gh3 = this.zzf;
        return gh3 == null ? gh3.m9788I() : gh3;
    }
}
