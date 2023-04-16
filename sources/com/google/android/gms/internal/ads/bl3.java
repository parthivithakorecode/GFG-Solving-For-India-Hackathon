package com.google.android.gms.internal.ads;

import java.util.List;

public final class bl3 extends aq3<bl3, yk3> implements lr3 {
    /* access modifiers changed from: private */
    public static final bl3 zzb;
    private int zze;
    private jq3<al3> zzf = aq3.m6214r();

    static {
        bl3 bl3 = new bl3();
        zzb = bl3;
        aq3.m6218v(bl3.class, bl3);
    }

    private bl3() {
    }

    /* renamed from: I */
    public static bl3 m6957I(byte[] bArr, mp3 mp3) {
        return (bl3) aq3.m6208D(zzb, bArr, mp3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", al3.class});
        } else if (i2 == 3) {
            return new bl3();
        } else {
            if (i2 == 4) {
                return new yk3((xk3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo5879F() {
        return this.zzf.size();
    }

    /* renamed from: G */
    public final int mo5880G() {
        return this.zze;
    }

    /* renamed from: J */
    public final List<al3> mo5881J() {
        return this.zzf;
    }
}
