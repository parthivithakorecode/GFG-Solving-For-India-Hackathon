package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.o7 */
public final class C2026o7 {
    /* renamed from: a */
    public static double m14341a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255))) / 1.073741824E9d;
    }

    /* renamed from: b */
    public static double m14342b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255))) / 65536.0d;
    }

    /* renamed from: c */
    public static int m14343c(byte b) {
        return b < 0 ? b + 256 : b;
    }

    /* renamed from: d */
    public static int m14344d(ByteBuffer byteBuffer) {
        return (m14343c(byteBuffer.get()) << 8) + m14343c(byteBuffer.get());
    }

    /* renamed from: e */
    public static long m14345e(ByteBuffer byteBuffer) {
        long j = (long) byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    /* renamed from: f */
    public static long m14346f(ByteBuffer byteBuffer) {
        long e = m14345e(byteBuffer) << 32;
        if (e >= 0) {
            return e + m14345e(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
