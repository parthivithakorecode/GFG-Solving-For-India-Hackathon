package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p034e2.C2556m;
import p048g2.C2635a;
import p054h1.C2675a;
import p054h1.C2694t;
import p061i1.C2807f;
import p061i1.C2816o;
import p069j1.C3160g;
import p069j1.C3163g2;
import p069j1.C3219x0;

public final class uu0 extends FrameLayout implements eu0 {

    /* renamed from: f */
    private final eu0 f15770f;

    /* renamed from: g */
    private final hq0 f15771g;

    /* renamed from: h */
    private final AtomicBoolean f15772h = new AtomicBoolean();

    public uu0(eu0 eu0) {
        super(eu0.getContext());
        this.f15770f = eu0;
        this.f15771g = new hq0(eu0.mo7085I(), this, this);
        addView((View) eu0);
    }

    /* renamed from: A */
    public final rr2 mo7073A() {
        return this.f15770f.mo7073A();
    }

    /* renamed from: A0 */
    public final void mo7074A0() {
        this.f15770f.mo7074A0();
    }

    /* renamed from: B */
    public final void mo11057B() {
        this.f15770f.mo11057B();
    }

    /* renamed from: B0 */
    public final ts0 mo11058B0(String str) {
        return this.f15770f.mo11058B0(str);
    }

    /* renamed from: C */
    public final void mo7075C(bv0 bv0) {
        this.f15770f.mo7075C(bv0);
    }

    /* renamed from: C0 */
    public final boolean mo7076C0() {
        return this.f15770f.mo7076C0();
    }

    /* renamed from: D */
    public final void mo8801D(C3219x0 x0Var, o42 o42, wv1 wv1, xw2 xw2, String str, String str2, int i) {
        this.f15770f.mo8801D(x0Var, o42, wv1, xw2, str, str2, i);
    }

    /* renamed from: D0 */
    public final tv0 mo7077D0() {
        return ((yu0) this.f15770f).mo12085h1();
    }

    /* renamed from: E */
    public final void mo7078E(String str, ts0 ts0) {
        this.f15770f.mo7078E(str, ts0);
    }

    /* renamed from: E0 */
    public final void mo7079E0(Context context) {
        this.f15770f.mo7079E0(context);
    }

    /* renamed from: F */
    public final ur2 mo6308F() {
        return this.f15770f.mo6308F();
    }

    /* renamed from: F0 */
    public final void mo7080F0(String str, t70<? super eu0> t70) {
        this.f15770f.mo7080F0(str, t70);
    }

    /* renamed from: G */
    public final void mo7081G(boolean z) {
        this.f15770f.mo7081G(z);
    }

    /* renamed from: G0 */
    public final void mo7082G0(String str, t70<? super eu0> t70) {
        this.f15770f.mo7082G0(str, t70);
    }

    /* renamed from: H */
    public final C1734gb mo7083H() {
        return this.f15770f.mo7083H();
    }

    /* renamed from: H0 */
    public final void mo7084H0(int i) {
        this.f15770f.mo7084H0(i);
    }

    /* renamed from: I */
    public final Context mo7085I() {
        return this.f15770f.mo7085I();
    }

