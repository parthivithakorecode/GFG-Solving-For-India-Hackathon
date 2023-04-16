package kotlinx.coroutines.internal;

import java.util.List;
import p016b5.C1317a2;
import p079k4.C3315d;

/* renamed from: kotlinx.coroutines.internal.w */
public final class C3418w {

    /* renamed from: a */
    private static final boolean f20923a = true;

    /* renamed from: a */
    private static final C3419x m24695a(Throwable th, String str) {
        if (f20923a) {
            return new C3419x(th, str);
        }
        if (th == null) {
            m24698d();
            throw new C3315d();
        }
        throw th;
    }

    /* renamed from: b */
    static /* synthetic */ C3419x m24696b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m24695a(th, str);
    }

    /* renamed from: c */
    public static final boolean m24697c(C1317a2 a2Var) {
        return a2Var.mo4656R() instanceof C3419x;
    }

    /* renamed from: d */
    public static final Void m24698d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final C1317a2 m24699e(C3416u uVar, List<? extends C3416u> list) {
        try {
            return uVar.createDispatcher(list);
        } catch (Throwable th) {
            return m24695a(th, uVar.hintOnError());
        }
    }
}
