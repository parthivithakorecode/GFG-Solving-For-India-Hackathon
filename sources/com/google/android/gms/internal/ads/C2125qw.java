package com.google.android.gms.internal.ads;

import java.util.Random;

/* renamed from: com.google.android.gms.internal.ads.qw */
public final class C2125qw {

    /* renamed from: f */
    private static final C2125qw f13330f = new C2125qw();

    /* renamed from: a */
    private final bo0 f13331a;

    /* renamed from: b */
    private final C2051ow f13332b;

    /* renamed from: c */
    private final String f13333c;

    /* renamed from: d */
    private final po0 f13334d;

    /* renamed from: e */
    private final Random f13335e;

    protected C2125qw() {
        bo0 bo0 = new bo0();
        C2051ow owVar = new C2051ow(new C1865jv(), new C1791hv(), new C2462zz(), new j60(), new sk0(), new wg0(), new k60());
        String d = bo0.m6983d();
        po0 po0 = new po0(0, 214106000, true, false, false);
        Random random = new Random();
        this.f13331a = bo0;
        this.f13332b = owVar;
        this.f13333c = d;
        this.f13334d = po0;
        this.f13335e = random;
    }

    /* renamed from: a */
    public static C2051ow m15896a() {
        return f13330f.f13332b;
    }

    /* renamed from: b */
    public static bo0 m15897b() {
        return f13330f.f13331a;
    }

    /* renamed from: c */
    public static po0 m15898c() {
        return f13330f.f13334d;
    }

    /* renamed from: d */
    public static String m15899d() {
        return f13330f.f13333c;
    }

    /* renamed from: e */
    public static Random m15900e() {
        return f13330f.f13335e;
    }
}
