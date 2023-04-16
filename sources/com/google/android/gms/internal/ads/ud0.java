package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;
import p083l1.C3448e;

public final class ud0 implements C3448e {

    /* renamed from: a */
    private final Date f15510a;

    /* renamed from: b */
    private final int f15511b;

    /* renamed from: c */
    private final Set<String> f15512c;

    /* renamed from: d */
    private final boolean f15513d;

    /* renamed from: e */
    private final Location f15514e;

    /* renamed from: f */
    private final int f15515f;

    /* renamed from: g */
    private final boolean f15516g;

    /* renamed from: h */
    private final String f15517h;

    public ud0(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.f15510a = date;
        this.f15511b = i;
        this.f15512c = set;
        this.f15514e = location;
        this.f15513d = z;
        this.f15515f = i2;
        this.f15516g = z2;
        this.f15517h = str;
    }

    @Deprecated
    /* renamed from: b */
    public final boolean mo7605b() {
        return this.f15516g;
    }

    @Deprecated
    /* renamed from: c */
    public final Date mo7606c() {
        return this.f15510a;
    }

    /* renamed from: d */
    public final boolean mo7607d() {
        return this.f15513d;
    }

    /* renamed from: e */
    public final Set<String> mo7608e() {
        return this.f15512c;
    }

    /* renamed from: h */
    public final int mo7611h() {
        return this.f15515f;
    }

    /* renamed from: j */
    public final Location mo7613j() {
        return this.f15514e;
    }

    @Deprecated
    /* renamed from: k */
    public final int mo7614k() {
        return this.f15511b;
    }
}
