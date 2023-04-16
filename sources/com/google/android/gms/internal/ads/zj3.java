package com.google.android.gms.internal.ads;

public final class zj3 extends aq3<zj3, yj3> implements lr3 {
    /* access modifiers changed from: private */
    public static final zj3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public uo3 zzg = uo3.f15667g;

    static {
        zj3 zj3 = new zj3();
        zzb = zj3;
        aq3.m6218v(zj3.class, zj3);
    }

    private zj3() {
    }

    /* renamed from: F */
    public static yj3 m20696F() {
        return (yj3) zzb.mo5400x();
    }

    /* renamed from: H */
    public static zj3 m20698H() {
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
            return aq3.m6217u(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zj3();
        } else {
            if (i2 == 4) {
                return new yj3((xj3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final uo3 mo12231I() {
        return this.zzg;
    }

    /* renamed from: K */
    public final int mo12232K() {
        int i = this.zze;
        int i2 = 5;
        if (i == 0) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 4;
        } else if (i != 3) {
            i2 = i != 4 ? i != 5 ? 0 : 7 : 6;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* renamed from: L */
    public final int mo12233L() {
        int b = dk3.m7908b(this.zzf);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
