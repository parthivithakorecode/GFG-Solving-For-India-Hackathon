package p127r4;

import p121q4.C3958a;
import p151v4.C4241c;
import p157w4.C4272a;

/* renamed from: r4.a */
public class C3992a extends C3958a {

    /* renamed from: r4.a$a */
    private static final class C3993a {

        /* renamed from: a */
        public static final C3993a f22160a = new C3993a();

        /* renamed from: b */
        public static final Integer f22161b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                r4.a$a r0 = new r4.a$a
                r0.<init>()
                f22160a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x001f }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x001f }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001f }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x001f }
                if (r2 == 0) goto L_0x001f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
                goto L_0x0020
            L_0x001f:
                r1 = r0
            L_0x0020:
                if (r1 == 0) goto L_0x002e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x002a
                r2 = 1
                goto L_0x002b
            L_0x002a:
                r2 = 0
            L_0x002b:
                if (r2 == 0) goto L_0x002e
                r0 = r1
            L_0x002e:
                f22161b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p127r4.C3992a.C3993a.<clinit>():void");
        }

        private C3993a() {
        }
    }

    /* renamed from: c */
    private final boolean m26219c(int i) {
        Integer num = C3993a.f22161b;
        return num == null || num.intValue() >= i;
    }

    /* renamed from: b */
    public C4241c mo15382b() {
        return m26219c(34) ? new C4272a() : super.mo15382b();
    }
}
