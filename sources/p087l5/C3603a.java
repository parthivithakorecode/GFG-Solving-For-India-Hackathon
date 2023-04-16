package p087l5;

import java.util.Map;
import p073j5.C3279i;

/* renamed from: l5.a */
public enum C3603a implements C3620i {
    NANO_OF_SECOND("NanoOfSecond", r4, r9, C3632n.m25183i(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", r4, r15, C3632n.m25183i(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", r4, r9, C3632n.m25183i(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", r4, r15, C3632n.m25183i(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", r4, r9, C3632n.m25183i(0, 999)),
    MILLI_OF_DAY("MilliOfDay", r4, r15, C3632n.m25183i(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", r4, r20, C3632n.m25183i(0, 59)),
    SECOND_OF_DAY("SecondOfDay", r4, r15, C3632n.m25183i(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", r4, r25, C3632n.m25183i(0, 59)),
    MINUTE_OF_DAY("MinuteOfDay", r4, r15, C3632n.m25183i(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", r25, r20, C3632n.m25183i(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", r4, r20, C3632n.m25183i(1, 12)),
    HOUR_OF_DAY("HourOfDay", r4, r15, C3632n.m25183i(0, 23)),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", r4, r5, C3632n.m25183i(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", r20, r5, C3632n.m25183i(0, 1)),
    DAY_OF_WEEK("DayOfWeek", r4, r5, C3632n.m25183i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", r4, r5, C3632n.m25183i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", r4, r5, C3632n.m25183i(1, 7)),
    DAY_OF_MONTH("DayOfMonth", r15, r11, C3632n.m25184j(1, 28, 31)),
    DAY_OF_YEAR("DayOfYear", r4, r36, C3632n.m25184j(1, 365, 366)),
    EPOCH_DAY("EpochDay", r4, r38, C3632n.m25183i(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", r4, r11, C3632n.m25184j(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", r4, r5, C3632n.m25183i(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", r4, r5, C3632n.m25183i(1, 12)),
    PROLEPTIC_MONTH("ProlepticMonth", r4, r38, C3632n.m25183i(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", r4, r5, C3632n.m25184j(1, 999999999, 1000000000)),
    YEAR("Year", r4, r5, C3632n.m25183i(-999999999, 999999999)),
    ERA("Era", C3604b.ERAS, r5, C3632n.m25183i(0, 1)),
    INSTANT_SECONDS("InstantSeconds", r4, r5, C3632n.m25183i(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", r4, r5, C3632n.m25183i(-64800, 64800));
    

    /* renamed from: f */
    private final String f21304f;

    /* renamed from: g */
    private final C3630l f21305g;

    /* renamed from: h */
    private final C3630l f21306h;

    /* renamed from: i */
    private final C3632n f21307i;

    private C3603a(String str, C3630l lVar, C3630l lVar2, C3632n nVar) {
        this.f21304f = str;
        this.f21305g = lVar;
        this.f21306h = lVar2;
        this.f21307i = nVar;
    }

    /* renamed from: b */
    public boolean mo14729b() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    /* renamed from: d */
    public C3632n mo14730d(C3614e eVar) {
        return eVar.mo12782n(this);
    }

    /* renamed from: e */
    public C3614e mo14731e(Map<C3620i, Long> map, C3614e eVar, C3279i iVar) {
        return null;
    }

    /* renamed from: f */
    public boolean mo14732f() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    /* renamed from: g */
    public boolean mo14733g(C3614e eVar) {
        return eVar.mo12781j(this);
    }

    /* renamed from: h */
    public C3632n mo14734h() {
        return this.f21307i;
    }

    /* renamed from: i */
    public <R extends C3613d> R mo14735i(R r, long j) {
        return r.mo12804l(this, j);
    }

    /* renamed from: j */
    public long mo14736j(C3614e eVar) {
        return eVar.mo12777d(this);
    }

    /* renamed from: k */
    public int mo14737k(long j) {
        return mo14734h().mo14755a(j, this);
    }

    /* renamed from: l */
    public long mo14738l(long j) {
        return mo14734h().mo14756b(j, this);
    }

    public String toString() {
        return this.f21304f;
    }
}
