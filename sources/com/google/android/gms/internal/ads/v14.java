package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

final class v14 extends u14 {

    /* renamed from: i */
    private int[] f15854i;

    /* renamed from: j */
    private int[] f15855j;

    v14() {
    }

    /* renamed from: h */
    public final void mo8062h(ByteBuffer byteBuffer) {
        int[] iArr = this.f15855j;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j = mo11147j(((limit - position) / this.f15333b.f15315d) * this.f15334c.f15315d);
        while (position < limit) {
            for (int i : iArr) {
                j.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.f15333b.f15315d;
        }
        byteBuffer.position(limit);
        j.flip();
    }

    /* renamed from: i */
    public final u04 mo8063i(u04 u04) {
        int[] iArr = this.f15854i;
        if (iArr == null) {
            return u04.f15311e;
        }
        if (u04.f15314c == 2) {
            boolean z = u04.f15313b != iArr.length;
            int i = 0;
            while (true) {
                int length = iArr.length;
                if (i >= length) {
                    return z ? new u04(u04.f15312a, length, 2) : u04.f15311e;
                }
                int i2 = iArr[i];
                if (i2 < u04.f15313b) {
                    z |= i2 != i;
                    i++;
                } else {
                    throw new v04(u04);
                }
            }
        } else {
            throw new v04(u04);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo9403k() {
        this.f15855j = this.f15854i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo9405m() {
        this.f15855j = null;
        this.f15854i = null;
    }

    /* renamed from: o */
    public final void mo11367o(int[] iArr) {
        this.f15854i = iArr;
    }
}
