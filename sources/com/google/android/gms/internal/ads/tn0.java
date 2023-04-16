package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;
import p034e2.C2555l;
import p041f2.C2606c;
import p054h1.C2694t;
import p069j1.C3202r1;
import p069j1.C3208t1;
import p069j1.C3217w1;

@ParametersAreNonnullByDefault
public final class tn0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f14914a = new Object();

    /* renamed from: b */
    private final C3217w1 f14915b;

    /* renamed from: c */
    private final xn0 f14916c;

    /* renamed from: d */
    private boolean f14917d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f14918e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public po0 f14919f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public r10 f14920g;

    /* renamed from: h */
    private Boolean f14921h;

    /* renamed from: i */
    private final AtomicInteger f14922i;

    /* renamed from: j */
    private final sn0 f14923j;

    /* renamed from: k */
    private final Object f14924k;

    /* renamed from: l */
    private cc3<ArrayList<String>> f14925l;

    public tn0() {
        C3217w1 w1Var = new C3217w1();
        this.f14915b = w1Var;
        this.f14916c = new xn0(C2125qw.m15899d(), w1Var);
        this.f14917d = false;
        this.f14920g = null;
        this.f14921h = null;
        this.f14922i = new AtomicInteger(0);
        this.f14923j = new sn0((rn0) null);
        this.f14924k = new Object();
    }

    /* renamed from: a */
    public final int mo11020a() {
        return this.f14922i.get();
    }

    /* renamed from: c */
    public final Context mo11021c() {
        return this.f14918e;
    }

    /* renamed from: d */
    public final Resources mo11022d() {
        if (this.f14919f.f12732i) {
            return this.f14918e.getResources();
        }
        try {
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10575o7)).booleanValue()) {
                return no0.m14003a(this.f14918e).getResources();
            }
            no0.m14003a(this.f14918e).getResources();
            return null;
        } catch (mo0 e) {
            io0.m11132h("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* renamed from: f */
    public final r10 mo11023f() {
        r10 r10;
        synchronized (this.f14914a) {
            r10 = this.f14920g;
        }
        return r10;
    }

    /* renamed from: g */
    public final xn0 mo11024g() {
        return this.f14916c;
    }

    /* renamed from: h */
    public final C3208t1 mo11025h() {
        C3217w1 w1Var;
        synchronized (this.f14914a) {
            w1Var = this.f14915b;
        }
        return w1Var;
    }

    /* renamed from: j */
    public final cc3<ArrayList<String>> mo11026j() {
        if (C2555l.m21208b() && this.f14918e != null) {
            if (!((Boolean) C2199sw.m17001c().mo8579b(m10.f10387T1)).booleanValue()) {
                synchronized (this.f14924k) {
                    cc3<ArrayList<String>> cc3 = this.f14925l;
                    if (cc3 != null) {
                        return cc3;
                    }
                    cc3<ArrayList<String>> C = wo0.f16886a.mo6445C(new pn0(this));
                    this.f14925l = C;
                    return C;
                }
            }
        }
        return rb3.m16131i(new ArrayList());
    }

    /* renamed from: k */
    public final Boolean mo11027k() {
        Boolean bool;
        synchronized (this.f14914a) {
            bool = this.f14921h;
        }
        return bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ ArrayList mo11028m() {
        Context a = kj0.m12224a(this.f14918e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo f = C2606c.m21299a(a).mo12496f(a.getApplicationInfo().packageName, 4096);
            if (f.requestedPermissions != null && f.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = f.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((f.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    /* renamed from: n */
    public final void mo11029n() {
        this.f14923j.mo10824a();
    }

    /* renamed from: o */
    public final void mo11030o() {
        this.f14922i.decrementAndGet();
    }

    /* renamed from: p */
    public final void mo11031p() {
        this.f14922i.incrementAndGet();
    }

    @TargetApi(23)
    /* renamed from: q */
    public final void mo11032q(Context context, po0 po0) {
        r10 r10;
        synchronized (this.f14914a) {
            if (!this.f14917d) {
                this.f14918e = context.getApplicationContext();
                this.f14919f = po0;
                C2694t.m21594c().mo11040c(this.f14916c);
                this.f14915b.mo14103x(this.f14918e);
                xh0.m19513d(this.f14918e, this.f14919f);
                C2694t.m21597f();
                if (!w20.f16658c.mo9928e().booleanValue()) {
                    C3202r1.m24015k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    r10 = null;
                } else {
                    r10 = new r10();
                }
                this.f14920g = r10;
                if (r10 != null) {
                    zo0.m20769a(new qn0(this).mo8781b(), "AppState.registerCsiReporter");
                }
                this.f14917d = true;
                mo11026j();
            }
        }
        C2694t.m21608q().mo14022L(context, po0.f12729f);
    }

    /* renamed from: r */
    public final void mo11033r(Throwable th, String str) {
        xh0.m19513d(this.f14918e, this.f14919f).mo11847b(th, str, j30.f8973g.mo9928e().floatValue());
    }

    /* renamed from: s */
    public final void mo11034s(Throwable th, String str) {
        xh0.m19513d(this.f14918e, this.f14919f).mo11846a(th, str);
    }

    /* renamed from: t */
    public final void mo11035t(Boolean bool) {
        synchronized (this.f14914a) {
            this.f14921h = bool;
        }
    }
}
