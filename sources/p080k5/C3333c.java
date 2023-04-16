package p080k5;

import p087l5.C3603a;
import p087l5.C3614e;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;
import p087l5.C3631m;
import p087l5.C3632n;

/* renamed from: k5.c */
public abstract class C3333c implements C3614e {
    /* renamed from: b */
    public <R> R mo12776b(C3629k<R> kVar) {
        if (kVar == C3621j.m25165g() || kVar == C3621j.m25159a() || kVar == C3621j.m25163e()) {
            return null;
        }
        return kVar.mo12783a(this);
    }

    /* renamed from: g */
    public int mo12778g(C3620i iVar) {
        return mo12782n(iVar).mo14755a(mo12777d(iVar), iVar);
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14730d(this);
        }
        if (mo12781j(iVar)) {
            return iVar.mo14734h();
        }
        throw new C3631m("Unsupported field: " + iVar);
    }
}
