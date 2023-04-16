package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C3357i;

/* renamed from: kotlinx.coroutines.internal.o */
public final class C3405o {
    /* renamed from: a */
    public static final void m24653a(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(C3357i.m24513j("Expected positive parallelism level, but got ", Integer.valueOf(i)).toString());
        }
    }
}
