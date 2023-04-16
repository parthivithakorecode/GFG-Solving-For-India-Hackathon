package com.google.android.gms.internal.ads;

public final class gh3 extends aq3<gh3, fh3> implements lr3 {
    /* access modifiers changed from: private */
    public static final gh3 zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        gh3 gh3 = new gh3();
        zzb = gh3;
        aq3.m6218v(gh3.class, gh3);
    }

    private gh3() {
    }

    /* renamed from: G */
    public static fh3 m9786G() {
        return (fh3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static gh3 m9788I() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new gh3();
        } else {
            if (i2 == 4) {
                return new fh3((eh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo7640F() {
        return this.zze;
    }
}
