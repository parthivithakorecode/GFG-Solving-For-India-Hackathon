package com.google.android.gms.internal.ads;

import android.content.Context;
import p048g2.C2637b;

final class h72 implements pk1 {

    /* renamed from: a */
    private final rr2 f8070a;

    /* renamed from: b */
    private final cf0 f8071b;

    /* renamed from: c */
    private final boolean f8072c;

    /* renamed from: d */
    private ob1 f8073d = null;

    h72(rr2 rr2, cf0 cf0, boolean z) {
        this.f8070a = rr2;
        this.f8071b = cf0;
        this.f8072c = z;
    }

    /* renamed from: a */
    public final void mo6852a(boolean z, Context context, jb1 jb1) {
        try {
            if (!(this.f8072c ? this.f8071b.mo5263m0(C2637b.m21358Z2(context)) : this.f8071b.mo5262h0(C2637b.m21358Z2(context)))) {
                throw new ok1("Adapter failed to show.");
            } else if (this.f8073d != null) {
                if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10497g1)).booleanValue() && this.f8070a.f13879V == 2) {
                    this.f8073d.zza();
                }
            }
        } catch (Throwable th) {
            throw new ok1(th);
        }
    }

    /* renamed from: b */
    public final void mo7858b(ob1 ob1) {
        this.f8073d = ob1;
    }
}
