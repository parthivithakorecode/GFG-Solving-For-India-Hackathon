package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ws */
public final class C2344ws extends aq3<C2344ws, C2306vs> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2344ws zzb;
    private int zze;
    private C2195ss zzf;
    private jq3<C2382xt> zzg = aq3.m6214r();
    private int zzh;
    private C2456zt zzi;

    static {
        C2344ws wsVar = new C2344ws();
        zzb = wsVar;
        aq3.m6218v(C2344ws.class, wsVar);
    }

    private C2344ws() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", C2382xt.class, "zzh", C2010ns.f11648a, "zzi"});
        } else if (i2 == 3) {
            return new C2344ws();
        } else {
            if (i2 == 4) {
                return new C2306vs((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
