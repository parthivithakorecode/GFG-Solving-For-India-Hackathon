package p146v;

import java.nio.ByteBuffer;

/* renamed from: v.a */
public final class C4162a extends C4164c {
    /* renamed from: f */
    public C4162a mo15659f(int i, ByteBuffer byteBuffer) {
        mo15660g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void mo15660g(int i, ByteBuffer byteBuffer) {
        mo15675c(i, byteBuffer);
    }

    /* renamed from: h */
    public int mo15661h(int i) {
        int b = mo15674b(16);
        if (b != 0) {
            return this.f22371b.getInt(mo15676d(b) + (i * 4));
        }
        return 0;
    }

    /* renamed from: i */
    public int mo15662i() {
        int b = mo15674b(16);
        if (b != 0) {
            return mo15677e(b);
        }
        return 0;
    }

    /* renamed from: j */
    public boolean mo15663j() {
        int b = mo15674b(6);
        return (b == 0 || this.f22371b.get(b + this.f22370a) == 0) ? false : true;
    }

    /* renamed from: k */
    public short mo15664k() {
        int b = mo15674b(14);
        if (b != 0) {
            return this.f22371b.getShort(b + this.f22370a);
        }
        return 0;
    }

    /* renamed from: l */
    public int mo15665l() {
        int b = mo15674b(4);
        if (b != 0) {
            return this.f22371b.getInt(b + this.f22370a);
        }
        return 0;
    }

    /* renamed from: m */
    public short mo15666m() {
        int b = mo15674b(8);
        if (b != 0) {
            return this.f22371b.getShort(b + this.f22370a);
        }
        return 0;
    }

    /* renamed from: n */
    public short mo15667n() {
        int b = mo15674b(12);
        if (b != 0) {
            return this.f22371b.getShort(b + this.f22370a);
        }
        return 0;
    }
}
