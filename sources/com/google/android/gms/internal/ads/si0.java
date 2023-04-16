package com.google.android.gms.internal.ads;

import java.io.OutputStream;

public final /* synthetic */ class si0 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ OutputStream f14458f;

    /* renamed from: g */
    public final /* synthetic */ byte[] f14459g;

    public /* synthetic */ si0(OutputStream outputStream, byte[] bArr) {
        this.f14458f = outputStream;
        this.f14459g = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            java.io.OutputStream r0 = r5.f14458f
            byte[] r1 = r5.f14459g
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.ti0> r2 = com.google.android.gms.internal.ads.ti0.CREATOR
            r2 = 0
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x001f }
            r3.<init>(r0)     // Catch:{ IOException -> 0x001f }
            int r2 = r1.length     // Catch:{ IOException -> 0x001a, all -> 0x0017 }
            r3.writeInt(r2)     // Catch:{ IOException -> 0x001a, all -> 0x0017 }
            r3.write(r1)     // Catch:{ IOException -> 0x001a, all -> 0x0017 }
            p034e2.C2553j.m21202a(r3)
            return
        L_0x0017:
            r1 = move-exception
            r2 = r3
            goto L_0x0038
        L_0x001a:
            r1 = move-exception
            r2 = r3
            goto L_0x0020
        L_0x001d:
            r1 = move-exception
            goto L_0x0038
        L_0x001f:
            r1 = move-exception
        L_0x0020:
            java.lang.String r3 = "Error transporting the ad response"
            com.google.android.gms.internal.ads.io0.m11129e(r3, r1)     // Catch:{ all -> 0x001d }
            com.google.android.gms.internal.ads.tn0 r3 = p054h1.C2694t.m21607p()     // Catch:{ all -> 0x001d }
            java.lang.String r4 = "LargeParcelTeleporter.pipeData.1"
            r3.mo11034s(r1, r4)     // Catch:{ all -> 0x001d }
            if (r2 != 0) goto L_0x0034
            p034e2.C2553j.m21202a(r0)
            return
        L_0x0034:
            p034e2.C2553j.m21202a(r2)
            return
        L_0x0038:
            if (r2 != 0) goto L_0x003e
            p034e2.C2553j.m21202a(r0)
            goto L_0x0041
        L_0x003e:
            p034e2.C2553j.m21202a(r2)
        L_0x0041:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.si0.run():void");
    }
}
