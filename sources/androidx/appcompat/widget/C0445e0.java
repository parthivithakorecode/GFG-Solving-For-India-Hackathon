package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0833y;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p038f.C2591j;

/* renamed from: androidx.appcompat.widget.e0 */
class C0445e0 {

    /* renamed from: l */
    private static final RectF f1413l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m */
    private static ConcurrentHashMap<String, Method> f1414m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: n */
    private static ConcurrentHashMap<String, Field> f1415n = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1416a = 0;

    /* renamed from: b */
    private boolean f1417b = false;

    /* renamed from: c */
    private float f1418c = -1.0f;

    /* renamed from: d */
    private float f1419d = -1.0f;

    /* renamed from: e */
    private float f1420e = -1.0f;

    /* renamed from: f */
    private int[] f1421f = new int[0];

    /* renamed from: g */
    private boolean f1422g = false;

    /* renamed from: h */
    private TextPaint f1423h;

    /* renamed from: i */
    private final TextView f1424i;

    /* renamed from: j */
    private final Context f1425j;

    /* renamed from: k */
    private final C0451f f1426k;

    /* renamed from: androidx.appcompat.widget.e0$a */
    private static final class C0446a {
        /* renamed from: a */
        static StaticLayout m1846a(CharSequence charSequence, Layout.Alignment alignment, int i, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        /* renamed from: b */
        static int m1847b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$b */
    private static final class C0447b {
        /* renamed from: a */
        static boolean m1848a(View view) {
            return view.isInLayout();
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$c */
    private static final class C0448c {
        /* renamed from: a */
        static StaticLayout m1849a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, C0451f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                fVar.mo1952a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$d */
    private static class C0449d extends C0451f {
        C0449d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1952a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0445e0.m1827p(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$e */
    private static class C0450e extends C0449d {
        C0450e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1952a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1953b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: androidx.appcompat.widget.e0$f */
    private static class C0451f {
        C0451f() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1952a(StaticLayout.Builder builder, TextView textView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1953b(TextView textView) {
            return ((Boolean) C0445e0.m1827p(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    C0445e0(TextView textView) {
        this.f1424i = textView;
        this.f1425j = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        this.f1426k = i >= 29 ? new C0450e() : i >= 23 ? new C0449d() : new C0451f();
    }

    /* renamed from: A */
    private boolean m1817A(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1424i.getText();
        TransformationMethod transformationMethod = this.f1424i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1424i)) == null)) {
            text = transformation;
        }
        int b = Build.VERSION.SDK_INT >= 16 ? C0446a.m1847b(this.f1424i) : -1;
        mo1945o(i);
        StaticLayout e = mo1939e(text, (Layout.Alignment) m1827p(this.f1424i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b);
        return (b == -1 || (e.getLineCount() <= b && e.getLineEnd(e.getLineCount() - 1) == text.length())) && ((float) e.getHeight()) <= rectF.bottom;
    }

    /* renamed from: B */
    private boolean m1818B() {
        return !(this.f1424i instanceof C0477l);
    }

    /* renamed from: C */
    private void m1819C(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f1416a = 1;
            this.f1419d = f;
            this.f1420e = f2;
            this.f1418c = f3;
            this.f1422g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: a */
    private static <T> T m1820a(Object obj, String str, T t) {
        try {
            Field m = m1825m(str);
            return m == null ? t : m.get(obj);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    /* renamed from: c */
    private int[] m1821c(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    private void m1822d() {
        this.f1416a = 0;
        this.f1419d = -1.0f;
        this.f1420e = -1.0f;
        this.f1418c = -1.0f;
        this.f1421f = new int[0];
        this.f1417b = false;
    }

    /* renamed from: f */
    private StaticLayout m1823f(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1423h, i, alignment, ((Float) m1820a(this.f1424i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m1820a(this.f1424i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m1820a(this.f1424i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    /* renamed from: g */
    private int m1824g(RectF rectF) {
        int length = this.f1421f.length;
        if (length != 0) {
            int i = 0;
            int i2 = 1;
            int i3 = length - 1;
            while (true) {
                int i4 = i2;
                int i5 = i;
                i = i4;
                while (i <= i3) {
                    int i6 = (i + i3) / 2;
                    if (m1817A(this.f1421f[i6], rectF)) {
                        i2 = i6 + 1;
                    } else {
                        i5 = i6 - 1;
                        i3 = i5;
                    }
                }
                return this.f1421f[i5];
            }
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: m */
    private static Field m1825m(String str) {
        try {
            Field field = f1415n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1415n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    /* renamed from: n */
    private static Method m1826n(String str) {
        try {
            Method method = f1414m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1414m.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: p */
    static <T> T m1827p(Object obj, String str, T t) {
        try {
            return m1826n(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: v */
    private void m1828v(float f) {
        if (f != this.f1424i.getPaint().getTextSize()) {
            this.f1424i.getPaint().setTextSize(f);
            boolean a = Build.VERSION.SDK_INT >= 18 ? C0447b.m1848a(this.f1424i) : false;
            if (this.f1424i.getLayout() != null) {
                this.f1417b = false;
                try {
                    Method n = m1826n("nullLayouts");
                    if (n != null) {
                        n.invoke(this.f1424i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!a) {
                    this.f1424i.requestLayout();
                } else {
                    this.f1424i.forceLayout();
                }
                this.f1424i.invalidate();
            }
        }
    }

    /* renamed from: x */
    private boolean m1829x() {
        if (!m1818B() || this.f1416a != 1) {
            this.f1417b = false;
        } else {
            if (!this.f1422g || this.f1421f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1420e - this.f1419d) / this.f1418c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1419d + (((float) i) * this.f1418c));
                }
                this.f1421f = m1821c(iArr);
            }
            this.f1417b = true;
        }
        return this.f1417b;
    }

    /* renamed from: y */
    private void m1830y(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1421f = m1821c(iArr);
            m1831z();
        }
    }

    /* renamed from: z */
    private boolean m1831z() {
        int[] iArr = this.f1421f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f1422g = z;
        if (z) {
            this.f1416a = 1;
            this.f1419d = (float) iArr[0];
            this.f1420e = (float) iArr[length - 1];
            this.f1418c = -1.0f;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1938b() {
        if (mo1946q()) {
            if (this.f1417b) {
                if (this.f1424i.getMeasuredHeight() > 0 && this.f1424i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f1426k.mo1953b(this.f1424i) ? 1048576 : (this.f1424i.getMeasuredWidth() - this.f1424i.getTotalPaddingLeft()) - this.f1424i.getTotalPaddingRight();
                    int height = (this.f1424i.getHeight() - this.f1424i.getCompoundPaddingBottom()) - this.f1424i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f1413l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float g = (float) m1824g(rectF);
                            if (g != this.f1424i.getTextSize()) {
                                mo1951w(0, g);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1417b = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public StaticLayout mo1939e(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            return i3 >= 16 ? C0446a.m1846a(charSequence, alignment, i, this.f1424i, this.f1423h) : m1823f(charSequence, alignment, i);
        }
        return C0448c.m1849a(charSequence, alignment, i, i2, this.f1424i, this.f1423h, this.f1426k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo1940h() {
        return Math.round(this.f1420e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo1941i() {
        return Math.round(this.f1419d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo1942j() {
        return Math.round(this.f1418c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] mo1943k() {
        return this.f1421f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo1944l() {
        return this.f1416a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo1945o(int i) {
        TextPaint textPaint = this.f1423h;
        if (textPaint == null) {
            this.f1423h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1423h.set(this.f1424i.getPaint());
        this.f1423h.setTextSize((float) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo1946q() {
        return m1818B() && this.f1416a != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo1947r(AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.f1425j;
        int[] iArr = C2591j.f18839g0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f1424i;
        C0833y.m3328M(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = C2591j.f18864l0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f1416a = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = C2591j.f18859k0;
        float dimension = obtainStyledAttributes.hasValue(i3) ? obtainStyledAttributes.getDimension(i3, -1.0f) : -1.0f;
        int i4 = C2591j.f18849i0;
        float dimension2 = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = C2591j.f18844h0;
        float dimension3 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = C2591j.f18854j0;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1830y(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m1818B()) {
            this.f1416a = 0;
        } else if (this.f1416a == 1) {
            if (!this.f1422g) {
                DisplayMetrics displayMetrics = this.f1425j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1819C(dimension2, dimension3, dimension);
            }
            m1829x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo1948s(int i, int i2, int i3, int i4) {
        if (m1818B()) {
            DisplayMetrics displayMetrics = this.f1425j.getResources().getDisplayMetrics();
            m1819C(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m1829x()) {
                mo1938b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo1949t(int[] iArr, int i) {
        if (m1818B()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1425j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f1421f = m1821c(iArr2);
                if (!m1831z()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1422g = false;
            }
            if (m1829x()) {
                mo1938b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo1950u(int i) {
        if (!m1818B()) {
            return;
        }
        if (i == 0) {
            m1822d();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f1425j.getResources().getDisplayMetrics();
            m1819C(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1829x()) {
                mo1938b();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo1951w(int i, float f) {
        Context context = this.f1425j;
        m1828v(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
