package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C3357i;

/* renamed from: kotlin.coroutines.jvm.internal.i */
final class C3343i {

    /* renamed from: a */
    public static final C3343i f20831a = new C3343i();

    /* renamed from: b */
    private static final C3344a f20832b = new C3344a((Method) null, (Method) null, (Method) null);

    /* renamed from: c */
    private static C3344a f20833c;

    /* renamed from: kotlin.coroutines.jvm.internal.i$a */
    private static final class C3344a {

        /* renamed from: a */
        public final Method f20834a;

        /* renamed from: b */
        public final Method f20835b;

        /* renamed from: c */
        public final Method f20836c;

        public C3344a(Method method, Method method2, Method method3) {
            this.f20834a = method;
            this.f20835b = method2;
            this.f20836c = method3;
        }
    }

    private C3343i() {
    }

    /* renamed from: a */
    private final C3344a m24494a(C3335a aVar) {
        try {
            C3344a aVar2 = new C3344a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f20833c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            C3344a aVar3 = f20832b;
            f20833c = aVar3;
            return aVar3;
        }
    }

    /* renamed from: b */
    public final String mo14345b(C3335a aVar) {
        C3357i.m24508e(aVar, "continuation");
        C3344a aVar2 = f20833c;
        if (aVar2 == null) {
            aVar2 = m24494a(aVar);
        }
        if (aVar2 == f20832b) {
            return null;
        }
        Method method = aVar2.f20834a;
        Object invoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f20835b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f20836c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
