package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.C0299b;
import androidx.core.view.C0783e0;
import androidx.core.view.C0833y;
import p038f.C2582a;
import p038f.C2587f;
import p038f.C2588g;
import p038f.C2591j;

public class ActionBarContextView extends C0398a {

    /* renamed from: n */
    private CharSequence f1063n;

    /* renamed from: o */
    private CharSequence f1064o;

    /* renamed from: p */
    private View f1065p;

    /* renamed from: q */
    private View f1066q;

    /* renamed from: r */
    private View f1067r;

    /* renamed from: s */
    private LinearLayout f1068s;

    /* renamed from: t */
    private TextView f1069t;

    /* renamed from: u */
    private TextView f1070u;

    /* renamed from: v */
    private int f1071v;

    /* renamed from: w */
    private int f1072w;

    /* renamed from: x */
    private boolean f1073x;

    /* renamed from: y */
    private int f1074y;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class C0358a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C0299b f1075f;

        C0358a(C0299b bVar) {
            this.f1075f = bVar;
        }

        public void onClick(View view) {
            this.f1075f.mo811c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2582a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0415a1 u = C0415a1.m1660u(context, attributeSet, C2591j.f18928y, i, 0);
        C0833y.m3333R(this, u.mo1771f(C2591j.f18933z));
        this.f1071v = u.mo1778m(C2591j.f18713D, 0);
        this.f1072w = u.mo1778m(C2591j.f18708C, 0);
        this.f1282j = u.mo1777l(C2591j.f18703B, 0);
        this.f1074y = u.mo1778m(C2591j.f18698A, C2588g.abc_action_mode_close_item_material);
        u.mo1784v();
    }

    /* renamed from: i */
    private void m1416i() {
        if (this.f1068s == null) {
            LayoutInflater.from(getContext()).inflate(C2588g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1068s = linearLayout;
            this.f1069t = (TextView) linearLayout.findViewById(C2587f.action_bar_title);
            this.f1070u = (TextView) this.f1068s.findViewById(C2587f.action_bar_subtitle);
            if (this.f1071v != 0) {
                this.f1069t.setTextAppearance(getContext(), this.f1071v);
            }
            if (this.f1072w != 0) {
                this.f1070u.setTextAppearance(getContext(), this.f1072w);
            }
        }
        this.f1069t.setText(this.f1063n);
        this.f1070u.setText(this.f1064o);
        boolean z = !TextUtils.isEmpty(this.f1063n);
        boolean z2 = !TextUtils.isEmpty(this.f1064o);
        int i = 0;
        this.f1070u.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1068s;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f1068s.getParent() == null) {
            addView(this.f1068s);
        }
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ C0783e0 mo1345f(int i, long j) {
        return super.mo1345f(i, j);
    }

    /* renamed from: g */
    public void mo1346g() {
        if (this.f1065p == null) {
            mo1355k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1064o;
    }

    public CharSequence getTitle() {
        return this.f1063n;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1353h(androidx.appcompat.view.C0299b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1065p
            if (r0 != 0) goto L_0x0019
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f1074y
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f1065p = r0
        L_0x0015:
            r3.addView(r0)
            goto L_0x0022
        L_0x0019:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0022
            android.view.View r0 = r3.f1065p
            goto L_0x0015
        L_0x0022:
            android.view.View r0 = r3.f1065p
            int r1 = p038f.C2587f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            r3.f1066q = r0
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo813e()
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.C0330g) r4
            androidx.appcompat.widget.c r0 = r3.f1281i
            if (r0 == 0) goto L_0x0041
            r0.mo1804y()
        L_0x0041:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f1281i = r0
            r1 = 1
            r0.mo1802J(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f1281i
            android.content.Context r2 = r3.f1279g
            r4.mo1093c(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f1281i
            androidx.appcompat.view.menu.n r4 = r4.mo1008o(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f1280h = r4
            r1 = 0
            androidx.core.view.C0833y.m3333R(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f1280h
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.mo1353h(androidx.appcompat.view.b):void");
    }

    /* renamed from: j */
    public boolean mo1354j() {
        return this.f1073x;
    }

    /* renamed from: k */
    public void mo1355k() {
        removeAllViews();
        this.f1067r = null;
        this.f1280h = null;
        this.f1281i = null;
        View view = this.f1066q;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: l */
    public boolean mo1356l() {
        C0421c cVar = this.f1281i;
        if (cVar != null) {
            return cVar.mo1803K();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0421c cVar = this.f1281i;
        if (cVar != null) {
            cVar.mo1794B();
            this.f1281i.mo1795C();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean b = C0471j1.m1938b(this);
        int paddingRight = b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1065p;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1065p.getLayoutParams();
            int i5 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d = C0398a.m1605d(paddingRight, i5, b);
            paddingRight = C0398a.m1605d(d + mo1693e(this.f1065p, d, paddingTop, paddingTop2, b), i6, b);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f1068s;
        if (!(linearLayout == null || this.f1067r != null || linearLayout.getVisibility() == 8)) {
            i7 += mo1693e(this.f1068s, i7, paddingTop, paddingTop2, b);
        }
        int i8 = i7;
        View view2 = this.f1067r;
        if (view2 != null) {
            mo1693e(view2, i8, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1280h;
        if (actionMenuView != null) {
            mo1693e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f1282j;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f1065p;
            if (view != null) {
                int c = mo1692c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1065p.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1280h;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo1692c(this.f1280h, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1068s;
            if (linearLayout != null && this.f1067r == null) {
                if (this.f1073x) {
                    this.f1068s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1068s.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1068s.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo1692c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1067r;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f1067r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f1282j <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.f1282j = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1067r;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1067r = view;
        if (!(view == null || (linearLayout = this.f1068s) == null)) {
            removeView(linearLayout);
            this.f1068s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1064o = charSequence;
        m1416i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1063n = charSequence;
        m1416i();
        C0833y.m3332Q(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1073x) {
            requestLayout();
        }
        this.f1073x = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
