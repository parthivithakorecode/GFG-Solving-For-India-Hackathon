package com.google.android.gms.internal.ads;

import android.os.HandlerThread;

public final class i34 implements w34 {

    /* renamed from: b */
    private final c53<HandlerThread> f8528b;

    /* renamed from: c */
    private final c53<HandlerThread> f8529c;

    public i34(int i, boolean z) {
        g34 g34 = new g34(i);
        h34 h34 = new h34(i);
        this.f8528b = g34;
        this.f8529c = h34;
    }

    /* renamed from: a */
    static /* synthetic */ HandlerThread m10915a(int i) {
        return new HandlerThread(k34.m11988n(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    /* renamed from: b */
    static /* synthetic */ HandlerThread m10916b(int i) {
        return new HandlerThread(k34.m11988n(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.k34 mo8071c(com.google.android.gms.internal.ads.v34 r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.z34 r0 = r11.f15899a
            java.lang.String r0 = r0.f18012a
            r1 = 0
            java.lang.String r2 = "createCodec:"
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0054 }
            int r4 = r3.length()     // Catch:{ Exception -> 0x0054 }
            if (r4 == 0) goto L_0x0016
            java.lang.String r2 = r2.concat(r3)     // Catch:{ Exception -> 0x0054 }
            goto L_0x001c
        L_0x0016:
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0054 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0054 }
            r2 = r3
        L_0x001c:
            com.google.android.gms.internal.ads.lz2.m12992a(r2)     // Catch:{ Exception -> 0x0054 }
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x0054 }
            com.google.android.gms.internal.ads.k34 r9 = new com.google.android.gms.internal.ads.k34     // Catch:{ Exception -> 0x0052 }
            com.google.android.gms.internal.ads.c53<android.os.HandlerThread> r2 = r10.f8528b     // Catch:{ Exception -> 0x0052 }
            com.google.android.gms.internal.ads.g34 r2 = (com.google.android.gms.internal.ads.g34) r2     // Catch:{ Exception -> 0x0052 }
            int r2 = r2.f7263f     // Catch:{ Exception -> 0x0052 }
            android.os.HandlerThread r5 = m10915a(r2)     // Catch:{ Exception -> 0x0052 }
            com.google.android.gms.internal.ads.c53<android.os.HandlerThread> r2 = r10.f8529c     // Catch:{ Exception -> 0x0052 }
            com.google.android.gms.internal.ads.h34 r2 = (com.google.android.gms.internal.ads.h34) r2     // Catch:{ Exception -> 0x0052 }
            int r2 = r2.f8037f     // Catch:{ Exception -> 0x0052 }
            android.os.HandlerThread r6 = m10916b(r2)     // Catch:{ Exception -> 0x0052 }
            r7 = 0
            r8 = 0
            r3 = r9
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0052 }
            com.google.android.gms.internal.ads.lz2.m12993b()     // Catch:{ Exception -> 0x004f }
            android.media.MediaFormat r3 = r11.f15900b     // Catch:{ Exception -> 0x004f }
            android.view.Surface r4 = r11.f15902d     // Catch:{ Exception -> 0x004f }
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r9
            com.google.android.gms.internal.ads.k34.m11987m(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x004f }
            return r9
        L_0x004f:
            r11 = move-exception
            r1 = r9
            goto L_0x0056
        L_0x0052:
            r11 = move-exception
            goto L_0x0056
        L_0x0054:
            r11 = move-exception
            r0 = r1
        L_0x0056:
            if (r1 != 0) goto L_0x005e
            if (r0 == 0) goto L_0x0061
            r0.release()
            goto L_0x0061
        L_0x005e:
            r1.mo8607k()
        L_0x0061:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i34.mo8071c(com.google.android.gms.internal.ads.v34):com.google.android.gms.internal.ads.k34");
    }
}
