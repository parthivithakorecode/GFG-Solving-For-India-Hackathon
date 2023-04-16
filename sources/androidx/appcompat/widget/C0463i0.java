package androidx.appcompat.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0655c;
import p052h.C2662c;

/* renamed from: androidx.appcompat.widget.i0 */
public class C0463i0 {

    /* renamed from: a */
    private static final int[] f1468a = {16842912};

    /* renamed from: b */
    private static final int[] f1469b = new int[0];

    /* renamed from: c */
    public static final Rect f1470c = new Rect();

    /* renamed from: a */
    public static boolean m1906a(Drawable drawable) {
        Drawable drawable2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            return true;
        }
        if (i < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (i < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (i < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer.DrawableContainerState) {
                for (Drawable a : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                    if (!m1906a(a)) {
                        return false;
                    }
                }
            }
        } else {
            if (drawable instanceof C0655c) {
                drawable2 = ((C0655c) drawable).mo2613b();
            } else if (drawable instanceof C2662c) {
                drawable2 = ((C2662c) drawable).mo12614a();
            } else if (drawable instanceof ScaleDrawable) {
                drawable2 = ((ScaleDrawable) drawable).getDrawable();
            }
            return m1906a(drawable2);
        }
        return true;
    }

    /* renamed from: b */
    static void m1907b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if ((i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) || (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name))) {
            m1908c(drawable);
        }
    }

    /* renamed from: c */
    private static void m1908c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1468a);
        } else {
            drawable.setState(f1469b);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static PorterDuff.Mode m1909d(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
