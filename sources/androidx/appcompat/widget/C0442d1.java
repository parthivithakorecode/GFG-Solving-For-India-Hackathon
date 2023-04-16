package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.d1 */
public class C0442d1 {

    /* renamed from: androidx.appcompat.widget.d1$a */
    static class C0443a {
        /* renamed from: a */
        static void m1805a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m1804a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0443a.m1805a(view, charSequence);
        } else {
            C0458g1.m1870h(view, charSequence);
        }
    }
}
