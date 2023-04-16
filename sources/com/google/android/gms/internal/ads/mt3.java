package com.google.android.gms.internal.ads;

public enum mt3 {
    DOUBLE(nt3.DOUBLE, 1),
    FLOAT(nt3.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(nt3.BOOLEAN, 0),
    STRING(nt3.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(nt3.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(nt3.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: f */
    private final nt3 f11046f;

    private mt3(nt3 nt3, int i) {
        this.f11046f = nt3;
    }

    /* renamed from: b */
    public final nt3 mo9364b() {
        return this.f11046f;
    }
}
