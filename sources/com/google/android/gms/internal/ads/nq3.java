package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

final class nq3 extends InputStream {

    /* renamed from: f */
    private Iterator<ByteBuffer> f11594f;

    /* renamed from: g */
    private ByteBuffer f11595g;

    /* renamed from: h */
    private int f11596h = 0;

    /* renamed from: i */
    private int f11597i;

    /* renamed from: j */
    private int f11598j;

    /* renamed from: k */
    private boolean f11599k;

    /* renamed from: l */
    private byte[] f11600l;

    /* renamed from: m */
    private int f11601m;

    /* renamed from: n */
    private long f11602n;

    nq3(Iterable<ByteBuffer> iterable) {
        this.f11594f = iterable.iterator();
        for (ByteBuffer next : iterable) {
            this.f11596h++;
        }
        this.f11597i = -1;
        if (!m14028h()) {
            this.f11595g = kq3.f9609e;
            this.f11597i = 0;
            this.f11598j = 0;
            this.f11602n = 0;
        }
    }

    /* renamed from: d */
    private final void m14027d(int i) {
        int i2 = this.f11598j + i;
        this.f11598j = i2;
        if (i2 == this.f11595g.limit()) {
            m14028h();
        }
    }

    /* renamed from: h */
    private final boolean m14028h() {
        this.f11597i++;
        if (!this.f11594f.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f11594f.next();
        this.f11595g = next;
        this.f11598j = next.position();
        if (this.f11595g.hasArray()) {
            this.f11599k = true;
            this.f11600l = this.f11595g.array();
            this.f11601m = this.f11595g.arrayOffset();
        } else {
            this.f11599k = false;
            this.f11602n = gt3.m9988m(this.f11595g);
            this.f11600l = null;
        }
        return true;
    }

    public final int read() {
        byte i;
        if (this.f11597i == this.f11596h) {
            return -1;
        }
        if (this.f11599k) {
            i = this.f11600l[this.f11598j + this.f11601m];
        } else {
            i = gt3.m9984i(((long) this.f11598j) + this.f11602n);
        }
        m14027d(1);
        return i & 255;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.f11597i == this.f11596h) {
            return -1;
        }
        int limit = this.f11595g.limit();
        int i3 = this.f11598j;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f11599k) {
            System.arraycopy(this.f11600l, i3 + this.f11601m, bArr, i, i2);
        } else {
            int position = this.f11595g.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.f11595g.position(this.f11598j);
            this.f11595g.get(bArr, i, i2);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f11595g.position(position);
        }
        m14027d(i2);
        return i2;
    }
}
