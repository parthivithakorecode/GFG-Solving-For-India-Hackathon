package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.d */
public final class C0869d {

    /* renamed from: a */
    private static Field f2354a;

    /* renamed from: b */
    private static boolean f2355b;

    /* renamed from: androidx.core.widget.d$a */
    static class C0870a {
        /* renamed from: a */
        static ColorStateList m3602a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m3603b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: c */
        static void m3604c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: d */
        static void m3605d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: androidx.core.widget.d$b */
    static class C0871b {
        /* renamed from: a */
        static Drawable m3606a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: a */
    public static Drawable m3599a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0871b.m3606a(compoundButton);
        }
        if (!f2355b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f2354a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f2355b = true;
        }
        Field field = f2354a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f2354a = null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m3600b(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0870a.m3604c(compoundButton, colorStateList);
        } else if (compoundButton instanceof C0894m) {
            ((C0894m) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: c */
    public static void m3601c(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0870a.m3605d(compoundButton, mode);
        } else if (compoundButton instanceof C0894m) {
            ((C0894m) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
