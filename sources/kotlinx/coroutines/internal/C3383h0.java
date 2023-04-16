package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.h0 */
final /* synthetic */ class C3383h0 {
    /* renamed from: a */
    public static final int m24594a(String str, int i, int i2, int i3) {
        return (int) C3379f0.m24576c(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: b */
    public static final long m24595b(String str, long j, long j2, long j3) {
        String d = C3379f0.m24577d(str);
        if (d == null) {
            return j;
        }
        Long f = C0177m.m506f(d);
        if (f != null) {
            long longValue = f.longValue();
            boolean z = false;
            if (j2 <= longValue && longValue <= j3) {
                z = true;
            }
            if (z) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d + '\'').toString());
    }

    /* renamed from: c */
    public static final boolean m24596c(String str, boolean z) {
        String d = C3379f0.m24577d(str);
        return d == null ? z : Boolean.parseBoolean(d);
    }

    /* renamed from: d */
    public static /* synthetic */ int m24597d(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C3379f0.m24575b(str, i, i2, i3);
    }

    /* renamed from: e */
    public static /* synthetic */ long m24598e(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C3379f0.m24576c(str, j, j4, j3);
    }
}
