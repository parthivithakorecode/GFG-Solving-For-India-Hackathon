package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class z51 extends sz0 {

    /* renamed from: b */
    public final v21 f18032b = new v21();

    /* renamed from: c */
    public ByteBuffer f18033c;

    /* renamed from: d */
    public boolean f18034d;

    /* renamed from: e */
    public long f18035e;

    /* renamed from: f */
    public ByteBuffer f18036f;

    /* renamed from: g */
    private final int f18037g;

    public z51(int i, int i2) {
        this.f18037g = i;
    }

    /* renamed from: l */
    private final ByteBuffer m20458l(int i) {
        int i2 = this.f18037g;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f18033c;
        throw new x41(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    /* renamed from: b */
    public void mo10238b() {
        super.mo10238b();
        ByteBuffer byteBuffer = this.f18033c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f18036f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f18034d = false;
    }

    @EnsuresNonNull({"data"})
    /* renamed from: i */
    public final void mo12148i(int i) {
        ByteBuffer byteBuffer = this.f18033c;
        if (byteBuffer == null) {
            this.f18033c = m20458l(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.f18033c = byteBuffer;
            return;
        }
        ByteBuffer l = m20458l(i2);
        l.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            l.put(byteBuffer);
        }
        this.f18033c = l;
    }

    /* renamed from: j */
    public final void mo12149j() {
        ByteBuffer byteBuffer = this.f18033c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f18036f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: k */
    public final boolean mo12150k() {
        return mo10912d(1073741824);
    }
}
