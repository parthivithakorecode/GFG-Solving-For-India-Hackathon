package p084l2;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: l2.z1 */
final /* synthetic */ class C3568z1 implements Callable {

    /* renamed from: a */
    private final C3481c2 f21264a;

    /* renamed from: b */
    private final String f21265b;

    /* renamed from: c */
    private final JSONObject f21266c;

    C3568z1(C3481c2 c2Var, String str, JSONObject jSONObject) {
        this.f21264a = c2Var;
        this.f21265b = str;
        this.f21266c = jSONObject;
    }

    public final Object call() {
        return Boolean.valueOf(this.f21264a.mo14570a(this.f21265b, this.f21266c));
    }
}
