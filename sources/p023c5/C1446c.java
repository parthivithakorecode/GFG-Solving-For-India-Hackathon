package p023c5;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Objects;
import kotlin.jvm.internal.C3353e;
import p079k4.C3322k;
import p079k4.C3325l;

/* renamed from: c5.c */
public final class C1446c {

    /* renamed from: a */
    public static final C1445b f3665a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        C1445b bVar = null;
        try {
            C3322k.C3323a aVar = C3322k.f20823f;
            obj = C3322k.m24446a(new C1444a(m5642a(Looper.getMainLooper(), true), (String) null, 2, (C3353e) null));
        } catch (Throwable th) {
            C3322k.C3323a aVar2 = C3322k.f20823f;
            obj = C3322k.m24446a(C3325l.m24450a(th));
        }
        if (!C3322k.m24448c(obj)) {
            bVar = obj;
        }
        f3665a = bVar;
    }

    /* renamed from: a */
    public static final Handler m5642a(Looper looper, boolean z) {
        int i;
        if (!z || (i = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
