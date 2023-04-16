package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

final class dt3 extends ft3 {
    dt3(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final byte mo6651a(long j) {
        return Memory.peekByte((int) j);
    }

    /* renamed from: b */
    public final double mo6652b(Object obj, long j) {
        return Double.longBitsToDouble(mo7397m(obj, j));
    }

    /* renamed from: c */
    public final float mo6653c(Object obj, long j) {
        return Float.intBitsToFloat(mo7396l(obj, j));
    }

    /* renamed from: d */
    public final void mo6654d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }

    /* renamed from: e */
    public final void mo6655e(Object obj, long j, boolean z) {
        if (gt3.f7607j) {
            gt3.m9982g(obj, j, r3 ? (byte) 1 : 0);
        } else {
            gt3.m9983h(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: f */
    public final void mo6656f(Object obj, long j, byte b) {
        if (gt3.f7607j) {
            gt3.m9982g(obj, j, b);
        } else {
            gt3.m9983h(obj, j, b);
        }
    }

    /* renamed from: g */
    public final void mo6657g(Object obj, long j, double d) {
        mo7401q(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: h */
    public final void mo6658h(Object obj, long j, float f) {
        mo7400p(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: i */
    public final boolean mo6659i(Object obj, long j) {
        return gt3.f7607j ? gt3.m9972E(obj, j) : gt3.m9973F(obj, j);
    }
}
