package p064i4;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: i4.b */
public final class C2848b {
    /* renamed from: a */
    public static String m22346a(Context context) {
        File file;
        if (Build.VERSION.SDK_INT < 21 || (file = context.getCodeCacheDir()) == null) {
            file = context.getCacheDir();
        }
        if (file == null) {
            file = new File(m22347b(context), "cache");
        }
        return file.getPath();
    }

    /* renamed from: b */
    private static String m22347b(Context context) {
        return Build.VERSION.SDK_INT >= 24 ? context.getDataDir().getPath() : context.getApplicationInfo().dataDir;
    }

    /* renamed from: c */
    public static String m22348c(Context context) {
        File dir = context.getDir("flutter", 0);
        if (dir == null) {
            dir = new File(m22347b(context), "app_flutter");
        }
        return dir.getPath();
    }

    /* renamed from: d */
    public static String m22349d(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            filesDir = new File(m22347b(context), "files");
        }
        return filesDir.getPath();
    }
}
