package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zt */
public final class C2456zt extends aq3<C2456zt, C2419yt> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2456zt zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C2456zt ztVar = new C2456zt();
        zzb = ztVar;
        aq3.m6218v(C2456zt.class, ztVar);
    }

    private C2456zt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C2456zt();
        } else {
            if (i2 == 4) {
                return new C2419yt((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
