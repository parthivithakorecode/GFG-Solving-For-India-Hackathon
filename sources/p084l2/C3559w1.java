package p084l2;

import java.util.Objects;

/* renamed from: l2.w1 */
public final class C3559w1 {
    /* renamed from: a */
    public static <T> T m24965a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    public static <T> T m24966b(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: c */
    public static <T> void m24967c(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
