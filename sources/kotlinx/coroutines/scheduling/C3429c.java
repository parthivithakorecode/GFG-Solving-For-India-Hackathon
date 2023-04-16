package kotlinx.coroutines.scheduling;

/* renamed from: kotlinx.coroutines.scheduling.c */
public final class C3429c extends C3432f {

    /* renamed from: m */
    public static final C3429c f20958m = new C3429c();

    private C3429c() {
        super(C3438l.f20970b, C3438l.f20971c, C3438l.f20972d, "DefaultDispatcher");
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
