package p146v;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: v.b */
public final class C4163b extends C4164c {
    /* renamed from: h */
    public static C4163b m26589h(ByteBuffer byteBuffer) {
        return m26590i(byteBuffer, new C4163b());
    }

    /* renamed from: i */
    public static C4163b m26590i(ByteBuffer byteBuffer, C4163b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bVar.mo15668f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: f */
    public C4163b mo15668f(int i, ByteBuffer byteBuffer) {
        mo15669g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void mo15669g(int i, ByteBuffer byteBuffer) {
        mo15675c(i, byteBuffer);
    }

    /* renamed from: j */
    public C4162a mo15670j(C4162a aVar, int i) {
        int b = mo15674b(6);
        if (b != 0) {
            return aVar.mo15659f(mo15673a(mo15676d(b) + (i * 4)), this.f22371b);
        }
        return null;
    }

    /* renamed from: k */
    public int mo15671k() {
        int b = mo15674b(6);
        if (b != 0) {
            return mo15677e(b);
        }
        return 0;
    }

    /* renamed from: l */
    public int mo15672l() {
        int b = mo15674b(4);
        if (b != 0) {
            return this.f22371b.getInt(b + this.f22370a);
        }
        return 0;
    }
}
