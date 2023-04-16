package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import sun.misc.Unsafe;

final class gt3 {

    /* renamed from: a */
    private static final Unsafe f7598a;

    /* renamed from: b */
    private static final Class<?> f7599b = do3.m7940a();

    /* renamed from: c */
    private static final boolean f7600c;

    /* renamed from: d */
    private static final boolean f7601d;

    /* renamed from: e */
    private static final ft3 f7602e;

    /* renamed from: f */
    private static final boolean f7603f;

    /* renamed from: g */
    private static final boolean f7604g;

    /* renamed from: h */
    static final long f7605h = ((long) m9978c(byte[].class));

    /* renamed from: i */
    private static final long f7606i;

    /* renamed from: j */
    static final boolean f7607j;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0141  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m9992q()
            f7598a = r7
            java.lang.Class r8 = com.google.android.gms.internal.ads.do3.m7940a()
            f7599b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m9974G(r8)
            f7600c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m9974G(r10)
            f7601d = r10
            r11 = 0
            if (r7 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            if (r9 == 0) goto L_0x0036
            com.google.android.gms.internal.ads.et3 r11 = new com.google.android.gms.internal.ads.et3
            r11.<init>(r7)
            goto L_0x003d
        L_0x0036:
            if (r10 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.dt3 r11 = new com.google.android.gms.internal.ads.dt3
            r11.<init>(r7)
        L_0x003d:
            f7602e = r11
            java.lang.String r7 = "getLong"
            java.lang.String r9 = "objectFieldOffset"
            r10 = 2
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L_0x004a
        L_0x0048:
            r8 = r13
            goto L_0x0073
        L_0x004a:
            sun.misc.Unsafe r11 = r11.f6931a
            if (r11 != 0) goto L_0x004f
            goto L_0x0048
        L_0x004f:
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x006e }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x006e }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x006e }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x006e }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x006e }
            r14[r13] = r6     // Catch:{ all -> 0x006e }
            r14[r12] = r8     // Catch:{ all -> 0x006e }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x006e }
            java.lang.reflect.Field r8 = m9980e()     // Catch:{ all -> 0x006e }
            if (r8 != 0) goto L_0x006c
            goto L_0x0048
        L_0x006c:
            r8 = r12
            goto L_0x0073
        L_0x006e:
            r8 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.gt3.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r8.toString()))
            goto L_0x0048
        L_0x0073:
            f7603f = r8
            com.google.android.gms.internal.ads.ft3 r8 = f7602e
            if (r8 != 0) goto L_0x007c
        L_0x0079:
            r6 = r13
            goto L_0x00f6
        L_0x007c:
            sun.misc.Unsafe r8 = r8.f6931a
            if (r8 != 0) goto L_0x0081
            goto L_0x0079
        L_0x0081:
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r11[r13] = r14     // Catch:{ all -> 0x00f1 }
            r8.getMethod(r9, r11)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = "arrayBaseOffset"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00f1 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = "arrayIndexScale"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r9[r13] = r6     // Catch:{ all -> 0x00f1 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00f1 }
            r9[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00f1 }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r14[r13] = r6     // Catch:{ all -> 0x00f1 }
            r14[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00f1 }
            r14[r10] = r15     // Catch:{ all -> 0x00f1 }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r14[r13] = r6     // Catch:{ all -> 0x00f1 }
            r14[r12] = r11     // Catch:{ all -> 0x00f1 }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            r7[r10] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00f1 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f1 }
            r7[r13] = r6     // Catch:{ all -> 0x00f1 }
            r7[r12] = r11     // Catch:{ all -> 0x00f1 }
            r7[r10] = r6     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00f1 }
            r6 = r12
            goto L_0x00f6
        L_0x00f1:
            r6 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.gt3.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r6.toString()))
            goto L_0x0079
        L_0x00f6:
            f7604g = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m9978c(r6)
            long r6 = (long) r6
            f7605h = r6
            m9978c(r5)
            m9979d(r5)
            m9978c(r4)
            m9979d(r4)
            m9978c(r3)
            m9979d(r3)
            m9978c(r2)
            m9979d(r2)
            m9978c(r1)
            m9979d(r1)
            m9978c(r0)
            m9979d(r0)
            java.lang.reflect.Field r0 = m9980e()
            r1 = -1
            if (r0 == 0) goto L_0x0136
            com.google.android.gms.internal.ads.ft3 r3 = f7602e
            if (r3 != 0) goto L_0x0132
            goto L_0x0136
        L_0x0132:
            long r1 = r3.mo7398n(r0)
        L_0x0136:
            f7606i = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0141
            goto L_0x0142
        L_0x0141:
            r12 = r13
        L_0x0142:
            f7607j = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gt3.<clinit>():void");
    }

    private gt3() {
    }

    /* renamed from: A */
    static void m9968A(Object obj, long j, float f) {
        f7602e.mo6658h(obj, j, f);
    }

    /* renamed from: B */
    static void m9969B(Object obj, long j, int i) {
        f7602e.mo7400p(obj, j, i);
    }

    /* renamed from: C */
    static void m9970C(Object obj, long j, long j2) {
        f7602e.mo7401q(obj, j, j2);
    }

    /* renamed from: D */
    static void m9971D(Object obj, long j, Object obj2) {
        f7602e.mo7402r(obj, j, obj2);
    }

    /* renamed from: E */
    static /* bridge */ /* synthetic */ boolean m9972E(Object obj, long j) {
        return ((byte) ((f7602e.mo7396l(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: F */
    static /* bridge */ /* synthetic */ boolean m9973F(Object obj, long j) {
        return ((byte) ((f7602e.mo7396l(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: G */
    static boolean m9974G(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = do3.f5856a;
        try {
            Class<?> cls3 = f7599b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: H */
    static boolean m9975H(Object obj, long j) {
        return f7602e.mo6659i(obj, j);
    }

    /* renamed from: a */
    static boolean m9976a() {
        return f7604g;
    }

    /* renamed from: b */
    static boolean m9977b() {
        return f7603f;
    }

    /* renamed from: c */
    private static int m9978c(Class<?> cls) {
        if (f7604g) {
            return f7602e.mo7394j(cls);
        }
        return -1;
    }

    /* renamed from: d */
    private static int m9979d(Class<?> cls) {
        if (f7604g) {
            return f7602e.mo7395k(cls);
        }
        return -1;
    }

    /* renamed from: e */
    private static Field m9980e() {
        int i = do3.f5856a;
        Field f = m9981f(Buffer.class, "effectiveDirectAddress");
        if (f != null) {
            return f;
        }
        Field f2 = m9981f(Buffer.class, "address");
        if (f2 == null || f2.getType() != Long.TYPE) {
            return null;
        }
        return f2;
    }

    /* renamed from: f */
    private static Field m9981f(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m9982g(Object obj, long j, byte b) {
        long j2 = -4 & j;
        ft3 ft3 = f7602e;
        int l = ft3.mo7396l(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        ft3.mo7400p(obj, j2, ((255 & b) << i) | (l & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static void m9983h(Object obj, long j, byte b) {
        long j2 = -4 & j;
        ft3 ft3 = f7602e;
        int i = (((int) j) & 3) << 3;
        ft3.mo7400p(obj, j2, ((255 & b) << i) | (ft3.mo7396l(obj, j2) & (~(255 << i))));
    }

    /* renamed from: i */
    static byte m9984i(long j) {
        return f7602e.mo6651a(j);
    }

    /* renamed from: j */
    static double m9985j(Object obj, long j) {
        return f7602e.mo6652b(obj, j);
    }

    /* renamed from: k */
    static float m9986k(Object obj, long j) {
        return f7602e.mo6653c(obj, j);
    }

    /* renamed from: l */
    static int m9987l(Object obj, long j) {
        return f7602e.mo7396l(obj, j);
    }

    /* renamed from: m */
    static long m9988m(ByteBuffer byteBuffer) {
        return f7602e.mo7397m(byteBuffer, f7606i);
    }

    /* renamed from: n */
    static long m9989n(Object obj, long j) {
        return f7602e.mo7397m(obj, j);
    }

    /* renamed from: o */
    static <T> T m9990o(Class<T> cls) {
        try {
            return f7598a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: p */
    static Object m9991p(Object obj, long j) {
        return f7602e.mo7399o(obj, j);
    }

    /* renamed from: q */
    static Unsafe m9992q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ct3());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: w */
    static void m9998w(long j, byte[] bArr, long j2, long j3) {
        f7602e.mo6654d(j, bArr, j2, j3);
    }

    /* renamed from: x */
    static void m9999x(Object obj, long j, boolean z) {
        f7602e.mo6655e(obj, j, z);
    }

    /* renamed from: y */
    static void m10000y(byte[] bArr, long j, byte b) {
        f7602e.mo6656f(bArr, f7605h + j, b);
    }

    /* renamed from: z */
    static void m10001z(Object obj, long j, double d) {
        f7602e.mo6657g(obj, j, d);
    }
}
