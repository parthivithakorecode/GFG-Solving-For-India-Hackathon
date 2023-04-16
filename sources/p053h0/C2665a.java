package p053h0;

/* renamed from: h0.a */
public final class C2665a implements C2673e {

    /* renamed from: f */
    private final String f19093f;

    /* renamed from: g */
    private final Object[] f19094g;

    public C2665a(String str) {
        this(str, (Object[]) null);
    }

    public C2665a(String str, Object[] objArr) {
        this.f19093f = str;
        this.f19094g = objArr;
    }

    /* renamed from: a */
    private static void m21461a(C2672d dVar, int i, Object obj) {
        long j;
        int byteValue;
        double doubleValue;
        if (obj == null) {
            dVar.mo12299p(i);
        } else if (obj instanceof byte[]) {
            dVar.mo12293D(i, (byte[]) obj);
        } else {
            if (obj instanceof Float) {
                doubleValue = (double) ((Float) obj).floatValue();
            } else if (obj instanceof Double) {
                doubleValue = ((Double) obj).doubleValue();
            } else {
                if (obj instanceof Long) {
                    j = ((Long) obj).longValue();
                } else {
                    if (obj instanceof Integer) {
                        byteValue = ((Integer) obj).intValue();
                    } else if (obj instanceof Short) {
                        byteValue = ((Short) obj).shortValue();
                    } else if (obj instanceof Byte) {
                        byteValue = ((Byte) obj).byteValue();
                    } else if (obj instanceof String) {
                        dVar.mo12297j(i, (String) obj);
                        return;
                    } else if (obj instanceof Boolean) {
                        j = ((Boolean) obj).booleanValue() ? 1 : 0;
                    } else {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                    }
                    j = (long) byteValue;
                }
                dVar.mo12302x(i, j);
                return;
            }
            dVar.mo12300q(i, doubleValue);
        }
    }

    /* renamed from: b */
    public static void m21462b(C2672d dVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                m21461a(dVar, i, obj);
            }
        }
    }

    /* renamed from: d */
    public String mo12295d() {
        return this.f19093f;
    }

    /* renamed from: h */
    public void mo12296h(C2672d dVar) {
        m21462b(dVar, this.f19094g);
    }
}
