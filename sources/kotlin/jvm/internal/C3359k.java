package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.k */
public final class C3359k implements C3349b {

    /* renamed from: f */
    private final Class<?> f20846f;

    /* renamed from: g */
    private final String f20847g;

    public C3359k(Class<?> cls, String str) {
        C3357i.m24508e(cls, "jClass");
        C3357i.m24508e(str, "moduleName");
        this.f20846f = cls;
        this.f20847g = str;
    }

    /* renamed from: b */
    public Class<?> mo14365b() {
        return this.f20846f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3359k) && C3357i.m24504a(mo14365b(), ((C3359k) obj).mo14365b());
    }

    public int hashCode() {
        return mo14365b().hashCode();
    }

    public String toString() {
        return mo14365b().toString() + " (Kotlin reflection is not available)";
    }
}
