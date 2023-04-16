package com.google.android.gms.internal.ads;

public final class kj3 extends aq3<kj3, ij3> implements lr3 {
    /* access modifiers changed from: private */
    public static final kj3 zzb;
    private tk3 zze;

    static {
        kj3 kj3 = new kj3();
        zzb = kj3;
        aq3.m6218v(kj3.class, kj3);
    }

    private kj3() {
    }

    /* renamed from: F */
    public static ij3 m12226F() {
        return (ij3) zzb.mo5400x();
    }

    /* renamed from: H */
    public static kj3 m12228H() {
        return zzb;
    }

    /* renamed from: J */
    static /* synthetic */ void m12229J(kj3 kj3, tk3 tk3) {
        tk3.getClass();
        kj3.zze = tk3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new kj3();
        } else {
            if (i2 == 4) {
                return new ij3((hj3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final tk3 mo8684I() {
        tk3 tk3 = this.zze;
        return tk3 == null ? tk3.m17325H() : tk3;
    }
}
