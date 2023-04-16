package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0554e;
import androidx.core.util.C0740c;

/* renamed from: androidx.core.content.c */
public final class C0608c {
    /* renamed from: a */
    public static int m2483a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String c = C0554e.m2207c(str);
        if (c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return (Process.myUid() == i2 && C0740c.m2946a(context.getPackageName(), str2) ? C0554e.m2205a(context, i2, c, str2) : C0554e.m2206b(context, c, str2)) == 0 ? 0 : -2;
    }

    /* renamed from: b */
    public static int m2484b(Context context, String str) {
        return m2483a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
