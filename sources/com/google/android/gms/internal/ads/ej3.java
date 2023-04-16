package com.google.android.gms.internal.ads;

public final class ej3 extends aq3<ej3, dj3> implements lr3 {
    /* access modifiers changed from: private */
    public static final ej3 zzb;

    static {
        ej3 ej3 = new ej3();
        zzb = ej3;
        aq3.m6218v(ej3.class, ej3);
    }

    private ej3() {
    }

    /* renamed from: G */
    public static ej3 m8578G() {
        return zzb;
    }

    /* renamed from: H */
    public static ej3 m8579H(uo3 uo3, mp3 mp3) {
        return (ej3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new ej3();
        }
        if (i2 == 4) {
            return new dj3((cj3) null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
