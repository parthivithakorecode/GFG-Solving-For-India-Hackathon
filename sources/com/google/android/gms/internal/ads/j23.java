package com.google.android.gms.internal.ads;

import java.io.File;

public final class j23 {

    /* renamed from: a */
    private final C2403yd f8956a;

    /* renamed from: b */
    private final File f8957b;

    /* renamed from: c */
    private final File f8958c;

    /* renamed from: d */
    private final File f8959d;

    /* renamed from: e */
    private byte[] f8960e;

    public j23(C2403yd ydVar, File file, File file2, File file3) {
        this.f8956a = ydVar;
        this.f8957b = file;
        this.f8958c = file3;
        this.f8959d = file2;
    }

    /* renamed from: a */
    public final C2403yd mo8333a() {
        return this.f8956a;
    }

    /* renamed from: b */
    public final File mo8334b() {
        return this.f8958c;
    }

    /* renamed from: c */
    public final File mo8335c() {
        return this.f8957b;
    }

    /* renamed from: d */
    public final boolean mo8336d(long j) {
        return this.f8956a.mo11991G() - (System.currentTimeMillis() / 1000) < 3600;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo8337e() {
        /*
            r3 = this;
            byte[] r0 = r3.f8960e
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.io.File r0 = r3.f8959d
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0020, all -> 0x001b }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0020, all -> 0x001b }
            com.google.android.gms.internal.ads.uo3 r0 = com.google.android.gms.internal.ads.uo3.m17971L(r2)     // Catch:{ IOException -> 0x0021, all -> 0x0018 }
            byte[] r0 = r0.mo11272l()     // Catch:{ IOException -> 0x0021, all -> 0x0018 }
            p034e2.C2553j.m21202a(r2)
            goto L_0x0025
        L_0x0018:
            r0 = move-exception
            r1 = r2
            goto L_0x001c
        L_0x001b:
            r0 = move-exception
        L_0x001c:
            p034e2.C2553j.m21202a(r1)
            throw r0
        L_0x0020:
            r2 = r1
        L_0x0021:
            p034e2.C2553j.m21202a(r2)
            r0 = r1
        L_0x0025:
            r3.f8960e = r0
        L_0x0027:
            byte[] r0 = r3.f8960e
            if (r0 != 0) goto L_0x002c
            return r1
        L_0x002c:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j23.mo8337e():byte[]");
    }
}
