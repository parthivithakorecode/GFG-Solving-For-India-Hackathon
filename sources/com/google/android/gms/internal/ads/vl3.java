package com.google.android.gms.internal.ads;

public final class vl3 {

    /* renamed from: a */
    private static final dq3<vl3> f16350a = new ul3();

    /* renamed from: a */
    public static int m18595a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m18596b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 6;
        }
        return 5;
    }
}
