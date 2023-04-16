package p016b5;

/* renamed from: b5.t1 */
public class C1402t1 extends C1414x1 implements C1400t {

    /* renamed from: g */
    private final boolean f3600g = m5463u0();

    public C1402t1(C1391q1 q1Var) {
        super(true);
        mo4799T(q1Var);
    }

    /* renamed from: u0 */
    private final boolean m5463u0() {
        C1414x1 z;
        C1389q P = mo4797P();
        C1394r rVar = P instanceof C1394r ? (C1394r) P : null;
        C1414x1 z2 = rVar == null ? null : rVar.mo4794z();
        if (z2 == null) {
            return false;
        }
        while (!z2.mo4776L()) {
            C1389q P2 = z2.mo4797P();
            C1394r rVar2 = P2 instanceof C1394r ? (C1394r) P2 : null;
            if (rVar2 == null) {
                z = null;
                continue;
            } else {
                z = rVar2.mo4794z();
                continue;
            }
            if (z2 == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: L */
    public boolean mo4776L() {
        return this.f3600g;
    }

    /* renamed from: M */
    public boolean mo4777M() {
        return true;
    }
}
