package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.j */
class C1104j {

    /* renamed from: a */
    private static AtomicBoolean f2989a = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.j$a */
    static class C1105a extends C1080d {
        C1105a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C1125w.m4625g(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m4573a(Context context) {
        if (!f2989a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1105a());
        }
    }
}
