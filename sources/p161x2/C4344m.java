package p161x2;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: x2.m */
public abstract class C4344m {

    /* renamed from: x2.m$a */
    class C4345a extends C4344m {

        /* renamed from: a */
        final /* synthetic */ Method f22689a;

        /* renamed from: b */
        final /* synthetic */ Object f22690b;

        C4345a(Method method, Object obj) {
            this.f22689a = method;
            this.f22690b = obj;
        }

        /* renamed from: c */
        public <T> T mo15960c(Class<T> cls) {
            C4344m.m26967a(cls);
            return this.f22689a.invoke(this.f22690b, new Object[]{cls});
        }
    }

    /* renamed from: x2.m$b */
    class C4346b extends C4344m {

        /* renamed from: a */
        final /* synthetic */ Method f22691a;

        /* renamed from: b */
        final /* synthetic */ int f22692b;

        C4346b(Method method, int i) {
            this.f22691a = method;
            this.f22692b = i;
        }

        /* renamed from: c */
        public <T> T mo15960c(Class<T> cls) {
            C4344m.m26967a(cls);
            return this.f22691a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f22692b)});
        }
    }

    /* renamed from: x2.m$c */
    class C4347c extends C4344m {

        /* renamed from: a */
        final /* synthetic */ Method f22693a;

        C4347c(Method method) {
            this.f22693a = method;
        }

        /* renamed from: c */
        public <T> T mo15960c(Class<T> cls) {
            C4344m.m26967a(cls);
            return this.f22693a.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    /* renamed from: x2.m$d */
    class C4348d extends C4344m {
        C4348d() {
        }

        /* renamed from: c */
        public <T> T mo15960c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    /* renamed from: a */
    static void m26967a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    /* renamed from: b */
    public static C4344m m26968b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C4345a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C4346b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new C4347c(declaredMethod3);
                } catch (Exception unused3) {
                    return new C4348d();
                }
            }
        }
    }

    /* renamed from: c */
    public abstract <T> T mo15960c(Class<T> cls);
}
