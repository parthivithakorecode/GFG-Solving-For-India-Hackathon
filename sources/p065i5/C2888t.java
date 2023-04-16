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

/* renamed from: i5.t */
public enum C2888t implements C2872i {
    BEFORE_ROC,
    ROC;

    /* renamed from: i */
    public static C2888t m22698i(int i) {
        if (i == 0) {
            return BEFORE_ROC;
        }
        if (i == 1) {
            return ROC;
        }
        throw new C2742b("Invalid era: " + i);
    }

    /* renamed from: k */
    static C2888t m22699k(DataInput dataInput) {
        return m22698i(dataInput.readByte());
    }

    private Object writeReplace() {
        return new C2889u((byte) 6, this);
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
    public void mo13204o(DataOutput dataOutput) {
        dataOutput.writeByte(getValue());
    }
}
