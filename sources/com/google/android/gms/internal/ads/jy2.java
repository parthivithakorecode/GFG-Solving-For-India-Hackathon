package com.google.android.gms.internal.ads;

import android.content.Context;

public final class jy2 {

    /* renamed from: a */
    private boolean f9299a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8552a(Context context) {
        uz2.m18276b(context, "Application Context cannot be null");
        if (!this.f9299a) {
            this.f9299a = true;
            hz2.m10831b().mo8046c(context);
            cz2.m7667a().mo6348c(context);
            sz2.m17045f(context);
            ez2.m8914b().mo7205c(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo8553b() {
        return this.f9299a;
    }
}
