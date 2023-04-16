package p054h1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.C1571by;
import com.google.android.gms.internal.ads.C1609cz;
import com.google.android.gms.internal.ads.C1644dx;
import com.google.android.gms.internal.ads.C1734gb;
import com.google.android.gms.internal.ads.C1771hb;
import com.google.android.gms.internal.ads.C1795hz;
import com.google.android.gms.internal.ads.C1902kv;
import com.google.android.gms.internal.ads.C1978mx;
import com.google.android.gms.internal.ads.C2087pv;
import com.google.android.gms.internal.ads.C2125qw;
import com.google.android.gms.internal.ads.C2163rx;
import com.google.android.gms.internal.ads.C2274ux;
import com.google.android.gms.internal.ads.C2309vv;
import com.google.android.gms.internal.ads.C2341wp;
import com.google.android.gms.internal.ads.C2348ww;
import com.google.android.gms.internal.ads.C2350wy;
import com.google.android.gms.internal.ads.C2423yx;
import com.google.android.gms.internal.ads.C2459zw;
import com.google.android.gms.internal.ads.C2461zy;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.i20;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.jh0;
import com.google.android.gms.internal.ads.mh0;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.r20;
import com.google.android.gms.internal.ads.s00;
import com.google.android.gms.internal.ads.sj0;
import com.google.android.gms.internal.ads.wo0;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;
import p003a2.C0092o;
import p048g2.C2635a;
import p048g2.C2637b;

@ParametersAreNonnullByDefault
/* renamed from: h1.s */
public final class C2693s extends C1978mx {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final po0 f19154f;

    /* renamed from: g */
    private final C2087pv f19155g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Future<C1734gb> f19156h = wo0.f16886a.mo6445C(new C2689o(this));
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Context f19157i;

    /* renamed from: j */
    private final C2692r f19158j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public WebView f19159k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C2459zw f19160l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C1734gb f19161m;

    /* renamed from: n */
    private AsyncTask<Void, Void, String> f19162n;

    public C2693s(Context context, C2087pv pvVar, String str, po0 po0) {
        this.f19157i = context;
        this.f19154f = po0;
        this.f19155g = pvVar;
        this.f19159k = new WebView(context);
        this.f19158j = new C2692r(context, str);
        mo12697z5(0);
        this.f19159k.setVerticalScrollBarEnabled(false);
        this.f19159k.getSettings().setJavaScriptEnabled(true);
        this.f19159k.setWebViewClient(new C2687m(this));
        this.f19159k.setOnTouchListener(new C2688n(this));
    }

