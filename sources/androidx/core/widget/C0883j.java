package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.core.text.C0725d;
import androidx.core.util.C0743e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.core.widget.j */
public final class C0883j {

    /* renamed from: androidx.core.widget.j$a */
    static class C0884a {
        /* renamed from: a */
        static boolean m3651a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* renamed from: b */
        static int m3652b(TextView textView) {
            return textView.getMaxLines();
        }

        /* renamed from: c */
        static int m3653c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* renamed from: androidx.core.widget.j$b */
    static class C0885b {
        /* renamed from: a */
        static Drawable[] m3654a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        static int m3655b(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: c */
        static int m3656c(View view) {
            return view.getTextDirection();
        }

        /* renamed from: d */
        static Locale m3657d(TextView textView) {
            return textView.getTextLocale();
        }

        /* renamed from: e */
        static void m3658e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: f */
        static void m3659f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        static void m3660g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: h */
        static void m3661h(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: androidx.core.widget.j$c */
    static class C0886c {
        /* renamed from: a */
        static int m3662a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: b */
        static ColorStateList m3663b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* renamed from: c */
        static PorterDuff.Mode m3664c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* renamed from: d */
        static int m3665d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: e */
        static void m3666e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        /* renamed from: f */
        static void m3667f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: g */
        static void m3668g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: h */
        static void m3669h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* renamed from: androidx.core.widget.j$d */
    static class C0887d {
        /* renamed from: a */
        static DecimalFormatSymbols m3670a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* renamed from: androidx.core.widget.j$e */
    static class C0888e {
        /* renamed from: a */
        static String[] m3671a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* renamed from: b */
        static PrecomputedText.Params m3672b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* renamed from: c */
        static void m3673c(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* renamed from: androidx.core.widget.j$f */
    private static class C0889f implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f2361a;

        /* renamed from: b */
        private final TextView f2362b;

        /* renamed from: c */
        private Class<?> f2363c;

        /* renamed from: d */
        private Method f2364d;

        /* renamed from: e */
        private boolean f2365e;

        /* renamed from: f */
        private boolean f2366f = false;

        C0889f(ActionMode.Callback callback, TextView textView) {
            this.f2361a = callback;
            this.f2362b = textView;
        }

        /* renamed from: a */
        private Intent m3674a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        private Intent m3675b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m3674a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m3677e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        private List<ResolveInfo> m3676c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo next : packageManager.queryIntentActivities(m3674a(), 0)) {
                if (m3678f(next, context)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        /* renamed from: e */
        private boolean m3677e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: f */
        private boolean m3678f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* renamed from: g */
        private void m3679g(Menu menu) {
            Method method;
            Context context = this.f2362b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f2366f) {
                this.f2366f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f2363c = cls;
                    this.f2364d = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f2365e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f2363c = null;
                    this.f2364d = null;
                    this.f2365e = false;
                }
            }
            try {
                if (!this.f2365e || !this.f2363c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.f2364d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List<ResolveInfo> c = m3676c(context, packageManager);
                for (int i = 0; i < c.size(); i++) {
                    ResolveInfo resolveInfo = c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m3675b(resolveInfo, this.f2362b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public ActionMode.Callback mo3084d() {
            return this.f2361a;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f2361a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f2361a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f2361a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m3679g(menu);
            return this.f2361a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static int m3637a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: b */
    public static int m3638b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: c */
    private static int m3639c(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    /* renamed from: d */
    private static TextDirectionHeuristic m3640d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (C0885b.m3655b(textView) == 1) {
                z = true;
            }
            switch (C0885b.m3656c(textView)) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(C0888e.m3671a(C0887d.m3670a(C0885b.m3657d(textView)))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: e */
    public static C0725d.C0726a m3641e(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C0725d.C0726a(C0888e.m3672b(textView));
        }
        C0725d.C0726a.C0727a aVar = new C0725d.C0726a.C0727a(new TextPaint(textView.getPaint()));
        if (i >= 23) {
            aVar.mo2754b(C0886c.m3662a(textView));
            aVar.mo2755c(C0886c.m3665d(textView));
        }
        if (i >= 18) {
            aVar.mo2756d(m3640d(textView));
        }
        return aVar.mo2753a();
    }

    /* renamed from: f */
    public static void m3642f(TextView textView, ColorStateList colorStateList) {
        C0743e.m2958f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C0886c.m3667f(textView, colorStateList);
        } else if (textView instanceof C0895n) {
            ((C0895n) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* renamed from: g */
    public static void m3643g(TextView textView, PorterDuff.Mode mode) {
        C0743e.m2958f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C0886c.m3668g(textView, mode);
        } else if (textView instanceof C0895n) {
            ((C0895n) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: h */
    public static void m3644h(TextView textView, int i) {
        C0743e.m2955c(i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            C0888e.m3673c(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = (i2 < 16 || C0884a.m3651a(textView)) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: i */
    public static void m3645i(TextView textView, int i) {
        C0743e.m2955c(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (Build.VERSION.SDK_INT < 16 || C0884a.m3651a(textView)) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: j */
    public static void m3646j(TextView textView, int i) {
        C0743e.m2955c(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: k */
    public static void m3647k(TextView textView, C0725d dVar) {
        Spanned spanned;
        if (Build.VERSION.SDK_INT >= 29) {
            spanned = dVar.mo2733b();
        } else {
            boolean a = m3641e(textView).mo2745a(dVar.mo2732a());
            spanned = dVar;
            if (!a) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
        }
        textView.setText(spanned);
    }

    /* renamed from: l */
    public static void m3648l(TextView textView, C0725d.C0726a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            C0885b.m3661h(textView, m3639c(aVar.mo2748d()));
        }
        if (i < 23) {
            float textScaleX = aVar.mo2749e().getTextScaleX();
            textView.getPaint().set(aVar.mo2749e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.mo2749e());
        C0886c.m3666e(textView, aVar.mo2746b());
        C0886c.m3669h(textView, aVar.mo2747c());
    }

    /* renamed from: m */
    public static ActionMode.Callback m3649m(ActionMode.Callback callback) {
        return (!(callback instanceof C0889f) || Build.VERSION.SDK_INT < 26) ? callback : ((C0889f) callback).mo3084d();
    }

    /* renamed from: n */
    public static ActionMode.Callback m3650n(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof C0889f) || callback == null) ? callback : new C0889f(callback, textView);
    }
}
