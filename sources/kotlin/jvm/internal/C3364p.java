package kotlin.jvm.internal;

import p169y4.C4476c;
import p169y4.C4477d;
import p169y4.C4478e;
import p169y4.C4479f;

/* renamed from: kotlin.jvm.internal.p */
public class C3364p {

    /* renamed from: a */
    private static final C3365q f20849a;

    /* renamed from: b */
    private static final C4476c[] f20850b = new C4476c[0];

    static {
        C3365q qVar = null;
        try {
            qVar = (C3365q) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (qVar == null) {
            qVar = new C3365q();
        }
        f20849a = qVar;
    }

    /* renamed from: a */
    public static C4478e m24521a(C3355g gVar) {
        return f20849a.mo14387a(gVar);
    }

    /* renamed from: b */
    public static C4476c m24522b(Class cls) {
        return f20849a.mo14388b(cls);
    }

    /* renamed from: c */
    public static C4477d m24523c(Class cls) {
        return f20849a.mo14389c(cls, "");
    }

    /* renamed from: d */
    public static C4479f m24524d(C3360l lVar) {
        return f20849a.mo14390d(lVar);
    }

    /* renamed from: e */
    public static String m24525e(C3354f fVar) {
        return f20849a.mo14391e(fVar);
    }

    /* renamed from: f */
    public static String m24526f(C3358j jVar) {
        return f20849a.mo14392f(jVar);
    }
}
