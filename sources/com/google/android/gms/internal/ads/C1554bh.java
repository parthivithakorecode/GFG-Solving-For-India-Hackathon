package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.bh */
public final class C1554bh {

    /* renamed from: g */
    private static final byte[] f4935g = new byte[4096];

    /* renamed from: a */
    private final C2225tl f4936a;

    /* renamed from: b */
    private final long f4937b;

    /* renamed from: c */
    private long f4938c;

    /* renamed from: d */
    private byte[] f4939d = new byte[65536];

    /* renamed from: e */
    private int f4940e;

    /* renamed from: f */
    private int f4941f;

    public C1554bh(C2225tl tlVar, long j, long j2) {
        this.f4936a = tlVar;
        this.f4938c = j;
        this.f4937b = j2;
    }

    /* renamed from: j */
    private final int m6906j(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int d = this.f4936a.mo5935d(bArr, i + i3, i2 - i3);
            if (d != -1) {
                return i3 + d;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: k */
    private final int m6907k(byte[] bArr, int i, int i2) {
        int i3 = this.f4941f;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f4939d, 0, bArr, i, min);
        m6910n(min);
        return min;
    }

    /* renamed from: l */
    private final int m6908l(int i) {
        int min = Math.min(this.f4941f, i);
        m6910n(min);
        return min;
    }

    /* renamed from: m */
    private final void m6909m(int i) {
        if (i != -1) {
            this.f4938c += (long) i;
        }
    }

    /* renamed from: n */
    private final void m6910n(int i) {
        int i2 = this.f4941f - i;
        this.f4941f = i2;
        this.f4940e = 0;
        byte[] bArr = this.f4939d;
        byte[] bArr2 = i2 < bArr.length + -524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f4939d = bArr2;
    }

    /* renamed from: a */
    public final int mo5854a(byte[] bArr, int i, int i2) {
        int k = m6907k(bArr, i, i2);
        if (k == 0) {
            k = m6906j(bArr, i, i2, 0, true);
        }
        m6909m(k);
        return k;
    }

    /* renamed from: b */
    public final int mo5855b(int i) {
        int l = m6908l(i);
        if (l == 0) {
            l = m6906j(f4935g, 0, Math.min(i, 4096), 0, true);
        }
        m6909m(l);
        return l;
    }

    /* renamed from: c */
    public final long mo5856c() {
        return this.f4937b;
    }

    /* renamed from: d */
    public final long mo5857d() {
        return this.f4938c;
    }

    /* renamed from: e */
    public final void mo5858e() {
        this.f4940e = 0;
    }

    /* renamed from: f */
    public final boolean mo5859f(int i, boolean z) {
        int i2 = this.f4940e + i;
        int length = this.f4939d.length;
        if (i2 > length) {
            this.f4939d = Arrays.copyOf(this.f4939d, C2449zm.m20726e(length + length, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.f4941f - this.f4940e, i);
        while (min < i) {
            min = m6906j(this.f4939d, this.f4940e, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i3 = this.f4940e + i;
        this.f4940e = i3;
        this.f4941f = Math.max(this.f4941f, i3);
        return true;
    }

    /* renamed from: g */
    public final boolean mo5860g(byte[] bArr, int i, int i2, boolean z) {
        if (!mo5859f(i2, false)) {
            return false;
        }
        System.arraycopy(this.f4939d, this.f4940e - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: h */
    public final boolean mo5861h(byte[] bArr, int i, int i2, boolean z) {
        int k = m6907k(bArr, i, i2);
        while (k < i2 && k != -1) {
            k = m6906j(bArr, i, i2, k, z);
        }
        m6909m(k);
        return k != -1;
    }

    /* renamed from: i */
    public final boolean mo5862i(int i, boolean z) {
        int l = m6908l(i);
        while (l < i && l != -1) {
            l = m6906j(f4935g, -l, Math.min(i, l + 4096), l, false);
        }
        m6909m(l);
        return l != -1;
    }
}
