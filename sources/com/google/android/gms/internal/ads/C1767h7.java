package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.gms.internal.ads.h7 */
final class C1767h7 implements C2321w6 {

    /* renamed from: a */
    private File f8067a = null;

    /* renamed from: b */
    final /* synthetic */ Context f8068b;

    C1767h7(Context context) {
        this.f8068b = context;
    }

    public final File zza() {
        if (this.f8067a == null) {
            this.f8067a = new File(this.f8068b.getCacheDir(), "volley");
        }
        return this.f8067a;
    }
}
