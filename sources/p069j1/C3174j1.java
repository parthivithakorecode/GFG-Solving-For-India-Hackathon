package p069j1;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;
import p034e2.C2557n;

/* renamed from: j1.j1 */
final class C3174j1 implements Callable<String> {

    /* renamed from: a */
    final /* synthetic */ Context f20489a;

    C3174j1(C3182l1 l1Var, Context context) {
        this.f20489a = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        SharedPreferences sharedPreferences = this.f20489a.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            C3202r1.m24015k("User agent is not initialized on Google Play Services. Initializing.");
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f20489a);
            C2557n.m21219a(this.f20489a, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
            return defaultUserAgent;
        }
        C3202r1.m24015k("User agent is already initialized on Google Play Services.");
        return string;
    }
}
