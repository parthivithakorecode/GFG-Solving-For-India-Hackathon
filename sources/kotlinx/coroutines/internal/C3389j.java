package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import kotlin.jvm.internal.C3357i;
import kotlin.jvm.internal.C3358j;
import p016b5.C1319b0;
import p079k4.C3322k;
import p079k4.C3325l;
import p139t4.C4080a;
import p145u4.C4150l;

/* renamed from: kotlinx.coroutines.internal.j */
public final class C3389j {

    /* renamed from: a */
    private static final int f20881a = m24613f(Throwable.class, -1);

    /* renamed from: b */
    private static final C3380g f20882b;

    /* renamed from: kotlinx.coroutines.internal.j$a */
    public static final class C3390a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C3721b.m25417a(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
        }
    }

    /* renamed from: kotlinx.coroutines.internal.j$b */
    static final class C3391b extends C3358j implements C4150l {

        /* renamed from: f */
        public static final C3391b f20883f = new C3391b();

        C3391b() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.j$c */
    public static final class C3392c extends C3358j implements C4150l<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f20884f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3392c(Constructor constructor) {
            super(1);
            this.f20884f = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C3322k.C3323a aVar = C3322k.f20823f;
                Object newInstance = this.f20884f.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    obj = C3322k.m24446a((Throwable) newInstance);
                    if (C3322k.m24448c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C3322k.C3323a aVar2 = C3322k.f20823f;
                obj = C3322k.m24446a(C3325l.m24450a(th2));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.j$d */
    public static final class C3393d extends C3358j implements C4150l<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f20885f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3393d(Constructor constructor) {
            super(1);
            this.f20885f = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C3322k.C3323a aVar = C3322k.f20823f;
                Object newInstance = this.f20885f.newInstance(new Object[]{th});
                if (newInstance != null) {
                    obj = C3322k.m24446a((Throwable) newInstance);
                    if (C3322k.m24448c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C3322k.C3323a aVar2 = C3322k.f20823f;
                obj = C3322k.m24446a(C3325l.m24450a(th2));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.j$e */
    public static final class C3394e extends C3358j implements C4150l<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f20886f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3394e(Constructor constructor) {
            super(1);
            this.f20886f = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C3322k.C3323a aVar = C3322k.f20823f;
                Object newInstance = this.f20886f.newInstance(new Object[]{th.getMessage()});
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = C3322k.m24446a(th2);
                    if (C3322k.m24448c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                C3322k.C3323a aVar2 = C3322k.f20823f;
                obj = C3322k.m24446a(C3325l.m24450a(th3));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.j$f */
    public static final class C3395f extends C3358j implements C4150l<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f20887f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3395f(Constructor constructor) {
            super(1);
            this.f20887f = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C3322k.C3323a aVar = C3322k.f20823f;
                Object newInstance = this.f20887f.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = C3322k.m24446a(th2);
                    if (C3322k.m24448c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                C3322k.C3323a aVar2 = C3322k.f20823f;
                obj = C3322k.m24446a(C3325l.m24450a(th3));
            }
        }
    }

    static {
        C3380g gVar;
        try {
            gVar = C3399l.m24643a() ? C3404n0.f20900a : C3373d.f20859a;
        } catch (Throwable unused) {
            gVar = C3404n0.f20900a;
        }
        f20882b = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final <E extends Throwable> C4150l<Throwable, Throwable> m24609b(Class<E> cls) {
        C3391b bVar = C3391b.f20883f;
        if (f20881a != m24613f(cls, 0)) {
            return bVar;
        }
        for (Constructor c : C3579e.m25001m(cls.getConstructors(), new C3390a())) {
            C4150l<Throwable, Throwable> c2 = m24610c(c);
            if (c2 != null) {
                return c2;
            }
        }
        return bVar;
    }

    /* renamed from: c */
    private static final C4150l<Throwable, Throwable> m24610c(Constructor<?> constructor) {
        Class<String> cls = String.class;
        Class[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new C3395f(constructor);
        }
        if (length == 1) {
            Class cls2 = parameterTypes[0];
            if (C3357i.m24504a(cls2, Throwable.class)) {
                return new C3393d(constructor);
            }
            if (C3357i.m24504a(cls2, cls)) {
                return new C3394e(constructor);
            }
            return null;
        } else if (length == 2 && C3357i.m24504a(parameterTypes[0], cls) && C3357i.m24504a(parameterTypes[1], Throwable.class)) {
            return new C3392c(constructor);
        } else {
            return null;
        }
    }

    /* renamed from: d */
    private static final int m24611d(Class<?> cls, int i) {
        Class<? super Object> superclass;
        do {
            Field[] declaredFields = r5.getDeclaredFields();
            int length = declaredFields.length;
            int i2 = 0;
            int i3 = 0;
            Class<? super Object> cls2 = cls;
            while (i2 < length) {
                Field field = declaredFields[i2];
                i2++;
                if (!Modifier.isStatic(field.getModifiers())) {
                    i3++;
                }
            }
            i += i3;
            superclass = cls2.getSuperclass();
            cls2 = superclass;
        } while (superclass != null);
        return i;
    }

    /* renamed from: e */
    static /* synthetic */ int m24612e(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m24611d(cls, i);
    }

    /* renamed from: f */
    private static final int m24613f(Class<?> cls, int i) {
        Integer num;
        C4080a.m26443c(cls);
        try {
            C3322k.C3323a aVar = C3322k.f20823f;
            num = C3322k.m24446a(Integer.valueOf(m24612e(cls, 0, 1, (Object) null)));
        } catch (Throwable th) {
            C3322k.C3323a aVar2 = C3322k.f20823f;
            num = C3322k.m24446a(C3325l.m24450a(th));
        }
        Integer valueOf = Integer.valueOf(i);
        if (C3322k.m24448c(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    /* renamed from: g */
    public static final <E extends Throwable> E m24614g(E e) {
        E e2;
        if (!(e instanceof C1319b0)) {
            return (Throwable) f20882b.mo14409a(e.getClass()).invoke(e);
        }
        try {
            C3322k.C3323a aVar = C3322k.f20823f;
            e2 = C3322k.m24446a(((C1319b0) e).mo4659a());
        } catch (Throwable th) {
            C3322k.C3323a aVar2 = C3322k.f20823f;
            e2 = C3322k.m24446a(C3325l.m24450a(th));
        }
        if (C3322k.m24448c(e2)) {
            e2 = null;
        }
        return (Throwable) e2;
    }
}
