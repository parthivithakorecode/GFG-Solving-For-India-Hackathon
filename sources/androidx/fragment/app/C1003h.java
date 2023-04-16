package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.C0796i0;
import androidx.core.view.C0833y;
import java.util.ArrayList;
import p158x.C4275c;

/* renamed from: androidx.fragment.app.h */
public final class C1003h extends FrameLayout {

    /* renamed from: f */
    private ArrayList<View> f2692f;

    /* renamed from: g */
    private ArrayList<View> f2693g;

    /* renamed from: h */
    private View.OnApplyWindowInsetsListener f2694h;

    /* renamed from: i */
    private boolean f2695i = true;

    C1003h(Context context, AttributeSet attributeSet, C1011n nVar) {
        super(context, attributeSet);
        String str;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4275c.f22558h);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C4275c.f22559i) : classAttribute;
        String string = obtainStyledAttributes.getString(C4275c.f22560j);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment g0 = nVar.mo3601g0(id);
        if (classAttribute != null && g0 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a = nVar.mo3615p0().mo3528a(context.getClassLoader(), classAttribute);
            a.mo3333v0(context, attributeSet, (Bundle) null);
            nVar.mo3611l().mo3730l(true).mo3726c(this, a, string).mo3359h();
        }
        nVar.mo3579Q0(this);
    }

    /* renamed from: a */
    private void m4138a(View view) {
        ArrayList<View> arrayList = this.f2693g;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f2692f == null) {
                this.f2692f = new ArrayList<>();
            }
            this.f2692f.add(view);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (C1011n.m4224y0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (C1011n.m4224y0(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0796i0 u = C0796i0.m3156u(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2694h;
        C0796i0 u2 = onApplyWindowInsetsListener != null ? C0796i0.m3156u(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : C0833y.m3321F(this, u);
        if (!u2.mo2884n()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0833y.m3349e(getChildAt(i), u2);
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f2695i && this.f2692f != null) {
            for (int i = 0; i < this.f2692f.size(); i++) {
                super.drawChild(canvas, this.f2692f.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f2695i || (arrayList = this.f2692f) == null || arrayList.size() <= 0 || !this.f2692f.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f2693g;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f2692f;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2695i = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m4138a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            m4138a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        m4138a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        m4138a(getChildAt(i));
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        m4138a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m4138a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m4138a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    /* access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z) {
        this.f2695i = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f2694h = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2693g == null) {
                this.f2693g = new ArrayList<>();
            }
            this.f2693g.add(view);
        }
        super.startViewTransition(view);
    }
}
