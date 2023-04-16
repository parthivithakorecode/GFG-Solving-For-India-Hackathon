package p069j1;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* renamed from: j1.k1 */
final class C3178k1 implements Callable<String> {

    /* renamed from: a */
    final /* synthetic */ Context f20491a;

    /* renamed from: b */
    final /* synthetic */ Context f20492b;

    C3178k1(C3182l1 l1Var, Context context, Context context2) {
        this.f20491a = context;
        this.f20492b = context2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f20491a != null) {
            C3202r1.m24015k("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f20491a.getSharedPreferences("admob_user_agent", 0);
        } else {
            C3202r1.m24015k("Attempting to read user agent from local cache.");
            sharedPreferences = this.f20492b.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            C3202r1.m24015k("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f20492b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                C3202r1.m24015k("Persisting user agent.");
            }
        }
        return string;
    }
}
