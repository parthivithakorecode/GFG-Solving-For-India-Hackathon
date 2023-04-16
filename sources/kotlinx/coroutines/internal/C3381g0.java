package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.g0 */
final /* synthetic */ class C3381g0 {

    /* renamed from: a */
    private static final int f20866a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m24582a() {
        return f20866a;
    }

    /* renamed from: b */
    public static final String m24583b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
