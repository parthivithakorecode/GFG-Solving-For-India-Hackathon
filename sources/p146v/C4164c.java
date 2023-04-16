package p146v;

import java.nio.ByteBuffer;

/* renamed from: v.c */
public class C4164c {

    /* renamed from: a */
    protected int f22370a;

    /* renamed from: b */
    protected ByteBuffer f22371b;

    /* renamed from: c */
    private int f22372c;

    /* renamed from: d */
    private int f22373d;

    /* renamed from: e */
    C4165d f22374e = C4165d.m26601a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo15673a(int i) {
        return i + this.f22371b.getInt(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo15674b(int i) {
        if (i < this.f22373d) {
            return this.f22371b.getShort(this.f22372c + i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15675c(int i, ByteBuffer byteBuffer) {
        short s;
        this.f22371b = byteBuffer;
        if (byteBuffer != null) {
            this.f22370a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f22372c = i2;
            s = this.f22371b.getShort(i2);
        } else {
            s = 0;
            this.f22370a = 0;
            this.f22372c = 0;
        }
        this.f22373d = s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo15676d(int i) {
        int i2 = i + this.f22370a;
        return i2 + this.f22371b.getInt(i2) + 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo15677e(int i) {
        int i2 = i + this.f22370a;
        return this.f22371b.getInt(i2 + this.f22371b.getInt(i2));
    }
}
