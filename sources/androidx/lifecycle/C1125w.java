package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C1099i;

/* renamed from: androidx.lifecycle.w */
public class C1125w extends Fragment {

    /* renamed from: f */
    private C1126a f3015f;

    /* renamed from: androidx.lifecycle.w$a */
    interface C1126a {
        /* renamed from: a */
        void mo3853a();

        /* renamed from: b */
        void mo3854b();

        void onResume();
    }

    /* renamed from: androidx.lifecycle.w$b */
    static class C1127b implements Application.ActivityLifecycleCallbacks {
        C1127b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C1127b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C1125w.m4619a(activity, C1099i.C1101b.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            C1125w.m4619a(activity, C1099i.C1101b.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            C1125w.m4619a(activity, C1099i.C1101b.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C1125w.m4619a(activity, C1099i.C1101b.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            C1125w.m4619a(activity, C1099i.C1101b.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            C1125w.m4619a(activity, C1099i.C1101b.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m4619a(Activity activity, C1099i.C1101b bVar) {
        if (activity instanceof C1113o) {
            ((C1113o) activity).mo491a().mo3835h(bVar);
        } else if (activity instanceof C1110m) {
            C1099i a = ((C1110m) activity).mo491a();
            if (a instanceof C1111n) {
                ((C1111n) a).mo3835h(bVar);
            }
        }
    }

    /* renamed from: b */
    private void m4620b(C1099i.C1101b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m4619a(getActivity(), bVar);
        }
    }

    /* renamed from: c */
    private void m4621c(C1126a aVar) {
        if (aVar != null) {
            aVar.mo3853a();
        }
    }

    /* renamed from: d */
    private void m4622d(C1126a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    /* renamed from: e */
    private void m4623e(C1126a aVar) {
        if (aVar != null) {
            aVar.mo3854b();
        }
    }

    /* renamed from: f */
    static C1125w m4624f(Activity activity) {
        return (C1125w) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: g */
    public static void m4625g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1127b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C1125w(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3859h(C1126a aVar) {
        this.f3015f = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m4621c(this.f3015f);
        m4620b(C1099i.C1101b.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m4620b(C1099i.C1101b.ON_DESTROY);
        this.f3015f = null;
    }

    public void onPause() {
        super.onPause();
        m4620b(C1099i.C1101b.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m4622d(this.f3015f);
        m4620b(C1099i.C1101b.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m4623e(this.f3015f);
        m4620b(C1099i.C1101b.ON_START);
    }

    public void onStop() {
        super.onStop();
        m4620b(C1099i.C1101b.ON_STOP);
    }
}
