package com.google.android.gms.internal.ads;

public final class si3 extends aq3<si3, ri3> implements lr3 {
    /* access modifiers changed from: private */
    public static final si3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        si3 si3 = new si3();
        zzb = si3;
        aq3.m6218v(si3.class, si3);
    }

    private si3() {
    }

    /* renamed from: G */
    public static ri3 m16862G() {
        return (ri3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static si3 m16864I(uo3 uo3, mp3 mp3) {
        return (si3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        } else if (i2 == 3) {
            return new si3();
        } else {
            if (i2 == 4) {
                return new ri3((qi3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo10799F() {
        return this.zze;
    }
}
