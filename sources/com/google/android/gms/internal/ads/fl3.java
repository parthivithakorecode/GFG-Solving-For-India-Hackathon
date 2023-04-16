package com.google.android.gms.internal.ads;

public final class fl3 extends aq3<fl3, el3> implements lr3 {
    /* access modifiers changed from: private */
    public static final fl3 zzb;
    private String zze = "";
    private int zzf;
    /* access modifiers changed from: private */
    public int zzg;
    /* access modifiers changed from: private */
    public int zzh;

    static {
        fl3 fl3 = new fl3();
        zzb = fl3;
        aq3.m6218v(fl3.class, fl3);
    }

    private fl3() {
    }

    /* renamed from: F */
    public static el3 m9226F() {
        return (el3) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m9228H(fl3 fl3, String str) {
        str.getClass();
        fl3.zze = str;
    }

    /* renamed from: K */
    static /* synthetic */ void m9231K(fl3 fl3, int i) {
        if (i != 1) {
            fl3.zzf = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new fl3();
        } else {
            if (i2 == 4) {
                return new el3((cl3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
