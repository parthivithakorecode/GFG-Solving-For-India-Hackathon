package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

public final class p14 {

    /* renamed from: f */
    public static final my3<p14> f12422f = o04.f11800a;

    /* renamed from: a */
    public final int f12423a;

    /* renamed from: b */
    public final int f12424b;

    /* renamed from: c */
    public final int f12425c;

    /* renamed from: d */
    public final byte[] f12426d;

    /* renamed from: e */
    private int f12427e;

    public p14(int i, int i2, int i3, byte[] bArr) {
        this.f12423a = i;
        this.f12424b = i2;
        this.f12425c = i3;
        this.f12426d = bArr;
    }

    @Pure
    /* renamed from: a */
    public static int m14760a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    /* renamed from: b */
    public static int m14761b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p14.class == obj.getClass()) {
            p14 p14 = (p14) obj;
            return this.f12423a == p14.f12423a && this.f12424b == p14.f12424b && this.f12425c == p14.f12425c && Arrays.equals(this.f12426d, p14.f12426d);
        }
    }

    public final int hashCode() {
        int i = this.f12427e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.f12423a + 527) * 31) + this.f12424b) * 31) + this.f12425c) * 31) + Arrays.hashCode(this.f12426d);
        this.f12427e = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.f12423a;
        int i2 = this.f12424b;
        int i3 = this.f12425c;
        boolean z = this.f12426d != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
