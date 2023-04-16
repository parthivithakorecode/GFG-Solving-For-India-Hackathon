package p065i5;

import java.io.Serializable;
import java.util.HashMap;
import p058h5.C2746e;
import p058h5.C2749f;
import p058h5.C2778q;
import p087l5.C3603a;
import p087l5.C3614e;
import p087l5.C3632n;

/* renamed from: i5.v */
public final class C2890v extends C2870h implements Serializable {

    /* renamed from: j */
    public static final C2890v f19634j = new C2890v();

    /* renamed from: k */
    private static final HashMap<String, String[]> f19635k;

    /* renamed from: l */
    private static final HashMap<String, String[]> f19636l;

    /* renamed from: m */
    private static final HashMap<String, String[]> f19637m;

    /* renamed from: i5.v$a */
    static /* synthetic */ class C2891a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19638a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                l5.a[] r0 = p087l5.C3603a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19638a = r0
                l5.a r1 = p087l5.C3603a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19638a     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.a r1 = p087l5.C3603a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19638a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l5.a r1 = p087l5.C3603a.YEAR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p065i5.C2890v.C2891a.<clinit>():void");
        }
    }

    static {
        HashMap<String, String[]> hashMap = new HashMap<>();
        f19635k = hashMap;
        HashMap<String, String[]> hashMap2 = new HashMap<>();
        f19636l = hashMap2;
        HashMap<String, String[]> hashMap3 = new HashMap<>();
        f19637m = hashMap3;
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private C2890v() {
    }

    private Object readResolve() {
        return f19634j;
    }

    /* renamed from: j */
    public String mo13135j() {
        return "buddhist";
    }

    /* renamed from: k */
    public String mo13136k() {
        return "ThaiBuddhist";
    }

    /* renamed from: m */
    public C2860c<C2892w> mo13137m(C3614e eVar) {
        return super.mo13137m(eVar);
    }

    /* renamed from: s */
    public C2865f<C2892w> mo13140s(C2746e eVar, C2778q qVar) {
        return super.mo13140s(eVar, qVar);
    }

    /* renamed from: t */
    public C2892w mo13207t(int i, int i2, int i3) {
        return new C2892w(C2749f.m21827T(i - 543, i2, i3));
    }

    /* renamed from: u */
    public C2892w mo13128d(C3614e eVar) {
        return eVar instanceof C2892w ? (C2892w) eVar : new C2892w(C2749f.m21824D(eVar));
    }

    /* renamed from: v */
    public C2894x mo13133h(int i) {
        return C2894x.m22753i(i);
    }

    /* renamed from: w */
    public C3632n mo13210w(C3603a aVar) {
        int i = C2891a.f19638a[aVar.ordinal()];
        if (i == 1) {
            C3632n h = C3603a.PROLEPTIC_MONTH.mo14734h();
            return C3632n.m25183i(h.mo14758d() + 6516, h.mo14757c() + 6516);
        } else if (i == 2) {
            C3632n h2 = C3603a.YEAR.mo14734h();
            return C3632n.m25184j(1, 1 + (-(h2.mo14758d() + 543)), h2.mo14757c() + 543);
        } else if (i != 3) {
            return aVar.mo14734h();
        } else {
            C3632n h3 = C3603a.YEAR.mo14734h();
            return C3632n.m25183i(h3.mo14758d() + 543, h3.mo14757c() + 543);
        }
    }
}
