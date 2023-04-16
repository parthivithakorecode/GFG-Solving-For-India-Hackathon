package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
public final class sb0 {

    /* renamed from: a */
    private final Object f14385a = new Object();

    /* renamed from: b */
    private final Object f14386b = new Object();
    @GuardedBy("lockClient")

    /* renamed from: c */
    private cc0 f14387c;
    @GuardedBy("lockService")

    /* renamed from: d */
    private cc0 f14388d;

    /* renamed from: c */
    private static final Context m16710c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: a */
    public final cc0 mo10758a(Context context, po0 po0) {
        cc0 cc0;
        synchronized (this.f14385a) {
            if (this.f14387c == null) {
                this.f14387c = new cc0(m16710c(context), po0, (String) C2199sw.m17001c().mo8579b(m10.f10441a));
            }
            cc0 = this.f14387c;
        }
        return cc0;
    }

    /* renamed from: b */
    public final cc0 mo10759b(Context context, po0 po0) {
        cc0 cc0;
        synchronized (this.f14386b) {
            if (this.f14388d == null) {
                this.f14388d = new cc0(m16710c(context), po0, k30.f9376b.mo9928e());
            }
            cc0 = this.f14388d;
        }
        return cc0;
    }
}
