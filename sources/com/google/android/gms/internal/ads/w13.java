package com.google.android.gms.internal.ads;

public final class w13 extends aq3<w13, u13> implements lr3 {
    /* access modifiers changed from: private */
    public static final w13 zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private s13 zzi;

    static {
        w13 w13 = new w13();
        zzb = w13;
        aq3.m6218v(w13.class, w13);
    }

    private w13() {
    }

    /* renamed from: F */
    public static u13 m18818F() {
        return (u13) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m18820H(w13 w13, String str) {
        str.getClass();
        w13.zze |= 2;
        w13.zzg = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m18821I(w13 w13, s13 s13) {
        s13.getClass();
        w13.zzi = s13;
        w13.zze |= 8;
    }

    /* renamed from: J */
    static /* synthetic */ void m18822J(w13 w13, int i) {
        w13.zzf = 1;
        w13.zze = 1 | w13.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", v13.f15853a, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new w13();
        } else {
            if (i2 == 4) {
                return new u13((t13) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
