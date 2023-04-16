package com.google.android.gms.internal.ads;

public final class vi3 extends aq3<vi3, ui3> implements lr3 {
    /* access modifiers changed from: private */
    public static final vi3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public uo3 zzf = uo3.f15667g;

    static {
        vi3 vi3 = new vi3();
        zzb = vi3;
        aq3.m6218v(vi3.class, vi3);
    }

    private vi3() {
    }

    /* renamed from: G */
    public static ui3 m18566G() {
        return (ui3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static vi3 m18568I(uo3 uo3, mp3 mp3) {
        return (vi3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new vi3();
        } else {
            if (i2 == 4) {
                return new ui3((ti3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo11480F() {
        return this.zze;
    }

    /* renamed from: J */
    public final uo3 mo11481J() {
        return this.zzf;
    }
}
