package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ur */
public final class C2268ur extends aq3<C2268ur, C2046or> implements lr3 {
    /* access modifiers changed from: private */
    public static final C2268ur zzb;
    private jq3<C2009nr> zze = aq3.m6214r();

    static {
        C2268ur urVar = new C2268ur();
        zzb = urVar;
        aq3.m6218v(C2268ur.class, urVar);
    }

    private C2268ur() {
    }

    /* renamed from: F */
    public static C2046or m18022F() {
        return (C2046or) zzb.mo5400x();
    }

    /* renamed from: H */
    static /* synthetic */ void m18024H(C2268ur urVar, C2009nr nrVar) {
        nrVar.getClass();
        jq3<C2009nr> jq3 = urVar.zze;
        if (!jq3.mo6246c()) {
            urVar.zze = aq3.m6215s(jq3);
        }
        urVar.zze.add(nrVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo5181E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return aq3.m6217u(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C2009nr.class});
        } else if (i2 == 3) {
            return new C2268ur();
        } else {
            if (i2 == 4) {
                return new C2046or((C1750gr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
