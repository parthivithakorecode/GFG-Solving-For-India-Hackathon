package com.google.android.gms.internal.ads;

public final class fi3 extends aq3<fi3, ei3> implements lr3 {
    /* access modifiers changed from: private */
    public static final fi3 zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        fi3 fi3 = new fi3();
        zzb = fi3;
        aq3.m6218v(fi3.class, fi3);
    }

    private fi3() {
    }

    /* renamed from: G */
    public static ei3 m9177G() {
        return (ei3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static fi3 m9179I() {
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
            return new fi3();
        } else {
            if (i2 == 4) {
                return new ei3((di3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo7346F() {
        return this.zze;
    }
}
