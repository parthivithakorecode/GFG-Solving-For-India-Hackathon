package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0783e0;
import androidx.core.view.C0789f0;
import androidx.core.view.C0833y;
import p038f.C2582a;
import p038f.C2591j;

/* renamed from: androidx.appcompat.widget.a */
abstract class C0398a extends ViewGroup {

    /* renamed from: f */
    protected final C0399a f1278f;

    /* renamed from: g */
    protected final Context f1279g;

    /* renamed from: h */
    protected ActionMenuView f1280h;

    /* renamed from: i */
    protected C0421c f1281i;

    /* renamed from: j */
    protected int f1282j;

    /* renamed from: k */
    protected C0783e0 f1283k;

    /* renamed from: l */
    private boolean f1284l;

    /* renamed from: m */
    private boolean f1285m;

    /* renamed from: androidx.appcompat.widget.a$a */
    protected class C0399a implements C0789f0 {

        /* renamed from: a */
        private boolean f1286a = false;

        /* renamed from: b */
        int f1287b;

        protected C0399a() {
        }

        /* renamed from: a */
        public void mo1695a(View view) {
            this.f1286a = true;
        }

        /* renamed from: b */
        public void mo723b(View view) {
            if (!this.f1286a) {
                C0398a aVar = C0398a.this;
                aVar.f1283k = null;
                C0398a.super.setVisibility(this.f1287b);
            }
        }

        /* renamed from: c */
        public void mo724c(View view) {
            C0398a.super.setVisibility(0);
            this.f1286a = false;
        }

        /* renamed from: d */
        public C0399a mo1696d(C0783e0 e0Var, int i) {
            C0398a.this.f1283k = e0Var;
            this.f1287b = i;
            return this;
        }
    }

    C0398a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0398a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1278f = new C0399a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C2582a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1279g = context;
        } else {
            this.f1279g = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: d */
    protected static int m1605d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo1692c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo1693e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: f */
    public C0783e0 mo1345f(int i, long j) {
        C0783e0 b;
        C0783e0 e0Var = this.f1283k;
        if (e0Var != null) {
            e0Var.mo2854c();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            b = C0833y.m3346c(this).mo2853b(1.0f);
        } else {
            b = C0833y.m3346c(this).mo2853b(0.0f);
        }
        b.mo2856f(j);
        b.mo2858h(this.f1278f.mo1696d(b, i));
        return b;
    }

    public int getAnimatedVisibility() {
        return this.f1283k != null ? this.f1278f.f1287b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1282j;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C2591j.f18808a, C2582a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C2591j.f18853j, 0));
        obtainStyledAttributes.recycle();
        C0421c cVar = this.f1281i;
        if (cVar != null) {
            cVar.mo1798F(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1285m = false;
        }
        if (!this.f1285m) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1285m = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1285m = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1284l = false;
        }
        if (!this.f1284l) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1284l = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1284l = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1282j = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0783e0 e0Var = this.f1283k;
            if (e0Var != null) {
                e0Var.mo2854c();
            }
            super.setVisibility(i);
        }
    }
}
