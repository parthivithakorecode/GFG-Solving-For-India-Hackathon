package p065i5;

import java.io.Serializable;
import java.util.HashMap;
import p058h5.C2742b;
import p058h5.C2746e;
import p058h5.C2778q;
import p087l5.C3603a;
import p087l5.C3614e;
import p087l5.C3632n;

/* renamed from: i5.j */
public final class C2873j extends C2870h implements Serializable {

    /* renamed from: j */
    public static final C2873j f19563j = new C2873j();

    /* renamed from: k */
    private static final HashMap<String, String[]> f19564k;

    /* renamed from: l */
    private static final HashMap<String, String[]> f19565l;

    /* renamed from: m */
    private static final HashMap<String, String[]> f19566m;

    static {
        HashMap<String, String[]> hashMap = new HashMap<>();
        f19564k = hashMap;
        HashMap<String, String[]> hashMap2 = new HashMap<>();
        f19565l = hashMap2;
        HashMap<String, String[]> hashMap3 = new HashMap<>();
        f19566m = hashMap3;
        hashMap.put("en", new String[]{"BH", "HE"});
        hashMap2.put("en", new String[]{"B.H.", "H.E."});
        hashMap3.put("en", new String[]{"Before Hijrah", "Hijrah Era"});
    }

    private C2873j() {
    }

    private Object readResolve() {
        return f19563j;
    }

    /* renamed from: j */
    public String mo13135j() {
        return "islamic-umalqura";
    }

    /* renamed from: k */
    public String mo13136k() {
        return "Hijrah-umalqura";
    }

    /* renamed from: m */
    public C2860c<C2874k> mo13137m(C3614e eVar) {
        return super.mo13137m(eVar);
    }

    /* renamed from: s */
    public C2865f<C2874k> mo13140s(C2746e eVar, C2778q qVar) {
        return super.mo13140s(eVar, qVar);
    }

    /* renamed from: t */
    public C2874k mo13144t(int i, int i2, int i3) {
        return C2874k.m22528g0(i, i2, i3);
    }

    /* renamed from: u */
    public C2874k mo13128d(C3614e eVar) {
        return eVar instanceof C2874k ? (C2874k) eVar : C2874k.m22530i0(eVar.mo12777d(C3603a.EPOCH_DAY));
    }

    /* renamed from: v */
    public C2876l mo13133h(int i) {
        if (i == 0) {
            return C2876l.BEFORE_AH;
        }
        if (i == 1) {
            return C2876l.AH;
        }
        throw new C2742b("invalid Hijrah era");
    }

    /* renamed from: w */
    public C3632n mo13147w(C3603a aVar) {
        return aVar.mo14734h();
    }
}
