package com.google.android.gms.internal.ads;

import p054h1.C2694t;

final class su2 {

    /* renamed from: a */
    private final long f14591a;

    /* renamed from: b */
    private final ru2 f14592b = new ru2();

    /* renamed from: c */
    private long f14593c;

    /* renamed from: d */
    private int f14594d = 0;

    /* renamed from: e */
    private int f14595e = 0;

    /* renamed from: f */
    private int f14596f = 0;

    public su2() {
        long a = C2694t.m21592a().mo12462a();
        this.f14591a = a;
        this.f14593c = a;
    }

    /* renamed from: a */
    public final int mo10873a() {
        return this.f14594d;
    }

    /* renamed from: b */
    public final long mo10874b() {
        return this.f14591a;
    }

    /* renamed from: c */
    public final long mo10875c() {
        return this.f14593c;
    }

    /* renamed from: d */
    public final ru2 mo10876d() {
        ru2 a = this.f14592b.clone();
        ru2 ru2 = this.f14592b;
        ru2.f13939f = false;
        ru2.f13940g = 0;
        return a;
    }

    /* renamed from: e */
    public final String mo10877e() {
        return "Created: " + this.f14591a + " Last accessed: " + this.f14593c + " Accesses: " + this.f14594d + "\nEntries retrieved: Valid: " + this.f14595e + " Stale: " + this.f14596f;
    }

    /* renamed from: f */
    public final void mo10878f() {
        this.f14593c = C2694t.m21592a().mo12462a();
        this.f14594d++;
    }

    /* renamed from: g */
    public final void mo10879g() {
        this.f14596f++;
        this.f14592b.f13940g++;
    }

    /* renamed from: h */
    public final void mo10880h() {
        this.f14595e++;
        this.f14592b.f13939f = true;
    }
}