    /* renamed from: F5 */
    static /* bridge */ /* synthetic */ String m21543F5(C2693s sVar, String str) {
        if (sVar.f19161m == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = sVar.f19161m.mo7558a(parse, sVar.f19157i, (View) null, (Activity) null);
        } catch (C1771hb e) {
            io0.m11132h("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* renamed from: I5 */
    static /* bridge */ /* synthetic */ void m21546I5(C2693s sVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        sVar.f19157i.startActivity(intent);
    }

    /* renamed from: A0 */
    public final boolean mo7450A0() {
        return false;
    }

    /* renamed from: C4 */
    public final void mo7451C4(C2341wp wpVar) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: E4 */
    public final void mo7452E4(C2350wy wyVar) {
    }

    /* renamed from: F */
    public final void mo7453F() {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: G */
    public final void mo7454G() {
        C0092o.m309e("resume must be called on the main UI thread.");
    }

    /* renamed from: I3 */
    public final void mo7455I3(String str) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: K4 */
    public final void mo7456K4(jh0 jh0) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: M */
    public final void mo7457M() {
        C0092o.m309e("destroy must be called on the main UI thread.");
        this.f19162n.cancel(true);
        this.f19156h.cancel(true);
        this.f19159k.destroy();
        this.f19159k = null;
    }

    /* renamed from: M4 */
    public final void mo7458M4(C2163rx rxVar) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: Q3 */
    public final void mo7459Q3(i20 i20) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: R0 */
    public final void mo7460R0(C2635a aVar) {
    }

    /* renamed from: S2 */
    public final void mo7461S2(C2459zw zwVar) {
        this.f19160l = zwVar;
    }

    /* renamed from: S3 */
    public final void mo7462S3(C1795hz hzVar) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: U */
    public final void mo7463U() {
        C0092o.m309e("pause must be called on the main UI thread.");
    }

    /* renamed from: U0 */
    public final void mo7464U0(C2348ww wwVar) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: U3 */
    public final boolean mo7465U3() {
        return false;
    }

    /* renamed from: W3 */
    public final void mo7466W3(C2423yx yxVar) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: X3 */
    public final boolean mo7467X3(C1902kv kvVar) {
        C0092o.m314j(this.f19159k, "This Search Ad has already been torn down");
        this.f19158j.mo12693f(kvVar, this.f19154f);
        this.f19162n = new C2691q(this, (C2690p) null).execute(new Void[0]);
        return true;
    }

    /* renamed from: Y1 */
    public final void mo7468Y1(C1902kv kvVar, C1644dx dxVar) {
    }

    /* renamed from: b1 */
    public final void mo7469b1(String str) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: b4 */
    public final void mo7470b4(C2309vv vvVar) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: d2 */
    public final void mo7471d2(C1571by byVar) {
    }

    /* renamed from: e */
    public final C2087pv mo7472e() {
        return this.f19155g;
    }

    /* renamed from: g */
    public final Bundle mo7473g() {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: h */
    public final C2459zw mo7474h() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    /* renamed from: i */
    public final C2274ux mo7475i() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    /* renamed from: j */
    public final C2461zy mo7476j() {
        return null;
    }

    /* renamed from: k */
    public final C1609cz mo7477k() {
        return null;
    }

    /* renamed from: k2 */
    public final void mo7478k2(sj0 sj0) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: k3 */
    public final void mo7479k3(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final String mo12694l() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(r20.f13479d.mo9928e());
        builder.appendQueryParameter("query", this.f19158j.mo12691d());
        builder.appendQueryParameter("pubId", this.f19158j.mo12690c());
        builder.appendQueryParameter("mappver", this.f19158j.mo12688a());
        Map<String, String> e = this.f19158j.mo12692e();
        for (String next : e.keySet()) {
            builder.appendQueryParameter(next, e.get(next));
        }
        Uri build = builder.build();
        C1734gb gbVar = this.f19161m;
        if (gbVar != null) {
            try {
                build = gbVar.mo7559b(build, this.f19157i);
            } catch (C1771hb e2) {
                io0.m11132h("Unable to process ad data", e2);
            }
        }
        String r = mo12695r();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(r.length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(r);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* renamed from: m */
    public final C2635a mo7480m() {
        C0092o.m309e("getAdFrame must be called on the main UI thread.");
        return C2637b.m21358Z2(this.f19159k);
    }

    /* renamed from: m5 */
    public final void mo7481m5(boolean z) {
    }

    /* renamed from: n3 */
    public final void mo7482n3(C2274ux uxVar) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: n5 */
    public final void mo7483n5(s00 s00) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: o0 */
    public final void mo7484o0() {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: p */
    public final String mo7485p() {
        return null;
    }

    /* renamed from: q */
    public final String mo7486q() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final String mo12695r() {
        String b = this.f19158j.mo12689b();
        if (true == TextUtils.isEmpty(b)) {
            b = "www.google.com";
        }
        String e = r20.f13479d.mo9928e();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 8 + String.valueOf(e).length());
        sb.append("https://");
        sb.append(b);
        sb.append(e);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final int mo12696s(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            C2125qw.m15897b();
            return bo0.m6995s(this.f19157i, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: s3 */
    public final void mo7487s3(C2087pv pvVar) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    /* renamed from: t */
    public final String mo7488t() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    /* renamed from: y1 */
    public final void mo7489y1(mh0 mh0, String str) {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z5 */
    public final void mo12697z5(int i) {
        if (this.f19159k != null) {
            this.f19159k.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
        }
    }
}
