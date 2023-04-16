package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CheckedTextView;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.c */
public final class C0865c {

    /* renamed from: androidx.core.widget.c$a */
    private static class C0866a {

        /* renamed from: a */
        private static Field f2352a;

        /* renamed from: b */
        private static boolean f2353b;

        /* renamed from: a */
        static Drawable m3595a(CheckedTextView checkedTextView) {
            if (!f2353b) {
                try {
                    Field declaredField = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    f2352a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("CheckedTextViewCompat", "Failed to retrieve mCheckMarkDrawable field", e);
                }
                f2353b = true;
            }
            Field field = f2352a;
            if (field != null) {
                try {
                    return (Drawable) field.get(checkedTextView);
                } catch (IllegalAccessException e2) {
                    Log.i("CheckedTextViewCompat", "Failed to get check mark drawable via reflection", e2);
                    f2352a = null;
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.core.widget.c$b */
    private static class C0867b {
        /* renamed from: a */
        static Drawable m3596a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* renamed from: androidx.core.widget.c$c */
    private static class C0868c {
        /* renamed from: a */
        static void m3597a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* renamed from: b */
        static void m3598b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    /* renamed from: a */
    public static Drawable m3592a(CheckedTextView checkedTextView) {
        return Build.VERSION.SDK_INT >= 16 ? C0867b.m3596a(checkedTextView) : C0866a.m3595a(checkedTextView);
    }

    /* renamed from: b */
    public static void m3593b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0868c.m3597a(checkedTextView, colorStateList);
        } else if (checkedTextView instanceof C0893l) {
            ((C0893l) checkedTextView).setSupportCheckMarkTintList(colorStateList);
        }
    }

    /* renamed from: c */
    public static void m3594c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0868c.m3598b(checkedTextView, mode);
        } else if (checkedTextView instanceof C0893l) {
            ((C0893l) checkedTextView).setSupportCheckMarkTintMode(mode);
        }
    }
}
