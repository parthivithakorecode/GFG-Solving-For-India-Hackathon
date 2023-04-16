package p084l2;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Set;

/* renamed from: l2.f1 */
public final class C3492f1 {
    /* renamed from: a */
    public static C3488e1 m24877a(Context context, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("/", -1);
        if (split.length == 1) {
            str3 = String.valueOf(context.getPackageName()).concat("_preferences");
            str2 = split[0];
        } else {
            if (split.length == 2) {
                str3 = split[0];
                str2 = split[1];
            }
            return null;
        }
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2)) {
            return new C3488e1(str3, str2);
        }
        return null;
    }

    /* renamed from: b */
    public static void m24878b(Context context, Set<String> set) {
        C3500h1 h1Var = new C3500h1(context);
        for (String next : set) {
            C3488e1 a = m24877a(context, next);
            if (a == null) {
                String valueOf = String.valueOf(next);
                Log.d("UserMessagingPlatform", valueOf.length() != 0 ? "clearKeys: unable to process key: ".concat(valueOf) : new String("clearKeys: unable to process key: "));
            } else {
                h1Var.m24897a(a.f21052a).remove(a.f21053b);
            }
        }
        h1Var.mo14587c();
    }
}
