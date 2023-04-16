package com.google.android.gms.internal.ads;

public final class bm3 extends aq3<bm3, am3> implements lr3 {
    /* access modifiers changed from: private */
    public static final bm3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public uo3 zzf = uo3.f15667g;

    static {
        bm3 bm3 = new bm3();
        zzb = bm3;
        aq3.m6218v(bm3.class, bm3);
    }

    private bm3() {
    }

    /* renamed from: G */
    public static am3 m6965G() {
        return (am3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static bm3 m6967I(uo3 uo3, mp3 mp3) {
        return (bm3) aq3.m6207C(zzb, uo3, mp3);
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
            return new bm3();
        } else {
            if (i2 == 4) {
                return new am3((zl3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo5885F() {
        return this.zze;
    }

    /* renamed from: J */
    public final uo3 mo5886J() {
        return this.zzf;
    }
}
