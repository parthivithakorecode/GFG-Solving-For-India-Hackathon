package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x7 */
public final class C2360x7 extends aq3<C2360x7, C2322w7> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2360x7 zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C2360x7 x7Var = new C2360x7();
        zzb = x7Var;
        aq3.m6218v(C2360x7.class, x7Var);
    }

    private C2360x7() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C2360x7();
        } else {
            if (i2 == 4) {
                return new C2322w7((C2248u7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
