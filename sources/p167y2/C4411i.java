package p167y2;

import p021c3.C1439a;
import p028d3.C2488a;
import p028d3.C2490b;
import p028d3.C2491c;
import p149v2.C4203e;
import p149v2.C4223s;
import p149v2.C4227u;
import p149v2.C4232v;
import p149v2.C4233w;
import p149v2.C4235x;

/* renamed from: y2.i */
public final class C4411i extends C4233w<Number> {

    /* renamed from: b */
    private static final C4235x f22779b = m27105g(C4227u.LAZILY_PARSED_NUMBER);

    /* renamed from: a */
    private final C4232v f22780a;

    /* renamed from: y2.i$a */
    class C4412a implements C4235x {
        C4412a() {
        }

        public <T> C4233w<T> create(C4203e eVar, C1439a<T> aVar) {
            if (aVar.mo4848c() == Number.class) {
                return C4411i.this;
            }
            return null;
        }
    }

    /* renamed from: y2.i$b */
    static /* synthetic */ class C4413b {

        /* renamed from: a */
        static final /* synthetic */ int[] f22782a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                d3.b[] r0 = p028d3.C2490b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22782a = r0
                d3.b r1 = p028d3.C2490b.NULL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22782a     // Catch:{ NoSuchFieldError -> 0x001d }
                d3.b r1 = p028d3.C2490b.NUMBER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22782a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d3.b r1 = p028d3.C2490b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p167y2.C4411i.C4413b.<clinit>():void");
        }
    }

    private C4411i(C4232v vVar) {
        this.f22780a = vVar;
    }

    /* renamed from: f */
    public static C4235x m27104f(C4232v vVar) {
        return vVar == C4227u.LAZILY_PARSED_NUMBER ? f22779b : m27105g(vVar);
    }

    /* renamed from: g */
    private static C4235x m27105g(C4232v vVar) {
        return new C4412a();
    }

    /* renamed from: h */
    public Number mo4624c(C2488a aVar) {
        C2490b V = aVar.mo12354V();
        int i = C4413b.f22782a[V.ordinal()];
        if (i == 1) {
            aVar.mo12352R();
            return null;
        } else if (i == 2 || i == 3) {
            return this.f22780a.mo15776b(aVar);
        } else {
            throw new C4223s("Expecting number, got: " + V);
        }
    }

    /* renamed from: i */
    public void mo4625e(C2491c cVar, Number number) {
        cVar.mo12376X(number);
    }
}
