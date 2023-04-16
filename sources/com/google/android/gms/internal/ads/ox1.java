package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p048g2.C2637b;

public final class ox1 implements ww1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f12235a;

    /* renamed from: b */
    private final String f12236b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final dx1 f12237c;

    /* renamed from: d */
    private final ir2 f12238d;

    ox1(long j, Context context, dx1 dx1, bw0 bw0, String str) {
        this.f12235a = j;
        this.f12236b = str;
        this.f12237c = dx1;
        kr2 B = bw0.mo5594B();
        B.mo8777a(context);
        B.mo8778b(str);
        this.f12238d = B.mo8779c().zza();
    }

    /* renamed from: a */
    public final void mo8811a(C1902kv kvVar) {
        try {
            this.f12238d.mo6487D2(kvVar, new mx1(this));
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo8812c() {
        try {
            this.f12238d.mo6493y4(new nx1(this));
            this.f12238d.mo6485B1(C2637b.m21358Z2(null));
        } catch (RemoteException e) {
            io0.m11133i("#007 Could not call remote method.", e);
        }
    }

    public final void zza() {
    }
}
