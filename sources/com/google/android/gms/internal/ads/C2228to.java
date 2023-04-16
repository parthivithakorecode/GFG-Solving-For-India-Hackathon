package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.to */
public final class C2228to {

    /* renamed from: a */
    private final Object f14929a = new Object();
    @GuardedBy("activityTrackerLock")

    /* renamed from: b */
    private C2154ro f14930b = null;
    @GuardedBy("activityTrackerLock")

    /* renamed from: c */
    private boolean f14931c = false;

    /* renamed from: a */
    public final Activity mo11038a() {
        synchronized (this.f14929a) {
            C2154ro roVar = this.f14930b;
            if (roVar == null) {
                return null;
            }
            Activity a = roVar.mo10617a();
            return a;
        }
    }

    /* renamed from: b */
    public final Context mo11039b() {
        synchronized (this.f14929a) {
            C2154ro roVar = this.f14930b;
            if (roVar == null) {
                return null;
            }
            Context b = roVar.mo10618b();
            return b;
        }
    }

    /* renamed from: c */
    public final void mo11040c(C2191so soVar) {
        synchronized (this.f14929a) {
            if (this.f14930b == null) {
                this.f14930b = new C2154ro();
            }
            this.f14930b.mo10619f(soVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11041d(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f14929a
            monitor-enter(r0)
            boolean r1 = r3.f14931c     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0032
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x000e
            r1 = r4
        L_0x000e:
            boolean r2 = r1 instanceof android.app.Application     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x0015
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0034 }
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            if (r1 != 0) goto L_0x001f
            java.lang.String r4 = "Can not cast Context to Application"
            com.google.android.gms.internal.ads.io0.m11131g(r4)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x001f:
            com.google.android.gms.internal.ads.ro r2 = r3.f14930b     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.ads.ro r2 = new com.google.android.gms.internal.ads.ro     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            r3.f14930b = r2     // Catch:{ all -> 0x0034 }
        L_0x002a:
            com.google.android.gms.internal.ads.ro r2 = r3.f14930b     // Catch:{ all -> 0x0034 }
            r2.mo10620g(r1, r4)     // Catch:{ all -> 0x0034 }
            r4 = 1
            r3.f14931c = r4     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2228to.mo11041d(android.content.Context):void");
    }

    /* renamed from: e */
    public final void mo11042e(C2191so soVar) {
        synchronized (this.f14929a) {
            C2154ro roVar = this.f14930b;
            if (roVar != null) {
                roVar.mo10621h(soVar);
            }
        }
    }
}
