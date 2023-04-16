package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import p003a2.C0052c;

final class c90 implements C0052c.C0053a {

    /* renamed from: a */
    final /* synthetic */ bp0 f5338a;

    /* renamed from: b */
    final /* synthetic */ e90 f5339b;

    c90(e90 e90, bp0 bp0) {
        this.f5339b = e90;
        this.f5338a = bp0;
    }

    /* renamed from: C0 */
    public final void mo139C0(Bundle bundle) {
        try {
            this.f5338a.mo5907e(this.f5339b.f6123a.mo10256i0());
        } catch (DeadObjectException e) {
            this.f5338a.mo5908f(e);
        }
    }

    /* renamed from: D */
    public final void mo140D(int i) {
        bp0 bp0 = this.f5338a;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        bp0.mo5908f(new RuntimeException(sb.toString()));
    }
}
