package p087l5;

import p058h5.C2745d;

/* renamed from: l5.b */
public enum C3604b implements C3630l {
    NANOS("Nanos", C2745d.m21784g(1)),
    MICROS("Micros", C2745d.m21784g(1000)),
    MILLIS("Millis", C2745d.m21784g(1000000)),
    SECONDS("Seconds", C2745d.m21785h(1)),
    MINUTES("Minutes", C2745d.m21785h(60)),
    HOURS("Hours", C2745d.m21785h(3600)),
    HALF_DAYS("HalfDays", C2745d.m21785h(43200)),
    DAYS("Days", C2745d.m21785h(86400)),
    WEEKS("Weeks", C2745d.m21785h(604800)),
    MONTHS("Months", C2745d.m21785h(2629746)),
    YEARS("Years", C2745d.m21785h(31556952)),
    DECADES("Decades", C2745d.m21785h(315569520)),
    CENTURIES("Centuries", C2745d.m21785h(3155695200L)),
    MILLENNIA("Millennia", C2745d.m21785h(31556952000L)),
    ERAS("Eras", C2745d.m21785h(31556952000000000L)),
    FOREVER("Forever", C2745d.m21786i(Long.MAX_VALUE, 999999999));
    

    /* renamed from: f */
    private final String f21325f;

    /* renamed from: g */
    private final C2745d f21326g;

    private C3604b(String str, C2745d dVar) {
        this.f21325f = str;
        this.f21326g = dVar;
    }

    /* renamed from: b */
    public boolean mo14740b() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    /* renamed from: d */
    public <R extends C3613d> R mo14741d(R r, long j) {
        return r.mo12800e(j, this);
    }

    public String toString() {
        return this.f21325f;
    }
}
