package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0330g;
import androidx.appcompat.view.menu.C0334i;
import androidx.appcompat.view.menu.C0346m;
import androidx.appcompat.view.menu.C0348n;
import androidx.appcompat.widget.C0482m0;

public class ActionMenuView extends C0482m0 implements C0330g.C0332b, C0348n {

    /* renamed from: A */
    C0330g.C0331a f1112A;

    /* renamed from: B */
    private boolean f1113B;

    /* renamed from: C */
    private int f1114C;

    /* renamed from: D */
    private int f1115D;

    /* renamed from: E */
    private int f1116E;

    /* renamed from: F */
    C0368e f1117F;

    /* renamed from: u */
    private C0330g f1118u;

    /* renamed from: v */
    private Context f1119v;

    /* renamed from: w */
    private int f1120w;

    /* renamed from: x */
    private boolean f1121x;

    /* renamed from: y */
    private C0421c f1122y;

    /* renamed from: z */
    private C0346m.C0347a f1123z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0364a {
        /* renamed from: b */
        boolean mo899b();

        /* renamed from: c */
        boolean mo900c();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C0365b implements C0346m.C0347a {
        C0365b() {
        }

        /* renamed from: b */
        public void mo727b(C0330g gVar, boolean z) {
        }

        /* renamed from: c */
        public boolean mo728c(C0330g gVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0366c extends C0482m0.C0483a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f1124a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f1125b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f1126c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f1127d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f1128e;

        /* renamed from: f */
        boolean f1129f;

        public C0366c(int i, int i2) {
            super(i, i2);
            this.f1124a = false;
        }

        public C0366c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0366c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0366c(C0366c cVar) {
            super(cVar);
            this.f1124a = cVar.f1124a;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    private class C0367d implements C0330g.C0331a {
        C0367d() {
        }

        /* renamed from: a */
        public boolean mo698a(C0330g gVar, MenuItem menuItem) {
            C0368e eVar = ActionMenuView.this.f1117F;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        /* renamed from: b */
        public void mo700b(C0330g gVar) {
            C0330g.C0331a aVar = ActionMenuView.this.f1112A;
            if (aVar != null) {
                aVar.mo700b(gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0368e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1115D = (int) (56.0f * f);
        this.f1116E = (int) (f * 4.0f);
        this.f1119v = context;
        this.f1120w = 0;
    }

    /* renamed from: J */
    static int m1456J(View view, int i, int i2, int i3, int i4) {
        C0366c cVar = (C0366c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo909p();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f1124a || !z2) {
            z = false;
        }
        cVar.f1127d = z;
        cVar.f1125b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: K */
    private void m1457K(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        boolean z4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i8 = size - paddingLeft;
        int i9 = this.f1115D;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = i9 + (i11 / i10);
        int childCount = getChildCount();
        int i13 = 0;
        int i14 = 0;
        boolean z5 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        long j = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            int i18 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i19 = i15 + 1;
                if (z6) {
                    int i20 = this.f1116E;
                    i7 = i19;
                    z4 = false;
                    childAt.setPadding(i20, 0, i20, 0);
                } else {
                    i7 = i19;
                    z4 = false;
                }
                C0366c cVar = (C0366c) childAt.getLayoutParams();
                cVar.f1129f = z4;
                cVar.f1126c = z4 ? 1 : 0;
                cVar.f1125b = z4;
                cVar.f1127d = z4;
                cVar.leftMargin = z4;
                cVar.rightMargin = z4;
                cVar.f1128e = z6 && ((ActionMenuItemView) childAt).mo909p();
                int J = m1456J(childAt, i12, cVar.f1124a ? 1 : i10, childMeasureSpec, paddingTop);
                i16 = Math.max(i16, J);
                if (cVar.f1127d) {
                    i17++;
                }
                if (cVar.f1124a) {
                    z5 = true;
                }
                i10 -= J;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (J == 1) {
                    j |= (long) (1 << i14);
                    i13 = i13;
                } else {
                    int i21 = i13;
                }
                i15 = i7;
            }
            i14++;
            size2 = i18;
        }
        int i22 = size2;
        boolean z7 = z5 && i15 == 2;
        boolean z8 = false;
        while (true) {
            if (i17 <= 0 || i10 <= 0) {
                i5 = mode;
                i3 = i8;
                z = z8;
                i4 = i13;
            } else {
                int i23 = Integer.MAX_VALUE;
                int i24 = 0;
                int i25 = 0;
                long j2 = 0;
                while (i25 < childCount) {
                    boolean z9 = z8;
                    C0366c cVar2 = (C0366c) getChildAt(i25).getLayoutParams();
                    int i26 = i13;
                    if (cVar2.f1127d) {
                        int i27 = cVar2.f1125b;
                        if (i27 < i23) {
                            j2 = 1 << i25;
                            i23 = i27;
                            i24 = 1;
                        } else if (i27 == i23) {
                            i24++;
                            j2 |= 1 << i25;
                        }
                    }
                    i25++;
                    i13 = i26;
                    z8 = z9;
                }
                z = z8;
                i4 = i13;
                j |= j2;
                if (i24 > i10) {
                    i5 = mode;
                    i3 = i8;
                    break;
                }
                int i28 = i23 + 1;
                int i29 = 0;
                while (i29 < childCount) {
                    View childAt2 = getChildAt(i29);
                    C0366c cVar3 = (C0366c) childAt2.getLayoutParams();
                    int i30 = i8;
                    int i31 = mode;
                    long j3 = (long) (1 << i29);
                    if ((j2 & j3) == 0) {
                        if (cVar3.f1125b == i28) {
                            j |= j3;
                        }
                        z3 = z7;
                    } else {
                        if (!z7 || !cVar3.f1128e || i10 != 1) {
                            z3 = z7;
                        } else {
                            int i32 = this.f1116E;
                            z3 = z7;
                            childAt2.setPadding(i32 + i12, 0, i32, 0);
                        }
                        cVar3.f1125b++;
                        cVar3.f1129f = true;
                        i10--;
                    }
                    i29++;
                    mode = i31;
                    i8 = i30;
                    z7 = z3;
                }
                i13 = i4;
                z8 = true;
            }
        }
        boolean z10 = !z5 && i15 == 1;
        if (i10 <= 0 || j == 0 || (i10 >= i15 - 1 && !z10 && i16 <= 1)) {
            i6 = 0;
            z2 = z;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z10) {
                i6 = 0;
                if ((j & 1) != 0 && !((C0366c) getChildAt(0).getLayoutParams()).f1128e) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount - 1;
                if ((j & ((long) (1 << i33))) != 0 && !((C0366c) getChildAt(i33).getLayoutParams()).f1128e) {
                    bitCount -= 0.5f;
                }
            } else {
                i6 = 0;
            }
            int i34 = bitCount > 0.0f ? (int) (((float) (i10 * i12)) / bitCount) : i6;
            z2 = z;
            for (int i35 = i6; i35 < childCount; i35++) {
                if ((j & ((long) (1 << i35))) != 0) {
                    View childAt3 = getChildAt(i35);
                    C0366c cVar4 = (C0366c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1126c = i34;
                        cVar4.f1129f = true;
                        if (i35 == 0 && !cVar4.f1128e) {
                            cVar4.leftMargin = (-i34) / 2;
                        }
                        z2 = true;
                    } else if (cVar4.f1124a) {
                        cVar4.f1126c = i34;
                        cVar4.f1129f = true;
                        cVar4.rightMargin = (-i34) / 2;
                        z2 = true;
                    } else {
                        if (i35 != 0) {
                            cVar4.leftMargin = i34 / 2;
                        }
                        if (i35 != childCount - 1) {
                            cVar4.rightMargin = i34 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            for (int i36 = i6; i36 < childCount; i36++) {
                View childAt4 = getChildAt(i36);
                C0366c cVar5 = (C0366c) childAt4.getLayoutParams();
                if (cVar5.f1129f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1125b * i12) + cVar5.f1126c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C0366c mo1451k() {
        C0366c cVar = new C0366c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: B */
    public C0366c mo1452l(AttributeSet attributeSet) {
        return new C0366c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C0366c mo1453m(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return mo1451k();
        }
        C0366c cVar = layoutParams instanceof C0366c ? new C0366c((C0366c) layoutParams) : new C0366c(layoutParams);
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    /* renamed from: D */
    public C0366c mo1433D() {
        C0366c A = mo1451k();
        A.f1124a = true;
        return A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public boolean mo1434E(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0364a)) {
            z = false | ((C0364a) childAt).mo899b();
        }
        return (i <= 0 || !(childAt2 instanceof C0364a)) ? z : z | ((C0364a) childAt2).mo900c();
    }

    /* renamed from: F */
    public boolean mo1435F() {
        C0421c cVar = this.f1122y;
        return cVar != null && cVar.mo1794B();
    }

    /* renamed from: G */
    public boolean mo1436G() {
        C0421c cVar = this.f1122y;
        return cVar != null && cVar.mo1796D();
    }

    /* renamed from: H */
    public boolean mo1437H() {
        C0421c cVar = this.f1122y;
        return cVar != null && cVar.mo1797E();
    }

    /* renamed from: I */
    public boolean mo1438I() {
        return this.f1121x;
    }

    /* renamed from: L */
    public C0330g mo1439L() {
        return this.f1118u;
    }

    /* renamed from: M */
    public void mo1440M(C0346m.C0347a aVar, C0330g.C0331a aVar2) {
        this.f1123z = aVar;
        this.f1112A = aVar2;
    }

    /* renamed from: N */
    public boolean mo1441N() {
        C0421c cVar = this.f1122y;
        return cVar != null && cVar.mo1803K();
    }

    /* renamed from: a */
    public boolean mo921a(C0334i iVar) {
        return this.f1118u.mo1068L(iVar, 0);
    }

    /* renamed from: b */
    public void mo922b(C0330g gVar) {
        this.f1118u = gVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0366c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1118u == null) {
            Context context = getContext();
            C0330g gVar = new C0330g(context);
            this.f1118u = gVar;
            gVar.mo1073R(new C0367d());
            C0421c cVar = new C0421c(context);
            this.f1122y = cVar;
            cVar.mo1802J(true);
            C0421c cVar2 = this.f1122y;
            C0346m.C0347a aVar = this.f1123z;
            if (aVar == null) {
                aVar = new C0365b();
            }
            cVar2.mo1004k(aVar);
            this.f1118u.mo1093c(this.f1122y, this.f1119v);
            this.f1122y.mo1800H(this);
        }
        return this.f1118u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1122y.mo1793A();
    }

    public int getPopupTheme() {
        return this.f1120w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0421c cVar = this.f1122y;
        if (cVar != null) {
            cVar.mo1000f(false);
            if (this.f1122y.mo1797E()) {
                this.f1122y.mo1794B();
                this.f1122y.mo1803K();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1464z();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f1113B) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b = C0471j1.m1938b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0366c cVar = (C0366c) childAt.getLayoutParams();
                if (cVar.f1124a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo1434E(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i5 = getPaddingLeft() + cVar.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    mo1434E(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0366c cVar2 = (C0366c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1124a) {
                    int i17 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0366c cVar3 = (C0366c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1124a) {
                int i20 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0330g gVar;
        boolean z = this.f1113B;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1113B = z2;
        if (z != z2) {
            this.f1114C = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f1113B || (gVar = this.f1118u) == null || size == this.f1114C)) {
            this.f1114C = size;
            gVar.mo1067K(true);
        }
        int childCount = getChildCount();
        if (!this.f1113B || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0366c cVar = (C0366c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m1457K(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1122y.mo1799G(z);
    }

    public void setOnMenuItemClickListener(C0368e eVar) {
        this.f1117F = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1122y.mo1801I(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f1121x = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1120w != i) {
            this.f1120w = i;
            if (i == 0) {
                this.f1119v = getContext();
            } else {
                this.f1119v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0421c cVar) {
        this.f1122y = cVar;
        cVar.mo1800H(this);
    }

    /* renamed from: z */
    public void mo1464z() {
        C0421c cVar = this.f1122y;
        if (cVar != null) {
            cVar.mo1804y();
        }
    }
}
