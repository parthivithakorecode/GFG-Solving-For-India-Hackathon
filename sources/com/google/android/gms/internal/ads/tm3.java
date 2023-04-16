package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

abstract class tm3 implements wc3 {

    /* renamed from: a */
    private final rm3 f14912a;

    /* renamed from: b */
    private final rm3 f14913b;

    public tm3(byte[] bArr) {
        if (qf3.m15611a(1)) {
            this.f14912a = mo10816b(bArr, 1);
            this.f14913b = mo10816b(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    /* renamed from: a */
    public final byte[] mo5895a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length <= (Integer.MAX_VALUE - this.f14912a.mo10327b()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(this.f14912a.mo10327b() + length + 16);
            if (allocate.remaining() >= length + this.f14912a.mo10327b() + 16) {
                int position = allocate.position();
                this.f14912a.mo10609e(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[this.f14912a.mo10327b()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                byte[] bArr4 = new byte[32];
                this.f14913b.mo10608d(bArr3, 0).get(bArr4);
                int remaining = allocate.remaining();
                int i = remaining % 16;
                int i2 = i == 0 ? remaining : (remaining + 16) - i;
                ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(0);
                order.put(allocate);
                order.position(i2);
                order.putLong(0);
                order.putLong((long) remaining);
                byte[] a = on3.m14538a(bArr4, order.array());
                allocate.limit(allocate.limit() + 16);
                allocate.put(a);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract rm3 mo10816b(byte[] bArr, int i);
}
