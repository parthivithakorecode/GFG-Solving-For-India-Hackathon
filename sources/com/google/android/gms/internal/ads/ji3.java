package com.google.android.gms.internal.ads;

public final class ji3 extends aq3<ji3, hi3> implements lr3 {
    /* access modifiers changed from: private */
    public static final ji3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public uo3 zzf = uo3.f15667g;

    static {
        ji3 ji3 = new ji3();
        zzb = ji3;
        aq3.m6218v(ji3.class, ji3);
    }

    private ji3() {
    }

    /* renamed from: G */
    public static hi3 m11661G() {
        return (hi3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static ji3 m11663I(uo3 uo3, mp3 mp3) {
        return (ji3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new ji3();
        } else {
            if (i2 == 4) {
                return new hi3((gi3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo8468F() {
        return this.zze;
    }

    /* renamed from: J */
    public final uo3 mo8469J() {
        return this.zzf;
    }
}
