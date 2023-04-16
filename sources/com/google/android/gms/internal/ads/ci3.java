package com.google.android.gms.internal.ads;

public final class ci3 extends aq3<ci3, bi3> implements lr3 {
    /* access modifiers changed from: private */
    public static final ci3 zzb;
    private fi3 zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        ci3 ci3 = new ci3();
        zzb = ci3;
        aq3.m6218v(ci3.class, ci3);
    }

    private ci3() {
    }

    /* renamed from: G */
    public static bi3 m7439G() {
        return (bi3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static ci3 m7441I(uo3 uo3, mp3 mp3) {
        return (ci3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* renamed from: K */
    static /* synthetic */ void m7442K(ci3 ci3, fi3 fi3) {
        fi3.getClass();
        ci3.zze = fi3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new ci3();
        } else {
            if (i2 == 4) {
                return new bi3((ai3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo6206F() {
        return this.zzf;
    }

    /* renamed from: J */
    public final fi3 mo6207J() {
        fi3 fi3 = this.zze;
        return fi3 == null ? fi3.m9179I() : fi3;
    }
}
