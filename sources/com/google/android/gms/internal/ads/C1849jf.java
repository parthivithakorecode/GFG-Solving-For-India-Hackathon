package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.jf */
public final class C1849jf {

    /* renamed from: a */
    private static final int[] f9120a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f9121b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f9122c = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: d */
    public static final /* synthetic */ int f9123d = 0;

    /* renamed from: a */
    public static int m11635a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f9120a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    /* renamed from: b */
    public static C2367xe m11636b(C2152rm rmVar, String str, String str2, C2406yg ygVar) {
        int i = f9121b[(rmVar.mo10537g() & 192) >> 6];
        int g = rmVar.mo10537g();
        int i2 = f9122c[(g & 56) >> 3];
        if ((g & 4) != 0) {
            i2++;
        }
        return C2367xe.m19465h(str, "audio/ac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, ygVar, 0, str2);
    }

    /* renamed from: c */
    public static C2367xe m11637c(C2152rm rmVar, String str, String str2, C2406yg ygVar) {
        C2152rm rmVar2 = rmVar;
        rmVar.mo10553w(2);
        int i = f9121b[(rmVar.mo10537g() & 192) >> 6];
        int g = rmVar.mo10537g();
        int i2 = f9122c[(g & 14) >> 1];
        if ((g & 1) != 0) {
            i2++;
        }
        return C2367xe.m19465h(str, "audio/eac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, ygVar, 0, str2);
    }
}
