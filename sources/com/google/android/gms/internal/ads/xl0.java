package com.google.android.gms.internal.ads;

import android.content.Context;

public final class xl0 implements C2450zn {

    /* renamed from: f */
    private final Context f17237f;

    /* renamed from: g */
    private final Object f17238g;

    /* renamed from: h */
    private final String f17239h;

    /* renamed from: i */
    private boolean f17240i;

    public xl0(Context context, String str) {
        this.f17237f = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f17239h = str;
        this.f17240i = false;
        this.f17238g = new Object();
    }

    /* renamed from: a */
    public final String mo11859a() {
        return this.f17239h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11860b(boolean r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.pm0 r0 = p054h1.C2694t.m21606o()
            android.content.Context r1 = r3.f17237f
            boolean r0 = r0.mo10109z(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r0 = r3.f17238g
            monitor-enter(r0)
            boolean r1 = r3.f17240i     // Catch:{ all -> 0x003f }
            if (r1 != r4) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0016:
            r3.f17240i = r4     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r3.f17239h     // Catch:{ all -> 0x003f }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0022:
            boolean r4 = r3.f17240i     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.pm0 r4 = p054h1.C2694t.m21606o()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f17237f     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f17239h     // Catch:{ all -> 0x003f }
            r4.mo10096m(r1, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0032:
            com.google.android.gms.internal.ads.pm0 r4 = p054h1.C2694t.m21606o()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f17237f     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f17239h     // Catch:{ all -> 0x003f }
            r4.mo10097n(r1, r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xl0.mo11860b(boolean):void");
    }

    /* renamed from: m0 */
    public final void mo5653m0(C2376xn xnVar) {
        mo11860b(xnVar.f17256j);
    }
}
