package com.google.android.gms.internal.ads;

public final class a84 implements Comparable<a84> {

    /* renamed from: f */
    private final boolean f4021f;

    /* renamed from: g */
    private final boolean f4022g;

    public a84(C1574c0 c0Var, int i) {
        this.f4021f = 1 != (c0Var.f5226d & 1) ? false : true;
        this.f4022g = k84.m12081m(i, false);
    }

    /* renamed from: b */
    public final int compareTo(a84 a84) {
        return t63.m17119i().mo10250d(this.f4022g, a84.f4022g).mo10250d(this.f4021f, a84.f4021f).mo10247a();
    }
}
