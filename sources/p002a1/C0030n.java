package p002a1;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.C2199sw;
import com.google.android.gms.internal.ads.m10;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: a1.n */
public final class C0030n extends C0013a {

    /* renamed from: e */
    private final C0039v f50e;

    public C0030n(int i, @RecentlyNonNull String str, @RecentlyNonNull String str2, C0013a aVar, C0039v vVar) {
        super(i, str, str2, aVar);
        this.f50e = vVar;
    }

    @RecentlyNonNull
    /* renamed from: e */
    public final JSONObject mo23e() {
        JSONObject e = super.mo23e();
        C0039v f = mo103f();
        e.put("Response Info", f == null ? "null" : f.mo120f());
        return e;
    }

    @RecentlyNullable
    /* renamed from: f */
    public C0039v mo103f() {
        if (((Boolean) C2199sw.m17001c().mo8579b(m10.f10484e6)).booleanValue()) {
            return this.f50e;
        }
        return null;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return mo23e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
