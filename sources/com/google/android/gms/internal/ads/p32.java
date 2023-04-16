package com.google.android.gms.internal.ads;

import p069j1.C3208t1;

public final class p32 implements lc1, ya1 {

    /* renamed from: h */
    private static final Object f12487h = new Object();

    /* renamed from: i */
    private static int f12488i;

    /* renamed from: f */
    private final C3208t1 f12489f;

    /* renamed from: g */
    private final y32 f12490g;

    public p32(y32 y32, C3208t1 t1Var) {
        this.f12490g = y32;
        this.f12489f = t1Var;
    }

    /* renamed from: a */
    private final void m14810a(boolean z) {
        int i;
        int intValue;
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10270E4)).booleanValue() && !this.f12489f.mo14078J()) {
            Object obj = f12487h;
            synchronized (obj) {
                i = f12488i;
                intValue = ((Integer) C2199sw.m17001c().mo8579b(m10.f10278F4)).intValue();
            }
            if (i < intValue) {
                this.f12490g.mo11960e(z);
                synchronized (obj) {
                    f12488i++;
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo7808d(C1605cv cvVar) {
        m14810a(false);
    }

    /* renamed from: m */
    public final void mo8445m() {
        m14810a(true);
    }
}
