package com.google.android.gms.internal.ads;

public final class nl3 extends aq3<nl3, ml3> implements lr3 {
    /* access modifiers changed from: private */
    public static final nl3 zzb;
    private String zze = "";

    static {
        nl3 nl3 = new nl3();
        zzb = nl3;
        aq3.m6218v(nl3.class, nl3);
    }

    private nl3() {
    }

    /* renamed from: G */
    public static nl3 m13978G() {
        return zzb;
    }

    /* renamed from: H */
    public static nl3 m13979H(uo3 uo3, mp3 mp3) {
        return (nl3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new nl3();
        } else {
            if (i2 == 4) {
                return new ml3((kl3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final String mo9550I() {
        return this.zze;
    }
}
