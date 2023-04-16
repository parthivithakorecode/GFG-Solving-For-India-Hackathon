package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.Log;

/* renamed from: androidx.core.content.res.d */
public final class C0614d {

    /* renamed from: a */
    private final Shader f1904a;

    /* renamed from: b */
    private final ColorStateList f1905b;

    /* renamed from: c */
    private int f1906c;

    private C0614d(Shader shader, ColorStateList colorStateList, int i) {
        this.f1904a = shader;
        this.f1905b = colorStateList;
        this.f1906c = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.res.C0614d m2523a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0008:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x0013
            r3 = 1
            if (r1 == r3) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            if (r1 != r2) goto L_0x005c
            java.lang.String r1 = r5.getName()
            r1.hashCode()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0053
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0035
            android.content.res.ColorStateList r4 = androidx.core.content.res.C0613c.m2516b(r4, r5, r0, r6)
            androidx.core.content.res.d r4 = m2525c(r4)
            return r4
        L_0x0035:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = ": unsupported complex color tag "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L_0x0053:
            android.graphics.Shader r4 = androidx.core.content.res.C0621f.m2556b(r4, r5, r0, r6)
            androidx.core.content.res.d r4 = m2526d(r4)
            return r4
        L_0x005c:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0614d.m2523a(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.core.content.res.d");
    }

    /* renamed from: b */
    static C0614d m2524b(int i) {
        return new C0614d((Shader) null, (ColorStateList) null, i);
    }

    /* renamed from: c */
    static C0614d m2525c(ColorStateList colorStateList) {
        return new C0614d((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C0614d m2526d(Shader shader) {
        return new C0614d(shader, (ColorStateList) null, 0);
    }

    /* renamed from: g */
    public static C0614d m2527g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m2523a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: e */
    public int mo2556e() {
        return this.f1906c;
    }

    /* renamed from: f */
    public Shader mo2557f() {
        return this.f1904a;
    }

    /* renamed from: h */
    public boolean mo2558h() {
        return this.f1904a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f1905b;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2559i() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f1904a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f1905b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0614d.mo2559i():boolean");
    }

    /* renamed from: j */
    public boolean mo2560j(int[] iArr) {
        if (mo2559i()) {
            ColorStateList colorStateList = this.f1905b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f1906c) {
                this.f1906c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo2561k(int i) {
        this.f1906c = i;
    }

    /* renamed from: l */
    public boolean mo2562l() {
        return mo2558h() || this.f1906c != 0;
    }
}
