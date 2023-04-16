package p149v2;

import java.math.BigDecimal;
import p028d3.C2488a;
import p161x2.C4329g;

/* renamed from: v2.u */
public enum C4227u implements C4232v {
    DOUBLE {
        /* renamed from: d */
        public Double mo15776b(C2488a aVar) {
            return Double.valueOf(aVar.mo12348I());
        }
    },
    LAZILY_PARSED_NUMBER {
        /* renamed from: b */
        public Number mo15776b(C2488a aVar) {
            return new C4329g(aVar.mo12353T());
        }
    },
    LONG_OR_DOUBLE {
        /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|(2:12|13)(1:11)) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
            return r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
            throw new p028d3.C2492d("JSON forbids NaN and infinities: " + r2 + "; at path " + r7.mo12360r());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
            throw new p149v2.C4219o("Cannot parse " + r1 + "; at path " + r7.mo12360r(), r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r2 = java.lang.Double.valueOf(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r2.isInfinite() != false) goto L_0x001f;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000f */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Number mo15776b(p028d3.C2488a r7) {
            /*
                r6 = this;
                java.lang.String r0 = "; at path "
                java.lang.String r1 = r7.mo12353T()
                long r2 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x000f }
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ NumberFormatException -> 0x000f }
                return r7
            L_0x000f:
                java.lang.Double r2 = java.lang.Double.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0047 }
                boolean r3 = r2.isInfinite()     // Catch:{ NumberFormatException -> 0x0047 }
                if (r3 != 0) goto L_0x001f
                boolean r3 = r2.isNaN()     // Catch:{ NumberFormatException -> 0x0047 }
                if (r3 == 0) goto L_0x0025
            L_0x001f:
                boolean r3 = r7.mo12345C()     // Catch:{ NumberFormatException -> 0x0047 }
                if (r3 == 0) goto L_0x0026
            L_0x0025:
                return r2
            L_0x0026:
                d3.d r3 = new d3.d     // Catch:{ NumberFormatException -> 0x0047 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0047 }
                r4.<init>()     // Catch:{ NumberFormatException -> 0x0047 }
                java.lang.String r5 = "JSON forbids NaN and infinities: "
                r4.append(r5)     // Catch:{ NumberFormatException -> 0x0047 }
                r4.append(r2)     // Catch:{ NumberFormatException -> 0x0047 }
                r4.append(r0)     // Catch:{ NumberFormatException -> 0x0047 }
                java.lang.String r2 = r7.mo12360r()     // Catch:{ NumberFormatException -> 0x0047 }
                r4.append(r2)     // Catch:{ NumberFormatException -> 0x0047 }
                java.lang.String r2 = r4.toString()     // Catch:{ NumberFormatException -> 0x0047 }
                r3.<init>(r2)     // Catch:{ NumberFormatException -> 0x0047 }
                throw r3     // Catch:{ NumberFormatException -> 0x0047 }
            L_0x0047:
                r2 = move-exception
                v2.o r3 = new v2.o
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Cannot parse "
                r4.append(r5)
                r4.append(r1)
                r4.append(r0)
                java.lang.String r7 = r7.mo12360r()
                r4.append(r7)
                java.lang.String r7 = r4.toString()
                r3.<init>(r7, r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p149v2.C4227u.C4230c.mo15776b(d3.a):java.lang.Number");
        }
    },
    BIG_DECIMAL {
        /* renamed from: d */
        public BigDecimal mo15776b(C2488a aVar) {
            String T = aVar.mo12353T();
            try {
                return new BigDecimal(T);
            } catch (NumberFormatException e) {
                throw new C4219o("Cannot parse " + T + "; at path " + aVar.mo12360r(), e);
            }
        }
    };
}
