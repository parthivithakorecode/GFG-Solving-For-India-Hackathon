package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.ug */
public final class C2257ug extends C2035og {

    /* renamed from: b */
    public final C2146rg f15545b = new C2146rg();

    /* renamed from: c */
    public ByteBuffer f15546c;

    /* renamed from: d */
    public long f15547d;

    public C2257ug(int i) {
    }

    /* renamed from: j */
    private final ByteBuffer m17893j(int i) {
        ByteBuffer byteBuffer = this.f15546c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final void mo9759b() {
        super.mo9759b();
        ByteBuffer byteBuffer = this.f15546c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: h */
    public final void mo11219h(int i) {
        ByteBuffer byteBuffer = this.f15546c;
        if (byteBuffer == null) {
            this.f15546c = m17893j(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f15546c.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer j = m17893j(i2);
            if (position > 0) {
                this.f15546c.position(0);
                this.f15546c.limit(position);
                j.put(this.f15546c);
            }
            this.f15546c = j;
        }
    }

    /* renamed from: i */
    public final boolean mo11220i() {
        return mo9761d(1073741824);
    }
}
