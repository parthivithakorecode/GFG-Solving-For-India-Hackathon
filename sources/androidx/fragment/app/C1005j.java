package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p102o.C3814g;

/* renamed from: androidx.fragment.app.j */
public class C1005j {

    /* renamed from: a */
    private static final C3814g<ClassLoader, C3814g<String, Class<?>>> f2697a = new C3814g<>();

    /* renamed from: b */
    static boolean m4163b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m4164c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m4164c(ClassLoader classLoader, String str) {
        C3814g<ClassLoader, C3814g<String, Class<?>>> gVar = f2697a;
        C3814g gVar2 = gVar.get(classLoader);
        if (gVar2 == null) {
            gVar2 = new C3814g();
            gVar.put(classLoader, gVar2);
        }
        Class<?> cls = (Class) gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar2.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m4165d(ClassLoader classLoader, String str) {
        try {
            return m4164c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.C0951f("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new Fragment.C0951f("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo3528a(ClassLoader classLoader, String str) {
        throw null;
    }
}
