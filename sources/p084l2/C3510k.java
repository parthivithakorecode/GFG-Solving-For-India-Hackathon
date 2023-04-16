package p084l2;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: l2.k */
public final class C3510k implements C3481c2 {

    /* renamed from: a */
    private final Application f21106a;

    /* renamed from: b */
    private final C3518m f21107b;

    /* renamed from: c */
    private final Executor f21108c;

    public C3510k(Application application, C3518m mVar, Executor executor) {
        this.f21106a = application;
        this.f21107b = mVar;
        this.f21108c = executor;
    }

    /* renamed from: a */
    public final boolean mo14570a(String str, JSONObject jSONObject) {
        str.hashCode();
        if (str.equals("clear")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("keys");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                String valueOf = String.valueOf(jSONObject.toString());
                Log.d("UserMessagingPlatform", valueOf.length() != 0 ? "Action[clear]: wrong args.".concat(valueOf) : new String("Action[clear]: wrong args."));
            } else {
                HashSet hashSet = new HashSet();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString = optJSONArray.optString(i);
                    if (TextUtils.isEmpty(optString)) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("Action[clear]: empty key at index: ");
                        sb.append(i);
                        Log.d("UserMessagingPlatform", sb.toString());
                    } else {
                        hashSet.add(optString);
                    }
                }
                C3492f1.m24878b(this.f21106a, hashSet);
            }
            return true;
        } else if (!str.equals("write")) {
            return false;
        } else {
            C3500h1 h1Var = new C3500h1(this.f21106a);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                String valueOf2 = String.valueOf(opt);
                StringBuilder sb2 = new StringBuilder(String.valueOf(next).length() + 23 + valueOf2.length());
                sb2.append("Writing to storage: [");
                sb2.append(next);
                sb2.append("] ");
                sb2.append(valueOf2);
                Log.d("UserMessagingPlatform", sb2.toString());
                if (h1Var.mo14588d(next, opt)) {
                    this.f21107b.mo14612f().add(next);
                } else {
                    String valueOf3 = String.valueOf(next);
                    Log.d("UserMessagingPlatform", valueOf3.length() != 0 ? "Failed writing key: ".concat(valueOf3) : new String("Failed writing key: "));
                }
            }
            this.f21107b.mo14613g();
            h1Var.mo14587c();
            return true;
        }
    }

    public final Executor zza() {
        return this.f21108c;
    }
}
