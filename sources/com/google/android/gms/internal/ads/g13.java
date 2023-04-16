package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import p003a2.C0052c;
import p160x1.C4280b;

final class g13 implements C0052c.C0053a, C0052c.C0054b {

    /* renamed from: a */
    private final c23 f7227a;

    /* renamed from: b */
    private final w13 f7228b;

    /* renamed from: c */
    private final Object f7229c = new Object();

    /* renamed from: d */
    private boolean f7230d = false;

    /* renamed from: e */
    private boolean f7231e = false;

    g13(Context context, Looper looper, w13 w13) {
        this.f7228b = w13;
        this.f7227a = new c23(context, looper, this, this, 12800000);
    }

    /* renamed from: b */
    private final void m9501b() {
        synchronized (this.f7229c) {
            if (this.f7227a.mo173a() || this.f7227a.mo179j()) {
                this.f7227a.mo184o();
            }
            Binder.flushPendingCommands();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0020 */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo139C0(android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.Object r4 = r3.f7229c
            monitor-enter(r4)
            boolean r0 = r3.f7231e     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            return
        L_0x0009:
            r0 = 1
            r3.f7231e = r0     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.c23 r0 = r3.f7227a     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.h23 r0 = r0.mo6038i0()     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.a23 r1 = new com.google.android.gms.internal.ads.a23     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.w13 r2 = r3.f7228b     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            byte[] r2 = r2.mo5901b()     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            r0.mo7811P4(r1)     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
        L_0x0020:
            r3.m9501b()     // Catch:{ all -> 0x002b }
            goto L_0x0029
        L_0x0024:
            r0 = move-exception
            r3.m9501b()     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g13.mo139C0(android.os.Bundle):void");
    }

    /* renamed from: D */
    public final void mo140D(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7493a() {
        synchronized (this.f7229c) {
            if (!this.f7230d) {
                this.f7230d = true;
                this.f7227a.mo186q();
            }
        }
    }

    /* renamed from: n0 */
    public final void mo196n0(C4280b bVar) {
    }
}
