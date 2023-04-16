package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j9 */
public final class C1843j9 extends aq3<C1843j9, C1806i9> implements lr3 {
    /* access modifiers changed from: private */
    public static final C1843j9 zzb;
    private int zze;
    private long zzf;
    private String zzg = "";
    private uo3 zzh = uo3.f15667g;

    static {
        C1843j9 j9Var = new C1843j9();
        zzb = j9Var;
        aq3.m6218v(C1843j9.class, j9Var);
    }

    private C1843j9() {
    }

    /* renamed from: H */
    public static C1843j9 m11514H() {
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
            return aq3.m6217u(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C1843j9();
        } else {
            if (i2 == 4) {
                return new C1806i9((C1805i8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final long mo8422F() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean mo8423I() {
        return (this.zze & 1) != 0;
    }
}
