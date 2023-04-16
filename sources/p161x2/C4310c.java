package p161x2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p004a3.C0118b;
import p021c3.C1439a;
import p149v2.C4211g;
import p149v2.C4216l;

/* renamed from: x2.c */
public final class C4310c {

    /* renamed from: a */
    private final Map<Type, C4211g<?>> f22621a;

    /* renamed from: b */
    private final C0118b f22622b = C0118b.m364a();

    /* renamed from: x2.c$a */
    class C4311a implements C4338i<T> {
        C4311a() {
        }

        /* renamed from: a */
        public T mo15902a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: x2.c$b */
    class C4312b implements C4338i<T> {
        C4312b() {
        }

        /* renamed from: a */
        public T mo15902a() {
            return new TreeMap();
        }
    }

    /* renamed from: x2.c$c */
    class C4313c implements C4338i<T> {
        C4313c() {
        }

        /* renamed from: a */
        public T mo15902a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: x2.c$d */
    class C4314d implements C4338i<T> {
        C4314d() {
        }

        /* renamed from: a */
        public T mo15902a() {
            return new C4330h();
        }
    }

    /* renamed from: x2.c$e */
    class C4315e implements C4338i<T> {

        /* renamed from: a */
        private final C4344m f22627a = C4344m.m26968b();

        /* renamed from: b */
        final /* synthetic */ Class f22628b;

        /* renamed from: c */
        final /* synthetic */ Type f22629c;

        C4315e(Class cls, Type type) {
            this.f22628b = cls;
            this.f22629c = type;
        }

        /* renamed from: a */
        public T mo15902a() {
            try {
                return this.f22627a.mo15960c(this.f22628b);
            } catch (Exception e) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f22629c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
            }
        }
    }

    /* renamed from: x2.c$f */
    class C4316f implements C4338i<T> {

        /* renamed from: a */
        final /* synthetic */ C4211g f22631a;

        /* renamed from: b */
        final /* synthetic */ Type f22632b;

        C4316f(C4211g gVar, Type type) {
            this.f22631a = gVar;
            this.f22632b = type;
        }

        /* renamed from: a */
        public T mo15902a() {
            return this.f22631a.mo15742a(this.f22632b);
        }
    }

    /* renamed from: x2.c$g */
    class C4317g implements C4338i<T> {

        /* renamed from: a */
        final /* synthetic */ C4211g f22634a;

        /* renamed from: b */
        final /* synthetic */ Type f22635b;

        C4317g(C4211g gVar, Type type) {
            this.f22634a = gVar;
            this.f22635b = type;
        }

        /* renamed from: a */
        public T mo15902a() {
            return this.f22634a.mo15742a(this.f22635b);
        }
    }

    /* renamed from: x2.c$h */
    class C4318h implements C4338i<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f22637a;

        C4318h(Constructor constructor) {
            this.f22637a = constructor;
        }

        /* renamed from: a */
        public T mo15902a() {
            try {
                return this.f22637a.newInstance((Object[]) null);
            } catch (InstantiationException e) {
                throw new RuntimeException("Failed to invoke " + this.f22637a + " with no args", e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to invoke " + this.f22637a + " with no args", e2.getTargetException());
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    /* renamed from: x2.c$i */
    class C4319i implements C4338i<T> {
        C4319i() {
        }

        /* renamed from: a */
        public T mo15902a() {
            return new TreeSet();
        }
    }

    /* renamed from: x2.c$j */
    class C4320j implements C4338i<T> {

        /* renamed from: a */
        final /* synthetic */ Type f22640a;

        C4320j(Type type) {
            this.f22640a = type;
        }

        /* renamed from: a */
        public T mo15902a() {
            Type type = this.f22640a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new C4216l("Invalid EnumSet type: " + this.f22640a.toString());
            }
            throw new C4216l("Invalid EnumSet type: " + this.f22640a.toString());
        }
    }

    /* renamed from: x2.c$k */
    class C4321k implements C4338i<T> {
        C4321k() {
        }

        /* renamed from: a */
        public T mo15902a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: x2.c$l */
    class C4322l implements C4338i<T> {
        C4322l() {
        }

        /* renamed from: a */
        public T mo15902a() {
            return new ArrayDeque();
        }
    }

    /* renamed from: x2.c$m */
    class C4323m implements C4338i<T> {
        C4323m() {
        }

        /* renamed from: a */
        public T mo15902a() {
            return new ArrayList();
        }
    }

    /* renamed from: x2.c$n */
    class C4324n implements C4338i<T> {
        C4324n() {
        }

        /* renamed from: a */
        public T mo15902a() {
            return new ConcurrentSkipListMap();
        }
    }

    public C4310c(Map<Type, C4211g<?>> map) {
        this.f22621a = map;
    }

    /* renamed from: b */
    private <T> C4338i<T> m26905b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f22622b.mo303b(declaredConstructor);
            }
            return new C4318h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private <T> C4338i<T> m26906c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new C4319i() : EnumSet.class.isAssignableFrom(cls) ? new C4320j(type) : Set.class.isAssignableFrom(cls) ? new C4321k() : Queue.class.isAssignableFrom(cls) ? new C4322l() : new C4323m();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new C4324n() : ConcurrentMap.class.isAssignableFrom(cls) ? new C4311a() : SortedMap.class.isAssignableFrom(cls) ? new C4312b() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C1439a.m5627b(((ParameterizedType) type).getActualTypeArguments()[0]).mo4848c())) ? new C4314d() : new C4313c();
        }
        return null;
    }

    /* renamed from: d */
    private <T> C4338i<T> m26907d(Type type, Class<? super T> cls) {
        return new C4315e(cls, type);
    }

    /* renamed from: a */
    public <T> C4338i<T> mo15900a(C1439a<T> aVar) {
        Type e = aVar.mo4849e();
        Class<? super T> c = aVar.mo4848c();
        C4211g gVar = this.f22621a.get(e);
        if (gVar != null) {
            return new C4316f(gVar, e);
        }
        C4211g gVar2 = this.f22621a.get(c);
        if (gVar2 != null) {
            return new C4317g(gVar2, e);
        }
        C4338i<T> b = m26905b(c);
        if (b != null) {
            return b;
        }
        C4338i<T> c2 = m26906c(e, c);
        return c2 != null ? c2 : m26907d(e, c);
    }

    public String toString() {
        return this.f22621a.toString();
    }
}
