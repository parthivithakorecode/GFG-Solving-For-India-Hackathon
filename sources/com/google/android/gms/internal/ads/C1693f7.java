package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.f7 */
public final class C1693f7 extends ByteArrayOutputStream {

    /* renamed from: f */
    private final C2173s6 f6727f;

    public C1693f7(C2173s6 s6Var, int i) {
        this.f6727f = s6Var;
        this.buf = s6Var.mo10738b(Math.max(i, 256));
    }

    /* renamed from: d */
    private final void m9031d(int i) {
        int i2 = this.count;
        if (i2 + i > this.buf.length) {
            int i3 = i2 + i;
            byte[] b = this.f6727f.mo10738b(i3 + i3);
            System.arraycopy(this.buf, 0, b, 0, this.count);
            this.f6727f.mo10737a(this.buf);
            this.buf = b;
        }
    }

    public final void close() {
        this.f6727f.mo10737a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f6727f.mo10737a(this.buf);
    }

    public final synchronized void write(int i) {
        m9031d(1);
        super.write(i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m9031d(i2);
        super.write(bArr, i, i2);
    }
}
