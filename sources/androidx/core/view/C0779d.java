package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.core.util.C0740c;
import java.util.List;

/* renamed from: androidx.core.view.d */
public final class C0779d {

    /* renamed from: a */
    private final DisplayCutout f2196a;

    /* renamed from: androidx.core.view.d$a */
    static class C0780a {
        /* renamed from: a */
        static DisplayCutout m3102a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        /* renamed from: b */
        static List<Rect> m3103b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        /* renamed from: c */
        static int m3104c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* renamed from: d */
        static int m3105d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* renamed from: e */
        static int m3106e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* renamed from: f */
        static int m3107f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    private C0779d(DisplayCutout displayCutout) {
        this.f2196a = displayCutout;
    }

    /* renamed from: e */
    static C0779d m3097e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C0779d(displayCutout);
    }

    /* renamed from: a */
    public int mo2845a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0780a.m3104c(this.f2196a);
        }
        return 0;
    }

    /* renamed from: b */
    public int mo2846b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0780a.m3105d(this.f2196a);
        }
        return 0;
    }

    /* renamed from: c */
    public int mo2847c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0780a.m3106e(this.f2196a);
        }
        return 0;
    }

    /* renamed from: d */
    public int mo2848d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0780a.m3107f(this.f2196a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0779d.class != obj.getClass()) {
            return false;
        }
        return C0740c.m2946a(this.f2196a, ((C0779d) obj).f2196a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f2196a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f2196a + "}";
    }
}
