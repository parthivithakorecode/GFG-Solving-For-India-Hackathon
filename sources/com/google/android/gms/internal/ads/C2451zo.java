package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zo */
public final class C2451zo {

    /* renamed from: h */
    public static final C2451zo f18301h = new C1727g4().mo7503c();

    /* renamed from: i */
    public static final my3<C2451zo> f18302i = C1650e2.f6058a;

    /* renamed from: a */
    public final String f18303a;

    /* renamed from: b */
    public final C2297vj f18304b;
    @Deprecated

    /* renamed from: c */
    public final C2374xl f18305c;

    /* renamed from: d */
    public final C2221th f18306d;

    /* renamed from: e */
    public final C1716fu f18307e;

    /* renamed from: f */
    public final C1879k8 f18308f;
    @Deprecated

    /* renamed from: g */
    public final C1955ma f18309g;

    /* synthetic */ C2451zo(String str, C1955ma maVar, C2374xl xlVar, C2221th thVar, C1716fu fuVar, C2413yn ynVar) {
        this.f18303a = str;
        this.f18304b = xlVar;
        this.f18305c = xlVar;
        this.f18306d = thVar;
        this.f18307e = fuVar;
        this.f18308f = maVar;
        this.f18309g = maVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2451zo)) {
            return false;
        }
        C2451zo zoVar = (C2451zo) obj;
        return n13.m13643p(this.f18303a, zoVar.f18303a) && this.f18308f.equals(zoVar.f18308f) && n13.m13643p(this.f18304b, zoVar.f18304b) && n13.m13643p(this.f18306d, zoVar.f18306d) && n13.m13643p(this.f18307e, zoVar.f18307e);
    }

    public final int hashCode() {
        int hashCode = this.f18303a.hashCode() * 31;
        C2297vj vjVar = this.f18304b;
        return ((((((hashCode + (vjVar != null ? vjVar.hashCode() : 0)) * 31) + this.f18306d.hashCode()) * 31) + this.f18308f.hashCode()) * 31) + this.f18307e.hashCode();
    }
}
