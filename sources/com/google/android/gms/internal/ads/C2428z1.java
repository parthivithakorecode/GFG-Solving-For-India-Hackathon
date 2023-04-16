package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.z1 */
final class C2428z1 {

    /* renamed from: a */
    private final C1502a2 f17966a = new C1502a2();

    /* renamed from: b */
    private final dr2 f17967b = new dr2(new byte[65025], 0);

    /* renamed from: c */
    private int f17968c = -1;

    /* renamed from: d */
    private int f17969d;

    /* renamed from: e */
    private boolean f17970e;

    C2428z1() {
    }

    /* renamed from: f */
    private final int m20379f(int i) {
        int i2;
        int i3 = 0;
        this.f17969d = 0;
        do {
            int i4 = this.f17969d;
            int i5 = i + i4;
            C1502a2 a2Var = this.f17966a;
            if (i5 >= a2Var.f3888c) {
                break;
            }
            int[] iArr = a2Var.f3891f;
            this.f17969d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: a */
    public final dr2 mo12123a() {
        return this.f17967b;
    }

    /* renamed from: b */
    public final C1502a2 mo12124b() {
        return this.f17966a;
    }

    /* renamed from: c */
    public final void mo12125c() {
        this.f17966a.mo5068a();
        this.f17967b.mo6577c(0);
        this.f17968c = -1;
        this.f17970e = false;
    }

    /* renamed from: d */
    public final void mo12126d() {
        if (this.f17967b.mo6582h().length != 65025) {
            dr2 dr2 = this.f17967b;
            dr2.mo6578d(Arrays.copyOf(dr2.mo6582h(), Math.max(65025, this.f17967b.mo6586l())), this.f17967b.mo6586l());
        }
    }

    /* renamed from: e */
    public final boolean mo12127e(pc4 pc4) {
        if (this.f17970e) {
            this.f17970e = false;
            this.f17967b.mo6577c(0);
        }
        while (true) {
            boolean z = true;
            if (this.f17970e) {
                return true;
            }
            int i = this.f17968c;
            if (i < 0) {
                if (!this.f17966a.mo5070c(pc4, -1) || !this.f17966a.mo5069b(pc4, true)) {
                    return false;
                }
                C1502a2 a2Var = this.f17966a;
                int i2 = a2Var.f3889d;
                if ((a2Var.f3886a & 1) == 1 && this.f17967b.mo6586l() == 0) {
                    i2 += m20379f(0);
                    i = this.f17969d;
                } else {
                    i = 0;
                }
                if (!sc4.m16787e(pc4, i2)) {
                    return false;
                }
                this.f17968c = i;
            }
            int f = m20379f(i);
            int i3 = this.f17968c + this.f17969d;
            if (f > 0) {
                dr2 dr2 = this.f17967b;
                dr2.mo6574H(dr2.mo6586l() + f);
                if (!sc4.m16786d(pc4, this.f17967b.mo6582h(), this.f17967b.mo6586l(), f)) {
                    return false;
                }
                dr2 dr22 = this.f17967b;
                dr22.mo6579e(dr22.mo6586l() + f);
                if (this.f17966a.f3891f[i3 - 1] == 255) {
                    z = false;
                }
                this.f17970e = z;
            }
            if (i3 == this.f17966a.f3888c) {
                i3 = -1;
            }
            this.f17968c = i3;
        }
        return false;
    }
}
