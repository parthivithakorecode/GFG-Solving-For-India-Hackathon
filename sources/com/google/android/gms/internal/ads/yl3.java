package com.google.android.gms.internal.ads;

import java.util.List;

@Deprecated
public final class yl3 extends aq3<yl3, xl3> implements lr3 {
    /* access modifiers changed from: private */
    public static final yl3 zzb;
    private String zze = "";
    private jq3<wk3> zzf = aq3.m6214r();

    static {
        yl3 yl3 = new yl3();
        zzb = yl3;
        aq3.m6218v(yl3.class, yl3);
    }

    private yl3() {
    }

    /* renamed from: G */
    public static yl3 m20076G() {
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
            return aq3.m6217u(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", wk3.class});
        } else if (i2 == 3) {
            return new yl3();
        } else {
            if (i2 == 4) {
                return new xl3((wl3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: H */
    public final List<wk3> mo12049H() {
        return this.zzf;
    }
}
