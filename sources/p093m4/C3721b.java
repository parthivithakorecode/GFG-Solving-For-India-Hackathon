package p093m4;

/* renamed from: m4.b */
class C3721b {
    /* renamed from: a */
    public static <T extends Comparable<?>> int m25417a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}
