package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.C3357i;

/* renamed from: kotlin.coroutines.jvm.internal.g */
public final class C3341g {
    /* renamed from: a */
    private static final void m24487a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    /* renamed from: b */
    private static final C3340f m24488b(C3335a aVar) {
        return (C3340f) aVar.getClass().getAnnotation(C3340f.class);
    }

    /* renamed from: c */
    private static final int m24489c(C3335a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m24490d(C3335a aVar) {
        String str;
        C3357i.m24508e(aVar, "<this>");
        C3340f b = m24488b(aVar);
        if (b == null) {
            return null;
        }
        m24487a(1, b.mo14344v());
        int c = m24489c(aVar);
        int i = c < 0 ? -1 : b.mo14342l()[c];
        String b2 = C3343i.f20831a.mo14345b(aVar);
        if (b2 == null) {
            str = b.mo14340c();
        } else {
            str = b2 + '/' + b.mo14340c();
        }
        return new StackTraceElement(str, b.mo14343m(), b.mo14341f(), i);
    }
}
