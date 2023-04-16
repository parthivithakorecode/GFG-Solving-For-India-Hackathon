package p111p1;

import android.webkit.ValueCallback;
import com.google.android.gms.internal.ads.io0;
import org.json.JSONException;
import org.json.JSONObject;
import p118q1.C3941b;
import p118q1.C3942c;

/* renamed from: p1.k */
final class C3907k extends C3942c {

    /* renamed from: a */
    final /* synthetic */ String f22041a;

    /* renamed from: b */
    final /* synthetic */ C3887a f22042b;

    C3907k(C3887a aVar, String str) {
        this.f22042b = aVar;
        this.f22041a = str;
    }

    /* renamed from: a */
    public final void mo15368a(String str) {
        String valueOf = String.valueOf(str);
        io0.m11131g(valueOf.length() != 0 ? "Failed to generate query info for the tagging library, error: ".concat(valueOf) : new String("Failed to generate query info for the tagging library, error: "));
        this.f22042b.f21973b.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", new Object[]{this.f22041a, str}), (ValueCallback) null);
    }

    /* renamed from: b */
    public final void mo15369b(C3941b bVar) {
        String str;
        String b = bVar.mo15405b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f22041a);
            jSONObject.put("signal", b);
            str = String.format("window.postMessage(%1$s, '*');", new Object[]{jSONObject});
        } catch (JSONException unused) {
            str = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", new Object[]{this.f22041a, bVar.mo15405b()});
        }
        this.f22042b.f21973b.evaluateJavascript(str, (ValueCallback) null);
    }
}
