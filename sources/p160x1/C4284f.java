package p160x1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import p003a2.C0069f1;
import p034e2.C2551h;
import p041f2.C2606c;

/* renamed from: x1.f */
public class C4284f {

    /* renamed from: a */
    public static final int f22589a = C4288j.f22593a;

    /* renamed from: b */
    private static final C4284f f22590b = new C4284f();

    C4284f() {
    }

    @RecentlyNonNull
    /* renamed from: f */
    public static C4284f m26845f() {
        return f22590b;
    }

    /* renamed from: a */
    public int mo15874a(@RecentlyNonNull Context context) {
        return C4288j.m26855a(context);
    }

    @RecentlyNullable
    /* renamed from: b */
    public Intent mo15859b(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context != null && C2551h.m21197g(context)) {
                return C0069f1.m266c();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f22589a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(C2606c.m21299a(context).mo12496f(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return C0069f1.m265b("com.google.android.gms", sb.toString());
        } else if (i != 3) {
            return null;
        } else {
            return C0069f1.m264a("com.google.android.gms");
        }
    }

    @RecentlyNullable
    /* renamed from: c */
    public PendingIntent mo15860c(@RecentlyNonNull Context context, int i, int i2) {
        return mo15875d(context, i, i2, (String) null);
    }

    @RecentlyNullable
    /* renamed from: d */
    public PendingIntent mo15875d(@RecentlyNonNull Context context, int i, int i2, String str) {
        Intent b = mo15859b(context, i, str);
        if (b == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, b, 134217728);
    }

    /* renamed from: e */
    public String mo15861e(int i) {
        return C4288j.m26856b(i);
    }

    /* renamed from: g */
    public int mo15862g(@RecentlyNonNull Context context) {
        return mo15863h(context, f22589a);
    }

    /* renamed from: h */
    public int mo15863h(@RecentlyNonNull Context context, int i) {
        int e = C4288j.m26859e(context, i);
        if (C4288j.m26860f(context, e)) {
            return 18;
        }
        return e;
    }

    /* renamed from: i */
    public boolean mo15864i(int i) {
        return C4288j.m26862h(i);
    }
}
