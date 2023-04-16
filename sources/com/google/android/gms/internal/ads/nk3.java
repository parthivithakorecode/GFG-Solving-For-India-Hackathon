package com.google.android.gms.internal.ads;

public final class nk3 extends aq3<nk3, mk3> implements lr3 {
    /* access modifiers changed from: private */
    public static final nk3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        nk3 nk3 = new nk3();
        zzb = nk3;
        aq3.m6218v(nk3.class, nk3);
    }

    private nk3() {
    }

    /* renamed from: G */
    public static mk3 m13963G() {
        return (mk3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static nk3 m13965I() {
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
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new nk3();
        } else {
            if (i2 == 4) {
                return new mk3((lk3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo9544F() {
        return this.zzf;
    }

    /* renamed from: K */
    public final int mo9545K() {
        int b = dk3.m7908b(this.zze);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
