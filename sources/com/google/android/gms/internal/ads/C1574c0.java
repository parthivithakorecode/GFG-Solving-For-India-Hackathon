package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.c0 */
public final class C1574c0 {

    /* renamed from: G */
    private static final C1574c0 f5215G = new C1574c0(new bf4());

    /* renamed from: H */
    public static final my3<C1574c0> f5216H = zc4.f18157a;

    /* renamed from: A */
    public final int f5217A;

    /* renamed from: B */
    public final int f5218B;

    /* renamed from: C */
    public final int f5219C;

    /* renamed from: D */
    public final int f5220D;

    /* renamed from: E */
    public final int f5221E;

    /* renamed from: F */
    private int f5222F;

    /* renamed from: a */
    public final String f5223a;

    /* renamed from: b */
    public final String f5224b;

    /* renamed from: c */
    public final String f5225c;

    /* renamed from: d */
    public final int f5226d;

    /* renamed from: e */
    public final int f5227e;

    /* renamed from: f */
    public final int f5228f;

    /* renamed from: g */
    public final int f5229g;

    /* renamed from: h */
    public final int f5230h;

    /* renamed from: i */
    public final String f5231i;

    /* renamed from: j */
    public final c91 f5232j;

    /* renamed from: k */
    public final String f5233k;

    /* renamed from: l */
    public final String f5234l;

    /* renamed from: m */
    public final int f5235m;

    /* renamed from: n */
    public final List<byte[]> f5236n;

    /* renamed from: o */
    public final u74 f5237o;

    /* renamed from: p */
    public final long f5238p;

    /* renamed from: q */
    public final int f5239q;

    /* renamed from: r */
    public final int f5240r;

    /* renamed from: s */
    public final float f5241s;

    /* renamed from: t */
    public final int f5242t;

    /* renamed from: u */
    public final float f5243u;

    /* renamed from: v */
    public final byte[] f5244v;

    /* renamed from: w */
    public final int f5245w;

    /* renamed from: x */
    public final p14 f5246x;

    /* renamed from: y */
    public final int f5247y;

    /* renamed from: z */
    public final int f5248z;

    private C1574c0(bf4 bf4) {
        this.f5223a = bf4.f4905a;
        this.f5224b = bf4.f4906b;
        this.f5225c = n13.m13638k(bf4.f4907c);
        this.f5226d = bf4.f4908d;
        int i = 0;
        this.f5227e = 0;
        int L = bf4.f4909e;
        this.f5228f = L;
        int T = bf4.f4910f;
        this.f5229g = T;
        this.f5230h = T != -1 ? T : L;
        this.f5231i = bf4.f4911g;
        this.f5232j = bf4.f4912h;
        this.f5233k = bf4.f4913i;
        this.f5234l = bf4.f4914j;
        this.f5235m = bf4.f4915k;
        this.f5236n = bf4.f4916l == null ? Collections.emptyList() : bf4.f4916l;
        u74 b0 = bf4.f4917m;
        this.f5237o = b0;
        this.f5238p = bf4.f4918n;
        this.f5239q = bf4.f4919o;
        this.f5240r = bf4.f4920p;
        this.f5241s = bf4.f4921q;
        this.f5242t = bf4.f4922r == -1 ? 0 : bf4.f4922r;
        this.f5243u = bf4.f4923s == -1.0f ? 1.0f : bf4.f4923s;
        this.f5244v = bf4.f4924t;
        this.f5245w = bf4.f4925u;
        this.f5246x = bf4.f4926v;
        this.f5247y = bf4.f4927w;
        this.f5248z = bf4.f4928x;
        this.f5217A = bf4.f4929y;
        this.f5218B = bf4.f4930z == -1 ? 0 : bf4.f4930z;
        this.f5219C = bf4.f4902A != -1 ? bf4.f4902A : i;
        this.f5220D = bf4.f4903B;
        this.f5221E = (bf4.f4904C != 0 || b0 == null) ? bf4.f4904C : 1;
    }

    /* renamed from: a */
    public final int mo6003a() {
        int i;
        int i2 = this.f5239q;
        if (i2 == -1 || (i = this.f5240r) == -1) {
            return -1;
        }
        return i2 * i;
    }

