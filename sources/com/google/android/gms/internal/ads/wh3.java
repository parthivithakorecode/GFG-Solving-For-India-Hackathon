package com.google.android.gms.internal.ads;

public final class wh3 extends aq3<wh3, vh3> implements lr3 {
    /* access modifiers changed from: private */
    public static final wh3 zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        wh3 wh3 = new wh3();
        zzb = wh3;
        aq3.m6218v(wh3.class, wh3);
    }

    private wh3() {
    }

    /* renamed from: G */
    public static vh3 m18990G() {
        return (vh3) zzb.mo5400x();
    }

    /* renamed from: I */
    public static wh3 m18992I() {
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
            return aq3.m6217u(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new wh3();
        } else {
            if (i2 == 4) {
                return new vh3((uh3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo11655F() {
        return this.zze;
    }
}
