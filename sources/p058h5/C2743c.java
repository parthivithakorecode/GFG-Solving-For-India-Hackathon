package p058h5;

import p087l5.C3603a;
import p087l5.C3604b;
import p087l5.C3613d;
import p087l5.C3614e;
import p087l5.C3615f;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;
import p087l5.C3631m;
import p087l5.C3632n;

/* renamed from: h5.c */
public enum C2743c implements C3614e, C3615f {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    

    /* renamed from: m */
    public static final C3629k<C2743c> f19319m = null;

    /* renamed from: n */
    private static final C2743c[] f19320n = null;

    /* renamed from: h5.c$a */
    class C2744a implements C3629k<C2743c> {
        C2744a() {
        }

        /* renamed from: b */
        public C2743c mo12783a(C3614e eVar) {
            return C2743c.m21773i(eVar);
        }
    }

    static {
        f19319m = new C2744a();
        f19320n = values();
    }

    /* renamed from: i */
    public static C2743c m21773i(C3614e eVar) {
        if (eVar instanceof C2743c) {
            return (C2743c) eVar;
        }
        try {
            return m21774k(eVar.mo12778g(C3603a.DAY_OF_WEEK));
        } catch (C2742b e) {
            throw new C2742b("Unable to obtain DayOfWeek from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e);
        }
    }

    /* renamed from: k */
    public static C2743c m21774k(int i) {
        if (i >= 1 && i <= 7) {
            return f19320n[i - 1];
        }
        throw new C2742b("Invalid value for DayOfWeek: " + i);
    }

    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        if (kVar == C3621j.m25163e()) {
            return C3604b.DAYS;
        }
        if (kVar == C3621j.m25160b() || kVar == C3621j.m25161c() || kVar == C3621j.m25159a() || kVar == C3621j.m25164f() || kVar == C3621j.m25165g() || kVar == C3621j.m25162d()) {
            return null;
        }
        return kVar.mo12783a(this);
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        if (iVar == C3603a.DAY_OF_WEEK) {
            return (long) getValue();
        }
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14736j(this);
        }
        throw new C3631m("Unsupported field: " + iVar);
    }

    /* renamed from: g */
    public int mo12778g(C3620i iVar) {
        return iVar == C3603a.DAY_OF_WEEK ? getValue() : mo12782n(iVar).mo14755a(mo12777d(iVar), iVar);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    /* renamed from: h */
    public C3613d mo12780h(C3613d dVar) {
        return dVar.mo12804l(C3603a.DAY_OF_WEEK, (long) getValue());
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        return iVar instanceof C3603a ? iVar == C3603a.DAY_OF_WEEK : iVar != null && iVar.mo14733g(this);
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        if (iVar == C3603a.DAY_OF_WEEK) {
            return iVar.mo14734h();
        }
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14730d(this);
        }
        throw new C3631m("Unsupported field: " + iVar);
    }
}
