package kotlin.coroutines.jvm.internal;

import p100n4.C3773d;
import p100n4.C3778g;

/* renamed from: kotlin.coroutines.jvm.internal.c */
public final class C3337c implements C3773d<Object> {

    /* renamed from: f */
    public static final C3337c f20830f = new C3337c();

    private C3337c() {
    }

    public C3778g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
