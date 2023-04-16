package com.google.android.gms.internal.ads;

public final class pf0 {

    /* renamed from: h */
    public static final my3<pf0> f12643h = ne0.f11429a;

    /* renamed from: a */
    public Object f12644a;

    /* renamed from: b */
    public Object f12645b;

    /* renamed from: c */
    public int f12646c;

    /* renamed from: d */
    public long f12647d;

    /* renamed from: e */
    public long f12648e;

    /* renamed from: f */
    public boolean f12649f;

    /* renamed from: g */
    private y51 f12650g = y51.f17608c;

    /* renamed from: a */
    public final int mo10042a(int i) {
        return this.f12650g.mo11965a(i).f12013b;
    }

    /* renamed from: b */
    public final int mo10043b(long j) {
        return -1;
    }

    /* renamed from: c */
    public final int mo10044c(long j) {
        return -1;
    }

    /* renamed from: d */
    public final int mo10045d(int i) {
        return this.f12650g.mo11965a(i).mo9750a(-1);
    }

    /* renamed from: e */
    public final int mo10046e(int i, int i2) {
        return this.f12650g.mo11965a(i).mo9750a(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pf0.class.equals(obj.getClass())) {
            pf0 pf0 = (pf0) obj;
            return n13.m13643p(this.f12644a, pf0.f12644a) && n13.m13643p(this.f12645b, pf0.f12645b) && this.f12646c == pf0.f12646c && this.f12647d == pf0.f12647d && this.f12649f == pf0.f12649f && n13.m13643p(this.f12650g, pf0.f12650g);
        }
    }

    /* renamed from: f */
    public final long mo10048f(int i, int i2) {
        of0 a = this.f12650g.mo11965a(i);
        if (a.f12013b != -1) {
            return a.f12016e[i2];
        }
        return -9223372036854775807L;
    }

    /* renamed from: g */
    public final long mo10049g(int i) {
        long j = this.f12650g.mo11965a(i).f12012a;
        return 0;
    }

    /* renamed from: h */
    public final long mo10050h() {
        long j = this.f12650g.f17611a;
        return 0;
    }

    public final int hashCode() {
        Object obj = this.f12644a;
        int i = 0;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.f12645b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        int i2 = this.f12646c;
        long j = this.f12647d;
        return ((((((((hashCode + i) * 31) + i2) * 31) + ((int) ((j >>> 32) ^ j))) * 961) + (this.f12649f ? 1 : 0)) * 31) + this.f12650g.hashCode();
    }

    /* renamed from: i */
    public final long mo10052i(int i) {
        long j = this.f12650g.mo11965a(i).f12017f;
        return 0;
    }

    /* renamed from: j */
    public final pf0 mo10053j(Object obj, Object obj2, int i, long j, long j2, y51 y51, boolean z) {
        this.f12644a = obj;
        this.f12645b = obj2;
        this.f12646c = 0;
        this.f12647d = j;
        this.f12648e = 0;
        this.f12650g = y51;
        this.f12649f = z;
        return this;
    }

    /* renamed from: k */
    public final boolean mo10054k(int i) {
        boolean z = this.f12650g.mo11965a(i).f12018g;
        return false;
    }
}
