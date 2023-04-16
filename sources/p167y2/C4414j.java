package p167y2;

import java.util.ArrayList;
import p021c3.C1439a;
import p028d3.C2488a;
import p028d3.C2491c;
import p149v2.C4203e;
import p149v2.C4227u;
import p149v2.C4232v;
import p149v2.C4233w;
import p149v2.C4235x;
import p161x2.C4330h;

/* renamed from: y2.j */
public final class C4414j extends C4233w<Object> {

    /* renamed from: c */
    private static final C4235x f22783c = m27111g(C4227u.DOUBLE);

    /* renamed from: a */
    private final C4203e f22784a;

    /* renamed from: b */
    private final C4232v f22785b;

    /* renamed from: y2.j$a */
    class C4415a implements C4235x {

        /* renamed from: f */
        final /* synthetic */ C4232v f22786f;

        C4415a(C4232v vVar) {
            this.f22786f = vVar;
        }

        public <T> C4233w<T> create(C4203e eVar, C1439a<T> aVar) {
            if (aVar.mo4848c() == Object.class) {
                return new C4414j(eVar, this.f22786f, (C4415a) null);
            }
            return null;
        }
    }

    /* renamed from: y2.j$b */
    static /* synthetic */ class C4416b {

        /* renamed from: a */
        static final /* synthetic */ int[] f22787a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                d3.b[] r0 = p028d3.C2490b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22787a = r0
                d3.b r1 = p028d3.C2490b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22787a     // Catch:{ NoSuchFieldError -> 0x001d }
                d3.b r1 = p028d3.C2490b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22787a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d3.b r1 = p028d3.C2490b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22787a     // Catch:{ NoSuchFieldError -> 0x0033 }
                d3.b r1 = p028d3.C2490b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f22787a     // Catch:{ NoSuchFieldError -> 0x003e }
                d3.b r1 = p028d3.C2490b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f22787a     // Catch:{ NoSuchFieldError -> 0x0049 }
                d3.b r1 = p028d3.C2490b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p167y2.C4414j.C4416b.<clinit>():void");
        }
    }

    private C4414j(C4203e eVar, C4232v vVar) {
        this.f22784a = eVar;
        this.f22785b = vVar;
    }

    /* synthetic */ C4414j(C4203e eVar, C4232v vVar, C4415a aVar) {
        this(eVar, vVar);
    }

    /* renamed from: f */
    public static C4235x m27110f(C4232v vVar) {
        return vVar == C4227u.DOUBLE ? f22783c : m27111g(vVar);
    }

    /* renamed from: g */
    private static C4235x m27111g(C4232v vVar) {
        return new C4415a(vVar);
    }

    /* renamed from: c */
    public Object mo4624c(C2488a aVar) {
        switch (C4416b.f22787a[aVar.mo12354V().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.mo12357d();
                while (aVar.mo12344B()) {
                    arrayList.add(mo4624c(aVar));
                }
                aVar.mo12363v();
                return arrayList;
            case 2:
                C4330h hVar = new C4330h();
                aVar.mo12359h();
                while (aVar.mo12344B()) {
                    hVar.put(aVar.mo12351P(), mo4624c(aVar));
                }
                aVar.mo12364w();
                return hVar;
            case 3:
                return aVar.mo12353T();
            case 4:
                return this.f22785b.mo15776b(aVar);
            case 5:
                return Boolean.valueOf(aVar.mo12347H());
            case 6:
                aVar.mo12352R();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    public void mo4625e(C2491c cVar, Object obj) {
        if (obj == null) {
            cVar.mo12369H();
            return;
        }
        C4233w<?> k = this.f22784a.mo15717k(obj.getClass());
        if (k instanceof C4414j) {
            cVar.mo12382n();
            cVar.mo12384w();
            return;
        }
        k.mo4625e(cVar, obj);
    }
}
