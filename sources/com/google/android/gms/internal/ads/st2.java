package com.google.android.gms.internal.ads;

import java.util.LinkedList;
import p054h1.C2694t;

final class st2 {

    /* renamed from: a */
    private final LinkedList<cu2<?, ?>> f14584a = new LinkedList<>();

    /* renamed from: b */
    private final int f14585b;

    /* renamed from: c */
    private final int f14586c;

    /* renamed from: d */
    private final su2 f14587d;

    public st2(int i, int i2) {
        this.f14585b = i;
        this.f14586c = i2;
        this.f14587d = new su2();
    }

    /* renamed from: i */
    private final void m16973i() {
        while (!this.f14584a.isEmpty() && C2694t.m21592a().mo12462a() - this.f14584a.getFirst().f5528d >= ((long) this.f14586c)) {
            this.f14587d.mo10879g();
            this.f14584a.remove();
        }
    }

    /* renamed from: a */
    public final int mo10863a() {
        return this.f14587d.mo10873a();
    }

    /* renamed from: b */
    public final int mo10864b() {
        m16973i();
        return this.f14584a.size();
    }

    /* renamed from: c */
    public final long mo10865c() {
        return this.f14587d.mo10874b();
    }

    /* renamed from: d */
    public final long mo10866d() {
        return this.f14587d.mo10875c();
    }

    /* renamed from: e */
    public final cu2<?, ?> mo10867e() {
        this.f14587d.mo10878f();
        m16973i();
        if (this.f14584a.isEmpty()) {
            return null;
        }
        cu2<?, ?> remove = this.f14584a.remove();
        if (remove != null) {
            this.f14587d.mo10880h();
        }
        return remove;
    }

    /* renamed from: f */
    public final ru2 mo10868f() {
        return this.f14587d.mo10876d();
    }

    /* renamed from: g */
    public final String mo10869g() {
        return this.f14587d.mo10877e();
    }

    /* renamed from: h */
    public final boolean mo10870h(cu2<?, ?> cu2) {
        this.f14587d.mo10878f();
        m16973i();
        if (this.f14584a.size() == this.f14585b) {
            return false;
        }
        this.f14584a.add(cu2);
        return true;
    }
}
