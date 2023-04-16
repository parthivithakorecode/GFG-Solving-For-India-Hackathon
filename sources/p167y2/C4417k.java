package p167y2;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p004a3.C0118b;
import p021c3.C1439a;
import p028d3.C2488a;
import p028d3.C2490b;
import p028d3.C2491c;
import p149v2.C4202d;
import p149v2.C4203e;
import p149v2.C4223s;
import p149v2.C4233w;
import p149v2.C4235x;
import p155w2.C4266b;
import p155w2.C4267c;
import p161x2.C4306b;
import p161x2.C4310c;
import p161x2.C4325d;
import p161x2.C4338i;
import p161x2.C4340k;

/* renamed from: y2.k */
public final class C4417k implements C4235x {

    /* renamed from: f */
    private final C4310c f22788f;

    /* renamed from: g */
    private final C4202d f22789g;

    /* renamed from: h */
    private final C4325d f22790h;

    /* renamed from: i */
    private final C4404e f22791i;

    /* renamed from: j */
    private final C0118b f22792j = C0118b.m364a();

    /* renamed from: y2.k$a */
    class C4418a extends C4420c {

        /* renamed from: d */
        final /* synthetic */ Field f22793d;

        /* renamed from: e */
        final /* synthetic */ boolean f22794e;

        /* renamed from: f */
        final /* synthetic */ C4233w f22795f;

        /* renamed from: g */
        final /* synthetic */ C4203e f22796g;

        /* renamed from: h */
        final /* synthetic */ C1439a f22797h;

