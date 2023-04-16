package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
import p054h1.C2694t;
import p069j1.C3163g2;

public final class jd2 implements cd2<v61> {
    @GuardedBy("this")

    /* renamed from: a */
    private final is2 f9101a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final bw0 f9102b;

    /* renamed from: c */
    private final Context f9103c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zc2 f9104d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final qx2 f9105e;
    @GuardedBy("this")

    /* renamed from: f */
    private k71 f9106f;

    public jd2(bw0 bw0, Context context, zc2 zc2, is2 is2) {
        this.f9102b = bw0;
        this.f9103c = context;
        this.f9104d = zc2;
        this.f9101a = is2;
        this.f9105e = bw0.mo5597b();
        is2.mo8255J(zc2.mo12204d());
    }

    /* renamed from: a */
    public final boolean mo6124a(C1902kv kvVar, String str, ad2 ad2, bd2<? super v61> bd2) {
        ox2 p = ox2.m14693p(this.f9103c, 7, 8, kvVar);
        C2694t.m21608q();
        if (C3163g2.m23936l(this.f9103c) && kvVar.f9685x == null) {
            io0.m11128d("Failed to load the ad because app ID is missing.");
            this.f9102b.mo5599d().execute(new ed2(this));
            if (p != null) {
                qx2 qx2 = this.f9105e;
                p.mo9883g(false);
                qx2.mo10426a(p.mo9885i());
            }
            return false;
        } else if (str == null) {
            io0.m11128d("Ad unit ID should not be null for NativeAdLoader.");
            this.f9102b.mo5599d().execute(new fd2(this));
            if (p != null) {
                qx2 qx22 = this.f9105e;
                p.mo9883g(false);
                qx22.mo10426a(p.mo9885i());
            }
            return false;
        } else {
            zs2.m20830a(this.f9103c, kvVar.f9672k);
            if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10240A6)).booleanValue() && kvVar.f9672k) {
                this.f9102b.mo5611s().mo11341l(true);
            }
            int i = ((dd2) ad2).f5761a;
            is2 is2 = this.f9101a;
            is2.mo8264d(kvVar);
            is2.mo8259N(i);
            ks2 f = is2.mo8266f();
            if (f.f9649n != null) {
                this.f9104d.mo12204d().mo8921B(f.f9649n);
            }
            cl1 o = this.f9102b.mo5607o();
            fa1 fa1 = new fa1();
            fa1.mo7274c(this.f9103c);
            fa1.mo7277f(f);
            o.mo6216n(fa1.mo7278g());
            mg1 mg1 = new mg1();
            mg1.mo9249n(this.f9104d.mo12204d(), this.f9102b.mo5599d());
            o.mo6217r(mg1.mo9252q());
            o.mo6214g(this.f9104d.mo12203c());
            o.mo6215h(new q41((ViewGroup) null));
            dl1 e = o.mo6213e();
            this.f9102b.mo5595C().mo5945c(1);
            dc3 dc3 = wo0.f16886a;
            sv3.m16997b(dc3);
            ScheduledExecutorService e2 = this.f9102b.mo5600e();
            z71<d71> a = e.mo6496a();
            k71 k71 = new k71(dc3, e2, a.mo12178h(a.mo12179i()));
            this.f9106f = k71;
            k71.mo8631e(new id2(this, bd2, p, e));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo8448e() {
        this.f9104d.mo12201a().mo7808d(dt2.m8099d(4, (String) null, (C1605cv) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo8449f() {
        this.f9104d.mo12201a().mo7808d(dt2.m8099d(6, (String) null, (C1605cv) null));
    }

    public final boolean zza() {
        k71 k71 = this.f9106f;
        return k71 != null && k71.mo8632f();
    }
}
