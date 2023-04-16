package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;

/* renamed from: com.google.android.gms.internal.ads.a7 */
final class C1507a7 extends FilterInputStream {

    /* renamed from: f */
    private final HttpURLConnection f3995f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C1507a7(java.net.HttpURLConnection r2) {
        /*
            r1 = this;
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ IOException -> 0x0005 }
            goto L_0x0009
        L_0x0005:
            java.io.InputStream r0 = r2.getErrorStream()
        L_0x0009:
            r1.<init>(r0)
            r1.f3995f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1507a7.<init>(java.net.HttpURLConnection):void");
    }

    public final void close() {
        super.close();
        this.f3995f.disconnect();
    }
}
