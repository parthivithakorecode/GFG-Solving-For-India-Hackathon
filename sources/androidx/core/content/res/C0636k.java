package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.res.k */
public class C0636k {
    /* renamed from: a */
    public static boolean m2590a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m2599j(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m2591b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m2599j(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: c */
    public static ColorStateList m2592c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!m2599j(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 != 2) {
            return (i2 < 28 || i2 > 31) ? C0613c.m2518d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : m2593d(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
    }

    /* renamed from: d */
    private static ColorStateList m2593d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static C0614d m2594e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m2599j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C0614d.m2524b(typedValue.data);
            }
            C0614d g = C0614d.m2527g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (g != null) {
                return g;
            }
        }
        return C0614d.m2524b(i2);
    }

    /* renamed from: f */
    public static float m2595f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m2599j(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: g */
    public static int m2596g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m2599j(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: h */
    public static int m2597h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m2599j(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    /* renamed from: i */
    public static String m2598i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m2599j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: j */
    public static boolean m2599j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: k */
    public static TypedArray m2600k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m2601l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m2599j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }
}
