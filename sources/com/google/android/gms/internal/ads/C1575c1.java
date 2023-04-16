package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c1 */
final class C1575c1 {

    /* renamed from: a */
    public final td4 f5252a;

    /* renamed from: b */
    public final C2094q1 f5253b = new C2094q1();

    /* renamed from: c */
    public final dr2 f5254c = new dr2();

    /* renamed from: d */
    public C2131r1 f5255d;

    /* renamed from: e */
    public C2390y0 f5256e;

    /* renamed from: f */
    public int f5257f;

    /* renamed from: g */
    public int f5258g;

    /* renamed from: h */
    public int f5259h;

    /* renamed from: i */
    public int f5260i;

    /* renamed from: j */
    private final dr2 f5261j = new dr2(1);

    /* renamed from: k */
    private final dr2 f5262k = new dr2();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f5263l;

    public C1575c1(td4 td4, C2131r1 r1Var, C2390y0 y0Var) {
        this.f5252a = td4;
        this.f5255d = r1Var;
        this.f5256e = y0Var;
        mo6022h(r1Var, y0Var);
    }

    /* renamed from: a */
    public final int mo6016a() {
        int i = !this.f5263l ? this.f5255d.f13447g[this.f5257f] : this.f5253b.f13005k[this.f5257f] ? 1 : 0;
        return mo6021f() != null ? i | 1073741824 : i;
    }

    /* renamed from: b */
    public final int mo6017b() {
        return !this.f5263l ? this.f5255d.f13444d[this.f5257f] : this.f5253b.f13002h[this.f5257f];
    }

    /* renamed from: c */
    public final int mo6018c(int i, int i2) {
        dr2 dr2;
        C2057p1 f = mo6021f();
        if (f == null) {
            return 0;
        }
        int i3 = f.f12414d;
        if (i3 != 0) {
            dr2 = this.f5253b.f13009o;
        } else {
            byte[] bArr = (byte[]) n13.m13626c(f.f12415e);
            dr2 dr22 = this.f5262k;
            int length = bArr.length;
            dr22.mo6578d(bArr, length);
            dr2 = this.f5262k;
            i3 = length;
        }
        boolean c = this.f5253b.mo10230c(this.f5257f);
        boolean z = c || i2 != 0;
        this.f5261j.mo6582h()[0] = (byte) ((true != z ? 0 : 128) | i3);
        this.f5261j.mo6580f(0);
        this.f5252a.mo7877f(this.f5261j, 1, 1);
        this.f5252a.mo7877f(dr2, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!c) {
            this.f5254c.mo6577c(8);
            byte[] h = this.f5254c.mo6582h();
            h[0] = 0;
            h[1] = 1;
            h[2] = 0;
            h[3] = (byte) i2;
            h[4] = (byte) ((i >> 24) & 255);
            h[5] = (byte) ((i >> 16) & 255);
            h[6] = (byte) ((i >> 8) & 255);
            h[7] = (byte) (i & 255);
            this.f5252a.mo7877f(this.f5254c, 8, 1);
            return i3 + 9;
        }
        dr2 dr23 = this.f5253b.f13009o;
        int w = dr23.mo6597w();
        dr23.mo6581g(-2);
        int i4 = (w * 6) + 2;
        if (i2 != 0) {
            this.f5254c.mo6577c(i4);
            byte[] h2 = this.f5254c.mo6582h();
            dr23.mo6576b(h2, 0, i4);
            int i5 = (((h2[2] & 255) << 8) | (h2[3] & 255)) + i2;
            h2[2] = (byte) ((i5 >> 8) & 255);
            h2[3] = (byte) (i5 & 255);
            dr23 = this.f5254c;
        }
        this.f5252a.mo7877f(dr23, i4, 1);
        return i3 + 1 + i4;
    }

    /* renamed from: d */
    public final long mo6019d() {
        return !this.f5263l ? this.f5255d.f13443c[this.f5257f] : this.f5253b.f13000f[this.f5259h];
    }

    /* renamed from: e */
    public final long mo6020e() {
        return !this.f5263l ? this.f5255d.f13446f[this.f5257f] : this.f5253b.mo10228a(this.f5257f);
    }

    /* renamed from: f */
    public final C2057p1 mo6021f() {
        if (!this.f5263l) {
            return null;
        }
        C2094q1 q1Var = this.f5253b;
        C2390y0 y0Var = q1Var.f12995a;
        int i = n13.f11236a;
        int i2 = y0Var.f17527a;
        C2057p1 p1Var = q1Var.f13008n;
        if (p1Var == null) {
            p1Var = this.f5255d.f13441a.mo9625a(i2);
        }
        if (p1Var == null || !p1Var.f12411a) {
            return null;
        }
        return p1Var;
    }

    /* renamed from: h */
    public final void mo6022h(C2131r1 r1Var, C2390y0 y0Var) {
        this.f5255d = r1Var;
        this.f5256e = y0Var;
        this.f5252a.mo7873b(r1Var.f13441a.f11806f);
        mo6023i();
    }

    /* renamed from: i */
    public final void mo6023i() {
        C2094q1 q1Var = this.f5253b;
        q1Var.f12998d = 0;
        q1Var.f13011q = 0;
        q1Var.f13012r = false;
        q1Var.f13006l = false;
        q1Var.f13010p = false;
        q1Var.f13008n = null;
        this.f5257f = 0;
        this.f5259h = 0;
        this.f5258g = 0;
        this.f5260i = 0;
        this.f5263l = false;
    }

    /* renamed from: k */
    public final boolean mo6024k() {
        this.f5257f++;
        if (!this.f5263l) {
            return false;
        }
        int i = this.f5258g + 1;
        this.f5258g = i;
        int[] iArr = this.f5253b.f13001g;
        int i2 = this.f5259h;
        if (i != iArr[i2]) {
            return true;
        }
        this.f5259h = i2 + 1;
        this.f5258g = 0;
        return false;
    }
}
