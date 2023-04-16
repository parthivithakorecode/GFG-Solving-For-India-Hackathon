package p084l2;

import android.os.Handler;
import android.webkit.WebView;
import org.json.JSONObject;

/* renamed from: l2.g0 */
public final class C3495g0 extends WebView {

    /* renamed from: f */
    private final Handler f21062f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C3515l0 f21063g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f21064h = false;

    public C3495g0(C3507j0 j0Var, Handler handler, C3515l0 l0Var) {
        super(j0Var);
        this.f21062f = handler;
        this.f21063g = l0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m24884c(String str) {
        return str != null && str.startsWith("consent://");
    }

    /* renamed from: b */
    public final void mo14581b(String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        this.f21062f.post(new C3491f0(this, sb.toString()));
    }
}
