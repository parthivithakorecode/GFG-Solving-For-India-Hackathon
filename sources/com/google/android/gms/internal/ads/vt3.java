package com.google.android.gms.internal.ads;

public final class vt3 extends aq3<vt3, ut3> implements lr3 {
    /* access modifiers changed from: private */
    public static final vt3 zzb;
    private int zze;
    private uo3 zzf;
    private uo3 zzg;
    private byte zzh = 2;

    static {
        vt3 vt3 = new vt3();
        zzb = vt3;
        aq3.m6218v(vt3.class, vt3);
    }

    private vt3() {
        uo3 uo3 = uo3.f15667g;
        this.zzf = uo3;
        this.zzg = uo3;
    }

    /* renamed from: F */
    public static ut3 m18673F() {
        return (ut3) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m18675H(vt3 vt3, uo3 uo3) {
        vt3.zze |= 1;
        vt3.zzf = uo3;
    }

    /* renamed from: I */
    static /* synthetic */ void m18676I(vt3 vt3, uo3 uo3) {
        vt3.zze |= 2;
        vt3.zzg = uo3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new vt3();
        } else {
            if (i2 == 4) {
                return new ut3((ot3) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzh = b;
            return null;
        }
    }
}
