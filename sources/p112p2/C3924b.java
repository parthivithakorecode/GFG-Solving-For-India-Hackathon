package p112p2;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import p003a2.C0092o;

/* renamed from: p2.b */
public final class C3924b {
    /* renamed from: a */
    public static String m26082a(Context context, String str, String str2) {
        C0092o.m313i(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = C3923a.m26080a(context);
        }
        return C3923a.m26081b("google_app_id", resources, str2);
    }
}
