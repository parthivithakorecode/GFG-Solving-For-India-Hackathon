package p114p4;

/* renamed from: p4.c */
public final class C3929c {
    /* renamed from: a */
    private static final int m26090a(int i, int i2, int i3) {
        return m26092c(m26092c(i, i3) - m26092c(i2, i3), i3);
    }

    /* renamed from: b */
    public static final int m26091b(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m26090a(i2, i, i3);
        }
        if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m26090a(i, i2, -i3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: c */
    private static final int m26092c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }
}
