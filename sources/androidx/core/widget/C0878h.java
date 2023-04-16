package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListView;

/* renamed from: androidx.core.widget.h */
public final class C0878h {

    /* renamed from: androidx.core.widget.h$a */
    static class C0879a {
        /* renamed from: a */
        static boolean m3627a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        /* renamed from: b */
        static void m3628b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    /* renamed from: a */
    public static void m3626a(ListView listView, int i) {
        View childAt;
        if (Build.VERSION.SDK_INT >= 19) {
            C0879a.m3628b(listView, i);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1 && (childAt = listView.getChildAt(0)) != null) {
            listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
        }
    }
}