        /* renamed from: i */
        final /* synthetic */ boolean f22798i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4418a(String str, boolean z, boolean z2, Field field, boolean z3, C4233w wVar, C4203e eVar, C1439a aVar, boolean z4) {
            super(str, z, z2);
            this.f22793d = field;
            this.f22794e = z3;
            this.f22795f = wVar;
            this.f22796g = eVar;
            this.f22797h = aVar;
            this.f22798i = z4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16036a(C2488a aVar, Object obj) {
            Object c = this.f22795f.mo4624c(aVar);
            if (c != null || !this.f22798i) {
                this.f22793d.set(obj, c);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo16037b(C2491c cVar, Object obj) {
            (this.f22794e ? this.f22795f : new C4424m(this.f22796g, this.f22795f, this.f22797h.mo4849e())).mo4625e(cVar, this.f22793d.get(obj));
        }

        /* renamed from: c */
        public boolean mo16038c(Object obj) {
            return this.f22803b && this.f22793d.get(obj) != obj;
        }
    }

    /* renamed from: y2.k$b */
    public static final class C4419b<T> extends C4233w<T> {

        /* renamed from: a */
        private final C4338i<T> f22800a;

        /* renamed from: b */
        private final Map<String, C4420c> f22801b;

        C4419b(C4338i<T> iVar, Map<String, C4420c> map) {
            this.f22800a = iVar;
            this.f22801b = map;
        }

        /* renamed from: c */
        public T mo4624c(C2488a aVar) {
            if (aVar.mo12354V() == C2490b.NULL) {
                aVar.mo12352R();
                return null;
            }
            T a = this.f22800a.mo15902a();
            try {
                aVar.mo12359h();
                while (aVar.mo12344B()) {
                    C4420c cVar = this.f22801b.get(aVar.mo12351P());
                    if (cVar != null) {
                        if (cVar.f22804c) {
                            cVar.mo16036a(aVar, a);
                        }
                    }
                    aVar.mo12358f0();
                }
                aVar.mo12364w();
                return a;
            } catch (IllegalStateException e) {
                throw new C4223s((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: e */
        public void mo4625e(C2491c cVar, T t) {
            if (t == null) {
                cVar.mo12369H();
                return;
            }
            cVar.mo12382n();
            try {
                for (C4420c next : this.f22801b.values()) {
                    if (next.mo16038c(t)) {
                        cVar.mo12368F(next.f22802a);
                        next.mo16037b(cVar, t);
                    }
                }
                cVar.mo12384w();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: y2.k$c */
    static abstract class C4420c {

        /* renamed from: a */
        final String f22802a;

        /* renamed from: b */
        final boolean f22803b;

        /* renamed from: c */
        final boolean f22804c;

        protected C4420c(String str, boolean z, boolean z2) {
            this.f22802a = str;
            this.f22803b = z;
            this.f22804c = z2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo16036a(C2488a aVar, Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo16037b(C2491c cVar, Object obj);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo16038c(Object obj);
    }

    public C4417k(C4310c cVar, C4202d dVar, C4325d dVar2, C4404e eVar) {
        this.f22788f = cVar;
        this.f22789g = dVar;
        this.f22790h = dVar2;
        this.f22791i = eVar;
    }

    /* renamed from: a */
    private C4420c m27114a(C4203e eVar, Field field, String str, C1439a<?> aVar, boolean z, boolean z2) {
        C4203e eVar2 = eVar;
        C1439a<?> aVar2 = aVar;
        boolean a = C4340k.m26963a(aVar.mo4848c());
        Field field2 = field;
        C4266b bVar = (C4266b) field.getAnnotation(C4266b.class);
        C4233w<?> a2 = bVar != null ? this.f22791i.mo16022a(this.f22788f, eVar, aVar2, bVar) : null;
        boolean z3 = a2 != null;
        if (a2 == null) {
            a2 = eVar.mo15716j(aVar2);
        }
        return new C4418a(str, z, z2, field, z3, a2, eVar, aVar, a);
    }

    /* renamed from: c */
    static boolean m27115c(Field field, boolean z, C4325d dVar) {
        return !dVar.mo15904b(field.getType(), z) && !dVar.mo15906e(field, z);
    }

    /* renamed from: d */
    private Map<String, C4420c> m27116d(C4203e eVar, C1439a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type e = aVar.mo4849e();
        C1439a<?> aVar2 = aVar;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean b = mo16035b(field, true);
                boolean b2 = mo16035b(field, z);
                if (b || b2) {
                    this.f22792j.mo303b(field);
                    Type p = C4306b.m26899p(aVar2.mo4849e(), cls2, field.getGenericType());
                    List<String> e2 = m27117e(field);
                    int size = e2.size();
                    C4420c cVar = null;
                    int i2 = z;
                    while (i2 < size) {
                        String str = e2.get(i2);
                        boolean z2 = i2 != 0 ? z : b;
                        String str2 = str;
                        int i3 = i2;
                        C4420c cVar2 = cVar;
                        int i4 = size;
                        List<String> list = e2;
                        Field field2 = field;
                        cVar = cVar2 == null ? (C4420c) linkedHashMap.put(str2, m27114a(eVar, field, str2, C1439a.m5627b(p), z2, b2)) : cVar2;
                        i2 = i3 + 1;
                        b = z2;
                        e2 = list;
                        size = i4;
                        field = field2;
                        z = false;
                    }
                    C4420c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(e + " declares multiple JSON fields named " + cVar3.f22802a);
                    }
                }
                i++;
                z = false;
            }
            aVar2 = C1439a.m5627b(C4306b.m26899p(aVar2.mo4849e(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.mo4848c();
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    private List<String> m27117e(Field field) {
        C4267c cVar = (C4267c) field.getAnnotation(C4267c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f22789g.mo15712b(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: b */
    public boolean mo16035b(Field field, boolean z) {
        return m27115c(field, z, this.f22790h);
    }

    public <T> C4233w<T> create(C4203e eVar, C1439a<T> aVar) {
        Class<? super T> c = aVar.mo4848c();
        if (!Object.class.isAssignableFrom(c)) {
            return null;
        }
        return new C4419b(this.f22788f.mo15900a(aVar), m27116d(eVar, aVar, c));
    }
}
