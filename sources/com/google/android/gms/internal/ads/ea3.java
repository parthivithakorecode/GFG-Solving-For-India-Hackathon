package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

final class ea3 extends u93 {

    /* renamed from: a */
    static final Unsafe f6140a;

    /* renamed from: b */
    static final long f6141b;

    /* renamed from: c */
    static final long f6142c;

    /* renamed from: d */
    static final long f6143d;

    /* renamed from: e */
    static final long f6144e;

    /* renamed from: f */
    static final long f6145f;

    /* renamed from: com.google.android.gms.internal.ads.ea3$a */
    class C1659a implements PrivilegedExceptionAction<Unsafe> {
        C1659a() {
        }

        /* renamed from: a */
        public static final Unsafe m8412a() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        public final /* bridge */ /* synthetic */ Object run() {
            return m8412a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads.ea3.C1659a());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    static {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.fa3> r0 = com.google.android.gms.internal.ads.fa3.class
            sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
            goto L_0x0012
        L_0x0007:
            com.google.android.gms.internal.ads.ea3$a r1 = new com.google.android.gms.internal.ads.ea3$a     // Catch:{ PrivilegedActionException -> 0x005d }
            r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005d }
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005d }
            sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005d }
        L_0x0012:
            java.lang.Class<com.google.android.gms.internal.ads.ga3> r2 = com.google.android.gms.internal.ads.ga3.class
            java.lang.String r3 = "h"
            java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
            long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
            f6142c = r3     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "g"
            java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
            long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
            f6141b = r3     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "f"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
            long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
            f6143d = r2     // Catch:{ Exception -> 0x0053 }
            java.lang.String r2 = "a"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
            long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
            f6144e = r2     // Catch:{ Exception -> 0x0053 }
            java.lang.String r2 = "b"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
            long r2 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
            f6145f = r2     // Catch:{ Exception -> 0x0053 }
            f6140a = r1     // Catch:{ Exception -> 0x0053 }
            return
        L_0x0053:
            r0 = move-exception
            com.google.android.gms.internal.ads.d53.m7726b(r0)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x005d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r2 = "Could not initialize intrinsics"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ea3.<clinit>():void");
    }

    /* synthetic */ ea3(ia3 ia3) {
        super((t93) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5199a(fa3 fa3, @CheckForNull fa3 fa32) {
        f6140a.putObject(fa3, f6145f, fa32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5200b(fa3 fa3, Thread thread) {
        f6140a.putObject(fa3, f6144e, thread);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo5201c(ga3<?> ga3, @CheckForNull x93 x93, x93 x932) {
        return da3.m7787a(f6140a, ga3, f6141b, x93, x932);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo5202d(ga3<?> ga3, @CheckForNull Object obj, Object obj2) {
        return da3.m7787a(f6140a, ga3, f6143d, obj, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo5203e(ga3<?> ga3, @CheckForNull fa3 fa3, @CheckForNull fa3 fa32) {
        return da3.m7787a(f6140a, ga3, f6142c, fa3, fa32);
    }
}
