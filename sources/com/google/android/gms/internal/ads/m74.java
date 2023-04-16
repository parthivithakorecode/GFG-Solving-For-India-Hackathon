package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class m74 extends ei0 {

    /* renamed from: h */
    private static final Object f10757h = new Object();

    /* renamed from: i */
    private static final C2451zo f10758i;

    /* renamed from: c */
    private final long f10759c;

    /* renamed from: d */
    private final long f10760d;

    /* renamed from: e */
    private final boolean f10761e;

    /* renamed from: f */
    private final C2451zo f10762f;

    /* renamed from: g */
    private final C2221th f10763g;

    static {
        C1727g4 g4Var = new C1727g4();
        g4Var.mo7501a("SinglePeriodTimeline");
        g4Var.mo7502b(Uri.EMPTY);
        f10758i = g4Var.mo7503c();
    }

    public m74(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, C2451zo zoVar, C2221th thVar) {
        this.f10759c = j4;
        this.f10760d = j5;
        this.f10761e = z;
        this.f10762f = zoVar;
        this.f10763g = thVar;
    }

    /* renamed from: a */
    public final int mo6954a(Object obj) {
        return f10757h.equals(obj) ? 0 : -1;
    }

    /* renamed from: b */
    public final int mo6955b() {
        return 1;
    }

    /* renamed from: c */
    public final int mo6956c() {
        return 1;
    }

    /* renamed from: d */
    public final pf0 mo6957d(int i, pf0 pf0, boolean z) {
        wu1.m19202a(i, 0, 1);
        pf0.mo10053j((Object) null, z ? f10757h : null, 0, this.f10759c, 0, y51.f17608c, false);
        return pf0;
    }

    /* renamed from: e */
    public final hh0 mo6958e(int i, hh0 hh0, long j) {
        wu1.m19202a(i, 0, 1);
        hh0.mo7938a(hh0.f8221o, this.f10762f, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f10761e, false, this.f10763g, 0, this.f10760d, 0, 0, 0);
        return hh0;
    }

    /* renamed from: f */
    public final Object mo6960f(int i) {
        wu1.m19202a(i, 0, 1);
        return f10757h;
    }
}
