package androidx.lifecycle;

import androidx.lifecycle.C1099i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.a */
final class C1070a {

    /* renamed from: c */
    static C1070a f2946c = new C1070a();

    /* renamed from: a */
    private final Map<Class<?>, C1071a> f2947a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f2948b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.a$a */
    static class C1071a {

        /* renamed from: a */
        final Map<C1099i.C1101b, List<C1072b>> f2949a = new HashMap();

        /* renamed from: b */
        final Map<C1072b, C1099i.C1101b> f2950b;

        C1071a(Map<C1072b, C1099i.C1101b> map) {
            this.f2950b = map;
            for (Map.Entry next : map.entrySet()) {
                C1099i.C1101b bVar = (C1099i.C1101b) next.getValue();
                List list = this.f2949a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2949a.put(bVar, list);
                }
                list.add((C1072b) next.getKey());
            }
        }

        /* renamed from: b */
        private static void m4521b(List<C1072b> list, C1110m mVar, C1099i.C1101b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).mo3800a(mVar, bVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3799a(C1110m mVar, C1099i.C1101b bVar, Object obj) {
            m4521b(this.f2949a.get(bVar), mVar, bVar, obj);
            m4521b(this.f2949a.get(C1099i.C1101b.ON_ANY), mVar, bVar, obj);
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.a$b */
    static final class C1072b {

        /* renamed from: a */
        final int f2951a;

        /* renamed from: b */
        final Method f2952b;

        C1072b(int i, Method method) {
            this.f2951a = i;
            this.f2952b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3800a(C1110m mVar, C1099i.C1101b bVar, Object obj) {
            try {
                int i = this.f2951a;
                if (i == 0) {
                    this.f2952b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f2952b.invoke(obj, new Object[]{mVar});
                } else if (i == 2) {
                    this.f2952b.invoke(obj, new Object[]{mVar, bVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1072b)) {
                return false;
            }
            C1072b bVar = (C1072b) obj;
            return this.f2951a == bVar.f2951a && this.f2952b.getName().equals(bVar.f2952b.getName());
        }

        public int hashCode() {
            return (this.f2951a * 31) + this.f2952b.getName().hashCode();
        }
    }

    C1070a() {
    }

    /* renamed from: a */
    private C1071a m4516a(Class<?> cls, Method[] methodArr) {
        int i;
        C1071a c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c = mo3797c(superclass)) == null)) {
            hashMap.putAll(c.f2950b);
        }
        for (Class c2 : cls.getInterfaces()) {
            for (Map.Entry next : mo3797c(c2).f2950b.entrySet()) {
                m4518e(hashMap, (C1072b) next.getKey(), (C1099i.C1101b) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m4517b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C1119u uVar = (C1119u) method.getAnnotation(C1119u.class);
            if (uVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C1110m.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C1099i.C1101b value = uVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C1099i.C1101b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C1099i.C1101b.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m4518e(hashMap, new C1072b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C1071a aVar = new C1071a(hashMap);
        this.f2947a.put(cls, aVar);
        this.f2948b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m4517b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: e */
    private void m4518e(Map<C1072b, C1099i.C1101b> map, C1072b bVar, C1099i.C1101b bVar2, Class<?> cls) {
        C1099i.C1101b bVar3 = map.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f2952b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
        } else if (bVar3 == null) {
            map.put(bVar, bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1071a mo3797c(Class<?> cls) {
        C1071a aVar = this.f2947a.get(cls);
        return aVar != null ? aVar : m4516a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo3798d(Class<?> cls) {
        Boolean bool = this.f2948b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b = m4517b(cls);
        for (Method annotation : b) {
            if (((C1119u) annotation.getAnnotation(C1119u.class)) != null) {
                m4516a(cls, b);
                return true;
            }
        }
        this.f2948b.put(cls, Boolean.FALSE);
        return false;
    }
}
