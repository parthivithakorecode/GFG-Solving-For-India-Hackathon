package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class q34 extends z51 {

    /* renamed from: h */
    private long f13047h;

    /* renamed from: i */
    private int f13048i;

    /* renamed from: j */
    private int f13049j = 32;

    public q34() {
        super(2, 0);
    }

    /* renamed from: b */
    public final void mo10238b() {
        super.mo10238b();
        this.f13048i = 0;
    }

    /* renamed from: m */
    public final int mo10239m() {
        return this.f13048i;
    }

    /* renamed from: n */
    public final long mo10240n() {
        return this.f13047h;
    }

    /* renamed from: o */
    public final void mo10241o(int i) {
        this.f13049j = i;
    }

    /* renamed from: p */
    public final boolean mo10242p(z51 z51) {
        ByteBuffer byteBuffer;
        wu1.m19205d(!z51.mo10912d(1073741824));
        wu1.m19205d(!z51.mo10912d(268435456));
        wu1.m19205d(!z51.mo10912d(4));
        if (mo10243q()) {
            if (this.f13048i >= this.f13049j || z51.mo10912d(Integer.MIN_VALUE) != mo10912d(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = z51.f18033c;
            if (!(byteBuffer2 == null || (byteBuffer = this.f18033c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000)) {
                return false;
            }
        }
        int i = this.f13048i;
        this.f13048i = i + 1;
        if (i == 0) {
            this.f18035e = z51.f18035e;
            if (z51.mo10912d(1)) {
                mo10911c(1);
            }
        }
        if (z51.mo10912d(Integer.MIN_VALUE)) {
            mo10911c(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = z51.f18033c;
        if (byteBuffer3 != null) {
            mo12148i(byteBuffer3.remaining());
            this.f18033c.put(byteBuffer3);
        }
        this.f13047h = z51.f18035e;
        return true;
    }

    /* renamed from: q */
    public final boolean mo10243q() {
        return this.f13048i > 0;
    }
}
