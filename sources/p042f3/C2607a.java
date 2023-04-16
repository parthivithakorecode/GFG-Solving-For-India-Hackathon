package p042f3;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import p094m5.C3735h;

/* renamed from: f3.a */
public final class C2607a {

    /* renamed from: a */
    private static final AtomicBoolean f18972a = new AtomicBoolean();

    /* renamed from: a */
    public static void m21301a(Context context) {
        m21302b(context, "org/threeten/bp/TZDB.dat");
    }

    /* renamed from: b */
    public static void m21302b(Context context, String str) {
        if (!f18972a.getAndSet(true)) {
            C3735h.m25473c(new C2608b(context, str));
        }
    }
}
