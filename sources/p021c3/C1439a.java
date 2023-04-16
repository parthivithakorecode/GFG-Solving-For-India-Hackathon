package p021c3;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p161x2.C4305a;
import p161x2.C4306b;

/* renamed from: c3.a */
public class C1439a<T> {

    /* renamed from: a */
    final Class<? super T> f3653a;

    /* renamed from: b */
    final Type f3654b;

    /* renamed from: c */
    final int f3655c;

    protected C1439a() {
        Type d = m5628d(getClass());
        this.f3654b = d;
        this.f3653a = C4306b.m26894k(d);
        this.f3655c = d.hashCode();
    }

    C1439a(Type type) {
        Type b = C4306b.m26885b((Type) C4305a.m26883b(type));
        this.f3654b = b;
        this.f3653a = C4306b.m26894k(b);
        this.f3655c = b.hashCode();
    }

    /* renamed from: a */
    public static <T> C1439a<T> m5626a(Class<T> cls) {
        return new C1439a<>(cls);
    }

    /* renamed from: b */
    public static C1439a<?> m5627b(Type type) {
        return new C1439a<>(type);
    }

    /* renamed from: d */
    static Type m5628d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C4306b.m26885b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: c */
    public final Class<? super T> mo4848c() {
        return this.f3653a;
    }

    /* renamed from: e */
    public final Type mo4849e() {
        return this.f3654b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1439a) && C4306b.m26889f(this.f3654b, ((C1439a) obj).f3654b);
    }

    public final int hashCode() {
        return this.f3655c;
    }

    public final String toString() {
        return C4306b.m26904u(this.f3654b);
    }
}
