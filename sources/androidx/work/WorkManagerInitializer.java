package androidx.work;

import android.content.Context;
import androidx.work.C1235a;
import java.util.Collections;
import java.util.List;
import p068j0.C3133a;
import p089m0.C3646j;
import p089m0.C3663t;

public final class WorkManagerInitializer implements C3133a<C3663t> {

    /* renamed from: a */
    private static final String f3318a = C3646j.m25231f("WrkMgrInitializer");

    /* renamed from: a */
    public List<Class<? extends C3133a<?>>> mo3089a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public C3663t mo3090b(Context context) {
        C3646j.m25229c().mo14806a(f3318a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        C3663t.m25253e(context, new C1235a.C1237b().mo4500a());
        return C3663t.m25252d(context);
    }
}
