package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gv */
public class C1754gv {

    /* renamed from: a */
    public final Object f7614a;

    /* renamed from: b */
    public final int f7615b;

    /* renamed from: c */
    public final int f7616c;

    /* renamed from: d */
    public final long f7617d;

    /* renamed from: e */
    public final int f7618e;

    protected C1754gv(C1754gv gvVar) {
        this.f7614a = gvVar.f7614a;
        this.f7615b = gvVar.f7615b;
        this.f7616c = gvVar.f7616c;
        this.f7617d = gvVar.f7617d;
        this.f7618e = gvVar.f7618e;
    }

    public C1754gv(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private C1754gv(Object obj, int i, int i2, long j, int i3) {
        this.f7614a = obj;
        this.f7615b = i;
        this.f7616c = i2;
        this.f7617d = j;
        this.f7618e = i3;
    }

    public C1754gv(Object obj, long j) {
        this(obj, -1, -1, -1, -1);
    }

    public C1754gv(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    /* renamed from: a */
    public final C1754gv mo7713a(Object obj) {
        if (this.f7614a.equals(obj)) {
            return this;
        }
        return new C1754gv(obj, this.f7615b, this.f7616c, this.f7617d, this.f7618e);
    }

    /* renamed from: b */
    public final boolean mo7714b() {
        return this.f7615b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1754gv)) {
            return false;
        }
        C1754gv gvVar = (C1754gv) obj;
        return this.f7614a.equals(gvVar.f7614a) && this.f7615b == gvVar.f7615b && this.f7616c == gvVar.f7616c && this.f7617d == gvVar.f7617d && this.f7618e == gvVar.f7618e;
    }

    public final int hashCode() {
        return ((((((((this.f7614a.hashCode() + 527) * 31) + this.f7615b) * 31) + this.f7616c) * 31) + ((int) this.f7617d)) * 31) + this.f7618e;
    }
}
