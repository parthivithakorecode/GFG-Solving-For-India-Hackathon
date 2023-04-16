package p006a5;

import kotlin.jvm.internal.C3357i;

/* renamed from: a5.m */
class C0177m extends C0176l {
    /* renamed from: f */
    public static Long m506f(String str) {
        C3357i.m24508e(str, "<this>");
        return m507g(str, 10);
    }

    /* renamed from: g */
    public static final Long m507g(String str, int i) {
        String str2 = str;
        int i2 = i;
        C3357i.m24508e(str2, "<this>");
        C0161a.m470a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str2.charAt(0);
        long j = -9223372036854775807L;
        boolean z = true;
        if (C3357i.m24509f(charAt, 48) >= 0) {
            z = false;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                i3 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
                i3 = 1;
            }
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i3 < length) {
            int b = C0161a.m471b(str2.charAt(i3), i2);
            if (b < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 == j2) {
                    j4 = j / ((long) i2);
                    if (j3 < j4) {
                    }
                }
                return null;
            }
            long j5 = j3 * ((long) i2);
            long j6 = (long) b;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i3++;
            j2 = -256204778801521550L;
        }
        return z ? Long.valueOf(j3) : Long.valueOf(-j3);
    }
}
