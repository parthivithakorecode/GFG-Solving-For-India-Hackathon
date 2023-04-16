package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: androidx.core.widget.f */
public class C0875f {

    /* renamed from: androidx.core.widget.f$a */
    static class C0876a {
        /* renamed from: a */
        static ColorStateList m3619a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m3620b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: c */
        static void m3621c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* renamed from: d */
        static void m3622d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* renamed from: a */
    public static ColorStateList m3615a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0876a.m3619a(imageView);
        }
        if (imageView instanceof C0896o) {
            return ((C0896o) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* renamed from: b */
    public static PorterDuff.Mode m3616b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0876a.m3620b(imageView);
        }
        if (imageView instanceof C0896o) {
            return ((C0896o) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* renamed from: c */
    public static void m3617c(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            C0876a.m3621c(imageView, colorStateList);
            if (i == 21 && (drawable = imageView.getDrawable()) != null && C0876a.m3619a(imageView) != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof C0896o) {
            ((C0896o) imageView).setSupportImageTintList(colorStateList);
        }
    }

    /* renamed from: d */
    public static void m3618d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            C0876a.m3622d(imageView, mode);
            if (i == 21 && (drawable = imageView.getDrawable()) != null && C0876a.m3619a(imageView) != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        } else if (imageView instanceof C0896o) {
            ((C0896o) imageView).setSupportImageTintMode(mode);
        }
    }
}
