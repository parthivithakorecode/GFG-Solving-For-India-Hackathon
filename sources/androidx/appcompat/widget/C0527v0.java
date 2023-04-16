package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C0638a;
import p038f.C2591j;

/* renamed from: androidx.appcompat.widget.v0 */
public class C0527v0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1674a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1675b = {-16842910};

    /* renamed from: c */
    static final int[] f1676c = {16842908};

    /* renamed from: d */
    static final int[] f1677d = {16843518};

    /* renamed from: e */
    static final int[] f1678e = {16842919};

    /* renamed from: f */
    static final int[] f1679f = {16842912};

    /* renamed from: g */
    static final int[] f1680g = {16842913};

    /* renamed from: h */
    static final int[] f1681h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f1682i = new int[0];

    /* renamed from: j */
    private static final int[] f1683j = new int[1];

    /* renamed from: a */
    public static void m2156a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C2591j.f18929y0);
        try {
            if (!obtainStyledAttributes.hasValue(C2591j.f18714D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m2157b(Context context, int i) {
        ColorStateList e = m2160e(context, i);
        if (e != null && e.isStateful()) {
            return e.getColorForState(f1675b, e.getDefaultColor());
        }
        TypedValue f = m2161f();
        context.getTheme().resolveAttribute(16842803, f, true);
        return m2159d(context, i, f.getFloat());
    }

    /* renamed from: c */
    public static int m2158c(Context context, int i) {
        int[] iArr = f1683j;
        iArr[0] = i;
        C0415a1 t = C0415a1.m1659t(context, (AttributeSet) null, iArr);
        try {
            return t.mo1767b(0, 0);
        } finally {
            t.mo1784v();
        }
    }

    /* renamed from: d */
    static int m2159d(Context context, int i, float f) {
        int c = m2158c(context, i);
        return C0638a.m2618f(c, Math.round(((float) Color.alpha(c)) * f));
    }

    /* renamed from: e */
    public static ColorStateList m2160e(Context context, int i) {
        int[] iArr = f1683j;
        iArr[0] = i;
        C0415a1 t = C0415a1.m1659t(context, (AttributeSet) null, iArr);
        try {
            return t.mo1768c(0);
        } finally {
            t.mo1784v();
        }
    }

    /* renamed from: f */
    private static TypedValue m2161f() {
        ThreadLocal<TypedValue> threadLocal = f1674a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
