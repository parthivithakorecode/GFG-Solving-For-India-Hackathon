package p084l2;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: l2.b1 */
public final class C3475b1 {

    /* renamed from: a */
    private static String f21033a;

    /* renamed from: a */
    public static synchronized String m24860a(Context context) {
        String str;
        synchronized (C3475b1.class) {
            if (f21033a == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || m24862c()) {
                    string = "emulator";
                }
                f21033a = m24861b(string);
            }
            str = f21033a;
        }
        return str;
    }

    /* renamed from: b */
    private static String m24861b(String str) {
        int i = 0;
        while (i < 3) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format("%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return "";
            }
        }
        return "";
    }

    /* renamed from: c */
    public static boolean m24862c() {
        String str = Build.FINGERPRINT;
        if (str.startsWith("generic") || str.startsWith("unknown")) {
            return true;
        }
        String str2 = Build.MODEL;
        if (str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
            return true;
        }
        return (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }
}
