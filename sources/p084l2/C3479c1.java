package p084l2;

import android.app.Application;
import android.content.Context;

/* renamed from: l2.c1 */
public abstract class C3479c1 {

    /* renamed from: a */
    private static C3479c1 f21041a;

    /* renamed from: l2.c1$a */
    interface C3480a {
        /* renamed from: a */
        C3480a mo14568a(Application application);

        C3479c1 zza();
    }

    /* renamed from: a */
    public static C3479c1 m24863a(Context context) {
        C3479c1 c1Var;
        synchronized (C3479c1.class) {
            if (f21041a == null) {
                f21041a = new C3506j((C3494g) null).mo14568a((Application) context.getApplicationContext()).zza();
            }
            c1Var = f21041a;
        }
        return c1Var;
    }

    /* renamed from: b */
    public abstract C3485d2 mo14566b();

    /* renamed from: c */
    public abstract C3470a0 mo14567c();
}
