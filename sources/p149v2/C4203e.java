package p149v2;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p014b3.C1309d;
import p021c3.C1439a;
import p028d3.C2488a;
import p028d3.C2490b;
import p028d3.C2491c;
import p028d3.C2492d;
import p161x2.C4310c;
import p161x2.C4325d;
import p161x2.C4341l;
import p167y2.C4394a;
import p167y2.C4396b;
import p167y2.C4398c;
import p167y2.C4404e;
import p167y2.C4409h;
import p167y2.C4411i;
import p167y2.C4414j;
import p167y2.C4417k;
import p167y2.C4425n;

/* renamed from: v2.e */
public final class C4203e {

    /* renamed from: x */
    private static final C1439a<?> f22455x = C1439a.m5626a(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<C1439a<?>, C4209f<?>>> f22456a = new ThreadLocal<>();

    /* renamed from: b */
    private final Map<C1439a<?>, C4233w<?>> f22457b = new ConcurrentHashMap();

    /* renamed from: c */
    private final C4310c f22458c;

    /* renamed from: d */
    private final C4404e f22459d;

    /* renamed from: e */
    final List<C4235x> f22460e;

    /* renamed from: f */
    final C4325d f22461f;

    /* renamed from: g */
    final C4202d f22462g;

    /* renamed from: h */
    final Map<Type, C4211g<?>> f22463h;

    /* renamed from: i */
    final boolean f22464i;

    /* renamed from: j */
    final boolean f22465j;

    /* renamed from: k */
    final boolean f22466k;

    /* renamed from: l */
    final boolean f22467l;

    /* renamed from: m */
    final boolean f22468m;

    /* renamed from: n */
    final boolean f22469n;

    /* renamed from: o */
    final boolean f22470o;

    /* renamed from: p */
    final String f22471p;

    /* renamed from: q */
    final int f22472q;

    /* renamed from: r */
    final int f22473r;

    /* renamed from: s */
    final C4224t f22474s;

    /* renamed from: t */
    final List<C4235x> f22475t;

    /* renamed from: u */
    final List<C4235x> f22476u;

    /* renamed from: v */
    final C4232v f22477v;

    /* renamed from: w */
    final C4232v f22478w;

    /* renamed from: v2.e$a */
    class C4204a extends C4233w<Number> {
        C4204a() {
        }

        /* renamed from: f */
        public Double mo4624c(C2488a aVar) {
            if (aVar.mo12354V() != C2490b.NULL) {
                return Double.valueOf(aVar.mo12348I());
            }
            aVar.mo12352R();
            return null;
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, Number number) {
            if (number == null) {
                cVar.mo12369H();
                return;
            }
            C4203e.m26661d(number.doubleValue());
            cVar.mo12376X(number);
        }
    }

    /* renamed from: v2.e$b */
    class C4205b extends C4233w<Number> {
        C4205b() {
        }

        /* renamed from: f */
        public Float mo4624c(C2488a aVar) {
            if (aVar.mo12354V() != C2490b.NULL) {
                return Float.valueOf((float) aVar.mo12348I());
            }
            aVar.mo12352R();
            return null;
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, Number number) {
            if (number == null) {
                cVar.mo12369H();
                return;
            }
            C4203e.m26661d((double) number.floatValue());
            cVar.mo12376X(number);
        }
    }

    /* renamed from: v2.e$c */
    class C4206c extends C4233w<Number> {
        C4206c() {
        }

        /* renamed from: f */
        public Number mo4624c(C2488a aVar) {
            if (aVar.mo12354V() != C2490b.NULL) {
                return Long.valueOf(aVar.mo12350O());
            }
            aVar.mo12352R();
            return null;
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, Number number) {
            if (number == null) {
                cVar.mo12369H();
            } else {
                cVar.mo12377Y(number.toString());
            }
        }
    }

    /* renamed from: v2.e$d */
    class C4207d extends C4233w<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ C4233w f22481a;

        C4207d(C4233w wVar) {
            this.f22481a = wVar;
        }

        /* renamed from: f */
        public AtomicLong mo4624c(C2488a aVar) {
            return new AtomicLong(((Number) this.f22481a.mo4624c(aVar)).longValue());
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, AtomicLong atomicLong) {
            this.f22481a.mo4625e(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: v2.e$e */
    class C4208e extends C4233w<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ C4233w f22482a;

        C4208e(C4233w wVar) {
            this.f22482a = wVar;
        }

        /* renamed from: f */
        public AtomicLongArray mo4624c(C2488a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.mo12357d();
            while (aVar.mo12344B()) {
                arrayList.add(Long.valueOf(((Number) this.f22482a.mo4624c(aVar)).longValue()));
            }
            aVar.mo12363v();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: g */
        public void mo4625e(C2491c cVar, AtomicLongArray atomicLongArray) {
            cVar.mo12381m();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f22482a.mo4625e(cVar, Long.valueOf(atomicLongArray.get(i)));
            }
            cVar.mo12383v();
        }
    }

    /* renamed from: v2.e$f */
    static class C4209f<T> extends C4233w<T> {

        /* renamed from: a */
        private C4233w<T> f22483a;

        C4209f() {
        }

        /* renamed from: c */
        public T mo4624c(C2488a aVar) {
            C4233w<T> wVar = this.f22483a;
            if (wVar != null) {
                return wVar.mo4624c(aVar);
            }
            throw new IllegalStateException();
        }

        /* renamed from: e */
        public void mo4625e(C2491c cVar, T t) {
            C4233w<T> wVar = this.f22483a;
            if (wVar != null) {
                wVar.mo4625e(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: f */
        public void mo15739f(C4233w<T> wVar) {
            if (this.f22483a == null) {
                this.f22483a = wVar;
                return;
            }
            throw new AssertionError();
        }
    }

    C4203e(C4325d dVar, C4202d dVar2, Map<Type, C4211g<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C4224t tVar, String str, int i, int i2, List<C4235x> list, List<C4235x> list2, List<C4235x> list3, C4232v vVar, C4232v vVar2) {
        boolean z8 = z2;
        boolean z9 = z7;
        this.f22461f = dVar;
        this.f22462g = dVar2;
        this.f22463h = map;
        C4310c cVar = new C4310c(map);
        this.f22458c = cVar;
        this.f22464i = z;
        this.f22465j = z8;
        this.f22466k = z3;
        this.f22467l = z4;
        this.f22468m = z5;
        this.f22469n = z6;
        this.f22470o = z9;
        this.f22474s = tVar;
        this.f22471p = str;
        this.f22472q = i;
        this.f22473r = i2;
        this.f22475t = list;
        this.f22476u = list2;
        this.f22477v = vVar;
        this.f22478w = vVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4425n.f22837V);
        arrayList.add(C4414j.m27110f(vVar));
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(C4425n.f22817B);
        arrayList.add(C4425n.f22851m);
        arrayList.add(C4425n.f22845g);
        arrayList.add(C4425n.f22847i);
        arrayList.add(C4425n.f22849k);
        C4233w<Number> m = m26664m(tVar);
        arrayList.add(C4425n.m27133a(Long.TYPE, Long.class, m));
        arrayList.add(C4425n.m27133a(Double.TYPE, Double.class, m26662e(z9)));
        arrayList.add(C4425n.m27133a(Float.TYPE, Float.class, m26663f(z9)));
        arrayList.add(C4411i.m27104f(vVar2));
        arrayList.add(C4425n.f22853o);
        arrayList.add(C4425n.f22855q);
        arrayList.add(C4425n.m27134b(AtomicLong.class, m26659b(m)));
        arrayList.add(C4425n.m27134b(AtomicLongArray.class, m26660c(m)));
        arrayList.add(C4425n.f22857s);
        arrayList.add(C4425n.f22862x);
        arrayList.add(C4425n.f22819D);
        arrayList.add(C4425n.f22821F);
        arrayList.add(C4425n.m27134b(BigDecimal.class, C4425n.f22864z));
        arrayList.add(C4425n.m27134b(BigInteger.class, C4425n.f22816A));
        arrayList.add(C4425n.f22823H);
        arrayList.add(C4425n.f22825J);
        arrayList.add(C4425n.f22829N);
        arrayList.add(C4425n.f22831P);
        arrayList.add(C4425n.f22835T);
        arrayList.add(C4425n.f22827L);
        arrayList.add(C4425n.f22842d);
        arrayList.add(C4398c.f22755b);
        arrayList.add(C4425n.f22833R);
        if (C1309d.f3517a) {
            arrayList.add(C1309d.f3521e);
            arrayList.add(C1309d.f3520d);
            arrayList.add(C1309d.f3522f);
        }
        arrayList.add(C4394a.f22749c);
        arrayList.add(C4425n.f22840b);
        arrayList.add(new C4396b(cVar));
        arrayList.add(new C4409h(cVar, z8));
        C4404e eVar = new C4404e(cVar);
        this.f22459d = eVar;
        arrayList.add(eVar);
        arrayList.add(C4425n.f22838W);
        arrayList.add(new C4417k(cVar, dVar2, dVar, eVar));
        this.f22460e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static void m26658a(Object obj, C2488a aVar) {
        if (obj != null) {
            try {
                if (aVar.mo12354V() != C2490b.END_DOCUMENT) {
                    throw new C4216l("JSON document was not fully consumed.");
                }
            } catch (C2492d e) {
                throw new C4223s((Throwable) e);
            } catch (IOException e2) {
                throw new C4216l((Throwable) e2);
            }
        }
    }

    /* renamed from: b */
    private static C4233w<AtomicLong> m26659b(C4233w<Number> wVar) {
        return new C4207d(wVar).mo15780b();
    }

    /* renamed from: c */
    private static C4233w<AtomicLongArray> m26660c(C4233w<Number> wVar) {
        return new C4208e(wVar).mo15780b();
    }

    /* renamed from: d */
    static void m26661d(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: e */
    private C4233w<Number> m26662e(boolean z) {
        return z ? C4425n.f22860v : new C4204a();
    }

    /* renamed from: f */
    private C4233w<Number> m26663f(boolean z) {
        return z ? C4425n.f22859u : new C4205b();
    }

    /* renamed from: m */
    private static C4233w<Number> m26664m(C4224t tVar) {
        return tVar == C4224t.DEFAULT ? C4425n.f22858t : new C4206c();
    }

    /* renamed from: g */
    public <T> T mo15713g(C2488a aVar, Type type) {
        boolean C = aVar.mo12345C();
        aVar.mo12355a0(true);
        try {
            aVar.mo12354V();
            T c = mo15716j(C1439a.m5627b(type)).mo4624c(aVar);
            aVar.mo12355a0(C);
            return c;
        } catch (EOFException e) {
            if (1 != 0) {
                aVar.mo12355a0(C);
                return null;
            }
            throw new C4223s((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new C4223s((Throwable) e2);
        } catch (IOException e3) {
            throw new C4223s((Throwable) e3);
        } catch (AssertionError e4) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e4.getMessage());
            assertionError.initCause(e4);
            throw assertionError;
        } catch (Throwable th) {
            aVar.mo12355a0(C);
            throw th;
        }
    }

    /* renamed from: h */
    public <T> T mo15714h(Reader reader, Type type) {
        C2488a n = mo15719n(reader);
        T g = mo15713g(n, type);
        m26658a(g, n);
        return g;
    }

    /* renamed from: i */
    public <T> T mo15715i(String str, Type type) {
        if (str == null) {
            return null;
        }
        return mo15714h(new StringReader(str), type);
    }

    /* renamed from: j */
    public <T> C4233w<T> mo15716j(C1439a<T> aVar) {
        C4233w<T> wVar = this.f22457b.get(aVar == null ? f22455x : aVar);
        if (wVar != null) {
            return wVar;
        }
        Map map = this.f22456a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.f22456a.set(map);
            z = true;
        }
        C4209f fVar = (C4209f) map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            C4209f fVar2 = new C4209f();
            map.put(aVar, fVar2);
            for (C4235x create : this.f22460e) {
                C4233w<T> create2 = create.create(this, aVar);
                if (create2 != null) {
                    fVar2.mo15739f(create2);
                    this.f22457b.put(aVar, create2);
                    return create2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.9) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f22456a.remove();
            }
        }
    }

    /* renamed from: k */
    public <T> C4233w<T> mo15717k(Class<T> cls) {
        return mo15716j(C1439a.m5626a(cls));
    }

    /* renamed from: l */
    public <T> C4233w<T> mo15718l(C4235x xVar, C1439a<T> aVar) {
        if (!this.f22460e.contains(xVar)) {
            xVar = this.f22459d;
        }
        boolean z = false;
        for (C4235x next : this.f22460e) {
            if (z) {
                C4233w<T> create = next.create(this, aVar);
                if (create != null) {
                    return create;
                }
            } else if (next == xVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    /* renamed from: n */
    public C2488a mo15719n(Reader reader) {
        C2488a aVar = new C2488a(reader);
        aVar.mo12355a0(this.f22469n);
        return aVar;
    }

    /* renamed from: o */
    public C2491c mo15720o(Writer writer) {
        if (this.f22466k) {
            writer.write(")]}'\n");
        }
        C2491c cVar = new C2491c(writer);
        if (this.f22468m) {
            cVar.mo12371R("  ");
        }
        cVar.mo12373T(this.f22464i);
        return cVar;
    }

    /* renamed from: p */
    public String mo15721p(Object obj) {
        return obj == null ? mo15723r(C4217m.f22503a) : mo15722q(obj, obj.getClass());
    }

    /* renamed from: q */
    public String mo15722q(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        mo15725t(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: r */
    public String mo15723r(C4215k kVar) {
        StringWriter stringWriter = new StringWriter();
        mo15728v(kVar, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: s */
    public void mo15724s(Object obj, Type type, C2491c cVar) {
        C4233w<?> j = mo15716j(C1439a.m5627b(type));
        boolean C = cVar.mo12367C();
        cVar.mo12372S(true);
        boolean B = cVar.mo12366B();
        cVar.mo12370Q(this.f22467l);
        boolean z = cVar.mo12385z();
        cVar.mo12373T(this.f22464i);
        try {
            j.mo4625e(cVar, obj);
            cVar.mo12372S(C);
            cVar.mo12370Q(B);
            cVar.mo12373T(z);
        } catch (IOException e) {
            throw new C4216l((Throwable) e);
        } catch (AssertionError e2) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e2.getMessage());
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            cVar.mo12372S(C);
            cVar.mo12370Q(B);
            cVar.mo12373T(z);
            throw th;
        }
    }

    /* renamed from: t */
    public void mo15725t(Object obj, Type type, Appendable appendable) {
        try {
            mo15724s(obj, type, mo15720o(C4341l.m26966c(appendable)));
        } catch (IOException e) {
            throw new C4216l((Throwable) e);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f22464i + ",factories:" + this.f22460e + ",instanceCreators:" + this.f22458c + "}";
    }

    /* renamed from: u */
    public void mo15727u(C4215k kVar, C2491c cVar) {
        boolean C = cVar.mo12367C();
        cVar.mo12372S(true);
        boolean B = cVar.mo12366B();
        cVar.mo12370Q(this.f22467l);
        boolean z = cVar.mo12385z();
        cVar.mo12373T(this.f22464i);
        try {
            C4341l.m26965b(kVar, cVar);
            cVar.mo12372S(C);
            cVar.mo12370Q(B);
            cVar.mo12373T(z);
        } catch (IOException e) {
            throw new C4216l((Throwable) e);
        } catch (AssertionError e2) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e2.getMessage());
            assertionError.initCause(e2);
            throw assertionError;
        } catch (Throwable th) {
            cVar.mo12372S(C);
            cVar.mo12370Q(B);
            cVar.mo12373T(z);
            throw th;
        }
    }

    /* renamed from: v */
    public void mo15728v(C4215k kVar, Appendable appendable) {
        try {
            mo15727u(kVar, mo15720o(C4341l.m26966c(appendable)));
        } catch (IOException e) {
            throw new C4216l((Throwable) e);
        }
    }
}
