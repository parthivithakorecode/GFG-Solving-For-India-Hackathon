package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.C3339e;
import kotlin.jvm.internal.C3357i;
import p016b5.C1319b0;
import p079k4.C3321j;
import p079k4.C3322k;
import p079k4.C3325l;
import p079k4.C3327n;

/* renamed from: kotlinx.coroutines.internal.d0 */
public final class C3375d0 {

    /* renamed from: a */
    private static final String f20861a;

    /* renamed from: b */
    private static final String f20862b;

    static {
        Object obj;
        Object obj2;
        try {
            C3322k.C3323a aVar = C3322k.f20823f;
            obj = C3322k.m24446a(Class.forName("kotlin.coroutines.jvm.internal.a").getCanonicalName());
        } catch (Throwable th) {
            C3322k.C3323a aVar2 = C3322k.f20823f;
            obj = C3322k.m24446a(C3325l.m24450a(th));
        }
        if (C3322k.m24447b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f20861a = (String) obj;
        try {
            C3322k.C3323a aVar3 = C3322k.f20823f;
            obj2 = C3322k.m24446a(C3375d0.class.getCanonicalName());
        } catch (Throwable th2) {
            C3322k.C3323a aVar4 = C3322k.f20823f;
            obj2 = C3322k.m24446a(C3325l.m24450a(th2));
        }
        if (C3322k.m24447b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f20862b = (String) obj2;
    }

    /* renamed from: b */
    public static final StackTraceElement m24559b(String str) {
        return new StackTraceElement(C3357i.m24513j("\b\b\b(", str), "\b", "\b", -1);
    }

    /* renamed from: c */
    private static final <E extends Throwable> C3321j<E, StackTraceElement[]> m24560c(E e) {
        boolean z;
        Throwable cause = e.getCause();
        if (cause == null || !C3357i.m24504a(cause.getClass(), e.getClass())) {
            return C3327n.m24453a(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            i++;
            if (m24565h(stackTraceElement)) {
                z = true;
                break;
            }
        }
        return z ? C3327n.m24453a(cause, stackTrace) : C3327n.m24453a(e, new StackTraceElement[0]);
    }

    /* renamed from: d */
    private static final <E extends Throwable> E m24561d(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(m24559b("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        int g = m24564g(stackTrace, f20861a);
        int i = 0;
        if (g == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            e2.setStackTrace((StackTraceElement[]) array);
            return e2;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + g)];
        for (int i2 = 0; i2 < g; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i + g] = it.next();
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0016  */
    /* renamed from: e */
    private static final java.util.ArrayDeque<java.lang.StackTraceElement> m24562e(kotlin.coroutines.jvm.internal.C3339e r2) {
        /*
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            java.lang.StackTraceElement r1 = r2.getStackTraceElement()
            if (r1 != 0) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            r0.add(r1)
        L_0x000f:
            kotlin.coroutines.jvm.internal.e r2 = r2.getCallerFrame()
            if (r2 != 0) goto L_0x0016
            return r0
        L_0x0016:
            java.lang.StackTraceElement r1 = r2.getStackTraceElement()
            if (r1 != 0) goto L_0x000c
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C3375d0.m24562e(kotlin.coroutines.jvm.internal.e):java.util.ArrayDeque");
    }

    /* renamed from: f */
    private static final boolean m24563f(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && C3357i.m24504a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && C3357i.m24504a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && C3357i.m24504a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    /* renamed from: g */
    private static final int m24564g(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (C3357i.m24504a(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: h */
    public static final boolean m24565h(StackTraceElement stackTraceElement) {
        return C0178n.m513m(stackTraceElement.getClassName(), "\b\b\b", false, 2, (Object) null);
    }

    /* renamed from: i */
    private static final void m24566i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            int i2 = i + 1;
            if (m24565h(stackTraceElementArr[i])) {
                break;
            }
            i = i2;
        }
        int i3 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i3 <= length2) {
            while (true) {
                int i4 = length2 - 1;
                if (m24563f(stackTraceElementArr[length2], arrayDeque.getLast())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i3) {
                    length2 = i4;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final <E extends Throwable> E m24567j(E e, C3339e eVar) {
        C3321j c = m24560c(e);
        E e2 = (Throwable) c.mo14321a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c.mo14322b();
        Throwable m = m24570m(e2);
        if (m == null) {
            return e;
        }
        ArrayDeque e3 = m24562e(eVar);
        if (e3.isEmpty()) {
            return e;
        }
        if (e2 != e) {
            m24566i(stackTraceElementArr, e3);
        }
        return m24561d(e2, m, e3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = m24570m(r1);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E extends java.lang.Throwable> E m24568k(E r1) {
        /*
            boolean r0 = p016b5.C1384o0.m5428d()
            if (r0 != 0) goto L_0x0007
            return r1
        L_0x0007:
            java.lang.Throwable r0 = m24570m(r1)
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Throwable r1 = m24569l(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C3375d0.m24568k(java.lang.Throwable):java.lang.Throwable");
    }

    /* renamed from: l */
    private static final <E extends Throwable> E m24569l(E e) {
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int g = m24564g(stackTrace, f20862b);
        int i = g + 1;
        int g2 = m24564g(stackTrace, f20861a);
        int i2 = 0;
        int i3 = (length - g) - (g2 == -1 ? 0 : length - g2);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i3];
        while (i2 < i3) {
            stackTraceElementArr[i2] = i2 == 0 ? m24559b("Coroutine boundary") : stackTrace[(i + i2) - 1];
            i2++;
        }
        e.setStackTrace(stackTraceElementArr);
        return e;
    }

    /* renamed from: m */
    private static final <E extends Throwable> E m24570m(E e) {
        E g = C3389j.m24614g(e);
        if (g == null) {
            return null;
        }
        if ((e instanceof C1319b0) || C3357i.m24504a(g.getMessage(), e.getMessage())) {
            return g;
        }
        return null;
    }

    /* renamed from: n */
    public static final <E extends Throwable> E m24571n(E e) {
        E cause = e.getCause();
        if (cause != null && C3357i.m24504a(cause.getClass(), e.getClass())) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                i++;
                if (m24565h(stackTraceElement)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return cause;
            }
        }
        return e;
    }
}
