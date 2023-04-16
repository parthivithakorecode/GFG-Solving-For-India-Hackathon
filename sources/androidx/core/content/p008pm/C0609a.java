package androidx.core.content.p008pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;

/* renamed from: androidx.core.content.pm.a */
public final class C0609a {

    /* renamed from: androidx.core.content.pm.a$a */
    private static class C0610a {
        /* renamed from: a */
        static Signature[] m2486a(SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        /* renamed from: b */
        static long m2487b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        /* renamed from: c */
        static Signature[] m2488c(SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        /* renamed from: d */
        static boolean m2489d(SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        /* renamed from: e */
        static boolean m2490e(PackageManager packageManager, String str, byte[] bArr, int i) {
            return packageManager.hasSigningCertificate(str, bArr, i);
        }
    }

    /* renamed from: a */
    public static long m2485a(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C0610a.m2487b(packageInfo) : (long) packageInfo.versionCode;
    }
}
