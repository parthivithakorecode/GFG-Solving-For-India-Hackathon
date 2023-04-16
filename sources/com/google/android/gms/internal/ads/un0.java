package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import javax.annotation.concurrent.GuardedBy;
import p069j1.C3208t1;

public final class un0 {

    /* renamed from: a */
    long f15643a = -1;

    /* renamed from: b */
    long f15644b = -1;
    @GuardedBy("lock")

    /* renamed from: c */
    int f15645c = -1;

    /* renamed from: d */
    int f15646d = -1;

    /* renamed from: e */
    long f15647e = 0;

    /* renamed from: f */
    private final Object f15648f = new Object();

    /* renamed from: g */
    final String f15649g;

    /* renamed from: h */
    private final C3208t1 f15650h;
    @GuardedBy("lock")

    /* renamed from: i */
    int f15651i = 0;
    @GuardedBy("lock")

    /* renamed from: j */
    int f15652j = 0;

    public un0(String str, C3208t1 t1Var) {
        this.f15649g = str;
        this.f15650h = t1Var;
    }

    /* renamed from: g */
    private final void m17950g() {
        if (h30.f8027a.mo9928e().booleanValue()) {
            synchronized (this.f15648f) {
                this.f15645c--;
                this.f15646d--;
            }
        }
    }

    /* renamed from: a */
    public final Bundle mo11254a(Context context, String str) {
        Bundle bundle;
        String str2;
        synchronized (this.f15648f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f15650h.mo14078J() ? "" : this.f15649g);
            bundle.putLong("basets", this.f15644b);
            bundle.putLong("currts", this.f15643a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f15645c);
            bundle.putInt("preqs_in_session", this.f15646d);
            bundle.putLong("time_in_session", this.f15647e);
            bundle.putInt("pclick", this.f15651i);
            bundle.putInt("pimp", this.f15652j);
            Context a = kj0.m12224a(context);
            int identifier = a.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z = false;
            if (identifier == 0) {
                str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
            } else {
                try {
                    if (identifier == a.getPackageManager().getActivityInfo(new ComponentName(a.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                        z = true;
                    } else {
                        io0.m11130f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    io0.m11131g("Fail to fetch AdActivity theme");
                    str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
                }
                bundle.putBoolean("support_transparent_background", z);
            }
            io0.m11130f(str2);
            bundle.putBoolean("support_transparent_background", z);
        }
        return bundle;
    }

    /* renamed from: b */
    public final void mo11255b() {
        synchronized (this.f15648f) {
            this.f15651i++;
        }
    }

    /* renamed from: c */
    public final void mo11256c() {
        synchronized (this.f15648f) {
            this.f15652j++;
        }
    }

    /* renamed from: d */
    public final void mo11257d() {
        m17950g();
    }

    /* renamed from: e */
    public final void mo11258e() {
        m17950g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11259f(com.google.android.gms.internal.ads.C1902kv r10, long r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f15648f
            monitor-enter(r0)
            j1.t1 r1 = r9.f15650h     // Catch:{ all -> 0x0071 }
            long r1 = r1.mo14082c()     // Catch:{ all -> 0x0071 }
            e2.d r3 = p054h1.C2694t.m21592a()     // Catch:{ all -> 0x0071 }
            long r3 = r3.mo12462a()     // Catch:{ all -> 0x0071 }
            long r5 = r9.f15644b     // Catch:{ all -> 0x0071 }
            r7 = -1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.e10<java.lang.Long> r5 = com.google.android.gms.internal.ads.m10.f10290H0     // Catch:{ all -> 0x0071 }
            com.google.android.gms.internal.ads.k10 r6 = com.google.android.gms.internal.ads.C2199sw.m17001c()     // Catch:{ all -> 0x0071 }
            java.lang.Object r5 = r6.mo8579b(r5)     // Catch:{ all -> 0x0071 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0071 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0071 }
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0033
            r1 = -1
            r9.f15646d = r1     // Catch:{ all -> 0x0071 }
            goto L_0x003b
        L_0x0033:
            j1.t1 r1 = r9.f15650h     // Catch:{ all -> 0x0071 }
            int r1 = r1.mo14080a()     // Catch:{ all -> 0x0071 }
            r9.f15646d = r1     // Catch:{ all -> 0x0071 }
        L_0x003b:
            r9.f15644b = r11     // Catch:{ all -> 0x0071 }
        L_0x003d:
            r9.f15643a = r11     // Catch:{ all -> 0x0071 }
            android.os.Bundle r10 = r10.f9669h     // Catch:{ all -> 0x0071 }
            r11 = 1
            if (r10 == 0) goto L_0x0050
            java.lang.String r12 = "gw"
            r1 = 2
            int r10 = r10.getInt(r12, r1)     // Catch:{ all -> 0x0071 }
            if (r10 == r11) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            return
        L_0x0050:
            int r10 = r9.f15645c     // Catch:{ all -> 0x0071 }
            int r10 = r10 + r11
            r9.f15645c = r10     // Catch:{ all -> 0x0071 }
            int r10 = r9.f15646d     // Catch:{ all -> 0x0071 }
            int r10 = r10 + r11
            r9.f15646d = r10     // Catch:{ all -> 0x0071 }
            if (r10 != 0) goto L_0x0066
            r10 = 0
            r9.f15647e = r10     // Catch:{ all -> 0x0071 }
            j1.t1 r10 = r9.f15650h     // Catch:{ all -> 0x0071 }
            r10.mo14093n(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x006f
        L_0x0066:
            j1.t1 r10 = r9.f15650h     // Catch:{ all -> 0x0071 }
            long r10 = r10.mo14086g()     // Catch:{ all -> 0x0071 }
            long r3 = r3 - r10
            r9.f15647e = r3     // Catch:{ all -> 0x0071 }
        L_0x006f:
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            return
        L_0x0071:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0071 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.un0.mo11259f(com.google.android.gms.internal.ads.kv, long):void");
    }
}
