package com.google.android.gms.internal.ads;

public final class mu3 extends aq3<mu3, lu3> implements lr3 {
    /* access modifiers changed from: private */
    public static final mu3 zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zt3 zzh;
    private du3 zzi;
    private int zzj;
    private fq3 zzk = aq3.m6211o();
    private String zzl = "";
    private int zzm;
    private jq3<String> zzn = aq3.m6214r();
    private byte zzo = 2;

    static {
        mu3 mu3 = new mu3();
        zzb = mu3;
        aq3.m6218v(mu3.class, mu3);
    }

    private mu3() {
    }

    /* renamed from: G */
    public static lu3 m13486G() {
        return (lu3) zzb.mo5400x();
    }

    /* renamed from: J */
    static /* synthetic */ void m13488J(mu3 mu3, int i) {
        mu3.zze |= 1;
        mu3.zzf = i;
    }

    /* renamed from: K */
    static /* synthetic */ void m13489K(mu3 mu3, String str) {
        str.getClass();
        mu3.zze |= 2;
        mu3.zzg = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m13490L(mu3 mu3, zt3 zt3) {
        zt3.getClass();
        mu3.zzh = zt3;
        mu3.zze |= 4;
    }

    /* renamed from: M */
    static /* synthetic */ void m13491M(mu3 mu3, String str) {
        str.getClass();
        jq3<String> jq3 = mu3.zzn;
        if (!jq3.mo6246c()) {
            mu3.zzn = aq3.m6215s(jq3);
        }
        mu3.zzn.add(str);
    }

    /* renamed from: N */
    static /* synthetic */ void m13492N(mu3 mu3, int i) {
        mu3.zzm = i - 1;
        mu3.zze |= 64;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzo);
        }
        byte b = 1;
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", ju3.f9268a, "zzn"});
        } else if (i2 == 3) {
            return new mu3();
        } else {
            if (i2 == 4) {
                return new lu3((ot3) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzo = b;
            return null;
        }
    }

    /* renamed from: F */
    public final int mo9365F() {
        return this.zzn.size();
    }

    /* renamed from: I */
    public final String mo9366I() {
        return this.zzg;
    }
}
