package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.google.android.gms.internal.ads.c2 */
final class C1576c2 extends C1762h2 {

    /* renamed from: o */
    private static final byte[] f5271o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    private boolean f5272n;

    C1576c2() {
    }

    /* renamed from: j */
    public static boolean m7186j(dr2 dr2) {
        if (dr2.mo6583i() < 8) {
            return false;
        }
        byte[] bArr = new byte[8];
        dr2.mo6576b(bArr, 0, 8);
        return Arrays.equals(bArr, f5271o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo6028a(dr2 dr2) {
        byte[] h = dr2.mo6582h();
        byte b = h[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = h[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return mo7804f(((long) b3) * ((long) (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6029b(boolean z) {
        super.mo6029b(z);
        if (z) {
            this.f5272n = false;
        }
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    public final boolean mo6030c(dr2 dr2, long j, C1613d2 d2Var) {
        boolean z = true;
        if (!this.f5272n) {
            byte[] copyOf = Arrays.copyOf(dr2.mo6582h(), dr2.mo6586l());
            byte b = copyOf[9];
            List<byte[]> a = ld4.m12704a(copyOf);
            bf4 bf4 = new bf4();
            bf4.mo5842s("audio/opus");
            bf4.mo5825e0(b & 255);
            bf4.mo5843t(48000);
            bf4.mo5832i(a);
            d2Var.f5621a = bf4.mo5848y();
            this.f5272n = true;
            return true;
        }
        Objects.requireNonNull(d2Var.f5621a);
        if (dr2.mo6587m() != 1332770163) {
            z = false;
        }
        dr2.mo6580f(0);
        return z;
    }
}
