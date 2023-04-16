package p064i4;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: i4.h */
public final class C2854h {

    /* renamed from: i4.h$a */
    public interface C2855a {
        /* renamed from: a */
        boolean mo13101a(View view);
    }

    /* renamed from: c */
    public static boolean m22361c(View view) {
        return m22367i(view, C2853g.f19546a);
    }

    /* renamed from: d */
    public static int m22362d(int i) {
        return Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : i;
    }

    /* renamed from: e */
    public static Activity m22363e(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m22363e(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m22364f(View view, Class<? extends View>[] clsArr) {
        return m22367i(view, new C2852f(clsArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ boolean m22366h(Class[] clsArr, View view) {
        for (Class isInstance : clsArr) {
            if (isInstance.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m22367i(View view, C2855a aVar) {
        if (view == null) {
            return false;
        }
        if (aVar.mo13101a(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (m22367i(viewGroup.getChildAt(i), aVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
