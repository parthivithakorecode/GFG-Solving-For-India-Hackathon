package p161x2;

import java.math.BigDecimal;

/* renamed from: x2.g */
public final class C4329g extends Number {

    /* renamed from: f */
    private final String f22661f;

    public C4329g(String str) {
        this.f22661f = str;
    }

    public double doubleValue() {
        return Double.parseDouble(this.f22661f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4329g)) {
            return false;
        }
        String str = this.f22661f;
        String str2 = ((C4329g) obj).f22661f;
        return str == str2 || str.equals(str2);
    }

    public float floatValue() {
        return Float.parseFloat(this.f22661f);
    }

    public int hashCode() {
        return this.f22661f.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f22661f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f22661f).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f22661f     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f22661f     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r0 = (int) r0
            return r0
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f22661f
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p161x2.C4329g.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f22661f);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f22661f).longValue();
        }
    }

    public String toString() {
        return this.f22661f;
    }
}
