package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.List;
import p048g2.C2635a;
import p048g2.C2637b;
import p054h1.C2694t;
import p102o.C3801a;
import p102o.C3814g;

public final class yq1 extends d50 {

    /* renamed from: f */
    private final Context f17845f;

    /* renamed from: g */
    private final rm1 f17846g;

    /* renamed from: h */
    private rn1 f17847h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public mm1 f17848i;

    public yq1(Context context, rm1 rm1, rn1 rn1, mm1 mm1) {
        this.f17845f = context;
        this.f17846g = rm1;
        this.f17847h = rn1;
        this.f17848i = mm1;
    }

    /* renamed from: D0 */
    public final void mo6817D0(String str) {
        mm1 mm1 = this.f17848i;
        if (mm1 != null) {
            mm1.mo9297R(str);
        }
    }

    /* renamed from: b */
    public final C1609cz mo6818b() {
        return this.f17846g.mo10564R();
    }

    /* renamed from: e */
    public final C2635a mo6055e() {
        return C2637b.m21358Z2(this.f17845f);
    }

    /* renamed from: f */
    public final String mo6056f() {
        return this.f17846g.mo10585g0();
    }

    /* renamed from: f5 */
    public final String mo6819f5(String str) {
        return this.f17846g.mo10563Q().get(str);
    }

    /* renamed from: h0 */
    public final boolean mo6057h0(C2635a aVar) {
        rn1 rn1;
        Object C0 = C2637b.m21357C0(aVar);
        if (!(C0 instanceof ViewGroup) || (rn1 = this.f17847h) == null || !rn1.mo10616f((ViewGroup) C0)) {
            return false;
        }
        this.f17846g.mo10572Z().mo7103W0(new xq1(this));
        return true;
    }

    /* renamed from: i */
    public final List<String> mo6820i() {
        C3814g<String, z30> P = this.f17846g.mo10562P();
        C3814g<String, String> Q = this.f17846g.mo10563Q();
        String[] strArr = new String[(P.size() + Q.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < P.size()) {
            strArr[i3] = P.mo15174i(i2);
            i2++;
            i3++;
        }
        while (i < Q.size()) {
            strArr[i3] = Q.mo15174i(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: j */
    public final void mo6821j() {
        mm1 mm1 = this.f17848i;
        if (mm1 != null) {
            mm1.mo9123a();
        }
        this.f17848i = null;
        this.f17847h = null;
    }

    /* renamed from: k */
    public final void mo6822k() {
        String a = this.f17846g.mo10573a();
        if ("Google".equals(a)) {
            io0.m11131g("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(a)) {
            io0.m11131g("Not starting OMID session. OM partner name has not been configured.");
        } else {
            mm1 mm1 = this.f17848i;
            if (mm1 != null) {
                mm1.mo9289J(a, false);
            }
        }
    }

    /* renamed from: l */
    public final boolean mo6823l() {
        mm1 mm1 = this.f17848i;
        return (mm1 == null || mm1.mo9313v()) && this.f17846g.mo10571Y() != null && this.f17846g.mo10572Z() == null;
    }

    /* renamed from: m */
    public final void mo6824m() {
        mm1 mm1 = this.f17848i;
        if (mm1 != null) {
            mm1.mo9300i();
        }
    }

    /* renamed from: t */
    public final boolean mo6825t() {
        C2635a c0 = this.f17846g.mo10577c0();
        if (c0 != null) {
            C2694t.m21600i().mo10785P(c0);
            if (this.f17846g.mo10571Y() == null) {
                return true;
            }
            this.f17846g.mo10571Y().mo6424t("onSdkLoaded", new C3801a());
            return true;
        }
        io0.m11131g("Trying to start OMID session before creation.");
        return false;
    }

    /* renamed from: u0 */
    public final void mo6826u0(C2635a aVar) {
        mm1 mm1;
        Object C0 = C2637b.m21357C0(aVar);
        if ((C0 instanceof View) && this.f17846g.mo10577c0() != null && (mm1 = this.f17848i) != null) {
            mm1.mo9301j((View) C0);
        }
    }

    /* renamed from: z */
    public final n40 mo6827z(String str) {
        return this.f17846g.mo10562P().get(str);
    }
}
