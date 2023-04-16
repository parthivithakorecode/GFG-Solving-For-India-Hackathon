package p161x2;

/* renamed from: x2.e */
public final class C4327e {

    /* renamed from: a */
    private static final int f22659a = m26937a();

    /* renamed from: a */
    private static int m26937a() {
        return m26940d(System.getProperty("java.version"));
    }

    /* renamed from: b */
    private static int m26938b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static int m26939c() {
        return f22659a;
    }

    /* renamed from: d */
    static int m26940d(String str) {
        int f = m26942f(str);
        if (f == -1) {
            f = m26938b(str);
        }
        if (f == -1) {
            return 6;
        }
        return f;
    }

    /* renamed from: e */
    public static boolean m26941e() {
        return f22659a >= 9;
    }

    /* renamed from: f */
    private static int m26942f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
