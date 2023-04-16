package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class i24 extends u14 {

    /* renamed from: i */
    private static final int f8504i = Float.floatToIntBits(Float.NaN);

    i24() {
    }

    /* renamed from: o */
    private static void m10886o(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (floatToIntBits == f8504i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    /* renamed from: h */
    public final void mo8062h(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f15333b.f15314c;
        if (i2 == 536870912) {
            byteBuffer2 = mo11147j((i / 3) * 4);
            while (position < limit) {
                m10886o(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = mo11147j(i);
            while (position < limit) {
                m10886o((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    /* renamed from: i */
    public final u04 mo8063i(u04 u04) {
        int i = u04.f15314c;
        if (n13.m13644q(i)) {
            return i != 4 ? new u04(u04.f15312a, u04.f15313b, 4) : u04.f15311e;
        }
        throw new v04(u04);
    }
}
