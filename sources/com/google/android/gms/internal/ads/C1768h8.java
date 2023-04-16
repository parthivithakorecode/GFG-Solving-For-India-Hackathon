package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.h8 */
public final class C1768h8 extends aq3<C1768h8, C1731g8> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1768h8 zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        C1768h8 h8Var = new C1768h8();
        zzb = h8Var;
        aq3.m6218v(C1768h8.class, h8Var);
    }

    private C1768h8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C1768h8();
        } else {
            if (i2 == 4) {
                return new C1731g8((C1508a8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
