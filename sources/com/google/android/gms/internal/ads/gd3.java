package com.google.android.gms.internal.ads;

public final class gd3 {

    /* renamed from: a */
    private final tk3 f7378a;

    private gd3(tk3 tk3) {
        this.f7378a = tk3;
    }

    /* renamed from: d */
    public static gd3 m9693d(String str, byte[] bArr, int i) {
        sk3 F = tk3.m17323F();
        F.mo10806r(str);
        F.mo10807s(uo3.m17968I(bArr));
        int i2 = i - 1;
        F.mo10808t(i2 != 0 ? i2 != 1 ? 5 : 4 : 3);
        return new gd3((tk3) F.mo11894o());
    }

    /* renamed from: a */
    public final String mo7590a() {
        return this.f7378a.mo11011J();
    }

    /* renamed from: b */
    public final byte[] mo7591b() {
        return this.f7378a.mo11010I().mo11272l();
    }

    /* renamed from: c */
    public final int mo7592c() {
        int M = this.f7378a.mo11012M() - 2;
        int i = 1;
        if (M != 1) {
            i = 2;
            if (M != 2) {
                i = 3;
                if (M != 3) {
                    if (M == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
