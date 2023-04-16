package com.google.android.gms.internal.ads;

public final class bj3 extends aq3<bj3, aj3> implements lr3 {
    /* access modifiers changed from: private */
    public static final bj3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public uo3 zzf = uo3.f15667g;

    static {
        bj3 bj3 = new bj3();
        zzb = bj3;
        aq3.m6218v(bj3.class, bj3);
    }

    private bj3() {
    }

    /* renamed from: G */
    public static aj3 m6931G() {
        return (aj3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static bj3 m6933I(uo3 uo3, mp3 mp3) {
        return (bj3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new bj3();
        } else {
            if (i2 == 4) {
                return new aj3((zi3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo5868F() {
        return this.zze;
    }

    /* renamed from: J */
    public final uo3 mo5869J() {
        return this.zzf;
    }
}
