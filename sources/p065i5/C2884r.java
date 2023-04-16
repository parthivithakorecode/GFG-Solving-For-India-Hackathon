package p065i5;

import java.io.Serializable;
import p058h5.C2746e;
import p058h5.C2749f;
import p058h5.C2778q;
import p087l5.C3603a;
import p087l5.C3614e;
import p087l5.C3632n;

/* renamed from: i5.r */
public final class C2884r extends C2870h implements Serializable {

    /* renamed from: j */
    public static final C2884r f19625j = new C2884r();

    /* renamed from: i5.r$a */
    static /* synthetic */ class C2885a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19626a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                l5.a[] r0 = p087l5.C3603a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19626a = r0
                l5.a r1 = p087l5.C3603a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19626a     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.a r1 = p087l5.C3603a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19626a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l5.a r1 = p087l5.C3603a.YEAR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p065i5.C2884r.C2885a.<clinit>():void");
        }
    }

    private C2884r() {
    }

    private Object readResolve() {
        return f19625j;
    }

    /* renamed from: j */
    public String mo13135j() {
        return "roc";
    }

    /* renamed from: k */
    public String mo13136k() {
        return "Minguo";
    }

    /* renamed from: m */
    public C2860c<C2886s> mo13137m(C3614e eVar) {
        return super.mo13137m(eVar);
    }

    /* renamed from: s */
    public C2865f<C2886s> mo13140s(C2746e eVar, C2778q qVar) {
        return super.mo13140s(eVar, qVar);
    }

    /* renamed from: t */
    public C2886s mo13189t(int i, int i2, int i3) {
        return new C2886s(C2749f.m21827T(i + 1911, i2, i3));
    }

    /* renamed from: u */
    public C2886s mo13128d(C3614e eVar) {
        return eVar instanceof C2886s ? (C2886s) eVar : new C2886s(C2749f.m21824D(eVar));
    }

    /* renamed from: v */
    public C2888t mo13133h(int i) {
        return C2888t.m22698i(i);
    }

    /* renamed from: w */
    public C3632n mo13192w(C3603a aVar) {
        int i = C2885a.f19626a[aVar.ordinal()];
        if (i == 1) {
            C3632n h = C3603a.PROLEPTIC_MONTH.mo14734h();
            return C3632n.m25183i(h.mo14758d() - 22932, h.mo14757c() - 22932);
        } else if (i == 2) {
            C3632n h2 = C3603a.YEAR.mo14734h();
            return C3632n.m25184j(1, h2.mo14757c() - 1911, (-h2.mo14758d()) + 1 + 1911);
        } else if (i != 3) {
            return aVar.mo14734h();
        } else {
            C3632n h3 = C3603a.YEAR.mo14734h();
            return C3632n.m25183i(h3.mo14758d() - 1911, h3.mo14757c() - 1911);
        }
    }
}
