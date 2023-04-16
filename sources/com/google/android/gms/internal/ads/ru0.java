package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import javax.annotation.ParametersAreNonnullByDefault;
import p054h1.C2675a;
import p054h1.C2686l;

@ParametersAreNonnullByDefault
public final class ru0 {
    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.eu0, java.lang.Object] */
    /* renamed from: a */
    public static final eu0 m16446a(Context context, vv0 vv0, String str, boolean z, boolean z2, C1734gb gbVar, m20 m20, po0 po0, b20 b20, C2686l lVar, C2675a aVar, C1527ar arVar, rr2 rr2, ur2 ur2) {
        StrictMode.ThreadPolicy threadPolicy;
        m10.m13007c(context);
        try {
            nu0 nu0 = new nu0(context, vv0, str, z, z2, gbVar, m20, po0, (b20) null, lVar, aVar, arVar, rr2, ur2);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ? zza = nu0.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza;
        } catch (Throwable th) {
            throw new qu0("Webview initialization failed.", th);
        }
    }
}
