package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C0833y;
import p038f.C2587f;
import p038f.C2591j;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: f */
    private boolean f1053f;

    /* renamed from: g */
    private View f1054g;

    /* renamed from: h */
    private View f1055h;

    /* renamed from: i */
    private View f1056i;

    /* renamed from: j */
    Drawable f1057j;

    /* renamed from: k */
    Drawable f1058k;

    /* renamed from: l */
    Drawable f1059l;

    /* renamed from: m */
    boolean f1060m;

    /* renamed from: n */
    boolean f1061n;

    /* renamed from: o */
    private int f1062o;

    /* renamed from: androidx.appcompat.widget.ActionBarContainer$a */
    private static class C0357a {
        /* renamed from: a */
        public static void m1415a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0833y.m3333R(this, new C0416b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2591j.f18808a);
        this.f1057j = obtainStyledAttributes.getDrawable(C2591j.f18813b);
        this.f1058k = obtainStyledAttributes.getDrawable(C2591j.f18823d);
        this.f1062o = obtainStyledAttributes.getDimensionPixelSize(C2591j.f18853j, -1);
        boolean z = true;
        if (getId() == C2587f.split_action_bar) {
            this.f1060m = true;
            this.f1059l = obtainStyledAttributes.getDrawable(C2591j.f18818c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1060m ? !(this.f1057j == null && this.f1058k == null) : this.f1059l != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m1413a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m1414b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1057j;
        if (drawable != null && drawable.isStateful()) {
            this.f1057j.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1058k;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1058k.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1059l;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1059l.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1054g;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1057j;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1058k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1059l;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1055h = findViewById(C2587f.action_bar);
        this.f1056i = findViewById(C2587f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1053f || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f1054g
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.f1060m
            if (r6 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r5 = r4.f1059l
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00b6
        L_0x0048:
            r9 = r0
            goto L_0x00b6
        L_0x004a:
            android.graphics.drawable.Drawable r6 = r4.f1057j
            if (r6 == 0) goto L_0x009b
            android.view.View r6 = r4.f1055h
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0074
            android.graphics.drawable.Drawable r6 = r4.f1057j
            android.view.View r7 = r4.f1055h
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f1055h
            int r8 = r8.getTop()
            android.view.View r0 = r4.f1055h
            int r0 = r0.getRight()
            android.view.View r2 = r4.f1055h
        L_0x006c:
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x009a
        L_0x0074:
            android.view.View r6 = r4.f1056i
            if (r6 == 0) goto L_0x0095
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0095
            android.graphics.drawable.Drawable r6 = r4.f1057j
            android.view.View r7 = r4.f1056i
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f1056i
            int r8 = r8.getTop()
            android.view.View r0 = r4.f1056i
            int r0 = r0.getRight()
            android.view.View r2 = r4.f1056i
            goto L_0x006c
        L_0x0095:
            android.graphics.drawable.Drawable r6 = r4.f1057j
            r6.setBounds(r0, r0, r0, r0)
        L_0x009a:
            r0 = r9
        L_0x009b:
            r4.f1061n = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.f1058k
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00b6:
            if (r9 == 0) goto L_0x00bb
            r4.invalidate()
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1055h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f1062o
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f1055h
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f1054g
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f1055h
            boolean r0 = r3.m1414b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f1055h
        L_0x0042:
            int r0 = r3.m1413a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f1056i
            boolean r0 = r3.m1414b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f1056i
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f1054g
            int r1 = r3.m1413a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1057j;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1057j);
        }
        this.f1057j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1055h;
            if (view != null) {
                this.f1057j.setBounds(view.getLeft(), this.f1055h.getTop(), this.f1055h.getRight(), this.f1055h.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1060m ? !(this.f1057j == null && this.f1058k == null) : this.f1059l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            C0357a.m1415a(this);
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1059l;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1059l);
        }
        this.f1059l = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1060m && (drawable2 = this.f1059l) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1060m ? this.f1057j == null && this.f1058k == null : this.f1059l == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            C0357a.m1415a(this);
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1058k;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1058k);
        }
        this.f1058k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1061n && (drawable2 = this.f1058k) != null) {
                drawable2.setBounds(this.f1054g.getLeft(), this.f1054g.getTop(), this.f1054g.getRight(), this.f1054g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1060m ? !(this.f1057j == null && this.f1058k == null) : this.f1059l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            C0357a.m1415a(this);
        }
    }

    public void setTabContainer(C0517t0 t0Var) {
        View view = this.f1054g;
        if (view != null) {
            removeView(view);
        }
        this.f1054g = t0Var;
        if (t0Var != null) {
            addView(t0Var);
            ViewGroup.LayoutParams layoutParams = t0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            t0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f1053f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1057j;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1058k;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1059l;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1057j && !this.f1060m) || (drawable == this.f1058k && this.f1061n) || ((drawable == this.f1059l && this.f1060m) || super.verifyDrawable(drawable));
    }
}
