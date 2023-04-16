package com.google.android.gms.internal.ads;

public final class mi3 extends aq3<mi3, li3> implements lr3 {
    /* access modifiers changed from: private */
    public static final mi3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        mi3 mi3 = new mi3();
        zzb = mi3;
        aq3.m6218v(mi3.class, mi3);
    }

    private mi3() {
    }

    /* renamed from: G */
    public static li3 m13315G() {
        return (li3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static mi3 m13317I(uo3 uo3, mp3 mp3) {
        return (mi3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new mi3();
        } else {
            if (i2 == 4) {
                return new li3((ki3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo9257F() {
        return this.zze;
    }
}