    /* renamed from: b */
    public final bf4 mo6004b() {
        return new bf4(this, (ae4) null);
    }

    /* renamed from: c */
    public final C1574c0 mo6005c(int i) {
        bf4 bf4 = new bf4(this, (ae4) null);
        bf4.mo5818a(i);
        return new C1574c0(bf4);
    }

    /* renamed from: d */
    public final boolean mo6006d(C1574c0 c0Var) {
        if (this.f5236n.size() != c0Var.f5236n.size()) {
            return false;
        }
        for (int i = 0; i < this.f5236n.size(); i++) {
            if (!Arrays.equals(this.f5236n.get(i), c0Var.f5236n.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && C1574c0.class == obj.getClass()) {
            C1574c0 c0Var = (C1574c0) obj;
            int i2 = this.f5222F;
            if ((i2 == 0 || (i = c0Var.f5222F) == 0 || i2 == i) && this.f5226d == c0Var.f5226d && this.f5228f == c0Var.f5228f && this.f5229g == c0Var.f5229g && this.f5235m == c0Var.f5235m && this.f5238p == c0Var.f5238p && this.f5239q == c0Var.f5239q && this.f5240r == c0Var.f5240r && this.f5242t == c0Var.f5242t && this.f5245w == c0Var.f5245w && this.f5247y == c0Var.f5247y && this.f5248z == c0Var.f5248z && this.f5217A == c0Var.f5217A && this.f5218B == c0Var.f5218B && this.f5219C == c0Var.f5219C && this.f5220D == c0Var.f5220D && this.f5221E == c0Var.f5221E && Float.compare(this.f5241s, c0Var.f5241s) == 0 && Float.compare(this.f5243u, c0Var.f5243u) == 0 && n13.m13643p(this.f5223a, c0Var.f5223a) && n13.m13643p(this.f5224b, c0Var.f5224b) && n13.m13643p(this.f5231i, c0Var.f5231i) && n13.m13643p(this.f5233k, c0Var.f5233k) && n13.m13643p(this.f5234l, c0Var.f5234l) && n13.m13643p(this.f5225c, c0Var.f5225c) && Arrays.equals(this.f5244v, c0Var.f5244v) && n13.m13643p(this.f5232j, c0Var.f5232j) && n13.m13643p(this.f5246x, c0Var.f5246x) && n13.m13643p(this.f5237o, c0Var.f5237o) && mo6006d(c0Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f5222F;
        if (i != 0) {
            return i;
        }
        String str = this.f5223a;
        int i2 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.f5224b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5225c;
        int hashCode3 = (((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f5226d) * 961) + this.f5228f) * 31) + this.f5229g) * 31;
        String str4 = this.f5231i;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        c91 c91 = this.f5232j;
        int hashCode5 = (hashCode4 + (c91 == null ? 0 : c91.hashCode())) * 31;
        String str5 = this.f5233k;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5234l;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        int floatToIntBits = ((((((((((((((((((((((((((((((hashCode6 + i2) * 31) + this.f5235m) * 31) + ((int) this.f5238p)) * 31) + this.f5239q) * 31) + this.f5240r) * 31) + Float.floatToIntBits(this.f5241s)) * 31) + this.f5242t) * 31) + Float.floatToIntBits(this.f5243u)) * 31) + this.f5245w) * 31) + this.f5247y) * 31) + this.f5248z) * 31) + this.f5217A) * 31) + this.f5218B) * 31) + this.f5219C) * 31) + this.f5220D) * 31) + this.f5221E;
        this.f5222F = floatToIntBits;
        return floatToIntBits;
    }

    public final String toString() {
        String str = this.f5223a;
        String str2 = this.f5224b;
        String str3 = this.f5233k;
        String str4 = this.f5234l;
        String str5 = this.f5231i;
        int i = this.f5230h;
        String str6 = this.f5225c;
        int i2 = this.f5239q;
        int i3 = this.f5240r;
        float f = this.f5241s;
        int i4 = this.f5247y;
        int i5 = this.f5248z;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 104 + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }
}
