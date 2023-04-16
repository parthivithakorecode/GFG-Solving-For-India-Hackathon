package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import p054h1.C2675a;
import p054h1.C2694t;
import p069j1.C3163g2;
import p069j1.C3165h0;
import p069j1.C3166h1;

@ParametersAreNonnullByDefault
public final class nb0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f11383a = new Object();

    /* renamed from: b */
    private final Context f11384b;

    /* renamed from: c */
    private final String f11385c;

    /* renamed from: d */
    private final po0 f11386d;

    /* renamed from: e */
    private final C3165h0<ha0> f11387e;

    /* renamed from: f */
    private final C3165h0<ha0> f11388f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public mb0 f11389g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f11390h = 1;

    public nb0(Context context, po0 po0, String str, C3165h0<ha0> h0Var, C3165h0<ha0> h0Var2) {
        this.f11385c = str;
        this.f11384b = context.getApplicationContext();
        this.f11386d = po0;
        this.f11387e = h0Var;
        this.f11388f = h0Var2;
    }

    /* renamed from: b */
    public final hb0 mo9481b(C1734gb gbVar) {
        synchronized (this.f11383a) {
            synchronized (this.f11383a) {
                mb0 mb0 = this.f11389g;
                if (mb0 != null && this.f11390h == 0) {
                    mb0.mo8196e(new ua0(this), sa0.f14342a);
                }
            }
            mb0 mb02 = this.f11389g;
            if (mb02 != null) {
                if (mb02.mo8193a() != -1) {
                    int i = this.f11390h;
                    if (i == 0) {
                        hb0 f = this.f11389g.mo9160f();
                        return f;
                    } else if (i == 1) {
                        this.f11390h = 2;
                        mo9482d((C1734gb) null);
                        hb0 f2 = this.f11389g.mo9160f();
                        return f2;
                    } else {
                        hb0 f3 = this.f11389g.mo9160f();
                        return f3;
                    }
                }
            }
            this.f11390h = 2;
            mb0 d = mo9482d((C1734gb) null);
            this.f11389g = d;
            hb0 f4 = d.mo9160f();
            return f4;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final mb0 mo9482d(C1734gb gbVar) {
        mb0 mb0 = new mb0(this.f11388f);
        wo0.f16890e.execute(new wa0(this, (C1734gb) null, mb0));
        mb0.mo8196e(new cb0(this, mb0), new db0(this, mb0));
        return mb0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo9483h(com.google.android.gms.internal.ads.mb0 r4, com.google.android.gms.internal.ads.ha0 r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f11383a
            monitor-enter(r0)
            int r1 = r4.mo8193a()     // Catch:{ all -> 0x0028 }
            r2 = -1
            if (r1 == r2) goto L_0x0026
            int r1 = r4.mo8193a()     // Catch:{ all -> 0x0028 }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            r4.mo8194c()     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.dc3 r4 = com.google.android.gms.internal.ads.wo0.f16890e     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.va0 r1 = new com.google.android.gms.internal.ads.va0     // Catch:{ all -> 0x0028 }
            r1.<init>(r5)     // Catch:{ all -> 0x0028 }
            r4.execute(r1)     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            p069j1.C3202r1.m24015k(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nb0.mo9483h(com.google.android.gms.internal.ads.mb0, com.google.android.gms.internal.ads.ha0):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo9484i(C1734gb gbVar, mb0 mb0) {
        try {
            pa0 pa0 = new pa0(this.f11384b, this.f11386d, (C1734gb) null, (C2675a) null);
            pa0.mo7894p0(new ra0(this, mb0, pa0));
            pa0.mo9716U("/jsLoaded", new ya0(this, mb0, pa0));
            C3166h1 h1Var = new C3166h1();
            za0 za0 = new za0(this, (C1734gb) null, pa0, h1Var);
            h1Var.mo14036b(za0);
            pa0.mo9716U("/requestReload", za0);
            if (this.f11385c.endsWith(".js")) {
                pa0.mo7889Q(this.f11385c);
            } else if (this.f11385c.startsWith("<html>")) {
                pa0.mo7895z(this.f11385c);
            } else {
                pa0.mo7893n0(this.f11385c);
            }
            C3163g2.f20465i.postDelayed(new bb0(this, mb0, pa0), 60000);
        } catch (Throwable th) {
            io0.m11129e("Error creating webview.", th);
            C2694t.m21607p().mo11034s(th, "SdkJavascriptFactory.loadJavascriptEngine");
            mb0.mo8194c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo9485j(ha0 ha0) {
        if (ha0.mo7891h()) {
            this.f11390h = 1;
        }
    }
}
