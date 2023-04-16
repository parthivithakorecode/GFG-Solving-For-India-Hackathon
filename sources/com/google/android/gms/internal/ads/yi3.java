package com.google.android.gms.internal.ads;

public final class yi3 extends aq3<yi3, xi3> implements lr3 {
    /* access modifiers changed from: private */
    public static final yi3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        yi3 yi3 = new yi3();
        zzb = yi3;
        aq3.m6218v(yi3.class, yi3);
    }

    private yi3() {
    }

    /* renamed from: G */
    public static xi3 m20042G() {
        return (xi3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static yi3 m20044I(uo3 uo3, mp3 mp3) {
        return (yi3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new yi3();
        } else {
            if (i2 == 4) {
                return new xi3((wi3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo12036F() {
        return this.zze;
    }
}
