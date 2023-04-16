package p065i5;

import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p038f.C2591j;
import p058h5.C2746e;
import p058h5.C2749f;
import p058h5.C2778q;
import p087l5.C3603a;
import p087l5.C3614e;
import p087l5.C3632n;

/* renamed from: i5.o */
public final class C2879o extends C2870h implements Serializable {

    /* renamed from: j */
    static final Locale f19606j = new Locale("ja", "JP", "JP");

    /* renamed from: k */
    public static final C2879o f19607k = new C2879o();

    /* renamed from: l */
    private static final Map<String, String[]> f19608l;

    /* renamed from: m */
    private static final Map<String, String[]> f19609m;

    /* renamed from: n */
    private static final Map<String, String[]> f19610n;

    /* renamed from: i5.o$a */
    static /* synthetic */ class C2880a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19611a;

        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                l5.a[] r0 = p087l5.C3603a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19611a = r0
                l5.a r1 = p087l5.C3603a.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x001d }
                l5.a r1 = p087l5.C3603a.DAY_OF_WEEK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l5.a r1 = p087l5.C3603a.MICRO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x0033 }
                l5.a r1 = p087l5.C3603a.MICRO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x003e }
                l5.a r1 = p087l5.C3603a.HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x0049 }
                l5.a r1 = p087l5.C3603a.HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x0054 }
                l5.a r1 = p087l5.C3603a.MINUTE_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x0060 }
                l5.a r1 = p087l5.C3603a.MINUTE_OF_HOUR     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x006c }
                l5.a r1 = p087l5.C3603a.SECOND_OF_DAY     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x0078 }
                l5.a r1 = p087l5.C3603a.SECOND_OF_MINUTE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x0084 }
                l5.a r1 = p087l5.C3603a.MILLI_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x0090 }
                l5.a r1 = p087l5.C3603a.MILLI_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x009c }
                l5.a r1 = p087l5.C3603a.NANO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                l5.a r1 = p087l5.C3603a.NANO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                l5.a r1 = p087l5.C3603a.CLOCK_HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                l5.a r1 = p087l5.C3603a.CLOCK_HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x00cc }
                l5.a r1 = p087l5.C3603a.EPOCH_DAY     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                l5.a r1 = p087l5.C3603a.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                l5.a r1 = p087l5.C3603a.ERA     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                l5.a r1 = p087l5.C3603a.YEAR     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x00fc }
                l5.a r1 = p087l5.C3603a.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x0108 }
                l5.a r1 = p087l5.C3603a.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = f19611a     // Catch:{ NoSuchFieldError -> 0x0114 }
                l5.a r1 = p087l5.C3603a.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p065i5.C2879o.C2880a.<clinit>():void");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f19608l = hashMap;
        HashMap hashMap2 = new HashMap();
        f19609m = hashMap2;
        HashMap hashMap3 = new HashMap();
        f19610n = hashMap3;
        hashMap.put("en", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap.put("ja", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap2.put("en", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap2.put("ja", new String[]{"Unknown", "慶", "明", "大", "昭", "平"});
        hashMap3.put("en", new String[]{"Unknown", "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        hashMap3.put("ja", new String[]{"Unknown", "慶応", "明治", "大正", "昭和", "平成"});
    }

    private C2879o() {
    }

    private Object readResolve() {
        return f19607k;
    }

    /* renamed from: j */
    public String mo13135j() {
        return "japanese";
    }

    /* renamed from: k */
    public String mo13136k() {
        return "Japanese";
    }

    /* renamed from: m */
    public C2860c<C2881p> mo13137m(C3614e eVar) {
        return super.mo13137m(eVar);
    }

    /* renamed from: s */
    public C2865f<C2881p> mo13140s(C2746e eVar, C2778q qVar) {
        return super.mo13140s(eVar, qVar);
    }

    /* renamed from: t */
    public C2881p mo13169t(int i, int i2, int i3) {
        return new C2881p(C2749f.m21827T(i, i2, i3));
    }

    /* renamed from: u */
    public C2881p mo13128d(C3614e eVar) {
        return eVar instanceof C2881p ? (C2881p) eVar : new C2881p(C2749f.m21824D(eVar));
    }

    /* renamed from: v */
    public C2883q mo13133h(int i) {
        return C2883q.m22646q(i);
    }

    /* renamed from: w */
    public int mo13172w(C2872i iVar, int i) {
        if (iVar instanceof C2883q) {
            C2883q qVar = (C2883q) iVar;
            int M = (qVar.mo13186t().mo12822M() + i) - 1;
            C3632n.m25183i(1, (long) ((qVar.mo13185o().mo12822M() - qVar.mo13186t().mo12822M()) + 1)).mo14756b((long) i, C3603a.YEAR_OF_ERA);
            return M;
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    /* renamed from: x */
    public C3632n mo13173x(C3603a aVar) {
        int[] iArr = C2880a.f19611a;
        switch (iArr[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return aVar.mo14734h();
            default:
                Calendar instance = Calendar.getInstance(f19606j);
                int i = 0;
                switch (iArr[aVar.ordinal()]) {
                    case 19:
                        C2883q[] u = C2883q.m22649u();
                        return C3632n.m25183i((long) u[0].getValue(), (long) u[u.length - 1].getValue());
                    case 20:
                        C2883q[] u2 = C2883q.m22649u();
                        return C3632n.m25183i((long) C2881p.f19612j.mo12822M(), (long) u2[u2.length - 1].mo13185o().mo12822M());
                    case 21:
                        C2883q[] u3 = C2883q.m22649u();
                        int M = (u3[u3.length - 1].mo13185o().mo12822M() - u3[u3.length - 1].mo13186t().mo12822M()) + 1;
                        int i2 = Integer.MAX_VALUE;
                        while (i < u3.length) {
                            i2 = Math.min(i2, (u3[i].mo13185o().mo12822M() - u3[i].mo13186t().mo12822M()) + 1);
                            i++;
                        }
                        return C3632n.m25185k(1, 6, (long) i2, (long) M);
                    case 22:
                        return C3632n.m25185k((long) (instance.getMinimum(2) + 1), (long) (instance.getGreatestMinimum(2) + 1), (long) (instance.getLeastMaximum(2) + 1), (long) (instance.getMaximum(2) + 1));
                    case C2591j.f18882o3:
                        C2883q[] u4 = C2883q.m22649u();
                        int i3 = 366;
                        while (i < u4.length) {
                            i3 = Math.min(i3, (u4[i].mo13186t().mo12825P() - u4[i].mo13186t().mo12819I()) + 1);
                            i++;
                        }
                        return C3632n.m25184j(1, (long) i3, 366);
                    default:
                        throw new UnsupportedOperationException("Unimplementable field: " + aVar);
                }
        }
    }
}
