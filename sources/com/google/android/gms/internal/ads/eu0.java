package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import javax.annotation.ParametersAreNonnullByDefault;
import p034e2.C2556m;
import p048g2.C2635a;
import p054h1.C2675a;
import p054h1.C2686l;
import p061i1.C2816o;

@ParametersAreNonnullByDefault
public interface eu0 extends C2420yu, pi1, vt0, da0, cv0, gv0, qa0, C2450zn, kv0, C2686l, nv0, ov0, tq0, pv0 {
    /* renamed from: A */
    rr2 mo7073A();

    /* renamed from: A0 */
    void mo7074A0();

    /* renamed from: C */
    void mo7075C(bv0 bv0);

    /* renamed from: C0 */
    boolean mo7076C0();

    /* renamed from: D0 */
    tv0 mo7077D0();

    /* renamed from: E */
    void mo7078E(String str, ts0 ts0);

    /* renamed from: E0 */
    void mo7079E0(Context context);

    /* renamed from: F */
    ur2 mo6308F();

    /* renamed from: F0 */
    void mo7080F0(String str, t70<? super eu0> t70);

    /* renamed from: G */
    void mo7081G(boolean z);

    /* renamed from: G0 */
    void mo7082G0(String str, t70<? super eu0> t70);

    /* renamed from: H */
    C1734gb mo7083H();

    /* renamed from: H0 */
    void mo7084H0(int i);

    /* renamed from: I */
    Context mo7085I();

    /* renamed from: I0 */
    void mo7086I0();

    /* renamed from: J */
    C2007np mo7087J();

    /* renamed from: J0 */
    void mo7088J0(boolean z);

    /* renamed from: K */
    void mo7089K();

    /* renamed from: K0 */
    boolean mo7090K0();

    /* renamed from: L0 */
    boolean mo7091L0(boolean z, int i);

    /* renamed from: M */
    void mo7092M(rr2 rr2, ur2 ur2);

    /* renamed from: M0 */
    void mo7093M0();

    /* renamed from: N */
    void mo7094N(C2007np npVar);

    /* renamed from: N0 */
    void mo7095N0(C2635a aVar);

    /* renamed from: O */
    C2816o mo7096O();

    /* renamed from: O0 */
    String mo7097O0();

    /* renamed from: P */
    void mo7098P(String str, String str2, String str3);

    /* renamed from: R0 */
    void mo7099R0(C2816o oVar);

    /* renamed from: S */
    void mo7100S();

    /* renamed from: T */
    void mo7101T();

    /* renamed from: V */
    void mo7102V(boolean z);

    /* renamed from: W0 */
    void mo7103W0(a40 a40);

    /* renamed from: X0 */
    void mo7104X0(boolean z);

    /* renamed from: Y */
    View mo7105Y();

    /* renamed from: Y0 */
    void mo7106Y0(y30 y30);

    /* renamed from: a0 */
    a40 mo7107a0();

    /* renamed from: b1 */
    boolean mo7108b1();

    /* renamed from: c0 */
    boolean mo7109c0();

    boolean canGoBack();

    /* renamed from: d1 */
    void mo7111d1(boolean z);

    void destroy();

    /* renamed from: e0 */
    void mo7113e0();

    /* renamed from: e1 */
    void mo7114e1(C2816o oVar);

    /* renamed from: g0 */
    void mo7115g0(vv0 vv0);

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    /* renamed from: h0 */
    C2635a mo7125h0();

    /* renamed from: i0 */
    boolean mo7126i0();

    /* renamed from: j */
    Activity mo7127j();

    /* renamed from: j0 */
    void mo7128j0(boolean z);

    /* renamed from: l */
    po0 mo7129l();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    /* renamed from: n */
    z10 mo7134n();

    /* renamed from: o */
    C2675a mo7135o();

    /* renamed from: o0 */
    void mo7136o0();

    void onPause();

    void onResume();

    /* renamed from: p */
    bv0 mo7139p();

    /* renamed from: r0 */
    boolean mo7140r0();

    /* renamed from: s0 */
    void mo7141s0(int i);

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    /* renamed from: u */
    C2816o mo7147u();

    /* renamed from: u0 */
    void mo7148u0(String str, C2556m<t70<? super eu0>> mVar);

    /* renamed from: v */
    WebViewClient mo7149v();

    /* renamed from: w */
    WebView mo7150w();

    /* renamed from: x */
    vv0 mo7151x();

    /* renamed from: z0 */
    cc3<String> mo7152z0();
}
