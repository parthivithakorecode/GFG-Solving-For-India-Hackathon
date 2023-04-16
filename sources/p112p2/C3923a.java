package p112p2;

import android.content.Context;
import android.content.res.Resources;
import p160x1.C4290l;

/* renamed from: p2.a */
public final class C3923a {
    /* renamed from: a */
    public static String m26080a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C4290l.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: b */
    public static final String m26081b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
