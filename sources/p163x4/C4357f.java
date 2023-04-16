package p163x4;

/* renamed from: x4.f */
class C4357f extends C4356e {
    /* renamed from: a */
    public static int m26993a(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: b */
    public static long m26994b(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: c */
    public static int m26995c(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: d */
    public static long m26996d(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: e */
    public static int m26997e(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* renamed from: f */
    public static C4350a m26998f(int i, int i2) {
        return C4350a.f22694i.mo15970a(i, i2, -1);
    }

    /* renamed from: g */
    public static C4353c m26999g(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? C4353c.f22702j.mo15975a() : new C4353c(i, i2 - 1);
    }
}
