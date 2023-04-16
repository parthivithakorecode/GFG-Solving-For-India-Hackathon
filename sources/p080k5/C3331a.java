package p080k5;

import p065i5.C2872i;
import p087l5.C3603a;
import p087l5.C3604b;
import p087l5.C3613d;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;
import p087l5.C3631m;

/* renamed from: k5.a */
public abstract class C3331a extends C3333c implements C2872i {
    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        if (kVar == C3621j.m25163e()) {
            return C3604b.ERAS;
        }
        if (kVar == C3621j.m25159a() || kVar == C3621j.m25164f() || kVar == C3621j.m25165g() || kVar == C3621j.m25162d() || kVar == C3621j.m25160b() || kVar == C3621j.m25161c()) {
            return null;
        }
        return kVar.mo12783a(this);
    }

    /* renamed from: d */
    public long mo12777d(C3620i iVar) {
        if (iVar == C3603a.ERA) {
            return (long) getValue();
        }
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14736j(this);
        }
        throw new C3631m("Unsupported field: " + iVar);
    }

    /* renamed from: g */
    public int mo12778g(C3620i iVar) {
        return iVar == C3603a.ERA ? getValue() : mo12782n(iVar).mo14755a(mo12777d(iVar), iVar);
    }

    /* renamed from: h */
    public C3613d mo12780h(C3613d dVar) {
        return dVar.mo12804l(C3603a.ERA, (long) getValue());
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        return iVar instanceof C3603a ? iVar == C3603a.ERA : iVar != null && iVar.mo14733g(this);
    }
}
