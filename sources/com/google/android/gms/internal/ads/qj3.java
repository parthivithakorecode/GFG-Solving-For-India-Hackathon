package com.google.android.gms.internal.ads;

public final class qj3 extends aq3<qj3, pj3> implements lr3 {
    /* access modifiers changed from: private */
    public static final qj3 zzb;
    private zj3 zze;
    private kj3 zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        qj3 qj3 = new qj3();
        zzb = qj3;
        aq3.m6218v(qj3.class, qj3);
    }

    private qj3() {
    }

    /* renamed from: G */
    public static pj3 m15654G() {
        return (pj3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static qj3 m15656I() {
        return zzb;
    }

    /* renamed from: K */
    static /* synthetic */ void m15657K(qj3 qj3, zj3 zj3) {
        zj3.getClass();
        qj3.zze = zj3;
    }

    /* renamed from: L */
    static /* synthetic */ void m15658L(qj3 qj3, kj3 kj3) {
        kj3.getClass();
        qj3.zzf = kj3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new qj3();
        } else {
            if (i2 == 4) {
                return new pj3((oj3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final kj3 mo10300F() {
        kj3 kj3 = this.zzf;
        return kj3 == null ? kj3.m12228H() : kj3;
    }

    /* renamed from: J */
    public final zj3 mo10301J() {
        zj3 zj3 = this.zze;
        return zj3 == null ? zj3.m20698H() : zj3;
    }

    /* renamed from: M */
    public final int mo10302M() {
        int i = this.zzg;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
