package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.google.android.gms.internal.ads.w1 */
final class C2316w1 extends C1762h2 {

    /* renamed from: n */
    private dd4 f16649n;

    /* renamed from: o */
    private C2279v1 f16650o;

    C2316w1() {
    }

    /* renamed from: j */
    private static boolean m18810j(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo6028a(dr2 dr2) {
        if (!m18810j(dr2.mo6582h())) {
            return -1;
        }
        int i = (dr2.mo6582h()[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int a = xc4.m19453a(dr2, i);
            dr2.mo6580f(0);
            return (long) a;
        }
        dr2.mo6581g(4);
        dr2.mo6569C();
        int a2 = xc4.m19453a(dr2, i);
        dr2.mo6580f(0);
        return (long) a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6029b(boolean z) {
        super.mo6029b(z);
        if (z) {
            this.f16649n = null;
            this.f16650o = null;
        }
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    public final boolean mo6030c(dr2 dr2, long j, C1613d2 d2Var) {
        byte[] h = dr2.mo6582h();
        dd4 dd4 = this.f16649n;
        if (dd4 == null) {
            dd4 dd42 = new dd4(h, 17);
            this.f16649n = dd42;
            d2Var.f5621a = dd42.mo6455c(Arrays.copyOfRange(h, 9, dr2.mo6586l()), (c91) null);
            return true;
        } else if ((h[0] & Byte.MAX_VALUE) == 3) {
            cd4 b = ad4.m6033b(dr2);
            dd4 f = dd4.mo6458f(b);
            this.f16649n = f;
            this.f16650o = new C2279v1(f, b);
            return true;
        } else if (!m18810j(h)) {
            return true;
        } else {
            C2279v1 v1Var = this.f16650o;
            if (v1Var != null) {
                v1Var.mo11365a(j);
                d2Var.f5622b = this.f16650o;
            }
            Objects.requireNonNull(d2Var.f5621a);
            return false;
        }
    }
}
