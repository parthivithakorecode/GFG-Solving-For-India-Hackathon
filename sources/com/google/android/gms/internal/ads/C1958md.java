package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.md */
public final class C1958md extends C2106qd {

    /* renamed from: i */
    private final View f10811i;

    public C1958md(C1735gc gcVar, String str, String str2, C1842j8 j8Var, int i, int i2, View view) {
        super(gcVar, "hQ5xuCRMiz6eJqaT4+9Wf/Kj854Yma0NmQLTM8SLOoEkyUHQjbgUSxF3PTxTz3Bq", "CIY4BMAyy7Fe28Pq7/h8od2SEEojcWEgmd3J7ORxssU=", j8Var, i, 57);
        this.f10811i = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5238a() {
        if (this.f10811i != null) {
            Boolean bool = (Boolean) C2199sw.m17001c().mo8579b(m10.f10471d2);
            DisplayMetrics displayMetrics = this.f13130b.mo7567b().getResources().getDisplayMetrics();
            C1883kc kcVar = new C1883kc((String) this.f13134f.invoke((Object) null, new Object[]{this.f10811i, displayMetrics, bool}));
            C2398y8 F = C2435z8.m20525F();
            F.mo11976s(kcVar.f9470b.longValue());
            F.mo11977t(kcVar.f9471c.longValue());
            F.mo11978u(kcVar.f9472d.longValue());
            if (bool.booleanValue()) {
                F.mo11975r(kcVar.f9473e.longValue());
            }
            this.f13133e.mo8377K((C2435z8) F.mo11894o());
        }
    }
}
