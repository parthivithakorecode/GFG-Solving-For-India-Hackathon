package androidx.lifecycle;

import android.content.Context;
import androidx.startup.C1187a;
import java.util.Collections;
import java.util.List;
import p068j0.C3133a;

public final class ProcessLifecycleInitializer implements C3133a<C1110m> {
    /* renamed from: a */
    public List<Class<? extends C3133a<?>>> mo3089a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public C1110m mo3090b(Context context) {
        if (C1187a.m4780e(context).mo4011g(ProcessLifecycleInitializer.class)) {
            C1104j.m4573a(context);
            C1120v.m4608l(context);
            return C1120v.m4607k();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
