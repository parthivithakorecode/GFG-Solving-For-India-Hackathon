package p058h5;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.util.regex.Pattern;
import p080k5.C3334d;
import p094m5.C3732f;
import p094m5.C3734g;
import p094m5.C3738i;

/* renamed from: h5.s */
final class C2782s extends C2778q {

    /* renamed from: j */
    private static final Pattern f19422j = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");

    /* renamed from: h */
    private final String f19423h;

    /* renamed from: i */
    private final transient C3732f f19424i;

    C2782s(String str, C3732f fVar) {
        this.f19423h = str;
        this.f19424i = fVar;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* renamed from: t */
    static C2782s m22156t(String str, boolean z) {
        C3334d.m24473i(str, "zoneId");
        if (str.length() < 2 || !f19422j.matcher(str).matches()) {
            throw new C2742b("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        C3732f fVar = null;
        try {
            fVar = C3738i.m25479c(str, true);
        } catch (C3734g e) {
            if (str.equals("GMT0")) {
                fVar = C2780r.f19417m.mo13005o();
            } else if (z) {
                throw e;
            }
        }
        return new C2782s(str, fVar);
    }

    /* renamed from: u */
    private static C2782s m22157u(String str) {
        if (str.equals("Z") || str.startsWith("+") || str.startsWith("-")) {
            throw new C2742b("Invalid ID for region-based ZoneId, invalid format: " + str);
        } else if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
            return new C2782s(str, C2780r.f19417m.mo13005o());
        } else {
            if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
                C2780r x = C2780r.m22139x(str.substring(3));
                if (x.mo13013w() == 0) {
                    return new C2782s(str.substring(0, 3), x.mo13005o());
                }
                return new C2782s(str.substring(0, 3) + x.mo13004k(), x.mo13005o());
            } else if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                return m22156t(str, false);
            } else {
                C2780r x2 = C2780r.m22139x(str.substring(2));
                if (x2.mo13013w() == 0) {
                    return new C2782s("UT", x2.mo13005o());
                }
                return new C2782s("UT" + x2.mo13004k(), x2.mo13005o());
            }
        }
    }

    /* renamed from: v */
    static C2778q m22158v(DataInput dataInput) {
        return m22157u(dataInput.readUTF());
    }

    private Object writeReplace() {
        return new C2771n((byte) 7, this);
    }

    /* renamed from: k */
    public String mo13004k() {
        return this.f19423h;
    }

    /* renamed from: o */
    public C3732f mo13005o() {
        C3732f fVar = this.f19424i;
        return fVar != null ? fVar : C3738i.m25479c(this.f19423h, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo13007s(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        mo13015w(dataOutput);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo13015w(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f19423h);
    }
}
