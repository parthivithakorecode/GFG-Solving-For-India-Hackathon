package p034e2;

import android.util.Base64;
import androidx.annotation.RecentlyNonNull;

/* renamed from: e2.b */
public final class C2545b {
    @RecentlyNonNull
    /* renamed from: a */
    public static String m21175a(@RecentlyNonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }
}
