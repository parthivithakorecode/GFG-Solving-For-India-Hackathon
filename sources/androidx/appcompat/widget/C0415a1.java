package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.C0624h;

/* renamed from: androidx.appcompat.widget.a1 */
public class C0415a1 {

    /* renamed from: a */
    private final Context f1318a;

    /* renamed from: b */
    private final TypedArray f1319b;

    /* renamed from: c */
    private TypedValue f1320c;

    private C0415a1(Context context, TypedArray typedArray) {
        this.f1318a = context;
        this.f1319b = typedArray;
    }

    /* renamed from: s */
    public static C0415a1 m1658s(Context context, int i, int[] iArr) {
        return new C0415a1(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: t */
    public static C0415a1 m1659t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0415a1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: u */
    public static C0415a1 m1660u(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0415a1(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean mo1766a(int i, boolean z) {
        return this.f1319b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo1767b(int i, int i2) {
        return this.f1319b.getColor(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = p045g.C2620a.m21329a(r2.f1318a, (r0 = r2.f1319b.getResourceId(r3, 0)));
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList mo1768c(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1319b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f1319b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f1318a
            android.content.res.ColorStateList r0 = p045g.C2620a.m21329a(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f1319b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0415a1.mo1768c(int):android.content.res.ColorStateList");
    }

    /* renamed from: d */
    public int mo1769d(int i, int i2) {
        return this.f1319b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: e */
    public int mo1770e(int i, int i2) {
        return this.f1319b.getDimensionPixelSize(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f1319b.getResourceId(r3, 0);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable mo1771f(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1319b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f1319b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f1318a
            android.graphics.drawable.Drawable r3 = p045g.C2620a.m21330b(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f1319b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0415a1.mo1771f(int):android.graphics.drawable.Drawable");
    }

    /* renamed from: g */
    public Drawable mo1772g(int i) {
        int resourceId;
        if (!this.f1319b.hasValue(i) || (resourceId = this.f1319b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0472k.m1941b().mo2118d(this.f1318a, resourceId, true);
    }

    /* renamed from: h */
    public float mo1773h(int i, float f) {
        return this.f1319b.getFloat(i, f);
    }

    /* renamed from: i */
    public Typeface mo1774i(int i, int i2, C0624h.C0630f fVar) {
        int resourceId = this.f1319b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1320c == null) {
            this.f1320c = new TypedValue();
        }
        return C0624h.m2567f(this.f1318a, resourceId, this.f1320c, i2, fVar);
    }

    /* renamed from: j */
    public int mo1775j(int i, int i2) {
        return this.f1319b.getInt(i, i2);
    }

    /* renamed from: k */
    public int mo1776k(int i, int i2) {
        return this.f1319b.getInteger(i, i2);
    }

    /* renamed from: l */
    public int mo1777l(int i, int i2) {
        return this.f1319b.getLayoutDimension(i, i2);
    }

    /* renamed from: m */
    public int mo1778m(int i, int i2) {
        return this.f1319b.getResourceId(i, i2);
    }

    /* renamed from: n */
    public String mo1779n(int i) {
        return this.f1319b.getString(i);
    }

    /* renamed from: o */
    public CharSequence mo1780o(int i) {
        return this.f1319b.getText(i);
    }

    /* renamed from: p */
    public CharSequence[] mo1781p(int i) {
        return this.f1319b.getTextArray(i);
    }

    /* renamed from: q */
    public TypedArray mo1782q() {
        return this.f1319b;
    }

    /* renamed from: r */
    public boolean mo1783r(int i) {
        return this.f1319b.hasValue(i);
    }

    /* renamed from: v */
    public void mo1784v() {
        this.f1319b.recycle();
    }
}
