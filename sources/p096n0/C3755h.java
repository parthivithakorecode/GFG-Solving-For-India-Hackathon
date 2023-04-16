package p096n0;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p089m0.C3646j;

/* renamed from: n0.h */
public class C3755h {

    /* renamed from: a */
    private static final String f21618a = C3646j.m25231f("WrkDbPathHelper");

    /* renamed from: b */
    private static final String[] f21619b = {"-journal", "-shm", "-wal"};

    /* renamed from: a */
    public static File m25534a(Context context) {
        return Build.VERSION.SDK_INT < 23 ? m25535b(context) : m25536c(context, "androidx.work.workdb");
    }

    /* renamed from: b */
    public static File m25535b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    /* renamed from: c */
    private static File m25536c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    /* renamed from: d */
    public static String m25537d() {
        return "androidx.work.workdb";
    }

    /* renamed from: e */
    public static void m25538e(Context context) {
        String str;
        File b = m25535b(context);
        if (Build.VERSION.SDK_INT >= 23 && b.exists()) {
            C3646j.m25229c().mo14806a(f21618a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> f = m25539f(context);
            for (File next : f.keySet()) {
                File file = f.get(next);
                if (next.exists() && file != null) {
                    if (file.exists()) {
                        C3646j.m25229c().mo14810h(f21618a, String.format("Over-writing contents of %s", new Object[]{file}), new Throwable[0]);
                    }
                    if (next.renameTo(file)) {
                        str = String.format("Migrated %s to %s", new Object[]{next, file});
                    } else {
                        str = String.format("Renaming %s to %s failed", new Object[]{next, file});
                    }
                    C3646j.m25229c().mo14806a(f21618a, str, new Throwable[0]);
                }
            }
        }
    }

    /* renamed from: f */
    public static Map<File, File> m25539f(Context context) {
        HashMap hashMap = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            File b = m25535b(context);
            File a = m25534a(context);
            hashMap.put(b, a);
            for (String str : f21619b) {
                hashMap.put(new File(b.getPath() + str), new File(a.getPath() + str));
            }
        }
        return hashMap;
    }
}
