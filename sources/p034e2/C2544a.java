package p034e2;

import androidx.annotation.RecentlyNonNull;
import p003a2.C0089n;

/* renamed from: e2.a */
public final class C2544a {
    /* renamed from: a */
    public static boolean m21173a(@RecentlyNonNull int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <T> boolean m21174b(@RecentlyNonNull T[] tArr, @RecentlyNonNull T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (!C0089n.m301a(tArr[i], t)) {
                i++;
            } else if (i >= 0) {
                return true;
            }
        }
        return false;
    }
}
