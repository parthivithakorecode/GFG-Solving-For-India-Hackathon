package com.google.android.gms.internal.ads;

public final class tl3 extends aq3<tl3, sl3> implements lr3 {
    /* access modifiers changed from: private */
    public static final tl3 zzb;
    private String zze = "";
    private tk3 zzf;

    static {
        tl3 tl3 = new tl3();
        zzb = tl3;
        aq3.m6218v(tl3.class, tl3);
    }

    private tl3() {
    }

    /* renamed from: H */
    public static tl3 m17342H() {
        return zzb;
    }

    /* renamed from: I */
    public static tl3 m17343I(uo3 uo3, mp3 mp3) {
        return (tl3) aq3.m6207C(zzb, uo3, mp3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new tl3();
        } else {
            if (i2 == 4) {
                return new sl3((rl3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final tk3 mo11016F() {
        tk3 tk3 = this.zzf;
        return tk3 == null ? tk3.m17325H() : tk3;
    }

    /* renamed from: J */
    public final String mo11017J() {
        return this.zze;
    }

    /* renamed from: K */
    public final boolean mo11018K() {
        return this.zzf != null;
    }
}
