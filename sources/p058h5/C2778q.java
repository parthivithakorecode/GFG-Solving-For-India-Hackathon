package p058h5;

import java.io.DataOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p080k5.C3334d;
import p087l5.C3614e;
import p087l5.C3621j;
import p087l5.C3629k;
import p094m5.C3732f;
import p094m5.C3734g;

/* renamed from: h5.q */
public abstract class C2778q implements Serializable {

    /* renamed from: f */
    public static final C3629k<C2778q> f19412f = new C2779a();

    /* renamed from: g */
    public static final Map<String, String> f19413g;

    /* renamed from: h5.q$a */
    class C2779a implements C3629k<C2778q> {
        C2779a() {
        }

        /* renamed from: b */
        public C2778q mo12783a(C3614e eVar) {
            return C2778q.m22124i(eVar);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        f19413g = Collections.unmodifiableMap(hashMap);
    }

    C2778q() {
        if (getClass() != C2780r.class && getClass() != C2782s.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    /* renamed from: i */
    public static C2778q m22124i(C3614e eVar) {
        C2778q qVar = (C2778q) eVar.mo12776b(C3621j.m25164f());
        if (qVar != null) {
            return qVar;
        }
        throw new C2742b("Unable to obtain ZoneId from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    /* renamed from: q */
    public static C2778q m22125q(String str) {
        C3334d.m24473i(str, "zoneId");
        if (str.equals("Z")) {
            return C2780r.f19417m;
        }
        if (str.length() == 1) {
            throw new C2742b("Invalid zone: " + str);
        } else if (str.startsWith("+") || str.startsWith("-")) {
            return C2780r.m22139x(str);
        } else {
            if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
                return new C2782s(str, C2780r.f19417m.mo13005o());
            }
            if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
                C2780r x = C2780r.m22139x(str.substring(3));
                if (x.mo13013w() == 0) {
                    return new C2782s(str.substring(0, 3), x.mo13005o());
                }
                return new C2782s(str.substring(0, 3) + x.mo13004k(), x.mo13005o());
            } else if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                return C2782s.m22156t(str, true);
            } else {
                C2780r x2 = C2780r.m22139x(str.substring(2));
                if (x2.mo13013w() == 0) {
                    return new C2782s("UT", x2.mo13005o());
                }
                return new C2782s("UT" + x2.mo13004k(), x2.mo13005o());
            }
        }
    }

    /* renamed from: r */
    public static C2778q m22126r(String str, C2780r rVar) {
        C3334d.m24473i(str, "prefix");
        C3334d.m24473i(rVar, "offset");
        if (str.length() == 0) {
            return rVar;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("Invalid prefix, must be GMT, UTC or UT: " + str);
        } else if (rVar.mo13013w() == 0) {
            return new C2782s(str, rVar.mo13005o());
        } else {
            return new C2782s(str + rVar.mo13004k(), rVar.mo13005o());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2778q) {
            return mo13004k().equals(((C2778q) obj).mo13004k());
        }
        return false;
    }

    public int hashCode() {
        return mo13004k().hashCode();
    }

    /* renamed from: k */
    public abstract String mo13004k();

    /* renamed from: o */
    public abstract C3732f mo13005o();

    /* renamed from: p */
    public C2778q mo13006p() {
        try {
            C3732f o = mo13005o();
            if (o.mo14912d()) {
                return o.mo14909a(C2746e.f19327h);
            }
        } catch (C3734g unused) {
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract void mo13007s(DataOutput dataOutput);

    public String toString() {
        return mo13004k();
    }
}
