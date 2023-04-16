package com.google.android.gms.internal.ads;

@Deprecated
public final class wk3 extends aq3<wk3, vk3> implements lr3 {
    /* access modifiers changed from: private */
    public static final wk3 zzb;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        wk3 wk3 = new wk3();
        zzb = wk3;
        aq3.m6218v(wk3.class, wk3);
    }

    private wk3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new wk3();
        } else {
            if (i2 == 4) {
                return new vk3((uk3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: F */
    public final int mo11667F() {
        return this.zzg;
    }

    /* renamed from: H */
    public final String mo11668H() {
        return this.zzi;
    }

    /* renamed from: I */
    public final String mo11669I() {
        return this.zze;
    }

    /* renamed from: J */
    public final String mo11670J() {
        return this.zzf;
    }

    /* renamed from: K */
    public final boolean mo11671K() {
        return this.zzh;
    }
}
