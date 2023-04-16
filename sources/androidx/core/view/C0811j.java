package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p116q.C3934b;

/* renamed from: androidx.core.view.j */
public final class C0811j {

    /* renamed from: androidx.core.view.j$a */
    static class C0812a {
        /* renamed from: a */
        static int m3254a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        /* renamed from: b */
        static CharSequence m3255b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        /* renamed from: c */
        static ColorStateList m3256c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        /* renamed from: d */
        static PorterDuff.Mode m3257d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        /* renamed from: e */
        static int m3258e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        /* renamed from: f */
        static CharSequence m3259f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        /* renamed from: g */
        static MenuItem m3260g(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        /* renamed from: h */
        static MenuItem m3261h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        /* renamed from: i */
        static MenuItem m3262i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: j */
        static MenuItem m3263j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        /* renamed from: k */
        static MenuItem m3264k(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        /* renamed from: l */
        static MenuItem m3265l(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        /* renamed from: m */
        static MenuItem m3266m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static MenuItem m3247a(MenuItem menuItem, C0764b bVar) {
        if (menuItem instanceof C3934b) {
            return ((C3934b) menuItem).mo936a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m3248b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C3934b) {
            ((C3934b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0812a.m3260g(menuItem, c, i);
        }
    }

    /* renamed from: c */
    public static void m3249c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C3934b) {
            ((C3934b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0812a.m3261h(menuItem, charSequence);
        }
    }

    /* renamed from: d */
    public static void m3250d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C3934b) {
            ((C3934b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0812a.m3262i(menuItem, colorStateList);
        }
    }

    /* renamed from: e */
    public static void m3251e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof C3934b) {
            ((C3934b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0812a.m3263j(menuItem, mode);
        }
    }

    /* renamed from: f */
    public static void m3252f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C3934b) {
            ((C3934b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0812a.m3264k(menuItem, c, i);
        }
    }

    /* renamed from: g */
    public static void m3253g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C3934b) {
            ((C3934b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0812a.m3266m(menuItem, charSequence);
        }
    }
}
