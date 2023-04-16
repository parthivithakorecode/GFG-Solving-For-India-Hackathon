package com.google.android.gms.internal.ads;

public final class qk3 extends aq3<qk3, pk3> implements lr3 {
    /* access modifiers changed from: private */
    public static final qk3 zzb;
    /* access modifiers changed from: private */
    public String zze = "";
    /* access modifiers changed from: private */
    public uo3 zzf = uo3.f15667g;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        qk3 qk3 = new qk3();
        zzb = qk3;
        aq3.m6218v(qk3.class, qk3);
    }

    private qk3() {
    }

    /* renamed from: F */
    public static pk3 m15685F() {
        return (pk3) zzb.mo5400x();
    }

    /* renamed from: H */
    public static qk3 m15687H() {
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
            return aq3.m6217u(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new qk3();
        } else {
            if (i2 == 4) {
                return new pk3((ok3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final uo3 mo10318I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final String mo10319J() {
        return this.zze;
    }

    /* renamed from: M */
    public final int mo10320M() {
        int i = this.zzg;
        int i2 = 4;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = i != 3 ? i != 4 ? 0 : 6 : 5;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
