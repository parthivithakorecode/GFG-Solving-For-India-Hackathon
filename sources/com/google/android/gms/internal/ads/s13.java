package com.google.android.gms.internal.ads;

public final class s13 extends aq3<s13, r13> implements lr3 {
    private static final gq3<Integer, Object> zzb = new p13();
    /* access modifiers changed from: private */
    public static final s13 zze;
    private int zzf;
    private fq3 zzg = aq3.m6211o();
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        s13 s13 = new s13();
        zze = s13;
        aq3.m6218v(s13.class, s13);
    }

    private s13() {
    }

    /* renamed from: F */
    public static r13 m16567F() {
        return (r13) zze.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m16569H(s13 s13, String str) {
        str.getClass();
        s13.zzf |= 1;
        s13.zzh = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m16570I(s13 s13, int i) {
        fq3 fq3 = s13.zzg;
        if (!fq3.mo6246c()) {
            s13.zzg = aq3.m6212p(fq3);
        }
        s13.zzg.mo5918N(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzf", "zzg", q13.f13019a, "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new s13();
        } else {
            if (i2 == 4) {
                return new r13((p13) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }
}
