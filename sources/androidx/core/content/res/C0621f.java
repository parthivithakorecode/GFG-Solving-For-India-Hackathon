package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p109p.C3883i;

/* renamed from: androidx.core.content.res.f */
final class C0621f {

    /* renamed from: androidx.core.content.res.f$a */
    static final class C0622a {

        /* renamed from: a */
        final int[] f1918a;

        /* renamed from: b */
        final float[] f1919b;

        C0622a(int i, int i2) {
            this.f1918a = new int[]{i, i2};
            this.f1919b = new float[]{0.0f, 1.0f};
        }

        C0622a(int i, int i2, int i3) {
            this.f1918a = new int[]{i, i2, i3};
            this.f1919b = new float[]{0.0f, 0.5f, 1.0f};
        }

        C0622a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f1918a = new int[size];
            this.f1919b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f1918a[i] = list.get(i).intValue();
                this.f1919b[i] = list2.get(i).floatValue();
            }
        }
    }

    /* renamed from: a */
    private static C0622a m2555a(C0622a aVar, int i, int i2, boolean z, int i3) {
        C0622a aVar2;
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return aVar2;
        }
        aVar2 = new C0622a(i, i2);
        return aVar2;
    }

    /* renamed from: b */
    static Shader m2556b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray k = C0636k.m2600k(resources, theme2, attributeSet, C3883i.f21922A);
            float f = C0636k.m2595f(k, xmlPullParser2, "startX", C3883i.f21931J, 0.0f);
            float f2 = C0636k.m2595f(k, xmlPullParser2, "startY", C3883i.f21932K, 0.0f);
            float f3 = C0636k.m2595f(k, xmlPullParser2, "endX", C3883i.f21933L, 0.0f);
            float f4 = C0636k.m2595f(k, xmlPullParser2, "endY", C3883i.f21934M, 0.0f);
            float f5 = C0636k.m2595f(k, xmlPullParser2, "centerX", C3883i.f21926E, 0.0f);
            float f6 = C0636k.m2595f(k, xmlPullParser2, "centerY", C3883i.f21927F, 0.0f);
            int g = C0636k.m2596g(k, xmlPullParser2, "type", C3883i.f21925D, 0);
            int b = C0636k.m2591b(k, xmlPullParser2, "startColor", C3883i.f21923B, 0);
            boolean j = C0636k.m2599j(xmlPullParser2, "centerColor");
            int b2 = C0636k.m2591b(k, xmlPullParser2, "centerColor", C3883i.f21930I, 0);
            int b3 = C0636k.m2591b(k, xmlPullParser2, "endColor", C3883i.f21924C, 0);
            int g2 = C0636k.m2596g(k, xmlPullParser2, "tileMode", C3883i.f21929H, 0);
            float f7 = f5;
            float f8 = C0636k.m2595f(k, xmlPullParser2, "gradientRadius", C3883i.f21928G, 0.0f);
            k.recycle();
            C0622a a = m2555a(m2557c(resources, xmlPullParser, attributeSet, theme), b, b3, j, b2);
            if (g == 1) {
                float f9 = f7;
                if (f8 > 0.0f) {
                    int[] iArr = a.f1918a;
                    return new RadialGradient(f9, f6, f8, iArr, a.f1919b, m2558d(g2));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (g != 2) {
                return new LinearGradient(f, f2, f3, f4, a.f1918a, a.f1919b, m2558d(g2));
            } else {
                return new SweepGradient(f7, f6, a.f1918a, a.f1919b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.res.C0621f.C0622a m2557c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r10.next()
            if (r3 == r1) goto L_0x0081
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0081
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = p109p.C3883i.f21935N
            android.content.res.TypedArray r3 = androidx.core.content.res.C0636k.m2600k(r9, r12, r11, r3)
            int r5 = p109p.C3883i.f21936O
            boolean r6 = r3.hasValue(r5)
            int r7 = p109p.C3883i.f21937P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0066:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0081:
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x008d
            androidx.core.content.res.f$a r9 = new androidx.core.content.res.f$a
            r9.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r9
        L_0x008d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0621f.m2557c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    /* renamed from: d */
    private static Shader.TileMode m2558d(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
