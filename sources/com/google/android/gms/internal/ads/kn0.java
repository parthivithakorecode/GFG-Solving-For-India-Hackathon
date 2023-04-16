package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import p033e1.C2538a;
import p160x1.C4285g;
import p160x1.C4286h;

final class kn0 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Context f9573f;

    /* renamed from: g */
    final /* synthetic */ bp0 f9574g;

    kn0(ln0 ln0, Context context, bp0 bp0) {
        this.f9573f = context;
        this.f9574g = bp0;
    }

    public final void run() {
        try {
            this.f9574g.mo5907e(C2538a.m21156b(this.f9573f));
        } catch (IOException | IllegalStateException | C4285g | C4286h e) {
            this.f9574g.mo5908f(e);
            io0.m11129e("Exception while getting advertising Id info", e);
        }
    }
}
