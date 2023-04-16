package p065i5;

import java.io.DataInput;
import java.io.DataOutput;
import p058h5.C2742b;
import p087l5.C3603a;
import p087l5.C3604b;
import p087l5.C3613d;
import p087l5.C3620i;
import p087l5.C3621j;
import p087l5.C3629k;
import p087l5.C3631m;
import p087l5.C3632n;

/* renamed from: i5.x */
public enum C2894x implements C2872i {
    BEFORE_BE,
    BE;

    /* renamed from: i */
    public static C2894x m22753i(int i) {
        if (i == 0) {
            return BEFORE_BE;
        }
        if (i == 1) {
            return BE;
        }
        throw new C2742b("Era is not valid for ThaiBuddhistEra");
    }

    /* renamed from: k */
    static C2894x m22754k(DataInput dataInput) {
        return m22753i(dataInput.readByte());
    }

    private Object writeReplace() {
        return new C2889u((byte) 8, this);
    }

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

    public int getValue() {
        return ordinal();
    }

    /* renamed from: h */
    public C3613d mo12780h(C3613d dVar) {
        return dVar.mo12804l(C3603a.ERA, (long) getValue());
    }

    /* renamed from: j */
    public boolean mo12781j(C3620i iVar) {
        return iVar instanceof C3603a ? iVar == C3603a.ERA : iVar != null && iVar.mo14733g(this);
    }

    /* renamed from: n */
    public C3632n mo12782n(C3620i iVar) {
        if (iVar == C3603a.ERA) {
            return iVar.mo14734h();
        }
        if (!(iVar instanceof C3603a)) {
            return iVar.mo14730d(this);
        }
        throw new C3631m("Unsupported field: " + iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo13222o(DataOutput dataOutput) {
        dataOutput.writeByte(getValue());
    }
}
