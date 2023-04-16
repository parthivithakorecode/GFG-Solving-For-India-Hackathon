package com.google.android.gms.internal.ads;

public final class tx2 extends aq3<tx2, sx2> implements lr3 {
    /* access modifiers changed from: private */
    public static final tx2 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public boolean zzf;
    /* access modifiers changed from: private */
    public long zzg;
    /* access modifiers changed from: private */
    public int zzh;
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    /* access modifiers changed from: private */
    public int zzl;
    private int zzm;
    /* access modifiers changed from: private */
    public int zzn;
    /* access modifiers changed from: private */
    public long zzo;
    private int zzp;
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    /* access modifiers changed from: private */
    public String zzt = "";
    private String zzu = "";

    static {
        tx2 tx2 = new tx2();
        zzb = tx2;
        aq3.m6218v(tx2.class, tx2);
    }

    private tx2() {
    }

    /* renamed from: F */
    public static sx2 m17552F() {
        return (sx2) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m17554H(tx2 tx2, String str) {
        str.getClass();
        tx2.zzi = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m17555I(tx2 tx2, String str) {
        str.getClass();
        tx2.zzj = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m17556J(tx2 tx2, String str) {
        str.getClass();
        tx2.zzk = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m17560N(tx2 tx2, String str) {
        str.getClass();
        tx2.zzq = str;
    }

    /* renamed from: O */
    static /* synthetic */ void m17561O(tx2 tx2, String str) {
        str.getClass();
        tx2.zzr = str;
    }

    /* renamed from: P */
    static /* synthetic */ void m17562P(tx2 tx2, String str) {
        str.getClass();
        tx2.zzs = str;
    }

    /* renamed from: S */
    static /* synthetic */ void m17565S(tx2 tx2, String str) {
        str.getClass();
        tx2.zzu = str;
    }

    /* renamed from: V */
    static /* synthetic */ void m17568V(tx2 tx2, int i) {
        if (i != 1) {
            tx2.zzm = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: W */
    static /* synthetic */ void m17569W(tx2 tx2, int i) {
        if (i != 1) {
            tx2.zzp = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        } else if (i2 == 3) {
            return new tx2();
        } else {
            if (i2 == 4) {
                return new sx2((rx2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
