package p034e2;

import androidx.annotation.RecentlyNonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p102o.C3801a;
import p102o.C3803b;

/* renamed from: e2.e */
public final class C2548e {
    @RecentlyNonNull
    /* renamed from: a */
    public static <K, V> Map<K, V> m21180a(@RecentlyNonNull K k, @RecentlyNonNull V v, @RecentlyNonNull K k2, @RecentlyNonNull V v2, @RecentlyNonNull K k3, @RecentlyNonNull V v3) {
        Map f = m21185f(3, false);
        f.put(k, v);
        f.put(k2, v2);
        f.put(k3, v3);
        return Collections.unmodifiableMap(f);
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static <K, V> Map<K, V> m21181b(@RecentlyNonNull K[] kArr, @RecentlyNonNull V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            StringBuilder sb = new StringBuilder(66);
            sb.append("Key and values array lengths not equal: ");
            sb.append(length);
            sb.append(" != ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        } else if (length == 0) {
            return Collections.emptyMap();
        } else {
            if (length == 1) {
                return Collections.singletonMap(kArr[0], vArr[0]);
            }
            Map f = m21185f(length, false);
            for (int i = 0; i < kArr.length; i++) {
                f.put(kArr[i], vArr[i]);
            }
            return Collections.unmodifiableMap(f);
        }
    }

    @RecentlyNonNull
    @Deprecated
    /* renamed from: c */
    public static <T> Set<T> m21182c(@RecentlyNonNull T t, @RecentlyNonNull T t2, @RecentlyNonNull T t3) {
        Set e = m21184e(3, false);
        e.add(t);
        e.add(t2);
        e.add(t3);
        return Collections.unmodifiableSet(e);
    }

    @RecentlyNonNull
    @Deprecated
    /* renamed from: d */
    public static <T> Set<T> m21183d(@RecentlyNonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            Set e = m21184e(2, false);
            e.add(t);
            e.add(t2);
            return Collections.unmodifiableSet(e);
        } else if (length == 3) {
            return m21182c(tArr[0], tArr[1], tArr[2]);
        } else {
            if (length != 4) {
                Set e2 = m21184e(length, false);
                Collections.addAll(e2, tArr);
                return Collections.unmodifiableSet(e2);
            }
            T t3 = tArr[0];
            T t4 = tArr[1];
            T t5 = tArr[2];
            T t6 = tArr[3];
            Set e3 = m21184e(4, false);
            e3.add(t3);
            e3.add(t4);
            e3.add(t5);
            e3.add(t6);
            return Collections.unmodifiableSet(e3);
        }
    }

    /* renamed from: e */
    private static <T> Set<T> m21184e(int i, boolean z) {
        return i <= (true != z ? 256 : 128) ? new C3803b(i) : new HashSet(i, true != z ? 1.0f : 0.75f);
    }

    /* renamed from: f */
    private static <K, V> Map<K, V> m21185f(int i, boolean z) {
        return i <= 256 ? new C3801a(i) : new HashMap(i, 1.0f);
    }
}
