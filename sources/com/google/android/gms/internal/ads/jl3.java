package com.google.android.gms.internal.ads;

public final class jl3 extends aq3<jl3, il3> implements lr3 {
    /* access modifiers changed from: private */
    public static final jl3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private nl3 zzf;

    static {
        jl3 jl3 = new jl3();
        zzb = jl3;
        aq3.m6218v(jl3.class, jl3);
    }

    private jl3() {
    }

    /* renamed from: G */
    public static il3 m11718G() {
        return (il3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static jl3 m11720I(uo3 uo3, mp3 mp3) {
        return (jl3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* renamed from: L */
    static /* synthetic */ void m11722L(jl3 jl3, nl3 nl3) {
        nl3.getClass();
        jl3.zzf = nl3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new jl3();
        } else {
            if (i2 == 4) {
                return new il3((hl3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo8490F() {
        return this.zze;
    }

    /* renamed from: J */
    public final nl3 mo8491J() {
        nl3 nl3 = this.zzf;
        return nl3 == null ? nl3.m13978G() : nl3;
    }
}
