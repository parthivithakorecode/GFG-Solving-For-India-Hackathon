package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.q */
public class C1115q {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f3001a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends C1093f>>> f3002b = new HashMap();

    /* renamed from: a */
    private static C1093f m4597a(Constructor<? extends C1093f> constructor, Object obj) {
        try {
            return (C1093f) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static Constructor<? extends C1093f> m4598b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c = m4599c(canonicalName);
            if (!name.isEmpty()) {
                c = name + "." + c;
            }
            Constructor<?> declaredConstructor = Class.forName(c).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m4599c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private static int m4600d(Class<?> cls) {
        Integer num = f3001a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = m4603g(cls);
        f3001a.put(cls, Integer.valueOf(g));
        return g;
    }

    /* renamed from: e */
    private static boolean m4601e(Class<?> cls) {
        return cls != null && C1109l.class.isAssignableFrom(cls);
    }

    /* renamed from: f */
    static C1107k m4602f(Object obj) {
        boolean z = obj instanceof C1107k;
        boolean z2 = obj instanceof C1082e;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((C1082e) obj, (C1107k) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((C1082e) obj, (C1107k) null);
        }
        if (z) {
            return (C1107k) obj;
        }
        Class<?> cls = obj.getClass();
        if (m4600d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f3002b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m4597a((Constructor) list.get(0), obj));
        }
        C1093f[] fVarArr = new C1093f[list.size()];
        for (int i = 0; i < list.size(); i++) {
            fVarArr[i] = m4597a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(fVarArr);
    }

    /* renamed from: g */
    private static int m4603g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C1093f> b = m4598b(cls);
        if (b != null) {
            f3002b.put(cls, Collections.singletonList(b));
            return 2;
        } else if (C1070a.f2946c.mo3798d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m4601e(superclass)) {
                if (m4600d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f3002b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m4601e(cls2)) {
                    if (m4600d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f3002b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f3002b.put(cls, arrayList);
            return 2;
        }
    }
}
