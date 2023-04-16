package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.regex.Pattern;
import p054h1.C2694t;
import p069j1.C3163g2;

public final class ox2 {

    /* renamed from: a */
    private final Context f12239a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f12240b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f12241c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f12242d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f12243e = "";
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f12244f = "";
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f12245g = "";
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final String f12246h = "";
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f12247i = "";

    /* renamed from: j */
    private boolean f12248j = false;

    /* renamed from: k */
    private boolean f12249k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f12250l = 2;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f12251m = 2;

    private ox2(Context context, int i) {
        this.f12239a = context;
    }

    /* renamed from: p */
    public static ox2 m14693p(Context context, int i, int i2, C1902kv kvVar) {
        ox2 ox2 = qx2.m15945b() ? new ox2(context, 7) : null;
        if (ox2 == null) {
            return null;
        }
        ox2.mo9884h();
        ox2.mo9886q(i2);
        String str = kvVar.f9682u;
        if (!TextUtils.isEmpty(str)) {
            if (Pattern.matches((String) C2199sw.m17001c().mo8579b(m10.f10642w6), str)) {
                ox2.mo9882f(kvVar.f9682u);
            }
        }
        return ox2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.ox2 mo9879c(com.google.android.gms.internal.ads.C1605cv r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.os.IBinder r3 = r3.f5533j     // Catch:{ all -> 0x0023 }
            if (r3 != 0) goto L_0x0007
            monitor-exit(r2)
            return r2
        L_0x0007:
            com.google.android.gms.internal.ads.oa1 r3 = (com.google.android.gms.internal.ads.oa1) r3     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r3.mo9706f()     // Catch:{ all -> 0x0023 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0015
            r2.f12243e = r0     // Catch:{ all -> 0x0023 }
        L_0x0015:
            java.lang.String r3 = r3.mo9704d()     // Catch:{ all -> 0x0023 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            r2.f12244f = r3     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r2)
            return r2
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ox2.mo9879c(com.google.android.gms.internal.ads.cv):com.google.android.gms.internal.ads.ox2");
    }

    /* renamed from: d */
    public final synchronized ox2 mo9880d(cs2 cs2) {
        if (!TextUtils.isEmpty(cs2.f5509b.f15729b)) {
            this.f12243e = cs2.f5509b.f15729b;
        }
        Iterator<rr2> it = cs2.f5508a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            rr2 next = it.next();
            if (!TextUtils.isEmpty(next.f13882Y)) {
                this.f12244f = next.f13882Y;
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public final synchronized ox2 mo9881e(String str) {
        this.f12245g = str;
        return this;
    }

    /* renamed from: f */
    public final synchronized ox2 mo9882f(String str) {
        this.f12247i = str;
        return this;
    }

    /* renamed from: g */
    public final synchronized ox2 mo9883g(boolean z) {
        this.f12241c = z;
        return this;
    }

    /* renamed from: h */
    public final synchronized ox2 mo9884h() {
        C2694t.m21608q();
        this.f12242d = C3163g2.m23921c(this.f12239a);
        Resources resources = this.f12239a.getResources();
        int i = 2;
        if (resources != null) {
            Configuration configuration = resources.getConfiguration();
            if (configuration != null) {
                i = configuration.orientation == 2 ? 4 : 3;
            }
        }
        this.f12251m = i;
        this.f12240b = C2694t.m21592a().mo12462a();
        this.f12249k = true;
        return this;
    }

    /* renamed from: i */
    public final synchronized px2 mo9885i() {
        if (this.f12248j) {
            return null;
        }
        this.f12248j = true;
        if (!this.f12249k) {
            mo9884h();
        }
        return new px2(this);
    }

    /* renamed from: q */
    public final synchronized ox2 mo9886q(int i) {
        this.f12250l = i;
        return this;
    }
}
