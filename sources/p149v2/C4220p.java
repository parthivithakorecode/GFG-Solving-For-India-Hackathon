package p149v2;

import java.math.BigInteger;
import p161x2.C4305a;
import p161x2.C4329g;

/* renamed from: v2.p */
public final class C4220p extends C4215k {

    /* renamed from: a */
    private final Object f22505a;

    public C4220p(Boolean bool) {
        this.f22505a = C4305a.m26883b(bool);
    }

    public C4220p(Number number) {
        this.f22505a = C4305a.m26883b(number);
    }

    public C4220p(String str) {
        this.f22505a = C4305a.m26883b(str);
    }

    /* renamed from: v */
    private static boolean m26722v(C4220p pVar) {
        Object obj = pVar.f22505a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4220p.class != obj.getClass()) {
            return false;
        }
        C4220p pVar = (C4220p) obj;
        if (this.f22505a == null) {
            return pVar.f22505a == null;
        }
        if (m26722v(this) && m26722v(pVar)) {
            return mo15771t().longValue() == pVar.mo15771t().longValue();
        }
        Object obj2 = this.f22505a;
        if (!(obj2 instanceof Number) || !(pVar.f22505a instanceof Number)) {
            return obj2.equals(pVar.f22505a);
        }
        double doubleValue = mo15771t().doubleValue();
        double doubleValue2 = pVar.mo15771t().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f22505a == null) {
            return 31;
        }
        if (m26722v(this)) {
            doubleToLongBits = mo15771t().longValue();
        } else {
            Object obj = this.f22505a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo15771t().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: k */
    public String mo15746k() {
        return mo15773w() ? mo15771t().toString() : mo15772u() ? ((Boolean) this.f22505a).toString() : (String) this.f22505a;
    }

    /* renamed from: p */
    public boolean mo15767p() {
        return mo15772u() ? ((Boolean) this.f22505a).booleanValue() : Boolean.parseBoolean(mo15746k());
    }

    /* renamed from: q */
    public double mo15768q() {
        return mo15773w() ? mo15771t().doubleValue() : Double.parseDouble(mo15746k());
    }

    /* renamed from: r */
    public int mo15769r() {
        return mo15773w() ? mo15771t().intValue() : Integer.parseInt(mo15746k());
    }

    /* renamed from: s */
    public long mo15770s() {
        return mo15773w() ? mo15771t().longValue() : Long.parseLong(mo15746k());
    }

    /* renamed from: t */
    public Number mo15771t() {
        Object obj = this.f22505a;
        return obj instanceof String ? new C4329g((String) obj) : (Number) obj;
    }

    /* renamed from: u */
    public boolean mo15772u() {
        return this.f22505a instanceof Boolean;
    }

    /* renamed from: w */
    public boolean mo15773w() {
        return this.f22505a instanceof Number;
    }

    /* renamed from: x */
    public boolean mo15774x() {
        return this.f22505a instanceof String;
    }
}
