package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;
import p109p.C3879e;

/* renamed from: androidx.core.view.b0 */
public final class C0767b0 {

    /* renamed from: androidx.core.view.b0$a */
    static class C0768a {
        /* renamed from: a */
        static int m3045a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        /* renamed from: b */
        static boolean m3046b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        /* renamed from: c */
        static void m3047c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    /* renamed from: a */
    public static boolean m3044a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0768a.m3046b(viewGroup);
        }
        Boolean bool = (Boolean) viewGroup.getTag(C3879e.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0833y.m3367w(viewGroup) == null) ? false : true;
    }
}