    /* renamed from: I0 */
    public final void mo7086I0() {
        eu0 eu0 = this.f15770f;
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(C2694t.m21610s().mo14016e()));
        hashMap.put("app_volume", String.valueOf(C2694t.m21610s().mo14013a()));
        yu0 yu0 = (yu0) eu0;
        hashMap.put("device_volume", String.valueOf(C3160g.m23896b(yu0.getContext())));
        yu0.mo6424t("volume", hashMap);
    }

    /* renamed from: J */
    public final C2007np mo7087J() {
        return this.f15770f.mo7087J();
    }

    /* renamed from: J0 */
    public final void mo7088J0(boolean z) {
        this.f15770f.mo7088J0(z);
    }

    /* renamed from: K */
    public final void mo7089K() {
        setBackgroundColor(0);
        this.f15770f.setBackgroundColor(0);
    }

    /* renamed from: K0 */
    public final boolean mo7090K0() {
        return this.f15770f.mo7090K0();
    }

    /* renamed from: L */
    public final void mo25L() {
        eu0 eu0 = this.f15770f;
        if (eu0 != null) {
            eu0.mo25L();
        }
    }

    /* renamed from: L0 */
    public final boolean mo7091L0(boolean z, int i) {
        if (!this.f15772h.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10234A0)).booleanValue()) {
            return false;
        }
        if (this.f15770f.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f15770f.getParent()).removeView((View) this.f15770f);
        }
        this.f15770f.mo7091L0(z, i);
        return true;
    }

    /* renamed from: M */
    public final void mo7092M(rr2 rr2, ur2 ur2) {
        this.f15770f.mo7092M(rr2, ur2);
    }

    /* renamed from: M0 */
    public final void mo7093M0() {
        this.f15770f.mo7093M0();
    }

    /* renamed from: N */
    public final void mo7094N(C2007np npVar) {
        this.f15770f.mo7094N(npVar);
    }

    /* renamed from: N0 */
    public final void mo7095N0(C2635a aVar) {
        this.f15770f.mo7095N0(aVar);
    }

    /* renamed from: O */
    public final C2816o mo7096O() {
        return this.f15770f.mo7096O();
    }

    /* renamed from: O0 */
    public final String mo7097O0() {
        return this.f15770f.mo7097O0();
    }

    /* renamed from: P */
    public final void mo7098P(String str, String str2, String str3) {
        this.f15770f.mo7098P(str, str2, (String) null);
    }

    /* renamed from: P0 */
    public final void mo11059P0(int i) {
        this.f15770f.mo11059P0(i);
    }

    /* renamed from: Q0 */
    public final void mo8802Q0(boolean z, int i, String str, String str2, boolean z2) {
        this.f15770f.mo8802Q0(z, i, str, str2, z2);
    }

    /* renamed from: R */
    public final void mo11060R(int i) {
        this.f15770f.mo11060R(i);
    }

    /* renamed from: R0 */
    public final void mo7099R0(C2816o oVar) {
        this.f15770f.mo7099R0(oVar);
    }

    /* renamed from: S */
    public final void mo7100S() {
        this.f15771g.mo7991d();
        this.f15770f.mo7100S();
    }

    /* renamed from: S0 */
    public final void mo8803S0(C2807f fVar, boolean z) {
        this.f15770f.mo8803S0(fVar, z);
    }

    /* renamed from: T */
    public final void mo7101T() {
        this.f15770f.mo7101T();
    }

    /* renamed from: T0 */
    public final void mo8804T0(boolean z, int i, String str, boolean z2) {
        this.f15770f.mo8804T0(z, i, str, z2);
    }

    /* renamed from: V */
    public final void mo7102V(boolean z) {
        this.f15770f.mo7102V(z);
    }

    /* renamed from: W */
    public final void mo11061W() {
        this.f15770f.mo11061W();
    }

    /* renamed from: W0 */
    public final void mo7103W0(a40 a40) {
        this.f15770f.mo7103W0(a40);
    }

    /* renamed from: X */
    public final void mo11062X(boolean z) {
        this.f15770f.mo11062X(false);
    }

    /* renamed from: X0 */
    public final void mo7104X0(boolean z) {
        this.f15770f.mo7104X0(z);
    }

    /* renamed from: Y */
    public final View mo7105Y() {
        return this;
    }

    /* renamed from: Y0 */
    public final void mo7106Y0(y30 y30) {
        this.f15770f.mo7106Y0(y30);
    }

    /* renamed from: a */
    public final void mo7272a(String str, String str2) {
        this.f15770f.mo7272a("window.inspectorInfo", str2);
    }

    /* renamed from: a0 */
    public final a40 mo7107a0() {
        return this.f15770f.mo7107a0();
    }

    /* renamed from: a1 */
    public final void mo10847a1() {
        this.f15770f.mo10847a1();
    }

    /* renamed from: b */
    public final void mo7273b(String str) {
        ((yu0) this.f15770f).mo12088m1(str);
    }

    /* renamed from: b0 */
    public final void mo10848b0() {
        this.f15770f.mo10848b0();
    }

    /* renamed from: b1 */
    public final boolean mo7108b1() {
        return this.f15772h.get();
    }

    /* renamed from: c0 */
    public final boolean mo7109c0() {
        return this.f15770f.mo7109c0();
    }

    /* renamed from: c1 */
    public final void mo9998c1(String str, JSONObject jSONObject) {
        ((yu0) this.f15770f).mo7272a(str, jSONObject.toString());
    }

    public final boolean canGoBack() {
        return this.f15770f.canGoBack();
    }

    /* renamed from: d */
    public final int mo11063d() {
        return this.f15770f.mo11063d();
    }

    /* renamed from: d0 */
    public final void mo11064d0(int i) {
        this.f15770f.mo11064d0(i);
    }

    /* renamed from: d1 */
    public final void mo7111d1(boolean z) {
        this.f15770f.mo7111d1(z);
    }

    public final void destroy() {
        C2635a h0 = mo7125h0();
        if (h0 != null) {
            s33 s33 = C3163g2.f20465i;
            s33.post(new tu0(h0));
            eu0 eu0 = this.f15770f;
            eu0.getClass();
            s33.postDelayed(new su0(eu0), (long) ((Integer) C2199sw.m17001c().mo8579b(m10.f10253C3)).intValue());
            return;
        }
        this.f15770f.destroy();
    }

    /* renamed from: e */
    public final int mo11065e() {
        return this.f15770f.mo11065e();
    }

    /* renamed from: e0 */
    public final void mo7113e0() {
        TextView textView = new TextView(getContext());
        C2694t.m21608q();
        textView.setText(C3163g2.m23923d());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    /* renamed from: e1 */
    public final void mo7114e1(C2816o oVar) {
        this.f15770f.mo7114e1(oVar);
    }

    /* renamed from: f */
    public final int mo11066f() {
        return this.f15770f.mo11066f();
    }

    /* renamed from: f0 */
    public final void mo11067f0(boolean z, long j) {
        this.f15770f.mo11067f0(z, j);
    }

    /* renamed from: g0 */
    public final void mo7115g0(vv0 vv0) {
        this.f15770f.mo7115g0(vv0);
    }

    public final void goBack() {
        this.f15770f.goBack();
    }

    /* renamed from: h */
    public final int mo11068h() {
        return ((Boolean) C2199sw.m17001c().mo8579b(m10.f10638w2)).booleanValue() ? this.f15770f.getMeasuredHeight() : getMeasuredHeight();
    }

    /* renamed from: h0 */
    public final C2635a mo7125h0() {
        return this.f15770f.mo7125h0();
    }

    /* renamed from: i */
    public final int mo11069i() {
        return ((Boolean) C2199sw.m17001c().mo8579b(m10.f10638w2)).booleanValue() ? this.f15770f.getMeasuredWidth() : getMeasuredWidth();
    }

    /* renamed from: i0 */
    public final boolean mo7126i0() {
        return this.f15770f.mo7126i0();
    }

    /* renamed from: j */
    public final Activity mo7127j() {
        return this.f15770f.mo7127j();
    }

    /* renamed from: j0 */
    public final void mo7128j0(boolean z) {
        this.f15770f.mo7128j0(z);
    }

    /* renamed from: l */
    public final po0 mo7129l() {
        return this.f15770f.mo7129l();
    }

    public final void loadData(String str, String str2, String str3) {
        this.f15770f.loadData(str, "text/html", str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f15770f.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", (String) null);
    }

    public final void loadUrl(String str) {
        this.f15770f.loadUrl(str);
    }

    /* renamed from: m */
    public final y10 mo11070m() {
        return this.f15770f.mo11070m();
    }

    /* renamed from: m0 */
    public final void mo5653m0(C2376xn xnVar) {
        this.f15770f.mo5653m0(xnVar);
    }

    /* renamed from: n */
    public final z10 mo7134n() {
        return this.f15770f.mo7134n();
    }

    /* renamed from: o */
    public final C2675a mo7135o() {
        return this.f15770f.mo7135o();
    }

    /* renamed from: o0 */
    public final void mo7136o0() {
        this.f15770f.mo7136o0();
    }

    public final void onPause() {
        this.f15771g.mo7992e();
        this.f15770f.onPause();
    }

    public final void onResume() {
        this.f15770f.onResume();
    }

    /* renamed from: p */
    public final bv0 mo7139p() {
        return this.f15770f.mo7139p();
    }

    /* renamed from: q */
    public final String mo11071q() {
        return this.f15770f.mo11071q();
    }

    /* renamed from: q0 */
    public final void mo8805q0(boolean z, int i, boolean z2) {
        this.f15770f.mo8805q0(z, i, z2);
    }

    /* renamed from: r */
    public final void mo8182r() {
        eu0 eu0 = this.f15770f;
        if (eu0 != null) {
            eu0.mo8182r();
        }
    }

    /* renamed from: r0 */
    public final boolean mo7140r0() {
        return this.f15770f.mo7140r0();
    }

    /* renamed from: s */
    public final void mo6423s(String str, JSONObject jSONObject) {
        this.f15770f.mo6423s(str, jSONObject);
    }

    /* renamed from: s0 */
    public final void mo7141s0(int i) {
        this.f15770f.mo7141s0(i);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f15770f.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f15770f.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f15770f.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f15770f.setWebViewClient(webViewClient);
    }

    /* renamed from: t */
    public final void mo6424t(String str, Map<String, ?> map) {
        this.f15770f.mo6424t(str, map);
    }

    /* renamed from: u */
    public final C2816o mo7147u() {
        return this.f15770f.mo7147u();
    }

    /* renamed from: u0 */
    public final void mo7148u0(String str, C2556m<t70<? super eu0>> mVar) {
        this.f15770f.mo7148u0(str, mVar);
    }

    /* renamed from: v */
    public final WebViewClient mo7149v() {
        return this.f15770f.mo7149v();
    }

    /* renamed from: w */
    public final WebView mo7150w() {
        return (WebView) this.f15770f;
    }

    /* renamed from: x */
    public final vv0 mo7151x() {
        return this.f15770f.mo7151x();
    }

    /* renamed from: x0 */
    public final hq0 mo11072x0() {
        return this.f15771g;
    }

    /* renamed from: y */
    public final String mo11073y() {
        return this.f15770f.mo11073y();
    }

    /* renamed from: y0 */
    public final void mo11074y0(int i) {
        this.f15771g.mo7993f(i);
    }

    /* renamed from: z0 */
    public final cc3<String> mo7152z0() {
        return this.f15770f.mo7152z0();
    }
}
