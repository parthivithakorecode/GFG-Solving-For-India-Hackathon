package p084l2;

/* renamed from: l2.u1 */
public final class C3553u1<T> implements C3545s1<T> {

    /* renamed from: b */
    private static final C3553u1<Object> f21227b = new C3553u1<>((Object) null);

    /* renamed from: a */
    private final T f21228a;

    private C3553u1(T t) {
        this.f21228a = t;
    }

    /* renamed from: a */
    public static <T> C3545s1<T> m24957a(T t) {
        return new C3553u1(C3559w1.m24966b(t, "instance cannot be null"));
    }

    public final T zza() {
        return this.f21228a;
    }
}
