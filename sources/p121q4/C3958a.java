package p121q4;

import kotlin.jvm.internal.C3357i;
import p114p4.C3926a;

/* renamed from: q4.a */
public class C3958a extends C3926a {

    /* renamed from: q4.a$a */
    private static final class C3959a {

        /* renamed from: a */
        public static final C3959a f22122a = new C3959a();

        /* renamed from: b */
        public static final Integer f22123b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                q4.a$a r0 = new q4.a$a
                r0.<init>()
                f22122a = r0
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
                f22123b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p121q4.C3958a.C3959a.<clinit>():void");
        }

        private C3959a() {
        }
    }

    /* renamed from: c */
    private final boolean m26148c(int i) {
        Integer num = C3959a.f22123b;
        return num == null || num.intValue() >= i;
    }

    /* renamed from: a */
    public void mo15381a(Throwable th, Throwable th2) {
        C3357i.m24508e(th, "cause");
        C3357i.m24508e(th2, "exception");
        if (m26148c(19)) {
            th.addSuppressed(th2);
        } else {
            super.mo15381a(th, th2);
        }
    }
}
