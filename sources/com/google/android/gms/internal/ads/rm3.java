package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

abstract class rm3 implements mn3 {

    /* renamed from: c */
    private static final int[] f13744c = m16346i(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    int[] f13745a;

    /* renamed from: b */
    private final int f13746b;

    rm3(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.f13745a = m16346i(bArr);
            this.f13746b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: f */
    static void m16343f(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        int i7 = (i6 >>> -16) | (i6 << 16);
        iArr[i4] = i7;
        int i8 = iArr[i3] + i7;
        iArr[i3] = i8;
        int i9 = iArr[i2] ^ i8;
        int i10 = (i9 >>> -12) | (i9 << 12);
        iArr[i2] = i10;
        int i11 = iArr[i] + i10;
        iArr[i] = i11;
        int i12 = iArr[i4] ^ i11;
        int i13 = (i12 >>> -8) | (i12 << 8);
        iArr[i4] = i13;
        int i14 = iArr[i3] + i13;
        iArr[i3] = i14;
        int i15 = iArr[i2] ^ i14;
        iArr[i2] = (i15 >>> -7) | (i15 << 7);
    }

    /* renamed from: g */
    static void m16344g(int[] iArr, int[] iArr2) {
        int[] iArr3 = f13744c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* renamed from: h */
    static void m16345h(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i = 0; i < 10; i++) {
            m16343f(iArr2, 0, 4, 8, 12);
            m16343f(iArr2, 1, 5, 9, 13);
            m16343f(iArr2, 2, 6, 10, 14);
            m16343f(iArr2, 3, 7, 11, 15);
            m16343f(iArr2, 0, 5, 10, 15);
            m16343f(iArr2, 1, 6, 11, 12);
            m16343f(iArr2, 2, 7, 8, 13);
            m16343f(iArr2, 3, 4, 9, 14);
        }
    }

    /* renamed from: i */
    static int[] m16346i(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    /* renamed from: a */
    public final byte[] mo7661a(byte[] bArr) {
        int length = bArr.length;
        if (length <= Integer.MAX_VALUE - mo10327b()) {
            ByteBuffer allocate = ByteBuffer.allocate(mo10327b() + length);
            mo10609e(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo10327b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int[] mo10328c(int[] iArr, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final ByteBuffer mo10608d(byte[] bArr, int i) {
        int[] c = mo10328c(m16346i(bArr), i);
        int[] iArr = (int[]) c.clone();
        m16345h(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            c[i2] = c[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(c, 0, 16);
        return order;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo10609e(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - mo10327b() >= bArr.length) {
            byte[] a = un3.m17961a(mo10327b());
            byteBuffer.put(a);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int remaining = wrap.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer d = mo10608d(a, this.f13746b + i2);
                if (i2 == i - 1) {
                    pm3.m15166a(byteBuffer, wrap, d, remaining % 64);
                } else {
                    pm3.m15166a(byteBuffer, wrap, d, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
}
