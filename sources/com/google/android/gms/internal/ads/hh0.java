package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class hh0 {

    /* renamed from: o */
    public static final Object f8221o = new Object();

    /* renamed from: p */
    private static final Object f8222p = new Object();

    /* renamed from: q */
    private static final C2451zo f8223q;

    /* renamed from: r */
    public static final my3<hh0> f8224r = jg0.f9131a;

    /* renamed from: a */
    public Object f8225a = f8221o;

    /* renamed from: b */
    public C2451zo f8226b = f8223q;

    /* renamed from: c */
    public long f8227c;

    /* renamed from: d */
    public long f8228d;

    /* renamed from: e */
    public long f8229e;

    /* renamed from: f */
    public boolean f8230f;

    /* renamed from: g */
    public boolean f8231g;
    @Deprecated

    /* renamed from: h */
    public boolean f8232h;

    /* renamed from: i */
    public C2221th f8233i;

    /* renamed from: j */
    public boolean f8234j;

    /* renamed from: k */
    public long f8235k;

    /* renamed from: l */
    public long f8236l;

    /* renamed from: m */
    public int f8237m;

    /* renamed from: n */
    public int f8238n;

    static {
        C1727g4 g4Var = new C1727g4();
        g4Var.mo7501a("androidx.media3.common.Timeline");
        g4Var.mo7502b(Uri.EMPTY);
        f8223q = g4Var.mo7503c();
    }

    /* renamed from: a */
    public final hh0 mo7938a(Object obj, C2451zo zoVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, C2221th thVar, long j4, long j5, int i, int i2, long j6) {
        C2221th thVar2 = thVar;
        this.f8225a = obj;
        this.f8226b = zoVar != null ? zoVar : f8223q;
        this.f8227c = -9223372036854775807L;
        this.f8228d = -9223372036854775807L;
        this.f8229e = -9223372036854775807L;
        this.f8230f = z;
        this.f8231g = z2;
        this.f8232h = thVar2 != null;
        this.f8233i = thVar2;
        this.f8235k = 0;
        this.f8236l = j5;
        this.f8237m = 0;
        this.f8238n = 0;
        this.f8234j = false;
        return this;
    }

    /* renamed from: b */
    public final boolean mo7939b() {
        wu1.m19207f(this.f8232h == (this.f8233i != null));
        return this.f8233i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hh0.class.equals(obj.getClass())) {
            hh0 hh0 = (hh0) obj;
            return n13.m13643p(this.f8225a, hh0.f8225a) && n13.m13643p(this.f8226b, hh0.f8226b) && n13.m13643p((Object) null, (Object) null) && n13.m13643p(this.f8233i, hh0.f8233i) && this.f8227c == hh0.f8227c && this.f8228d == hh0.f8228d && this.f8229e == hh0.f8229e && this.f8230f == hh0.f8230f && this.f8231g == hh0.f8231g && this.f8234j == hh0.f8234j && this.f8236l == hh0.f8236l && this.f8237m == hh0.f8237m && this.f8238n == hh0.f8238n;
        }
    }

    public final int hashCode() {
        int hashCode = (((this.f8225a.hashCode() + 217) * 31) + this.f8226b.hashCode()) * 961;
        C2221th thVar = this.f8233i;
        int hashCode2 = thVar == null ? 0 : thVar.hashCode();
        long j = this.f8227c;
        long j2 = this.f8228d;
        long j3 = this.f8229e;
        boolean z = this.f8230f;
        boolean z2 = this.f8231g;
        boolean z3 = this.f8234j;
        long j4 = this.f8236l;
        return (((((((((((((((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 961) + ((int) ((j4 >>> 32) ^ j4))) * 31) + this.f8237m) * 31) + this.f8238n) * 31;
    }
}
